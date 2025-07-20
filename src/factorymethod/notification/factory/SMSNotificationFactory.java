package factorymethod.notification.factory;

import factorymethod.notification.model.Notification;
import factorymethod.notification.model.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
