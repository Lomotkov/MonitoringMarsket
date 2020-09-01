package com.lom.MonitoringMasrketDNS.app.services;

import com.lom.MonitoringMasrketDNS.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private UserService userService;

    @Autowired
    public LoginService(UserService userService) {
        this.userService = userService;
    }

    public boolean authenticate(User userToAuth) {
        User userToCheck = userService.getUserByEmail(userToAuth.getEmail());
        return userToCheck!=null&&userToCheck.getPassword().equals(userToAuth.getPassword());
    }
}
