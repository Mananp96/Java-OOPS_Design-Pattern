public class Employee {
    String name;

    Payment payment;

    Employee(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public String getPayType() {
        return payment.getType();
    }

    public void calSalary() {

    }

    public String getEmpType() {
        return "NONE";
    }

    public void setPayment(Payment p) {
        payment = p;
    }

}
