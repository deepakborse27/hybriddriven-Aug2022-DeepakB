package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import base.PredefinedActions;

public class LoginPage extends PredefinedActions {

	public void login(String username, String password) {
		enterUsername(username);
		enterpassword(password);
		clickonloginbutton();
	}

	public void enterUsername(String username) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
	}

	public void enterpassword(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}

	public void clickonloginbutton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	public String getpagetitle() {
		return driver.getTitle();

	}

}