package com.lom.MonitoringMasrketDNS.dao;

import com.lom.MonitoringMasrketDNS.model.UserNeeds;

import java.util.List;

public interface UserNeedsDao {
    public void addUserNeed(UserNeeds userNeeds);

    public void removeUserNeed(long id);

    public List<UserNeeds> getAllUserNeeds(long userId);
}
