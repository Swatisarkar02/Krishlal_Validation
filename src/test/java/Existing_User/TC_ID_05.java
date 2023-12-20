package Existing_User;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TC_ID_05 extends TC_ID_04_and_05 {
	
	public void OTP_Read () throws InterruptedException {
		
		System.out.println("OTP auto fill");
		
		}

	public void TC_ID_05_01 () throws InterruptedException {
                                                                                                
		//driver.findElement(By.xpath("//android.view.View[@content-desc='Didn’t receive OTP ? Send Again']")).click();
		TouchAction quicklink = new TouchAction(driver);

		quicklink.tap(PointOption.point(542, 1042)).perform();
		
		Thread.sleep(5000);
		//Thread.sleep(5000);
		
	}
	@Test
	public void TC_ID_05_02 () throws InterruptedException {

		TouchAction quicklink = new TouchAction(driver);

		quicklink.tap(PointOption.point(533, 1292)).perform();
		
		Thread.sleep(5000);
		
	}
	@Test
	public void TC_ID_05_03 () throws InterruptedException {

		TouchAction quicklink = new TouchAction(driver);

		quicklink.tap(PointOption.point(950, 192)).perform();
		
		Thread.sleep(5000);
		
	}
}
