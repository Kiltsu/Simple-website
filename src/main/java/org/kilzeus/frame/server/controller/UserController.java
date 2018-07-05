/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kilzeus.frame.server.controller;

import java.util.Date;
import java.util.Objects;
import org.kilzeus.frame.server.entities.User;
import org.kilzeus.frame.server.entities.UserSession;
import org.kilzeus.frame.server.repository.UserSessionRepository;
import org.kilzeus.frame.server.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.kilzeus.service.AuthenticateService;

/**
 *
 * @author Kilzeus
 */
public class UserController {
    
    @Autowired
    private AuthenticateService userRepo;
    @Autowired
    private UserSessionRepository sessionRepo;
    
    @RequestMapping(method=POST, path="public/login")
    @CrossOrigin
    public LoginResponse doLogin(String username, String password) {
        User user = userRepo.authenticate(username, password);
        LoginResponse response = new LoginResponse(user, username);
        if(Objects.equals(user.getPassword(), password)) {
            UserSession session = new UserSession();
            session.setUser(user);
            session.setStarted(new Date());
            sessionRepo.save(session);
        }
        return response;
    }
}
