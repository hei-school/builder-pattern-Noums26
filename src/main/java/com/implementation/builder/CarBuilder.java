package com.implementation.builder;

import com.implementation.model.Car;
import com.implementation.model.Engine;

public class CarBuilder implements Builder{
    private Car car = new Car();
    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        car.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setGPS() {
        car.setGps("Gps");
    }

    @Override
    public void setTripComputer() {
        car.setTripComputer("TripComputer");
    }

    public Car getResult() {
        return car;
    }
}
