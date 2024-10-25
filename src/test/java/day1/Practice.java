package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		
//launch browser
		WebDriver driver=new ChromeDriver();
		
		
//open url
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
//validate title should be "your store"
		String act_title=driver.getTitle();
	if(act_title.equals("Your Store"))
	{
		System.out.println("test passed");
	}
	else
	{
		System.out.println("test failed");
		
	}
		//close browser
	//driver.close();
	//driver.quit();
		
		
		
	}

}
