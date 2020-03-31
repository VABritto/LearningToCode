package com.qintess.estagio.hibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.qintess.estagio.hibernate.model.ItemVenda;
import com.qintess.estagio.hibernate.model.Produto;
import com.qintess.estagio.hibernate.model.Venda;

public class HibernateConfig {

	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			
			try {
				
				Configuration configuration = new Configuration();
				
				Properties prop = new Properties();
				
				// Config de conexão ao banco de dados.
				prop.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				prop.put(Environment.URL, "jdbc:mysql://localhost/db_estudo_hibernate?serverTimezone=UTC");
				prop.put(Environment.USER, "root");
				prop.put(Environment.PASS, "123456789");
				prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				
				prop.put(Environment.SHOW_SQL, "true");
				prop.put(Environment.HBM2DDL_AUTO, "create-drop");
				
				configuration.setProperties(prop);
				configuration.addAnnotatedClass(Produto.class);
				configuration.addAnnotatedClass(ItemVenda.class);
				configuration.addAnnotatedClass(Venda.class);
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
										.applySettings(configuration.getProperties())
										.build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return sessionFactory;
	}
}
