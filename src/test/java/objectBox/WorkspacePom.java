package objectBox;

import org.openqa.selenium.By;

public interface WorkspacePom {
	public static By logoPage2 = By.xpath("//*[@alt='Octet Design Studio']");
	public static By btnLogOut = By.tagName("(//*[@xmlns='http://www.w3.org/2000/svg']/parent::button)[1]");
	public static By btnSwitchWP = By.xpath("//*[@role='combobox']");
	public static By btnSWTestingWP = By.xpath("(//*[@role='option'])[1]");
	public static By btnTestWP = By.xpath("(//*[@role='option'])[2]");
	//public static By btnTestWP = By.id("radix-:re:");
	
	public static By btnCreateWP = By.xpath("//button[contains(text(),'Create')]");
	public static By lblNoWP = By.xpath("//*[text()='No Workspace found']");
	public static By txtSearchWP = By.xpath("//*[@placeholder='Search workspace']");

	public static By automationTestWP = By.xpath("//*[text()='Automation testing']");
	public static By imgAvtar = By.xpath("//img[@alt='avatar']");
	public static By secAutoTestingWP = By.xpath("//*[contains(@class,'p-4 border rounded-lg h')]");
	public static By btnEnterWP = By.xpath("//button[contains(text(),'Enter W')]");
	public static By headerPage3 = By.xpath("//*[text()='Software-testing']");
}
