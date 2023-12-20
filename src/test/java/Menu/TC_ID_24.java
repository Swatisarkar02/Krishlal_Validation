package Menu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Launch_App.Launch_App_Advance;
import Launch_App.Login_User1;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

@Test
public class TC_ID_24 extends Launch_App_Advance {
	
	@Test	
	public void Login () throws InterruptedException {
		Login_User1 Test = new Login_User1();
		Test.Login_User1_Seller();	
	
	}
@Test	
	public void TC_ID_24_01 () throws InterruptedException {
		
	TouchAction Profile = new TouchAction(driver);

	Profile.tap(PointOption.point(957, 205)).perform();
			
	Thread.sleep(5000);
	
	TouchAction eNammandi = new TouchAction(driver);

	eNammandi.tap(PointOption.point(365, 1002)).perform();
		
	Thread.sleep(5000);
		
	

   	// Click on Mandi_Rate_Button_Changes
	
	
	TouchAction Mandi_Rate_Button_Changes = new TouchAction(driver);

	Mandi_Rate_Button_Changes.tap(PointOption.point(503, 745)).perform();
		
	Thread.sleep(5000);

 	 //WebElement Mandi_Rate_Button_Changes= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]"));

 	 //Assert.assertEquals(true, Mandi_Rate_Button_Changes.isDisplayed());

     System.out.println("Mandi_Rate_Button_Changes is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);
   	 
  	TouchAction SubmitButton = new TouchAction(driver);

  	SubmitButton.tap(PointOption.point(182, 1281)).perform();
		
	Thread.sleep(5000);
   	 
	 System.out.println("Please fill out this field = True");
   	 
	 Thread.sleep(5000);

     //Mandi_Rate_Button_Changes.click();

}

@Test
 public void TC_ID_24_02 () throws InterruptedException {	 
   
	 //From Date_field

   	TouchAction From_Date = new TouchAction(driver);

   	From_Date.tap(PointOption.point(447, 443)).perform();
		
	Thread.sleep(5000);
   	 
   	 //WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));

     //Assert.assertEquals(true, Date_field.isDisplayed());

     System.out.println("Date_field is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

   	 //Year

   	 WebElement Year= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease year\"]"));

     Year.click();

   	 Thread.sleep(5000);

    //Day

   	 WebElement Day= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease day\"]"));

     Day.click();

   	 Thread.sleep(5000);

   	 //Set

   	 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

   	 Set.click();

     //To_Date

	 WebElement To_Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));

	 Assert.assertEquals(true, To_Date.isDisplayed());

	 System.out.println("To_Date is displayed = True");

	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	 Thread.sleep(3000);

	 To_Date.click();

	 Thread.sleep(5000);

 	 //Set

     WebElement Set_click= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

 	 Set_click.click();

 	 //APMC_Select

     WebElement APMC_Select= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]"));

     APMC_Select.click();

     Thread.sleep(5000);

     //Select_Aabu Road

     WebElement Select_AabuRoad= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));

     Select_AabuRoad.click();

     Thread.sleep(5000);

 	 //Commodity_Set_1

 	 WebElement Commodity_Set_1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]"));

 	Commodity_Set_1.click();

 	 Thread.sleep(5000);

 	 //Apple

	 WebElement Apple= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));

	 Apple.click();

 	 Thread.sleep(5000);

   	 //Submit_buttn

   	 WebElement Submit_buttn= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

   	 Submit_buttn.click();

   	 Thread.sleep(5000);

	 driver.navigate().back();

 	 Thread.sleep(7000);
		
}

 @Test 

