package theguardian;

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
  private final String ACTIVITY = "com.guardian.feature.stream.NewHomeActivity";
  private final String PACKAGE = "com.guardian";
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
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.guardian:id/fabHome");
    menu.click();
    //class android.widget.ImageView
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.guardian:id/nav_drawer_settings_button");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity .feature.setting.SettingsActivity
    AndroidElement settings_tosignin = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]");
    settings_tosignin.click();
    //class android.widget.EditText
    //activity .feature.login.ui.LoginActivity
    AndroidElement signin_email = (AndroidElement) driver.findElementById("com.guardian:id/email");
    signin_email.sendKeys(Configuration.email);
    //class android.widget.EditText
    //activity .feature.login.ui.LoginActivity
    AndroidElement signin_password = (AndroidElement) driver.findElementById("com.guardian:id/password");
    signin_password.sendKeys(Configuration.password);
    //class android.widget.LinearLayout
    //activity .feature.login.ui.LoginActivity
    AndroidElement sign_in = (AndroidElement) driver.findElementById("com.guardian:id/sign_in_button");
    sign_in.click();
    //activity .feature.setting.SettingsActivity
  }

  @Test
  public void testSignUp() {
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.guardian:id/fabHome");
    menu.click();
    //class android.widget.ImageView
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.guardian:id/nav_drawer_settings_button");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity .feature.setting.SettingsActivity
    AndroidElement settings_tosignin = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]");
    settings_tosignin.click();
    //class android.widget.FrameLayout
    //activity .feature.login.ui.LoginActivity
    AndroidElement signin_tosignup = (AndroidElement) driver.findElementById("com.guardian:id/bottom_bar");
    signin_tosignup.click();
    //class android.widget.EditText
    //activity .feature.login.ui.LoginActivity
    AndroidElement signup_email = (AndroidElement) driver.findElementById("com.guardian:id/register_email");
    signup_email.sendKeys(Configuration.email);
    //class android.widget.EditText
    //activity .feature.login.ui.LoginActivity
    AndroidElement signup_password = (AndroidElement) driver.findElementById("com.guardian:id/register_password");
    signup_password.sendKeys(Configuration.password);
    //class android.widget.EditText
    //activity .feature.login.ui.LoginActivity
    AndroidElement signup_firstname = (AndroidElement) driver.findElementById("com.guardian:id/register_first_name");
    signup_firstname.sendKeys(Configuration.firstName);
    //class android.widget.EditText
    //activity .feature.login.ui.LoginActivity
    AndroidElement signup_lastname = (AndroidElement) driver.findElementById("com.guardian:id/register_last_name");
    signup_lastname.sendKeys(Configuration.lastName);
    //class android.widget.EditText
    //activity .feature.login.ui.LoginActivity
    AndroidElement signup_username = (AndroidElement) driver.findElementById("com.guardian:id/register_username");
    signup_username.sendKeys(Configuration.username);
    //class android.widget.LinearLayout
    //activity .feature.login.ui.LoginActivity
    AndroidElement sign_up = (AndroidElement) driver.findElementById("com.guardian:id/register_button");
    sign_up.click();
    //activity .feature.setting.SettingsActivity
  }

  @Test
  public void testSearch() {
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.guardian:id/fabHome");
    menu.click();
    //class android.view.ViewGroup
    //activity .feature.stream.NewHomeActivity
    AndroidElement tosearch = (AndroidElement) driver.findElementById("com.guardian:id/clSearchBox");
    tosearch.click();
    //class android.widget.EditText
    //activity .feature.search.SearchActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.guardian:id/etInput");
    search_bar.sendKeys(Configuration.search);
    //class android.widget.TextView
    //activity .feature.search.SearchActivity
    AndroidElement search = (AndroidElement) driver.findElementById("com.guardian:id/search_footer_text_view");
    search.click();
    //activity .feature.search.SearchViewMoreActivity
  }

  @Test
  public void testDetail() {
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.guardian:id/fabHome");
    menu.click();
    //class android.view.ViewGroup
    //activity .feature.stream.NewHomeActivity
    AndroidElement tosearch = (AndroidElement) driver.findElementById("com.guardian:id/clSearchBox");
    tosearch.click();
    //class android.widget.EditText
    //activity .feature.search.SearchActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.guardian:id/etInput");
    search_bar.sendKeys(Configuration.search);
    //class android.widget.TextView
    //activity .feature.search.SearchActivity
    AndroidElement search = (AndroidElement) driver.findElementById("com.guardian:id/search_footer_text_view");
    search.click();
    //class android.widget.LinearLayout
    //activity .feature.search.SearchViewMoreActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]");
    item_1.click();
    //activity .feature.article.ArticleActivity
  }

  @Test
  public void testAddBookmark() {
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.guardian:id/fabHome");
    menu.click();
    //class android.widget.ImageView
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.guardian:id/nav_drawer_settings_button");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity .feature.setting.SettingsActivity
    AndroidElement settings_tosignin = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]");
    settings_tosignin.click();
    //class android.widget.EditText
    //activity .feature.login.ui.LoginActivity
    AndroidElement signin_email = (AndroidElement) driver.findElementById("com.guardian:id/email");
    signin_email.sendKeys(Configuration.email);
    //class android.widget.EditText
    //activity .feature.login.ui.LoginActivity
    AndroidElement signin_password = (AndroidElement) driver.findElementById("com.guardian:id/password");
    signin_password.sendKeys(Configuration.password);
    //class android.widget.LinearLayout
    //activity .feature.login.ui.LoginActivity
    AndroidElement sign_in = (AndroidElement) driver.findElementById("com.guardian:id/sign_in_button");
    sign_in.click();
    //class android.widget.ImageView
    //activity .feature.setting.SettingsActivity
    AndroidElement back = (AndroidElement) driver.findElementById("com.guardian:id/iivBackButton");
    back.click();
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    menu.click();
    //class android.view.ViewGroup
    //activity .feature.stream.NewHomeActivity
    AndroidElement tosearch = (AndroidElement) driver.findElementById("com.guardian:id/clSearchBox");
    tosearch.click();
    //class android.widget.EditText
    //activity .feature.search.SearchActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.guardian:id/etInput");
    search_bar.sendKeys(Configuration.search);
    //class android.widget.TextView
    //activity .feature.search.SearchActivity
    AndroidElement search = (AndroidElement) driver.findElementById("com.guardian:id/search_footer_text_view");
    search.click();
    //class android.widget.LinearLayout
    //activity .feature.search.SearchViewMoreActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]");
    item_1.click();
    //class android.widget.ImageView
    //activity .feature.article.ArticleActivity
    AndroidElement save_bookmark = (AndroidElement) driver.findElementById("com.guardian:id/bSavePage");
    save_bookmark.click();
  }

  @Test
  public void testRemoveBookmark() {
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.guardian:id/fabHome");
    menu.click();
    //class android.widget.ImageView
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.guardian:id/nav_drawer_settings_button");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity .feature.setting.SettingsActivity
    AndroidElement settings_tosignin = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]");
    settings_tosignin.click();
    //class android.widget.EditText
    //activity .feature.login.ui.LoginActivity
    AndroidElement signin_email = (AndroidElement) driver.findElementById("com.guardian:id/email");
    signin_email.sendKeys(Configuration.email);
    //class android.widget.EditText
    //activity .feature.login.ui.LoginActivity
    AndroidElement signin_password = (AndroidElement) driver.findElementById("com.guardian:id/password");
    signin_password.sendKeys(Configuration.password);
    //class android.widget.LinearLayout
    //activity .feature.login.ui.LoginActivity
    AndroidElement sign_in = (AndroidElement) driver.findElementById("com.guardian:id/sign_in_button");
    sign_in.click();
    //class android.widget.ImageView
    //activity .feature.setting.SettingsActivity
    AndroidElement back = (AndroidElement) driver.findElementById("com.guardian:id/iivBackButton");
    back.click();
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    menu.click();
    //class android.view.ViewGroup
    //activity .feature.stream.NewHomeActivity
    AndroidElement tosearch = (AndroidElement) driver.findElementById("com.guardian:id/clSearchBox");
    tosearch.click();
    //class android.widget.EditText
    //activity .feature.search.SearchActivity
    AndroidElement search_bar = (AndroidElement) driver.findElementById("com.guardian:id/etInput");
    search_bar.sendKeys(Configuration.search);
    //class android.widget.TextView
    //activity .feature.search.SearchActivity
    AndroidElement search = (AndroidElement) driver.findElementById("com.guardian:id/search_footer_text_view");
    search.click();
    //class android.widget.LinearLayout
    //activity .feature.search.SearchViewMoreActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]");
    item_1.click();
    //class android.widget.ImageView
    //activity .feature.article.ArticleActivity
    AndroidElement save_bookmark = (AndroidElement) driver.findElementById("com.guardian:id/bSavePage");
    save_bookmark.click();
    //class android.widget.ImageView
    //activity .feature.article.ArticleActivity
    back = (AndroidElement) driver.findElementById("com.guardian:id/bBack");
    back.click();
    //class android.widget.ImageView
    //activity .feature.search.SearchViewMoreActivity
    back = (AndroidElement) driver.findElementById("com.guardian:id/actionbar_home_button");
    back.click();
    //class android.widget.ImageView
    //activity .feature.search.SearchActivity
    back = (AndroidElement) driver.findElementById("com.guardian:id/ivBackButton");
    back.click();
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    menu.click();
    //class android.widget.ImageView
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu_more = (AndroidElement) driver.findElementById("com.guardian:id/show_more");
    menu_more.click();
    //class android.widget.ImageView
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu_bookmark = (AndroidElement) driver.findElementById("com.guardian:id/sfl_button");
    menu_bookmark.click();
    //class android.widget.LinearLayout
    //activity .feature.stream.NewHomeActivity
    AndroidElement item_1_in_bookmark = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout");
    item_1_in_bookmark.click();
    //class android.widget.ImageView
    //activity .feature.article.ArticleActivity
    AndroidElement remove_bookmark = (AndroidElement) driver.findElementById("com.guardian:id/bSavePage");
    remove_bookmark.click();
    //activity .feature.article.ArticleActivity
  }

  @Test
  public void testAccount() {
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.guardian:id/fabHome");
    menu.click();
    //class android.widget.ImageView
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu_account = (AndroidElement) driver.findElementById("com.guardian:id/nav_drawer_profile_button");
    menu_account.click();
    //activity .feature.personalisation.profile.ProfileActivity
  }

  @Test
  public void testTextSize() {
    //class android.widget.LinearLayout
    //activity .feature.stream.NewHomeActivity
    AndroidElement item_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]");
    item_1.click();
    //class android.widget.ImageView
    //activity .feature.article.ArticleActivity
    AndroidElement menu_textsize = (AndroidElement) driver.findElementById("com.guardian:id/bTextSize");
    menu_textsize.click();
    //class android.widget.Button
    //activity .feature.article.ArticleActivity
    AndroidElement change_textsize = (AndroidElement) driver.findElementById("com.guardian:id/bOk");
    change_textsize.click();
    //activity .feature.article.ArticleActivity
    //incomplete test case: uses seekbar
  }

  @Test
  public void testAbout() {
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.guardian:id/fabHome");
    menu.click();
    //class android.widget.ImageView
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.guardian:id/nav_drawer_settings_button");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity .feature.setting.SettingsActivity
    AndroidElement about = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[10]");
    about.click();
    //activity .feature.setting.SettingsActivity
  }

  @Test
  public void testCategory() {
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.guardian:id/fabHome");
    menu.click();
    //class android.widget.TextView
    //activity .feature.stream.NewHomeActivity
    AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]");
    cat_1.click();
  }

  @Test
  public void testContact() {
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.guardian:id/fabHome");
    menu.click();
    //class android.widget.ImageView
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.guardian:id/nav_drawer_settings_button");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity .feature.setting.SettingsActivity
    AndroidElement contact = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]");
    contact.click();
    //activity .feature.setting.SettingsActivity
  }

  @Test
  public void testHelp() {
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.guardian:id/fabHome");
    menu.click();
    //class android.widget.ImageView
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.guardian:id/nav_drawer_settings_button");
    menu_settings.click();
    //class android.widget.LinearLayout
    //activity .feature.setting.SettingsActivity
    AndroidElement help = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]");
    help.click();
    //activity .feature.article.ArticleActivity
  }

  @Test
  public void testMenu() {
    //class android.widget.ImageButton
    //activity .feature.stream.NewHomeActivity
    AndroidElement menu = (AndroidElement) driver.findElementById("com.guardian:id/fabHome");
    menu.click();
    //activity .feature.stream.NewHomeActivity
  }

  // @Test
  // public void testTerms() {
  // terms not found
  // }
}
