package com.pavikumbhar.javaheart.security.exceptions;

import org.springframework.security.authentication.AuthenticationServiceException;

/**
 * 
* @author pavi kumbhar
 *
 * 
 */
public class AuthMethodNotSupportedException extends AuthenticationServiceException {
    private static final long serialVersionUID = 3705043083010304496L;

    public AuthMethodNotSupportedException(String msg) {
        super(msg);
    }
}
