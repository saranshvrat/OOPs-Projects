package Notifications;
import Models.User;

public class SMS implements Notification{
    
    private User recipent;

    public SMS(User recipent)
    {
        this.recipent = recipent;
    }

    @Override
    public void sendNotification(String message)
    {
        System.out.println("Name: "+recipent.getName());
        System.out.println("Phone: "+recipent.getPhone());
        System.out.println("Your OTP is "+OTP);
        System.out.println(message);
    }

}
