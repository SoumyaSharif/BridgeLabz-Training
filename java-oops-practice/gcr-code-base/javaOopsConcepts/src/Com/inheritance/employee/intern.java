package Com.inheritance.employee;

class intern extends employee {
    int durationMonths;

    intern(int id, String name, double salary, int durationMonths) {
        super(id, name, salary);
        this.durationMonths = durationMonths;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + durationMonths + " months");
        System.out.println();
    }
}

