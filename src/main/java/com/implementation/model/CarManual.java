package com.implementation.model;

public class CarManual {
    private int seats;
    private Engine engine;
    private String tripComputer;
    private String gps;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "manual={seats: " +seats+
                ", "+engine+
                ", tripComputer: "+tripComputer+
                ", gps: "+gps+
                "}";
    }
}