public void TC_ID_24_03 () throws InterruptedException {
	
	TouchAction eNammandi = new TouchAction(driver);

	eNammandi.tap(PointOption.point(365, 1002)).perform();
		
	Thread.sleep(5000);

   	// Click on Mandi_Rate_Button_Changes
	
	
	TouchAction Mandi_Rate_Button_Changes = new TouchAction(driver);

	Mandi_Rate_Button_Changes.tap(PointOption.point(506, 756)).perform();
		
	Thread.sleep(5000);

 	 //WebElement Mandi_Rate_Button_Changes= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]"));

 	 //Assert.assertEquals(true, Mandi_Rate_Button_Changes.isDisplayed());

     System.out.println("Mandi_Rate_Button_Changes is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

     //Mandi_Rate_Button_Changes.click();

    //From Date_field

   	TouchAction From_Date = new TouchAction(driver);

   	From_Date.tap(PointOption.point(503, 462)).perform();
		
	Thread.sleep(5000);
   	 
   	 //WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));

     //Assert.assertEquals(true, Date_field.isDisplayed());

     System.out.println("Date_field is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

   	 //Date_field.click();

   	 //Thread.sleep(5000);

   	 //Year

   	 WebElement Year= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease year\"]"));

     Year.click();

   	 Thread.sleep(5000);

    //Day

   	 WebElement Day= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease day\"]"));

     Day.click();

   	 Thread.sleep(5000);

   	 //Set

   	 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

   	 Set.click();

     //To_Date

   	 WebElement To_Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));

     Assert.assertEquals(true, To_Date.isDisplayed());

    System.out.println("To_Date is displayed = True");

    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    Thread.sleep(3000);

	To_Date.click();

    Thread.sleep(5000);

 	 //Set

     WebElement Set_click= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

 	 Set_click.click();

 	 //APMC_Select

     WebElement APMC_Select= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]"));

     APMC_Select.click();

     Thread.sleep(5000);

     //Select_Aatpadi

     WebElement Select_Aatpadi= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));

     Select_Aatpadi.click();

     Thread.sleep(5000);

 	 //Commodity_Set_1

 	 WebElement Commodity_Set_1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]"));

 	Commodity_Set_1.click();

 	 Thread.sleep(5000);

 	 //Pomegranate

	 WebElement Pomegranate= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));

	 Pomegranate.click();

 	 Thread.sleep(5000);

   	 //Submit_buttn

   	 WebElement Submit_buttn= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

   	Submit_buttn.click();

   	 Thread.sleep(5000);

   	  driver.navigate().back();

 	 Thread.sleep(7000);
	
}

@Test

public void TC_ID_24_04 () throws InterruptedException {
	
	TouchAction eNammandi = new TouchAction(driver);

	eNammandi.tap(PointOption.point(365, 1002)).perform();
		
	Thread.sleep(5000);

   	// Click on Mandi_Rate_Button_Changes
	
	TouchAction Mandi_Rate_Button_Changes = new TouchAction(driver);

	Mandi_Rate_Button_Changes.tap(PointOption.point(506, 756)).perform();
		
	Thread.sleep(5000);

 	 //WebElement Mandi_Rate_Button_Changes= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]"));

 	 //Assert.assertEquals(true, Mandi_Rate_Button_Changes.isDisplayed());

     System.out.println("Mandi_Rate_Button_Changes is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

     //Mandi_Rate_Button_Changes.click();

    //From Date_field

   	TouchAction From_Date = new TouchAction(driver);

   	From_Date.tap(PointOption.point(503, 462)).perform();
		
	Thread.sleep(5000);
   	 
   	 //WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));

     //Assert.assertEquals(true, Date_field.isDisplayed());

     System.out.println("Date_field is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

   	 //Date_field.click();

   	 //Thread.sleep(5000);

   	 //Year

   	 WebElement Year= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease year\"]"));

     Year.click();

   	 Thread.sleep(5000);

    //Day

   	 WebElement Day= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease day\"]"));

     Day.click();

   	 Thread.sleep(5000);

   	 //Set

   	 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

   	 Set.click();

     //To_Date

   	 WebElement To_Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));

     Assert.assertEquals(true, To_Date.isDisplayed());

    System.out.println("To_Date is displayed = True");

    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    Thread.sleep(3000);

	To_Date.click();

    Thread.sleep(5000);

 	 //Set

     WebElement Set_click= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

 	 Set_click.click();

 	 //APMC_Select

     WebElement APMC_Select= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]"));

     APMC_Select.click();

     Thread.sleep(5000);

     //Select_Abohar

     WebElement Select_Abohar= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"));

     Select_Abohar.click();

     Thread.sleep(5000);

 	 //Commodity_Set_1

 	 WebElement Commodity_Set_1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]"));

 	Commodity_Set_1.click();

	 Thread.sleep(5000);

 	 //Cotton

	 WebElement Cotton= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));

	 Cotton.click();

 	 Thread.sleep(5000);

   	 //Submit_buttn

   	 WebElement Submit_buttn= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

   	Submit_buttn.click();

   	 Thread.sleep(5000);

   	  driver.navigate().back();

 	 Thread.sleep(7000);
	
}

