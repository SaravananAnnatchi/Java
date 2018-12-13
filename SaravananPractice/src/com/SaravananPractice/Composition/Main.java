package com.SaravananPractice.Composition;

public class Main {
    public static void main(String[] args) {
        Rexin rexinleather = new Rexin("Reximanu","Rexin model", 32);
        Sofa sofa = new Sofa("Sofamanu", "Sofamodel", 3, 23, rexinleather);

        Bed bed = new Bed("BedManu", "Bedmodel", new Mattress("Kurlon", 20, 30,10), 2);
        House thishouse = new House(sofa , bed);
        thishouse.accessSofa();
        thishouse.accessbed();

    }

}
