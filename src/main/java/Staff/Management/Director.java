package Staff.Management;

public class Director extends Manager {
    private double budget;

    public Director(String name, double salary, int niNumber, String deptName, double budget){
        super(name, salary, niNumber, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
