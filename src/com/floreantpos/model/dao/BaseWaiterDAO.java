/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.floreantpos.model.dao;

/**
 *
 * @author bairuha technologies
 */
public class BaseWaiterDAO extends com.floreantpos.model.dao._RootDAO {

    public static BaseWaiterDAO instance;

    @Override
    protected Class getReferenceClass() {
        return com.floreantpos.model.base.BaseWaiter.class;
    }

    public static BaseWaiterDAO getInstance() {
        if (null == instance) {
            instance = new BaseWaiterDAO();
        }
        return instance;
    }

    /**
     * Return all objects related to the implementation of this DAO with no
     * filter.
     */
    public java.util.List<com.floreantpos.model.base.BaseWaiter> findAll() {
        return super.findAll();
    }

}
