package com.example.demo;

public class Animal {
    String name;
    String description;
    int age;
    String img;

    public Animal(String name, String description, int age, String img) {
        this.name = name;
        this.description = description;
        this.age = age;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
