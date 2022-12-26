package org.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver drivers=new ChromeDriver();
	
	drivers.get("https://www.amazon.in/");
	
	drivers.manage().window().maximize();
	
	
	
	WebElement searchbox = drivers.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("iphone14");
	
	WebElement searchbtn = drivers.findElement(By.id("nav-search-submit-button"));
	searchbtn.click();
	
	List<WebElement> allPrices = drivers.findElements(By.xpath("//span[@class='a-price-whole']"));
	
	for (int i = 0; i < allPrices.size(); i++) {
		
		String text = allPrices.get(i).getText();
		String replace = text.replace(",","");
		
      long parseLong = Long.parseLong(replace);
      System.out.println(parseLong);
	
    }
	

	
	
	
	
  }
	
}
