package com.javaweb.controllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleNullPointerException(Exception e) {
        // Logic xử lý khi gặp NullPointerException
        return "error/nullpointer";
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleIllegalArgumentException(Exception e) {
        // Logic xử lý khi gặp IllegalArgumentException
        return "error/illegalargument";
    }

    // Có thể thêm nhiều phương thức xử lý exception khác
}
