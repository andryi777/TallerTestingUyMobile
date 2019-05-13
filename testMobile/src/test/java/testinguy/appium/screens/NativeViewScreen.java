package testinguy.appium.screens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class NativeViewScreen {
	
	private By vgHelloWorld = MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"scrollView\"]/android.view.ViewGroup");
	private By btnBack = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView");
	
	private AndroidDriver appdriver = null;

	public NativeViewScreen(AndroidDriver appDriver) {
		this.appdriver = appDriver;
	}
	
	public void listarElementos() {
		List<MobileElement> listTxts = this.appdriver.findElements(vgHelloWorld.xpath("//android.widget.TextView[@content-desc=\"textView\"]"));
						
		for(int i=0 ; i< listTxts.size(); i++) {
			System.out.println(listTxts.get(i).getText().toString());

		}
	}
	
	public void regresar() {
		this.appdriver.findElement(btnBack).click();
	}
	
}
