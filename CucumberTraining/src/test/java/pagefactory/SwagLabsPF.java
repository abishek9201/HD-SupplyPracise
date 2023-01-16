package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsPF {
	WebDriver driver;
	//locators
	@FindBy(css="input[placeholder='Username']")
	WebElement txt_id;
	@FindBy(css="input[placeholder='Password']")
	WebElement txt_passcode;
	@FindBy(css="input[data-test='login-button']")
	WebElement login;
	@FindBy(xpath ="//span[@class='title'][text()='Products']")
	WebElement valid;
	//Sending values
	public void sendId(String id) {
		txt_id.sendKeys(id);
	}
	public void sendCode(String code) {
		txt_passcode.sendKeys(code);
	}
	//Click
	public void clickLogin() {
		login.click();
	}
	public String verify() {
		return valid.getText();
	}
	public SwagLabsPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
