package com.hicode.springutilities.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * NotFound Exception Class
 * @author hicode
 * */
@ResponseStatus(value= HttpStatus.BAD_REQUEST,reason = "Request failed because the resource does not exist or the resource doesn't belong to the user")
public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}
