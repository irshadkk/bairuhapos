package com.floreantpos.model.dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import com.floreantpos.model.dao.MenuItemSizeDAO;
import org.hibernate.criterion.Order;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseFlorantLicenceKeyDAO extends com.floreantpos.model.dao._RootDAO {

	// query name references


	public static FlorantLicenceKeyDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static FlorantLicenceKeyDAO getInstance () {
		if (null == instance) instance = new FlorantLicenceKeyDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.floreantpos.model.FlorantLicenceKey.class;
	}

    public Order getDefaultOrder () {
		return Order.asc("ID");
    }

	/**
	 * Cast the object as a com.floreantpos.model.MenuItemSize
	 */
	public com.floreantpos.model.FlorantLicenceKey cast (Object object) {
		return (com.floreantpos.model.FlorantLicenceKey) object;
	}

	public com.floreantpos.model.FlorantLicenceKey get(java.lang.Integer key)
		throws org.hibernate.HibernateException {
		return (com.floreantpos.model.FlorantLicenceKey) get(getReferenceClass(), key);
	}

	public com.floreantpos.model.FlorantLicenceKey get(java.lang.Integer key, Session s)
		throws org.hibernate.HibernateException {
		return (com.floreantpos.model.FlorantLicenceKey) get(getReferenceClass(), key, s);
	}

	public com.floreantpos.model.FlorantLicenceKey load(java.lang.Integer key)
		throws org.hibernate.HibernateException {
		return (com.floreantpos.model.FlorantLicenceKey) load(getReferenceClass(), key);
	}

	public com.floreantpos.model.FlorantLicenceKey load(java.lang.Integer key, Session s)
		throws org.hibernate.HibernateException {
		return (com.floreantpos.model.FlorantLicenceKey) load(getReferenceClass(), key, s);
	}

	public com.floreantpos.model.FlorantLicenceKey loadInitialize(java.lang.Integer key, Session s) 
			throws org.hibernate.HibernateException { 
		com.floreantpos.model.FlorantLicenceKey obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.floreantpos.model.FlorantLicenceKey> findAll () {
		return super.findAll();
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.floreantpos.model.FlorantLicenceKey> findAll (Order defaultOrder) {
		return super.findAll(defaultOrder);
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 * Use the session given.
	 * @param s the Session
	 */
	public java.util.List<com.floreantpos.model.FlorantLicenceKey> findAll (Session s, Order defaultOrder) {
		return super.findAll(s, defaultOrder);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param menuItemSize a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Integer save(com.floreantpos.model.FlorantLicenceKey florantLicenceKey)
		throws org.hibernate.HibernateException {
		return (java.lang.Integer) super.save(florantLicenceKey);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param menuItemSize a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.Integer save(com.floreantpos.model.FlorantLicenceKey florantLicenceKey, Session s)
		throws org.hibernate.HibernateException {
		return (java.lang.Integer) save((Object) florantLicenceKey, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param menuItemSize a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.floreantpos.model.FlorantLicenceKey florantLicenceKey)
		throws org.hibernate.HibernateException {
		saveOrUpdate((Object) florantLicenceKey);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param menuItemSize a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.floreantpos.model.FlorantLicenceKey florantLicenceKey, Session s)
		throws org.hibernate.HibernateException {
		saveOrUpdate((Object) florantLicenceKey, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param menuItemSize a transient instance containing updated state
	 */
	public void update(com.floreantpos.model.FlorantLicenceKey florantLicenceKey) 
		throws org.hibernate.HibernateException {
		update((Object) florantLicenceKey);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param menuItemSize a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.floreantpos.model.FlorantLicenceKey florantLicenceKey, Session s)
		throws org.hibernate.HibernateException {
		update((Object) florantLicenceKey, s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.Integer id)
		throws org.hibernate.HibernateException {
		delete((Object) load(id));
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param id the instance ID to be removed
	 * @param s the Session
	 */
	public void delete(java.lang.Integer id, Session s)
		throws org.hibernate.HibernateException {
		delete((Object) load(id, s), s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param menuItemSize the instance to be removed
	 */
	public void delete(com.floreantpos.model.FlorantLicenceKey florantLicenceKey)
		throws org.hibernate.HibernateException {
		delete((Object) florantLicenceKey);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param menuItemSize the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.floreantpos.model.FlorantLicenceKey florantLicenceKey, Session s)
		throws org.hibernate.HibernateException {
		delete((Object) florantLicenceKey, s);
	}
	
	/**
	 * Re-read the state of the given instance from the underlying database. It is inadvisable to use this to implement
	 * long-running sessions that span many business tasks. This method is, however, useful in certain special circumstances.
	 * For example 
	 * <ul> 
	 * <li>where a database trigger alters the object state upon insert or update</li>
	 * <li>after executing direct SQL (eg. a mass update) in the same session</li>
	 * <li>after inserting a Blob or Clob</li>
	 * </ul>
	 */
	public void refresh (com.floreantpos.model.FlorantLicenceKey florantLicenceKey, Session s)
		throws org.hibernate.HibernateException {
		refresh((Object) florantLicenceKey, s);
	}


}