package com.lom.MonitoringMasrketDNS.app.services;

import com.lom.MonitoringMasrketDNS.dao.UserNeedsDao;
import com.lom.MonitoringMasrketDNS.model.UserNeeds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserNeedsServiceImpl implements UserNeedsService {

    private UserNeedsDao userNeedsDao;

    @Autowired
    public void setUserNeedsDao(UserNeedsDao userNeedsDao) {
        this.userNeedsDao = userNeedsDao;
    }

    @Override
    @Transactional
    public void addUserNeed(UserNeeds userNeeds) {
        userNeedsDao.addUserNeed(userNeeds);
    }

    @Override
    @Transactional
    public void removeUserNeed(long id) {
        userNeedsDao.removeUserNeed(id);
    }

    @Override
    @Transactional
    public List<UserNeeds> getAllUserNeeds(long userId) {
        return userNeedsDao.getAllUserNeeds(userId);
    }
}
