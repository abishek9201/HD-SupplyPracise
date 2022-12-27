package seperate;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcelRetrival {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\kaset\\git\\HD-SupplyPracise\\HD-SupplyPracise\\excelData\\details.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("mobile details");
		int rows = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getPhysicalNumberOfCells();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				DataFormatter df = new DataFormatter();
				String val = df.formatCellValue(sheet.getRow(i).getCell(j));
				//System.out.println(val);
				System.out.println(sheet.getRow(i).getCell(j));
			}
		}
	}

}
