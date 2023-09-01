package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Webtesting\\chromedriverwin64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.redirect.contractawardservice.crowncommercial.gov.uk/digital-outcomes/opportunities");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"with-hint\"]")).sendKeys("Priyanka" +Keys.ENTER);
		
		driver.findElement(By.partialLinkText("feedback")).click();
		Thread.sleep(2000);
		//driver.quit();
		

	}

}
