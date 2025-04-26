package com.borsaistanbul.stockvaluation.exception;

import com.borsaistanbul.stockvaluation.utils.ResponseCodes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class StockValuationApiExceptionTest {

    private StockValuationApiException exception;

    @BeforeEach
    void init() {
        exception = new StockValuationApiException(ResponseCodes.OK_MESSAGE);
    }

    @Test
    void test() {
        assertEquals(ResponseCodes.OK_MESSAGE, exception.getMessage());
    }
}