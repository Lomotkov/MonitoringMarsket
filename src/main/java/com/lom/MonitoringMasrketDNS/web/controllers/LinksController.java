package com.lom.MonitoringMasrketDNS.web.controllers;

import com.lom.MonitoringMasrketDNS.app.services.UserNeedsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/links")
public class LinksController {

    private UserNeedsService userNeedsService;

    @Autowired
    public LinksController(UserNeedsService userNeedsService) {
        this.userNeedsService = userNeedsService;
    }

    @PostMapping("/addLink")
    public String addBook(String userLink) {
//        UserNeeds userNeedToAdd = new UserNeeds();
//        userNeedToAdd.setUserId(0);
//        userNeedToAdd.setProductKey(LinkParserUtils.getKeyFromLink(userLink));
//        userNeedToAdd.setProductName("test");
//        this.userNeedsService.addUserNeed(userNeedToAdd);
        return "redirect:/links";
    }

    @GetMapping
    public String showLinks(Model model) {
        model.addAttribute("usersNeeds", userNeedsService.getAllUserNeeds(0));
        return "links";
    }


}
