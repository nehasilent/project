import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class AssignmentCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\FIS\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		int a = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("Count of checkboxes present on web:" + a);
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(3000);
		boolean s = driver.findElement(By.id("checkBoxOption1")).isSelected();
		Assert.assertTrue(s);
		System.out.println("First checkbox selected=" + s);
		driver.findElement(By.id("checkBoxOption1")).click();
		boolean s1 = driver.findElement(By.id("checkBoxOption1")).isSelected();
		System.out.println("First checkbox selected=" + s1);
		Assert.assertFalse(s1);

		driver.close();

	}
}
