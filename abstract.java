// Abstract class
abstract class Payment {
    protected double amount;
    Payment(double amount) {
        this.amount = amount;
    }
    // Abstract method
    abstract void pay();
    // Normal method
    void receipt() {
        System.out.println("Receipt Generated");
        System.out.println("Amount Paid: " + amount);
    }
    // Normal method
    void showPaymentStatus() {
        System.out.println("Payment Successful");
    }
}
// UPI Payment class
class UpiPayment extends Payment {
    private String upiID;
    UpiPayment(double amount, String upiID) {
        super(amount);
        this.upiID = upiID;
    }
    @Override
    void pay() {
        System.out.println("Processing UPI Payment...");
        System.out.println("UPI ID: " + upiID);
    }
}
// Card Payment class
class CardPayment extends Payment {
    private String cardNumber;
    CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }
    @Override
    void pay() {
        System.out.println("Processing Card Payment...");
        System.out.println("Card Number: **** **** **** " +
                cardNumber.substring(cardNumber.length() - 4));
    }
}
// Main class
public class Main {
    public static void main(String[] args) {
        Payment p1 = new UpiPayment(550.75, "deepa@oksbi");
        Payment p2 = new CardPayment(1230.12, "1234567887654321");
        p1.pay();
        p1.receipt();
        p1.showPaymentStatus();
        System.out.println();
        p2.pay();
        p2.receipt();
        p2.showPaymentStatus();
    }
}
