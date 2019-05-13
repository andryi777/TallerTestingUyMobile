package testinguy.appium.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class SampleListScreen {

	private By opcNativeView = MobileBy.xpath("//android.widget.TextView[@content-desc=\"chainedView\"]");
	private By opcSlider = MobileBy.xpath("//android.widget.TextView[@content-desc=\"slider1\"]");
	private By opcVerticalSwiping = MobileBy.xpath("//android.widget.TextView[@content-desc=\"verticalSwipe\"]");
	private By opcDragDrop = MobileBy.xpath("//android.widget.TextView[@content-desc=\"dragAndDrop\"]");
	private By opcDoubleTap = MobileBy.xpath("//android.widget.TextView[@content-desc=\"doubleTap\"]");
	private By opcLongPress = MobileBy.xpath("//android.widget.TextView[@content-desc=\"longPress\"]");
	private By opcPhotoView = MobileBy.xpath("//android.widget.TextView[@content-desc=\"photoView\"]");
	private By opcWebView = MobileBy.xpath("//android.widget.TextView[@content-desc=\"webView\"]");
	private By opcCarousel = MobileBy.xpath("//android.widget.TextView[@content-desc=\"carousel\"]");
	private By opcWheelPicker = MobileBy.xpath("//android.widget.TextView[@content-desc=\"wheelPicker\"]");
	
	private AndroidDriver appdriver = null;

	public SampleListScreen(AndroidDriver appDriver) {
		this.appdriver = appDriver;
	}
	
	public void seleccionarNativeView() {
		this.appdriver.findElement(opcNativeView).click();

	}
	
	public void seleccionarSlider() {
		this.appdriver.findElement(opcSlider).click();

	}
	
	public void seleccionarVerticalSwiping() {
		this.appdriver.findElement(opcVerticalSwiping).click();

	}
	
	public void seleccionarDragDrop() {
		this.appdriver.findElement(opcDragDrop).click();

	}
	
	public void seleccionarDoubleTap() {
		this.appdriver.findElement(opcDoubleTap).click();

	}
	
	public void seleccionarLongPress() {
		this.appdriver.findElement(opcLongPress).click();

	}
	
	public void seleccionarPhotoView() {
		this.appdriver.findElement(opcPhotoView).click();

	}
	
	public void seleccionarWebView() {
		this.appdriver.findElement(opcWebView).click();

	}
	
	public void seleccionarCarousel() {
		this.appdriver.findElement(opcCarousel).click();

	}
	
	public void seleccionarWheelPicker() {
		this.appdriver.findElement(opcWheelPicker).click();

	}
	
}
