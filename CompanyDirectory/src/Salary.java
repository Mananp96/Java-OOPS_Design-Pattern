public class Salary extends Payment{

    @Override
    public String getType() {
        return "SALARY";
    }

    @Override
    public void payAdmin() {
        System.out.println("Paying.SALARY..to--ADMIN");
    }

    @Override
    public void payTech() {
        System.out.println("Paying.SALARY..to--TECH");
    }
}
