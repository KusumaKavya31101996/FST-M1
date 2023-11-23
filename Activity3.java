package LMS_Activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class Activity3 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Locating the element

        WebElement e = driver.findElement(By.xpath("//*[contains(text(),'Actionable Training')]"));

        System.out.println(e.getText());

        assertEquals("Text is",e.getText(),"Actionable Training");
        // Close the browser
        driver.close();
    }
}
