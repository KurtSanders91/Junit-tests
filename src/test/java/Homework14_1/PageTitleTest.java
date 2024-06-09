package Homework14_1;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PageTitleTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C://JAVA course//chromedriver-win64//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testPageTitle() {
        driver.get("https://demoqa.com");
        String expectedTitle = "ToolsQA";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle, "Page title is not as expected!");
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

