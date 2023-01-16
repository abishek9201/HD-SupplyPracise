package pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPF {
	WebDriver driver;
	//locators
	@FindBy(id="name")
	WebElement txt_username;
	@FindBy(id="password")
	WebElement txt_password;
	@FindBy(id="login")
	WebElement btn_login;
	@FindBy(id="logout")
	WebElement btn_logout;
	@FindBy(how=How.ID,using="name")
	WebElement abc;
	@CacheLookup
	@FindBy(partialLinkText ="a")
	List <WebElement> links;
	//sending values
	public void enterUserName(String user) {
		txt_username.sendKeys(user);
	}
	public void enterPassword(String pass) {
		txt_password.sendKeys(pass);
	}
	public void clickLogin() {
		btn_login.click();
	}
	public void clickLougout() {
		btn_logout.click();
	}
	public LoginPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/* 	public LoginPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);
	}*/
}
