package org.example;

import lombok.ToString;

@ToString(callSuper = true)
public class Farm extends AbstractAnimalHome {
    private String animalType;
    private double dailyFoodCost;

    public Farm(String name, String location, double area, String animalType, double dailyFoodCost) {
        super(name, location, area);
        this.animalType = animalType;
        this.dailyFoodCost = dailyFoodCost;
    }

    public double calculateCostPerMonth() {
        return dailyFoodCost * 30; // Припустимо, що місяць складається з 30 днів
    }
}
