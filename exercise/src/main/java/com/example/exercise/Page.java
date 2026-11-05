package com.example.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/page")
public class Page {


    @GetMapping("/get")
    public String getPage(Model model){
        Student student = new Student("michou" , 20);


        model.addAttribute("st", student);
        return "Hello";
    }




}
