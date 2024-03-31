package AppiumBasics;

import Utils.Conftest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class LongPressGesture extends Conftest {


    @Test
    public void LongPress() {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\'1. Custom Adapter\']")).click();
        WebElement ele = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\'People Names\']"));
        ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),
                                "duration", 2000));















    }
}
