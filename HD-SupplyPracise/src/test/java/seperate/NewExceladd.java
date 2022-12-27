package seperate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewExceladd {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		//FileOutputStream foos=new FileOutputStream("C:\\Users\\kaset\\git\\HD-SupplyPracise\\HD-SupplyPracise\\excelData\\data.xlsx");
		//foos.close();
		//File f=new File("C:\\Users\\kaset\\git\\HD-SupplyPracise\\HD-SupplyPracise\\excelData\\details.xlsx");
		FileInputStream fis = new FileInputStream("C:\\Users\\kaset\\git\\HD-SupplyPracise\\HD-SupplyPracise\\excelData\\details.xlsx");
		//FileInputStream fis = new FileInputStream("C:\\Users\\kaset\\git\\HD-SupplyPracise\\HD-SupplyPracise\\excelData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("mobile details");
		//XSSFSheet sheet = wb.createSheet("iphones details");
		sheet.createRow(0).createCell(0).setCellValue("models");
		sheet.getRow(0).createCell(1).setCellValue("prices");
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> models = driver
				.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		List<WebElement> prices = driver
				.findElements(By.xpath("//span[@class='a-price-whole'][@class!='a-price-symbol']"));
		String modelsArr[] = new String[models.size()];
		String pricesArr[] = new String[prices.size()];
		for (int i = 0; i < models.size(); i++) {
			modelsArr[i] = models.get(i).getText();
			// System.out.println(modelsArr[i]=models.get(i).getText());
		}
		System.out.println(modelsArr.length);
		for (int i = 1; i <= modelsArr.length; i++) {
			sheet.createRow(i).createCell(0).setCellValue(modelsArr[i - 1]);
		}
		for (int i = 0; i < prices.size(); i++) {
			pricesArr[i] = prices.get(i).getText();
			// System.out.println(pricesArr[i]=prices.get(i).getText());
		}
		System.out.println(pricesArr.length);
		for (int i = 1; i <= pricesArr.length; i++) {
			sheet.getRow(i).createCell(1).setCellValue(pricesArr[i - 1]);
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\kaset\\git\\HD-SupplyPracise\\HD-SupplyPracise\\excelData\\details.xlsx");
		//FileOutputStream fos = new FileOutputStream("C:\\Users\\kaset\\git\\HD-SupplyPracise\\HD-SupplyPracise\\excelData\\data.xlsx");
		wb.write(fos);
		wb.close();
		driver.close();
		

	}

}
