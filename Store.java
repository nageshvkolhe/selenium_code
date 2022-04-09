package com.facebook;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;

public class Store {
	 static WebDriver driver;

	public static void chrome() {
		System.setProperty("webdriver.chrome.driver","/Users/asus/eclipse-workspace/Selenium/driver2/chromedriver.exe");
		driver = new ChromeDriver();
		run();
		takeScreenshot(); 
	}

	public static void opera(){
		System.setProperty("webdriver.opera.driver","/Users/asus/eclipse-workspace/Selenium/driver2/operadriver.exe");
		driver =new OperaDriver();
		run();
		takeScreenshot(); 
	}

	public static void  edge(){
		System.setProperty("webdriver.edge.driver","/Users/asus/eclipse-workspace/Selenium/driver2/msedgedriver.exe");
		driver =new EdgeDriver(); 
		run();
		takeScreenshot(); 
	}

	public static void run() {
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.name("firstname")).sendKeys("Nagesh");
		driver.findElement(By.name("lastname")).sendKeys("Kolhe");
		driver.findElement(By.name("reg_email__")).sendKeys("8007892026");
		driver.findElement(By.name("reg_passwd__")).sendKeys("N@ge$h2820");
		driver.findElement(By.name("birthday_day")).sendKeys("16");
		driver.findElement(By.name("birthday_month")).sendKeys("May");
		driver.findElement(By.name("birthday_year")).sendKeys("1999");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter otp");
//		int otp = scan.nextInt();
//		try {
//			Thread.sleep(15000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		driver.findElement(By.name("code")).sendKeys("+ otp");
//		driver.findElement(By.name("Continue")).click();
	}

	public static void takeScreenshot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File Sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("./Screenshot/" +"facebook"+ System.currentTimeMillis() +".png");
		try {
			FileHandler.copy(Sourcefile, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
	}
	
}
