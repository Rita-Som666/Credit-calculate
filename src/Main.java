public class Main {
    public static void main(String[] args) {
CreditPaymentService service = new CreditPaymentService();
double monthlyPayment = (int) service.calculate(1000_000, 12, 9.99);
System.out.println(monthlyPayment);
    }
}