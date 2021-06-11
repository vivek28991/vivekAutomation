package scientificstudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadApk {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.scientificstudy.in/login#/feemis");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle().length());
		System.out.println(driver.getCurrentUrl().length());
		//driver.findElement(By.xpath("//span[text()='Download Now']")).click();
		//driver.findElement(By.xpath(" (//div[@class='btn btn-medium btn-border c-primary btn-hover-shadow'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='btn btn-medium btn-border c-primary btn-hover-shadow'])[2]")).click();
		//driver.findElement(By.xpath("//a[text()='School Key : ']")).click();
	}

}
