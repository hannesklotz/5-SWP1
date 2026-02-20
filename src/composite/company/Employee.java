package composite.company;

public class Employee implements OrgUnit {
    private final String name;
    private final String role;
    private final double salary;

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print(String indent) {
        System.out.printf("%s- %s (%s), %.2f EUR%n", indent, name, role, salary);
    }

    @Override
    public int getEmployeeCount() {
        return 1;
    }

    @Override
    public double getTotalSalary() {
        return salary;
    }
}