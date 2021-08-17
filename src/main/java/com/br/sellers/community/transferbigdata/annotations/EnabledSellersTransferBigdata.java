package com.br.sellers.community.transferbigdata.annotations;

import com.br.sellers.community.transferbigdata.config.RedisCacheConfig;
import com.br.sellers.community.transferbigdata.service.CreateTransferBigdataService;
import com.br.sellers.community.transferbigdata.service.GetTransferBigdataService;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@AutoConfigurationPackage
@Import({RedisCacheConfig.class, CreateTransferBigdataService.class, GetTransferBigdataService.class})
public @interface EnabledSellersTransferBigdata {
}
