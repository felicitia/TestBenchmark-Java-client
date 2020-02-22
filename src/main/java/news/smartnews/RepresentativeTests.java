package news.smartnews;

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
  private final String ACTIVITY = "jp.gocro.smartnews.android.activity.SmartNewsActivity";
  private final String PACKAGE = "jp.gocro.smartnews.android";
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

  // @Test
  // public void testSignIn() {
  //   //does not have this functionality
  // }

  // @Test
  // public void testSignUp() {
  //   //does not have this functionality
  // }

  @Test
  public void testSearch() {
    //class android.widget.TextView
    //activity .activity.MainActivity
    AndroidElement tosearch = (AndroidElement) driver.findElementById("jp.gocro.smartnews.android:id/searchTextView");
    tosearch.click();
    //class android.widget.EditText
    //activity .search.SearchActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementById("jp.gocro.smartnews.android:id/search_src_text");
    search_bar.sendKeys("llama\n");
    //activity .search.SearchActivity
  }

  @Test
  public void testDetail() {
    //class android.widget.TextView
    //activity .activity.MainActivity
    AndroidElement tosearch = (AndroidElement) driver.findElementById("jp.gocro.smartnews.android:id/searchTextView");
    tosearch.click();
    //class android.widget.EditText
    //activity .search.SearchActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementById("jp.gocro.smartnews.android:id/search_src_text");
    search_bar.sendKeys("llama\n");
    //class android.widget.LinearLayout
    //activity .search.SearchActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
    item_1.click();
    //activity .search.SearchActivity
  }

  // @Test
  // public void testAddBookmark() {
  //   //does not have this functionality
  // }

  // @Test
  // public void testRemoveBookmark() {
  //   //does not have this functionality
  // }

  // @Test
  // public void testAccount() {
  //   //does not have this functionality
  // }

  @Test
  public void testTextSize() {
    //class android.widget.ImageButton
    //activity .activity.MainActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("jp.gocro.smartnews.android:id/settingButton");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity .activity.SettingActivity
    AndroidElement menu_textsize = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[3]");
    menu_textsize.click();
    //class android.widget.CheckedTextView
    //activity .activity.SettingActivity
    AndroidElement change_textsize = (AndroidElement) driver.findElementById("android:id/text1");
    change_textsize.click();
    //activity .activity.SettingActivity
  }

  @Test
  public void testAbout() {
    //class android.widget.ImageButton
    //activity .activity.MainActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("jp.gocro.smartnews.android:id/settingButton");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity .activity.SettingActivity
    AndroidElement about = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[10]");
    about.click();
    //activity .activity.SettingAboutActivity
  }

  @Test
  public void testCategory() {
    //class android.view.View
    //activity .activity.MainActivity
    AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.view.View[1]");
    cat_1.click();
    //activity .activity.MainActivity
  }

  @Test
  public void testContact() {
    //class android.widget.ImageButton
    //activity .activity.MainActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("jp.gocro.smartnews.android:id/settingButton");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity .activity.SettingActivity
    AndroidElement help = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[7]");
    help.click();
    //class android.view.View
    //activity .support.SupportActivity
    AndroidElement contact = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View");
    contact.click();
    //activity .support.SupportActivity
  }

  @Test
  public void testHelp() {
    //class android.widget.ImageButton
    //activity .activity.MainActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("jp.gocro.smartnews.android:id/settingButton");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity .activity.SettingActivity
    AndroidElement help = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[7]");
    help.click();
    //activity .support.SupportActivity
  }

  @Test
  public void testMenu() {
    //class android.widget.ImageButton
    //activity .activity.MainActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("jp.gocro.smartnews.android:id/settingButton");
    menu_settings.click();
    //activity .activity.SettingActivity
  }

  @Test
  public void testTerms() {
    //class android.widget.ImageButton
    //activity .activity.MainActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("jp.gocro.smartnews.android:id/settingButton");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity .activity.SettingActivity
    AndroidElement about = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[10]");
    about.click();
    //class android.widget.LinearLayout
    //activity .activity.SettingAboutActivity
    AndroidElement legal = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]");
    legal.click();
    //activity .activity.WebPageActivity
  }
}
