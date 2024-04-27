package basicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {
	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "/Users/harshverma/Downloads/chromedriver-mac-x64/chromedriver");

        // Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the KloudShip application
        driver.get("https://ecs-qa.kloudship.com");
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // login credentials
        WebElement username = driver.findElement(By.id("login-email"));
        username.sendKeys("kloudship.qa.automation@mailinator.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("Password1");

        // Click the login button
        WebElement loginButton = driver.findElement(By.id("login-btn"));
        loginButton.click();

        // Navigate to Package Types
        driver.findElement(By.xpath("/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-"
        		+ "content/perfect-scrollbar/div/div[1]/div/app-home/div/div[2]/mat-card[8]")).click();
      
        // Delete the newly added package
        driver.findElement(By.xpath("/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/perfect-scrollbar/div/div[1]/div/app-dashboard/div/div[1]/app-package-type-list/perfect-scrollbar/div/div[1]/mat-card[1]/div[2]/mat-icon")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-dialog-container/app-alert-dialog/mat-card/div/button/span[1]")).click();
        
        // Logout from the application 
        driver.findElement(By.xpath("/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/app-header/mat-toolbar/button[10]/span[1]/mat-icon")).click();
        
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/button[6]")).click();
        
        driver.quit();
    }

}
