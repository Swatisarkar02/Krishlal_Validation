package Menu;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Launch_App.Launch_App_Advance;
import Launch_App.Login_User1;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TC_ID_18 extends Launch_App_Advance {
	
	//login with the buyer

	
		@Test	
		public void Login () throws InterruptedException {
			Login_User1 Test = new Login_User1();
			Test.Login_User1_Seller();
		}
@Test
		
		public void TC_ID_18_01 () throws InterruptedException {
			
			
			Thread.sleep(30000);
			
			//click on order  at button
			
			driver.findElement(By.xpath("//android.view.View[@index='4']")).click();
			
			Thread.sleep(5000);
			
			//Click on Buying_button 

			    TouchAction touchAction_Buying = new TouchAction(driver);
				touchAction_Buying.tap(PointOption.point(544, 398)).perform();
				Thread.sleep(1000);
				
				//click on Product button
				
				 TouchAction touchAction_Buying_Product = new TouchAction(driver);
				 touchAction_Buying_Product.tap(PointOption.point(417, 555)).perform();

				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
				 Thread.sleep(1000);

				 //select the order from list

				 TouchAction Open_Product = new TouchAction(driver);
				 Open_Product.tap(PointOption.point(343, 763)).perform(); 

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

				   String Order_Status = driver.findElement(By.xpath("//android.view.View[@index='11']")).getTagName();

				   System.out.println("Status of order = " + Order_Status); 	

			//Contact_person_name	   

				   String Contact_person_name_1 = driver.findElement(By.xpath("//android.view.View[@index='17']")).getTagName();

				   System.out.println("Contact person name display is = " + Contact_person_name_1);  
			
				   
				   Thread.sleep(5000);	  
				   
	  
				   
			//Buying order Accepted	   
	 
				   String Buying_order_Accepted = driver.findElement(By.xpath("//android.view.View[@index='13']")).getTagName();

				   System.out.println("Buying_order_Accepted_Status display is = " + Buying_order_Accepted);
			    
				   Thread.sleep(10000);	 
				   
			//Buying order Delivered	   
					 
				   String Buying_order_Delivered = driver.findElement(By.xpath("//android.view.View[@index='15']")).getTagName();

				   System.out.println("Buying_order_Delivered_Status display is = " + Buying_order_Delivered);
			    
				   Thread.sleep(10000);	   
   
				   
		}
}
