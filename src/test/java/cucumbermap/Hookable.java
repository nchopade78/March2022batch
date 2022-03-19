package cucumbermap;

import java.net.UnknownHostException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import methods.HTMLReportGenerator;

public class Hookable 
{
	@Before
	public void before(Scenario scenario) throws UnknownHostException
	{
		System.out.println("-------------------Scenario Starts----------------------");
		HTMLReportGenerator.TestSuiteStart("D:\\ProjectFlipkart\\Flipkart\\flipkart.html", "ProjectFlipkart");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
	}

	@After
	public void after(Scenario scenario)
	{
		System.out.println("-------------------Scenario Ends----------------------");
	
	HTMLReportGenerator.TestCaseEnd();
	HTMLReportGenerator.TestSuiteEnd();
	}
}
