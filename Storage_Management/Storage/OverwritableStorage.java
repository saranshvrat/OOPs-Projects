package Storage;

public class OverwritableStorage extends Storage{

    public OverwritableStorage(String name, int capacity, boolean readOnly)
    {
        super(name, capacity, readOnly);
    }

    public void load(int fileId)
    {
        System.out.println("Reading file with FileID " + fileId);
        System.out.println("Content " + saves.get(fileId));
    }

    public void delete(int fileId)
    {
        usedSpace-=storages.get(fileId);
        saves.remove(fileId);
        storages.remove(fileId);
        System.out.println("Deleting file with FileID " + fileId);

    }

    public void save(String data, int storage)
    {
        if(capacity - usedSpace >= storage)
        {
            usedSpace+=storage;
            saves.put(++fileId, data);
            storages.put(fileId, storage);
            System.out.println("Storing file with fileID " + (fileId));
        }
        else System.err.println("Storage full");
    }
}
