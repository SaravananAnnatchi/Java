package com.SaravananPractice.Composition;

public class Rexin {
    public String manufacturer;
    public String model;
    public int Size;

    public Rexin(String manufacturer, String model, int size) {
        this.manufacturer = manufacturer;
        this.model = model;
        Size = size;
    }

    public void rexinTypeSize(int height, int width){
        System.out.println("rexintypesze is" +height +" " + width);
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return Size;
    }
}
