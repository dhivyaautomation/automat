package Tests;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.PassengerDetails;
import pages.ResultPage;
import pages.SearchBusPage;
import util.TestBase;

public class ResultPageTest extends TestBase{

	SearchBusPage searchPageobj;
	ResultPage resultPageobj;
	PassengerDetails passengerDetailsPageobj;

	public ResultPageTest() throws Exception {
		super();
		
	}
	
	@BeforeMethod
	public void startup() throws Exception
	{
		initialisation();
		searchPageobj = new SearchBusPage();
		resultPageobj = searchPageobj.searchDetails();
	}
	@Test
	public void check() throws Exception
	{
		passengerDetailsPageobj= resultPageobj.selectSeat();
		resultPageobj.seatCheck();
	}

		
	
}
