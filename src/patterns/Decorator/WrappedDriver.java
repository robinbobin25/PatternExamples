package patterns.Decorator;

/**
 * This class describes simple realization for Decorator
 * It consists of WrappedDriver clas that implements a lot of different interfaces
 *
 */
public class WrappedDriver extends Driver implements WebDriver, ScreenShotMaker, ReportsMaker{

    private WebDriver driver;

    public WrappedDriver(){
        driver = new WrappedDriver();
    }

    /*
    here can be a lot of methods from interfaces to be override as we want for our specified driver
    so in such way we have driver decorated with overrided methods
     */

    public WrappedDriver getWrappedDriver() {
        return this;
    }

}
