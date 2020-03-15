public class Administrator extends Employee {

    Administrator(String s) {
        super(s);
    }

    @Override
    public void calSalary() {
        //some calculations and then pay
        payment.payAdmin();
    }

    @Override
    public String getEmpType() {
        return "ADMIN";
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
