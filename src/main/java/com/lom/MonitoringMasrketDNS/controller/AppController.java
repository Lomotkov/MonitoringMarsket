package com.lom.MonitoringMasrketDNS.controller;

import com.lom.MonitoringMasrketDNS.model.User;
import com.lom.MonitoringMasrketDNS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

    @Autowired
    private UserService userService;


    @RequestMapping("/")
    public String welcome() {
        System.out.println("Hello");
        return "index";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("user") User user) {
        userService.getAllUsers();
        if(userService.getUserByEmail(user.getEmail()) == null) {
            System.out.println("User added");
            userService.addUser(user);
        }
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User user) {
//        userService.addUser(user);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }
}
