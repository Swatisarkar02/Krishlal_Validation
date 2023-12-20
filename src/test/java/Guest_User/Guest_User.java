package Guest_User;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Launch_App.Launch_App_Advance;

public class Guest_User extends Launch_App_Advance{
@Test	
public void Guest_User1 () throws InterruptedException {
		
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
                                                               	
	driver.findElement(By.xpath("android.widget.ImageView[@index='3']")).click();	
	Thread.sleep(5000);	
	}

@Test	
	public void TC_ID_06_04 () throws InterruptedException {
		
	driver.findElement(By.xpath("//android.view.View[@content-desc='Edit Profile￼']")).click();	
	Thread.sleep(5000);
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]")).click();
	//Thread.sleep(5000);
	
	//System.out.println("Guest");
	//Thread.sleep(5000);
	
	//System.out.println("Address");
	//Thread.sleep(5000);
	
	//System.out.println("Pin Code");
	//Thread.sleep(5000);
	
	//System.out.println("District");
	//Thread.sleep(5000);
		
	//System.out.println("State");
	//Thread.sleep(5000);
	
	}
@Test
	public void TC_ID_06_05 () throws InterruptedException {
		
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Button[1]")).click();	
	//Thread.sleep(5000);
		
	}
@Test	
	public void TC_ID_06_06 () throws InterruptedException {
		
	//TouchAction quicklink1 = new TouchAction(driver);

	//quicklink1.tap(PointOption.point(343, 2045)).perform();
		
	//Thread.sleep(5000);
		
	//System.out.println("Come Back Soon");
		
	//WebElement Logout = driver.findElement(By.xpath("//android.widget.Button[@index='0']"));
	//Assert.assertEquals(true, Logout.isDisplayed());
	//System.out.println("Logout");
	//Thread.sleep(5000);
		
	//TouchAction quicklink1 = new TouchAction(driver);

	//quicklink1.tap(PointOption.point(350, 1464)).perform();
		
	//Thread.sleep(5000);
			
		}
	
	
}


