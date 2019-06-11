package SelDay1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithFireFox {
   FirefoxDriver driver;
   public void invokeBrowser()
{
	   System.setProperty("webdriver.gecko.driver","C:/libs/geckodriver.exe"); 
	driver = new FirefoxDriver();
	
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
   public void navigateCommands(){
	   driver.navigate().to("http://facebook.com");//exactly same as driver.get()
	   driver.navigate().back();
	   driver.navigate().forward();
	   driver.navigate().refresh();
   }
}


