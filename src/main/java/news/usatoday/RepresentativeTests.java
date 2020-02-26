package news.usatoday;

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
  private final String ACTIVITY = "com.gannett.android.news.ActivityLoading";
  private final String PACKAGE = "com.usatoday.android.news";
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
  //   //functionality not present
  // }

  // @Test
  // public void testSignUp() {
  //   //functionality not present
  // }

  // @Test
  // public void testSearch() {
  //   //class android.widget.TextView
  //   //activity com.gannett.android.news.ui.activity.ActivityNavigation
  //   AndroidElement tosearch = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/search_the_app");
  //   tosearch.click();
  //   //class android.widget.EditText
  //   //activity com.gannett.android.news.ui.activity.ActivityNavigation
  //   AndroidElement search_bar = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/edit_text_search");
  //   search_bar.sendKeys("llama\n");
  //   //enter does not work with \n, abort
  // }

  @Test
  public void testDetail() {
    //class android.widget.FrameLayout
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]");
    item_1.click();
    //activity com.gannett.android.news.ui.activity.ActivityArticle
  }

  @Test
  public void testAddBookmark() {
    //class android.widget.FrameLayout
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]");
    item_1.click();
    //class android.widget.TextView
    //activity com.gannett.android.news.ui.activity.ActivityArticle
    AndroidElement save_bookmark = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/menuButtonBookmark");
    save_bookmark.click();
    //activity com.gannett.android.news.ui.activity.ActivityArticle
  }

  @Test
  public void testRemoveBookmark() {
    //class android.widget.FrameLayout
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]");
    item_1.click();
    //class android.widget.TextView
    //activity com.gannett.android.news.ui.activity.ActivityArticle
    AndroidElement save_bookmark = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/menuButtonBookmark");
    save_bookmark.click();
    //class android.widget.ImageButton
    //activity com.gannett.android.news.ui.activity.ActivityArticle
    AndroidElement back = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    back.click();
    //class android.widget.FrameLayout
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement menu_bookmark = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/saved_articles_tab");
    menu_bookmark.click();
    //class android.widget.FrameLayout
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout");
    item_1.click();
    //class android.widget.TextView
    //activity com.gannett.android.news.ui.activity.ActivityArticle
    AndroidElement remove_bookmark = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/menuButtonBookmark");
    remove_bookmark.click();
    //activity com.gannett.android.news.ui.activity.ActivityArticle
  }

  // @Test
  // public void testAccount() {
  //   //functionality not present
  // }

  @Test
  public void testTextSize() {
    //class android.widget.FrameLayout
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]");
    item_1.click();
    //class android.widget.TextView
    //activity com.gannett.android.news.ui.activity.ActivityArticle
    AndroidElement menu_textsize = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/button_articleTextSize");
    menu_textsize.click();
    //class android.widget.CheckedTextView
    //activity com.gannett.android.news.ui.activity.ActivityArticle
    AndroidElement change_textsize = (AndroidElement) driver.findElementById("android:id/text1");
    change_textsize.click();
    //activity com.gannett.android.news.ui.activity.ActivityArticle
  }

  @Test
  public void testAbout() {
    //class android.widget.TextView
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/settings_gear");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement about = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/preference_layout");
    about.click();
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
  }

  @Test
  public void testCategory() {
    //class android.widget.FrameLayout
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement category = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/sections_tab");
    category.click();
    //class android.widget.FrameLayout
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout");
    cat_1.click();
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
  }

  @Test
  public void testContact() {
    //class android.widget.TextView
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/settings_gear");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement help = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/preference_layout");
    help.click();
    //class android.widget.LinearLayout
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement contact = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/preference_layout");
    contact.click();
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
  }

  @Test
  public void testHelp() {
    //class android.widget.TextView
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/settings_gear");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement help = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/preference_layout");
    help.click();
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
  }

  @Test
  public void testMenu() {
    //class android.widget.TextView
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/settings_gear");
    menu_settings.click();
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
  }

  @Test
  public void testTerms() {
    //class android.widget.TextView
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/settings_gear");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement about = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/preference_layout");
    about.click();
    //class android.widget.LinearLayout
    //activity com.gannett.android.news.ui.activity.ActivityNavigation
    AndroidElement legal = (AndroidElement) driver.findElementById("com.usatoday.android.news:id/preference_layout");
    legal.click();
    //activity com.gannett.android.news.ui.activity.ActivityLawyerese
  }
}
