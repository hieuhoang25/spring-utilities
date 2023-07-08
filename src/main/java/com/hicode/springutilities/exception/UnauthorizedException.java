package com.hicode.springutilities.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Unauthorized Exception Class
 * @author hicode
 * */
@ResponseStatus(value= HttpStatus.UNAUTHORIZED,reason = "Request failed because user is not authenticated")
public class UnauthorizedException extends RuntimeException{
    public UnauthorizedException(String message) {
        super(message);
    }
}
