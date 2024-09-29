package org.neoteric.Rapido;

import javax.management.StringValueExp;

public class Driver {
    public String name;
    public String licence;
    public String mobilenumber;
    public Vehicle vehicle;
    public Insurance insurance;

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licence='" + licence + '\'' +
                ", mobilenumber='" + mobilenumber + '\'' +
                ", vehicle=" + vehicle +
                ", insurance=" + insurance +
                '}';
    }
}