@Test

public void TC_ID_24_05 () throws InterruptedException {
	
	TouchAction eNammandi = new TouchAction(driver);

	eNammandi.tap(PointOption.point(365, 1002)).perform();
		
	Thread.sleep(5000);
	
   	// Click on Mandi_Rate_Button_Changes
		
	TouchAction Mandi_Rate_Button_Changes = new TouchAction(driver);

	Mandi_Rate_Button_Changes.tap(PointOption.point(506, 756)).perform();
		
	Thread.sleep(5000);

 	 //WebElement Mandi_Rate_Button_Changes= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]"));

 	 //Assert.assertEquals(true, Mandi_Rate_Button_Changes.isDisplayed());

     System.out.println("Mandi_Rate_Button_Changes is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

     //Mandi_Rate_Button_Changes.click();

    //From Date_field

   	TouchAction From_Date = new TouchAction(driver);

   	From_Date.tap(PointOption.point(503, 462)).perform();
		
	Thread.sleep(5000);
   	 
   	 //WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));

     //Assert.assertEquals(true, Date_field.isDisplayed());

     System.out.println("Date_field is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

   	 //Date_field.click();

   	 //Thread.sleep(5000);

   	 //Year

   	 WebElement Year= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease year\"]"));

     Year.click();

   	 Thread.sleep(5000);

    //Day

   	 WebElement Day= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease day\"]"));

     Day.click();

   	 Thread.sleep(5000);

   	 //Set

   	 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

   	 Set.click();

     //To_Date

   	 WebElement To_Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));

     Assert.assertEquals(true, To_Date.isDisplayed());

    System.out.println("To_Date is displayed = True");

   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   Thread.sleep(3000);

	To_Date.click();

    Thread.sleep(5000);

 	 //Set

     WebElement Set_click= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

 	 Set_click.click();

 	 //APMC_Select

     WebElement APMC_Select= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]"));

     APMC_Select.click();

     Thread.sleep(5000);

     //Select_Achampet

     WebElement Select_Achampet= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));

     Select_Achampet.click();

     Thread.sleep(5000);

 	 //Commodity_Set_1

 	 WebElement Commodity_Set_1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]"));

 	Commodity_Set_1.click();

 	 Thread.sleep(5000);

 	 //MaizeLocal

	 WebElement MaizeLocal= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));

	 MaizeLocal.click();

 	 Thread.sleep(5000);

   	 //Submit_buttn

   	 WebElement Submit_buttn= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

   	 Submit_buttn.click();

   	 Thread.sleep(5000);

  	  driver.navigate().back();

 	 Thread.sleep(7000);
	
}

@Test

public void TC_ID_24_06 () throws InterruptedException {
	
	TouchAction eNammandi = new TouchAction(driver);

	eNammandi.tap(PointOption.point(365, 1002)).perform();
		
	Thread.sleep(5000);
	
   	// Click on Mandi_Rate_Button_Changes
		
	TouchAction Mandi_Rate_Button_Changes = new TouchAction(driver);

	Mandi_Rate_Button_Changes.tap(PointOption.point(506, 756)).perform();
		
	Thread.sleep(5000);

 	 //WebElement Mandi_Rate_Button_Changes= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]"));

 	 //Assert.assertEquals(true, Mandi_Rate_Button_Changes.isDisplayed());

     System.out.println("Mandi_Rate_Button_Changes is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

     //Mandi_Rate_Button_Changes.click();

    //From Date_field

   	TouchAction From_Date = new TouchAction(driver);

   	From_Date.tap(PointOption.point(503, 462)).perform();
		
	Thread.sleep(5000);
   	 
   	 //WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));

     //Assert.assertEquals(true, Date_field.isDisplayed());

     System.out.println("Date_field is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

   	 //Date_field.click();

   	 //Thread.sleep(5000);

   	 //Year

   	 WebElement Year= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease year\"]"));

     Year.click();

   	 Thread.sleep(5000);

    //Day

   	 WebElement Day= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease day\"]"));

     Day.click();

   	 Thread.sleep(5000);

   	 //Set

   	 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

   	 Set.click();

     //To_Date

   	 WebElement To_Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));

     Assert.assertEquals(true, To_Date.isDisplayed());

    System.out.println("To_Date is displayed = True");

   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   Thread.sleep(3000);

	To_Date.click();

    Thread.sleep(5000);

 	 //Set

     WebElement Set_click= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

 	 Set_click.click();

 	 //APMC_Select

     WebElement APMC_Select= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]"));

     APMC_Select.click();

     Thread.sleep(5000);

     //Select_Achhalda APMC

     WebElement Select_Achhalda_APMC= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]"));

     Select_Achhalda_APMC.click();

     Thread.sleep(5000);

 	 //Commodity_Set_1

 	 WebElement Commodity_Set_1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]"));

 	Commodity_Set_1.click();

 	 Thread.sleep(5000);

 	 //Wheat

	 WebElement Wheat= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));

	 Wheat.click();

 	 Thread.sleep(5000);

   	 //Submit_buttn

   	 WebElement Submit_buttn= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

   	 Submit_buttn.click();

   	 Thread.sleep(5000);

  	  driver.navigate().back();

 	 Thread.sleep(7000);
	
}
@Test

