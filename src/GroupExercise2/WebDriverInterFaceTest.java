package GroupExercise2;

public class WebDriverInterFaceTest {
    public static void main(String[] args) {

        RemoteWebDriverInterface[] browsers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriverInterface browser:browsers) {
            browser.open();
            browser.close();
            browser.getTitle();
            browser.getScreenshot();
            browser.navigate();
        }
    }
}
