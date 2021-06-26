package scientificstudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminDocument {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
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
		driver.findElement(By.xpath("//li[@id='administration']/a")).click();
		driver.findElement(By.xpath(" (//div[@class='card_box text-center'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='School Documents']")).click();
		driver.findElement(By.xpath(" (//button[@class='btn btn-danger btn-xs'])[1]")).click();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//button[text()='OK']"));
		e1.click();
		

	}

}
