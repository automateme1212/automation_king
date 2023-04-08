import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.testng.Assert
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

class Hello {

    private var driver: WebDriver? = null

    @BeforeTest
    fun createDriver() {

        System.getProperty("webdriver.chrome.driver", "chromedriver.exe")
        val options = ChromeOptions()
        options.addArguments("--remote-allow-origins=*")
        driver = ChromeDriver(options)
    }
    @AfterTest
    fun tearDownDriver() {
        driver!!.quit()
    }


    @Test
    fun openWebPage() {

    val url = "https://www.google.com/"
   driver!!.get(url)
   Assert.assertEquals(driver!!.currentUrl, url, "Web page url did not match expected value.")


    }
}