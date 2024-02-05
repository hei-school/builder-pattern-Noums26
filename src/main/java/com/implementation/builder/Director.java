package com.implementation.builder;

import com.implementation.model.Engine;

public class Director {
    public void makeSuv(Builder builder){
        builder.setEngine(new Engine("SUV Engine"));
    }

    public void makeSportCar(Builder builder){
        builder.setEngine(new Engine("Sport Engine"));
    }
}
