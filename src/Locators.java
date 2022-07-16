import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\FIS\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=C2fpP8Ho-Lm1o-GB64t5GpLiwEb8NzQAph4ry9J-Ik5MJXYP-FPUXhWZLVp_I5sI9MLmhFscIILa8SYqIkG-dw");
	driver.manage().window().maximize();
	/*driver.findElement(By.id("email")).sendKeys("Rahul1@gmail.com");
	driver.findElement(By.name("password")).sendKeys("rr");
	driver.findElement(By.id("remember_me")).click();
	driver.findElement(By.name("commit")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	System.out.println(driver.findElement(By.cssSelector("div.auth-flash-error")).getText());*/
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.linkText("Forgot Password")).click();
	
	//driver.manage().timeouts().
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("john@gmail.com");
	driver.findElement(By.xpath("//input[@data-testid='login-button']")).click();
	System.out.println(driver.findElement(By.xpath("//p[contains(@class,'bodySmall')][1]")).getText());
	
	
	
	
	driver.close();
	
	}

}

