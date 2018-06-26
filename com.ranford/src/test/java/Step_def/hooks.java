package Step_def;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class hooks 
{
	
        public static WebDriver driver;
		@Before
		public void openbrowser()
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
		}
		@After
		public void screenshort(Scenario s)
		{
			try {
				if(s.isFailed())
				{
					s.write("URL of the currentwindow :"+driver.getCurrentUrl());
					
					TakesScreenshot screen=(TakesScreenshot)driver;
					
					byte[] by=screen.getScreenshotAs(OutputType.BYTES);
					
					s.embed(by, "image/png");
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    	
		}
		
}
		
		
		
		
		
		
		
		
		
		
	