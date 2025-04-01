package JavaBasic.InterfacesAndAbstract.Employee;

abstract class Employee {
    String name;
    double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    abstract void displayDetails();
}
