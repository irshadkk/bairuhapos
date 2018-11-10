package com.floreantpos.model.dao;

import com.floreantpos.model.FlorantLicenceKey;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
 

public class FlorantLicenceKeyDAO extends BaseFlorantLicenceKeyDAO {

	/**
	 * Default constructor.  Can be used in place of getInstance()
	 */
	public FlorantLicenceKeyDAO() {
	}

//	@Override
//	public Order getDefaultOrder() {
//		return Order.asc(BaseFlorantLicenceKeyDAO.PROP_SORT_ORDER);
//	}

	public void setDefault(List<FlorantLicenceKey> items) {
		Session session = null;
		Transaction tx = null;
		try {
			session = createNewSession();
			tx = session.beginTransaction();
			saveOrUpdateSizeList(items, session);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw e;
		} finally {
			session.close();
		}
	}

	public void saveOrUpdateSizeList(List<FlorantLicenceKey> items, Session session) {
		for (Iterator iterator = items.iterator(); iterator.hasNext();) {
			FlorantLicenceKey florantLicenceKey = (FlorantLicenceKey) iterator.next();
			session.saveOrUpdate(florantLicenceKey);
		}
	}

	public FlorantLicenceKey findById(Integer id) {
		Session session = null;
		Criteria criteria = null;
		try {
			session = getSession();
			criteria = session.createCriteria(FlorantLicenceKey.class);

			criteria.add(Restrictions.eq("ID", id));

			return (FlorantLicenceKey) criteria.list().get(0);

		} catch (Exception e) {
		}
		return null;
	}
}