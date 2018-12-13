package com.SaravananPractice.Composition;

public class Bed {
    public String manufacturer;
    public String Model;
    public Mattress mattress;
    public int quantity;


    public Bed(String manufacturer, String model, Mattress mattress, int quantity) {
        this.manufacturer = manufacturer;
        Model = model;
        this.mattress = mattress;
        this.quantity = quantity;
    }

    public void woodBed(String type){
        System.out.println("bedtype of" +type);
        mattress.themattress();
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public Mattress getMattress() {
        return mattress;
    }

    public int getQuantity() {
        return quantity;
    }




}
