import Models.*;
import Notifications.*;
public class Main{
   public static void main(String[] args){
        User p = new User("1233456", "Saransh", "7896541230", "sv@gmail.com");
        System.out.println(p.getName());
        Notification n = new Email(p);
        n.sendNotification("Hope u have a good day");
        Notification m = new SMS(p);
        m.sendNotification("Nice meeting ya!");
        Notification o = new PushNotification(m, "SamsungA34:120:001");
        o.sendNotification("Reminder");
   }
}