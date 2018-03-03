package com.pavikumbhar.javaheart.security;

import java.util.Optional;

import com.pavikumbhar.javaheart.entity.User;

/**
 * 
 * @author pavikumbhar
 *
 */
public interface UserService {
    public Optional<User> getByUsername(String username);
}
