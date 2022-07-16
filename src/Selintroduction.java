import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {

	public static void main(String[] args) {
		// Chrome browser 
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\FIS\\chromedriver.exe");
//WebDriver driver= new ChromeDriver();
		
	//Firefox browser	
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\FIS\\geckodriver.exe");
//WebDriver driver= new FirefoxDriver();
	
		//microsoft edge  browser	
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\FIS\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();		
		 
driver.get("https://rahulshettyacademy.com");
driver.getTitle();
System.out.println(driver.getTitle());
driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());
driver.close();
//driver.quit();
}

}
