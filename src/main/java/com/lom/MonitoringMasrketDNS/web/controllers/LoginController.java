package com.lom.MonitoringMasrketDNS.web.controllers;

import com.lom.MonitoringMasrketDNS.model.User;
import com.lom.MonitoringMasrketDNS.app.services.LoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    private Logger logger = Logger.getLogger(LoginController.class);
    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping
    public String login(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }

    @PostMapping("/auth")
    public String authenticate(User userToLogin) {
        if (loginService.authenticate(userToLogin)) {
            logger.info("User auth = OK with email: " + userToLogin.getEmail());
            return "links";
        } else {
            return "redirect:";
        }
    }

}
