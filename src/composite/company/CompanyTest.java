package composite.company;

public class CompanyTest {
    public static void main(String[] args) {

        // Company Root
        Department company = new Department("Company");

        // IT Department
        Department it = new Department("IT");

        Team backend = new Team("Backend");
        backend.add(new Employee("Alice", "Backend Dev", 52000));
        backend.add(new Employee("Bob", "Backend Dev", 50000));

        Team frontend = new Team("Frontend");
        frontend.add(new Employee("Clara", "Frontend Dev", 48000));
        frontend.add(new Employee("David", "Frontend Dev", 47000));

        Department security = new Department("Security");
        Team soc = new Team("SOC");
        soc.add(new Employee("Eve", "Security Analyst", 55000));
        security.add(soc);

        it.add(backend);
        it.add(frontend);
        it.add(security);

        // HR Department
        Department hr = new Department("HR");
        Team recruiting = new Team("Recruiting");
        recruiting.add(new Employee("Frank", "Recruiter", 42000));
        hr.add(recruiting);

        // Build company tree
        company.add(it);
        company.add(hr);

        // 1) Struktur ausgeben
        System.out.println("=== Firmenstruktur ===");
        company.print("");

        // 2) Gesamtanzahl Mitarbeiter
        System.out.println("\n=== Kennzahlen ===");
        System.out.println("Mitarbeiter gesamt: " + company.getEmployeeCount());

        // 3) Gehaltssumme
        System.out.printf("Gehaltssumme gesamt: %.2f EUR%n", company.getTotalSalary());

        // 4) Suche
        System.out.println("\n=== Suche ===");
        OrgUnit found = company.findByName("Security");
        if (found != null) {
            System.out.println("Gefunden: " + found.getName());
            System.out.println("Ausgabe des gefundenen Elements:");
            found.print("  ");
        } else {
            System.out.println("Nicht gefunden.");
        }

        // 5) Budgetcheck
        System.out.println("\n=== Budgetcheck ===");
        double itBudget = 260000;
        System.out.printf("IT Budget: %.2f EUR%n", itBudget);
        System.out.printf("IT Gehaltssumme: %.2f EUR%n", it.getTotalSalary());
        System.out.println("IT innerhalb Budget? " + it.isWithinBudget(itBudget));
    }
}