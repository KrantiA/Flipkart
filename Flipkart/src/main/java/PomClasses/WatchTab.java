package PomClasses;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchTab {
	
	@FindBy ( xpath = "(//li[@class='col col-6-12']//button[1])[1]")
	private WebElement button_go_to_cart;
	
	public WatchTab(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void select_goTocart()
	{
		 button_go_to_cart.click();
		
	}
	
	public void windowswitch(WebDriver driver)
	{
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
       
		driver.switchTo().window(addr.get(0));
	    System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(1));
		System.out.println(driver.getCurrentUrl());
	
    	
	}
	
	

}
