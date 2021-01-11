public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPaymentFor12 = service.calculate(1_000_000, 12);
        System.out.println(monthlyPaymentFor12);

        double monthlyPaymentFor24 = service.calculate(1_000_000, 24);
        System.out.println(monthlyPaymentFor24);

        double monthlyPaymentFor36 = service.calculate(1_000_000, 36);
        System.out.println(monthlyPaymentFor36);
    }
}