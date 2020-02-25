package Ebay;

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

/**
 * Android Browser Local Test.
 */
public class RepresentativeTests {

    private AndroidDriver<WebElement> driver;
    private final String ACTIVITY = ".activities.MainActivity";
    private final String PACKAGE = "com.ebay.mobile";
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

    @BeforeMethod
    public void reset() {
        driver.resetApp();
    }

    @Test
    public void testSignIn() throws InterruptedException {
        //transit
        Thread.sleep(5000);
        AndroidElement home_signin = (AndroidElement) driver.findElementById("com.ebay.mobile:id/button_sign_in");
        home_signin.click();
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.ebay.mobile:id/button_classic");
        signin_jump.click();

        //test
        AndroidElement email =  (AndroidElement) driver.findElementById("com.ebay.mobile:id/edit_text_username");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Sign in\"]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.ebay.mobile:id/button_sign_in");
        sign_in.click();
    }

    @Test
    public void testSignUp() throws InterruptedException {
        //transit
        Thread.sleep(5000);
        AndroidElement home_signup = (AndroidElement) driver.findElementById("com.ebay.mobile:id/button_register");
        home_signup.click();
        AndroidElement sign_up_jump = (AndroidElement) driver.findElementById("com.ebay.mobile:id/button_classic");
        sign_up_jump.click();

        //test
        AndroidElement email = (AndroidElement) driver.findElementById("com.ebay.mobile:id/et_email");
        email.sendKeys(Configuration.email);
        AndroidElement username = (AndroidElement) driver.findElementById("com.ebay.mobile:id/et_first_name");
        username.sendKeys("aaa");
        AndroidElement last_name = (AndroidElement) driver.findElementById("com.ebay.mobile:id/et_last_name");
        last_name.sendKeys("bbb");
        AndroidElement signup_continue = (AndroidElement) driver.findElementById("com.ebay.mobile:id/bt_continue");
        signup_continue.click();
        AndroidElement password = (AndroidElement) driver.findElementById("com.ebay.mobile:id/et_temp");
        password.sendKeys(Configuration.password);
        AndroidElement sign_up = (AndroidElement) driver.findElementById("com.ebay.mobile:id/bt_create_your_account");
        sign_up.click();
    }

    @Test
    public void testAbout() {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementById("com.ebay.mobile:id/home");
        menu.click();
        AndroidElement settings = (AndroidElement) driver.findElementById("com.ebay.mobile:id/menuitem_settings");
        settings.click();

        //test
        AndroidElement about = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.RelativeLayout");
        about.click();
    }


    @Test
    public void testAccount() throws InterruptedException {
        //sign in
        Thread.sleep(5000);
        AndroidElement home_signin = (AndroidElement) driver.findElementById("com.ebay.mobile:id/button_sign_in");
        home_signin.click();
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.ebay.mobile:id/button_classic");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.ebay.mobile:id/edit_text_username");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Sign in\"]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.ebay.mobile:id/button_sign_in");
        sign_in.click();

        Thread.sleep(5000);
        AndroidElement menu = (AndroidElement) driver.findElementById("com.ebay.mobile:id/home");
        menu.click();

        //test
        AndroidElement account = (AndroidElement) driver.findElementById("com.ebay.mobile:id/textview_sign_in_status");
        account.click();
    }

    @Test
    public void testContact() {
        AndroidElement menu = (AndroidElement) driver.findElementById("com.ebay.mobile:id/home");
        menu.click();
        AndroidElement help = (AndroidElement) driver.findElementById("com.ebay.mobile:id/menuitem_help_contact");
        help.click();
        AndroidElement call = (AndroidElement) driver.findElementById("recommend_call_us");
        call.click();
    }

    @Test
    public void testCategory() throws InterruptedException {
        //transit
        Thread.sleep(5000);
        AndroidElement category = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Categories button\"]");
        category.click();

        //test
        AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView");
        cat_1.click();
    }

    @Test
    public void testHelp() {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementById("com.ebay.mobile:id/home");
        menu.click();

        //test
        AndroidElement help = (AndroidElement) driver.findElementById("com.ebay.mobile:id/menuitem_help_contact");
        help.click();
    }

    @Test
    public void testMenu() {
        //test
        AndroidElement menu = (AndroidElement) driver.findElementById("com.ebay.mobile:id/home");
        menu.click();
    }

    @Test
    public void testSearch() {
        //test
        AndroidElement search = (AndroidElement) driver.findElementById("com.ebay.mobile:id/search_box");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.ebay.mobile:id/search_src_text");
        search_bar.sendKeys("aa\n");
    }

    @Test
    public void testFilter() throws InterruptedException {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.ebay.mobile:id/search_box");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.ebay.mobile:id/search_src_text");
        search_bar.sendKeys("aa\n");
        Thread.sleep(5000);

        //test
        AndroidElement sort = (AndroidElement) driver.findElementById("com.ebay.mobile:id/button_sort");
        sort.click();
        AndroidElement price = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.CheckedTextView");
        price.click();
    }

    @Test
    public void testDetail() throws InterruptedException {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.ebay.mobile:id/search_box");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.ebay.mobile:id/search_src_text");
        search_bar.sendKeys("aa\n");
        Thread.sleep(5000);

        //test
        AndroidElement item = (AndroidElement) driver.findElementById("com.ebay.mobile:id/image");
        item.click();
    }

    @Test
    public void testAddCart() throws InterruptedException {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.ebay.mobile:id/search_box");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.ebay.mobile:id/search_src_text");
        search_bar.sendKeys("aa\n");
        Thread.sleep(5000);
        AndroidElement item = (AndroidElement) driver.findElementById("com.ebay.mobile:id/image");
        item.click();

        //test
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.ebay.mobile:id/button_add_to_cart");
        add_cart.click();
    }


    @Test
    public void testTerms() {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementById("com.ebay.mobile:id/home");
        menu.click();
        AndroidElement settings = (AndroidElement) driver.findElementById("com.ebay.mobile:id/menuitem_settings");
        settings.click();
        AndroidElement about = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.RelativeLayout");
        about.click();

        //test
        AndroidElement legal = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout");
        legal.click();
    }

}