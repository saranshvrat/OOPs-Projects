package Storage;

import java.util.HashMap;

abstract public class Storage{
    private String name;
    protected int storageId;
    protected int capacity;
    protected int usedSpace;
    protected boolean readOnly;
    private int id = 5000;
    protected int fileId = 100;

    public static HashMap<Integer, String> saves = new HashMap<>();
    public static HashMap<Integer, Integer> storages = new HashMap<>();

    public Storage(String name, int capacity, boolean readOnly)
    {
        this.name = name;
        this.capacity = capacity;
        this.readOnly = readOnly;
        this.storageId = ++id;
    }

    public String getName() {
        return name;
    }

    public int getStorageId() {
        return storageId;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getUsedSpace() {
        return usedSpace;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    abstract public void load(int loadID);
}