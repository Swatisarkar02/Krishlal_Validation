package Profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Launch_App.Launch_App_Advance;
import Launch_App.Login_User1;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TC_ID_26 extends Launch_App_Advance {

@Test	
		public void Login () throws InterruptedException {
			Login_User1 Test = new Login_User1();
			Test.Login_User1_Seller();
		
	}
@Test	
public void Profile () throws InterruptedException {
		
	TouchAction profile = new TouchAction(driver);

	profile.tap(PointOption.point(955, 197)).perform();
	
	Thread.sleep(5000);
	
	//driver.findElement(By.xpath("android.widget.ImageView[@index='3']")).click();	
	//Thread.sleep(5000);	
	}
@Test
public void TC_ID_26_02 () throws InterruptedException {
	driver.findElement(By.xpath("//android.view.View[@content-desc='Edit Profile￼']")).click();	
	Thread.sleep(5000);
	
	System.out.println("User Name");
	Thread.sleep(5000);
	
	System.out.println("Father/Mother/wife/husband name");
	Thread.sleep(5000);
	
	System.out.println("Address");
	Thread.sleep(5000);
	
	System.out.println("Pin Code");
	Thread.sleep(5000);
	
	System.out.println("District");
	Thread.sleep(5000);
	
	System.out.println("State");
	Thread.sleep(5000); 
	
	System.out.println("update button");
	Thread.sleep(5000);
	
}
@Test
public void TC_ID_26_03 () throws InterruptedException {

	driver.findElement(By.xpath("//android.widget.Button[@content-desc='Update']")).click();	
	Thread.sleep(5000);
	
	System.out.println("Sucessfully updated");
	Thread.sleep(5000);
	
	
	}	


@Test
public void TC_ID_26_04 () throws InterruptedException {

		
	WebElement Enterfathermotherwifehusband = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
	
	Thread.sleep(5000);
	
	Enterfathermotherwifehusband.click();
		
	Thread.sleep(5000);
		
		
	Enterfathermotherwifehusband.sendKeys("Test");
	Thread.sleep(5000);	

	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]")).click();	
	Thread.sleep(5000);
	
	WebElement Address = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText"));
	
	Thread.sleep(5000);
	
	Address.click();
		
	Thread.sleep(5000);
		
		
	Address.sendKeys("delhi");
	Thread.sleep(5000);	
	
	TouchAction Address1 = new TouchAction(driver);

	Address1.tap(PointOption.point(245, 360)).perform();
	
	Thread.sleep(5000);
	}


@Test
public void TC_ID_26_05 () throws InterruptedException {

	TouchAction UseCurrentLocation = new TouchAction(driver);

	UseCurrentLocation.tap(PointOption.point(101, 1205)).perform();
	
	Thread.sleep(5000);
	
	System.out.println("While using the app");
	Thread.sleep(5000);
	
	System.out.println("only this time");
	Thread.sleep(5000);
	
	System.out.println("Don't allow");
	Thread.sleep(5000);

	
	
}
@Test
public void TC_ID_26_06 () throws InterruptedException {

	TouchAction OnlyThisTime = new TouchAction(driver);

	OnlyThisTime.tap(PointOption.point(542, 1690)).perform();
	
	Thread.sleep(5000);

	
}
@Test
public void TC_ID_26_07 () throws InterruptedException {

	TouchAction AddressField = new TouchAction(driver);

	AddressField.tap(PointOption.point(355, 1382)).perform();
	
	Thread.sleep(5000);


	System.out.println("Search field");
	Thread.sleep(5000);
	
	
	System.out.println("cross icon");
	Thread.sleep(5000);
	
	System.out.println("back arrow");
	Thread.sleep(5000);
	
	System.out.println("enter your address watermark");
	Thread.sleep(5000);
	
}
@Test

public void TC_ID_26_08 () throws InterruptedException {

	WebElement SearchField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText"));
	
	Thread.sleep(5000);
	
	SearchField.click();
		
	Thread.sleep(5000);
		
		
	SearchField.sendKeys("delhi");
	Thread.sleep(5000);	

	TouchAction AddressList = new TouchAction(driver);

	AddressList.tap(PointOption.point(245, 360)).perform();
	
	Thread.sleep(5000);
	
	
}
@Test
public void TC_ID_26_09 () throws InterruptedException {
	
	TouchAction Camera = new TouchAction(driver);

	Camera.tap(PointOption.point(682, 643)).perform();
	
	Thread.sleep(5000);
	
	
	System.out.println("Camera icon");
	Thread.sleep(5000);
	
	System.out.println("Attachment icon");
	Thread.sleep(5000);
	
	System.out.println("cross icon");
	Thread.sleep(5000);
	
}
@Test
public void TC_ID_26_10 () throws InterruptedException {

	TouchAction CameraIcon = new TouchAction(driver);

	CameraIcon.tap(PointOption.point(216, 2213)).perform();
	
	Thread.sleep(5000);
	
	System.out.println("While using the app");
	Thread.sleep(5000);
	
	System.out.println("only this time");
	Thread.sleep(5000);
	
	System.out.println("Don't allow");
	Thread.sleep(5000);
	
	//TouchAction onlythistime = new TouchAction(driver);

	//onlythistime.tap(PointOption.point(533, 1368)).perform();
	driver.navigate().back();

}
	
	
@Test	
	
public void TC_ID_26_11 () throws InterruptedException {	
	
	TouchAction attachmenticon = new TouchAction(driver);

	attachmenticon.tap(PointOption.point(864, 2227)).perform();
	
}
@Test
public void TC_ID_26_12 () throws InterruptedException {		
	
	System.out.println("Photo");
	Thread.sleep(5000);
	
	System.out.println("Albums");
	Thread.sleep(5000);
	
	System.out.println("cross icon");
	Thread.sleep(5000);
	
	

}
@Test

public void TC_ID_26_13 () throws InterruptedException {		
	
	TouchAction attachmenticon = new TouchAction(driver);

	attachmenticon.tap(PointOption.point(91, 432)).perform();
	Thread.sleep(5000);

	
}
@Test
public void TC_ID_26_14 () throws InterruptedException {		
	
	TouchAction attachmenticon = new TouchAction(driver);

	attachmenticon.tap(PointOption.point(538, 2213)).perform();

	Thread.sleep(5000);
	
}
@Test
public void TC_ID_26_15 () throws InterruptedException {		
	
	TouchAction attachmenticon = new TouchAction(driver);

	attachmenticon.tap(PointOption.point(528, 2203)).perform();

	Thread.sleep(5000);

}
}
