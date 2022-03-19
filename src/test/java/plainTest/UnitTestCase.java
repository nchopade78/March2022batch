package plainTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnitTestCase 
{

	
	
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ProjectFlipkart\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe"); 
	
		ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com");
	
	//cancel initial window
	driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
	Thread.sleep(2000);
	
	Actions Cricket = new Actions (driver);
	WebElement Toss = driver.findElementByXPath("//*[@class='_1_3w1N']");

	Cricket.moveToElement(Toss).build().perform();      //cursor moving to login button
	Thread.sleep(2000);

	//click on my profile
	driver.findElementByXPath("(//*[@class='_3vhnxf'])[1]").click();
	Thread.sleep(2000);
	
	//Enter Username
	driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("9922231642");
	Thread.sleep(2000);
	//Enter password
	driver.findElementByXPath("//*[@type='password']").sendKeys("Nitin123");
	
	//click on login
	driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
	
	driver.close();
	driver.quit();
	
	

	}



}
