package Wish;

import Wish.Configuration;
import global.HelperClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;

/**
 * Android Browser Local Test.
 */
public class WelcomeTest {

	private AndroidDriver<WebElement> driver;
    private final String ACTIVITY = "com.contextlogic.wish.activity.browse.BrowseActivity";
    private final String PACKAGE = "com.contextlogic.wish";
    private final String DEVICE = "Pixel 3 API 23";
    private final String PLATFORM = "android";
    private final String SERVER = "http://0.0.0.0:4723/wd/hub";
    
    @BeforeClass
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

    @AfterMethod
    public void transitBack(Method m) {
        if (m.getName().equals("testSignInConfig") || m.getName().equals("testSignInEmpty")) {
            AndroidElement ok_btn  = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button");
            ok_btn .click();
        }
    }

    public void testSignIn(String usernameInput, String pwdInput) {
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(usernameInput);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(pwdInput);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
    }

    @Test(groups = "signin")
    public void testSignInConfig() throws InterruptedException {
        Thread.sleep(1000);
        testSignIn(Configuration.email, Configuration.password);
        try {
            HelperClass.screenshot("wish_sign_in", driver);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test(groups = "signin")
    public void testSignInEmpty() throws InterruptedException {
        Thread.sleep(1000);
        testSignIn("", "");
        try {
            HelperClass.screenshot("wish_sign_in_empty", driver);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test(dependsOnGroups = "signin")
    public void forgetPwd() {
        AndroidElement forget_pwd = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_forgot_password_button");
        forget_pwd.click();
        try {
            HelperClass.screenshot("wish_forget_pwd", driver);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    

}