package com.example.Crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Crud.repository.AvengerRepository;


@Controller
public class AvengerController {

    private final AvengerRepository repo;
    
    public AvengerController(AvengerRepository repo){
        this.repo = repo;
    }


    @GetMapping("/")
    public String index(Model model){

        System.out.println(repo.findAll());


        model.addAttribute("avengers", repo.findAll());
        return "index";
    }
    
}