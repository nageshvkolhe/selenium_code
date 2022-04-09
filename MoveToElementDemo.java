package com.pro.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.actimind.com/");
		
		//find the menu "About Company"
		WebElement menu = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]"));
		
		//mouse hover on "About Company" menu
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		
		//click on submenu "Basic Facts"
		WebElement submenu = driver.findElement(By.linkText("Basic Facts"));
		submenu.click();
	}
}
