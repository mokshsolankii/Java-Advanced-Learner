abstract class Payment {
    protected final double amount;
    Payment(double amount) { this.amount = amount; }
    abstract void pay();
    void receipt() { System.out.println("Receipt amount: " + amount); }
}
class UpiPayment extends Payment {
    UpiPayment(double amount) { super(amount); }
    @Override void pay() { System.out.println("Paid " + amount + " using UPI"); }
}
public class AbstractPayment {
    public static void main(String[] args) {
        Payment payment = new UpiPayment(1250);
        payment.pay(); payment.receipt();
    }
}
