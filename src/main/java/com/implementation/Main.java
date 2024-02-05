package com.implementation;

import com.implementation.builder.CarBuilder;
import com.implementation.builder.Director;
import com.implementation.model.Car;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        builder.setSeats(2);
        builder.setTripComputer();
        builder.setGPS();
        director.makeSportCar(builder);
        Car car = builder.getResult();

        System.out.println(car);
    }
}
