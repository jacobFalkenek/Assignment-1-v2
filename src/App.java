import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the employee: ");
        String name = scanner.nextLine();

        System.out.println("Enter hourly rate of the employee: ");
        int hourlyRate = scanner.nextInt();

        System.out.println("Enter hours worked by the employee: ");
        int hours = scanner.nextInt();

        PaymentSlip paymentSlip = new PaymentSlip(name, hourlyRate, hours);

        int salaryBeforeTax = paymentSlip.calculateSalary();
        double salaryAfterTax = paymentSlip.calculateNetSalary();

        System.out.println("\n");
        System.out.println("--------------------");
        System.out.println("## PAYMENT INFORMATION ##");
        System.out.println("Name: \t\t\t" + paymentSlip.getName());
        System.out.println("Hourly rate: \t\t$" + paymentSlip.getHourlyRate());
        System.out.println("Hours worked: \t\t$" + paymentSlip.getHours());
        System.out.println("");
        System.out.println("Salary before tax: \t$" + salaryBeforeTax);
        System.out.println("Salary after tax: \t$" + salaryAfterTax);
        System.out.println("");
        System.out.println("If you have any questions regarding your salary, contact Bob");
        System.out.println("--------------------");
        System.out.println("\n");
        
        scanner.close();
    }
}
