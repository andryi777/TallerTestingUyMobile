package testinguy.appium.screens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class DragDropScreen {
	
	private By btn_DragMe = MobileBy.xpath("//android.widget.TextView[@content-desc=\"dragMe\"]");
	private By rec_dropZone = MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"dropzone\"]");
	private By lbl_Success = MobileBy.xpath("//android.widget.TextView[@content-desc=\"success\"]");
	private By btnBack = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView");
	
	private AndroidDriver appdriver = null;

	public DragDropScreen(AndroidDriver appDriver) {
		this.appdriver = appDriver;
	}
	
	public String dragBoton() {
		
		MobileElement txtDropHere= (MobileElement) this.appdriver.findElement(rec_dropZone.xpath("//*[@text=\""+"Drop here."+"\"]"));
			
		int var_DragMe_X = this.appdriver.findElement(btn_DragMe).getLocation().getX();
		int var_DragMe_Y = this.appdriver.findElement(btn_DragMe).getLocation().getY();
		int var_DropHere_X = txtDropHere.getLocation().getX();
		int var_DropHere_Y = txtDropHere.getLocation().getY();
		int var_Ancho = this.appdriver.findElement(btn_DragMe).getSize().width;
		
		System.out.println(var_DragMe_X + " - " + var_DragMe_Y + " - " + var_Ancho);
		
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(this.appdriver);
		action.longPress(PointOption.point(var_DragMe_X, var_DragMe_Y)).moveTo(PointOption.point(var_DropHere_X,var_DropHere_Y)).release().perform();

		System.out.println(this.appdriver.findElement(lbl_Success).getText());
		
		return this.appdriver.findElement(lbl_Success).getText();
	}
	
	public void regresar() {
		this.appdriver.findElement(btnBack).click();
	}
	
}
