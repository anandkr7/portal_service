package com.backend.service;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@EnableJpaRepositories(basePackages = "com.portal.backend.repository")
@ComponentScan({ "com.portal.backend.service", "com.portal.backend.repository" })
public class BaseTest {

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter jpaAdapter = new HibernateJpaVendorAdapter();
		jpaAdapter.setDatabase(Database.MYSQL);
		jpaAdapter.setGenerateDdl(true);
		jpaAdapter.setShowSql(true);
		return jpaAdapter;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource,
			JpaVendorAdapter jpaVendorAdaptor) {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setDataSource(dataSource);
		bean.setJpaVendorAdapter(jpaVendorAdaptor);
		bean.setPackagesToScan("com.portal*");
		return bean;
	}

	@Bean(name = "transactionManager")
	public JpaTransactionManager jpaTransactionManager(EntityManagerFactory emp) {
		return new JpaTransactionManager(emp);
	}
	
}
