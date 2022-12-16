package seperate;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AddToExcel {

	public static void main(String[] args) throws Exception {		
		FileInputStream fis= new FileInputStream("C:\\Users\\kaset\\git\\HD-SupplyPracise\\HD-SupplyPracise\\excelData\\data12.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		//int Rows=sheet.getPhysicalNumberOfRows();
		//int column=sheet.getRow(0).getPhysicalNumberOfCells();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List <WebElement> items=driver.findElements(By.cssSelector("div[class='inventory_item_name']"));
		List<WebElement> prices=driver.findElements(By.cssSelector("div[class='inventory_item_price']"));
		String itemsArr[]=new String[items.size()];
		String pricesArr[]=new String[prices.size()];
		for(int i=0;i<items.size();i++) {
			itemsArr[i]=items.get(i).getText();
		}
		for(int i=0;i<prices.size();i++) {
			pricesArr[i]=prices.get(i).getText();
		}
		for(int i=1;i<=itemsArr.length;i++) {
		 sheet.createRow(i).createCell(0).setCellValue(itemsArr[i-1]);
		}
		FileOutputStream fos1=new FileOutputStream("C:\\Users\\kaset\\git\\HD-SupplyPracise\\HD-SupplyPracise\\excelData\\data12.xlsx");
		wb.write(fos1);
		fos1.close();
		for(int i=1;i<=pricesArr.length;i++) {
			 sheet.getRow(i).createCell(1).setCellValue(pricesArr[i-1]);
			}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\kaset\\git\\HD-SupplyPracise\\HD-SupplyPracise\\excelData\\data12.xlsx");
		wb.write(fos);
		fos.close();
		wb.close();
		System.out.println("Completed");
		Thread.sleep(1000);
		driver.close();
		
	}

}
