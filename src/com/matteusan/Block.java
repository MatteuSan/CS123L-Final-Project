package com.matteusan;

/**
 * @author Matthew Hernandez
 */
public class Block {
    private final String name;
    private final Object[] lots;
    private final int maxLots;

    public Block(String name, int maxLots) {
        this.name = name;
        this.maxLots = maxLots;
        this.lots = new Lot[maxLots];
    }

    public String getName() {
        return "Block " + name;
    }
}