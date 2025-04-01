package JavaBasic.Inheritance.Person;

public class Employee extends Person{
    double salary;

    public Employee(String name, double salary){
        super(name);
        this.salary = salary;
    }
    public void display(){
        System.out.println("Employee name: "+name+" salary is "+salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("naveen", 30000);
        e.display();
    }
}
