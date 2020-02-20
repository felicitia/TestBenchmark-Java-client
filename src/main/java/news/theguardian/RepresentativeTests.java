package news.theguardian;

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
