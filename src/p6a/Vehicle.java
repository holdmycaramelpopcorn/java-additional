package p6a;

public class Vehicle {
    int speed;
    String direction;

    Vehicle(int speed, String dir) {
        this.speed = speed;
        this.direction = dir;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getDirection() {
        return this.direction;
    }
}
