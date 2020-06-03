package news.reuters;

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
  private final String ACTIVITY = "com.thomsonreuters.reuters.activities.SplashActivity";
  private final String PACKAGE = "com.thomsonreuters.reuters";
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

//  @Test
//  public void testSignIn() {
//
//  }
//
//  @Test
//  public void testSignUp() {
//
//  }

  @Test
  public void testSearch() {
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
    menu.click();
    AndroidElement search = (AndroidElement) driver.findElementById("com.thomsonreuters.reuters:id/menu_actionbar_homepage_search_button");
    search.click();
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.thomsonreuters.reuters:id/menu_search_text");
    search_bar.sendKeys("election\n");

  }

  @Test
  public void testDetail() {
    //search
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
    menu.click();
    AndroidElement search = (AndroidElement) driver.findElementById("com.thomsonreuters.reuters:id/menu_actionbar_homepage_search_button");
    search.click();
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.thomsonreuters.reuters:id/menu_search_text");
    search_bar.sendKeys("election\n");

    AndroidElement detail = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ViewFlipper/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout");
    detail.click();
  }

  @Test
  public void testAddBookmark() {
    //detail
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
    menu.click();
    AndroidElement search = (AndroidElement) driver.findElementById("com.thomsonreuters.reuters:id/menu_actionbar_homepage_search_button");
    search.click();
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.thomsonreuters.reuters:id/menu_search_text");
    search_bar.sendKeys("election\n");
    AndroidElement detail = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ViewFlipper/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout");
    detail.click();

    AndroidElement save = (AndroidElement) driver.findElementById("com.thomsonreuters.reuters:id/menu_save");
    save.click();
  }

  @Test
  public void testRemoveBookmark() {
    //save bookmark
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
    menu.click();
    AndroidElement search = (AndroidElement) driver.findElementById("com.thomsonreuters.reuters:id/menu_actionbar_homepage_search_button");
    search.click();
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.thomsonreuters.reuters:id/menu_search_text");
    search_bar.sendKeys("election\n");
    AndroidElement detail = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ViewFlipper/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout");
    detail.click();
    AndroidElement save = (AndroidElement) driver.findElementById("com.thomsonreuters.reuters:id/menu_save");
    save.click();

    AndroidElement back = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    back.click();
//    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
    menu.click();
    AndroidElement bookmark = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ExpandableListView/android.widget.FrameLayout[7]");
    bookmark.click();
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ViewFlipper/android.view.ViewGroup/android.widget.ViewFlipper/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout");
    item_1.click();
    AndroidElement bookmark_remove = (AndroidElement) driver.findElementByXPath("/android.widget.TextView[@content-desc=\"Save\"]");
    bookmark_remove.click();

  }

//  @Test
//  public void testAccount() {
//
//  }

  @Test
  public void testTextSize() {
    AndroidElement item_1 = (AndroidElement) driver.findElementById("com.thomsonreuters.reuters:id/stream_large_item_view_image");
    item_1.click();
    AndroidElement more_option = (AndroidElement) driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"More options\"]");
    more_option.click();
    AndroidElement text_size = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]");
    text_size.click();

  }

  @Test
  public void testAbout() {
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
    menu.click();
    // next: .activities.SettingsActivity
    AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ExpandableListView/android.widget.FrameLayout[9]");
    settings.click();
  }

  @Test
  public void testCategory() {
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
    menu.click();
    AndroidElement category = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[1]");
    category.click();
    AndroidElement cat_1 = (AndroidElement) driver.findElementById("com.thomsonreuters.reuters:id/list_item_collection_name");
    cat_1.click();

  }

  @Test
  public void testContact() {
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
    menu.click();
    // next: .activities.SettingsActivity
    AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ExpandableListView/android.widget.FrameLayout[9]");
    settings.click();

    AndroidElement contact = (AndroidElement) driver.findElementById("com.thomsonreuters.reuters:id/settings_contact_us");
    contact.click();
  }

//
//  @Test
//  public void testHelp() {
//
//  }

  @Test
  public void testMenu() {
    AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
    menu.click();
  }

   @Test
   public void testTerms() {
     AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
     menu.click();
     // next: .activities.SettingsActivity
     AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ExpandableListView/android.widget.FrameLayout[9]");
     settings.click();

     AndroidElement legal = (AndroidElement) driver.findElementById("com.thomsonreuters.reuters:id/settings_list_item_option");
     legal.click();
   }
}
