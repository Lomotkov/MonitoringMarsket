package com.lom.MonitoringMasrketDNS.dao;

import com.lom.MonitoringMasrketDNS.model.Product;
import com.lom.MonitoringMasrketDNS.model.UsersNeeds;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserNeedsDaoImpl implements UserNeedsDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUserNeed(UsersNeeds usersNeeds) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(usersNeeds);
        logger.info("usersNeeds added: " + usersNeeds.toString());
    }

    @Override
    @SuppressWarnings("unckecked")
    public List<UsersNeeds> getAllUserNeeds(long userId) {
        Session session = sessionFactory.getCurrentSession();
        List<UsersNeeds> usersNeeds = session.createQuery("FROM UserNeeds p WHERE p.USER_ID = " + userId).list();
        return usersNeeds;
    }
}
