package GitHubPushSample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubPushsample1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("WebDriver.chromedriver","C:\\chrome\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/s?k=-amazon&hvadid=72499124504037&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_5fksc5jb1x_e");
		 driver.manage().window().maximize();
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement java=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
js.executeScript("arguments[0].click()", java);

	}

	}


