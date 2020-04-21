package p6a;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int speed;
        String dir;

        System.out.println("Speed of Vehicle 1");
        speed = input.nextInt();
        System.out.println("Direction (North, South, East or West)");
        dir = input.next();
        Vehicle vehicle1 = new Vehicle(speed, dir);

        System.out.println("Speed of Vehicle 2");
        speed = input.nextInt();
        System.out.println("Direction (North, South, East or West)");
        dir = input.next();
        Vehicle vehicle2 = new Vehicle(speed, dir);

        try{
            if(vehicle1.getDirection().equalsIgnoreCase(vehicle2.getDirection())) {
                System.out.println("Safe.");
            }
            else{
                throw new VehicleCollisionException();
            }
        }
        catch(VehicleCollisionException vce) {
            vce.printStackTrace();
        }
    }
}
