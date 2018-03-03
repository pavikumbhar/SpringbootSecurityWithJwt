package com.pavikumbhar.javaheart.entity;

/**
 * Enumerated {@link User} roles.
 * 
 * @author pavi kumbhar
 *
 * 
 */
public enum Role {
    ADMIN, PREMIUM_MEMBER, MEMBER;
    
    public String authority() {
        return "ROLE_" + this.name();
    }
}
