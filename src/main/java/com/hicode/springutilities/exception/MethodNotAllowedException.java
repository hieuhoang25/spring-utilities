package com.hicode.springutilities.exception;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Collection;
/**
 * Method Not Allowed Exception Class
 * @author hicode
 * */
@ResponseStatus(value = HttpStatus.METHOD_NOT_ALLOWED, reason = "Request failed because the requested method is not allowed")
public class MethodNotAllowedException extends org.springframework.web.server.MethodNotAllowedException {
    public MethodNotAllowedException(HttpMethod method, Collection<HttpMethod> supportedMethods) {
        super(method, supportedMethods);
    }

    public MethodNotAllowedException(String method, Collection<HttpMethod> supportedMethods) {
        super(method, supportedMethods);
    }
    private String message;

}
