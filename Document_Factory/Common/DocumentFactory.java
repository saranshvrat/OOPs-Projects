package Common;

import Documents.*;

public class DocumentFactory {
    public static Document getDocument(int fileId, int type)
    {
        switch(type)
        {
            case 1: return new Excel();
            case 2: return new PDF();
            case 3: return new Word();
            default:
                throw new IllegalArgumentException("Unknown file type, nothing is created for fileId: "+fileId);
        }
    }
}
