package Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.SeleniumUtil;
public class ActiTimeOps {
	public static void main(String[] args) {
		  WebDriver driver=SeleniumUtil.setUp("chrome","https://demo.actitime.com/login.do");
		     //enter application URL
		  SeleniumUtil.typeInput(driver.findElement(By.cssSelector("#username")), "Admin");
		  SeleniumUtil.typeInput(driver.findElement(By.cssSelector("#loginFormContainer > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(2) > td > input")), "manager");

		  //#loginButton > div
		  WebElement btn=driver.findElement(By.cssSelector("#loginButton > div"));
		  btn.click();
		       //click on Add btn //span[text()='New']
		  driver.findElement(By.xpath("/html/body/div[16]/form/table/tbody/tr/td/table[1]/tbody/tr[3]/td[1]/table/tbody/tr/td[7]/div/div[2]/span")).click();
		  //select drop down list
		  WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div[1]/div"));
		  
		  Select s=new Select(dropdown);
		  //List<WebElement> options=s.getOptions();
		  s.getFirstSelectedOption().click();
		  //Enter customer name
		  driver.findElement(By.cssSelector("input[placeholder='Enter Customer Name']"));
		  //enter project name
		  driver.findElement(By.cssSelector("input[placeholder='Enter Project Name']"));
		  //enter task name
		  driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("dailyUpdate");
		  //cliick on create task btn
		  driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
		  //click on task 
		  driver.findElement(By.xpath("/html/body/div[16]/form/table/tbody/tr/td/table[2]/tbody[2]/tr[1]/td[2]/div/div[2]/div[1]/div[1]/div")).click();
		  //click on actions
		  driver.findElement(By.xpath("//div[text()='ACTIONS']")).click();
		  //click for delete
		  driver.findElement(By.xpath("//div[text()='Delete']")).click();
		
	}

}
