package scientificstudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminCalendar {

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
		//driver.findElement(By.xpath("//a[text()=' Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //li[@id='administration']/a")).click();
		driver.findElement(By.xpath("(//div[@class='col-sm-3 ng-scope']/a/div)[1]")).click();
		driver.findElement(By.xpath("//button[text()='week']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='day']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='list week']")).click();
		driver.findElement(By.xpath("//a[@class='btn-new btn-dark backbtn']")).click();
		driver.findElement(By.xpath("(//div[@class='card_box text-center'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Upload Documents']")).click();
		WebElement Dropdnaudions = driver.findElement(By.xpath("(//select[@id='ddlAudience'])[1]"));
		Select vl= new Select(Dropdnaudions);
		vl.selectByVisibleText("School");
		WebElement drodnType = driver.findElement(By.xpath("(//label[@class='sm']/following::select)[2]"));
		Select vl1= new Select(drodnType);
		vl1.selectByVisibleText("Private");
		Thread.sleep(3000);
		/*WebElement fileupload = driver.findElement(By.xpath("//input[@type='file']"));
		fileupload.click();
		fileupload.sendKeys("D://vivek//cv//SQA_Vivek kumar.docx"); 
		*/
		
		///school document///
		
		driver.findElement(By.xpath("//a[text()='School Documents']")).click();
		WebElement dropdwn1 = driver.findElement(By.xpath("(//div[@class='p-2']/select)[1]"));
		//WebElement dropdwn1 = driver.findElement(By.xpath("(//div[@class='p-2'])[1]"));
		Select S= new Select(dropdwn1);
		S.selectByVisibleText("Private");
		WebElement dropdwn2 = driver.findElement(By.xpath("(//div[@class='p-2']/select)[2]"));
		Select s1= new Select(dropdwn2);
		s1.selectByVisibleText("Greetings");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm btn-level']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-sm btn-level']")).click();
		WebElement download = driver.findElement(By.xpath("//a[@class='btn btn-success btn-xs green']"));
		download.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-danger btn-xs'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Cancel'])[1]")).click();
		
		///driver document////
		//driver.findElement(By.xpath("//a[text()='Driver Documents']")).click();
		
		driver.findElement(By.xpath("//a[text()='Teacher Documents']")).click();
		WebElement Dropdwnteacher = driver.findElement(By.xpath(" (//select[@class='form-control ng-pristine ng-untouched ng-valid'])[1]"));
		Select Selecteacher= new Select(Dropdwnteacher);
		Selecteacher.selectByVisibleText("PJK TEACHER 1");
		//Selecteacher.selectByValue("number:181");
		WebElement dropdowncategry = driver.findElement(By.xpath("(//div[@class='p-2']/select)[2]"));
		Select Selectcotegory= new Select(dropdowncategry);
		Selectcotegory.selectByVisibleText("ADAHAR CARD");
		driver.findElement(By.xpath("(//div[@class='p-2']/button)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='p-2']/button)[2]")).click();
		//driver.findElement(By.xpath("(//td[@class='col-sm-1']/a)[1]")).click();
		//driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-trash'])[1]")).click();
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(2000);*/
		
		///////////student details///////
		
		driver.findElement(By.xpath("(//div[@class='btn-group']/button)[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Student Class Wise Report']")).click();
		WebElement dropdwnclass = driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]"));
		Select selectclass = new Select(dropdwnclass);
		//selectclass.selectByVisibleText("II A");
		selectclass.selectByValue("number:309");
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/select[1]"));
		Select s= new Select(findElement);
		s.selectByValue("number:1");
		//s.selectByVisibleText("Character Certificate");
		driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
		
		
		
		
		
	}

}
