package com.SaravananPractice.Composition;

public class House {
    public Sofa sofa;
    public Bed bed;

    public House(Sofa sofa, Bed bed) {
        this.sofa = sofa;
        this.bed = bed;
    }

    public void accessSofa(){
        getSofa().sofaset();
    }
    public void accessbed(){
        getBed().woodBed("wood");
    }

    public Bed getBed() {
        return bed;
    }

    public Sofa getSofa() {
        return sofa;
    }
}
