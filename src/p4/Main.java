package p4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Stack Size");
        int size = input.nextInt();
        Stack stack = new Stack(size);
        Boolean choice = true;
        int option;
        while(choice) {
            System.out.println("MENU\n1. Push\n2. Pop\n3. Display elements\n4. Exit\nEnter option.");
            option = input.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Enter element to push onto stack");
                    stack.push(input.nextInt());
                    System.out.println("Completed.");
                    break;
                case 2:
                    if(stack.pop()!=-1)
                    System.out.print("Popped element: "+stack.pop());
                    break;
                case 3:
                    System.out.println("Status");
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    choice = false;
                    break;
                default:
                    System.out.println("Wrong choice.");
                    break;
            }
        }
        System.out.println("End of Demonstration");
    }
}