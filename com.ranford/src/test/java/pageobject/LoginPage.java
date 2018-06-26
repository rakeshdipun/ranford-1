package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	
	@FindBy(how=How.ID,using="txtUid")
	public static WebElement username;
	
	@FindBy(how=How.ID,using="txtPword")
	public static WebElement pass;
	
	@FindBy(how=How.ID,using="login")
	public static WebElement login;

}
