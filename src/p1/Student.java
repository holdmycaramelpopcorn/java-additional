package p1;

public class Student
{
    String USN;
    String Name;
    String Branch;
    String PhoneNo;

    Student (String usn, String name, String branch, String phno) {
        this.USN = usn;
        this.Name = name;
        this.Branch = branch;
        this.PhoneNo = phno;
    }

    public void printDetails () {
        System.out.println("Name: "+this.Name);
        System.out.println("USN: "+this.USN);
        System.out.println("Branch: "+this.Branch);
        System.out.println("Phone number: "+this.PhoneNo);
    }
}
