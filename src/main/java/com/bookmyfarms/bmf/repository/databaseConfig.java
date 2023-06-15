package com.bookmyfarms.bmf.repository;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

//@Configuration
public class databaseConfig {

//    private final DataSource dataSource;
//
//    public databaseConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

//    @Bean
//    public EntityManagerFactory entityManagerFactory() {
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setGenerateDdl(true);
//
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        factory.setJpaVendorAdapter(vendorAdapter);
////        factory.setPackagesToScan("repository.package.location");
//        factory.setDataSource(dataSource);
//        factory.afterPropertiesSet();
//
//        return factory.getObject();
//    }
}
