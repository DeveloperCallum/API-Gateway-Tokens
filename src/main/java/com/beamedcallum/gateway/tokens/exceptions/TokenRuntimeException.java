package com.beamedcallum.gateway.tokens.exceptions;

public class TokenRuntimeException extends RuntimeException{
    public TokenRuntimeException() {
    }

    public TokenRuntimeException(String message) {
        super(message);
    }

    public TokenRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TokenRuntimeException(Throwable cause) {
        super(cause);
    }

    public TokenRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
