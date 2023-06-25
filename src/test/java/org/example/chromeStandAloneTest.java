package org.example;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class chromeStandAloneTest {
    public static void main (String[] args) throws MalformedURLException {
        //RemoteWebDriver
        URL url = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities cap =new DesiredCapabilities();
        cap.setBrowserName("chrome");
        RemoteWebDriver driver=new RemoteWebDriver(url,cap);
        driver.get("http://google.com");
        System.out.println(driver.getTitle());

    }
}
