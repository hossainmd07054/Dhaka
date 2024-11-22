package com.Dhaka.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	public TestBase() {
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\Dhaka\\config\\config.properties");
			prop = new Properties();
			prop.load(fls);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initz() {
		String Browsername = prop.getProperty("browser");
		if(Browsername.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(utillll.implicitlyWait_wait, TimeUnit.SECONDS);
//			driver.manage().timeouts().pageLoadTimeout(utillll.pageLoadTimeout_wait, TimeUnit.SECONDS);
		}
		else{
			Browsername.equals("FF");
		}			
		System.out.println("Browser found");
	}
	
	public static void lunchh(String URL) {
		driver.get(prop.getProperty("URL"));
	}
	public static void main(String[] args) {
		
	
	for (int i = 1; i <= 2; i++) {
		  for (int j = 1; j <= 3; j++) {
		    System.out.print(i + "," + j + " ");
		  }
		}
	}

}
