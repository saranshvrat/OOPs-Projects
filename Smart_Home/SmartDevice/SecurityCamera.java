package SmartDevice;

import Interfaces.*;

public class SecurityCamera extends SmartDevice implements RecordVideo{

    public SecurityCamera(String name, int cost)
    {
        super(name, cost);
    }

    public void startRecordVideo()
    {
        System.out.println("Video Recording started by " + this.name);
    }

    public void endRecordVideo()
    {
        System.out.println("Video Recording ended by " + this.name);
    }
}
