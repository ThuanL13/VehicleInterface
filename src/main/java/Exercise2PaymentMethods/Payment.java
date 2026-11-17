package Exercise2PaymentMethods;

public class Payment {
    interface Pay {
        void pay(double amount);
    }
    static class CreditCard implements Pay {
        public void pay(double amount) {
            System.out.println("Paid $" + amount + " with credit card.");
        }
    }
    static class PayPal implements Pay {
        public void pay(double amount) {
            System.out.println("Paid $" + amount + " through PayPal!");
        }
    }
    static class Cash implements Pay {
        public void pay(double amount) {
            System.out.println("Paid $" + amount + " with cash.");
        }
    }
}
