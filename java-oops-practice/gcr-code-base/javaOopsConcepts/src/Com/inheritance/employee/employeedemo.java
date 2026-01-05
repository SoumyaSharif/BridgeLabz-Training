package Com.inheritance.employee;

class employeedemo {
    public static void main(String[] args) {

        employee e1 = new manager(101, "Soumya", 80000, 5);
        employee e2 = new developer(102, "Rahul", 60000, "Java");
        employee e3 = new intern(103, "Anita", 15000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}

