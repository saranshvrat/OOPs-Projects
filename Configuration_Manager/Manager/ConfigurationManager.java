package Manager;

public class ConfigurationManager {
    private String name;
    private String version;
    private String databaseURL;

    private static ConfigurationManager instance = null;

    private ConfigurationManager(){}

    public static ConfigurationManager getInstance()
    {
        if(instance == null)
            instance = new ConfigurationManager();
        return instance;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getDatabaseURL() {
        return databaseURL;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setDatabaseURL(String databaseURL) {
        this.databaseURL = databaseURL;
    }

}
