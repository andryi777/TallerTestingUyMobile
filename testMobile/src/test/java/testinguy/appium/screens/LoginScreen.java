package testinguy.appium.screens;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import testinguy.appium.driver.mobileAppDriver;

public class LoginScreen {

	private By txtUser = MobileBy.xpath("//android.widget.EditText[@content-desc=\"username\"]");
	private By txtPassword = MobileBy.xpath("//android.widget.EditText[@content-desc=\"password\"]");
	private By btnLogIn = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"login\"]/android.widget.Button/android.widget.TextView");
	
	private AndroidDriver appdriver = null;

	public LoginScreen() throws MalformedURLException {
		this.appdriver = mobileAppDriver.inicializarDriver();
	}
	
	public void iniciarSesion(String user, String pass) {
		this.appdriver.findElement(txtUser).clear();
		this.appdriver.findElement(txtUser).sendKeys(user);
		
		this.appdriver.findElement(txtPassword).clear();
		this.appdriver.findElement(txtPassword).sendKeys(user);
		
		this.appdriver.findElement(btnLogIn).click();
	}
	
	public AndroidDriver getMobileDriver() {
		return appdriver;
	}
}
