package ua.lviv.iot.algo.lab1.Zoo;


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
        Zoo[] ZooArray = {
        new Zoo(),
        new Zoo("Kyiv Zoo", "Kyiv",  92 ,  3292),
        getInstance(),
        getInstance()
        };
        for(Zoo zoo :zooArray){
        System.out.println(zoo);
        }
      }
    }
}
