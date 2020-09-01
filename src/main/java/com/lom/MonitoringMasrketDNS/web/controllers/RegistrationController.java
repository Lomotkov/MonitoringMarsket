package com.lom.MonitoringMasrketDNS.web.controllers;

import com.lom.MonitoringMasrketDNS.model.User;
import com.lom.MonitoringMasrketDNS.app.services.RegistrationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
    private RegistrationService registrationService;

    private Logger logger = Logger.getLogger(RegistrationController.class);

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping
    public String registration(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    }

    @PostMapping("/addUser")
    public String registrationAdd(User userToReg) {
        if (registrationService.registration(userToReg)) {
            logger.info("User added with email = " + userToReg.getEmail());
            return "login";
        } else {
            logger.info("User not added");
            return "redirect:registration";
        }
    }
}
