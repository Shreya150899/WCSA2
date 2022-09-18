package windowBasedpopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadUsingRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(1000);
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		WebElement fileUploadButton = driver.findElement(By.id("photofile"));
		Actions act = new Actions(driver);
		act.doubleClick(fileUploadButton).perform();
		 Robot robot = new Robot();
         StringSelection filepath = new StringSelection("file:///C:/Users/Admin/Desktop/pass.html");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
         robot.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
 	
         robot.keyPress(KeyEvent.VK_V);
         Thread.sleep(1000);
         
         robot.keyRelease(KeyEvent.VK_V);
         Thread.sleep(1000);
 	
         
         robot.keyRelease(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);


         robot.keyPress(KeyEvent.VK_ENTER);
         Thread.sleep(1000);
         
         robot.keyRelease(KeyEvent.VK_ENTER);
         Thread.sleep(1000);
        
         robot.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);
 	
         robot.keyPress(KeyEvent.VK_V);
         Thread.sleep(1000);
         
         robot.keyRelease(KeyEvent.VK_V);
         Thread.sleep(1000);
 	
         
         robot.keyRelease(KeyEvent.VK_CONTROL);
         Thread.sleep(1000);


         robot.keyPress(KeyEvent.VK_ENTER);
         Thread.sleep(1000);
         
         robot.keyRelease(KeyEvent.VK_ENTER);
         Thread.sleep(1000);

   }
}


