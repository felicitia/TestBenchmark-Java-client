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
  private final String ACTIVITY = "com.foxnews.android.corenav.StartActivity";
  private final String PACKAGE = "com.foxnews.android";
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

  // @Test
  // public void testSearch() {
  //   //does not have this functionality
  // }

  @Test
  public void testDetail() {
    //class android.view.ViewGroup
    //activity .corenav.StartActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementById("com.foxnews.android:id/big_top_item_container");
    item_1.click();
    //activity .feature.articledetail.ArticleDetailActivity
  }

  @Test
  public void testAddBookmark() {
    //class android.view.ViewGroup
    //activity .corenav.StartActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementById("com.foxnews.android:id/big_top_item_container");
    item_1.click();
    //class android.widget.ImageView
    //activity .feature.articledetail.ArticleDetailActivity
    AndroidElement save_bookmark = (AndroidElement) driver.findElementById("com.foxnews.android:id/save");
    save_bookmark.click();
    //activity .feature.articledetail.ArticleDetailActivity
  }

  @Test
  public void testRemoveBookmark() {
    //class android.view.ViewGroup
    //activity .corenav.StartActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementById("com.foxnews.android:id/big_top_item_container");
    item_1.click();
    //class android.widget.ImageView
    //activity .feature.articledetail.ArticleDetailActivity
    AndroidElement save_bookmark = (AndroidElement) driver.findElementById("com.foxnews.android:id/save");
    save_bookmark.click();
    //class android.widget.ImageButton
    //activity .feature.articledetail.ArticleDetailActivity
    AndroidElement back = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Back\"]");
    back.click();
    //class androidx.appcompat.widget.LinearLayoutCompat
    //activity .corenav.StartActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementById("com.foxnews.android:id/navbar_for_you");
    menu_account.click();
    //class android.view.ViewGroup
    //activity .corenav.StartActivity
    item_1 = (AndroidElement) driver.findElementById("com.foxnews.android:id/component_headline_item_container");
    item_1.click();
    //class android.widget.ImageView
    //activity .feature.articledetail.ArticleDetailActivity
    AndroidElement remove_bookmark = (AndroidElement) driver.findElementById("com.foxnews.android:id/save");
    remove_bookmark.click();
    //activity .feature.articledetail.ArticleDetailActivity
  }

  @Test
  public void testAccount() {
    //class androidx.appcompat.widget.LinearLayoutCompat
    //activity .corenav.StartActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementById("com.foxnews.android:id/navbar_for_you");
    menu_account.click();
    //activity .corenav.StartActivity
  }

  @Test
  public void testTextSize() {
    //class android.view.ViewGroup
    //activity .corenav.StartActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementById("com.foxnews.android:id/big_top_item_container");
    item_1.click();
    //class android.widget.ImageView
    //activity .feature.articledetail.ArticleDetailActivity
    AndroidElement change_textsize = (AndroidElement) driver.findElementById("com.foxnews.android:id/scale_text");
    change_textsize.click();
    //activity .feature.articledetail.ArticleDetailActivity
  }

  @Test
  public void testAbout() {
    //class androidx.appcompat.widget.LinearLayoutCompat
    //activity .corenav.StartActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementById("com.foxnews.android:id/navbar_for_you");
    menu_account.click();
    //class android.widget.TextView
    //activity .corenav.StartActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.foxnews.android:id/settings_bttn");
    menu_settings.click();
    //class android.widget.FrameLayout
    //activity .foryou.SettingsActivity
    AndroidElement about = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]");
    about.click();
    //activity .common.web.WebViewActivity
  }

  @Test
  public void testCategory() {
    //class androidx.appcompat.widget.LinearLayoutCompat
    //activity .corenav.StartActivity
    AndroidElement category = (AndroidElement) driver.findElementById("com.foxnews.android:id/navbar_browse");
    category.click();
    //class android.widget.TextView
    //activity .corenav.StartActivity
    AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]");
    cat_1.click();
    //activity .feature.topic.TopicActivity
  }

  @Test
  public void testContact() {
    //class androidx.appcompat.widget.LinearLayoutCompat
    //activity .corenav.StartActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementById("com.foxnews.android:id/navbar_for_you");
    menu_account.click();
    //class android.widget.TextView
    //activity .corenav.StartActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.foxnews.android:id/settings_bttn");
    menu_settings.click();
    //class android.widget.FrameLayout
    //activity .foryou.SettingsActivity
    AndroidElement contact = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[10]");
    contact.click();
    //activity .common.web.WebViewActivity
  }

  @Test
  public void testHelp() {
    //class androidx.appcompat.widget.LinearLayoutCompat
    //activity .corenav.StartActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementById("com.foxnews.android:id/navbar_for_you");
    menu_account.click();
    //class android.widget.TextView
    //activity .corenav.StartActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.foxnews.android:id/settings_bttn");
    menu_settings.click();
    //class android.widget.FrameLayout
    //activity .foryou.SettingsActivity
    AndroidElement help = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]");
    help.click();
    //activity .common.web.WebViewActivity
  }

  @Test
  public void testMenu() {
    //class androidx.appcompat.widget.LinearLayoutCompat
    //activity .corenav.StartActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementById("com.foxnews.android:id/navbar_for_you");
    menu_account.click();
    //class android.widget.TextView
    //activity .corenav.StartActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.foxnews.android:id/settings_bttn");
    menu_settings.click();
    //activity .foryou.SettingsActivity
  }

  @Test
  public void testTerms() {
    //class androidx.appcompat.widget.LinearLayoutCompat
    //activity .corenav.StartActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementById("com.foxnews.android:id/navbar_for_you");
    menu_account.click();
    //class android.widget.TextView
    //activity .corenav.StartActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.foxnews.android:id/settings_bttn");
    menu_settings.click();
    //class android.widget.FrameLayout
    //activity .foryou.SettingsActivity
    AndroidElement legal = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]");
    legal.click();
    //activity .common.web.WebViewActivity
  }
}
