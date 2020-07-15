package com.lom.MonitoringMasrketDNS.dao;

import com.lom.MonitoringMasrketDNS.model.User;
import com.lom.MonitoringMasrketDNS.model.UsersNeeds;

import java.util.List;

public interface UserNeedsDao {
    public void addUserNeed(UsersNeeds usersNeeds);

    public List<UsersNeeds> getAllUserNeeds(long userId);
}
