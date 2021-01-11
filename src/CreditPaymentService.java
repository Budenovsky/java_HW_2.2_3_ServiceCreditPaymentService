public class CreditPaymentService {
    public double calculate(double creditAmount, double creditTerm) {
        double interestRate = 9.99;
        double monthlyInterestRate = interestRate / 100 / 12;
        double onePlusMonthlyInterestRate = 1 + monthlyInterestRate;
        double exponentiation = Math.pow(onePlusMonthlyInterestRate, creditTerm);
        double dividend = monthlyInterestRate * exponentiation;
        double divisor = exponentiation - 1;
        double monthlyPaymentFractional = creditAmount * dividend / divisor;
        int monthlyPayment = (int) monthlyPaymentFractional;
        return monthlyPayment;
    }
}

// за основу была взята "формула расчета аннуитета вручную" с сайта Райффайзен Банка