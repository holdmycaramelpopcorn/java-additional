package p1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = input.nextInt();
        Student[] students = new Student[n];
        String name, usn, branch, phno;

        for(int i=0;i<n;i++) {
            System.out.println("Enter Name of Student "+(i+1));
            name = input.next();
            System.out.println("Enter USN of Student "+(i+1));
            usn = input.next();
            System.out.println("Enter Branch of Student "+(i+1));
            branch = input.next();
            System.out.println("Enter Phone Number of Student "+(i+1));
            phno = input.next();

            students[i] = new Student(usn, name, branch, phno);
        }

        System.out.println("Details of students are: ");
        for(int i=0;i<n;i++) {
            System.out.println("Student "+(i+1));
            students[i].printDetails();
        }
    }
}