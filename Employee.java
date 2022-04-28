/**
 * Employee
 */
public class Employee {

    int rollno;
    String name;
    double experiance;
    String branch;
    public static void main(String[] args) {
        Employee s1= new Employee(101, "VENKAT", 6.5, "mech");
        Employee S2= new Employee(102, "vijay", 4.5, "civil");
    }
    Employee(int x, String y, double z, String b){
        rollno=x;
        name=y;
        experiance=z;
        branch=b;
        System.out.println("Name: "+name+" Rollno: "+rollno+" Experiance: "+experiance+" Branch: "+branch);
    }
    public Employee(String ename, String erole, double esalary, String dob, double exp) {
    }
}