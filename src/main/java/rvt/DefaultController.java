package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class DefaultController {
    
//    @GetMapping(value = "/")
//     // String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
//     //     return "index";
//     // }

//     String index(Model model) {
//         int age = 99;
//         String school = "RVT";
//         model.addAttribute("age", age);
//         model.addAttribute("school", school);
//         return "index";
//     }


    @GetMapping(value = "/about")
    String hello(Model model2) {
        String name = "Dannils";
        String surename = "Onufrijuks";
        int age = 17;
        String group = "DP 2-1";
        model2.addAttribute("name", name);
        model2.addAttribute("surename", surename);
        model2.addAttribute("age", age);
        model2.addAttribute("group", group);

        return "about";
    }
}
