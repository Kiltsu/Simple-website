/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kilzeus.frame.server.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.TIMESTAMP;

/**
 * Page is top level in the content-hierarchy. Pages can have sub-pages. They 
 * can be present in navigation menus. Pages contain content like text and images.
 * @author Kilzeus
 */
@Entity
public class Page {
    
    @Id @GeneratedValue
    private int id;
    private String name;
    private String header;
    private String description;
    @OneToMany
    @JoinTable
    private List<TextContent> contents;
    @OneToMany
    @JoinTable
    private List<Image> images;
    @Temporal(TIMESTAMP)
    private Date published;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<TextContent> getContents() {
        return contents;
    }

    public void setContents(List<TextContent> contents) {
        this.contents = contents;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
    
}
