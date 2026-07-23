package SmartDevice;

public class SmartDevice {

    protected String name;
    protected int cost;

    public SmartDevice(String name, int cost)
    {
        this.name = name;
        this.cost = cost;
    }

    public String getName()
    {
        return this.name;
    }

    public int getCost()
    {
        return this.cost;
    }
}
