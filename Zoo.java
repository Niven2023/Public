package org.example;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Zoo {
    private String name;
    private String location;
    private double area;
    private int capacity;
    private static Zoo instance = new Zoo();
    public static Zoo getInstance() {
        return instance;
    }
    public void increaseCapacity(int count) {
        this.capacity += count;
    }

    public void splitArea() {
        this.area /= 2;
    }

    public void addNewRegion(double area) {
        this.area += area;
    }

    public static void main(String[] args) {
        Zoo[] ZooArray = new Zoo[4];
        ZooArray[0] = new Zoo();
        ZooArray[1] = new Zoo("Kyiv Zoo", "Kyiv",  92 ,  3292);
        ZooArray[2] = getInstance();
        ZooArray[3] = getInstance();
        System.out.println(ZooArray[1]);
    }
}