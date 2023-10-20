package com.matteusan.houses;

import com.matteusan.factories.HouseFactory;

/**
 * @author Matthew Hernandez
 */
public final class Duplex extends HouseFactory {
    public Duplex() {
        super("Duplex", 3, 15, 9);
    }
}