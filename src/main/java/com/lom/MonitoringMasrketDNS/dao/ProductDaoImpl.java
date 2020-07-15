package com.lom.MonitoringMasrketDNS.dao;

import com.lom.MonitoringMasrketDNS.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDaoImpl implements ProductDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addNewProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(product);
        logger.info("product added: " + product.toString());
    }

    @Override
    @SuppressWarnings("unckecked")
    public List<Product> getProduct(String productKey) {
        Session session = sessionFactory.getCurrentSession();
        List<Product> product = session.createQuery("FROM Product p WHERE p.KEY = " + productKey).list();
        return product;
    }
}
