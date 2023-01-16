package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HyrPage {
	WebDriver driver;
	JavascriptExecutor js;
	public HyrPage(WebDriver driver) {
		this.driver=driver;
		
	}
	//Locators
	private By txt_fname=By.id("firstName");
	private By txt_lname=By.id("lastName");
	private By Gender=By.id("malerb");
	private By lang=By.id("englishchbx");
	private By txt_mail=By.id("email");
	private By txt_password=By.id("password");
	private By btn_click=By.id("registerbtn");
	
	//Sending values
	public void enterFirstname(String fname) {
		driver.findElement(txt_fname).sendKeys(fname);
	}
	public void enterLastname(String lname) {
		driver.findElement(txt_lname).sendKeys(lname);
	}
	public void enterEmail(String mail) {
		driver.findElement(txt_mail).sendKeys(mail);
	}
	public void enterPassword(String pass) {
		driver.findElement(txt_password).sendKeys(pass);
	}
	
	//clicking
	public void selectGender() {
		driver.findElement(Gender).click();
	}
	public void selectEnglish() {
		driver.findElement(lang).click();
	}
	public void Register() {
		driver.findElement(btn_click).click();
	}
	
	//Scroll
	public void scroll() {
	WebElement element=driver.findElement(By.id("registerbtn"));
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",element);
	js.executeScript("window.scrollBy(0,500);");
	}

}
