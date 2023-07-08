package com.hicode.springutilities.exception;


import com.hicode.springutilities.response.APIResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<?> notFoundException(NotFoundException e){
        return APIResponse.fail(404, e.getMessage());
    }
    @ExceptionHandler(BadRequestException.class)
    protected ResponseEntity<?> badRequestException(BadRequestException e){
        return APIResponse.fail(401, e.getMessage());
    }
    @ExceptionHandler(ForbiddenException.class)
    protected ResponseEntity<?> forbiddenException(ForbiddenException e){
        return APIResponse.fail(403, e.getMessage());
    }
    @ExceptionHandler(InternalServerErrorException.class)
    protected ResponseEntity<?> internalServerErrorException(InternalServerErrorException e){
        return APIResponse.fail(500, e.getMessage());
    }
    @ExceptionHandler(ServiceUnavailableException.class)
    protected ResponseEntity<?> serviceUnavailableException(ServiceUnavailableException e){
        return APIResponse.fail(503, e.getMessage());
    }
}
