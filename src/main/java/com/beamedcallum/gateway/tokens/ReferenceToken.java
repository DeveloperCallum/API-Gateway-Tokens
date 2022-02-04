package com.beamedcallum.gateway.tokens;

public abstract class ReferenceToken<T, V> implements Token {
    public boolean isExpired(){
        return checkExpired();
    }

    public abstract V getReference();

    public abstract String toString();

    /**
     * Check the the current token has expired.
     * @return true if the token is expired otherwise, returns false.
     */
    protected abstract boolean checkExpired();
}
