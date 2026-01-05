package Com.encapsulation.employeemanagement;

class fulltimeemployee extends employee implements department {
    private String department;

    public fulltimeemployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}
