package com.matteusan;

import com.matteusan.factories.HouseFactory;

/**
 * @author Matthew Hernandez
 */
public class Lot {
    private final int id;
    private final String block;
    private final int size;
    private final int price;
    private final String houseType;
    private final String status;

    public Lot(int id, Block block, int size, HouseFactory houseType, int price, int status) {
        this.id = id;
        this.block = block.getName();
        this.size = size;
        this.houseType = houseType.getName();
        this.price = price;
        this.status = matchLotStatus(status);
    }

    private static String matchLotStatus(int status) {
        if (status == 1) return "Available";
        if (status == 2) return "Reserved";
        if (status >= 3) return "ERROR: ";
        return "Sold";
    }

    public Object[] getLotData() {
        return new Object[]{id, block, size, houseType, price, status};
    }
}