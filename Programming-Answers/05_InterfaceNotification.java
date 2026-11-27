interface Notification {
    void send(String message);
}
class EmailNotification implements Notification {
    public void send(String message) { System.out.println("Email: " + message); }
}
class SmsNotification implements Notification {
    public void send(String message) { System.out.println("SMS: " + message); }
}
public class InterfaceNotification {
    public static void main(String[] args) {
        Notification[] services = { new EmailNotification(), new SmsNotification() };
        for (Notification service : services) service.send("Assignment submitted");
    }
}
