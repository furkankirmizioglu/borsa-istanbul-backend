package com.borsaistanbul.stockvaluation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class StockValuationApiException extends RuntimeException {
    public StockValuationApiException(String message) {
        super(message);
    }
}