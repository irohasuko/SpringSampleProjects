package com.example.vstest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DisplayNumController {
    
    @Autowired
    private RandNumService randNumService;

    @GetMapping("/home")
    public String home(Model model){
        int randNum = randNumService.getRandNum();
        model.addAttribute("num", randNum);
        return "home";
    }
}
