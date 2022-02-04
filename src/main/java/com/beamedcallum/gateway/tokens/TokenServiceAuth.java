package com.beamedcallum.gateway.tokens;

public interface TokenServiceAuth {
    void authoriseToken();
    void invalidateToken();
}
