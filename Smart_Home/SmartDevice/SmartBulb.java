package SmartDevice;

import Interfaces.*;

public class SmartBulb extends SmartDevice implements Switch {
    
    private boolean isOn = false;

    public SmartBulb(String name, int cost)
    {
        super(name, cost);
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
}
