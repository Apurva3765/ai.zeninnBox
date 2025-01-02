package pages.testBox;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objectBox.InboxPOM;
import functionBox.FunctionClass;
import objectBox.WorkspacePom;

public class TestInbox implements InboxPOM {

	public static FunctionClass func = new FunctionClass();
	public static SoftAssert asert = new SoftAssert();

	@Test(priority = 0)
	public void testCalender() throws InterruptedException {
		try {
			// func.waitExplicitely(btnCalander, "visibility", Duration.ofSeconds(10));
			Thread.sleep(8000);

			func.click(btnCalander);

			Thread.sleep(8000);
			Assert.assertTrue(func.displayStatus(btnCreateEvent));
			Thread.sleep(8000);
			func.click(btnConv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 1)
	public void testSearchFunctionality() throws InterruptedException {
		try {
			func.click(txtSearchBar);
			Thread.sleep(8000);

			func.enterText(txtSearchBySender, "Google");
			func.click(btnSearch);
			Thread.sleep(8000);

			String searchResltSender = func.getElementText(searchResults);
			System.out.println(searchResltSender);
			Assert.assertTrue(searchResltSender.contains("Google"));
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Test(priority = 2)
	public void testDeleteFunctionality() throws InterruptedException {

		try {
			func.moveToElement(searchResults);
			func.moveToElement(btnDeleteMail);

			asert.assertTrue((func.getElementList(callOutDelete).size() == 0));

			func.click(btnDeleteMail);
			Thread.sleep(8000);
			Assert.assertTrue(func.displayStatus(popUpDeleteMail));
			Thread.sleep(8000);
			func.click(btnContinueDelete);

			func.click(btnDiscard);
			Thread.sleep(8000);
			func.click(tabTrash);
			Thread.sleep(4000);
			System.out.println(func.getElementText(trashContent1));

			List<String> list = new ArrayList<String>();
			for (WebElement ele : func.getElementList(trashContentlist)) {
				list.add(ele.getText());
			}
			Assert.assertTrue(list.contains(func.getElementText(searchResultText)));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
