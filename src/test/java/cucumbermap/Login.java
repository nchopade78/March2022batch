package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.HTMLReportGenerator;
import methods.SeleniumOperations;

public class Login
{

	@When ("^user opens \"(.*)\" browser with exe as \"(.*)\"$")
	public void OpenBrowser(String bname,String exe)
	{
		Object [] input=new Object[2];
        input[0]=bname;
        input[1]=exe;
        SeleniumOperations.browserLaunch(input);
	}
	
	@When ("^user opens URL as \"(.*)\"$")
	public void OpenApplications(String url)
	{
		Object [] input1=new Object[1];
        input1[0]=url;
        SeleniumOperations.openApplication(input1);
		
	}
    
	@When ("^user click on cancel login window$")
	public void clickoncancel()
	{
		Object [] input2=new Object[1];
        input2[0]="//*[@class='_2KpZ6l _2doB4z']";
        SeleniumOperations.clickonElement(input2);
	}

	@When ("^user use move cursor to login$")
    public void movecursor() 
    {
		Object [] input3=new Object[1];
        input3[0]="//*[@class='_1_3w1N']";
       SeleniumOperations.CursorOnLogin(input3);
       
    }
       
	@When ("^user click on MyProfile$")
	public void clickonprofile()
	{
		Object [] input4=new Object[1];
        input4[0]="(//*[@class='_3vhnxf'])[1]";
        Hashtable<String, Object>output4=SeleniumOperations.clickonElement(input4);
	
        HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on MyProfile$", output4.get("MESSAGE").toString());
        
	}
      
	@When ("^user enter \"(.*)\" as username$")
	public void enterusername(String uname) throws InterruptedException 
	{
		Thread.sleep(2000);
		Object [] input5=new Object[2];
         input5[0]="(//*[@type='text'])[2]";
         input5[1]=uname;
         Hashtable<String, Object>output5=SeleniumOperations.SendTexts(input5);
		 HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"(.*)\" as username$", output5.get("MESSAGE").toString());
	}
	
	@When ("^user enter \"(.*)\" as a password$")
    public void enterpassword(String pass) throws InterruptedException
    {
		Object [] input6=new Object[2];
        input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
        input6[1]=pass;
        Hashtable<String, Object>output6=SeleniumOperations.SendTexts(input6);	
        HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"(.*)\" as a password$", output6.get("MESSAGE").toString());	
    }
      
	@When ("^user click on login button$")
	public void clickonlogin()
	{
		Object [] input7=new Object[1];
    input7[0]="(//*[@type='submit'])[2]";
    Hashtable<String, Object>output7=SeleniumOperations.clickonElement(input7);
    HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user click on login button$", output7.get("MESSAGE").toString());
	
	}

	@Then ("^Application shows logged successfully$")
	public void validationforlogin() throws InterruptedException
	{
		Thread.sleep(2000);
		 Object [] input8=new Object[2];
         input8[0]="Nitin Chopade";                          //Nitin Chopade
         input8[1]="//*[@class='_1ruvv2']";           //Nitin Chopade
         Hashtable<String, Object>output8=SeleniumOperations.validationforlogin(input8);
         HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^Application shows logged successfully$", output8.get("MESSAGE").toString());
	
	}
    












}
