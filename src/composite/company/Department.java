package composite.company;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrgUnit {
    private final String name;
    private final List<OrgUnit> units = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(OrgUnit u) {
        units.add(u);
    }

    public void remove(OrgUnit u) {
        units.remove(u);
    }

    public OrgUnit findByName(String searchName) {
        // 1) eigenes Element prüfen
        if (this.name.equalsIgnoreCase(searchName)) {
            return this;
        }

        // 2) Kinder durchsuchen
        for (OrgUnit u : units) {
            if (u.getName().equalsIgnoreCase(searchName)) {
                return u;
            }
            // 3) Rekursiv: nur Departments können weiter in die Tiefe suchen
            if (u instanceof Department) {
                Department dep = (Department) u;
                OrgUnit found = dep.findByName(searchName);
                if (found != null) return found;
            }
        }
        return null;
    }

    public boolean isWithinBudget(double budget) {
        return getTotalSalary() <= budget;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "# Department: " + name);
        for (OrgUnit u : units) {
            u.print(indent + "  ");
        }
    }

    @Override
    public int getEmployeeCount() {
        int sum = 0;
        for (OrgUnit u : units) {
            sum += u.getEmployeeCount();
        }
        return sum;
    }

    @Override
    public double getTotalSalary() {
        double sum = 0;
        for (OrgUnit u : units) {
            sum += u.getTotalSalary();
        }
        return sum;
    }
}