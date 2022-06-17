package Testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.FlipkartHompage;
import PomClasses.Laptop_cart;
import PomClasses.Laptops;

public class VerifyflipkartaddtocartLaaptopbutton {

	public static void main(String[] args) throws InterruptedException { 
		
	System.setProperty("webdriver.chrome.driver","D:\\chromeDriverexe\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	FlipkartHompage flipkarthomepage = new FlipkartHompage(driver);
	flipkarthomepage.selectElectronics();
	
	Thread.sleep(3000);
	
	Laptops laptop = new Laptops(driver);
	laptop.click_laptop();
	
	Thread.sleep(3000);
	
	Laptop_cart laptopcart = new Laptop_cart(driver);
	laptopcart.windowswitch(driver);
	Thread.sleep(3000);
	laptopcart.click_addtocart();
	}

}
