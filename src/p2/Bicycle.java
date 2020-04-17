package p2;

public class Bicycle {
    int gear;
    int speed;
    String color;

    Bicycle(int gear, int speed, String color) {
        this.gear = gear;
        this.speed = speed;
        this.color = color;
    }

    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }
    public void sppedUp(int increment) {
        this.speed += increment;
    }
    public String getColor() {
        return this.color;
    }
    public int getGear () {
        return this.gear;
    }
    public void printDetails () {
        System.out.println("Number of gears: "+this.gear);
        System.out.println("Speed of bicycle: "+this.speed);
        System.out.println("Color of bicycle: "+this.color);
    }
}