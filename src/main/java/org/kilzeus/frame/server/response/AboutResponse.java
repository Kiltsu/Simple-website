/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kilzeus.frame.server.response;

import org.kilzeus.frame.server.entities.Company;

/**
 *
 * @author Kilzeus
 */
public class AboutResponse {
    
    private String companyName;
    private String copyrightHolder;
    private int copyrightYear;
    private String phone;
    private String address;

    public AboutResponse(Company company) {
        if(company != null) {
            companyName = company.getName();
            copyrightHolder = company.getCopyrightHolder();
            copyrightYear = company.getCopyrightYear();
            phone = company.getPhone();
            address = company.getAddress();
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCopyrightHolder() {
        return copyrightHolder;
    }

    public void setCopyrightHolder(String copyrightHolder) {
        this.copyrightHolder = copyrightHolder;
    }

    public int getCopyrightYear() {
        return copyrightYear;
    }

    public void setCopyrightYear(int copyrightYear) {
        this.copyrightYear = copyrightYear;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
