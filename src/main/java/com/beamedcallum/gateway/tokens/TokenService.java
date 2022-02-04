package com.beamedcallum.gateway.tokens;

public abstract class TokenService<K extends Token, T extends TokenServiceAuth> {

    /**
     * Allow a token to be used.
     * @param authInstance
     */
    protected void authoriseToken(T authInstance){
        authInstance.authoriseToken();
    }

    protected void invalidateToken(T authInstance){
        authInstance.invalidateToken();
    }
}
