package com.lemonslicedelivers.lemonslice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("")
    @ResponseBody
    public String index(Model model) {
        model.addAttribute("title", "My Webapp");
        return "webapp/src/index.html";
    }
}
