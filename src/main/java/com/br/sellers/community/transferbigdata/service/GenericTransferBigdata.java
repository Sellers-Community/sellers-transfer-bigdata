package com.br.sellers.community.transferbigdata.service;

public class GenericTransferBigdata {
    private static final String TRANSFER = "TRANSFER_BIGDATA_";

    protected String getKey(String key) {
        return TRANSFER.concat(key);
    }

}
