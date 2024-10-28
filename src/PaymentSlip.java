public class PaymentSlip {
    private String name;
    private int hourlyRate;
    private int hours;
    
    private static final double TAX_RATE = 0.3;

    public PaymentSlip() {
    }
    public PaymentSlip(String name, int hourlyRate, int hours) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public int calculateSalary() {
        return hourlyRate * hours;
    }
    public double calculateNetSalary() {
        return calculateSalary() * (1 - TAX_RATE);
    }
}
