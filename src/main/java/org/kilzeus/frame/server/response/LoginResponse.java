/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kilzeus.frame.server.response;

import org.kilzeus.frame.core.entities.User;

/**
 *
 * @author Kilzeus
 */
public class LoginResponse {
    
    private User user;
    private String token;

    public LoginResponse(User user, String token) {
        this.user = user;
        this.token = token;
    }
    
    public String getToken() {
        return token;
    }

    public User getUser() {
        return user;
    }
}
