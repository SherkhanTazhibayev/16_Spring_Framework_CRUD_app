package mobille_labs;

public class Manager extends Employee {
    String deptName;

    public Manager(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
    }
    public String getDeptName() {

        return deptName;
    }
}
