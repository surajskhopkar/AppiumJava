//ok cancel dialog with a message
package AppiumBasics;

import Utils.Conftest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario1 extends Conftest {

    @Test
    public void TestScenario1(){

        //ok cancel dialog with a message
        driver.findElement((AppiumBy.accessibilityId("App"))).click();
        driver.findElement((AppiumBy.accessibilityId("Alert Dialogs"))).click();
        driver.findElement((AppiumBy.accessibilityId("OK Cancel dialog with a message"))).click();
        String alert_message = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\'android:id/alertTitle\']")).getAttribute("text");
        System.out.println("Alert message is: "+alert_message);
        driver.findElement(AppiumBy.id("android:id/button1")).click();

        //ok cancel dialog with a long message
        driver.findElement((AppiumBy.accessibilityId("OK Cancel dialog with a long message"))).click();
        String alert_message1 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\'android:id/message\']")).getAttribute("text");
        System.out.println("Alert message is: "+alert_message1);
        driver.findElement(AppiumBy.id("android:id/button1")).click();

        //ok cancel dialog with a ultra long message
        driver.findElement((AppiumBy.accessibilityId("OK Cancel dialog with ultra long message"))).click();
        String alert_message2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\'android:id/message\']")).getAttribute("text");
        System.out.println("Alert message is: "+alert_message2);
        driver.findElement(AppiumBy.id("android:id/button1")).click();

        //list dialog
        driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\'android:id/text1\' and @text=\'Command one\']")).click();
        Assert.assertEquals((driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\'android:id/message\']")).
                        getAttribute("text")),
                "You selected: 0 , Command one");
        ((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 654,
                "y", 2643));

        driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\'android:id/text1\' and @text=\'Command two\']")).click();
        Assert.assertEquals((driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\'android:id/message\']")).
                        getAttribute("text")),
                "You selected: 1 , Command two");
        ((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 654,
                "y", 2643));

        driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\'android:id/text1\' and @text=\'Command three\']")).click();
        Assert.assertEquals((driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\'android:id/message\']")).
                        getAttribute("text")),
                "You selected: 2 , Command three");
        ((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 654,
                "y", 2643));

        driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\'android:id/text1\' and @text=\'Command four\']")).click();
        Assert.assertEquals((driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\'android:id/message\']")).
                        getAttribute("text")),
                "You selected: 3 , Command four");
        ((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 654,
                "y", 2643));


        //Single choice list
        driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\'android:id/text1\' and @text=\'Satellite\']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\'android:id/button1\']")).click();

        driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\'android:id/text1\' and @text=\'Traffic\']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\'android:id/button1\']")).click();

        driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\'android:id/text1\' and @text=\'Street view\']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\'android:id/button1\']")).click();

        //Test Entry dialog
        driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
        driver.findElement(By.id("io.appium.android.apis:id/username_edit")).sendKeys("Mohammad Salah");
        driver.findElement(By.id("io.appium.android.apis:id/password_edit")).sendKeys("ansnndnndn112fhf");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\'android:id/button1\']")).click();















    }

}
