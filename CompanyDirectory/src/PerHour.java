public class PerHour extends Payment{

    @Override
    public String getType() {
        return "PER_HOUR";
    }

    @Override
    public void payAdmin() {
        System.out.println("Paying.PER_HOUR..to--ADMIN");
    }

    @Override
    public void payTech() {
        System.out.println("Paying.PER_HOUR..to--TECH");
    }
}
