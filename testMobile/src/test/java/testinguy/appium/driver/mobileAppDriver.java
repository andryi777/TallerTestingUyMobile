package testinguy.appium.driver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class mobileAppDriver {

	public final static AndroidDriver<?> inicializarDriver() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = null;

		File appDir = new File("apk");
		File app = new File(appDir, "VodQA.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "Samsung Galaxy S9");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("automationName", "UiAutomator2");

		// capabilities.setCapability("unicodeKeyboard", "true");
		// capabilities.setCapability("resetKeyboard", "true");

		capabilities.setCapability("app", app.getAbsolutePath());
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}

	public static void waitForPageLoaded(WebDriver driver) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
	}

	public static MobileElement mobileElement;
	public static boolean isElementPresent;

//	public static boolean waitForPresence(AndroidDriver driver, int timeLimitInSeconds, String targetResourceId) {
//
//		try {
//			mobileElement = (MobileElement) driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"" + targetResourceId + "\")");
//			WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
//			wait.until(ExpectedConditions.visibilityOf(mobileElement));
//			isElementPresent = mobileElement.isDisplayed();
//			return isElementPresent;
//		} catch (Exception e) {
//			isElementPresent = false;
//			System.out.println(e.getMessage());
//			return isElementPresent;
//		}
//	}
	
}
