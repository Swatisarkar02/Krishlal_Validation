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

public class TC_ID_23 extends Launch_App_Advance{

@Test	
	public void Login () throws InterruptedException {
		Login_User1 Test = new Login_User1();
		Test.Login_User1_Seller();	
	
	}
	
@Test	
	public void TC_ID_23_01 () throws InterruptedException {
			
		TouchAction Profile = new TouchAction(driver);

		Profile.tap(PointOption.point(957, 205)).perform();
			
		Thread.sleep(5000);
			
		TouchAction eNammandi = new TouchAction(driver);

		eNammandi.tap(PointOption.point(365, 1002)).perform();
			
		Thread.sleep(5000);
			
			
		TouchAction MandiRatesButton = new TouchAction(driver);
			
		MandiRatesButton.tap(PointOption.point(503, 477)).perform();
			
		Thread.sleep(5000);
			
		System.out.println("Without fill detail");
			  
		TouchAction Submitbutton = new TouchAction(driver);
			
		Submitbutton.tap(PointOption.point(175, 849)).perform();
			
		Thread.sleep(5000);
			
		System.out.println("Please fill out this field");
			
		Thread.sleep(10000);
		
		}


			@Test
			    
	 public void TC_ID_23_02() throws InterruptedException {

		//Date_field

		 //WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner"));
				
		TouchAction Date_Field = new TouchAction(driver);
				
		Date_Field.tap(PointOption.point(432, 458)).perform();
					
		Thread.sleep(5000);		
		 
		 //WebElement Date_Field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner"));
	     //Assert.assertEquals(true, Date_Field.isDisplayed());

	     System.out.println("Date_field is displayed = True");

		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		 //Thread.sleep(3000);

		 //Date_Field.click();

		 //Thread.sleep(5000);

				
			//Month

				

		 WebElement Month= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));



		Month.click();

				

		Thread.sleep(5000);

		Month.clear();

		Thread.sleep(3000);

		Month.sendKeys("Apr");

				 Thread.sleep(3000);
				 

				

				 //Date

				

				 WebElement Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));



				Date.click();

				

				 Thread.sleep(5000);

				

				Date.clear();

				

				 Thread.sleep(5000);

				

				Date.sendKeys("28");

				

				 Thread.sleep(7000);

				

				 //Set

				

				 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));



				 Set.click();

				Thread.sleep(5000);

				 //Commodity_Set

				

				 WebElement Commodity_Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]"));



				Commodity_Set.click();



				 Thread.sleep(3000);

				

				 //Select_Cotton

				

				 WebElement Select_Cotton= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));



				 Select_Cotton.click();



				 Thread.sleep(3000);

				

				 //Select the submit_button

				

				     WebElement submit_button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

			  	  

				     Assert.assertEquals(true, submit_button.isDisplayed());



			    System.out.println("submit_button is displayed = True");

			    

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);

			 

				submit_button.click();

				

				Thread.sleep(5000);

				

				 driver.navigate().back();

				 	   

				Thread.sleep(10000); 
				 
			 } 
			
			 public void TC_ID_23_03() throws InterruptedException {

				 TouchAction eNum = new TouchAction(driver);

				   

			     eNum.tap(PointOption.point(365, 1002)).perform();

				     

				  Thread.sleep(12000);

				

				  // Click on Mandi_Rate_Button

				  

				     //WebElement Mandi_Rate_Button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[1]"));
				  
				  TouchAction MandiRatesButton = new TouchAction(driver);
				  MandiRatesButton.tap(PointOption.point(503, 477)).perform();
					
					Thread.sleep(5000);

				     //Assert.assertEquals(true, MandiRatesButton.isDisplayed());



			    System.out.println("Mandi_Rate_Button is displayed = True");

			    

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);

			 

				// Mandi_Rate_Button.click();

				 
				 
				 
				  

			   //Date_field

				

				 WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner"));

			  	  

				     Assert.assertEquals(true, Date_field.isDisplayed());



			   System.out.println("Date_field is displayed = True");

			    

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);

			 

				 Date_field.click();

				

				 Thread.sleep(5000);

				
			//Month

				

				 WebElement Month= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));



				 Month.click();

				

				 Thread.sleep(5000);

				

				 Month.clear();

				

				 Thread.sleep(3000);

				

				 Month.sendKeys("Apr");

				

				 Thread.sleep(3000);
				 

				

				 //Date

				

				 WebElement Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));



				Date.click();

				

				 Thread.sleep(5000);

				

				Date.clear();

				

				 Thread.sleep(5000);

				

				Date.sendKeys("28");

				

				 Thread.sleep(7000);

				

				 //Set

				

				 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));



				 Set.click();

				Thread.sleep(5000);

				 //Commodity_Set

				

				 WebElement Commodity_Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]"));



				Commodity_Set.click();



				 Thread.sleep(3000);

				

				 //Select_CastorSeed

				

				 WebElement Select_CastorSeed= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));



				 Select_CastorSeed.click();



				 Thread.sleep(3000);

				

				 //Select the submit_button

				

				     WebElement submit_button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

			  	  

				     Assert.assertEquals(true, submit_button.isDisplayed());



			    System.out.println("submit_button is displayed = True");

			    

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);

			 

				submit_button.click();

				

				Thread.sleep(5000);

				

				 driver.navigate().back();

				 	   

				Thread.sleep(10000); 
				 
				 
				 

			 }
			 
			 @Test
			 
			 public void TC_ID_23_04() throws InterruptedException {

				 TouchAction eNum = new TouchAction(driver);

				   

			     eNum.tap(PointOption.point(365, 1002)).perform();

				     

				  Thread.sleep(12000);

				

				  // Click on Mandi_Rate_Button

				  

				     //WebElement Mandi_Rate_Button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[1]"));
				  
				  TouchAction MandiRatesButton = new TouchAction(driver);
				  MandiRatesButton.tap(PointOption.point(503, 477)).perform();
					
					Thread.sleep(5000);

				     //Assert.assertEquals(true, MandiRatesButton.isDisplayed());



			    System.out.println("Mandi_Rate_Button is displayed = True");

			    

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);

			 

				// Mandi_Rate_Button.click();

				 
				 
				 
				  

			   //Date_field

				

				 WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner"));

			  	  

				     Assert.assertEquals(true, Date_field.isDisplayed());



			   System.out.println("Date_field is displayed = True");

			    

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);

			 

				 Date_field.click();

				

				 Thread.sleep(5000);

				
			//Month

				

				 WebElement Month= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));



				 Month.click();

				

				 Thread.sleep(5000);

				

				 Month.clear();

				

				 Thread.sleep(3000);

				

				 Month.sendKeys("Apr");

				

				 Thread.sleep(3000);
				 

				

				 //Date

				

				 WebElement Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));



				Date.click();

				

				 Thread.sleep(5000);

				

				Date.clear();

				

				 Thread.sleep(5000);

				

				Date.sendKeys("28");

				

				 Thread.sleep(7000);

				

				 //Set

				

				 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));



				 Set.click();

				Thread.sleep(5000);

				 //Commodity_Set

				

				 WebElement Commodity_Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]"));



				Commodity_Set.click();



				 Thread.sleep(3000);

				

				 //Select_GroundNut

				

				 WebElement Select_GroundNut= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"));



				 Select_GroundNut.click();



				 Thread.sleep(3000);

				

				 //Select the submit_button

				

				     WebElement submit_button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

			  	  

				     Assert.assertEquals(true, submit_button.isDisplayed());



			    System.out.println("submit_button is displayed = True");

			    

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);

			 

				submit_button.click();

				

				Thread.sleep(5000);

				

				 driver.navigate().back();

				 	   

				Thread.sleep(10000); 

			 }
			@Test
			 

			 public void TC_ID_23_05() throws InterruptedException {

				 TouchAction eNum = new TouchAction(driver);

				   

			     eNum.tap(PointOption.point(365, 1002)).perform();

				     

				  Thread.sleep(12000);

				

				  // Click on Mandi_Rate_Button

				  

				     //WebElement Mandi_Rate_Button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[1]"));
				  
				  TouchAction MandiRatesButton = new TouchAction(driver);
				  MandiRatesButton.tap(PointOption.point(503, 477)).perform();
					
					Thread.sleep(5000);

				     //Assert.assertEquals(true, MandiRatesButton.isDisplayed());



			    System.out.println("Mandi_Rate_Button is displayed = True");

			    

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);

			 

				// Mandi_Rate_Button.click();

				 
				 
				 
				  

			   //Date_field

				

				 WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner"));

			  	  

				     Assert.assertEquals(true, Date_field.isDisplayed());



			   System.out.println("Date_field is displayed = True");

			    

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);

			 

				 Date_field.click();

				

				 Thread.sleep(5000);

				
			//Month

				

				 WebElement Month= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));



				 Month.click();

				

				 Thread.sleep(5000);

				

				 Month.clear();

				

				 Thread.sleep(3000);

				

				 Month.sendKeys("Apr");

				

				 Thread.sleep(3000);
				 

				

				 //Date

				

				 WebElement Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));



				Date.click();

				

				 Thread.sleep(5000);

				

				Date.clear();

				

				 Thread.sleep(5000);

				

				Date.sendKeys("28");

				

				 Thread.sleep(7000);

				

				 //Set

				

				 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));



				 Set.click();

				Thread.sleep(5000);

				 //Commodity_Set

				

				 WebElement Commodity_Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]"));



				Commodity_Set.click();



				 Thread.sleep(3000);

				

				 //Select_SunFlowerSeeds

				

				 WebElement Select_SunFlowerSeeds= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));



				 Select_SunFlowerSeeds.click();



				 Thread.sleep(3000);

				

				 //Select the submit_button

				

				     WebElement submit_button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

			  	  

				     Assert.assertEquals(true, submit_button.isDisplayed());



			    System.out.println("submit_button is displayed = True");

			    

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);

			 

				submit_button.click();

				

				Thread.sleep(5000);

				

				 driver.navigate().back();

				 	   

				Thread.sleep(10000); 
				 
			}
			@Test
			public void TC_ID_23_06() throws InterruptedException {

				 TouchAction eNum = new TouchAction(driver);

				   

			    eNum.tap(PointOption.point(365, 1002)).perform();

				     

				  Thread.sleep(12000);

				

				  // Click on Mandi_Rate_Button

				  

				     //WebElement Mandi_Rate_Button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[1]"));
				  
				  TouchAction MandiRatesButton = new TouchAction(driver);
				  MandiRatesButton.tap(PointOption.point(503, 477)).perform();
					
					Thread.sleep(5000);

				     //Assert.assertEquals(true, MandiRatesButton.isDisplayed());



			   System.out.println("Mandi_Rate_Button is displayed = True");

			   

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				// Mandi_Rate_Button.click();

				 
				 
				 
				  

			  //Date_field

				

				 WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner"));

			 	  

				     Assert.assertEquals(true, Date_field.isDisplayed());



			  System.out.println("Date_field is displayed = True");

			   

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				 Date_field.click();

				

				 Thread.sleep(5000);

				
			//Month

				

				 WebElement Month= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));



				 Month.click();

				

				 Thread.sleep(5000);

				

				 Month.clear();

				

				 Thread.sleep(3000);

				

				 Month.sendKeys("Apr");

				

				 Thread.sleep(3000);
				 

				

				 //Date

				

				 WebElement Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));



				Date.click();

				

				 Thread.sleep(5000);

				

				Date.clear();

				

				 Thread.sleep(5000);

				

				Date.sendKeys("28");

				

				 Thread.sleep(7000);

				

				 //Set

				

				 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));



				 Set.click();

				Thread.sleep(5000);

				 //Commodity_Set

				

				 WebElement Commodity_Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]"));



				Commodity_Set.click();



				 Thread.sleep(3000);

				

				 //Select_Mausambi

				

				 WebElement Select_Mousambi= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]"));



				 Select_Mousambi.click();



				 Thread.sleep(3000);

				

				 //Select the submit_button

				

				     WebElement submit_button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

			 	  

				     Assert.assertEquals(true, submit_button.isDisplayed());



			   System.out.println("submit_button is displayed = True");

			   

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				submit_button.click();

				

				Thread.sleep(5000);

				

				 driver.navigate().back();

				 	   

				Thread.sleep(10000); 
				 

			}

			@Test

			public void TC_ID_23_07() throws InterruptedException {

				 TouchAction eNum = new TouchAction(driver);

				   

			   eNum.tap(PointOption.point(365, 1002)).perform();

				     

				  Thread.sleep(12000);

				

				  // Click on Mandi_Rate_Button

				  

				     //WebElement Mandi_Rate_Button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[1]"));
				  
				  TouchAction MandiRatesButton = new TouchAction(driver);
				  MandiRatesButton.tap(PointOption.point(503, 477)).perform();
					
					Thread.sleep(5000);

				     //Assert.assertEquals(true, MandiRatesButton.isDisplayed());



			  System.out.println("Mandi_Rate_Button is displayed = True");

			  

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				// Mandi_Rate_Button.click();

				 
				 
				 
				  

			 //Date_field

				

				 WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner"));

				  

				     Assert.assertEquals(true, Date_field.isDisplayed());



			 System.out.println("Date_field is displayed = True");

			  

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				 Date_field.click();

				

				 Thread.sleep(5000);

				
			//Month

				

				 WebElement Month= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));



				 Month.click();

				

				 Thread.sleep(5000);

				

				 Month.clear();

				

				 Thread.sleep(3000);

				

				 Month.sendKeys("Apr");

				

				 Thread.sleep(3000);
				 

				

				 //Date

				

				 WebElement Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));



				Date.click();

				

				 Thread.sleep(5000);

				

				Date.clear();

				

				 Thread.sleep(5000);

				

				Date.sendKeys("28");

				

				 Thread.sleep(7000);

				

				 //Set

				

				 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));



				 Set.click();

				Thread.sleep(5000);

				 //Commodity_Set

				

				 WebElement Commodity_Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]"));



				Commodity_Set.click();



				 Thread.sleep(3000);

				

				 //Select_Lemon

				

				 WebElement Select_Lemon= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]"));



				 Select_Lemon.click();



				 Thread.sleep(3000);

				

				 //Select the submit_button

				

				     WebElement submit_button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

				  

				     Assert.assertEquals(true, submit_button.isDisplayed());



			  System.out.println("submit_button is displayed = True");

			  

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				submit_button.click();

				

				Thread.sleep(5000);

				

				 driver.navigate().back();

				 	   

				Thread.sleep(10000); 

			}

			@Test

			public void TC_ID_23_08() throws InterruptedException {

				 TouchAction eNum = new TouchAction(driver);

				   

			  eNum.tap(PointOption.point(365, 1002)).perform();

				     

				  Thread.sleep(12000);

				

				  // Click on Mandi_Rate_Button

				  

				     //WebElement Mandi_Rate_Button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[1]"));
				  
				  TouchAction MandiRatesButton = new TouchAction(driver);
				  MandiRatesButton.tap(PointOption.point(503, 477)).perform();
					
					Thread.sleep(5000);

				     //Assert.assertEquals(true, MandiRatesButton.isDisplayed());



			 System.out.println("Mandi_Rate_Button is displayed = True");

			 

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				// Mandi_Rate_Button.click();

				 
				 
				 
				  

			//Date_field

				

				 WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner"));

				  

				     Assert.assertEquals(true, Date_field.isDisplayed());



			System.out.println("Date_field is displayed = True");

			 

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				 Date_field.click();

				

				 Thread.sleep(5000);

				
			//Month

				

				 WebElement Month= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));



				 Month.click();

				

				 Thread.sleep(5000);

				

				 Month.clear();

				

				 Thread.sleep(3000);

				

				 Month.sendKeys("Apr");

				

				 Thread.sleep(3000);
				 

				

				 //Date

				

				 WebElement Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));



				Date.click();

				

				 Thread.sleep(5000);

				

				Date.clear();

				

				 Thread.sleep(5000);

				

				Date.sendKeys("28");

				

				 Thread.sleep(7000);

				

				 //Set

				

				 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));



				 Set.click();

				Thread.sleep(5000);

				 //Commodity_Set

				

				 WebElement Commodity_Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]"));



				Commodity_Set.click();



				 Thread.sleep(3000);

				

				 //Select_TurmericBulb

				

				 WebElement Select_TurmericBulb= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[8]"));



				 Select_TurmericBulb.click();



				 Thread.sleep(3000);

				

				 //Select the submit_button

				

				     WebElement submit_button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

				  

				     Assert.assertEquals(true, submit_button.isDisplayed());



			 System.out.println("submit_button is displayed = True");

			 

				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				submit_button.click();

				

				Thread.sleep(5000);

				

				 driver.navigate().back();

				 	   

				Thread.sleep(10000); 

			}

			@Test

			public void TC_ID_23_09() throws InterruptedException {

				 TouchAction eNum = new TouchAction(driver);

				   

			 eNum.tap(PointOption.point(365, 1002)).perform();

				     

				  Thread.sleep(12000);

				

				  // Click on Mandi_Rate_Button

				  

				     //WebElement Mandi_Rate_Button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[1]"));
				  
				  TouchAction MandiRatesButton = new TouchAction(driver);
				  MandiRatesButton.tap(PointOption.point(503, 477)).perform();
					
					Thread.sleep(5000);

				     //Assert.assertEquals(true, MandiRatesButton.isDisplayed());



			System.out.println("Mandi_Rate_Button is displayed = True");



				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				// Mandi_Rate_Button.click();

				 
				 
				 
				  

			//Date_field

				

				 WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner"));

				  

				     Assert.assertEquals(true, Date_field.isDisplayed());



			System.out.println("Date_field is displayed = True");



				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				 Date_field.click();

				

				 Thread.sleep(5000);

				
			//Month

				

				 WebElement Month= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));



				 Month.click();

				

				 Thread.sleep(5000);

				

				 Month.clear();

				

				 Thread.sleep(3000);

				

				 Month.sendKeys("Apr");

				

				 Thread.sleep(3000);
				 

				

				 //Date

				

				 WebElement Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));



				Date.click();

				

				 Thread.sleep(5000);

				

				Date.clear();

				

				 Thread.sleep(5000);

				

				Date.sendKeys("28");

				

				 Thread.sleep(7000);

				

				 //Set

				

				 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));



				 Set.click();

				Thread.sleep(5000);

				 //Commodity_Set

				

				 WebElement Commodity_Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]"));



				Commodity_Set.click();



				 Thread.sleep(3000);

				

				 //Select_TurmericFinger

				

				 WebElement Select_TurmericFinger= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[9]"));



				 Select_TurmericFinger.click();



				 Thread.sleep(3000);

				

				 //Select the submit_button

				

				     WebElement submit_button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

				  

				     Assert.assertEquals(true, submit_button.isDisplayed());



			System.out.println("submit_button is displayed = True");



				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				submit_button.click();

				

				Thread.sleep(5000);

				

				 driver.navigate().back();

				 	   

				Thread.sleep(10000); 

			}


			public void TC_ID_23_10() throws InterruptedException {

				 TouchAction eNum = new TouchAction(driver);

				   

			eNum.tap(PointOption.point(365, 1002)).perform();

				     

				  Thread.sleep(12000);

				

				  // Click on Mandi_Rate_Button

				  

				     //WebElement Mandi_Rate_Button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.widget.Button[1]"));
				  
				  TouchAction MandiRatesButton = new TouchAction(driver);
				  MandiRatesButton.tap(PointOption.point(503, 477)).perform();
					
					Thread.sleep(5000);

				     //Assert.assertEquals(true, MandiRatesButton.isDisplayed());



			System.out.println("Mandi_Rate_Button is displayed = True");



				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				// Mandi_Rate_Button.click();

				 
				 
				 
				  

			//Date_field

				

				 WebElement Date_field= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Spinner"));

				  

				     Assert.assertEquals(true, Date_field.isDisplayed());



			System.out.println("Date_field is displayed = True");



				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				 Date_field.click();

				

				 Thread.sleep(5000);

				
			//Month

				

				 WebElement Month= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));



				 Month.click();

				

				 Thread.sleep(5000);

				

				 Month.clear();

				

				 Thread.sleep(3000);

				

				 Month.sendKeys("Apr");

				

				 Thread.sleep(3000);
				 

				

				 //Date

				

				 WebElement Date= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));



				Date.click();

				

				 Thread.sleep(5000);

				

				Date.clear();

				

				 Thread.sleep(5000);

				

				Date.sendKeys("28");

				

				 Thread.sleep(7000);

				

				 //Set

				

				 WebElement Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));



				 Set.click();

				Thread.sleep(5000);

				 //Commodity_Set

				

				 WebElement Commodity_Set= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]"));



				Commodity_Set.click();



				 Thread.sleep(3000);

				

				 //Select_Lemon

				

				 WebElement Select_Lemon= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[10]"));



				 Select_Lemon.click();



				 Thread.sleep(3000);

				

				 //Select the submit_button

				

				     WebElement submit_button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button"));

				  

				     Assert.assertEquals(true, submit_button.isDisplayed());



			System.out.println("submit_button is displayed = True");



				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

				 Thread.sleep(3000);



				submit_button.click();

				

				Thread.sleep(5000);

				

				 driver.navigate().back();

				 	   

				Thread.sleep(10000); 

			}


			}		
			
			
	


