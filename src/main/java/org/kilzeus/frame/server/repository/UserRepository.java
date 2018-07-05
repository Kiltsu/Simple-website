/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kilzeus.frame.server.repository;

import java.util.List;
import org.kilzeus.frame.core.entities.Company;
import org.kilzeus.frame.core.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Kilzeus
 */
public interface UserRepository extends CrudRepository<User,Integer> {
    
    @Override
    public List<User> findAll();
    public User findByUsername(String username);
}
