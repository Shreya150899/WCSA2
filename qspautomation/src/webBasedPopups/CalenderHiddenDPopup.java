package webBasedPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHiddenDPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cleartrip.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='px-1 plNew  flex flex-middle nmx-1 pb-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='flex flex-middle flex-between p-relative homeCalender']/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ aria-label=\"Wed Aug 24 2022\"]/descendant::div[@class='Day-grid flex flex-middle flex-column flex-top']")).click();
		Thread.sleep(2000);
	}

}
