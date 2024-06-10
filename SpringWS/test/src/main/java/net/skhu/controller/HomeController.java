package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("home/index")
    public String index(Model model) {
        model.addAttribute("message", "좋은 아침입니다");
        return "home/index";
    }
}

