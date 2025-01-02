package pages.testBox;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import functionBox.FunctionClass;
import objectBox.WorkspacePom;

public class TestWorkSpace implements WorkspacePom {
	public static FunctionClass func = new FunctionClass();
	public static SoftAssert asert = new SoftAssert();

	@Test
	public void testWorkspaceSelectPage() throws InterruptedException {
		try {

			func.waitExplicitely(btnSwitchWP, "visibility", Duration.ofSeconds(5));
			func.click(btnSwitchWP);
			// func.waitExplicitely(btnTestWP, "visibility", Duration.ofSeconds(5));
			Thread.sleep(8000);
			func.click(btnTestWP);
			Thread.sleep(8000);

			// func.waitExplicitely(btnSwitchWP, "visibility", Duration.ofSeconds(5));
			func.click(btnSwitchWP);
			//func.waitExplicitely(btnEnterWP, "visibility", Duration.ofSeconds(5));
			asert.assertFalse(func.isEnabled(btnEnterWP));
			func.click(btnSWTestingWP);
			Thread.sleep(5000);
			while (func.getElementList(btnEnterWP).size() != 0) {
//				func.waitExplicitely(btnEnterWP, "elementToBeClickable", Duration.ofSeconds(10));
				asert.assertTrue(func.isEnabled(btnEnterWP));
				break;
			}
			Thread.sleep(8000);
			//func.waitExplicitely(automationTestWP, "visibility", Duration.ofSeconds(5));
			
			func.click(automationTestWP);
			//func.waitExplicitely(btnEnterWP, "elementToBeClickable", Duration.ofSeconds(5));
			Thread.sleep(5000);
			func.click(btnEnterWP);

			func.waitExplicitely(headerPage3, "visibility", Duration.ofSeconds(5));
			// Assert.assertTrue(func.displayStatus(btnCompose));
			Assert.assertTrue(func.displayStatus(headerPage3));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
