package com.gokhantamkoc.ilkspringbootuygulamamodevi.util;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.gokhantamkoc.ilkspringbootuygulamamodevi.exceptions.ShapeNotFoundException;

@ControllerAdvice
public class ExceptionHandling extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ShapeNotFoundException.class)
    public ResponseEntity<Object> handleExceptions(ShapeNotFoundException exception, WebRequest webRequest) {
        ExceptionResponse response = new ExceptionResponse();
        response.setDateTime(LocalDateTime.now());
        response.setMessage(exception.getMessage());
        ResponseEntity<Object> entity = new ResponseEntity<Object>(response, HttpStatus.NOT_FOUND);
        return entity;
    }
}
