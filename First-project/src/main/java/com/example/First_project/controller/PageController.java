package com.example.First_project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class PageController {
    
    @GetMapping("/")
    public String index (Model model) {
        model.addAttribute("name","Tony Stark");
        model.addAttribute("heroic_name","Ironman");


        // if
        model.addAttribute("ishero", false);

        // Loop
        List<String> avengers = new ArrayList<>();
        avengers.add("Captain America");
        avengers.add("IronMan");
        avengers.add("Hulk");
        avengers.add("Batman");
        avengers.add("Spiderman");

        model.addAttribute("aven", avengers);

        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
