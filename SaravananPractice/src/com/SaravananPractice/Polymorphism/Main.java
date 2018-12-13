package com.SaravananPractice.Polymorphism;

import java.sql.SQLOutput;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        return "Car - > startEngine()";
    }
    public String accelerate(){
        return "Car - >Accelarator()";
    }

    public String brake(){
        return "Car - > Brake() ";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Audi extends Car{
    public Audi() {
        super("Audi Q5", 2);
    }

    @Override
    public String startEngine() {
        return "Audi - >StartEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " - > Accelerator()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " - > Brake()";
    }
}

class Volkswagen extends Car{
    public Volkswagen(String name , int cylinder) {
        super(name , cylinder);
    }

    @Override
    public String startEngine() {
        return "Volkswagen - >StartEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " - > Accelerator()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " - > Brake()";
    }
}

class Benz extends Car{
    public Benz(String name , int cylinder) {
        super(name , cylinder);
    }

    @Override
    public String startEngine() {
        return "Benz - >StartEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " - > Accelerator()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " - > Brake()";
    }
}

public class Main {

    public static void main(String[] args){
        Car car = new Car("Base Car" , 5);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Audi audi = new Audi();
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        Volkswagen volks = new Volkswagen("Ventor" , 4);
        System.out.println(volks.startEngine());
        System.out.println(volks.accelerate());
        System.out.println(volks.brake());

        Benz benz = new Benz("Benz A2" , 8);
        System.out.println(benz.startEngine());
        System.out.println(benz.accelerate());
        System.out.println(benz.brake());
    }
}
