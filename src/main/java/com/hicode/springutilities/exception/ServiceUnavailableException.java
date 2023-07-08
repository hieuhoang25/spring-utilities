package com.hicode.springutilities.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * Service Unavailable Exception
 * @author hicode
 * */
@ResponseStatus(value= HttpStatus.SERVICE_UNAVAILABLE,reason = "API is unavailable, check status site for details")
public class ServiceUnavailableException extends RuntimeException{
    public ServiceUnavailableException(String message) {
        super(message);
    }
}

