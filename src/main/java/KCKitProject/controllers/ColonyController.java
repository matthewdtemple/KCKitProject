package KCKitProject.controllers;

import KCKitProject.data.CatColonyRepository;
import KCKitProject.data.CatShelterRepository;
import KCKitProject.models.CatColony;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ColonyController {

    @Autowired
    CatColonyRepository catColonyRepository;
    @Autowired
    CatShelterRepository catShelterRepository;


    @GetMapping("createcolony")
    public String createColonyHome(Model model){
        model.addAttribute("colony",new CatColony());
        return "colony/create";
    }

    @PostMapping("createcolony")
    public String addColony(@ModelAttribute @Valid CatColony newCatColony, Errors errors){
        if (errors.hasErrors()) {
            return "colony/create";
        }

        catColonyRepository.save(newCatColony);
        return "redirect:";
    }

    @GetMapping("list")
    public String allColonies(Model model){
        model.addAttribute("colonies",catColonyRepository.findAll());
        return "colony/list";
    }
// test comment

}

