package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public String[][] readExcel(String excelfile) throws IOException {
//String[][] is return type and method is readExcel and  we will call this method (ai method e string hishebe pss koresi excelfile) 
//in getData(TC001_LoginLogout),,,,argument pass korer purpose hoche ata sob
//excel file read korter perbe ,,,,only akta excel file na, sob jaigai ata read korte korbe for all excel files
//so workbook e use koresi	"./data/"+excelfile+".xlsx"
	
		// Open Workbook
			XSSFWorkbook wb = new XSSFWorkbook("./data/"+excelfile+".xlsx");
			//"+excelfile+"= means it will read any excelfile
			// Get Sheet
			XSSFSheet sheet = wb.getSheet("Sheet1");
			
			// Row count
			int rowCount = sheet.getLastRowNum();
			//System.out.println(rowCount);
			
			//Column Count
			int columnCount = sheet.getRow(0).getLastCellNum();
			//System.out.println(columnCount);
			
			String[][] data =new String[rowCount][columnCount];
					
			//open "for loop" for rows
			for (int i = 1; i <= rowCount; i++) {
				// Row
				XSSFRow row = sheet.getRow(i);
				
				//open "for loop" for  columns
				for (int j = 0; j < columnCount; j++) {
					//Column
					XSSFCell cell = row.getCell(j);
					
					//Action -> Read Value
					String value = cell.getStringCellValue();
					data[i-1][j] = value;
				
				} //Ends column for loop
			
			}//Ends row for loop
			
			return data;
			
		}

}  


