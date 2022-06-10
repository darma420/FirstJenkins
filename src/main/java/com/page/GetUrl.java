package com.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class GetUrl {
	public static WebDriver driver;
	@Test
	public static void mains() {
		System.setProperty("webdriver.chrome.driver","E:\\ASSIGN\\New folder (13)\\chromedriver.exe");
		System.out.println("Hello darma");
		driver = new ChromeDriver();
		System.out.println("Hello darma");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
        driver.get("http://52.172.14.78:2017/Uniserve-Web/fortunetech/LogInAction.do");

	}

}
