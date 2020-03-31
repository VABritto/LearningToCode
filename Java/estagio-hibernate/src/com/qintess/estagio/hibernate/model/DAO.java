package com.qintess.estagio.hibernate.model;

import org.hibernate.Session;

import com.qintess.estagio.hibernate.config.HibernateConfig;

public class DAO<T extends Entidade> {
	
	public T buscaPorId (Class<T> t, Integer id ) {
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			
			return session.find(t, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void salvarOuAlterar(T t) {
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			session.getTransaction().begin();
			if (t.getId() == null) {
				session.persist(t);
			} else {
				session.merge(t);
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void remover(Class<T> t1, Integer id) {
		T t2 = buscaPorId(t1, id);
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			session.getTransaction().begin();
			session.remove(t2);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			Session session = HibernateConfig.getSessionFactory().openSession();
			session.getTransaction().rollback();
			e.printStackTrace();
			session.close();
		}
	}
	
}
