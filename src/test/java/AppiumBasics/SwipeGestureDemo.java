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

public class SwipeGestureDemo extends Conftest{


    @Test
    public void ScrollDemo() throws MalformedURLException, URISyntaxException, InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement((AppiumBy.xpath("//android.widget.TextView[@content-desc=\'1. Photos\']"))).click();
        WebElement firstImage = driver.findElement(AppiumBy.xpath("//android.widget.Gallery[@resource-id=\'io.appium.android.apis:id/gallery\']/android.widget.ImageView[1]"));
        Assert.assertEquals(driver.findElement(AppiumBy.xpath("//android.widget.Gallery[@resource-id=\'io.appium.android.apis:id/gallery\']/android.widget.ImageView[1]"))
                        .getAttribute("focusable"), "true");
        //Swipe
        // Java
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement)firstImage).getId(),
                "direction", "left",
                "percent", 0.25
        ));
        Assert.assertEquals(driver.findElement(AppiumBy.xpath("//android.widget.Gallery[@resource-id=\'io.appium.android.apis:id/gallery\']/android.widget.ImageView[1]"))
                .getAttribute("focusable"), "false");


    }
}
