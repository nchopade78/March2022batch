package methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations
{
	public static WebDriver driver=null;
	
public static Hashtable<String,Object> outputparameters=new Hashtable<String,Object>();	

//browser launch	
public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
	
{
	try
	{
	 String browserName= (String) inputParameters[0];
	String exe= (String) inputParameters[1];
	
	if(browserName.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", exe);
	   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		
		System.setProperty("webdriver.gecko.driver", exe);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	outputparameters.put("STATUS", "PASS");
	outputparameters.put("MESSAGE", "methodused:browserLaunch, Input_Data: " + inputParameters[1].toString());
	
	}
	catch(Exception e)
	{
		
		outputparameters.put("STATUS", "FAIL");
		outputparameters.put("MESSAGE", "methodused:browserLaunch, Input_Data: " + inputParameters[1].toString());
		
		
	}
		
	 return outputparameters;
	}
   //open application
    public static Hashtable<String,Object> openApplication(Object[] inputParameters)
{
    	try
    	{
    		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	String url= (String) inputParameters[0];
	driver.get(url);
    	
	outputparameters.put("STATUS", "PASS");
	outputparameters.put("MESSAGE", "methodused:openApplication, Input_Data: " + inputParameters[0].toString());
	
    	
    	}
    	
    	
    	catch(Exception e)
    	{
    		outputparameters.put("STATUS", "FAIL");
    		outputparameters.put("MESSAGE", "methodused:openApplication, Input_Data: " + inputParameters[0].toString());
    		
    		
    	}
    	return outputparameters;
}   
    //click on element
    public static Hashtable<String,Object> clickonElement(Object[]inputParameters)

{
    	try
    	{
    		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	String xpath= (String) inputParameters[0];
	driver.findElement(By.xpath(xpath)).click();
    	
	outputparameters.put("STATUS", "PASS");
	outputparameters.put("MESSAGE", "methodused:clickonElement, Input_Data: " + inputParameters[0].toString());
    	
    	}
    	
    	
    	
    	catch(Exception e)
    	{
    		outputparameters.put("STATUS", "FAIL");
    		outputparameters.put("MESSAGE", "methodused:clikonElement, Input_Data: " + inputParameters[0].toString());
    	}
    	return outputparameters;
}
    //cursor on login
 public static Hashtable<String,Object> CursorOnLogin(Object [] bat) 
 {
	 try
	 {
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 
	String Click= (String) bat[0];
    Actions pro=new Actions(driver);
    WebElement loginn=driver.findElement(By.xpath(Click));
    pro.moveToElement(loginn).build().perform();
	
    outputparameters.put("STATUS", "PASS");
	outputparameters.put("MESSAGE", "methodused:CursorOnLogin, Input_Data: " + bat[0].toString());
    
	 }
		catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "methodused:CursorOnLogin, Input_Data: " + bat[0].toString());
		}
	 return outputparameters;
    }
 public static Hashtable<String,Object> SendTexts(Object [] credentials) throws InterruptedException
 {
	 try
	 {
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 
	 String xpath= (String) credentials[0];
	 String data= (String) credentials[1];
	driver.findElement(By.xpath(xpath)).sendKeys(data);
	
	outputparameters.put("STATUS", "PASS");
	outputparameters.put("MESSAGE", "methodused:Sendtext, Input_Data: " + credentials[1].toString());
	 
	 }
		catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "methodused:Sendtext, Input_Data: " + credentials[1].toString());
		}
	 return outputparameters;
    
 }
 //validation login
 public static Hashtable<String,Object> validationforlogin(Object [] credentials) 
 {
	 try
	 {
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 
	 String givenText= (String) credentials[0];
	 String xpath= (String) credentials[1];
	String actualText=driver.findElement(By.xpath(xpath)).getText();
    
	if(givenText.equalsIgnoreCase(actualText))
	{
		System.out.println("Test Case Pass");
	}else
	{
		System.out.println("Test Case Fail");
	}
	
	outputparameters.put("STATUS", "PASS");
	outputparameters.put("MESSAGE", "methodused:validationforlogin, Input_Data: " + credentials[0].toString());
	 }
		catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "methodused:validationforlogin, Input_Data: " + credentials[0].toString());
		}
	 return outputparameters;
	
 }
	public static void main(String[] args) throws InterruptedException
	{
		SeleniumOperations India= new SeleniumOperations();
		//LaunchBrowser
		
		Object [] input=new Object[2];
		          input[0]="Chrome";
		          input[1]="D:\\ProjectFlipkart\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
		          SeleniumOperations.browserLaunch(input);
		
		//openApplication
		          Object [] input1=new Object[1];
		          input1[0]="https://www.flipkart.com";
		          SeleniumOperations.openApplication(input1);
	//cancel login window
	   Object [] input2=new Object[1];
	             input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	             SeleniumOperations.clickonElement(input2);
	      //move cursor on login   	
	   Object [] input3=new Object[1];
	             input3[0]="//*[@class='_1_3w1N']";
	            SeleniumOperations.CursorOnLogin(input3);
	
    //click on myprofile
	  Object [] input4=new Object[1];
	            input4[0]="(//*[@class='_3vhnxf'])[1]";
	          SeleniumOperations.clickonElement(input4);
	
	//Enter username
	 Object [] input5=new Object[2];
	            input5[0]="(//*[@type='text'])[2]";
	            input5[1]="9922231642";
	          SeleniumOperations.SendTexts(input5);
	//enter password
	           Object [] input6=new Object[2];
	           input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
	           input6[1]="Nitin123";
	           India.SendTexts(input6);
	           
	//click on login button
	Object [] input7=new Object[1];
	          input7[0]="(//*[@type='submit'])[2]";
	          India.clickonElement(input7);
	 
	   // validation step
	          
	          Object [] input8=new Object[2];
	          input8[0]="Nitin Chopade";                          //Nitin Chopade
	          input8[1]="//*[@class='_1ruvv2']";           //Nitin Chopade
	        SeleniumOperations.validationforlogin(input8);
	          
	}
	
	
	
	
	
	
}






























