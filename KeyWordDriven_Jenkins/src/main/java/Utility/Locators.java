package Utility;

import org.openqa.selenium.By;

public class Locators {
	
	public static By getID(String locator) {

     return By.id(locator);
      
      }
	
	public static By getName(String locator) {
		
		return By.name(locator);
		

	}
	
	public static By getXpath(String locator) {
		
		return By.xpath(locator);

	}

}
