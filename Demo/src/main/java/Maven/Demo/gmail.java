package Maven.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class gmail {
	@Test
	public void Test_Gmail_Login() throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "C:\\Geckodriver\\geckodriver17_win32.exe");
	/*	WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("Enter user name");
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys("Enter Password");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(2000);
		String title_Of_Page = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), title_Of_Page);
		System.out.println("Page title matched");
	}*/
	
	  WebDriver dr= new FirefoxDriver();
	  dr.get("https://www.gmail.com");
	  dr.findElement(By.xpath(".//*[@id='Email']")).sendKeys("ntrieuminh@gmail.com");
	  dr.findElement(By.xpath(".//*[@id='next']")).click();
	  dr.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("aaaa");
	  dr.findElement(By.xpath(".//*[@id='signIn']")).click();
	}
}
