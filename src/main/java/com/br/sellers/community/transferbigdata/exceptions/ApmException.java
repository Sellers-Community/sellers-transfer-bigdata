package com.br.sellers.community.transferbigdata.exceptions;

import co.elastic.apm.api.ElasticApm;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class ApmException extends RuntimeException {

    protected String errorCode;

    public ApmException(String msg, String errorCode) {
        this(msg, errorCode, null);
    }

    public ApmException(String msg, String errorCode, Exception ex) {
        super(msg);
        this.errorCode = errorCode;

        ElasticApm.currentTransaction()
                .addLabel("errorCode", errorCode)
                .addLabel("errorMessage", msg)
                .addLabel("errorExceptionMessage", ex == null ? "" : ex.getMessage())
                .addLabel("errorExceptionStack", ex == null ? "" : ExceptionUtils.getStackTrace(ex))
                .captureException(this);
    }

    public String getErrorCode() {
        return errorCode;
    }
}
