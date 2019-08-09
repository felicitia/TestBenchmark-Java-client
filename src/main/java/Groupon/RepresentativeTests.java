package Groupon;

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
    private final String ACTIVITY = ".onboarding.main.activities.Onboarding";
    private final String PACKAGE = "com.groupon";
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
        AndroidElement home_continue = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[2]");
        home_continue.click();
        AndroidElement yes = (AndroidElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
        yes.click();
        try{
            Thread.sleep(5000);
        } catch(InterruptedException ie) {}
    }

    @Test
    public void testSignIn() {
        //transit
        AndroidElement account = (AndroidElement) driver.findElementById("com.groupon:id/my_stuff");
        account.click();
        AndroidElement menu_signin = (AndroidElement) driver.findElementById("com.groupon:id/sign_in_button");
        menu_signin.click();

        //test
        AndroidElement email =  (AndroidElement) driver.findElementById("com.groupon:id/fragment_log_in_sign_up_email");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.groupon:id/fragment_log_in_sign_up_password");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.groupon:id/fragment_log_in_sign_up_groupon_button");
        sign_in.click();
    }

    @Test
    public void testSignUp() {
        //transit
        AndroidElement account = (AndroidElement) driver.findElementById("com.groupon:id/my_stuff");
        account.click();
        AndroidElement menu_signin = (AndroidElement) driver.findElementById("com.groupon:id/sign_in_button");
        menu_signin.click();
        AndroidElement sign_up_jump = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]");
        sign_up_jump.click();

        //test
        AndroidElement email =  (AndroidElement) driver.findElementById("com.groupon:id/fragment_log_in_sign_up_email");
        email.sendKeys(Configuration.email);
        AndroidElement username = (AndroidElement) driver.findElementById("com.groupon:id/fragment_log_in_sign_up_name");
        username.sendKeys("aaa");
        AndroidElement password = (AndroidElement) driver.findElementById("com.groupon:id/fragment_log_in_sign_up_password");
        password.sendKeys("bbb");
        AndroidElement sign_up = (AndroidElement) driver.findElementById("com.groupon:id/fragment_log_in_sign_up_groupon_button");
        sign_up.click();
    }

    @Test
    public void testAbout() {
        //transit
        AndroidElement settings = (AndroidElement) driver.findElementById("com.groupon:id/my_stuff");
        settings.click();

        //test
        AndroidElement about = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/android.widget.FrameLayout");
        about.click();
    }

    @Test
    public void testAccount() {
        //test
        AndroidElement account = (AndroidElement) driver.findElementById("com.groupon:id/my_stuff");
        account.click();
    }

    @Test
    public void testCategory() throws InterruptedException {
        //transit
        AndroidElement category = (AndroidElement) driver.findElementById("com.groupon:id/category_icon");
        category.click();
        Thread.sleep(5000);

        //test
        AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup");
        cat_1.click();
    }

    @Test
    public void testContact() {
        //transit
        AndroidElement settings = (AndroidElement) driver.findElementById("com.groupon:id/my_stuff");
        settings.click();

        //test
        AndroidElement contact = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout");
        contact.click();
    }

    @Test
    public void testSearch() {
        //test
        AndroidElement search = (AndroidElement) driver.findElementById("com.groupon:id/global_search_button_text");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.groupon:id/search_edittext");
        search_bar.sendKeys("aa\n");
    }

    @Test
    public void testFilter() throws InterruptedException {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.groupon:id/global_search_button_text");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.groupon:id/search_edittext");
        search_bar.sendKeys("aa\n");
        Thread.sleep(5000);

        //test
        AndroidElement sort = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[5]");
        sort.click();
        AndroidElement price = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]");
        price.click();
        AndroidElement done = (AndroidElement) driver.findElementById("com.groupon:id/done_button");
        done.click();
    }

    @Test
    public void testDetail() {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.groupon:id/global_search_button_text");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.groupon:id/search_edittext");
        search_bar.sendKeys("aa\n");

        //test
        AndroidElement item = (AndroidElement) driver.findElementById("com.groupon:id/deal_image");
        item.click();
    }

    @Test
    public void testAddCart() {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.groupon:id/global_search_button_text");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.groupon:id/search_edittext");
        search_bar.sendKeys("aa\n");
        AndroidElement item = (AndroidElement) driver.findElementById("com.groupon:id/deal_image");
        item.click();

        //test
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.groupon:id/cta_button");
        add_cart.click();
    }

    @Test
    public void testCart() {
        //test
        AndroidElement search = (AndroidElement) driver.findElementById("com.groupon:id/global_search_button_text");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.groupon:id/search_edittext");
        search_bar.sendKeys("aa\n");
        AndroidElement item = (AndroidElement) driver.findElementById("com.groupon:id/deal_image");
        item.click();
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.groupon:id/cta_button");
        add_cart.click();

        //test
        AndroidElement cart = (AndroidElement) driver.findElementById("com.groupon:id/ic_shopping_cart");
        cart.click();
    }

    @Test
    public void testTerms() {
        //transit
        AndroidElement settings = (AndroidElement) driver.findElementById("com.groupon:id/my_stuff");
        settings.click();
        AndroidElement about = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/android.widget.FrameLayout");
        about.click();

        //test
        AndroidElement legal = (AndroidElement) driver.findElementById("com.groupon:id/terms_of_use");
        legal.click();
    }

}