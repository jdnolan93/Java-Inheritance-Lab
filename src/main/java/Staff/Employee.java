package Staff;

public abstract class Employee {
    private String name;
    private double salary;
    private int niNumber;

    public Employee(String name, double salary, int niNumber){
        this.name = name;
        this.salary = salary;
        this.niNumber = niNumber;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public void setName(String name) {
        if (name != null){
            this.name = name;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setNiNumber(int niNumber) {
        this.niNumber = niNumber;
    }

    public void raiseSalary(double amount) {
        if (amount >= 0) {
            this.salary += amount;
        }
    }
    public void payBonus(){
        this.salary *= 1.01;
    }
}
