package Person.Staff;

public abstract class Employee extends Person.Person {
    private double salary;

    public Employee(String name, double salary, int niNumber){
        super(name, niNumber);
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
