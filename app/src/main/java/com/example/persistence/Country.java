package com.example.persistence;

public class Country {

    private String name;
    private String nationalDay;
    private String capital;

    public Country(String name, String nationalDay, String capital) {
        this.name = name;
        this.nationalDay = nationalDay;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getNationalDay() {
        return nationalDay;
    }

    public String getCapital() {
        return capital;
    }
}
