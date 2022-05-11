package com.example.persistence;

public class Country {

    private Long id;
    private String name;
    private String nationalDay;
    private String capital;

    public Country(Long id, String name, String nationalDay, String capital) {
        this.id = id;
        this.name = name;
        this.nationalDay = nationalDay;
        this.capital = capital;
    }

    public Long getId() {
        return id;
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
