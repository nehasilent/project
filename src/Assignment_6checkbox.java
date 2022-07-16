import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_6checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\FIS\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption2")).click();
		String dropdownOption = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(dropdownOption);
		//String aftertrim = dropdownOption.trim();
		// System.out.println(aftertrim);
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		driver.findElement(By.id("dropdown-class-example")).click();
		Thread.sleep(3000);
		dropdown.selectByVisibleText(dropdownOption);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(dropdownOption);
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		if (alertText.contains(dropdownOption)) 
		{
			System.out.println("Success");
		}

		driver.switchTo().alert().accept();

		driver.close();
	}

}
