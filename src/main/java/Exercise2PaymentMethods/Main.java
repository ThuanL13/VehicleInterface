package Exercise2PaymentMethods;

public class Main {
    public static void main(String[] args) {
        Payment.Pay creditCard = new Payment.CreditCard();
        Payment.Pay payPal = new Payment.PayPal();
        Payment.Pay cash = new Payment.Cash();

        creditCard.pay(5000);
        payPal.pay(500);
        cash.pay(250);
    }
}
