package com.example.hibernateandjpa.Service;

import com.example.hibernateandjpa.DataAccess.ICityDal;
import com.example.hibernateandjpa.Entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CityManager implements ICityService{


    @Autowired
    public CityManager(ICityDal cityDal) {
        this.cityDal = cityDal;
    }

    private  ICityDal cityDal;



    @Override
    @Transactional
    public List<City> getAll() {
        return this.cityDal.getAll();
    }

    @Override
    @Transactional
    public void add(City city) {

        this.cityDal.add(city);
    }

    @Override
    @Transactional
    public void update(City city) {

        this.cityDal.update(city);
    }

    @Override
    @Transactional
    public void delete(City city) {

        this.cityDal.delete(city);
    }

    @Override
    @Transactional
    public City getById(int id) {
        return this.cityDal.getById(id);
    }


}
