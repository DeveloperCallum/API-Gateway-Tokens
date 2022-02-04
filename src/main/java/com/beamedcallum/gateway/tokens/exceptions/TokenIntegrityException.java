package com.beamedcallum.gateway.tokens.exceptions;

public class TokenIntegrityException extends TokenSecurityException {
    public TokenIntegrityException() {
    }

    public TokenIntegrityException(String message) {
        super(message);
    }

    public TokenIntegrityException(String message, Throwable cause) {
        super(message, cause);
    }

    public TokenIntegrityException(Throwable cause) {
        super(cause);
    }

    public TokenIntegrityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
