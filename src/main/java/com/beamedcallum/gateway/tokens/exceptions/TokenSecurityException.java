package com.beamedcallum.gateway.tokens.exceptions;

public class TokenSecurityException extends TokenException{
    public TokenSecurityException() {
    }

    public TokenSecurityException(String message) {
        super(message);
    }

    public TokenSecurityException(String message, Throwable cause) {
        super(message, cause);
    }

    public TokenSecurityException(Throwable cause) {
        super(cause);
    }

    public TokenSecurityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
