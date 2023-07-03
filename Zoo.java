package org.example;

import lombok.ToString;

@ToString(callSuper = true)
public class Zoo extends AbstractAnimalHome {
    private int capacity;
    private String workingHours;
    private double dailyCost;

    public Zoo(String name, String location, double area, int capacity, String workingHours, double dailyCost) {
        super(name, location, area);
        this.capacity = capacity;
        this.workingHours = workingHours;
        this.dailyCost = dailyCost;
    }

    public double calculateCostPerMonth() {
        return dailyCost * 30; // Припустимо, що місяць складається з 30 днів
    }
}
