package com.pavikumbhar.javaheart.security.auth.jwt.extractor;

/**
 * Implementations of this interface should always return raw base-64 encoded
 * representation of JWT Token.
 * 
 * @author pavi kumbhar
 *
 * 
 */
public interface TokenExtractor {
    public String extract(String payload);
}
