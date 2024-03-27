package AppiumBasics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Basics {
    @Test
    public void AppiumTest() throws MalformedURLException, URISyntaxException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 6 Pro API 34");
        options.setApp("//Users//surajkhopkar//Library//CloudStorage//OneDrive-Personal//Repositories//JavaFrameworks//AppiumJava//src//test//java//Resources//ApiDemos-debug.apk");
        AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),options);
        driver.quit();

    }
}
