package AppiumBasics;
import Utils.Conftest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class Basics extends Conftest{


    @Test
    public void WifiSettingsName() throws MalformedURLException, URISyntaxException, InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");
        driver.findElement(By.id("android:id/edit")).sendKeys("Salah");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();









    }
}
