public class Main {

    public static void main(String[] args) {
	CreditPaymentService creditPaymentService = new CreditPaymentService();
        System.out.printf("%.0f", creditPaymentService.creditPayment(9.99, 3, 1000000));

    }
}
