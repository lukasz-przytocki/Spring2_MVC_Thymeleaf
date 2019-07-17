package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

@Controller
public class SchroniskoController {

    public SchroniskoController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    AnimalRepository animalRepository;


    @GetMapping("/")
    public String index(Model model) {
        Set<Animal> animals = animalRepository.getAllAnimals();
        model.addAttribute("animals", animals);
        return "index";
    }

    @GetMapping("/zwierzak")
    public String getAnimal(Model model, @RequestParam String animal) {
        if (animalRepository.getAnimal(animal) != null) {
            model.addAttribute("animal", animalRepository.getAnimal(animal));
        } else
            return "redirect:/";
        return "zwierzeta";
    }

}
