import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.Test
import java.time.Duration


class Hello {

    @Test
    fun openingPage() {
        System.getProperty("webdriver.chrome.driver", "chromedriver.exe")

        val options = ChromeOptions()
        options.addArguments("--remote-allow-origins=*")
        val driver: WebDriver = ChromeDriver(options)
        driver.get("https://Google.com")


        val element = WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("gLFyf")))

        element.sendKeys("bananas")
    }



}