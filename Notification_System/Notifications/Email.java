package Notifications;
import Models.User;

public class Email implements Notification {
    private User recipent;

    public Email(User recipent)
    {
        this.recipent = recipent;
    }

    @Override
    public void sendNotification(String message)
    {
        System.out.println("Name: "+recipent.getName());
        System.out.println("Email: "+recipent.getEmail());
        System.out.println("Your OTP is "+OTP);
        System.out.println(message);
    }
}
