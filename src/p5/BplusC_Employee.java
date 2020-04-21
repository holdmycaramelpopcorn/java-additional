package p5;

public class BplusC_Employee extends Employee {

    final double sales_cut = 0.60;
    BplusC_Employee(String name, String empid, long base, long sales) {
        super(name, empid);
        this.salary =(long) (base + sales* (sales_cut));
    }

    public long getSalary() {
        return salary;
    }
}