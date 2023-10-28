//Vishakha Sarode SE IT 27069


interface Vehicles {
    public void gearChange();

    public void speedUp();

    public void applyBrakes();
}

class Bicycle implements Vehicles {
    public void gearChange() {
        System.out.println("Bicycle has 21 gears: 3 front and 7 rear");
    }

    public void speedUp() {
        System.out.println("Bicycle can go up to 14.2 mph or more");
    }

    public void applyBrakes() {
        System.out.println("It has 2 disc brakes, one on the rear and one on the front.");
    }
}

class Bike implements Vehicles {
    public void gearChange() {
        System.out.println("Bike has 5 gears");
    }

    public void speedUp() {
        System.out.println("Bike can reach speeds of 120 km/h or more");
    }

    public void applyBrakes() {
        System.out.println("It has 2 disc brakes, one on the rear and one on the front.");
    }
}

class Car implements Vehicles {
    public void gearChange() {
        System.out.println("Car has 6 gears: 5 forward gears and 1 reverse gear");
    }

    public void speedUp() {
        System.out.println("Car can reach speeds of 200 km/h or more");
    }

    public void applyBrakes() {
        System.out.println("It has 4 disc brakes: 2 on the rear and 2 on the front.");
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        System.out.println("Bicycle:");
        bicycle.gearChange();
        bicycle.speedUp();
        bicycle.applyBrakes();

        Bike bike = new Bike();
        System.out.println("\nBike:");
        bike.gearChange();
        bike.speedUp();
        bike.applyBrakes();

        Car car = new Car();
        System.out.println("\nCar:");
        car.gearChange();
        car.speedUp();
        car.applyBrakes();
    }
}
