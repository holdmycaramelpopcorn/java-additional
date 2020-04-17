package p2;

public class MountainBike extends Bicycle {
    int height;

    MountainBike(int startHeight, int gear, int speed, String color) {
        super(gear, speed, color);
        this.height = startHeight;
    }

    public void setHeight (int newValue) {
        this.height = newValue;
    }
}