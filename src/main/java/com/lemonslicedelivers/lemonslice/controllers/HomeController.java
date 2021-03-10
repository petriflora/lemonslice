package com.lemonslicedelivers.lemonslice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("")
    @ResponseBody
    public String index() {
        return "lemonslice delivers test correct 030921 20:17";
    }

    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return "woo hoo!";
    }
}
