package composite.company;

public interface OrgUnit {
    String getName();
    void print(String indent);
    int getEmployeeCount();
    double getTotalSalary();
}
