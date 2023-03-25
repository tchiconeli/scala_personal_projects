import org.openqa.selenium.firefox.{FirefoxDriver, FirefoxOptions}
import org.openqa.selenium.{By, Keys, WebElement}
import org.openqa.selenium.firefox.FirefoxOptions


class FirefoxCon {
  System.setProperty("webdriver.gecko.driver", "src/main/driver/firefox/geckodriver")
  protected lazy val opt = new FirefoxOptions()
  protected lazy val driver = new FirefoxDriver(opt)
  driver.manage().window().maximize()
  
  
}
