package test_miscellaneous.poimodules;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Run {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://auxolabs.teamwork.com/index.cfm#people/195095/tasks");
		driver.findElement(By.id("nameoremail")).sendKeys("ilanchezhianj.qa@auxolabs.in");
		driver.findElement(By.id("passwordfield")).sendKeys("#9Eripakkam");
		driver.findElement(By.xpath("//*[@id=\"userNameAndPassGroup\"]/div[4]/button")).click();
		Thread.sleep(10000);
		
		
		driver.quit();
		
	}

}
