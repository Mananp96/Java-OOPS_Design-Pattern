public class Tech extends Employee {

    Tech(String s) {
        super(s);
    }

    @Override
    public void calSalary() {
        //some calculations and then pay
        payment.payTech();
    }

    @Override
    public String getEmpType() {
        return "TECH";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' + "," +
                "type='" + this.getEmpType() + '\'' + "," +
                "paymentType='" + this.getPayType() + '\'' + "," +
                '}';
    }
}
