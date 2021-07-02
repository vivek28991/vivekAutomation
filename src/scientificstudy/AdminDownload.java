package scientificstudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminDownload {
	public static String parent, child1,child2;
	public static Set<String> all;
	public static Iterator<String> i;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.scientificstudy.in/login#/feemis");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl().length());
		parent=driver.getWindowHandle();
		System.out.println("value of alphanumeric of parent"+parent);
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("Shubhambmc");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("study2020");
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' Continue']")).click();
		driver.findElement(By.xpath("//li[@id='administration']/a")).click();
		driver.findElement(By.xpath("//ul[@id='divRecentlyUsedModule']/li/a")).click();
		driver.findElement(By.xpath("//a[text()='Registration Form']")).click();
		
		
	  
		/*WebElement dropdown = driver.findElement(By.xpath("//div[@class='col-sm-6']/div/select"));
		Select vl= new Select(dropdown);
		vl.selectByVisibleText("B Tech I Year");*/
		/*driver.findElement(By.xpath("//button[@class='btn btn-info dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[text()='Teacher Audit Report']")).click();
		Thread.sleep(2000);*/
		
		/*WebElement dropvalue = driver.findElement(By.xpath("//select[@id='ddlPaymentMode']"));
		Select sltvalue= new  Select(dropvalue);
		sltvalue.selectByVisibleText("Mobile");*/
		
		driver.findElement(By.xpath("//button[@class='btn btn-info dropdown-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Parent Audit Report']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-file-pdf-o']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-file-excel-o']")).click();
		Thread.sleep(2000);
		all=driver.getWindowHandles();
		System.out.println(all.size());
		i=all.iterator();
		while(i.hasNext())
		{
			child1=i.next();
			if(!parent.equals(child1))
			{
				driver.switchTo().window(child1);
			}
		}
		///teacher audit///
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//button[@class='btn btn-info dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[text()='Teacher Audit Summary']")).click();
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='search']")).click();
		////teacher parent audit report\\\\
		driver.findElement(By.xpath("//button[@class='btn btn-info dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[text()='Teacher Parent Audit Report ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Download Excel']")).click();
		
		///teacher parent Audit list//////
		driver.findElement(By.xpath("//button[@class='btn btn-info dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[text()='Teacher Parent Audit List ']")).click();
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
		//driver.findElement(By.xpath("//button[text()='OK']")).click();
	///////////////////////
		
		driver.findElement(By.xpath("//button[@class='btn btn-info dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[text()='Student']")).click();
		
		driver.findElement(By.xpath("//a[text()='Teacher']")).click();
		
		
		
		
	}

}
