package Task02;

public class Employee {
    int id;
    String name;
    int salary;
    String Department;
    Employee(int id, String name, int salary , String Department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.Department = Department;
    }
    Employee (Employee e) {
        this.id = e.id;
        this.name = e.name;
        this.salary = e.salary;
        this.Department = e.Department;
    }
    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Salary: " + salary + " Department: " + Department);
    }
}
class MAIN {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Ali", 50000 , "Web Developers");
        Employee e2 = new Employee(e1);
        e2.name = "Sara";
        e2.id = 102;
        System.out.println("Original Employee:");
        e1.display();
        System.out.println("Copied Employee:");
        e2.display();
    }
}