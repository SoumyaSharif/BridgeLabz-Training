package Com.encapsulation.employeemanagement;

class parttimeemployee extends employee {
    private int hoursWorked;
    private double hourlyRate;

    public parttimeemployee(int id, String name, int hours, double rate) {
        super(id, name, 0);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