public void TC_ID_24_07 () throws InterruptedException {
	
	TouchAction eNammandi = new TouchAction(driver);

	eNammandi.tap(PointOption.point(365, 1002)).perform();
		
	Thread.sleep(5000);
	
   	// Click on Mandi_Rate_Button_Changes
		
	TouchAction Mandi_Rate_Button_Changes = new TouchAction(driver);

	Mandi_Rate_Button_Changes.tap(PointOption.point(506, 756)).perform();
		
	Thread.sleep(5000);

 	 //WebElement Mandi_Rate_Button_Changes= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]"));

 	 //Assert.assertEquals(true, Mandi_Rate_Button_Changes.isDisplayed());

     System.out.println("Mandi_Rate_Button_Changes is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

     //Mandi_Rate_Button_Changes.click();

    //From Date_field

   	TouchAction From_Date = new TouchAction(driver);

   	From_Date.tap(PointOption.point(503, 462)).perform();
		
	Thread.sleep(5000);
   	 
   	 //WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));

     //Assert.assertEquals(true, Date_field.isDisplayed());

     System.out.println("Date_field is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

   	 //Date_field.click();

   	 //Thread.sleep(5000);

   	 //Year

   	 WebElement Year= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease year\"]"));

     Year.click();

   	 Thread.sleep(5000);

    //Day

   	 WebElement Day= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease day\"]"));

     Day.click();

   	 Thread.sleep(5000);

   	 //Set

   	 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

   	 Set.click();

     //To_Date

   	 WebElement To_Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));

     Assert.assertEquals(true, To_Date.isDisplayed());

    System.out.println("To_Date is displayed = True");

   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   Thread.sleep(3000);

	To_Date.click();

    Thread.sleep(5000);

 	 //Set

     WebElement Set_click= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

 	 Set_click.click();

 	 //APMC_Select

     WebElement APMC_Select= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]"));

     APMC_Select.click();

     Thread.sleep(5000);

     //Select_Agar

     WebElement Select_Agar = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));

     Select_Agar.click();

     Thread.sleep(5000);

 	 //Commodity_Set_1

 	 WebElement Commodity_Set_1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]"));

 	Commodity_Set_1.click();

 	 Thread.sleep(5000);

 	 //Chana (Bengal Gram) - Desi

	 WebElement Chana_Bengal_Gram_Desi= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));

	 Chana_Bengal_Gram_Desi.click();

 	 Thread.sleep(5000);

   	 //Submit_buttn

   	 WebElement Submit_buttn= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

   	 Submit_buttn.click();

   	 Thread.sleep(5000);

  	  driver.navigate().back();

 	 Thread.sleep(7000);
	
}

@Test

