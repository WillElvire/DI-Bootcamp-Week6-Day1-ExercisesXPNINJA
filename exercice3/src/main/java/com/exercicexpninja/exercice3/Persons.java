/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicexpninja.exercice3;

public class Persons {
    
    String name;
    int age;
    char gender;
  
    //Constructeur par défaut
    public Persons() {
        this.name = "Hidden";
        this.age = 0;
        this.gender = 'M';
    }
  
    //Deuxième constructeur
    public Persons(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
  
    //Troisième constructeur
    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = 'M';
    }
  
    //Méthode displayInfo
    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Gender: " + this.gender);
    }
    
}
