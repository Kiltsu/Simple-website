/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kilzeus.frame.server.controller;

import org.kilzeus.frame.server.entities.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;
import org.kilzeus.frame.server.repository.PageRepository;

/**
 *
 * @author Kilzeus
 */
@RestController
public class ContentController {
    
    @Autowired
    private PageRepository pageRepo;
    
    @RequestMapping(method=GET, path="cms/page")
    @CrossOrigin
    public Page getPage(Integer id) {
        /*List<Page> news = newsRepo.findAll();
        PageResponse response = new PageResponse(news);*/
        Page page = pageRepo.findById(id);
        return page;
    }
    
    @RequestMapping(method=GET, path="cms/front_page")
    @CrossOrigin
    public Page getMainPage() {
        /*List<Page> news = newsRepo.findAll();
        PageResponse response = new PageResponse(news);*/
        /*Page page = pageRepo.findById(id);
        return page;*/
        return null;
    }
    
   /* @RequestMapping(method=POST, path="cms/page")
    @CrossOrigin
    public SimpleResponse postNews(PageResponse news) {
        SimpleResponse response = new SimpleResponse();
        try {
            for(Page item : news.getItems()) {
                pageRepo.save(item);
            }
        } catch(Exception ex) {
            response.setSuccess(false);
        }
        return response;
    }*/
}
