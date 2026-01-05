package Com.objectmodelling.companyanddepartments;

class employee {
    String name;
    int empId;

    employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    void showEmployee() {
        System.out.println("Employee ID: " + empId + ", Name: " + name);
    }
}

