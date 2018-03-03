package com.pavikumbhar.javaheart.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavikumbhar.javaheart.entity.User;
import com.pavikumbhar.javaheart.security.UserService;
import com.pavikumbhar.javaheart.user.repository.UserRepository;

/**
 * Mock implementation.
 * 
 * @author pavi kumbhar
 *
 * 
 */
@Service
public class DatabaseUserService implements UserService {
    private final UserRepository userRepository;
    
    @Autowired
    public DatabaseUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public UserRepository getUserRepository() {
        return userRepository;
    }

    @Override
    public Optional<User> getByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }
}
