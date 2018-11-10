package com.floreantpos.model.base;

import java.lang.Comparable;
import java.io.Serializable;

/**
 * This is an object that contains data related to the MENU_ITEM_SIZE table. Do
 * not modify this class because it will be overwritten if the configuration
 * file related to this class is modified.
 *
 * @hibernate.class table="MENU_ITEM_SIZE"
 */
public abstract class BaseFlorantLicenceKey implements Comparable, Serializable {

     

    // constructors
    public BaseFlorantLicenceKey() {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseFlorantLicenceKey(java.lang.Integer id) {
        this.setId(id);
        initialize();
    }

    protected void initialize() {
    }

    private int hashCode = Integer.MIN_VALUE;

    // primary key
    private java.lang.Integer id;

    // fields
    protected java.lang.String keyvalue;  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyvalue() {
        return keyvalue;
    }

    public void setKeyvalue(String keyvalue) {
        this.keyvalue = keyvalue;
    }
    
 

    public int compareTo(Object obj) {
        if (obj.hashCode() > hashCode()) {
            return 1;
        } else if (obj.hashCode() < hashCode()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return super.toString();
    }

}
