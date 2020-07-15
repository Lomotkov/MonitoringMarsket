package com.lom.MonitoringMasrketDNS.dao;

import com.lom.MonitoringMasrketDNS.model.User;

import java.util.List;

public interface UsersDao {
    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(long user);

    public User getUserById(long id);

    public List<User> getAllUsers();


}
