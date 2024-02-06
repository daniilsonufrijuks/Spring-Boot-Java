package rvt;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import rvt.temp.A;
import rvt.temp.B;
import rvt.temp.C;

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


    // @GetMapping(value = "/about")
    // String hello(Model model2) {
    //     String name = "Dannils";
    //     String surename = "Onufrijuks";
    //     int age = 17;
    //     String group = "DP 2-1";
    //     model2.addAttribute("name", name);
    //     model2.addAttribute("surename", surename);
    //     model2.addAttribute("age", age);
    //     model2.addAttribute("group", group);

    //     return "about";
    // }

    // @GetMapping(value = "/about")
    // ModelAndView about() {
    //     // CsvManager manager = new CsvManager();
    //     // List hobbies = manager.getAllHobbies();

    //     ModelAndView modelAndView = new ModelAndView("about");
    //     String name = "Dannils";
    //     String surename = "Onufrijuks";
    //     int age = 17;
    //     String group = "DP 2-1";
    //     modelAndView.addObject("name", name);
    //     modelAndView.addObject("surename", surename);
    //     modelAndView.addObject("age", age);
    //     modelAndView.addObject("group", group);
    //     return modelAndView;
    // }

    @GetMapping(value = "/about")
    ModelAndView about(@RequestParam HashMap<String, String> allParams) {
        // HashMap<String, String> car1 = new HashMap<>();
        // car1.put("brand", "value");
        // car1.put("model", "mustang");
        // car1.get("brand");
        
        // String name = allParams.get("name");
        // String age = allParams.get("age");

        ModelAndView modelAndView = new ModelAndView("about");
        // modelAndView.addObject("name", name);
        // modelAndView.addObject("age", age);  


        // happy new year 
        
        // A a = new A();
        // B b = new B();
        C c = new C();


        c.a();
        c.b();
        c.c();
        return modelAndView;

    }

    @GetMapping(value = "/test")
    @ResponseBody()
    public String testAction() {
        String name = "John";
        String name1 = "John1";
        String name2 = "John2";

        return name + "<hr>" + name1 + "<hr>" + name2 + "<hr>";
    }


    // @GetMapping(value = "/about")
    // ModelAndView about(
    //     @RequestParam HashMap<String, String> allParams 
    //     ) {

    //     ModelAndView modelAndView = new ModelAndView("about");
    //     CsvManager manager = new CsvManager(CsvManager.HOBBIES_CSV);
    //     manager.addHobbyToCsv (
    //         new String[]{allParams.get("id"), allParams.get("title"), allParams.get("discription")}
    //     );
    //     return modelAndView;
    // }
}
