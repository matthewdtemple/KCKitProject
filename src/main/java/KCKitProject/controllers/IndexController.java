package KCKitProject.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping
    public static String homePage(){
        return "index";
    }
}
