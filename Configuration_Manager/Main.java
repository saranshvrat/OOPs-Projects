import Manager.ConfigurationManager;

public class Main{
   public static void main(String[] args){
   
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        config1.setName("MyApp");
        config1.setVersion("3.0");
        config1.setDatabaseURL("jdbc:mysql://localhost:3306/mydb");

        System.out.println(config1.getName()); 
        System.out.println(config1.getVersion()); 
        System.out.println(config1.getDatabaseURL()); 

        System.out.println("Application name: " + config2.getName());
        System.out.println("Database URL: " + config2.getDatabaseURL());
        System.out.println("Older version: " + config2.getVersion());
        config1.setVersion("2.0");
        System.out.println("Updated version: " + config2.getVersion());

        if(config1 == config2) System.out.println(true);
   }
}