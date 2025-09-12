package Datadriven;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;


	/**
	 * 
	 * @author ANUP KUMAR
	 * @project FABALLEY_WEB
	 * @DATE 18/09/2021
	 * @program description- By this program data from the excel file will be read
	 * 
	 *
	 */

	public class ExcelUtils {
		
		
		
		
		static String filepath="D:\\Codes\\Eclips\\Selenium_TestNG\\TestData\\Book1.xlsx";
		
		
		/**
		 * @description readData() will read the data from testData.xlsx
		 * @param sheetName
		 * @param rowNum
		 * @param cellNum
		 * @return
		 * @throws InvalidFormatException 
		 */
		
		
		public static String readData(String sheetName ,int rowNum ,int cellNum) throws InvalidFormatException
		
		{
			String value=null;
			
			try{
				
				Workbook wb =WorkbookFactory.create(new FileInputStream(new File(filepath)));
				value =wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
		
			return value;
			
		}

	}