public void TC_ID_24_08 () throws InterruptedException {
	
	TouchAction eNammandi = new TouchAction(driver);

	eNammandi.tap(PointOption.point(365, 1002)).perform();
		
	Thread.sleep(5000);
	
   	// Click on Mandi_Rate_Button_Changes
		
	TouchAction Mandi_Rate_Button_Changes = new TouchAction(driver);

	Mandi_Rate_Button_Changes.tap(PointOption.point(506, 756)).perform();
		
	Thread.sleep(5000);

 	 //WebElement Mandi_Rate_Button_Changes= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]"));

 	 //Assert.assertEquals(true, Mandi_Rate_Button_Changes.isDisplayed());

     System.out.println("Mandi_Rate_Button_Changes is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

     //Mandi_Rate_Button_Changes.click();

    //From Date_field

   	TouchAction From_Date = new TouchAction(driver);

   	From_Date.tap(PointOption.point(503, 462)).perform();
		
	Thread.sleep(5000);
   	 
   	 //WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));

     //Assert.assertEquals(true, Date_field.isDisplayed());

     System.out.println("Date_field is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

   	 //Date_field.click();

   	 //Thread.sleep(5000);

   	 //Year

   	 WebElement Year= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease year\"]"));

     Year.click();

   	 Thread.sleep(5000);

    //Day

   	 WebElement Day= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease day\"]"));

     Day.click();

   	 Thread.sleep(5000);

   	 //Set

   	 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

   	 Set.click();

     //To_Date

   	 WebElement To_Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));

     Assert.assertEquals(true, To_Date.isDisplayed());

    System.out.println("To_Date is displayed = True");

   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   Thread.sleep(3000);

	To_Date.click();

    Thread.sleep(5000);

 	 //Set

     WebElement Set_click= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

 	 Set_click.click();

 	 //APMC_Select

     WebElement APMC_Select= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]"));

     APMC_Select.click();

     Thread.sleep(5000);

     //Select_Ahmednager

     WebElement Select_Ahmednager= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));

     Select_Ahmednager.click();

     Thread.sleep(5000);

 	 //Commodity_Set_1

 	 WebElement Commodity_Set_1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]"));

 	Commodity_Set_1.click();

 	 Thread.sleep(5000);

 	 //Bajra

	 WebElement Bajra= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));

	 Bajra.click();

 	 Thread.sleep(5000);

   	 //Submit_buttn

   	 WebElement Submit_buttn= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

   	 Submit_buttn.click();

   	 Thread.sleep(5000);

  	  driver.navigate().back();

 	 Thread.sleep(7000);
	
}

@Test

public void TC_ID_24_09 () throws InterruptedException {
	
	TouchAction eNammandi = new TouchAction(driver);

	eNammandi.tap(PointOption.point(365, 1002)).perform();
		
	Thread.sleep(5000);
	
   	// Click on Mandi_Rate_Button_Changes
		
	TouchAction Mandi_Rate_Button_Changes = new TouchAction(driver);

	Mandi_Rate_Button_Changes.tap(PointOption.point(506, 756)).perform();
		
	Thread.sleep(5000);

 	 //WebElement Mandi_Rate_Button_Changes= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]"));

 	 //Assert.assertEquals(true, Mandi_Rate_Button_Changes.isDisplayed());

     System.out.println("Mandi_Rate_Button_Changes is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

     //Mandi_Rate_Button_Changes.click();

    //From Date_field

   	TouchAction From_Date = new TouchAction(driver);

   	From_Date.tap(PointOption.point(503, 462)).perform();
		
	Thread.sleep(5000);
   	 
   	 //WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));

     //Assert.assertEquals(true, Date_field.isDisplayed());

     System.out.println("Date_field is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

   	 //Date_field.click();

   	 //Thread.sleep(5000);

   	 //Year

   	 WebElement Year= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease year\"]"));

     Year.click();

   	 Thread.sleep(5000);

    //Day

   	 WebElement Day= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease day\"]"));

     Day.click();

   	 Thread.sleep(5000);

   	 //Set

   	 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

   	 Set.click();

     //To_Date

   	 WebElement To_Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));

     Assert.assertEquals(true, To_Date.isDisplayed());

    System.out.println("To_Date is displayed = True");

   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   Thread.sleep(3000);

	To_Date.click();

    Thread.sleep(5000);

 	 //Set

     WebElement Set_click= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

 	 Set_click.click();

 	 //APMC_Select

     WebElement APMC_Select= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]"));

     APMC_Select.click();

     Thread.sleep(5000);

     //Select_Ajuha

     WebElement Select_Ajuha= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));

     Select_Ajuha.click();

     Thread.sleep(5000);

 	 //Commodity_Set_1

 	 WebElement Commodity_Set_1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]"));

 	Commodity_Set_1.click();

 	 Thread.sleep(5000);

 	 //wheat

	 WebElement wheat= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));

	 wheat.click();

 	 Thread.sleep(5000);

   	 //Submit_buttn

   	 WebElement Submit_buttn= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

   	 Submit_buttn.click();

   	 Thread.sleep(5000);

  	  driver.navigate().back();

 	 Thread.sleep(7000);
	
}

