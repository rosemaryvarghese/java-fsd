package com.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Product;
import com.utility.Utiltity;

public class SaveObject {
	public static int save(Product pr) {
		//get the session Object
		Session ses = Utiltity.getSession();
		Transaction tx = null;
		Integer count = 0;
		try(ses){
			//begin the transaction
			tx = ses.beginTransaction();
			//save the object
			count = (Integer) ses.save(pr);
			//commit the trasaction
			tx.commit();
		}catch(HibernateException he) {
			he.printStackTrace();
			tx.rollback();
		}catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return count;
	}
}