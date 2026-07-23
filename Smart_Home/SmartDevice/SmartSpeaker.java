package SmartDevice;

import Interfaces.*;

public class SmartSpeaker extends SmartDevice implements Switch, PlayMusic{
    
    private boolean isOn = false;
    private StringBuilder currMusic;

    public SmartSpeaker(String name, int cost)
    {
        super(name, cost);
    }

    public String getMusicName()
    {
        return this.currMusic.toString();
    }

    public void turnOn()
    {
        if(isOn) System.out.println("Bulb is already turned on");
        else isOn = true;
    }

    public void turnOff()
    {
        if(isOn) isOn = false;
        else System.out.println("Bulb is already turned off");
    }

    public void playMusic(String name)
    {
        System.out.println("Playing Music: " + name);
        currMusic = new StringBuilder(name);
    }

    public void pauseMusic()
    {
        System.out.println("Music Paused");
    }
}
