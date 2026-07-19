package Notifications;
import java.util.Random;

public interface Notification {

    Random rand = new Random();
    int OTP = rand.nextInt(9000)+1000;

    void sendNotification(String message);
}
