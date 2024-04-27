package basicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test01 {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/harshverma/Downloads/chromedriver-mac-x64/chromedriver");

        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the KloudShip application
        driver.get("https://ecs-qa.kloudship.com");
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       //  Find the username and password fields and login button
        WebElement usernameField = driver.findElement(By.id("login-email"));
        WebElement passwordField = driver.findElement(By.id("login-password"));
        WebElement login = driver.findElement(By.id("login-btn"));

        // Enter the provided username and password
        usernameField.sendKeys("kloudship.qa.automation@mailinator.com");
        passwordField.sendKeys("Password1");
 
        
     // Click on the login button
        login.click();
        
        
        
            
        // Wait for the home page to load
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Add necessary waits or synchronization here

        // Navigate to the Package Types section
        
        driver.findElement(By.xpath("/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-"
        		+ "content/perfect-scrollbar/div/div[1]/div/app-home/div/div[2]/mat-card[8]")).click();

        // Wait for the Package Types page to load
        // Add necessary waits or synchronization here
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Click on the Add Manually button
       driver.findElement(By.xpath("/html/body/app-root/app-sidenav/mat-sidenav-container/"
       		+ "mat-sidenav-content/app-header/mat-toolbar/button[2]")).click();
       

        // Add a package with specified details
        driver.findElement(By.xpath("/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/perfect-scrollbar/div/div[1]/div/app-dashboard/div/div[2]/app-package-type-manage/perfect-scrollbar/div/div[1]/mat-card/form/div/div[1]/section[1]/div/mat-form-field/div/div[1]/div/input")).sendKeys("Harsh_Verma");
        
        driver.findElement(By.xpath("/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/perfect-scrollbar/div/div[1]/div/app-dashboard/div/div[2]/app-package-type-manage/perfect-scrollbar/div/div[1]/mat-card/form/div/div[2]/section[1]/div/mat-form-field/div/div[1]/div/input")).sendKeys("2");
        driver.findElement(By.xpath("/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/perfect-scrollbar/div/div[1]/div/app-dashboard/div/div[2]/app-package-type-manage/perfect-scrollbar/div/div[1]/mat-card/form/div/div[2]/section[2]/div/mat-form-field/div/div[1]/div/input")).sendKeys("3");
        driver.findElement(By.xpath("/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/perfect-scrollbar/div/div[1]/div/app-dashboard/div/div[2]/app-package-type-manage/perfect-scrollbar/div/div[1]/mat-card/form/div/div[2]/section[3]/div/mat-form-field/div/div[1]/div/input")).sendKeys("5");

        
        // Submit the package
        driver.findElement(By.xpath("/html/body/app-root/app-sidenav/mat-sidenav-container/"
        		+ "mat-sidenav-content/perfect-scrollbar/div/div[1]/div/app-dashboard/div/div[2]/app-package-type-manage/"
        		+ "mat-toolbar/button/span[1]/mat-icon")).click();

        // Wait for the package to be added
        // Add necessary waits or synchronization here
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Logout from the application
        driver.findElement(By.xpath("/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/app-header/mat-toolbar/button[10]/span[1]/mat-icon")).click();
        
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/button[6]")).click();
        // Close the browser
        driver.quit();
    }
}
