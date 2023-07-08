package com.hicode.springutilities.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * Bad Request Exception Class
 * @author hicode
 * */
@ResponseStatus(value= HttpStatus.NOT_FOUND,reason = " Request failed because client submitted invalid data and needs to check his data before submitting again")
public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
