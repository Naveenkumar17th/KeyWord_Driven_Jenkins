package excutionCore;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ActionKeyWord.ActionKeyWords;
import Utility.Locators;
import Utility.UtilityForExcel;

public class Engine {
	 
	ActionKeyWords ac;
	
	Method[] methods;
	static UtilityForExcel u;
	
	static String keyword;
	
	public static By locator;
	
	
	
	public void getActionKeyWordsFuntions() {
		
		ac = new ActionKeyWords();
		 methods = ac.getClass().getMethods();
		
		}
	
	public void executeFunctions() throws Exception {
		
		
		
		for (int i = 0; i < methods.length; i++) {
			
			if(methods[i].getName().equalsIgnoreCase(UtilityForExcel.actkeyword)) {
				methods[i].invoke(ac);
			}
			
			
		}
		

		

	}
	
	public void excelToBeUsed() {
		
		switch (UtilityForExcel.loname) {
		case "id":
			
			locator = Locators.getID(UtilityForExcel.lovalue);
			
			break;
         case "name":
			
			 locator = Locators.getName(UtilityForExcel.lovalue);
			
			break;
			
         case "xpath":

 			
			 locator = Locators.getXpath(UtilityForExcel.lovalue);
			
			break;

		default:
			
			
			break;
		}

	}
	
	
	
	

	public static void main_method() throws Exception {
		
		
		
		
		 u = new UtilityForExcel();
		
		u.excelReading("C:\\Users\\navve\\eclipse-workspace\\Home\\Keywords.xlsx");
		
		Engine e = new Engine();
		
		e.getActionKeyWordsFuntions();
		
		int locatornamecolmn = 3;
		int locatorvaluecolmn = locatornamecolmn+1;
		int keywordcolmn = locatorvaluecolmn+1;
		int testdatacolmn = keywordcolmn+1;
		
		
        for (int row = 1; row <UtilityForExcel.NumberOfRows; row++) {
			
			 u.getValuesFromExcel(row, locatornamecolmn,locatorvaluecolmn,keywordcolmn,testdatacolmn);
			 
			 e.excelToBeUsed();
			 
			 e.executeFunctions();
			 
			 
			
		}
		

	}

}
