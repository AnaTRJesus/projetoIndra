package br.com.indra.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Driver {
	
	private static WebDriver drive;
	
	public static WebDriver getDrive() {
		return drive;
	}


	public static void setDrive(WebDriver drive) {
		Driver.drive = drive;
	}


	public void startDrive(String driver) {
		
		
		if (driver.equals("chrome"))		{
			System.out.println(driver);
		    System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe"); 
		    drive = new ChromeDriver();
		}
				
	}
	
	
	public void closeDrive() {
		
		drive.close();
	}
	

}
