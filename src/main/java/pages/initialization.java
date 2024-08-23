package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class initialization {
	
public void Login() throws InterruptedException{
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\navee\\eclipse-workspace\\pro_1\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in/");
	
	int timeoutInSeconds = 30;
	Duration duration = Duration.ofSeconds(timeoutInSeconds);
	driver.manage().timeouts().implicitlyWait(duration);
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Headphones");
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(5000);
	
	WebElement A = driver.findElement(By.id("nav-cart-count"));
	Actions builder = new Actions(driver);
	builder.click(A).perform();
	

	
	
}

}
