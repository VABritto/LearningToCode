package com.qintess.estudo.hibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.qintess.estudo.hibernate.model.Fornecedor;
import com.qintess.estudo.hibernate.model.FornecedorProduto;
import com.qintess.estudo.hibernate.model.ItemVenda;
import com.qintess.estudo.hibernate.model.Produto;
import com.qintess.estudo.hibernate.model.Venda;

public class HibernateConfig {

	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if (sessionFactory == null) {
			try {
				
				Configuration configuration = new Configuration();
				Properties prop = new Properties();
				prop.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				prop.put(Environment.URL, "jdbc:mysql://localhost/db_estudo_hibernate2?serverTimezone=UTC");
				prop.put(Environment.USER, "root");
				prop.put(Environment.PASS, "123456789");
				prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				prop.put(Environment.SHOW_SQL, "true");
				prop.put(Environment.HBM2DDL_AUTO, "create-drop");
				
				configuration.setProperties(prop);
				configuration.addAnnotatedClass(Venda.class);
				configuration.addAnnotatedClass(ItemVenda.class);
				configuration.addAnnotatedClass(Produto.class);
				configuration.addAnnotatedClass(Fornecedor.class);
				configuration.addAnnotatedClass(FornecedorProduto.class);
				
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
