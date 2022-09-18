package pageObjectModel;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingAct  {
	
	//declaration
		@FindBy(partialLinkText="Settings")private WebElement Settings;
		@FindBy(xpath="//a[contains(text(),'Billing Types')]")private WebElement BillingType;
		@FindBy(name="addLeaveType")private WebElement BillType;
		@FindBy(name="name")private WebElement Name;
		@FindBy(name="active")private WebElement Status;
		@FindBy(xpath="//input[@type='submit']")private WebElement CreateBill;
		
		//initialization
		public SettingAct(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//utilization

		public WebElement getSettings() {
			return Settings;
		}

		public WebElement getBillingType() {
			return BillingType;
		}

		public WebElement getBillType() {
			return BillType;
		}

		public WebElement getName() {
			return Name;
		}

		public WebElement getStatus() {
			return Status;
		}

		public WebElement getCreateBill() {
			return CreateBill;
		}
		//operational Method
		public void Setting() {
			Settings.click();
			BillingType.click();
			BillType.click();
			Name.sendKeys("ActBill");
			Status.click();
			CreateBill.click();
			
			
		}
		}
