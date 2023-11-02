public class CreditPaymentService {
    public double calculate(int loanSum, int numberOfPayments, double percent) {
        double monthlyPercent = percent/12/100;
        double monthlyPayment;
        monthlyPayment = (loanSum * (monthlyPercent * (Math.pow((1 + monthlyPercent), numberOfPayments)) / (Math.pow((1+monthlyPercent), numberOfPayments))));
        return monthlyPayment;


    }
}
