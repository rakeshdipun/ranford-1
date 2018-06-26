package modules;

import pageobject.LoginPage;

public class Login {

	
	public static void loginexe(String user,String pass)
	{
		LoginPage.username.sendKeys(user);
		LoginPage.pass.sendKeys(pass);
		LoginPage.login.click();
	}
}
