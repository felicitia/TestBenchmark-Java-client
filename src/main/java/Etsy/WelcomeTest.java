package Etsy;

import global.HelperClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Android Browser Local Test.
 */
public class WelcomeTest{

	private AndroidDriver<WebElement> driver;
    private final String ACTIVITY = "com.etsy.android.ui.homescreen.HomescreenTabsActivity";
    private final String PACKAGE = "com.etsy.android";
    private final String DEVICE = "Pixel 3 API 23";
    private final String PLATFORM = "android";
    private final String SERVER = "http://0.0.0.0:4723/wd/hub";
    
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

    @BeforeClass
    public void transitToStart() {
        AndroidElement  get_started  = (AndroidElement) driver.findElementById("com.etsy.android:id/btn_link");
        get_started .click();
        AndroidElement sign_in_jump = (AndroidElement) driver.findElementById("com.etsy.android:id/btn_sign_in_dialog");
        sign_in_jump.click();
    }

    public void testSignIn(String usernameInput, String pwdInput) {
        AndroidElement email_or_username =  (AndroidElement) driver.findElementById("com.etsy.android:id/edit_username");
        email_or_username.sendKeys(usernameInput);
        AndroidElement password = (AndroidElement) driver.findElementById("com.etsy.android:id/edit_password");
        password.sendKeys(pwdInput);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.etsy.android:id/button_signin");
        sign_in.click();

//        searchBoxEl.sendKeys("Hello world!");
//        AndroidElement onSearchRequestedBtn = (AndroidElement) driver.findElementById("btn_start_search");
//        onSearchRequestedBtn.click();
//        AndroidElement searchText = (AndroidElement) new WebDriverWait(driver, 30)
//                .until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/search_src_text")));
//        String searchTextValue = searchText.getText();
//        Assert.assertEquals(searchTextValue, "Hello world!");
    }

    @Test(groups = "signin")
    public void testSignInConfig() {
        testSignIn(Configuration.email, Configuration.password);
        try {
            HelperClass.screenshot("etsy_sign_in", driver);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test(groups = "signin")
    public void testSignInEmpty() {
        testSignIn("", "");
        try {
            HelperClass.screenshot("etsy_sign_in_empty", driver);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test(dependsOnGroups = "signin")
    public void forgetPwd() {
        AndroidElement forget_pwd = (AndroidElement) driver.findElementById("com.etsy.android:id/forgot_password_link");
        forget_pwd.click();
        try {
            HelperClass.screenshot("etsy_forget_pwd", driver);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}