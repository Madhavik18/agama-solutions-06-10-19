package SelDay1;

import org.openqa.selenium.edge.EdgeDriver;

public class WorkingwithEdge {
   EdgeDriver driver;
   public void invokeBrowser()
{
	 // System.setProperty("webdriver.chrome.driver","C:/libs/chromediver.exe"); 
	driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://qatechhub.com");//to navigate to a particular website.
	
}
   
   public void getTitleOfThePage() {
	   System.out.println("Title of the page:"+driver.getTitle());
	   
	  }
   public void closeBrowser() {
	   //driver.close();//It closes the current active window
	   driver.quit();//It closes all the windows opened by Selenium
   }
}

