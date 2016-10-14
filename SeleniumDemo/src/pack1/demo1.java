package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver dr=new FirefoxDriver();   // open firefox
		dr.get("http://www.google.com/");   //  launch google.com
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//*[@id='sb_ifc0']")).sendKeys("Selenium");
		Thread.sleep(5000);
		dr.quit();  // close the browser

	}

}
