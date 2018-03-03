package com.pavikumbhar.javaheart.security.auth.jwt.verifier;

/**
 * 
 * @author pavi kumbhar
 *
 * 
 */
public interface TokenVerifier {
    public boolean verify(String jti);
}
