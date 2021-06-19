package scientificstudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountModel {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.scientificstudy.in/login#/feemis");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl().length());
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("Shubhambmc");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("study2020");
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Continue']")).click();
		driver.findElement(By.xpath("//a[text()='             Accounts         ']")).click();
		driver.findElement(By.xpath(" (//button[@class='btn btn-info dropdown-toggle'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Stock Group']")).click();
		driver.findElement(By.xpath("//input[@id='txtCategoryName']")).sendKeys("DAV Public School");
		driver.findElement(By.xpath("//input[@id='txtDesc']")).sendKeys("school details");
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm btn-level']")).click();
		//driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-xs'])[5]")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn-danger btn-xs'])[5]")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		/*driver.findElement(By.xpath("//a[text()='Stock Group']")).click();
		driver.findElement(By.xpath("//a[text()='Sale Group']")).click();
		driver.findElement(By.xpath("//a[text()='Single Item Creation ']")).click();
		driver.findElement(By.xpath("//a[text()='Multi Item Creation ']")).click();
		driver.findElement(By.xpath("//a[text()='Set Opening Stock']")).click();
		driver.findElement(By.xpath("//a[text()='Set Opening Stock']")).click();
		driver.findElement(By.xpath("//a[text()='Set Sale Price']")).click();
		driver.findElement(By.xpath("//a[text()='Unit Of Measurement']")).click();
		driver.findElement(By.xpath("")).click();*/
		driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-xs'])[1]")).click();
		
		

	}

}
