package Com.encapsulation.employeemanagement;

class employeetest {
    public static void main(String[] args) {
        employee[] employees = {
            new fulltimeemployee(1, "Aman", 50000),
             new parttimeemployee(2, "Riya", 40, 500)
        };

        for (employee e : employees) {
            e.displayDetails();
        }
    }
}
