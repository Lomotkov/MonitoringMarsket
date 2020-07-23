package com.lom.MonitoringMasrketDNS.controller;

import com.lom.MonitoringMasrketDNS.model.Product;
import com.lom.MonitoringMasrketDNS.model.User;
import com.lom.MonitoringMasrketDNS.service.UserService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    public String registrationAdd(@ModelAttribute("user") User user) {
        if (userService.getUserByEmail(user.getEmail()) == null) {
            System.out.println("User added");
            userService.addUser(user);
        } else {
            System.out.println("User not added");
        }
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    }


    @RequestMapping(value = "/links", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User user, Model model) throws ParseException {
        User userToLogin = userService.getUserByEmail(user.getEmail());
        if (userToLogin != null && userToLogin.getPassword().equals(user.getPassword())) {
            List<Product> products = new ArrayList<Product>();
            products.add(new Product("234423", "213231", "rewrw", 2341, new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998")));
            products.add(new Product("ewwewe", "qqqqq", "rewrw", 2341, new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1996")));
            products.add(new Product("234weqqq423", "eeeee", "rewrw", 2341, new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1994")));
            model.addAttribute("products", products);
            return "links";
        } else {
            return "login";
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }
}
