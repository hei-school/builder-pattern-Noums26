package com.implementation.builder;

import com.implementation.model.CarManual;
import com.implementation.model.Engine;

public class CarManualBuilder implements Builder{
    private CarManual manual = new CarManual();
    @Override
    public void reset() {
        this.manual = new CarManual();
    }

    @Override
    public void setSeats(int number) {
        manual.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setGPS() {
        manual.setGps("Gps");
    }

    @Override
    public void setTripComputer() {
        manual.setTripComputer("TripComputer");
    }

    public CarManual getResult() {
        return manual;
    }
}
