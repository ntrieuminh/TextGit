package Maven.Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {
	  
	public static void main(String[] args)
	    {
	    	//	   System.setProperty("webdriver.gecko.driver", "C:\\Geckodriver\\geckodriver17_win32.exe");
	    	 //     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32.exe");
	    	      System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_3.5X64\\IEDriverServer.exe");
	    	      WebDriver driver = new InternetExplorerDriver();
	    	  //  	WebDriver driver= new FirefoxDriver();
	    	   //     WebDriver driver = new ChromeDriver();
	    			driver.get("https://www.google.com");
	    			driver.manage().window().maximize();
	    			
	    			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //implicit 
	    		//	wait.until(ExpectedConditions.visibilityOfElementLocated()); //Explicit 

	    			driver.quit(); 
	    	      System.out.print("done");
	    }
/*	@Before
	public void chrome()
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.vnexpress.net");
		 driver.manage().window().maximize();
		 driver.quit();
	}
	@After
	public void firefox()
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 driver.quit();
	}*/
  }

