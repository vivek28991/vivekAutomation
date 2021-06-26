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
		driver.findElement(By.xpath("//a[text()=' Continue']")).click();
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
		WebElement drodnType = driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']"));
		Select vl1= new Select(drodnType);
		vl1.selectByVisibleText("Private");
		Thread.sleep(3000);
		WebElement fileupload = driver.findElement(By.xpath("//input[@type='file']"));
		fileupload.click();
		fileupload.sendKeys("D:\\vivek\\cv\\SQA_Vivek kumar.doc"); 
	}

}