@Test

public void TC_ID_24_10 () throws InterruptedException {
	
	TouchAction eNammandi = new TouchAction(driver);

	eNammandi.tap(PointOption.point(365, 1002)).perform();
		
	Thread.sleep(5000);
	
   	// Click on Mandi_Rate_Button_Changes
		
	TouchAction Mandi_Rate_Button_Changes = new TouchAction(driver);

	Mandi_Rate_Button_Changes.tap(PointOption.point(506, 756)).perform();
		
	Thread.sleep(5000);

 	 //WebElement Mandi_Rate_Button_Changes= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]"));

 	 //Assert.assertEquals(true, Mandi_Rate_Button_Changes.isDisplayed());

     System.out.println("Mandi_Rate_Button_Changes is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

     //Mandi_Rate_Button_Changes.click();

    //From Date_field

   	TouchAction From_Date = new TouchAction(driver);

   	From_Date.tap(PointOption.point(503, 462)).perform();
		
	Thread.sleep(5000);
   	 
   	 //WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));

     //Assert.assertEquals(true, Date_field.isDisplayed());

     System.out.println("Date_field is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

   	 //Date_field.click();

   	 //Thread.sleep(5000);

   	 //Year

   	 WebElement Year= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease year\"]"));

     Year.click();

   	 Thread.sleep(5000);

    //Day

   	 WebElement Day= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease day\"]"));

     Day.click();

   	 Thread.sleep(5000);

   	 //Set

   	 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

   	 Set.click();

     //To_Date

   	 WebElement To_Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));

     Assert.assertEquals(true, To_Date.isDisplayed());

    System.out.println("To_Date is displayed = True");

   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   Thread.sleep(3000);

	To_Date.click();

    Thread.sleep(5000);

 	 //Set

     WebElement Set_click= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

 	 Set_click.click();

 	 //APMC_Select

     WebElement APMC_Select= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]"));

     APMC_Select.click();

     Thread.sleep(5000);

     //Select_Alangudi

     WebElement Select_Alangudi = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]"));

     Select_Alangudi.click();

     Thread.sleep(5000);

 	 //Commodity_Set_1

 	 WebElement Commodity_Set_1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]"));

 	Commodity_Set_1.click();

 	 Thread.sleep(5000);

 	 //Ground Nut

	 WebElement GroundNut= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));

	 GroundNut.click();

 	 Thread.sleep(5000);

   	 //Submit_buttn

   	 WebElement Submit_buttn= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

   	 Submit_buttn.click();

   	 Thread.sleep(5000);

  	  driver.navigate().back();

 	 Thread.sleep(7000);
	
}

@Test

