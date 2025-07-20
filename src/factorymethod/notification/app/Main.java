package factorymethod.notification.app;

import factorymethod.notification.factory.EmailNotificationFactory;
import factorymethod.notification.factory.NotificationFactory;
import factorymethod.notification.factory.PushNotificationFactory;
import factorymethod.notification.factory.SMSNotificationFactory;
import factorymethod.notification.model.Notification;

public class Main {
    public static void main(String[] args) {
        NotificationFactory emaNotificationFactory = new EmailNotificationFactory();
        Notification email = emaNotificationFactory.createNotification();
        email.sendMessage("Hello");

        NotificationFactory pushNotificationFactory = new PushNotificationFactory();
        Notification push = pushNotificationFactory.createNotification();
        push.sendMessage("Hello");

        NotificationFactory smsNotificationFactory = new SMSNotificationFactory();
        Notification sms = smsNotificationFactory.createNotification();
        sms.sendMessage("Hello");
    }
}
