
//3rd program
package makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MMTLOGO {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		// Calling Firefox WebDriver
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\testing\\makemytrip\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		// Maximizing window
		  driver.manage().window().maximize(); 
		  
		// open URL
		  driver.get("https://www.makemytrip.com/");
		
		  Thread.sleep(5000);
		  
		 boolean logoText = driver.findElement(By.xpath("//*[@class='mmtLogo makeFlex']")).isDisplayed();
		// Verifying logo text if it is present print as logo is present
		  if(logoText == true) {
			  System.out.println("Makemytriplogo is present");
		  }else {
			  System.out.println("Makemytriplogo is not present");
		  }
		  
		 
	}
	
}
