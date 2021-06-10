package scientificstudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ForgetPassword {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.scientificstudy.in/login#/feemis");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl().length());
		driver.findElement(By.xpath("//input[@class='form-control usernameinput']")).sendKeys("Shubhambmc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Forgot your credentials?')]")).click();
		driver.findElement(By.xpath("//select[@id='ddlSchoolId']/option")).click();
		Thread.sleep(5000);
		WebElement dropdown= driver.findElement(By.xpath("//select[@id='ddlSchoolId']"));
		Select sc= new Select(dropdown);
		//sc.deselectByIndex(2);
		//sc.selectByIndex(1);
		//sc.selectByValue("Demo Public School");
		//sc.selectByIndex(2);
		sc.selectByValue("1");
		//sc.selectByVisibleText("Demo Public School");
		driver.findElement(By.xpath("//select[@name='Profile']")).click();
		Thread.sleep(2000);
		WebElement Dropdown2= driver.findElement(By.xpath("//select[@name='Profile']"));
		Select sc1= new Select(Dropdown2);
		sc1.selectByVisibleText("Teacher");
		//sc1.selectByVisibleText("Parent");
		//sc1.selectByValue("Parent");
		driver.findElement(By.xpath("//input[@id='Mobile']")).sendKeys("9123382981");
		//driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("mobiletest783@gmail.com");
		//driver.findElement(By.xpath("//span[@class='semicircle']")).click();
		driver.findElement(By.xpath("//body/section[@id='fa_pricing']/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/button[1]/div[1]")).click();
		driver.findElement(By.xpath("//a[@class='forgetpass']")).click();
		
		
		
		

	}

}
