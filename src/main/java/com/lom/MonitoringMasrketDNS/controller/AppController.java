package com.lom.MonitoringMasrketDNS.controller;

import com.lom.MonitoringMasrketDNS.model.User;
import com.lom.MonitoringMasrketDNS.model.UserNeeds;
import com.lom.MonitoringMasrketDNS.parsing.LinkParserUtils;
import com.lom.MonitoringMasrketDNS.parsing.SiteParser;
import com.lom.MonitoringMasrketDNS.service.ProductService;
import com.lom.MonitoringMasrketDNS.service.UserNeedsService;
import com.lom.MonitoringMasrketDNS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;
    @Autowired
    private UserNeedsService userNeedsService;


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
        userService.getAllUsers();
        model.addAttribute("user", user);
        SiteParser.getProductPrice("https://www.dns-shop.ru/product/fd6ad37fbbc73330/detskoe-avtokreslo-siger-art-kokon-isofix-koricnevyj/");
        return "registration";
    }


    @RequestMapping(value = "/links", method = {RequestMethod.GET, RequestMethod.POST})
    public String login(@ModelAttribute("user") User user, Model model) {
        User userToLogin = userService.getUserByEmail(user.getEmail());
        if (userToLogin != null && userToLogin.getPassword().equals(user.getPassword())) {
            List<UserNeeds> userNeeds = userNeedsService.getAllUserNeeds(userToLogin.getId());
            model.addAttribute("userNeedAdd", new UserNeeds());
            model.addAttribute("usersNeeds", userNeeds);
            model.addAttribute("loginUser", userToLogin);
            return "links";
        } else {
            return "login";
        }
    }

    @RequestMapping(value = "/links/add", method = RequestMethod.POST)
    public String addBook(@ModelAttribute("userNeedAdd") UserNeeds userNeedAdd, @ModelAttribute("loginUser") User loginUser) {
        if (userNeedAdd.getId() == 0) {
            userNeedAdd.setUserId(loginUser.getId());
            userNeedAdd.setProductKey(LinkParserUtils.getKeyFromLink(userNeedAdd.getLink()));
            userNeedAdd.setProductName("test");
            this.userNeedsService.addUserNeed(userNeedAdd);
        }
        return "redirect:/links";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }
}
