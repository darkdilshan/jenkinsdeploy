package com.sankadilshan.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class controller {

    @GetMapping
    public String head(Model model){
        model.addAttribute("head","hi this going to deploy");
      return "home.html";
    }
}
