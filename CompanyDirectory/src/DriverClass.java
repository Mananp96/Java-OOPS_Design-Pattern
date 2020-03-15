public class DriverClass {

    public static void main(String[] args) {
        Company company = new Company();
        company.setEmployee(new Administrator("John"), 0);
        company.setEmployee(new Administrator("Smith"), 0);
        company.setEmployee(new Tech("User1"), 1);
        company.setEmployee(new Tech("User2"), 1);

        System.out.println("List of All Employees");
        company.printAll();

        Employee e1 = company.getEmployeeByName("John");
        e1.setPayment(new Salary());
        System.out.println(e1.toString());
        e1.calSalary();

        System.out.println();

        Employee e2 = company.getEmployeeByName("User1");
        e2.setPayment(new PerHour());
        System.out.println(e2.toString());
        e2.calSalary();
    }
}
