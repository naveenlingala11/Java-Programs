package JavaBasic.InterfacesAndAbstract.Employee;

public class Clerk extends Employee{

    public Clerk(String name, double salary){
        super(name, salary);
    }

    @Override
    void displayDetails(){
        System.out.println("Clerk: " + name + " | Salary: $" + salary);
    }
}
