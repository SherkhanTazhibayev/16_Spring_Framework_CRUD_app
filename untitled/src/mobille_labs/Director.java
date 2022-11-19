package mobille_labs;

public class Director extends Manager {
    private double budget;
    public Director(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
    }
    public double getBudget() {
        return budget;
    }
}
