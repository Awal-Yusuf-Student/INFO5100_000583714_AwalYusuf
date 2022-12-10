package model;
//This class shows the Factory method design pattern
public interface Notification {
  void alertUser();

  public class SMSNotification implements Notification {

    @Override
    public void alertUser()
    {
        
        System.out.println("Sending an SMS notification: ");
    }
  }

  public class EmailNotification implements Notification {
 
    @Override
    public void alertUser()
    {
        
        System.out.println("Sending an e-mail notification: ");
    }
}

public class PushNotification implements Notification {
 
  @Override
  public void alertUser()
  {
      System.out.println("Sending a push notification: ");
  }
}

public class NotificationFactory {
  public Notification createNotification(String channel)
  {
      if (channel == null || channel.isEmpty())
          return null;
      switch (channel) {
      case "SMS":
          return new SMSNotification();
      case "EMAIL":
          return new EmailNotification();
      case "PUSH":
          return new PushNotification();
      default:
          throw new IllegalArgumentException("Unknown channel: "+ channel );
      }
  }
}
}

