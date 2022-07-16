import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\FIS\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys("Rocky");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rocky@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Rocky@123");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rocky@gmail.com");
		driver.findElement(By.id("exampleCheck1")).click();
		Select dropdown = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("26/06/1996");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		String msg = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
	
		String[] a=msg.split("\n");
		System.out.println(a[1]);
		

		driver.close();
	}

}
