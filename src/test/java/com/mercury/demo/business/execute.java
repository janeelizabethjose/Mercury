package com.mercury.demo.business;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mercury.demo.pages.login;

public class execute extends login  {

	public execute(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void loginFillUp(String username,String password) {
		 getusername().clear();
		 getusername().sendKeys("mercury");
		 getpassword().clear();
		 getpassword().sendKeys("mercury");
		 getlogin().click();
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			gettrvlopt();
			
	}
	/*public void nextPage(WebElement roundTrip,WebElement oneTrip,WebElement passenger)
	{
	getroundTrip();
	getoneTrip();
	getpassenger();

}*/
}