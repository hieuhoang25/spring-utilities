package com.hicode.springutilities.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Forbidden Exception Class
 * @author hicode
 * */
@ResponseStatus(value= HttpStatus.FORBIDDEN,reason = "Server understood the request, but refuses to fulfill it (might be due to the status of the resource, see the error message for specifics")
public class ForbiddenException extends  RuntimeException{
    public ForbiddenException(String message) {
        super(message);
    }
}
