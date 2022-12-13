package seperate;
import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataRetrival {
	@DataProvider(name="data123")
	public String [][]getText() throws Exception {
			FileInputStream fis=new FileInputStream("C:\\Users\\kaset\\git\\HD-SupplyPracise\\HD-SupplyPracise\\excelData\\data1.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			int iRow=sheet.getPhysicalNumberOfRows();
			int noOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
			String[][] datae=new String[iRow-1][noOfColumns];
			for(int i=0;i<iRow-1;i++) {
				for(int j=0;j<noOfColumns;j++) {
					DataFormatter df=new DataFormatter();
					
					//String val = df.formatCellValue(sheet.getRow(i).getCell(j));
					datae[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
					//System.out.println(val);	
				}
			}
			workbook.close();
			fis.close();
		
		return datae;
		
		
		
	}

}
