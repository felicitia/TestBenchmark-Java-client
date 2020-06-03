package bbcnews;

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
  private final String ACTIVITY = "bbc.mobile.news.v3.app.TopLevelActivity";
  private final String PACKAGE = "bbc.mobile.news.ww";
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
  public void testSearch() {
    AndroidElement search = (AndroidElement) driver.findElementById("bbc.mobile.news.ww:id/action_search");
    search.click();
    AndroidElement search_bar = (AndroidElement) driver.findElementById("bbc.mobile.news.ww:id/search");
    search_bar.sendKeys("aa\n");

  }

  @Test
  public void testDetail() {
    //search
    AndroidElement search = (AndroidElement) driver.findElementById("bbc.mobile.news.ww:id/action_search");
    search.click();
    AndroidElement search_bar = (AndroidElement) driver.findElementById("bbc.mobile.news.ww:id/search");
    search_bar.sendKeys("aa\n");
    AndroidElement detail = (AndroidElement) driver.findElementById("bbc.mobile.news.ww:id/content_card_image");
    detail.click();
  }


  @Test
  public void testTextSize() {
    AndroidElement more_option = (AndroidElement) driver.findElementByXPath("/android.widget.ImageView[@content-desc=\"More options\"]");
    more_option.click();
    AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
    settings.click();
    AndroidElement text_size = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout");
    text_size.click();
  }

  @Test
  public void testAbout() {
    AndroidElement more_option = (AndroidElement) driver.findElementByXPath("/android.widget.ImageView[@content-desc=\"More options\"]");
    more_option.click();
    AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
    settings.click();
//    AndroidElement about = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[8]/android.widget.RelativeLayout");
//    about.click();
  }

  @Test
  public void testCategory() {
    AndroidElement category = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton");
    category.click();
    AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]");
    cat_1.click();

  }

  @Test
  public void testContact() {
    AndroidElement more_option = (AndroidElement) driver.findElementByXPath("/android.widget.ImageView[@content-desc=\"More options\"]");
    more_option.click();
    AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
    settings.click();
    AndroidElement contact = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout");
    contact.click();

  }

  @Test
  public void testHelp() {
    AndroidElement more_option = (AndroidElement) driver.findElementByXPath("/android.widget.ImageView[@content-desc=\"More options\"]");
    more_option.click();
    AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
    settings.click();
    AndroidElement help = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout");
    help.click();

  }

  @Test
  public void testMenu() {
    AndroidElement more_option = (AndroidElement) driver.findElementByXPath("/android.widget.ImageView[@content-desc=\"More options\"]");
    more_option.click();

  }

  @Test
  public void testTerms() {
    AndroidElement more_option = (AndroidElement) driver.findElementByXPath("/android.widget.ImageView[@content-desc=\"More options\"]");
    more_option.click();
    AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
    settings.click();
    AndroidElement legal = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]");
    legal.click();

  }
}
