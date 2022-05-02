package com.br.sellers.community.transferbigdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class GetTransferBigdataWithoutDeleteService extends GenericTransferBigdata {

    @Autowired
    private RedisTemplate<String, Object> template;

    public String execute(String key) {
        String newKey = getKey(key);
        String value = (String) template.opsForValue().get(newKey);
        return value;
    }

}
