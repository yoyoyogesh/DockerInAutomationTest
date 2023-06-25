package org.example;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class chromeTest3 {
@Test()
    public static void chromeTest3 () throws MalformedURLException {
        //RemoteWebDriver
        URL url = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities cap =new DesiredCapabilities();
        cap.setBrowserName("chrome");
        RemoteWebDriver driver=new RemoteWebDriver(url,cap);
        driver.get("http://yahoo.com");
        System.out.println(driver.getTitle());

    }
}
