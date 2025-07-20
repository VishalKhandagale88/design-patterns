package factorymethod.notification.model;

public class EmailNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email : "+message);
    }
}
