package AppiumBasics;

import Utils.Conftest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class MiscellaneousActions extends Conftest{


    @Test
    public void Miscellaneous() throws MalformedURLException, URISyntaxException, InterruptedException {
        //adb shell dumpsys window | grep -E 'mCurrentFocus'
        Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
        ((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of(
                "intent", "io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies",
                "package", "io.appium.android.apis"
        ));

        driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
        //Rotate device
        driver.rotate(new DeviceRotation(0, 0, 90));
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");
        //ClipBoard copy action
        driver.setClipboardText("Salah");
        driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
        //KEY EVENTS
        driver.pressKey(new KeyEvent(AndroidKey.HOME));









    }
}
