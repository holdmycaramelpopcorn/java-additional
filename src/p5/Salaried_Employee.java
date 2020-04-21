package p5;

public class Salaried_Employee extends Employee {

    Salaried_Employee(String name, String empid, long salary) {
        super(name, empid);
        super.salary = salary;
    }

    public long getSalary() {
        return salary;
    }
}