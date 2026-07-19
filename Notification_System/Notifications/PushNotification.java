package Notifications;

public class PushNotification implements Notification{
    private Notification innerNotification;
    private String deviceToken;

    public PushNotification(Notification x, String deviceToken)
    {
        this.innerNotification = x;
        this.deviceToken = deviceToken;
    }
    
    @Override
    public void sendNotification(String message)
    {
        System.out.println("Pushing Notification to device: "+deviceToken);
        innerNotification.sendNotification(message);
    }
}
