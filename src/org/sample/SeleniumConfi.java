package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class SeleniumConfi {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("https://www.flipkart.com/");
		
		drivers.manage().window().maximize();
		
		WebElement searchbox = drivers.findElement(By.name("q"));
		searchbox.sendKeys("air freshener");
		
		WebElement searchbtn = drivers.findElement(By.xpath("//button[@type='submit']"));
		searchbtn.click();
		
		Thread.sleep(3000);
		
		WebElement itemselect = drivers.findElement(By.xpath("(//a[@class='s1Q9rs'])[14]"));
		itemselect.click();
		
		WebElement addcart = drivers.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		addcart.click();
		
		WebElement saveltr = drivers.findElement(By.xpath("//div[text='Save for later']"));
		saveltr.click();
		
		WebElement msg1 = drivers.findElement(By.xpath("//div[@class='_2sKwjB']"));
		String text = msg1.getText();
		System.out.println(text);

		//WebElement inc = drivers.findElement(By.xpath("(//button[@class='_23FHuj'])[2]"));
		//inc.click();
		
			
		
	}

}
