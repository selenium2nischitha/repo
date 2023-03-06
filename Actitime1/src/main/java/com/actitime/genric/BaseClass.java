package com.actitime.genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static WebDriver driver;
@BeforeTest
public void openbrowser()
{
	Reporter.log("openbrowser", true);
	
}

	
}
