package com.taxy4fun.repository;

import com.taxy4fun.repository.entity.Vehicle;

/**
 * Created by mvillafuertem on 31/08/2017.
 */
public final class RepositoryTestUtils {

    static final String BRAND_AUDI = "Audi";
    static final String PLATE_AUDI = "1234ABC";

    static Vehicle newVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setPlate(PLATE_AUDI);
        vehicle.setBrand(BRAND_AUDI);
        vehicle.setDescription("A4 Black");
        return vehicle;
    }
}
