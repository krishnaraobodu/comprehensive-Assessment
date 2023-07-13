
//4th program
package makemytrip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneWayTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		// Calling Chrome WebDriver	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\testing\\makemytrip\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// Maximizing window
		driver.manage().window().maximize();
		
		// open URL
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(5000);
		

		//Switching in to iframes
		WebElement iframe = driver.findElement(By.xpath("//*[@title='notification-frame-173062137']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//*[@class='close']")).click();
		driver.switchTo().defaultContent();
		
		

		//By default Flights option is selected so commenting below statement
		 // driver.findElement(By.linkText("Flights")).click();
		  //By default One Way option is selected so commenting below statement
		  //driver.findElement(By.linkText("One Way")).click();
		  
		    
		  // clicking on from dropdown field
		  driver.findElement(By.xpath("//*[@for='fromCity']/span")).click();
		
		  //storing all dropdown options in to a List
		  List<WebElement> List1 = driver.findElements(By.xpath("//*[@class='font14 appendBottom5 blackText']"));
		  
		  for(int i=0;i<List1.size();i++) {
			  //Selecting Hyderabad option from "From" dropdown option
			  if(List1.get(i).getText().equalsIgnoreCase("Hyderabad, India")) {
				  driver.findElement(By.xpath("(//*[@class='font14 appendBottom5 blackText'])["+(i+1)+"]")).click();
				  break;
			  }
						  
		  }
		  Thread.sleep(5000);
		// clicking on "To" dropdown field
		  driver.findElement(By.xpath("//*[@for='toCity']/span")).click();
		  
		//storing all dropdown options in to a List
		  List<WebElement> List2 = driver.findElements(By.xpath("//*[@class='font14 appendBottom5 blackText']"));
		  
		  for(int i=0;i<List2.size();i++) {
			//Selecting New Delhi option from "To" dropdown option
			  if(List2.get(i).getText().equalsIgnoreCase("New Delhi, India")) {
				  driver.findElement(By.xpath("(//*[@class='font14 appendBottom5 blackText'])["+(i+1)+"]")).click();
				  break;
			  }
		  }


	}

}