public void TC_ID_24_11 () throws InterruptedException {
	
	TouchAction eNammandi = new TouchAction(driver);

	eNammandi.tap(PointOption.point(365, 1002)).perform();
		
	Thread.sleep(5000);
	
   	// Click on Mandi_Rate_Button_Changes
		
	TouchAction Mandi_Rate_Button_Changes = new TouchAction(driver);

	Mandi_Rate_Button_Changes.tap(PointOption.point(506, 756)).perform();
		
	Thread.sleep(5000);

 	 //WebElement Mandi_Rate_Button_Changes= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]"));

 	 //Assert.assertEquals(true, Mandi_Rate_Button_Changes.isDisplayed());

     System.out.println("Mandi_Rate_Button_Changes is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

     //Mandi_Rate_Button_Changes.click();

    //From Date_field

   	TouchAction From_Date = new TouchAction(driver);

   	From_Date.tap(PointOption.point(503, 462)).perform();
		
	Thread.sleep(5000);
   	 
   	 //WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));

     //Assert.assertEquals(true, Date_field.isDisplayed());

     System.out.println("Date_field is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

   	 //Date_field.click();

   	 //Thread.sleep(5000);

   	 //Year

   	 WebElement Year= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease year\"]"));

     Year.click();

   	 Thread.sleep(5000);

    //Day

   	 WebElement Day= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease day\"]"));

     Day.click();

   	 Thread.sleep(5000);

   	 //Set

   	 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

   	 Set.click();

     //To_Date

   	 WebElement To_Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));

     Assert.assertEquals(true, To_Date.isDisplayed());

    System.out.println("To_Date is displayed = True");

   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   Thread.sleep(3000);

	To_Date.click();

    Thread.sleep(5000);

 	 //Set

     WebElement Set_click= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

 	 Set_click.click();

 	 //APMC_Select

     WebElement APMC_Select= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]"));

     APMC_Select.click();

     Thread.sleep(5000);

     //Select_Alwar

     WebElement Select_Alwar= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[9]"));

     Select_Alwar.click();

     Thread.sleep(5000);

 	 //Commodity_Set_1

 	 WebElement Commodity_Set_1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]"));

 	Commodity_Set_1.click();

 	 Thread.sleep(5000);

 	 //Guar Seeds

	 WebElement GuarSeeds= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]"));

	 GuarSeeds.click();

 	 Thread.sleep(5000);

   	 //Submit_buttn

   	 WebElement Submit_buttn= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

   	 Submit_buttn.click();

   	 Thread.sleep(5000);

  	  driver.navigate().back();

 	 Thread.sleep(7000);
	
}

@Test

public void TC_ID_24_12 () throws InterruptedException {
	
	TouchAction eNammandi = new TouchAction(driver);

	eNammandi.tap(PointOption.point(365, 1002)).perform();
		
	Thread.sleep(5000);
	
   	// Click on Mandi_Rate_Button_Changes
		
	TouchAction Mandi_Rate_Button_Changes = new TouchAction(driver);

	Mandi_Rate_Button_Changes.tap(PointOption.point(506, 756)).perform();
		
	Thread.sleep(5000);

 	 //WebElement Mandi_Rate_Button_Changes= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]"));

 	 //Assert.assertEquals(true, Mandi_Rate_Button_Changes.isDisplayed());

     System.out.println("Mandi_Rate_Button_Changes is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

     //Mandi_Rate_Button_Changes.click();

    //From Date_field

   	TouchAction From_Date = new TouchAction(driver);

   	From_Date.tap(PointOption.point(503, 462)).perform();
		
	Thread.sleep(5000);
   	 
   	 //WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[1]"));

     //Assert.assertEquals(true, Date_field.isDisplayed());

     System.out.println("Date_field is displayed = True");

   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   	 //Thread.sleep(3000);

   	 //Date_field.click();

   	 //Thread.sleep(5000);

   	 //Year

   	 WebElement Year= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease year\"]"));

     Year.click();

   	 Thread.sleep(5000);

    //Day

   	 WebElement Day= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Decrease day\"]"));

     Day.click();

   	 Thread.sleep(5000);

   	 //Set

   	 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

   	 Set.click();

     //To_Date

   	 WebElement To_Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner[2]"));

     Assert.assertEquals(true, To_Date.isDisplayed());

    System.out.println("To_Date is displayed = True");

   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   Thread.sleep(3000);

	To_Date.click();

    Thread.sleep(5000);

 	 //Set

     WebElement Set_click= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));

 	 Set_click.click();

 	 //APMC_Select

     WebElement APMC_Select= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]"));

     APMC_Select.click();

     Thread.sleep(5000);

     //Select_Babain

     WebElement Select_Babain= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));

     Select_Babain.click();

     Thread.sleep(5000);

 	 //Commodity_Set_1

 	 WebElement Commodity_Set_1= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]"));

 	Commodity_Set_1.click();

 	 Thread.sleep(5000);

 	 //Onion

	 WebElement Onion= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]"));

	 Onion.click();

 	 Thread.sleep(5000);

   	 //Submit_buttn

   	 WebElement Submit_buttn= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

   	 Submit_buttn.click();

   	 Thread.sleep(5000);

  	  driver.navigate().back();

 	 Thread.sleep(7000);
	
}


}


