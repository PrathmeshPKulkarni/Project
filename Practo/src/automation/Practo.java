package automation;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Capita\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://accounts.practo.com/login?next=%2Fcheckid_request&intent=fabric");
		 //driver.findElement(By.className("nav-login-mobile btn-border nav-interact")).click();//nav-login-mobile btn-border nav-interact

		 WebElement uname = driver.findElement(By.id ("username"));// username
		 uname.sendKeys("7720936922"); 
		 driver.findElement(By.id("password")).sendKeys("Pratik@7720");// password
		 driver.findElement(By.id("login")).click();//login  // 
		 WebElement search = driver.findElement(By.xpath ("//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input"));
		 search.clear();
		 search.sendKeys("Pune");
		 WebElement sea = driver.findElement(By.xpath ("//*[@id=\"c-omni-container\"]/div/div[2]/div[1]/input"));//*[@id="c-omni-container"]/div/div[2]/div[1]/input
		 sea.sendKeys("hospital");
		
		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[2]/div[2]/div[1]/div[1]/span[1]/div")).sendKeys(Keys.RETURN);
driver.findElement(By.className("class=\"c-omni-suggestion-item__content__title\"")).sendKeys(Keys.RETURN);
		 //WebElement.sendKeys(Keys.RETURN);
		 //sea.sendKeys(Keys.RETURN);
		 
		 
		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);// //*[@id="container"]/div[3]/div/div[1]/div/div/header/div[1]/div/div[2]/label/span/span
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/div/header/div[1]/div/div[2]/label/span/span")).click();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div/div[1]/div/div/header/div[1]/div/div[3]/label/span/span")).click();
		 //driver.findElement(By.xpath("*[@id=\"container\"]/div[3]/div/div[1]/div/div/header/div[1]/div/div[2]/label/span/span")).click();
		driver.findElement(By.cssSelector("#container > div:nth-child(3) > div > div.sticky-outer-wrapper > div > div > header > div.c-filter__top > div > div:nth-child(3) > label > span > span")).click();
		// driver.findElement(By.xpath("*[@id=\"container\"]/div[3]/div/div[1]/div/div/header/div[1]/div/div[3]/label/span/span")).click();//*[@id="container"]/div[3]/div/div[1]/div/div/header/div[1]/div/div[3]/label/span/span//
	        //Actions actions = new Actions(driver);////*[@id="container"]/div[3]/div/div[1]/div/div/header/div[1]/div/div[2]/label/span/span
            //actions.moveToElement(sea).perform();


		 /*driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);// css selector  #c-omni-container > div > div.c-omni__wrapper.u-clearfix.c-omni__wrapper--locality > div.c-omni-searchbox_wrapper > input

		 //driver.findElement(By.className("c-omni-suggestion-item__content")).click();
		 driver.findElement(By.id("omni-suggestion-main")).click();//omni-suggestion-main////*[@id="c-omni-container"]/div/div[2]/div[2]/div[1]/div[1]/span[1]/div
		 driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[2]/div[2]/div[1]/div[1]/span[1]/div")).click();

		/* WebElement search = driver.findElement(By.className ("c-omni-searchbox c-omni-searchbox--small"));//class="c-omni-searchbox c-omni-searchbox--small"
		 search.sendKeys("Pune");
		 WebElement sea = driver.findElement(By.id ("omni-searchbox-keyword"));//
		 sea.sendKeys("hospital"); //omni-searchbox-keyword*/
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);// css selector  #c-omni-container > div > div.c-omni__wrapper.u-clearfix.c-omni__wrapper--locality > div.c-omni-searchbox_wrapper > input

		 //new Select(driver.findElement(By.className("c-omni-searchbox c-omni-searchbox--small"))).selectByVisibleText("Pune");
		 //new Select(driver.findElement(By.className("c-omni-searchbox c-omni-searchbox--small"))).selectByVisibleText("Hospital");// class="c-omni-searchbox c-omni-searchbox--small"
        // driver.close();
		 
		

	}

}
// //*[@id="c-omni-container"]/div/div[1]/div[1]/input