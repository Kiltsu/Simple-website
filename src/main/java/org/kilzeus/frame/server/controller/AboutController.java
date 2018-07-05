/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kilzeus.frame.server.controller;

import java.util.List;
import org.kilzeus.frame.server.entities.Company;
import org.kilzeus.frame.server.repository.CompanyRepository;
import org.kilzeus.frame.server.response.AboutResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Kilzeus
 */
@RestController
public class AboutController {
    
    @Autowired
    private CompanyRepository companyRepo;
    
    @RequestMapping(method=GET, path="public/about")
    @CrossOrigin
    public AboutResponse about() {
        List<Company> companies = companyRepo.findAll();
        Company company = null;
        if(!companies.isEmpty()) {
            company = companies.get(0);
        }
        AboutResponse response = new AboutResponse(company);
        return response;
    }
}
