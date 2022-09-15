package com.example.hibernateandjpa.Entity;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name ="city")
@Entity
public class City {

    @Id
    @GeneratedValue
    private int id;

    private  String name;
    private  String countryCode;
    private  String district;
    private  int population;

    public City(int id, String name, String countryCode, String district, int population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    public  City(){}
}
