import SmartDevice.*;

public class Main {
    public static void main(String[] args) {
        
        // Create devices
        SmartBulb bulb = new SmartBulb("Philips Hue", 1500);
        SmartSpeaker speaker = new SmartSpeaker("Echo Dot", 4000);
        SmartAC ac = new SmartAC("Samsung AC", 35000);
        SecurityCamera camera = new SecurityCamera("Nest Cam", 8000);

        // Test SmartBulb
        bulb.turnOn();
        bulb.turnOff();

        // Test SmartSpeaker
        speaker.turnOn();
        speaker.playMusic("Shape of You");
        System.out.println("Currently playing: " + speaker.getMusicName());
        speaker.pauseMusic();
        speaker.turnOff();

        // Test SmartAC
        ac.turnOn();
        ac.setTemperature(24);
        System.out.println("AC temperature set to: " + ac.getTemperature());
        ac.turnOff();

        // Test SecurityCamera
        camera.startRecordVideo();
        camera.endRecordVideo();

        // Print device info
        System.out.println("\nDevice Info:");
        System.out.println(bulb.getName() + " costs " + bulb.getCost());
        System.out.println(speaker.getName() + " costs " + speaker.getCost());
        System.out.println(ac.getName() + " costs " + ac.getCost());
        System.out.println(camera.getName() + " costs " + camera.getCost());
    }
}
