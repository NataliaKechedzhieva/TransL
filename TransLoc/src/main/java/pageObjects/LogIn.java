package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LogIn  extends Base{
	
	public LogIn() {
	PageFactory.initElements(driver, this);

}
	
	@FindBy(how = How.XPATH, using = "//input[@id=\"username\"]")
	private WebElement userName;
	
	@FindBy(how = How.XPATH, using = "//input[@id=\"password\"]")
	private WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@class=\"btn btn-info btn-block\"]")
	private WebElement loginBtn;
	
	@FindBy(how = How.XPATH, using = "//a[@class=\"strong\"]")
	private WebElement forgotPswd;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign up')]")
	private WebElement SignUp;
	
	public void enterUserName(String userName) {
		userName.click();
		userName.clear();
		userName.sendKeys(userName);
	}
	
	
	public void enterPassword(String password) {
		password.clear();
		password.sendKeys(password);
	}
	
	
	public void clickOnLoginButton() {
		loginBtn.click();
	}
	
	
	
}