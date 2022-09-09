package JenkinMavenPrgrm;
import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JenkinsPrgrmMaven {
	
	 
		WebDriver driver=null;
		
		@SuppressWarnings("deprecation")
		@BeforeTest
		public void setup()
		{
			
			 System.out.println("launching chrome browser");
				
				try {
					System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 driver = new ChromeDriver();
				//Thread.sleep(2000);
				
				System.out.println("launching chrome browser");
				
			
		}
		
		
		@SuppressWarnings("deprecation")
		@Test
		public void test()
		{
			
			
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);		
			
			
		}
		
		
		
		
	/*	public static void main(String[] args) throws InterruptedException {
			
		
			
			 System.out.println("launching chrome browser");
			
			try {
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebDriver driver= new ChromeDriver();
			Thread.sleep(2000);
			
			System.out.println("launching chrome browser");
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			driver.close();

		}
		*/
		@AfterTest
		public void teardown()
		{
			driver.close();
			System.out.println("Test Run Successfully");
		}

	}

	


