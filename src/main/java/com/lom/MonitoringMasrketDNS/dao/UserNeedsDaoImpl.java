package com.lom.MonitoringMasrketDNS.dao;

import com.lom.MonitoringMasrketDNS.model.UserNeeds;
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
public class UserNeedsDaoImpl implements UserNeedsDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUserNeed(UserNeeds userNeeds) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(userNeeds);
        logger.info("usersNeeds added: " + userNeeds.toString());
    }

    @Override
    public void removeUserNeed(long id) {
        Session session = sessionFactory.getCurrentSession();
        UserNeeds userNeedToDelete = session.load(UserNeeds.class, id);
        if (userNeedToDelete != null) {
            session.delete(userNeedToDelete);
            logger.info("user deleted : " + userNeedToDelete.getProductKey() + "ID = " + userNeedToDelete.getId());
        }
    }

    @Override
    @SuppressWarnings("unckecked")
    public List<UserNeeds> getAllUserNeeds(long userId) {
        Session session = sessionFactory.getCurrentSession();
        return (List<UserNeeds>) session.createQuery("FROM UserNeeds p WHERE p.userId = " + userId).list();
    }
}
