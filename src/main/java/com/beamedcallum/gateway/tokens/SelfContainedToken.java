package com.beamedcallum.gateway.tokens;

public abstract class SelfContainedToken<T> implements Token {
    public boolean isExpired(){
        return checkExpired();
    }

    public abstract String toString();

    public abstract String getClaim(String data);

    /**
     * Check the the current token has expired.
     * @return true if the token is expired otherwise, returns false.
     */
    protected abstract boolean checkExpired();
}