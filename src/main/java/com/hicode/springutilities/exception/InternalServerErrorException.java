package com.hicode.springutilities.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * Internal Server Error Exception
 * @author hicode
 * */
@ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR,reason = "Request failed on server side, user should check status site or report the issue")
public class InternalServerErrorException extends RuntimeException{
    public InternalServerErrorException(String message) {
        super(message);
    }
}
