package p5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, empid;

        System.out.println("Enter Salaried Employee details: ");
        System.out.println("Name: ");
        name = input.next();
        System.out.println("Employee ID: ");
        empid = input.next();
        System.out.println("Salary: ");
        Salaried_Employee salaried_employee = new Salaried_Employee(name, empid, input.nextLong());
        System.out.println("The salary for the employee is "+salaried_employee.getSalary());


        System.out.println("Enter Commission Employee details: ");
        System.out.println("Name: ");
        name = input.next();
        System.out.println("Employee ID: ");
        empid = input.next();
        System.out.println("Sales: ");
        Commission_Employee commission_employee = new Commission_Employee(name, empid, input.nextLong());
        System.out.println("The salary for the commission employee is "+commission_employee.getSalary());


        System.out.println("Enter Base + Commission Employee details: ");
        System.out.println("Name: ");
        name = input.next();
        System.out.println("Employee ID: ");
        empid = input.next();
        System.out.println("Base salary: ");
        long base = input.nextLong();
        System.out.println("Sales: ");
        BplusC_Employee bplusC_employee = new BplusC_Employee(name, empid, base, input.nextLong());
        System.out.println("The salary for the Base plus Commission employee is "+bplusC_employee.getSalary());
    }
}