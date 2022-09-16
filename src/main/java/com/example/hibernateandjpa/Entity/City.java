package com.example.hibernateandjpa.Entity;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name ="city")
@Entity
public class City {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private  String name;
    @Column(name = "countrycode")
    private  String countryCode;
    @Column(name = "district")
    private  String district;
    @Column(name = "population")
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
