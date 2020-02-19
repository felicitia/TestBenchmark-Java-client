package news.fox;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;

public class RepresentativeTests {

  private AndroidDriver<WebElement> driver;
  private final String ACTIVITY = "";
  private final String PACKAGE = "";
  private final String DEVICE = "LMG820QM2a5f3a88";
  private final String PLATFORM = "android";
  private final String SERVER = "http://localhost:4723";

  @BeforeSuite
  public void setUp() throws IOException {
      DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability("deviceName", DEVICE);
      capabilities.setCapability("platformName", PLATFORM);
      capabilities.setCapability("appPackage", PACKAGE);
      capabilities.setCapability("appActivity", ACTIVITY);
      driver = new AndroidDriver<WebElement>(new URL(SERVER), capabilities);
  }

  @AfterClass
  public void tearDown() {
      driver.quit();
  }

  @BeforeMethod
  public void reset() {
      driver.resetApp();
  }

  @Test
  public void testSignIn() {

  }

  @Test
  public void testSignUp() {

  }

  @Test
  public void testSearch() {

  }

  @Test
  public void testDetail() {

  }

  @Test
  public void testAddBookmark() {

  }

  @Test
  public void testRemoveBookmark() {

  }

  @Test
  public void testAccount() {

  }

  @Test
  public void testTextSize() {

  }

  @Test
  public void testAbout() {

  }

  @Test
  public void testCategory() {

  }

  @Test
  public void testContact() {

  }

  @Test
  public void testHelp() {

  }

  @Test
  public void testMenu() {

  }

  @Test
  public void testTerms() {

  }
}
