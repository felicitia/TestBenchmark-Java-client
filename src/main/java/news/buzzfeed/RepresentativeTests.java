package news.buzzfeed;

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
  private final String ACTIVITY = "com.buzzfeed.android.activity.SplashActivity";
  private final String PACKAGE = "com.buzzfeed.android";
  private final String DEVICE = "8BAY0WKL8";
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
	  AndroidElement menu_account = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/menu_user_profile_root");
	  menu_account.click();
	  
	  AndroidElement signin_continue = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/signin");
	  signin_continue.click();
	  
	  AndroidElement signin_email = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/usernameEditText");
	  signin_email.sendKeys(Configuration.email);
	  
	  AndroidElement signin_password = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/passwordEditText");
	  signin_password.sendKeys(Configuration.password);
	  
	  AndroidElement sign_in = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/loginButton");
	  sign_in.click();
  }

  @Test
  public void testSignUp() {
	  AndroidElement menu_account = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/menu_user_profile_root");
	  menu_account.click();
	  
	  AndroidElement signup_continue = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/emailSignUpButton");
	  signup_continue.click();
	  
	  AndroidElement signup_email = (AndroidElement) driver.findElementById("email");
	  signup_email.sendKeys(Configuration.email);
	  
	  AndroidElement signup_password = (AndroidElement) driver.findElementById("pass");
	  signup_password.sendKeys(Configuration.password);
	  
	  AndroidElement signup_confirm_password = (AndroidElement) driver.findElementById("re_enter_pass");
	  signup_confirm_password.sendKeys(Configuration.password);
	  
	  AndroidElement signup_username = (AndroidElement) driver.findElementById("username");
	  signup_username.sendKeys(Configuration.username);
	  
	  AndroidElement sign_up = (AndroidElement) driver.findElementById("signup");
	  sign_up.click();
  }

  @Test
  public void testSearch() {
	  AndroidElement tosearch = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/menu_search");
	  tosearch.click();
	  
	  AndroidElement search = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/search_bar");
	  search.sendKeys(Configuration.search+"\n");
  }

  @Test
  public void testDetail() {
	  AndroidElement tosearch = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/menu_search");
	  tosearch.click();
	  
	  AndroidElement search = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/search_plate");
	  search.sendKeys(Configuration.search+"\n");
	  
	  AndroidElement item_1 = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/post_card_text");
	  item_1.click();
  }

  @Test
  public void testAddBookmark() {
	  AndroidElement menu_account = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/menu_user_profile_root");
	  menu_account.click();
	  
	  AndroidElement signin_continue = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/signin");
	  signin_continue.click();
	  
	  AndroidElement signin_email = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/usernameEditText");
	  signin_email.sendKeys(Configuration.email);
	  
	  AndroidElement signin_password = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/passwordEditText");
	  signin_password.sendKeys(Configuration.password);
	  
	  AndroidElement sign_in = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/loginButton");
	  sign_in.click();
	  
	  AndroidElement tosearch = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/menu_search");
	  tosearch.click();
	  
	  AndroidElement search = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/search_plate");
	  search.sendKeys(Configuration.search+"\n");
	  
	  AndroidElement item_1 = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/post_card_text");
	  item_1.click();
	  
	  AndroidElement save_bookmark = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/menu_bookmark");
	  save_bookmark.click();
  }

  @Test
  public void testRemoveBookmark() {


	  AndroidElement menu_account = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/menu_user_profile_root");
	  menu_account.click();

	  AndroidElement signin_continue = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/signin");
	  signin_continue.click();

	  AndroidElement signin_email = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/usernameEditText");
	  signin_email.sendKeys(Configuration.email);

	  AndroidElement signin_password = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/passwordEditText");
	  signin_password.sendKeys(Configuration.password);

	  AndroidElement sign_in = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/loginButton");
	  sign_in.click();
	  
	  AndroidElement menu_bookmark = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/design_menu_item_text");
	  menu_bookmark.click();
	  
	  AndroidElement item_1 = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/post_card_text");
	  item_1.click();
	  
	  AndroidElement remove_bookmark = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/menu_bookmark");
	  remove_bookmark.click();
  }

  @Test
  public void testAccount() {
	  AndroidElement menu_account = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/menu_user_profile_root");
	  menu_account.click();
	  
	  AndroidElement signin_continue = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/signin");
	  signin_continue.click();
	  
	  AndroidElement signin_email = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/usernameEditText");
	  signin_email.sendKeys(Configuration.email);
	  
	  AndroidElement signin_password = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/passwordEditText");
	  signin_password.sendKeys(Configuration.password);
	  
	  AndroidElement sign_in = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/loginButton");
	  sign_in.click();
  }

  @Test
  public void testCategory() {
	  AndroidElement menu = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/icon");
	  menu.click();
	  
	  AndroidElement cat_1 = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/explore_item_title");
	  cat_1.click();
  }

  @Test
  public void testContact() {
	  AndroidElement menu_account = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/menu_user_profile_root");
	  menu_account.click();
	  
	  AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/settings_button");
	  menu_settings.click(); 
	  
	  AndroidElement contact = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[9]");
	  contact.click(); 
  }


  @Test
  public void testMenu() {
	  AndroidElement menu = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/icon");
	  menu.click();
  }

  @Test
  public void testTerms() {
	  AndroidElement menu_account = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/menu_user_profile_root");
	  menu_account.click();
	  
	  AndroidElement menu_settings = (AndroidElement) driver.findElementById("com.buzzfeed.android:id/menu_settings");
	  menu_settings.click(); 
	  
	  AndroidElement legal = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[9]");
	  legal.click();
  }
}
