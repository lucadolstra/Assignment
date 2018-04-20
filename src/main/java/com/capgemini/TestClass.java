package com.capgemini;

public class TestClass {

    private String naam = "ab ";
    private String achternaam = "cd";

    public void printHallo() {

        System.out.println("Hallo " + naam);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
}
