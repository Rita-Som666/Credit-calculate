public class CreditPaymentService {
    public double calculate(int loanSum, int years, double percent) {

        double monthlyPercent = percent / 12 / 100;
        int numberOfPayments = years * 12;
        double monthlyPayment = (loanSum * monthlyPercent) /
                (1 - Math.pow(1 + monthlyPercent, -numberOfPayments));
        return (int) monthlyPayment;
    }
}