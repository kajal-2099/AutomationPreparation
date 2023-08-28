package Utilities;
import Utilities.SeleniumUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Ass1 {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtil.setUp("chrome","https://the-internet.herokuapp.com/javascript_alerts");
		SeleniumUtil.clickOnElement(driver.findElement(By.xpath("//button[text()='Click for JS Alert']")));
		//driver.switchTo().alert().getText();
		// click on button 
		//driver.switchTo().alert().accept();
		
		//js confirm box click for JS confirm
//		String txt = driver.switchTo().alert().getText();
//		System.out.println(txt);
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		
		// js prompt box
		
		
		//SeleniumUtil.clickOnElement(driver.findElement(By.xpath("/button[text()='Click for JS Alert']")));
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().sendKeys("Kajal");
		driver.switchTo().alert().accept();
		
	}

}
