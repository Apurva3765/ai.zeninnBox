package pages.testBox;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import functionBox.FunctionClass;
import objectBox.LoginPagePom;
import utilsBox.DataProviders;
import utilsBox.ExtentReportManager;

public class TestClass implements LoginPagePom {

	public static FunctionClass func = new FunctionClass();
	public static SoftAssert asert = new SoftAssert();
	public static ExtentReportManager report;

	@Test(priority = 2)
	@Parameters("strParamLogin")
	public void testLogin(String strParamLogin) {
		try {

			String email = func.getKeywordParam(strParamLogin)[0];
			String password = func.getKeywordParam(strParamLogin)[1];

			func.enterText(txtWorkEmail, email);
			func.enterText(txtPassword, password);
			func.click(btnLogin);
			Thread.sleep(5000);
			func.waitExplicitely(logoPage2, "elementToBeClickable", Duration.ofSeconds(6));
			Assert.assertTrue(func.displayStatus(logoPage2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 1)
	@Parameters("strParamLaunch")
	public void visibilityOfAllElements(String strParamLaunch) {

		String browser = func.getKeywordParam(strParamLaunch)[0];
		String url = func.getKeywordParam(strParamLaunch)[1];

		try {
			func.launchBrowser(browser, url);
			
			func.waitExplicitely(btnLogin, "elementToBeClickable", Duration.ofSeconds(4));
			func.displayStatus(btnLogin);
			func.displayStatus(btnShowPW);
			func.displayStatus(lblNoAcc);
			func.displayStatus(lblOR);
			func.displayStatus(linkFP);
			func.displayStatus(linkTryFree);
			func.displayStatus(logoZeninBox);
			func.displayStatus(pageName);
			func.displayStatus(ssoGoogle);
			func.displayStatus(ssoMS);
			func.displayStatus(txtPassword);
			func.displayStatus(txtWorkEmail);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterSuite
	public void tearDown() {
		try {
		//	func.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
