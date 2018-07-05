/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kilzeus.service;

import org.kilzeus.frame.core.entities.User;
import org.kilzeus.frame.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Kilzeus
 */
@Component
public class AuthenticateService {
    
    @Autowired
    private UserRepository userRepo;
    
    public User authenticate(String username, String password) {
        User user = userRepo.findByUsername(username);
        return user;
    }
}
