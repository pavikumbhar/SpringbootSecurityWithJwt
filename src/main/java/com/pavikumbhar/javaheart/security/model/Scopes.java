package com.pavikumbhar.javaheart.security.model;

/**
 * Scopes
 * 
 * @author pavi kumbhar
 *
 * 
 */
public enum Scopes {
    REFRESH_TOKEN;
    
    public String authority() {
        return "ROLE_" + this.name();
    }
}
