package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Repository
public class AnimalRepository {

    private Set<Animal> animals;


    public AnimalRepository() {
        this.animals = new HashSet<>();
        animals.add(new Animal("Azor", "Azor jest owczarkiem niemieckim", 3, "azor.jpg"));
        animals.add(new Animal("Rudy", "Rudy jest bokserem", 5, "https://www.petrolfordogs.com/wp-content/uploads/2018/01/pup-1.png"));
        animals.add(new Animal("Reksio", "Reksio jest mieszańcem", 6, "REKSIO 2.png"));

    }

    public Animal getAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().contains(name)) {
                return animal;
            }
        }
        return null;
    }

    public Set<Animal> getAllAnimals() {
        return animals;
    }
}
