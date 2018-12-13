package com.SaravananPractice.Composition;

public class Sofa {
    public String manufacturer;
    public String model;
    public int seater;
    public int size;
    public Rexin rexinleather;

    public Sofa(String manufacturer, String model, int seater, int size, Rexin rexinleather){
        this.manufacturer = manufacturer;
        this.model = model;
        this.seater = seater;
        this.size = size;
        this.rexinleather = rexinleather;
    }

    public void sofaset(){
        System.out.println("sofaset of " + manufacturer + " " + model +" " + " "+ seater+" " +size+" "+rexinleather);
        rexinleather.rexinTypeSize(20,30);
    }
    public int getSeater() {
        return seater;
    }
    public int getSize(){
        return size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Rexin getRexinleather() {
        return rexinleather;
    }
}
