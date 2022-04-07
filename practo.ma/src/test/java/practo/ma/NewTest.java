package practo.ma;

import org.testng.annotations.Test;



//import automation.WebElement;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class NewTest {
	public static WebDriver driver;
	public static Properties prop;
	public static String sAppURL;
	public static String uname;
	public static String password;
  @Test
  public void f() throws InterruptedException, IOException {
	  System.out.println("Entered Test Method");
	  Thread.sleep(3000);
	  String[] data = ExcelData.readXL1();
		System.out.println(data[1]);
		driver.findElement(By.xpath("//*[@id=\\\"c-omni-container\\\"]/div/div[1]/div[1]/input")).sendKeys(data[1]);
		 WebElement sea = driver.findElement(By.xpath ("//*[@id=\'c-omni-container\']/div/div[2]/div[1]/input"));//*[@id="c-omni-container"]/div/div[2]/div[1]/input
		 sea.sendKeys("Hospital");
	 /* WebElement search = driver.findElement(By.xpath ("//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input"));//
	  System.out.println(search.toString());
		 search.clear();
		 
		 search.sendKeys("Pune");
		 WebElement sea = driver.findElement(By.xpath ("//*[@id=\'c-omni-container\']/div/div[2]/div[1]/input"));//*[@id="c-omni-container"]/div/div[2]/div[1]/input
		 sea.sendKeys("Hospital");
		 sea.sendKeys(Keys.RETURN);
		 Thread.sleep(3000);
		 // For Accredited Button
		 driver.findElement(By.id("Accredited_checkbox")).click(); 
		 //for 24*7 button
		 driver.findElement(By.id("Open_24X7_checkbox")).click();*/
	
  }
  @BeforeTest
  public void beforeTest()throws FileNotFoundException, IOException {
	  System.setProperty("webdriver.chrome.driver","E:\\Capita\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		 try {
				prop = new Properties();
			} catch (Exception e) {
				e.printStackTrace();
			}
			  
			  prop.load(new FileInputStream("C:\\Users\\PRATHAMESH\\eclipse-workspace\\practo.ma\\Configuration\\User_Details.properties"));
			  sAppURL = prop.getProperty("sAppURL");
			  uname = prop.getProperty("uname");
			  password = prop.getProperty("password");
			  System.out.println(sAppURL);
			  System.out.println(uname);
			  System.out.println(password);
			driver.get(sAppURL);
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys(uname);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("login")).click();	  
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
	  
  }

}
