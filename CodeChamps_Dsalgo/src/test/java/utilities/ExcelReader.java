package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public int totalRow;
	
	public List<Map<String, String>> getData(String xlpath, String sheetName ) throws IOException{
		
        File Excelfile = new File(xlpath);
		
		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		workbook.close();
		return readSheet(sheet);
	}
	
	 
	  
	
	private List<Map<String, String>> readSheet(Sheet sheet){
		Row row;
		Cell cell;
		
		
		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();
		int rowcount = sheet.getPhysicalNumberOfRows(); 
		for(int currentRow = 1; currentRow < rowcount; currentRow++ ) {
			row = sheet.getRow(currentRow);
			int totalcell = row.getPhysicalNumberOfCells();
			LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();
			for(int currentCell = 0;currentCell < totalcell; currentCell++) {
				cell = row.getCell(currentCell);
				String sheetHeader = sheet.getRow(0).getCell(currentCell).getStringCellValue(); 
				columnMapdata.put(sheetHeader, cell.getStringCellValue());
			}
			excelRows.add(columnMapdata);	
		}
		return excelRows;
	}
	public int countRow() {
		
         return totalRow;
	}
	
}
	
	
	
	

		

	
	
	

