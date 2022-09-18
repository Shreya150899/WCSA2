package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserRTP {

	private static Scanner sc;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		sc = new Scanner(System.in);

		System.out.println("enter the browser name,chrome or firefox");
		String browserValue = sc.nextLine();
		//browservalue variable contains the name of browser which is supposed to be opened
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();//max the browser
			driver.get("https://www.google.com");//launch the browser
			Thread.sleep(5000);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();//max the browser
			driver.get("https://www.google.com");//launch the browser
			Thread.sleep(5000); 

		}
		else
		{
			System.out.println("type the valid");
		}

	}

}
