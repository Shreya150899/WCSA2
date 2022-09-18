package operationalMethodsOfDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/htmldocument/multiselectdropdown.html");
		WebElement multiselectedd = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectedd);
		
		for (int i=2;i<6;i++)
		{
			sel.selectByIndex(i);
		}
		List<WebElement >allSelectedOps = sel.getAllSelectedOptions();
		
		for(WebElement op:allSelectedOps)
		{
			String text = op.getText();
			System.out.println(text);
		}
	}

}
