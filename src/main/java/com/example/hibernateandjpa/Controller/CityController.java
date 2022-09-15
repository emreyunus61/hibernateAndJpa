package com.example.hibernateandjpa.Controller;

import com.example.hibernateandjpa.Entity.City;
import com.example.hibernateandjpa.Service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {

    private ICityService cityService;

    @Autowired
    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("cities")
       public   List<City> getAll(){

        return  this.cityService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody City city){
        cityService.add(city);
    }

    @PostMapping("/update")
    public void update(@RequestBody City city){
        cityService.update(city);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody City city){
        cityService.delete(city);
    }

    @GetMapping("cities/{id}")
    public   City getById(@PathVariable int id){
        return  this.cityService.getById(id);
    }



}
