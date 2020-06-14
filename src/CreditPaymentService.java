public class CreditPaymentService {

    public double creditPayment (double percent, int term, long summ){
        double monthRate = percent/(12*100);
        double a = Math.pow(1+monthRate, 12*term);
        double annuitetCoef = (monthRate * a/(a - 1));
        double paymentAnnuitetPayment = annuitetCoef * summ;
        return  paymentAnnuitetPayment;
    }

}
