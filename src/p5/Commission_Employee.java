package p5;
public class Commission_Employee extends Employee {

    final double sales_cut = 0.60;
    Commission_Employee(String name, String empid, long sales) {
        super(name, empid);
        this.salary = (long) (sales * sales_cut);
    }

    public long getSalary() {
        return salary;
    }
}
