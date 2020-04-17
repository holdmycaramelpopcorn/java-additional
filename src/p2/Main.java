package p2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gear, speed, startHeight;
        String color;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of gears in Mountain bike 1");
        gear = input.nextInt();
        System.out.println("Enter current speed of Mountain bike 1");
        speed = input.nextInt();
        System.out.println("Enter start height of Mountain bike 1");
        startHeight = input.nextInt();
        System.out.println("Enter color of Mountain bike 1");
        color = input.next();
        MountainBike mb1 = new MountainBike(startHeight, gear, speed, color);

        System.out.println("Enter number of gears in Mountain bike 2");
        gear = input.nextInt();
        System.out.println("Enter current speed of Mountain bike 2");
        speed = input.nextInt();
        System.out.println("Enter start height of Mountain bike 2");
        startHeight = input.nextInt();
        System.out.println("Enter color of Mountain bike 2");
        color = input.next();
        MountainBike mb2 = new MountainBike(startHeight, gear, speed, color);

        if( (mb1.getColor().equals(mb2.getColor())) && (mb1.getGear()==mb2.getGear()))
        {
            mb1.printDetails();
        }
    }
}