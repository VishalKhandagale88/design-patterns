package factorymethod.notification.factory;

import factorymethod.notification.model.Notification;
import factorymethod.notification.model.PushNotification;

public class PushNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
