/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.floreantpos.model.base;

import java.io.Serializable;

/**
 *
 * @author bairuha technologies
 */
public class BaseWaiter implements  Serializable{
     private java.lang.Integer id; 

    // fields
    protected java.lang.String waiterName;
    protected java.lang.String waiterMobile;
    protected java.lang.String waiterAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWaiterName() {
        return waiterName;
    }

    public void setWaiterName(String waiterName) {
        this.waiterName = waiterName;
    }

    public String getWaiterMobile() {
        return waiterMobile;
    }

    public void setWaiterMobile(String waiterMobile) {
        this.waiterMobile = waiterMobile;
    }

    public String getWaiterAddress() {
        return waiterAddress;
    }

    public void setWaiterAddress(String waiterAddress) {
        this.waiterAddress = waiterAddress;
    }
    
    
    
}
