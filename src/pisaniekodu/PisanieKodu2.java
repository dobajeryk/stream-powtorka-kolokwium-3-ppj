package pisaniekodu;

public class PisanieKodu2 {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(1, 50);
        MountainBike mountainBike = new MountainBike(5, 100, 4.0);

        bicycle.applyBrake(10);
        System.out.println(bicycle);

        mountainBike.applyBrake(10);
        System.out.println(mountainBike);
    }
}

// Rozwiązanie z dziedziczeniem

class Bicycle {
    private int numberOfGears;
    private int speed;

    public Bicycle(int numberOfGears, int speed) {
        this.numberOfGears = numberOfGears;
        this.speed = speed;
    }

    public void applyBrake(int value) {
        this.speed -= value;
    }

    public String toString() {
        return "Number of gears are " + numberOfGears + "\n" +
                "speed of bicycle " + speed;
    }
}

class MountainBike extends Bicycle {
    private double seatHigh;

    public MountainBike(int numberOfGears, int speed, double seatHigh) {
        super(numberOfGears, speed);
        this.seatHigh = seatHigh;
    }

    public String toString() {
        return super.toString() + "\nseat hight is " + (int) seatHigh;
    }
}

// Rozwiązanie bez dziedziczenia

//class Bicycle {
//    private final int gears;
//    private int speed;
//
//    public Bicycle(int gears, int speed) {
//        this.gears = gears;
//        this.speed = speed;
//    }
//
//    protected void applyBrake(int brake) {
//        this.speed -= brake;
//    }
//
//    @Override
//    public String toString() {
//        return "Number of gears are " + gears + "\n" +
//                "speed of bicycle is " + speed;
//    }
//}
//
//class MountainBike extends Bicycle {
//    private double height;
//
//    public MountainBike(int gears, int speed, double height) {
//        super(gears, speed);
//        this.height = height;
//    }
//
//    @Override
//    protected void applyBrake(int brake) {
//        super.applyBrake(brake);
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "\n" +
//                "seat height is " + (int) (height);
//    }
//}
