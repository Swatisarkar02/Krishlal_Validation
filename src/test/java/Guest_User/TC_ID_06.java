package Guest_User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Launch_App.Launch_App_Advance;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TC_ID_06 extends Launch_App_Advance {

@Test	
	public void Guest_User () throws InterruptedException {
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"English\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//android.view.View[@content-desc='Guest Login ￼']")).click();
		Thread.sleep(5000);
	
	}
@Test		
	public void TC_ID_06_01 () throws InterruptedException {	
		
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]")).click();
	Thread.sleep(5000);
	
	}
@Test	
	public void TC_ID_06_02 () throws InterruptedException {

	System.out.println("Guest Name");	
	Thread.sleep(5000);
	
	System.out.println("Address");
	Thread.sleep(5000);
	
	}
@Test
	public void TC_ID_06_03 () throws InterruptedException {
                                                               	
		
	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(950, 192)).perform();
	
	Thread.sleep(5000);	
	}

@Test	
	public void TC_ID_06_04 () throws InterruptedException {
		
	
	
	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(403, 494)).perform();
	
	Thread.sleep(5000);
	
		
	System.out.println("Guest");
	Thread.sleep(5000);
	
	System.out.println("Address");
	Thread.sleep(5000);
	
	System.out.println("Pin Code");
	Thread.sleep(5000);
	
	System.out.println("District");
	Thread.sleep(5000);
		
	System.out.println("State");
	Thread.sleep(5000);
	
	}
@Test
	public void TC_ID_06_05 () throws InterruptedException {
	
	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(101, 187)).perform();
	
		
	}
@Test	
	public void TC_ID_06_06 () throws InterruptedException {
		
	TouchAction quicklink1 = new TouchAction(driver);

	quicklink1.tap(PointOption.point(322, 2050)).perform();
		
	Thread.sleep(5000);
		
	System.out.println("Come Back Soon");
		
	System.out.println("Cancel and Logout");
	
	System.out.println("Click on Logout");
	
	TouchAction quicklink2 = new TouchAction(driver);

	quicklink2.tap(PointOption.point(350, 1450)).perform();
		
	Thread.sleep(5000);
			
		}
	
	
}


