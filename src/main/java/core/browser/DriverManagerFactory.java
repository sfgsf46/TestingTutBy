package core.browser;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type) {
        DriverManager driverManager;
        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FireFoxDriverManager();
                break;
            case ME:
                driverManager = new MEDriverManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
        }
        return driverManager;
    }
}
