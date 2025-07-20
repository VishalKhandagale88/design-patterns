package factorymethod.notification.factory;

import factorymethod.notification.model.Notification;

public abstract class NotificationFactory {
    public abstract Notification createNotification();
}
