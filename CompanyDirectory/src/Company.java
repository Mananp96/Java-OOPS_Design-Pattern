import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Company{

    Company() {}

    List<Employee> allEmployees = new ArrayList<Employee>();

    public void setEmployee(Employee e, int a) {
        if(!allEmployees.contains((e))) {
            allEmployees.add(e);
        }
    }

    public void printAll() {
        for( Employee e : this.allEmployees) {
            System.out.println(e.getName());
        }
    }

    public List<Employee> getAllEmployee() {
        return this.allEmployees;
    }

    public Employee getEmployeeByName(String s) {
        Employee employee = allEmployees.stream()
                .filter(e -> s.equals(e.getName()))
                .findAny()
                .orElse(null);

        return employee;
    }

    public List<Employee> getEmployeesByType(String empType) {
        List<Employee> employees = allEmployees.stream()
                .filter(e -> empType.equals(e.getEmpType()))
                .collect(Collectors.toList());

        return employees;
    }
}
