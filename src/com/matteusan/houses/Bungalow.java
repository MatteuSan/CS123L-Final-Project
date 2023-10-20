package com.matteusan.houses;

import com.matteusan.factories.HouseFactory;

/**
 * @author Matthew Hernandez
 */
public final class Bungalow extends HouseFactory {
    public Bungalow() {
        super("Bungalow", 1, 5, 3);
    }
}