package com.lom.MonitoringMasrketDNS.app.services;

import com.lom.MonitoringMasrketDNS.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private UserService userService;

    @Autowired
    public RegistrationService(UserService userService) {
        this.userService = userService;
    }

    public boolean registration(User userToReg) {
        if(userService.getUserByEmail(userToReg.getEmail())==null) {
            userService.addUser(userToReg);
            return true;
        }
        return false;
    }

}
