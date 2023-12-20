package Menu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Launch_App.Launch_App_Advance;
import Launch_App.Login_User1;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

@Test
public class TC_ID_17 extends Launch_App_Advance {
	
	//login with the seller again

	
	@Test	
	public void Login () throws InterruptedException {
		Login_User1 Test = new Login_User1();
		Test.Login_User1_Seller();
	}

	@Test
	
	public void TC_ID_17_01 () throws InterruptedException {
		
			
		Thread.sleep(30000);
		
		//click on order  at button
		
		driver.findElement(By.xpath("//android.view.View[@index='4']")).click();
		
		Thread.sleep(5000);
		
		
			//TouchAction touchAction_order_1 = new TouchAction(driver);
			//touchAction_order_1.tap(PointOption.point(722, 2264)).perform();

			Thread.sleep(1000);
			
		//Click on Selling_button 

		    TouchAction touchAction_Selling = new TouchAction(driver);
			touchAction_Selling.tap(PointOption.point(858, 372)).perform();
			Thread.sleep(1000);
			
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 

			//click on Product button
			
			 TouchAction touchAction_Selling_Product = new TouchAction(driver);
			 touchAction_Selling_Product.tap(PointOption.point(402, 555)).perform();

			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
			 Thread.sleep(1000);

			 //select the order from list

			 TouchAction Open_Product = new TouchAction(driver);
			 Open_Product.tap(PointOption.point(391, 741)).perform(); 

		 	 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 

		 	Thread.sleep(1000);
		 	//Product_Name_Display

			String Product_Name_Display = driver.findElement(By.xpath("//android.view.View[@index='3']")).getTagName();

			System.out.println("Product name appeared  = " + Product_Name_Display); 

			//Location_display  	   

			String Location_display = driver.findElement(By.xpath("//android.view.View[@index='4']")).getTagName();

			System.out.println("Product name location is = " + Location_display); 


			//Order_Date  	   

			String Order_Date = driver.findElement(By.xpath("//android.view.View[@index='5']")).getTagName();

			   System.out.println("Order date display is = " + Order_Date); 	   


		//Quantity_unit  	   

				String Quantity_unit = driver.findElement(By.xpath("//android.view.View[@index='6']")).getTagName();

				System.out.println("Quantity and unit is = " + Quantity_unit); 	   


		//Order_Id	   

			   String Order_Id = driver.findElement(By.xpath("//android.view.View[@index='9']")).getTagName();

			   System.out.println("Order Id of the Product = " + Order_Id); 		   


		//Order_Status	   

			   String Order_Status = driver.findElement(By.xpath("//android.view.View[@index='13']")).getTagName();

			   System.out.println("Status of order = " + Order_Status); 	

		//Contact_person_name	   

			   String Contact_person_name_1 = driver.findElement(By.xpath("//android.view.View[@index='20']")).getTagName();

			   System.out.println("Contact person name display is = " + Contact_person_name_1);  
		
			   
			   Thread.sleep(5000);	   
		
	// click on Accepted button
		    	
			   TouchAction Accepted_button = new TouchAction(driver);
			   Accepted_button.tap(PointOption.point(909, 704)).perform();
			   Thread.sleep(10000);
			   
	
	// click on Accepted Enter button
		    	
			   TouchAction Accepted_Enter_button = new TouchAction(driver);
			   Accepted_Enter_button.tap(PointOption.point(938, 2205)).perform();
			   Thread.sleep(10000);	   
			   
		    
	  //Change order status into accepted	   

	 
			   String Order_Accepted_Status = driver.findElement(By.xpath("//android.view.View[@index='14']")).getTagName();

			   System.out.println("Order_Accepted_Status display is = " + Order_Accepted_Status);
		    
			   Thread.sleep(10000);
			   
			   
			   

	//click on delivered button

			   TouchAction delivered_button = new TouchAction(driver);
			   delivered_button.tap(PointOption.point(901, 715)).perform();
			   Thread.sleep(10000);
		    
			     
			   
	 //Change order status into Delivered		  	    
	 
			   String Order_Deliverd_Status = driver.findElement(By.xpath("//android.view.View[@index='15']")).getTagName();

			   System.out.println("Order_Deliverd_Status display is = " + Order_Deliverd_Status);
			
			   Thread.sleep(10000);
			
	        }


}