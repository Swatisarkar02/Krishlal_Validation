package Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Launch_App.Launch_App_Advance;
import Launch_App.Login_User1;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TC_ID_25 extends Launch_App_Advance{

@Test	
	public void Login () throws InterruptedException {
		Login_User1 Test = new Login_User1();
		Test.Login_User1_Seller();
	}
@Test	


	public void TC_ID_25_01 () throws InterruptedException {
	
	//Check the view reports available -->  Click on reports  --> Start Date= 28/04/2023         End  Date= 28/09/2023 
	
	Thread.sleep(20000);
	
		TouchAction Menu = new TouchAction(driver);

		Menu.tap(PointOption.point(950, 192)).perform();
		
		Thread.sleep(5000);
		
		
		TouchAction Report = new TouchAction(driver);

		Report.tap(PointOption.point(331, 1138)).perform();
		
		Thread.sleep(5000);
		
		
		TouchAction ReportFromDateField = new TouchAction(driver);

		ReportFromDateField.tap(PointOption.point(212, 566)).perform();
		
//		Thread.sleep(5000);
			
		Thread.sleep(5000);
		
		//Select From Date
		
		WebElement FromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
		
		FromMonth.clear();
			
		Thread.sleep(5000);
		
		FromMonth.sendKeys("oct");
		
		Thread.sleep(5000);
		
		System.out.println("oct");	
		Thread.sleep(5000);
		
		
		Thread.sleep(5000);
		WebElement FromDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
		
		FromDate.clear();
			
		Thread.sleep(5000);
		
		FromDate.sendKeys("01");
		
		Thread.sleep(5000);
		
		System.out.println("01");	
		
		Thread.sleep(5000);
		
		WebElement FromYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
		
		FromYear.clear();
			
		Thread.sleep(5000);
		
		FromYear.sendKeys("2023");
		
		Thread.sleep(5000);
		
		System.out.println("2023");	
		
		Thread.sleep(5000);
		
		TouchAction FromSetButton_1 = new TouchAction(driver);

		Report.tap(PointOption.point(212, 1445)).perform();
		
		Thread.sleep(5000);
		
		//WebElement FromSetButton_1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
		//WebElement FromSetButton_1 = driver.findElement(By.xpath("android.widget.Button[@index='0']"));
		
		
		//FromSetButton_1.click();
			
		//Thread.sleep(5000);
		
		
		//select To Date
		
		
		TouchAction ReportToDateField = new TouchAction(driver);

		ReportToDateField.tap(PointOption.point(328, 778)).perform();
			
		Thread.sleep(5000);
		
		
		WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
		
		ToMonth.clear();
			
		Thread.sleep(5000);
		
		ToMonth.sendKeys("oct");
		
		Thread.sleep(5000);
		
		System.out.println("oct");	
		
		
		Thread.sleep(5000);
		WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
		
		ToDate.clear();
			
		Thread.sleep(5000);
		
		ToDate.sendKeys("04");
		
		Thread.sleep(5000);
		
		System.out.println("04");	
		
		Thread.sleep(5000);
		
		WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
		
		ToYear.clear();
			
		Thread.sleep(5000);
		
		ToYear.sendKeys("2023");
		
		Thread.sleep(5000);
		
		System.out.println("2023");	
		
		Thread.sleep(5000);
		
		TouchAction ToSetButton_2 = new TouchAction(driver);

		Report.tap(PointOption.point(212, 1445)).perform();
		
		Thread.sleep(5000);
		
		
		//WebElement ToSetButton_2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
		//WebElement ToSetButton_1 = driver.findElement(By.xpath("android.widget.Button[@index='0']"));
		
		//ToSetButton_2.click();
			
		//Thread.sleep(5000);
		
		// Click on View Report button
		
		TouchAction ViewReportButton = new TouchAction(driver);

		ViewReportButton.tap(PointOption.point(510, 1039)).perform();
			
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		
		
		
		
}
@Test  
public void TC_ID_25_02 () throws InterruptedException {
	
	//Check the view charts report available   Click on reports Start Date= 28/04/2023         End  Date= 28/09/2023 

	
	TouchAction Report = new TouchAction(driver);

	Report.tap(PointOption.point(331, 1138)).perform();
	
	Thread.sleep(5000);
	  
	TouchAction ReportFromDateField = new TouchAction(driver);

	ReportFromDateField.tap(PointOption.point(212, 566)).perform();
	
		
	Thread.sleep(5000);
	
	WebElement FromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	FromMonth.clear();
		
	Thread.sleep(5000);
	
	FromMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	Thread.sleep(5000);
	
	
	Thread.sleep(5000);
	WebElement FromDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	FromDate.clear();
		
	Thread.sleep(5000);
	
	FromDate.sendKeys("01");
	
	Thread.sleep(5000);
	
	System.out.println("01");	
	
	Thread.sleep(5000);
	
	WebElement FromYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	FromYear.clear();
		
	Thread.sleep(5000);
	
	FromYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction FromSetButton_3 = new TouchAction(driver);

	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement FromSetButton_3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	//WebElement FromSetButton = driver.findElement(By.xpath("android.widget.Button[@index='0']"));
	
	//FromSetButton_3.click();
		
	//Thread.sleep(5000);
	
	
	//select To Date
	
	
	TouchAction ReportToDateField = new TouchAction(driver);

	ReportToDateField.tap(PointOption.point(328, 778)).perform();
		
	Thread.sleep(5000);
	
	
	WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	ToMonth.clear();
		
	Thread.sleep(5000);
	
	ToMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	
	
	Thread.sleep(5000);
	WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	ToDate.clear();
		
	Thread.sleep(5000);
	
	ToDate.sendKeys("04");
	
	Thread.sleep(5000);
	
	System.out.println("04");	
	
	Thread.sleep(5000);
	WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	ToYear.clear();
		
	Thread.sleep(5000);
	
	ToYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_4 = new TouchAction(driver);

	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement ToSetButton_4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	
	
	//ToSetButton_4.click();
		
	//Thread.sleep(5000);
	
	// Click on View Report button
	
	TouchAction ViewChartReport = new TouchAction(driver);

	ViewChartReport.tap(PointOption.point(551, 1285)).perform();
		
	Thread.sleep(5000);
	
	driver.navigate().back();
	Thread.sleep(5000);

	
} 	
@Test 
public void TC_ID_25_03 () throws InterruptedException {
	
	//Check the top Ten service Provided   Click on reports  Start Date= 28/04/2023         End  Date= 28/09/2023  
 

	TouchAction Report = new TouchAction(driver);

	Report.tap(PointOption.point(331, 1138)).perform();
	
	Thread.sleep(5000);
	  
	TouchAction ReportFromDateField = new TouchAction(driver);

	ReportFromDateField.tap(PointOption.point(212, 566)).perform();
	
		
	Thread.sleep(5000);
	
	WebElement FromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	FromMonth.clear();
		
	Thread.sleep(5000);
	
	FromMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	Thread.sleep(5000);
	
	
	Thread.sleep(5000);
	WebElement FromDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	FromDate.clear();
		
	Thread.sleep(5000);
	
	FromDate.sendKeys("01");
	
	Thread.sleep(5000);
	
	System.out.println("01");	
	
	Thread.sleep(5000);
	
	WebElement FromYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	FromYear.clear();
		
	Thread.sleep(5000);
	
	FromYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction FromSetButton_5 = new TouchAction(driver);

	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement FromSetButton_3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	//WebElement FromSetButton = driver.findElement(By.xpath("android.widget.Button[@index='0']"));
	
	//FromSetButton_3.click();
		
	//Thread.sleep(5000);
	
	
	//select To Date
	
	
	TouchAction ReportToDateField = new TouchAction(driver);

	ReportToDateField.tap(PointOption.point(328, 778)).perform();
		
	Thread.sleep(5000);
	
	
	WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	ToMonth.clear();
		
	Thread.sleep(5000);
	
	ToMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	
	
	Thread.sleep(5000);
	WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	ToDate.clear();
		
	Thread.sleep(5000);
	
	ToDate.sendKeys("04");
	
	Thread.sleep(5000);
	
	System.out.println("04");	
	
	Thread.sleep(5000);
	WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	ToYear.clear();
		
	Thread.sleep(5000);
	
	ToYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_6 = new TouchAction(driver);

	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement ToSetButton_4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	
	
	//ToSetButton_4.click();
		
	//Thread.sleep(5000);
	
	// Click on View Report button
	
	TouchAction TopTenServiceProvided = new TouchAction(driver);

	TopTenServiceProvided.tap(PointOption.point(544, 1553)).perform();
		
	Thread.sleep(5000);
	
	driver.navigate().back();

}
@Test 
public void TC_ID_25_04 () throws InterruptedException {

	
	
	TouchAction Report = new TouchAction(driver);

	Report.tap(PointOption.point(331, 1138)).perform();
	
	Thread.sleep(5000);
	  
	TouchAction ReportFromDateField = new TouchAction(driver);

	ReportFromDateField.tap(PointOption.point(212, 566)).perform();
	
		
	Thread.sleep(5000);
	
	//WebElement FromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	//WebElement FromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	//FromMonth.clear();
		
	//Thread.sleep(5000);
	
	//FromMonth.sendKeys("oct");
	
	//Thread.sleep(5000);
	
	//System.out.println("oct");	
	//Thread.sleep(5000);
	
	
	Thread.sleep(5000);
	WebElement FromDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	FromDate.clear();
		
	Thread.sleep(5000);
	
	FromDate.sendKeys("01");
	
	Thread.sleep(5000);
	
	System.out.println("01");	
	
	Thread.sleep(5000);
	
	WebElement FromYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	FromYear.clear();
		
	Thread.sleep(5000);
	
	FromYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction FromSetButton_7 = new TouchAction(driver);

	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement FromSetButton_3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	//WebElement FromSetButton = driver.findElement(By.xpath("android.widget.Button[@index='0']"));
	
	//FromSetButton_3.click();
		
	//Thread.sleep(5000);
	
	
	//select To Date
	
	
	TouchAction ReportToDateField = new TouchAction(driver);

	ReportToDateField.tap(PointOption.point(328, 778)).perform();
		
	Thread.sleep(5000);
	
	
	WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	ToMonth.clear();
		
	Thread.sleep(5000);
	
	ToMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	
	
	Thread.sleep(5000);
	WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	ToDate.clear();
		
	Thread.sleep(5000);
	
	ToDate.sendKeys("04");
	
	Thread.sleep(5000);
	
	System.out.println("04");	
	
	Thread.sleep(5000);
	WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	ToYear.clear();
		
	Thread.sleep(5000);
	
	ToYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_8 = new TouchAction(driver);

	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement ToSetButton_4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	
	
	//ToSetButton_4.click();
		
	//Thread.sleep(5000);
	
	// Click on View Report button
	
	TouchAction TotalAmountSummary = new TouchAction(driver);

	TotalAmountSummary.tap(PointOption.point(488, 1817)).perform();
		
	Thread.sleep(5000);
	
	driver.navigate().back();
	Thread.sleep(5000);
}

@Test  
public void TC_ID_25_05 () throws InterruptedException {
	
	//Check for the reward   Click on reports  Start Date= 28/04/2023         End  Date= 28/09/2023 

	TouchAction Report = new TouchAction(driver);

	Report.tap(PointOption.point(331, 1138)).perform();
	
	Thread.sleep(5000);
	  
	TouchAction ReportFromDateField = new TouchAction(driver);

	ReportFromDateField.tap(PointOption.point(212, 566)).perform();
	
		
	Thread.sleep(5000);
	
	WebElement FromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	FromMonth.clear();
		
	Thread.sleep(5000);
	
	FromMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	Thread.sleep(5000);
	
	
	Thread.sleep(5000);
	WebElement FromDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	FromDate.clear();
		
	Thread.sleep(5000);
	
	FromDate.sendKeys("01");
	
	Thread.sleep(5000);
	
	System.out.println("01");	
	
	Thread.sleep(5000);
	
	WebElement FromYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	FromYear.clear();
		
	Thread.sleep(5000);
	
	FromYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction FromSetButton_9 = new TouchAction(driver);

	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement FromSetButton_3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	//WebElement FromSetButton = driver.findElement(By.xpath("android.widget.Button[@index='0']"));
	
	//FromSetButton_3.click();
		
	//Thread.sleep(5000);
	
	
	//select To Date
	
	
	TouchAction ReportToDateField = new TouchAction(driver);

	ReportToDateField.tap(PointOption.point(328, 778)).perform();
		
	Thread.sleep(5000);
	
	
	WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	ToMonth.clear();
		
	Thread.sleep(5000);
	
	ToMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	
	
	Thread.sleep(5000);
	WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	ToDate.clear();
		
	Thread.sleep(5000);
	
	ToDate.sendKeys("04");
	
	Thread.sleep(5000);
	
	System.out.println("04");	
	
	Thread.sleep(5000);
	WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	ToYear.clear();
		
	Thread.sleep(5000);
	
	ToYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_10 = new TouchAction(driver);

	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement ToSetButton_4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	
	
	//ToSetButton_4.click();
		
	//Thread.sleep(5000);
	
	// Click on View Report button
	
	TouchAction Reward = new TouchAction(driver);

	Reward.tap(PointOption.point(547, 2056)).perform();
		
	Thread.sleep(5000);
	
	driver.navigate().back();
	Thread.sleep(5000);

}
@Test 
public void TC_ID_25_06 () throws InterruptedException {
	
	//Check for custom hiring reports  Click on reports  Start Date= 28/04/2023         End  Date= 28/09/2023 
	
	TouchAction Report = new TouchAction(driver);
	
	Report.tap(PointOption.point(331, 1138)).perform();
	
	Thread.sleep(5000);
	  
	TouchAction ReportFromDateField = new TouchAction(driver);
	
	ReportFromDateField.tap(PointOption.point(212, 566)).perform();
	
		
	Thread.sleep(5000);
	
	WebElement FromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	FromMonth.clear();
		
	Thread.sleep(5000);
	
	FromMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	Thread.sleep(5000);
	
	
	Thread.sleep(5000);
	WebElement FromDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	FromDate.clear();
		
	Thread.sleep(5000);
	
	FromDate.sendKeys("01");
	
	Thread.sleep(5000);
	
	System.out.println("01");	
	
	Thread.sleep(5000);
	
	WebElement FromYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	FromYear.clear();
		
	Thread.sleep(5000);
	
	FromYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction FromSetButton_11 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement FromSetButton_3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	//WebElement FromSetButton = driver.findElement(By.xpath("android.widget.Button[@index='0']"));
	
	//FromSetButton_3.click();
		
	//Thread.sleep(5000);
	
	
	//select To Date
	
	
	TouchAction ReportToDateField = new TouchAction(driver);
	
	ReportToDateField.tap(PointOption.point(328, 778)).perform();
		
	Thread.sleep(5000);
	
	
	WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	ToMonth.clear();
		
	Thread.sleep(5000);
	
	ToMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	
	
	Thread.sleep(5000);
	WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	ToDate.clear();
		
	Thread.sleep(5000);
	
	ToDate.sendKeys("04");
	
	Thread.sleep(5000);
	
	System.out.println("04");	
	
	Thread.sleep(5000);
	WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	ToYear.clear();
		
	Thread.sleep(5000);
	
	ToYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_12 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement ToSetButton_4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	
	
	//ToSetButton_4.click();
		
	//Thread.sleep(5000);
	
	// Click on View Report button
	
	TouchAction CustomHiringCentreCHCReport = new TouchAction(driver);
	
	CustomHiringCentreCHCReport.tap(PointOption.point(495, 2153)).perform();
		
	Thread.sleep(5000);
	
	driver.navigate().back();
	Thread.sleep(5000);
	
	}

@Test 
public void TC_ID_25_07 () throws InterruptedException {

	//Check for mandi rates  reports  Click on reports  Start Date= 28/04/2023         End  Date= 28/09/2023 
	
	TouchAction Report = new TouchAction(driver);
	
	Report.tap(PointOption.point(331, 1138)).perform();
	
	Thread.sleep(5000);
	  
	TouchAction ReportFromDateField = new TouchAction(driver);
	
	ReportFromDateField.tap(PointOption.point(212, 566)).perform();
	
		
	Thread.sleep(5000);
	
	//WebElement FromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	//FromMonth.clear();
		
	//Thread.sleep(5000);
	
	//FromMonth.sendKeys("oct");
	
	//Thread.sleep(5000);
	
	//System.out.println("oct");	
	//Thread.sleep(5000);
	
	
	//Thread.sleep(5000);
	WebElement FromDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	FromDate.clear();
		
	Thread.sleep(5000);
	
	FromDate.sendKeys("01");
	
	Thread.sleep(5000);
	
	System.out.println("01");	
	
	Thread.sleep(5000);
	
	WebElement FromYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	FromYear.clear();
		
	Thread.sleep(5000);
	
	FromYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction FromSetButton_13 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement FromSetButton_3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	//WebElement FromSetButton = driver.findElement(By.xpath("android.widget.Button[@index='0']"));
	
	//FromSetButton_3.click();
		
	//Thread.sleep(5000);
	
	
	//select To Date
	
	
	TouchAction ReportToDateField = new TouchAction(driver);
	
	ReportToDateField.tap(PointOption.point(328, 778)).perform();
		
	Thread.sleep(5000);
	
	
	WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	ToMonth.clear();
		
	Thread.sleep(5000);
	
	ToMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	
	
	Thread.sleep(5000);
	WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	ToDate.clear();
		
	Thread.sleep(5000);
	
	ToDate.sendKeys("04");
	
	Thread.sleep(5000);
	
	System.out.println("04");	
	
	Thread.sleep(5000);
	WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	ToYear.clear();
		
	Thread.sleep(5000);
	
	ToYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_14 = new TouchAction(driver);
	
	ToSetButton_14.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement ToSetButton_4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	
	
	//ToSetButton_4.click();
		
	//Thread.sleep(5000);
	
	// Click on View Report button
	
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
	
	Thread.sleep(5000);
	
	TouchAction MandiRates = new TouchAction(driver);
	
	MandiRates.tap(PointOption.point(499, 495)).perform();
		
	Thread.sleep(5000);
	
	TouchAction MandiRateDate1 = new TouchAction(driver);
	
	MandiRateDate1.tap(PointOption.point(428, 454)).perform();
		
	Thread.sleep(5000);
	
	WebElement MandiRateMonth2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	MandiRateMonth2.clear();
		
	Thread.sleep(5000);
	
	MandiRateMonth2.sendKeys("Apr");
	
	Thread.sleep(5000);
	
	System.out.println("Apr");	
	
	Thread.sleep(5000);
	
	
	WebElement MandiRateDate2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	MandiRateDate2.clear();
		
	Thread.sleep(5000);
	
	MandiRateDate2.sendKeys("28");
	
	Thread.sleep(5000);
	
	System.out.println("28");	
	
	Thread.sleep(5000);
	
	
	WebElement MandiRateYear2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	MandiRateYear2.clear();
		
	Thread.sleep(5000);
	
	MandiRateYear2.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	System.out.println("Mandi Rate Date");
	
	Thread.sleep(5000);
	

	TouchAction ToSetButton_14A = new TouchAction(driver);
	
	ToSetButton_14A.tap(PointOption.point(227, 1456)).perform();
	
	Thread.sleep(5000);
	
	
	TouchAction Commoditiy = new TouchAction(driver);
	
	Commoditiy.tap(PointOption.point(387, 674)).perform();
	
	Thread.sleep(5000);
	
	
	TouchAction Cotton = new TouchAction(driver);
	
	Cotton.tap(PointOption.point(898, 473)).perform();
	
	Thread.sleep(5000);
	
	
	TouchAction Submit1 = new TouchAction(driver);
	
	Submit1.tap(PointOption.point(387, 674)).perform();
	
	Thread.sleep(5000);
	
	System.out.println("Mandi Rates Graph");
	
	Thread.sleep(5000);
	
	driver.navigate().back();
	
	Thread.sleep(5000);
	
	}



@Test 
public void TC_ID_25_08 () throws InterruptedException {

	//Check for mandi rate changes report  Click on reports Start Date= 28/04/2023         End  Date= 28/09/2023   
	
	TouchAction Report = new TouchAction(driver);
	
	Report.tap(PointOption.point(331, 1138)).perform();
	
	Thread.sleep(5000);
	  
	TouchAction ReportFromDateField = new TouchAction(driver);
	
	ReportFromDateField.tap(PointOption.point(212, 566)).perform();
	
		
	Thread.sleep(5000);
	
	//WebElement FromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	//FromMonth.clear();
		
	//Thread.sleep(5000);
	
	//FromMonth.sendKeys("oct");
	
	//Thread.sleep(5000);
	
	//System.out.println("oct");	
	//Thread.sleep(5000);
	
	
	//Thread.sleep(5000);
	WebElement FromDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	FromDate.clear();
		
	Thread.sleep(5000);
	
	FromDate.sendKeys("01");
	
	Thread.sleep(5000);
	
	System.out.println("01");	
	
	Thread.sleep(5000);
	
	WebElement FromYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	FromYear.clear();
		
	Thread.sleep(5000);
	
	FromYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_5 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement FromSetButton_3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	//WebElement FromSetButton = driver.findElement(By.xpath("android.widget.Button[@index='0']"));
	
	//FromSetButton_3.click();
		
	//Thread.sleep(5000);
	
	
	//select To Date
	
	
	TouchAction ReportToDateField = new TouchAction(driver);
	
	ReportToDateField.tap(PointOption.point(328, 778)).perform();
		
	Thread.sleep(5000);
	
	
	WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	ToMonth.clear();
		
	Thread.sleep(5000);
	
	ToMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	
	
	Thread.sleep(5000);
	WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	ToDate.clear();
		
	Thread.sleep(5000);
	
	ToDate.sendKeys("04");
	
	Thread.sleep(5000);
	
	System.out.println("04");	
	
	Thread.sleep(5000);
	WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	ToYear.clear();
		
	Thread.sleep(5000);
	
	ToYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	
	
	TouchAction ToSetButton_6 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement ToSetButton_4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	
	
	//ToSetButton_4.click();
		
	//Thread.sleep(5000);
	
	// Click on View Report button
	
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
	
	Thread.sleep(5000);
	
	TouchAction MandiRatesChange = new TouchAction(driver);
	
	MandiRatesChange.tap(PointOption.point(510, 752)).perform();
		
	Thread.sleep(5000);
	
	System.out.println("Mandi Rate Change");
	
	Thread.sleep(5000);
	
    TouchAction MandiRatesChangeFromDate = new TouchAction(driver);
	
    MandiRatesChangeFromDate.tap(PointOption.point(510, 752)).perform();
		
	Thread.sleep(5000);
		
	WebElement MandiRatesChangeFromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	MandiRatesChangeFromMonth.clear();
		
	Thread.sleep(5000);
	
	MandiRatesChangeFromMonth.sendKeys("Apr");
	
	Thread.sleep(5000);
	
	System.out.println("Apr");	
	
	Thread.sleep(5000);
	
	WebElement MandiRatesChangeFromDate1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
		
	MandiRatesChangeFromDate1.clear();
		
	Thread.sleep(5000);
	
	MandiRatesChangeFromDate1.sendKeys("28");
	
	Thread.sleep(5000);
	
	System.out.println("28");	
	
	
	Thread.sleep(5000);
	
	
	WebElement MandiRatesChangeFromYear1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	MandiRatesChangeFromYear1.clear();
		
	Thread.sleep(5000);
	
	MandiRatesChangeFromYear1.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_7 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	
	TouchAction MandiRatesChangeToDate = new TouchAction(driver);
	
	MandiRatesChangeToDate.tap(PointOption.point(510, 752)).perform();
		
	Thread.sleep(5000);
		
	WebElement MandiRatesChangeToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	MandiRatesChangeToMonth.clear();
		
	Thread.sleep(5000);
	
	MandiRatesChangeToMonth.sendKeys("Oct");
	
	Thread.sleep(5000);
	
	System.out.println("Oct");	
	
	Thread.sleep(5000);
	
	WebElement MandiRatesChangeToDate1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
		
	MandiRatesChangeToDate1.clear();
		
	Thread.sleep(5000);
	
	MandiRatesChangeToDate1.sendKeys("03");
	
	Thread.sleep(5000);
	
	System.out.println("03");	
	
	
	Thread.sleep(5000);
	
	
	WebElement MandiRatesChangeToYear1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	MandiRatesChangeToYear1.clear();
		
	Thread.sleep(5000);
	
	MandiRatesChangeFromYear1.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_8 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	TouchAction APMC = new TouchAction(driver);
	
	APMC.tap(PointOption.point(406, 890)).perform();
	
	Thread.sleep(5000);
	
	TouchAction APMCoption = new TouchAction(driver);
	
	APMCoption.tap(PointOption.point(898, 477)).perform();
	
	Thread.sleep(5000);
	
	TouchAction commodity = new TouchAction(driver);
	
	commodity.tap(PointOption.point(335, 1095)).perform();
	
	Thread.sleep(5000);
	
	TouchAction commodityoption = new TouchAction(driver);
	
	commodityoption.tap(PointOption.point(909, 462)).perform();
	
	Thread.sleep(5000);
	
	TouchAction submit = new TouchAction(driver);
	
	submit.tap(PointOption.point(171, 1285)).perform();
	
	Thread.sleep(5000);
	
	driver.navigate().back();
	
	Thread.sleep(5000);
	
	}

@Test
public void TC_ID_25_09 () throws InterruptedException {

	//Check for recept and payment summary report   Click on reports  Start Date= 28/04/2023         End  Date= 28/09/2023 
	
	TouchAction Report = new TouchAction(driver);
	
	Report.tap(PointOption.point(331, 1138)).perform();
	
	Thread.sleep(5000);
	  
	TouchAction ReportFromDateField = new TouchAction(driver);
	
	ReportFromDateField.tap(PointOption.point(212, 566)).perform();
	
		
	Thread.sleep(5000);
	
	WebElement FromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	FromMonth.clear();
		
	Thread.sleep(5000);
	
	FromMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	Thread.sleep(5000);
	
	
	Thread.sleep(5000);
	WebElement FromDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	FromDate.clear();
		
	Thread.sleep(5000);
	
	FromDate.sendKeys("01");
	
	Thread.sleep(5000);
	
	System.out.println("01");	
	
	Thread.sleep(5000);
	
	WebElement FromYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	FromYear.clear();
		
	Thread.sleep(5000);
	
	FromYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_5 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement FromSetButton_3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	//WebElement FromSetButton = driver.findElement(By.xpath("android.widget.Button[@index='0']"));
	
	//FromSetButton_3.click();
		
	//Thread.sleep(5000);
	
	
	//select To Date
	
	
	TouchAction ReportToDateField = new TouchAction(driver);
	
	ReportToDateField.tap(PointOption.point(328, 778)).perform();
		
	Thread.sleep(5000);
	
	
	WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	ToMonth.clear();
		
	Thread.sleep(5000);
	
	ToMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	
	
	Thread.sleep(5000);
	WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	ToDate.clear();
		
	Thread.sleep(5000);
	
	ToDate.sendKeys("04");
	
	Thread.sleep(5000);
	
	System.out.println("04");	
	
	Thread.sleep(5000);
	WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	ToYear.clear();
		
	Thread.sleep(5000);
	
	ToYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_6 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement ToSetButton_4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	
	
	//ToSetButton_4.click();
		
	//Thread.sleep(5000);
	
	// Click on View Report button
	
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
	
	Thread.sleep(5000);
	
	TouchAction BookingStatusReport = new TouchAction(driver);
	
	BookingStatusReport.tap(PointOption.point(521, 1277)).perform();
		
	Thread.sleep(5000);
	
	driver.navigate().back();
	Thread.sleep(5000);
	
}


@Test
public void TC_ID_25_10 () throws InterruptedException {
	//Check for booking status report  Click on reports  Start Date= 28/04/2023         End  Date= 28/09/2023 

	TouchAction Report = new TouchAction(driver);
	
	Report.tap(PointOption.point(331, 1138)).perform();
	
	Thread.sleep(5000);
	  
	TouchAction ReportFromDateField = new TouchAction(driver);
	
	ReportFromDateField.tap(PointOption.point(212, 566)).perform();
	
		
	Thread.sleep(5000);
	
	WebElement FromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	FromMonth.clear();
		
	Thread.sleep(5000);
	
	FromMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	Thread.sleep(5000);
	
	
	Thread.sleep(5000);
	WebElement FromDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	FromDate.clear();
		
	Thread.sleep(5000);
	
	FromDate.sendKeys("01");
	
	Thread.sleep(5000);
	
	System.out.println("01");	
	
	Thread.sleep(5000);
	
	WebElement FromYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	FromYear.clear();
		
	Thread.sleep(5000);
	
	FromYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_5 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement FromSetButton_3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	//WebElement FromSetButton = driver.findElement(By.xpath("android.widget.Button[@index='0']"));
	
	//FromSetButton_3.click();
		
	//Thread.sleep(5000);
	
	
	//select To Date
	
	
	TouchAction ReportToDateField = new TouchAction(driver);
	
	ReportToDateField.tap(PointOption.point(328, 778)).perform();
		
	Thread.sleep(5000);
	
	
	WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	ToMonth.clear();
		
	Thread.sleep(5000);
	
	ToMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	
	
	Thread.sleep(5000);
	WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	ToDate.clear();
		
	Thread.sleep(5000);
	
	ToDate.sendKeys("04");
	
	Thread.sleep(5000);
	
	System.out.println("04");	
	
	Thread.sleep(5000);
	WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	ToYear.clear();
		
	Thread.sleep(5000);
	
	ToYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_6 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement ToSetButton_4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	
	
	//ToSetButton_4.click();
		
	//Thread.sleep(5000);
	
	// Click on View Report button
	
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
	
	Thread.sleep(5000);
	
	TouchAction ReceiptandPaymentSummaryReport = new TouchAction(driver);
	
	ReceiptandPaymentSummaryReport.tap(PointOption.point(510, 1002)).perform();
		
	Thread.sleep(5000);
	
	TouchAction Receipt = new TouchAction(driver);
	
	Receipt.tap(PointOption.point(41, 331)).perform();
		
	Thread.sleep(5000);
	
	TouchAction submit = new TouchAction(driver);
	
	submit.tap(PointOption.point(760, 339)).perform();
		
	Thread.sleep(5000);
	
	driver.navigate().back();
	Thread.sleep(5000);
	
}

@Test
public void TC_ID_25_11 () throws InterruptedException {
	
	//Check for Credit summary report   Click on reports  Start Date= 28/04/2023         End  Date= 28/09/2023 
	
	TouchAction Report = new TouchAction(driver);
	
	Report.tap(PointOption.point(331, 1138)).perform();
	
	Thread.sleep(5000);
	  
	TouchAction ReportFromDateField = new TouchAction(driver);
	
	ReportFromDateField.tap(PointOption.point(212, 566)).perform();
	
		
	Thread.sleep(5000);
	
	WebElement FromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	FromMonth.clear();
		
	Thread.sleep(5000);
	
	FromMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	Thread.sleep(5000);
	
	
	Thread.sleep(5000);
	WebElement FromDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	FromDate.clear();
		
	Thread.sleep(5000);
	
	FromDate.sendKeys("01");
	
	Thread.sleep(5000);
	
	System.out.println("01");	
	
	Thread.sleep(5000);
	
	WebElement FromYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	FromYear.clear();
		
	Thread.sleep(5000);
	
	FromYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_5 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement FromSetButton_3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	//WebElement FromSetButton = driver.findElement(By.xpath("android.widget.Button[@index='0']"));
	
	//FromSetButton_3.click();
		
	//Thread.sleep(5000);
	
	
	//select To Date
	
	
	TouchAction ReportToDateField = new TouchAction(driver);
	
	ReportToDateField.tap(PointOption.point(328, 778)).perform();
		
	Thread.sleep(5000);
	
	
	WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	ToMonth.clear();
		
	Thread.sleep(5000);
	
	ToMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	
	
	Thread.sleep(5000);
	WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	ToDate.clear();
		
	Thread.sleep(5000);
	
	ToDate.sendKeys("04");
	
	Thread.sleep(5000);
	
	System.out.println("04");	
	
	Thread.sleep(5000);
	WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	ToYear.clear();
		
	Thread.sleep(5000);
	
	ToYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_6 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement ToSetButton_4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	
	
	//ToSetButton_4.click();
		
	//Thread.sleep(5000);
	
	// Click on View Report button
	
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
	
	Thread.sleep(5000);
	
	TouchAction CreditSummaryReport = new TouchAction(driver);
	
	CreditSummaryReport.tap(PointOption.point(518, 1523)).perform();
		
	Thread.sleep(5000);
	
	driver.navigate().back();
	Thread.sleep(5000);
	
}
@Test
public void TC_ID_25_12 () throws InterruptedException {
	
	//Check for latest mandi rate report   Click on reports  Start Date= 28/04/2023         End  Date= 28/09/2023    

	TouchAction Report = new TouchAction(driver);
	
	Report.tap(PointOption.point(331, 1138)).perform();
	
	Thread.sleep(5000);
	  
	TouchAction ReportFromDateField = new TouchAction(driver);
	
	ReportFromDateField.tap(PointOption.point(212, 566)).perform();
	
		
	Thread.sleep(5000);
	
	WebElement FromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	FromMonth.clear();
		
	Thread.sleep(5000);
	
	FromMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	Thread.sleep(5000);
	
	
	Thread.sleep(5000);
	WebElement FromDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	FromDate.clear();
		
	Thread.sleep(5000);
	
	FromDate.sendKeys("01");
	
	Thread.sleep(5000);
	
	System.out.println("01");	
	
	Thread.sleep(5000);
	
	WebElement FromYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	FromYear.clear();
		
	Thread.sleep(5000);
	
	FromYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_5 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement FromSetButton_3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	//WebElement FromSetButton = driver.findElement(By.xpath("android.widget.Button[@index='0']"));
	
	//FromSetButton_3.click();
		
	//Thread.sleep(5000);
	
	
	//select To Date
	
	
	TouchAction ReportToDateField = new TouchAction(driver);
	
	ReportToDateField.tap(PointOption.point(328, 778)).perform();
		
	Thread.sleep(5000);
	
	
	WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	ToMonth.clear();
		
	Thread.sleep(5000);
	
	ToMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	
	
	Thread.sleep(5000);
	WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	ToDate.clear();
		
	Thread.sleep(5000);
	
	ToDate.sendKeys("04");
	
	Thread.sleep(5000);
	
	System.out.println("04");	
	
	Thread.sleep(5000);
	WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	ToYear.clear();
		
	Thread.sleep(5000);
	
	ToYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_6 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement ToSetButton_4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	
	
	//ToSetButton_4.click();
		
	//Thread.sleep(5000);
	
	// Click on View Report button
	
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
	
	Thread.sleep(5000);
	
	TouchAction LatestMandiRateReport = new TouchAction(driver);
	
	LatestMandiRateReport.tap(PointOption.point(450, 1795)).perform();
		
	Thread.sleep(5000);
	
	driver.navigate().back();

	Thread.sleep(5000);
	
}

@Test
public void TC_ID_25_13 () throws InterruptedException {

	//Customer payment details against service booking/product  Click on reports  Start Date= 28/04/2023         End  Date= 28/09/2023 
	
	
	TouchAction Report = new TouchAction(driver);
	
	Report.tap(PointOption.point(331, 1138)).perform();
	
	Thread.sleep(5000);
	  
	TouchAction ReportFromDateField = new TouchAction(driver);
	
	ReportFromDateField.tap(PointOption.point(212, 566)).perform();
	
		
	Thread.sleep(5000);
	
	WebElement FromMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	FromMonth.clear();
		
	Thread.sleep(5000);
	
	FromMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	Thread.sleep(5000);
	
	
	Thread.sleep(5000);
	WebElement FromDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	FromDate.clear();
		
	Thread.sleep(5000);
	
	FromDate.sendKeys("01");
	
	Thread.sleep(5000);
	
	System.out.println("01");	
	
	Thread.sleep(5000);
	
	WebElement FromYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	FromYear.clear();
		
	Thread.sleep(5000);
	
	FromYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_5 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement FromSetButton_3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	//WebElement FromSetButton = driver.findElement(By.xpath("android.widget.Button[@index='0']"));
	
	//FromSetButton_3.click();
		
	//Thread.sleep(5000);
	
	
	//select To Date
	
	
	TouchAction ReportToDateField = new TouchAction(driver);
	
	ReportToDateField.tap(PointOption.point(328, 778)).perform();
		
	Thread.sleep(5000);
	
	
	WebElement ToMonth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
	
	ToMonth.clear();
		
	Thread.sleep(5000);
	
	ToMonth.sendKeys("oct");
	
	Thread.sleep(5000);
	
	System.out.println("oct");	
	
	
	Thread.sleep(5000);
	WebElement ToDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
	
	ToDate.clear();
		
	Thread.sleep(5000);
	
	ToDate.sendKeys("04");
	
	Thread.sleep(5000);
	
	System.out.println("04");	
	
	Thread.sleep(5000);
	WebElement ToYear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText"));
	
	ToYear.clear();
		
	Thread.sleep(5000);
	
	ToYear.sendKeys("2023");
	
	Thread.sleep(5000);
	
	System.out.println("2023");	
	
	Thread.sleep(5000);
	
	TouchAction ToSetButton_6 = new TouchAction(driver);
	
	Report.tap(PointOption.point(212, 1445)).perform();
	
	Thread.sleep(5000);
	
	//WebElement ToSetButton_4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]"));
	
	
	//ToSetButton_4.click();
		
	//Thread.sleep(5000);
	
	// Click on View Report button
	
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
	
	Thread.sleep(5000);
	
	TouchAction CustomerPaymentDetailsAgainstServicesBookingorProduct = new TouchAction(driver);
	
	CustomerPaymentDetailsAgainstServicesBookingorProduct.tap(PointOption.point(484, 2249)).perform();
		
	Thread.sleep(5000);
	
	driver.navigate().back();
	Thread.sleep(5000);


}
}
