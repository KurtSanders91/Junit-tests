package Homework14;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementTextTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C://JAVA course//chromedriver-win64//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testElementText() {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement formHeader = driver.findElement(By.className("practice-form-wrapper"));
        String expectedText = "Student Registration Form";
        String actualText = formHeader.getText();
        assertEquals(expectedText, actualText, "Form header text is not as expected!");
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

