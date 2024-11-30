package week3.day2.homeassignment.ListHomeAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterfaceAJIO {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		String searchVal="bags";
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//launch Browser
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys(searchVal);
		//select men and fashion bags checkbox 
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		driver.findElement(By.xpath("//label[contains(@class,'facet-linkname-Men')]")).click();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='Men - Fashion Bags']"))).click();
		 */
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@class,'Fashion Bags')]")).click();
		Thread.sleep(2000);
		// get the no. of items 
		String itemtext = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Get the No of Items:"+itemtext);
		
		//- Get the list of brand  and print the list
		List<WebElement>brand = driver.findElements(By.xpath("//div[@class='brand']"));
		int brandsize=brand.size();
		System.out.println("Total No of Brand:"+brandsize);
		for(WebElement ele:brand) {
			System.out.println("the Brands are:"+ele.getText());
		}
		System.out.println();
		// Get the list of names of the bags and print it
		List<WebElement> bagname=driver.findElements(By.xpath("//div[@class=\"nameCls\"]"));
		int bagnamesize=bagname.size();
		System.out.println("Total No of Bags:"+bagnamesize);
		for(int i=0;i<bagnamesize;i++) {
			System.out.println("The Bag Names Are"+bagname.get(i).getText());
		}
	
	}

}
