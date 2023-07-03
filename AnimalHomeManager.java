package org.example;

import java.util.ArrayList;
import java.util.List;

public class AnimalHomeManager {
    public static void main(String[] args) {
        List<AbstractAnimalHome> animalHomes = new ArrayList<>();
        animalHomes.add(new Zoo("Kyiv Zoo", "Kyiv", 92, 3292, "9:00 - 18:00", 5000));
        animalHomes.add(new Farm("Cattle Farm", "Rural Area", 500, "Cattle", 1000));
        animalHomes.add(new Farm("Poultry Farm", "Rural Area", 300, "Poultry", 500));

        for (AbstractAnimalHome animalHome : animalHomes) {
            System.out.println(animalHome);
        }
    }
}
