package Com.objectmodelling.companyanddepartments;

import java.util.ArrayList;

class company {
    String companyName;
    ArrayList<department> departments;

    company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        departments.add(new department(deptName));
    }

    void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (department d : departments) {
            d.showEmployees();
        }
        System.out.println();
    }
}
