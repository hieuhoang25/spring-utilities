package com.hicode.springutilities.constant;

import com.hicode.springutilities.mapper.ModelConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractRes {
    @Autowired
    protected ModelConverter modelConverter;
}
