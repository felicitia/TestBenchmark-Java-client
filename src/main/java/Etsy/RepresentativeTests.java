package Etsy;

import global.HelperClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

/**
 * Android Browser Local Test.
 */
public class RepresentativeTests {

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

    @BeforeMethod
    public void reset() {
        driver.resetApp();
    }

    @Test
    public void testSignIn() {
        //transit
        AndroidElement  get_started  = (AndroidElement) driver.findElementById("com.etsy.android:id/btn_link");
        get_started .click();
        AndroidElement sign_in_jump = (AndroidElement) driver.findElementById("com.etsy.android:id/btn_sign_in_dialog");
        sign_in_jump.click();

        //test
        AndroidElement email_or_username =  (AndroidElement) driver.findElementById("com.etsy.android:id/edit_username");
        email_or_username.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.etsy.android:id/edit_password");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.etsy.android:id/button_signin");
        sign_in.click();
    }

    @Test
    public void testSignUp() {
        //transit
        AndroidElement  get_started  = (AndroidElement) driver.findElementById("com.etsy.android:id/btn_link");
        get_started .click();
        AndroidElement sign_in_jump = (AndroidElement) driver.findElementById("com.etsy.android:id/btn_register_dialog");
        sign_in_jump.click();

        //test
        AndroidElement firstname = (AndroidElement) driver.findElementById("com.etsy.android:id/edit_first_name");
        firstname.sendKeys(Configuration.firstname);
        AndroidElement lastname = (AndroidElement) driver.findElementById("com.etsy.android:id/edit_last_name");
        lastname.sendKeys(Configuration.lastname);
        AndroidElement email = (AndroidElement) driver.findElementById("com.etsy.android:id/edit_email");
        email.sendKeys(Configuration.email);
        AndroidElement username = (AndroidElement) driver.findElementById("com.etsy.android:id/edit_username");
        username.sendKeys(Configuration.username);
        AndroidElement password = (AndroidElement) driver.findElementById("com.etsy.android:id/edit_register_password");
        password.sendKeys(Configuration.password);
        AndroidElement confirm_password = (AndroidElement) driver.findElementById("com.etsy.android:id/edit_password_confirm");
        confirm_password.sendKeys(Configuration.password);
        AndroidElement sign_up = (AndroidElement) driver.findElementById("com.etsy.android:id/button_register");
        sign_up.click();
    }

    @Test
    public void testAbout() {
        //transit
        //AndroidElement hack = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.TextView");
        //hack.click();
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        menu.click();
        AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");
        settings.click();

        //test
        AndroidElement about = (AndroidElement) driver.findElementById("com.etsy.android:id/about_row");
        about.click();
    }

    @Test
    public void testAccount() throws InterruptedException {
        //transit
        AndroidElement  get_started  = (AndroidElement) driver.findElementById("com.etsy.android:id/btn_link");
        get_started .click();
        AndroidElement sign_in_jump = (AndroidElement) driver.findElementById("com.etsy.android:id/btn_sign_in_dialog");
        sign_in_jump.click();
        AndroidElement email_or_username =  (AndroidElement) driver.findElementById("com.etsy.android:id/edit_username");
        email_or_username.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.etsy.android:id/edit_password");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.etsy.android:id/button_signin");
        sign_in.click();
        Thread.sleep(1000);
        //AndroidElement hack = (AndroidElement) driver.findElementById("com.etsy.android:id/menu_search");
        //hack.click();
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        menu.click();

        //test
        AndroidElement account = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.ImageView");
        account.click();
        //no address option??
    }

    @Test
    public void testCategory() throws InterruptedException {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.etsy.android:id/menu_search");
        search.click();
        Thread.sleep(1000);

        //test
        AndroidElement cat = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
        cat.click();
    }

    @Test
    public void testContact() {
        //no contact form??
    }

    @Test
    public void testHelp() throws InterruptedException {
        //transit
        //AndroidElement hack = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.TextView");
        //hack.click();
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        menu.click();
        AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");
        settings.click();
        AndroidElement about = (AndroidElement) driver.findElementById("com.etsy.android:id/about_row");
        about.click();
        Thread.sleep(1000);

        //test
        AndroidElement help = (AndroidElement) driver.findElementByXPath("//android.view.View[@content-desc=\"Read our help page\"]");
        help.click();
    }

    @Test
    public void testMenu() {
        //test
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        menu.click();
    }

    @Test
    public void testSearch() {
        //test
        AndroidElement search = (AndroidElement) driver.findElementById("com.etsy.android:id/menu_search");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.etsy.android:id/search_src_text");
        search_bar.sendKeys("aa\n");
    }

    @Test
    public void testFilter() {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.etsy.android:id/menu_search");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.etsy.android:id/search_src_text");
        search_bar.sendKeys("aa\n");

        //test
        AndroidElement filter = (AndroidElement) driver.findElementById("com.etsy.android:id/filters_text_view");
        filter.click();
        AndroidElement sort = (AndroidElement) driver.findElementById("com.etsy.android:id/search_filters_sort_by_text");
        sort.click();
        AndroidElement price = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.TextView");
        price.click();
        AndroidElement done = (AndroidElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Favorite\"])[2]");
        done.click();
    }

    @Test
    public void testDetail() throws InterruptedException {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.etsy.android:id/menu_search");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.etsy.android:id/search_src_text");
        search_bar.sendKeys("aa\n");
        Thread.sleep(1000);

        //test
        AndroidElement item = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView[1]");
        item.click();
    }

    @Test
    public void testAddCart() throws InterruptedException {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.etsy.android:id/menu_search");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.etsy.android:id/search_src_text");
        search_bar.sendKeys("aa\n");
        Thread.sleep(1000);
        AndroidElement item = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView[1]");
        item.click();

        //test
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.etsy.android:id/button_cart");
        add_cart.click();
    }

    @Test
    public void testCart() throws InterruptedException {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.etsy.android:id/menu_search");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.etsy.android:id/search_src_text");
        search_bar.sendKeys("aa\n");
        Thread.sleep(1000);
        AndroidElement item = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView[1]");
        item.click();
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.etsy.android:id/button_cart");
        add_cart.click();

        //test
        AndroidElement remove = (AndroidElement) driver.findElementById("com.etsy.android:id/btn_remove");
        remove.click();
    }

    @Test
    public void testTerms() {
        //transit
        //AndroidElement hack = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.TextView");
        //hack.click();
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        menu.click();
        AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");
        settings.click();

        //test
        AndroidElement legal = (AndroidElement) driver.findElementById("com.etsy.android:id/legal_row");
        legal.click();
    }

}