package com.hicode.springutilities.constant;

import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Transactional(readOnly = true)
public @interface CoreReadOnlyTx {
}
