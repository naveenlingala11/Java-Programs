package JavaBasic.InterfacesAndAbstract.Employee;

public class Manager extends Employee{

    public Manager(String name, double salary){
        super(name, salary);

    }

    @Override
    void displayDetails() {
        System.out.println("Manager: " + name + " | Salary: $" + salary);
    }
}
