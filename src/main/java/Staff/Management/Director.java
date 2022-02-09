package Staff.Management;

public class Director extends Manager {
    private double budget;
    private double salary;

    public Director(String name, double salary, int niNumber, String deptName, double budget){
        super(name, salary, niNumber, deptName);
        this.budget = budget;
        this.salary = salary;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void raiseSalary(double amount){
        this.salary += amount;
    }

    public double getSalary(){
        return salary;
    }
    
    public void payBonus(){
        this.salary *= 1.02;
    }
}
