package KCKitProject.controllers;

import KCKitProject.data.CatColonyRepository;
import KCKitProject.data.CatShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ColonyController {

    @Autowired
    CatColonyRepository catColonyRepository;
    @Autowired
    CatShelterRepository catShelterRepository;


    @GetMapping("createcolony")
    public String create(){
        return "colony/create";
    }

    @GetMapping("list")
    public String allColonies(Model model){
        model.addAttribute("colonies",catColonyRepository.findAll());
        return "colony/list";
    }
}

