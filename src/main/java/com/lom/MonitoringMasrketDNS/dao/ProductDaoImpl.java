package com.lom.MonitoringMasrketDNS.dao;

import com.lom.MonitoringMasrketDNS.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
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
    public Product getProduct(String productKey) {
        Session session = sessionFactory.getCurrentSession();
        return session.load(Product.class, productKey);
    }
}
