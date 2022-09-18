package frameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("chat-widget");
	    driver.findElement(By.xpath("//p[contains(text(),'CHAT')]")).click();
	    driver.findElement(By.id("name")).sendKeys("Shreya Somwanshi");
	    Thread.sleep(1000);
	    driver.findElement(By.id("email")).sendKeys("shreyasomwanshi2018@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//input[@class='lc-22twvl e1xplv9i0'])[3]")).sendKeys("9970304039");
}

}
