package scientificstudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccademicModel {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.scientificstudy.in/login#/feemis");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl().length());
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("Shubhambmc");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("study2020");
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='academic']/a")).click();
		driver.findElement(By.xpath("//ul[@id='divRecentlyUsedModule']/li/a")).click();
		//driver.findElement(By.xpath("")).click();
		/*driver.findElement(By.xpath("//select[@class='form-control']")).click();
		WebElement e1= driver.findElement(By.xpath("//select[@class='form-control']"));
		Select sc= new Select(e1);
		//sc.deselectByVisibleText("24G");
		sc.selectByValue("508");*/
		driver.findElement(By.xpath("//div[@class='p-2']/select")).click();
		WebElement e1= driver.findElement(By.xpath("//div[@class='p-2']/select"));
		Select sc= new Select(e1);
		sc.selectByValue("320");
		//sc.selectByVisibleText("B Tech I Year");
		//driver.findElement(By.xpath("//i[@class='fa fa-plus']")).click();
		driver.findElement(By.xpath("//select[@name='ddlSubject']")).click();
		WebElement e2= driver.findElement(By.xpath("//select[@name='ddlSubject']"));
		Select sc1= new Select(e2);
		sc1.selectByValue("2");
		driver.findElement(By.xpath("//select[@class='form-control'][1]")).click();
		WebElement e3= driver.findElement(By.xpath("//select[@id='ddlIsAssigned']"));
		Select sc3=new Select(e3);
		sc3.selectByValue("1");
		driver.findElement(By.xpath("//input[@id='startDate']")).click();
		/*WebElement e4=driver.findElement(By.xpath("//input[@id='startDate']"));
		Select sc4= new Select(e4);
		e4.click();
		*/
		driver.findElement(By.xpath("//input[@id='startDate']")).sendKeys("09-Jun-2021");
		driver.findElement(By.xpath("//input[@id='endDate']")).click();
		driver.findElement(By.xpath("//input[@id='endDate']")).sendKeys("09-Jun-2021");
		driver.findElement(By.xpath("//button[@id='btnSearch']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnReset']")).click();
		driver.findElement(By.xpath("//div[@class='btn-group']")).click();
		driver.findElement(By.xpath("//select[@class='form-control']")).click();
		WebElement e4= driver.findElement(By.xpath("//select[@class='form-control']"));
		Select sc4= new Select(e4);
		sc4.selectByValue("90");
		driver.findElement(By.xpath("//label[@class='left']")).click();
		driver.findElement(By.xpath("//div[@class='large-check']")).click();
		
		//for date selection mothod//
		driver.findElement(By.xpath("//input[@name='txtDate']")).click();
		driver.findElement(By.xpath("//input[@class='form-control hasDatepicker']")).sendKeys("09-Jun-2021");
		
		driver.findElement(By.xpath("//textarea[@name='Homework']")).sendKeys("Physics class");
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Theory of Niutons");
		
		//upload file
		driver.findElement(By.xpath("//a[text()='Browse']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		
		
		
	}

}
