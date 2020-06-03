package news.newsrepublic;

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
  private final String ACTIVITY = "com.ss.android.application.app.mainpage.BottomTabMainActivity";
  private final String PACKAGE = "com.mobilesrepublic.appy";
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
  //   //functionality not available
  // }

  // @Test
  // public void testSignUp() {
  //   //functionality not available
  // }

  @Test
  public void testSearch() {
    //class android.widget.LinearLayout
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement tosearch = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/search_bar_layout");
    tosearch.click();
    //class android.widget.EditText
    //activity com.ss.android.application.app.search.view.SearchActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/search_input");
    search_bar.sendKeys("llama\n");
    //activity com.ss.android.application.app.search.view.SearchActivity
  }

  @Test
  public void testDetail() {
    //class android.widget.LinearLayout
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement tosearch = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/search_bar_layout");
    tosearch.click();
    //class android.widget.EditText
    //activity com.ss.android.application.app.search.view.SearchActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/search_input");
    search_bar.sendKeys("llama\n");
    //class android.view.View
    //activity com.ss.android.application.app.search.view.SearchActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/com.ss.android.uilib.base.page.slideback.SlideFrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]");
    item_1.click();
    //activity com.ss.android.application.article.detail.NewDetailActivity
  }

  @Test
  public void testAddBookmark() {
    //class android.widget.LinearLayout
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement tosearch = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/search_bar_layout");
    tosearch.click();
    //class android.widget.EditText
    //activity com.ss.android.application.app.search.view.SearchActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/search_input");
    search_bar.sendKeys("llama\n");
    //class android.view.View
    //activity com.ss.android.application.app.search.view.SearchActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/com.ss.android.uilib.base.page.slideback.SlideFrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]");
    item_1.click();
    //class android.widget.ImageView
    //activity com.ss.android.application.article.detail.NewDetailActivity
    AndroidElement menu_more = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/top_more_title");
    menu_more.click();
    //class android.view.ViewGroup
    //activity com.ss.android.application.article.detail.NewDetailActivity
    AndroidElement save_bookmark = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]");
    save_bookmark.click();
    //activity com.ss.android.application.article.detail.NewDetailActivity
  }

  @Test
  public void testRemoveBookmark() {
    //class android.widget.LinearLayout
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement tosearch = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/search_bar_layout");
    tosearch.click();
    //class android.widget.EditText
    //activity com.ss.android.application.app.search.view.SearchActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/search_input");
    search_bar.sendKeys("llama\n");
    //class android.view.View
    //activity com.ss.android.application.app.search.view.SearchActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/com.ss.android.uilib.base.page.slideback.SlideFrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]");
    item_1.click();
    //class android.widget.ImageView
    //activity com.ss.android.application.article.detail.NewDetailActivity
    AndroidElement menu_more = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/top_more_title");
    menu_more.click();
    //class android.view.ViewGroup
    //activity com.ss.android.application.article.detail.NewDetailActivity
    AndroidElement save_bookmark = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]");
    save_bookmark.click();
    //class android.widget.ImageView
    //activity com.ss.android.application.article.detail.NewDetailActivity
    AndroidElement back = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/back");
    back.click();
    back.click();
    //class android.widget.RelativeLayout
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]");
    menu_account.click();
    //class android.widget.ImageView
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/siginin_back");
    menu.click();
    //class android.view.View
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement menu_bookmark = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/bottom_tab_native_profile_menu_item_saved");
    menu_bookmark.click();
    //class android.widget.RelativeLayout
    //activity com.ss.android.application.article.favor.FavoriteActivity
    item_1 = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/root");
    item_1.click();
    //class android.widget.ImageView
    //activity com.ss.android.application.article.detail.NewDetailActivity
    menu_more.click();
    //class android.view.ViewGroup
    //activity com.ss.android.application.article.detail.NewDetailActivity
    AndroidElement remove_bookmark = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]");
    remove_bookmark.click();
    //activity com.ss.android.application.article.detail.NewDetailActivity
  }

  @Test
  public void testAccount() {
    //class android.widget.RelativeLayout
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]");
    menu_account.click();
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
  }

  @Test
  public void testTextSize() {
    //class android.widget.RelativeLayout
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]");
    menu_account.click();
    //class android.widget.ImageView
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/siginin_back");
    menu.click();
    //class android.view.View
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/bottom_tab_native_profile_menu_item_settings");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity com.ss.android.application.app.mine.BaseSettingActivity
    AndroidElement menu_textsize = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/setting_font_size");
    menu_textsize.click();
    //class android.widget.CheckedTextView
    //activity com.ss.android.application.app.mine.BaseSettingActivity
    AndroidElement change_textsize = (AndroidElement) driver.findElementById("android:id/text1");
    change_textsize.click();
    //activity com.ss.android.application.app.mine.BaseSettingActivity
  }

  // @Test
  // public void testAbout() {
  //   //functionality not available
  // }

  @Test
  public void testCategory() {
    //class android.widget.FrameLayout
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]");
    cat_1.click();
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
  }

  @Test
  public void testContact() {
    //class android.widget.RelativeLayout
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]");
    menu_account.click();
    //class android.widget.ImageView
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/siginin_back");
    menu.click();
    //class android.view.View
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement contact = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/bottom_tab_native_profile_menu_item_feedback");
    contact.click();
    //activity com.ss.android.application.app.feedback.FeedBackActivity
  }

  // @Test
  // public void testHelp() {
  //   //functionality not available
  // }

  @Test
  public void testMenu() {
    //class android.widget.RelativeLayout
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]");
    menu_account.click();
    //class android.widget.ImageView
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/siginin_back");
    menu.click();
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
  }

  @Test
  public void testTerms() {
    //class android.widget.RelativeLayout
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]");
    menu_account.click();
    //class android.widget.ImageView
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/siginin_back");
    menu.click();
    //class android.view.View
    //activity com.ss.android.application.app.mainpage.BottomTabMainActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/bottom_tab_native_profile_menu_item_settings");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity com.ss.android.application.app.mine.BaseSettingActivity
    AndroidElement menu_legal = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/privacy_safety");
    menu_legal.click();
    //class android.widget.FrameLayout
    //activity com.ss.android.application.app.mine.PrivacySettingActivity
    AndroidElement legal = (AndroidElement) driver.findElementById("com.mobilesrepublic.appy:id/privacy_setting_service_terms");
    legal.click();
    //activity com.ss.android.application.app.browser.BrowserActivity
  }
}
