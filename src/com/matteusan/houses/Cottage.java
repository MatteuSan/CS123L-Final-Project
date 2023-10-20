package com.matteusan.houses;

import com.matteusan.factories.HouseFactory;

/**
 * @author Matthew Hernandez
 */
public final class Cottage extends HouseFactory {
    public Cottage() {
        super("Cottage", 2, 10, 6);
    }
}