package com.implementation.builder;

import com.implementation.model.Engine;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(Engine engine);
    void setGPS();
    void setTripComputer();

}
