package br.com.qintess.eventos.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Repository
@EnableTransactionManagement
public class Dao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public <T> void save(T entity) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(entity);
	}
	
	@Transactional
	public <T> void merge(T entity) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(entity);
	}
	
	@Transactional
	public <T> void remove(T entity) {
		Session session = this.sessionFactory.getCurrentSession();
		session.remove(entity);
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public <T> List<T> getAll(Class<T> className) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("from " + className.getName()).getResultList();
	}
	
	@Transactional
	public <T> T getById(Class<T> className, int id) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(className, id);
	}
	
}
