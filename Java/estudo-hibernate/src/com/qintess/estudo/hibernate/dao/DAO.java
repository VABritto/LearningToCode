package com.qintess.estudo.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qintess.estudo.hibernate.config.HibernateConfig;
import com.qintess.estudo.hibernate.model.Entidade;

public class DAO<T extends Entidade> {

	public T buscaPorId(Class<T> t, Object id) {
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			return session.find(t, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void salvarOuAlterar (T t) {
		Transaction transaction = null;
		
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			transaction = session.beginTransaction();
			
			if (t.getId() == null) {
				session.persist(t);
			} else {
				session.merge(t);
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}
	
	public void remover(Class<T> t1, Object id) {
		T t2 = buscaPorId(t1, id);
		Transaction transaction = null;
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			transaction = session.beginTransaction();
			session.remove(t2);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
