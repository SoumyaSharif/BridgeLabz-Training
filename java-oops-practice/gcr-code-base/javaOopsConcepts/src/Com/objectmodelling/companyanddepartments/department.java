package Com.objectmodelling.companyanddepartments;

import java.util.ArrayList;

class department {
    String deptName;
    ArrayList<employee> employees;

    department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(int empId, String name) {
        employees.add(new employee(empId, name));
    }

    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (employee e : employees) {
            e.showEmployee();
        }
    }
}

