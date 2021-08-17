package com.br.sellers.community.transferbigdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class CreateTransferBigdataService extends GenericTransferBigdata {

    @Autowired
    private RedisTemplate<String, Object> template;

    public String execute(String key, String toBeCached) {
        String newKey = getKey(key);

        template.opsForValue().set(newKey, toBeCached);

        return newKey;
    }

}
