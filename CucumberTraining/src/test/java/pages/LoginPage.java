package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not login page .The current Page is "+driver.getCurrentUrl());
		}
	}
    //Locators
	private By txt_userName=By.id("name");
	private By txt_password=By.id("Password");
	private By btn_login=By.id("login");
	private By btn_logout=By.id("logout");
	//Sending Values
	public void enterUsername(String user) {
		driver.findElement(txt_userName).sendKeys(user);
	}
	public void enterPassword(String pass) {
		driver.findElement(txt_password).sendKeys(pass);
	}
	//Clicking buttons
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	public void clickLogout() {
		driver.findElement(btn_logout).click();
	}
	public void loginValidUser(String user,String pass) {
		driver.findElement(txt_userName).sendKeys(user);
		driver.findElement(txt_password).sendKeys(pass);
		driver.findElement(btn_login).click();
	}

}
