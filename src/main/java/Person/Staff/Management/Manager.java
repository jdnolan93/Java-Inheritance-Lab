package Person.Staff.Management;
import Person.Staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, double salary, int niNumber, String deptName) {
        super(name, salary, niNumber);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


}
