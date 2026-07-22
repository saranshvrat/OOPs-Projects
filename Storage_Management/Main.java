import Storage.*;

public class Main{
   public static void main(String[] args){
         OverwritableStorage s1 = new OverwritableStorage("RAM", 128, false);
         s1.save("Hello World", 12);
         System.out.println(s1.getUsedSpace()); 
         s1.save("Hello Happy", 24);
         s1.load(101);
         s1.delete(101);
         System.out.println(s1.getUsedSpace()); 
   }
}