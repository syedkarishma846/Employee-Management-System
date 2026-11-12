abstract class Employee{
    String name;
    int empid;
    private double salary;
    Employee(String name,int empid,double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }
    double getSalary() {
        return salary;
    }
    abstract void calculateSalary();
}
class FullTimeEmployee extends Employee{
    FullTimeEmployee(String name, int empid, double salary) {
        super(name,empid,salary);
    }
    void calculateSalary() {
        System.out.println("Full Time Employee");
        System.out.println("Name: " + name);
        System.out.println("employee ID: " +  empid);
        System.out.println("Salary: " + getSalary());
    }
}
class PartTimeEmployee extends Employee {
    int hours;
    PartTimeEmployee(String name,int empid,double salary,int hours) {
        super(name,empid,salary);
        this.hours = hours;
    }
    void calculateSalary() {
        System.out.println("Part Time Employee");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Salary: " + (getSalary() * hours));
    }
}        
        public class EmployeeManagement{
            public static void main(String[] args) {
                Employee e1 = new FullTimeEmployee("Ravi",101, 25000);
                Employee e2 = new 
        PartTimeEmployee("Raju",102,200,5); 
                e1.calculateSalary();
                System.out.println();
                e2.calculateSalary();        
            }
        }
    
