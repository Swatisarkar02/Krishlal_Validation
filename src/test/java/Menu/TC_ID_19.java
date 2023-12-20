package Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Launch_App.Launch_App_Advance;
import Launch_App.Login_User1;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TC_ID_19 extends Launch_App_Advance{
	
	

	//login with the Search Order

	
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

			    TouchAction touchAction_Filter = new TouchAction(driver);
			    touchAction_Filter.tap(PointOption.point(938, 566)).perform();
				Thread.sleep(1000);
		
				
				WebElement EnterSerach = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView"));
				EnterSerach.click();
				Thread.sleep(5000);
				EnterSerach.sendKeys("Rose");
				Thread.sleep(5000);
				
				//TouchAction Min_Amount_Filter = new TouchAction(driver);
				//Min_Amount_Filter.tap(PointOption.point(484, 991)).perform();
				//Thread.sleep(1000);
		
				
				WebElement Min_Amount = driver.findElement(By.xpath("//android.widget.EditText[@index='4']"));
				Min_Amount.click();
				Thread.sleep(5000);
				Min_Amount.sendKeys("500");
				Thread.sleep(5000);
				
				
				//TouchAction Max_Amount_Filter = new TouchAction(driver);
				//Max_Amount_Filter.tap(PointOption.point(816, 994)).perform();
				//Thread.sleep(1000);
				
				WebElement Max_Amount = driver.findElement(By.xpath("//android.widget.EditText[@index='5']"));
				Max_Amount.click();
				Thread.sleep(5000);
				Max_Amount.sendKeys("500");
				Thread.sleep(5000);
				
				
//			WebElement EnterStartDate = driver.findElement(By.xpath("//android.view.View[@content-desc='Start Date']"));
//			EnterStartDate.click();
//			Thread.sleep(5000);
			
//			WebElement StartDate = driver.findElement(By.xpath("//android.widget.Button[@index= '0']"));
//			StartDate.click();
//			Thread.sleep(5000);
//			StartDate.sendKeys("1-Jul-2023");
//			Thread.sleep(5000);
//			
//			WebElement OkButton = driver.findElement(By.xpath("//android.widget.Button[@index='6']"));
//			OkButton.click();
//			Thread.sleep(5000);
//			
//			WebElement EnterEndDate = driver.findElement(By.xpath("//android.view.View[@content-desc='End Date']"));
//			EnterEndDate.click();
//			Thread.sleep(5000);
			
//			WebElement EndDate = driver.findElement(By.xpath("//android.widget.Button[@index= '0']"));
//			EndDate.click();
//			Thread.sleep(5000);
//			EndDate.sendKeys("29-Jul-2023");
//			Thread.sleep(5000);
//			
//			WebElement Ok2Button = driver.findElement(By.xpath("//android.widget.Button[@index='6']"));
//			OkButton.click();
//			Thread.sleep(5000);
				
				TouchAction touchAction_By_Status = new TouchAction(driver);
				touchAction_By_Status.tap(PointOption.point(555, 1255)).perform();
				Thread.sleep(1000);
				
				
				TouchAction touchAction_Delivered = new TouchAction(driver);
				touchAction_Delivered.tap(PointOption.point(458, 1836)).perform();
				Thread.sleep(1000);
				
				
				
				driver.findElement(By.xpath("//android.widget.Button[@index='11']")).click();
				
				Thread.sleep(5000);
				
				
				
				
}

}
