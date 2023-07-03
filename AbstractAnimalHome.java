package org.example;

import lombok.ToString;
import java.util.ArrayList;
import java.util.List;

@ToString
public abstract class AbstractAnimalHome {
    private String name;
    private String location;
    private double area;

    public AbstractAnimalHome(String name, String location, double area) {
        this.name = name;
        this.location = location;
        this.area = area;
    }

    public abstract double calculateCostPerMonth();
}

