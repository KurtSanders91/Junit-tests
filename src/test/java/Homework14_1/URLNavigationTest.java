package Homework14_1;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class URLNavigationTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C://JAVA course//chromedriver-win64//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testURLNavigation() {
        driver.get("https://demoqa.com");
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        String expectedURL = "https://demoqa.com/automation-practice-form";
        String actualURL = driver.getCurrentUrl();
        assertEquals(expectedURL, actualURL, "URL is not as expected after navigation!");
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

