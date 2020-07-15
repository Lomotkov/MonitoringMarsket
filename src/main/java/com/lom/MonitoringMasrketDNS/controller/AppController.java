package com.lom.MonitoringMasrketDNS.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class AppController {

@RequestMapping("/")
    public String welcome() {
    System.out.println("Hello");
    return "index";
}

@RequestMapping(value = "/startPage")
    public String startPage(Model model) {
    model.addAttribute("text", "LOL PRIVET KAK DELA " + new Date(System.currentTimeMillis()).toString());
    return "startPage";
}
}
