package AppiumBasics;

import Utils.Conftest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class ScrollGestureDemo extends Conftest{


    @Test
    public void ScrollDemo() throws MalformedURLException, URISyntaxException, InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        //When we have prior idea if the expected element is present
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
    }
}
