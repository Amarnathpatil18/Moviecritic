package moviecritic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UImovicritic {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//To fetch link
		driver.get("https://movie-reviews-psi.vercel.app/");
		
		//To click on movie chart.
		driver.findElement(By.xpath("/html/body/main/section[2]/div[1]/a/article/header/h1")).click();
	
		
		//To click on delete button.
		driver.findElement(By.xpath("/html/body/main/section[2]/div[1]/div/button[2]/svg")).click();
		
		//To add movie
		driver.findElement(By.xpath("/html/body/nav/div/button[1]/h4")).click();
		driver.findElement(By.id("name")).sendKeys("amar");
		driver.findElement(By.xpath("//*[@id=\"movie-add-modal\"]/div/form/div[2]")).sendKeys("05-05-2000");
		
		WebDriver driver1= driver.switchTo().newWindow(WindowType.TAB);
		driver1.findElement(By.xpath("//*[@id=\"movie-add-modal\"]/div/form/div[3]/button/h4")).click();
		
		//To Add new review
		driver.findElement(By.xpath("/html/body/nav/div/button[2]/h4")).click();
		
		driver.findElement(By.xpath("//*[@id=\"movie\"]")).sendKeys("Hi");
		driver.findElement(By.id("name")).sendKeys("ytdg");
		driver.findElement(By.id("rating")).sendKeys("8");
		driver.findElement(By.id("review")).sendKeys("Nice movie");
		driver.findElement(By.xpath("//*[@id=\"review-add-modal\"]/div/form/div[5]/button/h4")).click();

	}

}
