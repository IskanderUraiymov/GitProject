package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "/Users/iskanderuraiymov/Documents/selenium dependencies/drivers/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	String myTitle=driver.getTitle();
	String myUrl=driver.getCurrentUrl();
	System.out.println("Title"+myTitle);
	System.out.println("URL"+myUrl);
	
	if(myTitle.equals("Google")) {
		System.out.println("Right");
	}else {
		System.out.println("url is Wrong");
	}
	if(myUrl.contains("google.com")) {
		System.out.println("Your Url is working ");
	}else {
		System.out.println("Your url is not working");
	}
	
	Thread.sleep(3000);
	
	 driver.findElement(By.className("gb_P")).click();
	String gmailTitle="Gmail - Free Storage and Email from Google";
	//searchInput.sendKeys("apple"+Keys.ENTER);
	
}
}
