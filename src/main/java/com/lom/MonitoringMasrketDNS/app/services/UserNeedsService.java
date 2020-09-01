package com.lom.MonitoringMasrketDNS.app.services;

import com.lom.MonitoringMasrketDNS.model.UserNeeds;

import java.util.List;

public interface UserNeedsService {
    public void addUserNeed(UserNeeds userNeeds);

    public void removeUserNeed(long id);

    public List<UserNeeds> getAllUserNeeds(long userId);
}
