public interface Vehicle {
    void gearChange(int x);
    void speedIncrease();
    void brakes(int x);
}

class Bike implements Vehicle {
    private int speed;
    private int gear;

    public void gearChange(int x) {
        gear = x;
        System.out.println("Gear changed to " + gear);
    }

    public void speedIncrease() {
        speed += 10;
        System.out.println("Speed increased to " + speed);
    }

    public void brakes(int x) {
        speed -= x;
        System.out.println("Brakes applied. Speed reduced to " + speed);
    }

    public void printStatus() {
        System.out.println("Bike speed: " + speed + ", Bike gear: " + gear);
    }
}

class Car implements Vehicle {
    private int speed;
    private int gear;

    public void gearChange(int x) {
        gear = x;
        System.out.println("Gear changed to " + gear);
    }

    public void speedIncrease() {
        speed += 20;
        System.out.println("Speed increased to " + speed);
    }

    public void brakes(int x) {
        speed -= x;
        System.out.println("Brakes applied. Speed reduced to " + speed);
    }

    public void printStatus() {
        System.out.println("Car speed: " + speed + ", Car gear: " + gear);
    }
}

public classMain {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.gearChange(1);
        bike.speedIncrease();
        bike.speedIncrease();
        bike.brakes(5);
        bike.printStatus();

        Car car = new Car();
        car.gearChange(2);
        car.speedIncrease();
        car.speedIncrease();
        car.brakes(10);
        car.printStatus();
    }
}
