class Employee {
    protected String name;
    protected double basicSalary;
    Employee(String name, double basicSalary) { this.name = name; this.basicSalary = basicSalary; }
    double calculateSalary() { return basicSalary; }
}
class Developer extends Employee {
    private final double projectAllowance;
    Developer(String name, double salary, double allowance) {
        super(name, salary); projectAllowance = allowance;
    }
    @Override double calculateSalary() { return super.calculateSalary() + projectAllowance; }
}
public class EmployeeInheritance {
    public static void main(String[] args) {
        Employee e = new Developer("Riya", 45000, 8000);
        System.out.println("Total salary: " + e.calculateSalary());
    }
}
