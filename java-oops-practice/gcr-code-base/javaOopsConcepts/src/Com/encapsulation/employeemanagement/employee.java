package Com.encapsulation.employeemanagement;

abstract class employee {
    private int employeeId;
    private String name;
    protected double baseSalary;

    public employee(int id, String name, double baseSalary) {
        this.employeeId = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println(employeeId + " " + name + " Salary: " + calculateSalary());
    }
}
