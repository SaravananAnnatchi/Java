package com.SaravananPractice.Composition;

public class Mattress {
    public String manufacturer;
    public int length;
    public int height;
    public int width;

    public Mattress(String manufacturer, int length, int height, int width) {
        this.manufacturer = manufacturer;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public void themattress(){
        System.out.println("The matress of " +manufacturer + " and the size of " +length+" "+height+" "+width);
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
