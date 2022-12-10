package ui;

import model.Notification;
import model.Notification.NotificationFactory;

public class NotificationMain {
  public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("Email");
        notification.alertUser();
    }
}
