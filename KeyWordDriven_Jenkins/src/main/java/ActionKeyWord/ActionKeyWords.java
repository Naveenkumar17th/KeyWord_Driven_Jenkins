package ActionKeyWord;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Utility.UtilityForExcel;
import excutionCore.Engine;

public class ActionKeyWords {
	
	public static RemoteWebDriver driver;
	
	
	public static void openBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		
	}
	public static void goToUrl() {
		
		driver.get(UtilityForExcel.tedata);
		
	}
	public static void enterUserName() {
		
		driver.findElement(Engine.locator).sendKeys(UtilityForExcel.tedata);
		
	}
	public static void enterPassWord() {
		
		driver.findElement(Engine.locator).sendKeys(UtilityForExcel.tedata);
		
		

	}
	
	public static void logInButton() {
		
		driver.findElement(Engine.locator).click();
		
	}








}
