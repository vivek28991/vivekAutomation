package scientificstudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account {

	public static void main(String[] args)  throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.scientificstudy.in/login#/feemis");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl().length());
		driver.findElement(By.xpath("//input[@name[starts-with(.,'txtUserName')]]")).sendKeys("Shubhambmc ");
		driver.findElement(By.xpath("(//div[@class='form-group']/input)[2]")).sendKeys("study2020");
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//a[text()=' Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='             Academic         ']")).click();
		/////Syllabus model code///////
		
		driver.findElement(By.xpath("//a[text()='Syllabus']")).click();
		WebElement e1=driver.findElement(By.xpath("//select[@id='ddlClass']"));
		e1.click();
		Select s= new Select(e1);
		s.selectByValue("number:90");
		WebElement e2=driver.findElement(By.xpath("//select[@id='ddlSubject']"));
		e2.click();
		Select s1= new Select(e2);
		s1.selectByVisibleText("English");
		driver.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys("nautan class theory");
		//driver.findElement(By.xpath("//a[text()='Browse']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-pencil'])[3]")).click();
		Thread.sleep(2000);
		
		WebElement e3=driver.findElement(By.xpath("//select[@id='ddlClass']"));
		e3.click();
		Select s3= new Select(e1);
		s3.selectByValue("number:4");
		WebElement e4=driver.findElement(By.xpath("//select[@id='ddlSubject']"));
		e4.click();
		Select s4= new Select(e2);
		s4.selectByVisibleText("Hindi");
		driver.findElement(By.xpath("//input[@id='txtTitle']")).sendKeys("class one theory");
		//driver.findElement(By.xpath("//a[text()='Browse']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("( //button[@class='btn btn-danger btn-xs'])[3]")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("( //button[@class='btn btn-danger btn-xs'])[4]")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath(" //a[text()='Send Exam Marks']")).click();
		///////Send Exam Marks model code///////
		driver.findElement(By.xpath(" //a[text()='Send Exam Marks']")).click();
		driver.findElement(By.xpath("//button[text()='Send sms for selected subjects']")).click();
		driver.findElement(By.xpath(" //button[@class='btn btn-default']")).click();
		WebElement e5= driver.findElement(By.xpath("(//div[@class='p-2']/select)[1]"));
		e5.click();
		Select s5= new  Select(e5);
		s5.selectByVisibleText("I A");
		WebElement e6= driver.findElement(By.xpath("(//div[@class='p-2']/select)[2]"));
		e6.click();
		Select s6=new Select(e6);
		s6.selectByVisibleText("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btnsearch']")).click();
	////////////////////enter marks/////////
		driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[text()='Subject Wise']")).click();
		WebElement e7 = driver.findElement(By.xpath("(//div[@class='p-2']/select)[1]"));
		e7.click();
		Select s12= new Select(e7);
		s12.selectByVisibleText("I A");
		WebElement e8 = driver.findElement(By.xpath("(//div[@class='p-2']/select)[2]"));
		e8.click();
		Select s7= new Select(e8);
		s7.selectByValue("number:1");
		WebElement e9 = driver.findElement(By.xpath("(//div[@class='p-2']/select)[3]"));
		e9.click();
		Select s8= new Select(e9);
		s8.selectByValue("number:38");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Get Marks']")).click();
//		WebElement e10 = driver.findElement(By.xpath(" (//select[@class='form-control ng-valid ng-scope ng-dirty ng-valid-parse ng-touched'])[1]"));
//		e10.click();
//		Select s9= new Select(e10);
//		s9.selectByValue("SR");
//		WebElement e11 = driver.findElement(By.xpath(" (//select[@class='form-control ng-valid ng-scope ng-dirty ng-valid-parse ng-touched'])[2]"));
//		e11.click();
//		Select s10= new Select(e11);
//		s10.selectByVisibleText("SR");
		driver.findElement(By.xpath("(//th[@class='ng-scope']/following::button)[1]")).click();
		
		
		
		
		
		
		
		
	}
	

}
