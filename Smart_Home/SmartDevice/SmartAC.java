package SmartDevice;

import Interfaces.*;

public class SmartAC extends SmartDevice implements SetTemperature, Switch {

    private int temperature = 20;
    private boolean isOn = false;

    public SmartAC(String name, int cost)
    {
        super(name, cost);
    }

    public int getTemperature()
    {
        return this.temperature;
    }

    public void setTemperature(int temp)
    {
        if(temp>15 && temp<35) this.temperature = temp;
        else System.err.println("Invalid Temperature");
    }

    public void turnOn()
    {
        if(isOn) System.out.println("AC is already turned on with temperature " + this.temperature);
        else isOn = true;
    }

    public void turnOff()
    {
        if(isOn) isOn = false;
        else System.out.println("AC is already turned off");
    }

}
