package Step_def;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.Login;
import pageobject.LoginPage;

public class Step_def_class {
	
	
	WebDriver driver;
	
	public Step_def_class() {
		
		this.driver=hooks.driver;
	}
	
	@Given("^launch the site$")
	public void launch_the_site() throws Throwable {
	  
		driver.get("http://srssprojects.in/home.aspx");
		
	}

	@When("^check the tittle with \"([^\"]*)\" data$")
	public void check_the_tittle_with_data(String exp) throws Throwable {
	    
		String actual_tittle=driver.getTitle();
		
		if(actual_tittle.equals(exp))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
	}

	@Then("^login fields shoulds be displayed$")
	public void login_fields_shoulds_be_displayed() throws Throwable {
	    
	}

	@Then("^close site$")
	public void close_site() throws Throwable {
	   
	}

	@When("^enter the userid with  \"([^\"]*)\" data and password with \"([^\"]*)\" data$")
	public void enter_the_userid_with_data_and_password_with_data(String arg1, String arg2) throws Throwable {
	    
		PageFactory.initElements(driver, LoginPage.class);
		
		Login.loginexe(arg1,arg2);
	}

	@When("^click on login btn$")
	public void click_on_login_btn() throws Throwable {
	   
		
	}

	@Then("^Branches btn should be displayed$")
	public void Branches_btn_should_be_displayed() throws Throwable {
	   
	}



}
