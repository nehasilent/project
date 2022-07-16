import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\FIS\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']//following::span[@class='checkmark']")).click();
		Thread.sleep(3000);
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		dropdown.selectByValue("consult");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Shop Name']")));
		List<WebElement> product = driver.findElements(By.xpath("//button[text()='Add ']"));

		//for (WebElement addb : product) {
		//	addb.click();
//
		//}
		for(int i=0;i<product.size();i++)
		{
		product.get(i).click();	
		}
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
		Thread.sleep(5000);
		String s = driver.findElement(By.xpath("//button[@class='btn btn-danger']")).getText();
		
		if (s.equalsIgnoreCase("Remove")) {
			System.out.println("Successfully landed on checkout page");
		}

		driver.close();

	}

}
