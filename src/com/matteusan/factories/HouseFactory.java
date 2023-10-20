package com.matteusan.factories;

/**
 * @author Matthew Hernandez
 */
public abstract class HouseFactory {
    private final String name;
    private int floorCount;
    private int roomCount;
    private int doorCount;

    public HouseFactory(String name, int floorCount, int roomCount, int doorCount) {
        this.name = name;
        this.floorCount = floorCount;
        this.roomCount = roomCount;
        this.doorCount = doorCount;
    }

    public String getName() {
        return name;
    }
}