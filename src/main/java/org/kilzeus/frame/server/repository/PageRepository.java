/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kilzeus.frame.server.repository;

import java.util.List;
import org.kilzeus.frame.core.entities.Page;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Kilzeus
 */
public interface PageRepository extends CrudRepository<Page,Integer> {
    
    @Override
    public List<Page> findAll();
    public Page findById(int id);
}
