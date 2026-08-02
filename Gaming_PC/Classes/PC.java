package Classes;

public class PC {
    private final String cpu;
    private final String gpu;
    private final int ram;
    private final int storage;
    private final String motherboard;
    private final String powerSupply;
    private final String cabinet;
    private final String cooling;
    private final boolean wifiEnabled;
    private final boolean rgbEnabled;

    private PC(Builder builder) {
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.motherboard = builder.motherboard;
        this.powerSupply = builder.powerSupply;
        this.cabinet = builder.cabinet;
        this.cooling = builder.cooling;
        this.wifiEnabled = builder.wifiEnabled;
        this.rgbEnabled = builder.rgbEnabled;
    }
    

    public static class Builder {
    private String cpu;
    private String gpu;
    private int ram;
    private int storage;
    private String motherboard;
    private String powerSupply;
    private String cabinet;
    private String cooling;
    private boolean wifiEnabled;
    private boolean rgbEnabled;

    public Builder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public Builder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public Builder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Builder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public Builder setMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public Builder setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    public Builder setCabinet(String cabinet) {
        this.cabinet = cabinet;
        return this;
    }

    public Builder setCooling(String cooling) {
        this.cooling = cooling;
        return this;
    }

    public Builder setWifiEnabled(boolean wifiEnabled) {
        this.wifiEnabled = wifiEnabled;
        return this;
    }

    public Builder setRgbEnabled(boolean rgbEnabled) {
        this.rgbEnabled = rgbEnabled;
        return this;
    }

    // Build method returns a PC object
    public PC build() {
        return new PC(this);
    }
}

    // Optional: toString for easy printing
    @Override
    public String toString() {
        return "PC {" +
                "CPU='" + cpu + '\'' +
                ", GPU='" + gpu + '\'' +
                ", RAM=" + ram + "GB" +
                ", Storage=" + storage + "GB" +
                ", Motherboard='" + motherboard + '\'' +
                ", PowerSupply='" + powerSupply + '\'' +
                ", Cabinet='" + cabinet + '\'' +
                ", Cooling='" + cooling + '\'' +
                ", WiFi=" + wifiEnabled +
                ", RGB=" + rgbEnabled +
                '}';
    }
}
