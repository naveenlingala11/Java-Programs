package JavaBasic.InterfacesAndAbstract.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee manager = new Manager("naveen",2500);
        manager.displayDetails();
        Employee clerk = new Clerk("Naveen", 3000);
        clerk.displayDetails();
    }
}
