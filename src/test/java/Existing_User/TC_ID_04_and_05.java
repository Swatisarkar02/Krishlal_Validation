package Existing_User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Launch_App.Launch_App_Advance;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TC_ID_04_and_05 extends Launch_App_Advance {
@Test
	public void AppLogin () throws InterruptedException {
	
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"English\"]")).click();
		
		Thread.sleep(5000);
		
		WebElement EnterMobileField1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView"));
		
		
		EnterMobileField1.click();
		
		Thread.sleep(5000);
		
		
		EnterMobileField1.sendKeys("2514585621");
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
		Thread.sleep(5000);

		
		
	
}
@Test
public void TC_ID_04_01 () throws InterruptedException {
		
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]")).click();
		
	Thread.sleep(10000);
		
	System.out.println("Invalid Mobile Number");
	Thread.sleep(5000);
	
	driver.navigate().back();
	
	WebElement EnterMobileField2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView"));
	
	Thread.sleep(5000);
	
	EnterMobileField2.click();
			
	Thread.sleep(5000);
			
	EnterMobileField2.clear();	
	
	Thread.sleep(5000);
		
		}

@Test
	public void TC_ID_04_02 () throws InterruptedException {

	driver.navigate().back();
	
	WebElement EnterMobileField2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView"));
		
		
	EnterMobileField2.click();
		
	Thread.sleep(5000);
		
		
	EnterMobileField2.sendKeys("8574830627");
		
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
	Thread.sleep(5000);	
		
	}

@Test	
	public void TC_ID_04_03 () throws InterruptedException {

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]")).click();
		
		Thread.sleep(10000);
	
	}
@Test
public void TC_ID_05_01 () throws InterruptedException {
    
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Didn’t receive OTP ? Send Again']")).click();
	TouchAction Sendagain = new TouchAction(driver);

	Sendagain.tap(PointOption.point(542, 1042)).perform();
	
	Thread.sleep(5000);
	//Thread.sleep(5000);
	
}
@Test
public void TC_ID_05_02 () throws InterruptedException {

	TouchAction Verify = new TouchAction(driver);

	Verify.tap(PointOption.point(547, 1296)).perform();
	
	Thread.sleep(5000);
	
}
@Test
public void TC_ID_05_03 () throws InterruptedException {

	TouchAction Profile = new TouchAction(driver);

	Profile.tap(PointOption.point(950, 192)).perform();
	
	Thread.sleep(5000);
	
}

}
