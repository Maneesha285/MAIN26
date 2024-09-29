package org.neoteric.Rapido;

import org.neoteric.appenum.VehicleTypeEnum;

public class Vehicle {
    public VehicleTypeEnum vehicletype;
    public String vehiclenumber;
    public Insurance insurance;
    public Driver driver;

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicletype=" + vehicletype +
                ", vehiclenumber='" + vehiclenumber + '\'' +
                ", insurance=" + insurance +
                ", driver=" + driver +
                '}';
    }
}
