import Classes.PC;

public class Main{
   public static void main(String[] args){
        PC gamingPC = new PC.Builder()
                .setCpu("Intel i9-13900K")
                .setGpu("NVIDIA RTX 4090")
                .setRam(32)
                .setStorage(2000)
                .setMotherboard("ASUS ROG STRIX Z790")
                .setPowerSupply("Corsair 1000W")
                .setCabinet("NZXT H710")
                .setCooling("Liquid Cooling")
                .setWifiEnabled(true)
                .setRgbEnabled(true)
                .build();
        PC budgetPC = new PC.Builder()
                .setCpu("Intel i5-12400U")
                .setGpu("NVIDIA RTX 3050")
                .setRam(8)
                .setStorage(512)
                .setPowerSupply("Corsair 100W")
                .setWifiEnabled(true)
                .setRgbEnabled(false)
                .build();

        System.out.println(gamingPC);
        System.out.println(budgetPC);
   }
}