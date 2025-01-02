package utilsBox;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import functionBox.FunctionClass;

public class ListenersClass implements ITestListener {

	public static LogManager lgmngr = LogManager.getLogManager();
	public static Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
//	public static Date date = new Date();
//	public static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");

	@Override
	public void onFinish(ITestContext contextFinish) {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
		String formattedDate = sdf.format(date);
		log.log(Level.INFO, "Test Execution for Amazon product page ended : @" + formattedDate);
//		log.log(Level.INFO, "To get Allure report for the test run in cmd : allure serve "
//				+ System.getProperty("user.dir") + "\\allure-results");
		System.out.println("To get Allure report for the test run in cmd : allure serve "
				+ System.getProperty("user.dir") + "\\allure-results");
	}

	@Override
	public void onStart(ITestContext contextStart) {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
		String formattedDate = sdf.format(date);
		log.log(Level.INFO, "Test Execution for Amazon product page started : @" + formattedDate);

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		try {
			int x = new Random().nextInt();
			String path = System.getProperty("user.dir") + "\\screenshots\\screenShot" + x + ".jpeg";
			File src = ((TakesScreenshot) FunctionClass.driver).getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			FileHandler.copy(src, dest);
			log.log(Level.INFO, "Test Failed scrrenshot : " + path);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			int x = new Random().nextInt();
			String path = System.getProperty("user.dir") + "\\screenshots\\screenShot" + x + ".jpeg";
			File src = ((TakesScreenshot) FunctionClass.driver).getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			FileHandler.copy(src, dest);
			log.log(Level.INFO, "Test Failed scrrenshot : " + path);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {

	}

}