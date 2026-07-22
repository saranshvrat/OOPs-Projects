package Storage;

public class ReadOnlyStorage extends Storage{

    public ReadOnlyStorage(String name, int capacity, boolean readOnly)
    {
        super(name, capacity, readOnly);
    }

    public void load(int loadId)
    {
        System.out.println("Reading file with LoadID " + loadId);
        System.out.println("Content " + saves.get(loadId));
    }
}
