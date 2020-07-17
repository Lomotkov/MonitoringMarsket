package com.lom.MonitoringMasrketDNS.controller;

import com.lom.MonitoringMasrketDNS.model.User;
import com.lom.MonitoringMasrketDNS.service.UserService;
import com.lom.MonitoringMasrketDNS.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class AppController {

    @Autowired
    private UserService userService;



@RequestMapping("/")
    public String welcome() {
    System.out.println("Hello");
    return "index";
}

@RequestMapping(value = "/startPage", method = RequestMethod.POST)
    public String addUserName(@ModelAttribute("user") User user) {
    System.out.println(user.getName());
    System.out.println(user.getEmail());
    return "startPage";
}

@RequestMapping(value = "/startPage", method = RequestMethod.GET)
    public String startPage(Model model) {
    User user = new User();
    model.addAttribute("user", user);
    return "startPage";
}
}
