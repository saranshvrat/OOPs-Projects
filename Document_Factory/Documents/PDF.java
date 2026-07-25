package Documents;

import Common.*;

public class PDF implements Document{
    public void open(int fileId)
    {
        System.out.println("File Opened\nFile ID: " + fileId);
    }

    public void save(int fileId)
    {
        System.out.println("File Updated\nFile ID: " + fileId);
    }
}
