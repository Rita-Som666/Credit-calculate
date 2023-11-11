public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthlyPayment = (int) service.calculate(1000_000, 1, 9.99);
        System.out.println(monthlyPayment);
    }
}