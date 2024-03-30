package AppiumBasics;

import Utils.Conftest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class ScrollGestureDemo2 extends Conftest{


    @Test
    public void ScrollDemo() throws MalformedURLException, URISyntaxException, InterruptedException {

        boolean canScrollMore;
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        //When we have no idea if the expected element is present
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
                    ImmutableMap.of(
                            "left", 100, "top", 100, "width", 200, "height", 200,
                            "direction", "down",
                            "percent", 3.0
                    ));
            Thread.sleep(2000);
        }while(canScrollMore);

    }
}
