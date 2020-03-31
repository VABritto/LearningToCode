package com.qintess.estagio.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qintess.estagio.hibernate.config.HibernateConfig;
import com.qintess.estagio.hibernate.model.Produto;

public class ProdutoDao {

	public void salvar(Produto produto) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			session.save(produto);
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void atualizar(Produto produto) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			session.merge(produto);
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void remover(Produto produto) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			session.remove(produto);
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public Produto buscaPorId(int id) {
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			return session.find(Produto.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Produto> buscaTodos() {
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			return session.createQuery("from Produto", Produto.class).list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
