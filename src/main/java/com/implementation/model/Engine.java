package com.implementation.model;

public class Engine {
    private String type;

    public Engine(String type){
        this.type = type;
    };

    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "engineType: "+type;
    }
}
