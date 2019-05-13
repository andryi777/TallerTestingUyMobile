package testinguy.appium.main;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testinguy.appium.screens.DragDropScreen;
import testinguy.appium.screens.LoginScreen;
import testinguy.appium.screens.SampleListScreen;
import testinguy.appium.screens.SliderScreen;
import testinguy.appium.screens.NativeViewScreen;


public class mainTest {

	private LoginScreen oLoginScreen; 
	private SampleListScreen oSampleListScreen;
	private NativeViewScreen oNativeViewScreen;
	private SliderScreen oSliderScreen;
	private DragDropScreen oDragDropScreen;

	@BeforeTest
	public void inicioClase() throws Exception {
		oLoginScreen = new LoginScreen();
		oSampleListScreen = new SampleListScreen(oLoginScreen.getMobileDriver());
		oNativeViewScreen = new NativeViewScreen(oLoginScreen.getMobileDriver());
		oSliderScreen = new SliderScreen(oLoginScreen.getMobileDriver());
		oDragDropScreen = new DragDropScreen(oLoginScreen.getMobileDriver());
	}

	static String rutaArchivo1 = "";
	
	@Parameters({"user", "pass"})
	@Test (priority=1)
	public void IniciarSesion(String usuario, String password) throws Exception {
		try {			
			oLoginScreen.iniciarSesion(usuario, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}

	@Test (priority=2)
	public void Test_NativeView() throws Exception {
		try {			
			oSampleListScreen.seleccionarNativeView();
			Thread.sleep(2000);
			oNativeViewScreen.listarElementos();
			oNativeViewScreen.regresar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
			// Assert.fail();
		}
	}
	
	@Test (priority=3)
	public void Test_Slider() throws Exception {
		try {			
			oSampleListScreen.seleccionarSlider();
			Thread.sleep(2000);
			oSliderScreen.realizar_Slide();
			oSliderScreen.regresar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
			// Assert.fail();
		}
	}
	
	@Test (priority=4)
	public void Test_DragAndDrop() throws Exception {
		try {			
			oSampleListScreen.seleccionarDragDrop();
			Thread.sleep(2000);
			
			String valorActual = oDragDropScreen.dragBoton();
			String valorEsperado = "Circle dropped";

			Assert.assertEquals(true, true);
			Assert.assertEquals(valorActual, valorEsperado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
			Assert.fail();
		}
	}
}
