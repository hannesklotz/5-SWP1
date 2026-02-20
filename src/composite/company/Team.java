package composite.company;

import java.util.ArrayList;
import java.util.List;

public class Team implements OrgUnit {
    private final String name;
    private final List<OrgUnit> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void add(OrgUnit u) {
        // In dieser Aufgabe sollen Teams nur Employees enthalten.
        // Wir speichern trotzdem als OrgUnit (Composite-typisch).
        members.add(u);
    }

    public void remove(OrgUnit u) {
        members.remove(u);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+ Team: " + name);
        for (OrgUnit m : members) {
            m.print(indent + "  ");
        }
    }

    @Override
    public int getEmployeeCount() {
        int sum = 0;
        for (OrgUnit m : members) {
            sum += m.getEmployeeCount();
        }
        return sum;
    }

    @Override
    public double getTotalSalary() {
        double sum = 0;
        for (OrgUnit m : members) {
            sum += m.getTotalSalary();
        }
        return sum;
    }
}