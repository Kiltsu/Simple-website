/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kilzeus.frame.server.repository;

import java.util.List;
import org.kilzeus.frame.server.entities.Company;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Kilzeus
 */
public interface CompanyRepository extends CrudRepository<Company,Integer> {
    
    @Override
    public List<Company> findAll();
}
