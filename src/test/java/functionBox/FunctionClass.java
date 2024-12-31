package functionBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionClass {
	public static WebDriver driver;
	public static String value;

	public static String getHomePath() {

		return System.getProperty("user.dir");

	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();

	}

	public String[] getKeywordParam(String strParams) {

		return strParams.split("@#");

	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getElementText(WebElement ele) {
		return ele.getText();
	}

	public String getElementText(By locator) {
		WebElement ele = driver.findElement(locator);
		return ele.getText();
	}

	public String readProperties(String key) throws IOException {

		try {

			String configPath = getHomePath() + "\\config\\config.properties";
			FileInputStream fis = new FileInputStream(configPath);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return value;

	}

	public void waitExplicitely(WebElement ele, String expectedCondition, Duration time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		switch (expectedCondition) {
		case "elementToBeClickable": {
			wait.until(ExpectedConditions.elementToBeClickable(ele));
		}
		case "visibility": {
			wait.until(ExpectedConditions.visibilityOf(ele));
		}
		case "invisibility": {
			wait.until(ExpectedConditions.invisibilityOf(ele));
		}
		}

	}

	public void moveToElement(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.moveToElement(ele);
		actions.perform();
	}

	public WebDriver launchBrowser(String browserName, String url) {

		try {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
			driver.get(url);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public WebDriver launchBrowser1(String browserName, String url) {

		String os = System.getProperty("os.name").toLowerCase();

		try {
			if (browserName.equalsIgnoreCase("chrome") && os.contains("win")) {
				System.setProperty("webdriver.chrome.driver", getHomePath() + "\\resources\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				driver = new ChromeDriver(options);
				driver.get(url);

			}
			if (browserName.equalsIgnoreCase("chrome") && os.contains("mac")) {
				System.setProperty("webdriver.chrome.driver", getHomePath() + "\\resources\\chromedriver");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				driver = new ChromeDriver(options);
				driver.get(url);

			}
			if (browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", getHomePath() + "\\resources\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.get(url);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public WebElement createElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> getElementList(By locator) {
		return driver.findElements(locator);
	}

	public void dragAndDrop(WebElement src, WebElement dest) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();
	}

	public void dragAndDrop(By src, By dest) {
		WebElement ele1 = driver.findElement(src);
		WebElement ele2 = driver.findElement(dest);
		Actions act = new Actions(driver);
		act.clickAndHold(ele1);
		act.dragAndDrop(ele1, ele2).build().perform();
	}

	public void moveToElement(By locator) {
		WebElement ele = driver.findElement(locator);
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}

	public void checkRadio(WebElement ele) {
		ele.click();
	}

	public void enterText(WebElement ele, String text) {
		ele.sendKeys(text);
	}

	public void clickAndHold(By locator) {
		WebElement ele = createElement(locator);
		Actions act = new Actions(driver);
		act.clickAndHold(ele);
	}

	public void enterText(By locator, String text) {
		WebElement ele = createElement(locator);
		ele.sendKeys(text);
	}

	public void quit() {
		driver.close();
		driver.quit();
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void click(By locator) {
		WebElement ele = createElement(locator);
		ele.click();
	}

	public void click(WebElement ele) {
		ele.click();
	}

	public boolean displayStatus(By locator) {
		WebElement ele = createElement(locator);
		return ele.isDisplayed();
	}

	public boolean displayStatus(WebElement ele) {
		return ele.isDisplayed();
	}

	public void selectByIndex(By locator, int index) {
		WebElement ele = createElement(locator);
		Select s = new Select(ele);
		s.selectByIndex(index);
	}

	public void switchToLatestWindow() {
		List<String> windowList = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowList.get(windowList.size() - 1));

	}

	public void selectByText(By locator, String text) {
		WebElement ele = createElement(locator);
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}

	public void selectByValue(By locator, String value) {
		WebElement ele = createElement(locator);
		Select s = new Select(ele);
		s.selectByValue(value);
	}

	public void scrollIntoView(By locator) {
		WebElement ele = createElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

	}

	public Set<String> getKeySet(Map<String, String> map) {
		return map.keySet();
	}

	public Map<String, String> createDetailsMap(By locator) {
		List<String> strList = new ArrayList<String>();

		for (WebElement ele : driver.findElements(locator)) {
			strList.add(ele.getText());
		}

		Map<String, String> productDetailsMap = new HashMap<String, String>();

		for (int i = 0; i < strList.size(); i++) {
			if (i % 2 == 0) {
				productDetailsMap.put(strList.get(i), strList.get(i + 1));
			}
		}
		return productDetailsMap;

	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public boolean checkBrokenLink(By locator) throws IOException {
		boolean isBroken = false;

		WebElement ele = driver.findElement(locator);
		System.out.println(ele.getAttribute("href"));
		if (ele.getAttribute("href") != null)
			try {
				URL url = new URL(ele.getAttribute("href"));
				HttpURLConnection connect = (HttpURLConnection) url.openConnection();
				connect.setRequestMethod("HEAD");
				int statusCode = connect.getResponseCode();
				if (statusCode >= 403) {
					isBroken = true;
				} else {
					isBroken = false;
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

		return isBroken;
	}

	public void checkBrokenLinks() throws IOException {
		List<WebElement> eleList = driver.findElements(By.tagName("a"));
		List<String> urlList = new ArrayList<String>();
		for (WebElement ele : eleList) {
			// urlList.add(ele.getAttribute("href"));
			if (ele.getAttribute("href") != null)
				try {
					URL url = new URL(ele.getAttribute("href"));
					HttpURLConnection connect = (HttpURLConnection) url.openConnection();
					connect.setRequestMethod("HEAD");
					int statusCode = connect.getResponseCode();
					if (statusCode >= 403) {
						System.out.println("Brokem Link: " + ele.getAttribute("href") + " Status Code :" + statusCode);
						// (ele.getAttribute("href"));
						urlList.add(ele.getAttribute("href"));
					}
					if (urlList.size() == 0) {
						System.out.println("No Broken Links in page");
					}

				} catch (MalformedURLException e) {

					e.printStackTrace();
				}

		}
	}
}
