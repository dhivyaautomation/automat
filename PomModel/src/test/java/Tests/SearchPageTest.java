package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ResultPage;
import pages.SearchBusPage;
import util.TestBase;

public class SearchPageTest extends TestBase {
	
  SearchBusPage searchBus;
 ResultPage resultPage;


	public SearchPageTest() throws Exception {
		super();
	}
	
	@BeforeMethod
	public void  startup () throws Exception
	{
		initialisation();
		searchBus = new SearchBusPage();	
	}
	
	@Test
	public void searchForBus() throws Exception
	{
		resultPage = searchBus.searchDetails();//since this method returns result page im storing it in esultpage object by importing resultPage.class 
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}

	
}
