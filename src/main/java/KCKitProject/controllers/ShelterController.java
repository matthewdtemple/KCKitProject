package KCKitProject.controllers;

import KCKitProject.data.CatShelterRepository;
import KCKitProject.models.CatShelter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ShelterController {

    @Autowired
    CatShelterRepository catShelterRepository;

    @GetMapping("createshelter")
    public String createShelterHome(Model model){
        model.addAttribute("shelter", new CatShelter());
        return "add";
    }

    @PostMapping("createshelter")
    public String addShelter(@ModelAttribute @Valid CatShelter newCatShelter, Errors errors){
        if (errors.hasErrors()) {
        return "createshelter";
        }

        catShelterRepository.save(newCatShelter);
        return "redirect:";
    }
}
