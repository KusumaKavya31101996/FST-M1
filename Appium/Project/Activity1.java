package Project_Appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class Activity1 {
    AndroidDriver driver;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
    }

    // Test method
    @Test
    public void addTasks() {

        // Create tasks
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(AppiumBy.id("tasks_fab")).click();
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete Activity with Google Tasks");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(AppiumBy.id("add_task_done")).click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(AppiumBy.id("tasks_fab")).click();
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete Activity with Google Keep");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(AppiumBy.id("add_task_done")).click();driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(AppiumBy.id("tasks_fab")).click();
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete the second Activity Google Keep");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(AppiumBy.id("add_task_done")).click();

        /*String expectedTitles[] = {"Complete Activity with Google Tasks","Complete Activity with Google Keep","Complete the second Activity Google Keep"};
        List<String> expectedTitlesList = Arrays.asList(expectedTitles);

        assertTrue(expectedTitlesList.contains((actualTitle)));*/

        }


    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}
