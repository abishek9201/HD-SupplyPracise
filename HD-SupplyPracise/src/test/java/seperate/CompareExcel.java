package seperate;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareExcel {
    @Test
	public  void values() throws Exception {
		FileInputStream fis =new FileInputStream("C:\\Users\\kaset\\git\\HD-SupplyPracise\\HD-SupplyPracise\\excelData\\data1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet2=wb.getSheet("Sheet2");
		XSSFSheet sheet3=wb.getSheet("Sheet3");
		int row1=sheet2.getPhysicalNumberOfRows();
		int col1=sheet2.getRow(0).getPhysicalNumberOfCells();
		int row2=sheet3.getPhysicalNumberOfRows();
		int col2=sheet3.getRow(0).getPhysicalNumberOfCells();
		
		List<String> sheetsNameOfWb1 = new ArrayList<>();
		List<String> sheetsNameOfWb2 = new ArrayList<>();

		for(int i=0;i<row1-1;i++) {
			for(int j=0;j<col1;j++) {
				sheetsNameOfWb1.add(sheet2.getRow(i).getCell(j).getStringCellValue());
				sheetsNameOfWb2.add(sheet3.getRow(i).getCell(j).getStringCellValue());
				}
			}
		for(int i=0;i<row2-1;i++) {
			for(int j=0;j<col2;j++) {
				sheetsNameOfWb2.add(sheet3.getRow(i).getCell(j).getStringCellValue());
				}
			}
		System.out.println(sheetsNameOfWb1);
		System.out.println(sheetsNameOfWb2);
		Assert.assertEquals(sheetsNameOfWb1, sheetsNameOfWb2,"Provided excel workbook Sheets have different values.");
	    wb.close();

	}

}
