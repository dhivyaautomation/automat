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

public class PassengerTest  extends TestBase{
	XSSFWorkbook book;
	XSSFSheet sheet;
	XSSFCell readCell;
	XSSFRow row;
	String cellValueStr;
	SearchBusPage searchPageobj;
	ResultPage resultPageobj;
	PassengerDetails passengerDetailsPageobj;

	public PassengerTest() throws Exception {
		super();
		
	}
	@BeforeMethod
	public void startup() throws Exception
	{
		initialisation();
		searchPageobj = new SearchBusPage();
		resultPageobj = searchPageobj.searchDetails();
		passengerDetailsPageobj= resultPageobj.selectSeat();
	}
	
	@Test(dataProvider = "readExcel")
	public void checkPassengerDetails(String passName,String passAge,String passGender, String passEmail,String passPhone) throws Exception
	{
		passengerDetailsPageobj.passengerDetails( passName, passAge, passGender,  passEmail, passPhone);
		
		//passengerDetailsPageobj.PassengerCheck(passName);	
	}
	
	
	@DataProvider(name="readExcel")
	public String[][] readData() throws Exception
	{
		FileInputStream file = new FileInputStream("E:\\Eclipse_programs\\PomModel\\src\\main\\java\\util\\RedBusPasssengerDetails.xlsx");
		book = new XSSFWorkbook(file);
		sheet=book.getSheetAt(0);

		int totRows= sheet.getPhysicalNumberOfRows();
		System.out.println(totRows);
		int totCol=sheet.getRow(0).getLastCellNum();
		System.out.println(totCol);
		String[][] data = new String[totRows-1][totCol];
		DataFormatter format = new DataFormatter();

		//using for loop method to read excel rows
		for(int i=1; i<=totRows-1;i++) {
			row=sheet.getRow(i);
			for (int j=0;j<totCol;j++)
			{

				readCell= row.getCell(j);
				// String cellData=readCell.getStringCellValue();
				String celldata = format.formatCellValue(readCell);
				data[i-1][j]= celldata;

			}
		}
		return data;
	}

}
