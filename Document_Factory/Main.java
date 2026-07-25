import Common.Document;
import Common.DocumentFactory;

public class Main{
   public static void main(String[] args){
   
        Document d1 = DocumentFactory.getDocument(100, 1);
        Document d2 = DocumentFactory.getDocument(101, 2);
        Document d3 = DocumentFactory.getDocument(102, 3);
        d1.save(100);
        d2.save(101);
        d3.save(102);
        d2.open(101);
   }
}