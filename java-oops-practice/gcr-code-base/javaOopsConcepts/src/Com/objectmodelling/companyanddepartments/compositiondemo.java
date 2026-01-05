package Com.objectmodelling.companyanddepartments;

class compositiondemo {
    public static void main(String[] args) {

        company comp = new company("Tech Solutions");

        comp.addDepartment("IT");
        comp.addDepartment("HR");

        comp.departments.get(0).addEmployee(101, "Soumya");
        comp.departments.get(0).addEmployee(102, "Rahul");

        comp.departments.get(1).addEmployee(201, "Anita");

        comp.showCompanyDetails();

        // Composition concept:
        comp = null;  // Company deleted
        System.out.println("Company deleted, departments and employees removed.");
    }
}
