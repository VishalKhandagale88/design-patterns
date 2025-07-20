package factorymethod.notification.factory;

import factorymethod.notification.model.EmailNotification;
import factorymethod.notification.model.Notification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();

    }
}
