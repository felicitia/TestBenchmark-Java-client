package Wish;

import Wish.Configuration;
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
    private final String ACTIVITY = "com.contextlogic.wish.activity.browse.BrowseActivity";
    private final String PACKAGE = "com.contextlogic.wish";
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
        //test
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
    }

    @Test
    public void testSignUp() throws InterruptedException {
        //transit
        Thread.sleep(1000);
        AndroidElement sign_up_jump = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_create_account_button");
        sign_up_jump.click();

        //test
        AndroidElement firstname = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/create_account_fragment_first_name_text");
        firstname.sendKeys(Configuration.firstname);
        AndroidElement lastname = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/create_account_fragment_last_name_text");
        lastname.sendKeys(Configuration.lastname);
        AndroidElement email = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/create_account_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/create_account_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_up = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/create_account_fragment_create_account_button");
        sign_up.click();
    }

    @Test
    public void testAbout() throws InterruptedException {
        //transit
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
        menu.click();

        //test
        AndroidElement about = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout");
        about.click();
    }

    @Test
    public void testAccount() throws InterruptedException {
        //transit
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
        menu.click();

        //test
        AndroidElement account = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/menu_profile_background");
        account.click();
    }

    @Test
    public void testAddress() throws InterruptedException {
        //transit
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
        menu.click();
        AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout");
        settings.click();

        //test
        AndroidElement address =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/address_book_footer_text");
        address.click();
        AndroidElement street = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/shipping_address_form_street_address_text");
        street.sendKeys("941 Bloom Walk");
        AndroidElement save = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/cart_fragment_cart_shipping_floating_done_button");
        save.click();
    }

    @Test
    public void testCategory() throws InterruptedException {
        //transit
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        //test
        AndroidElement cat = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[2]");
        cat.click();
    }

    @Test
    public void testContact() throws InterruptedException {
        //transit
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
        menu.click();

        //test
        AndroidElement contact = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[12]");
        contact.click();
    }

    @Test
    public void testHelp() throws InterruptedException {
        //transit
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
        menu.click();

        //test
        AndroidElement help = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[13]");
        help.click();
    }

    @Test
    public void testMenu() throws InterruptedException {
        //transit
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        //test
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
        menu.click();
    }

    @Test
    public void testSearch() throws InterruptedException {
        //transit
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        //test
        AndroidElement search = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Search\"]");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/search_src_text");
        search_bar.sendKeys("aa\n");
    }

    @Test
    public void testFilter() throws InterruptedException {
        //transit
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        //no filter in search...

        //test
        AndroidElement filter = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Filter\"]");
        filter.click();
        AndroidElement sort = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.View");
        sort.click();
        sort.click(); //will fail - cannot get id/xpath of filter by
        AndroidElement done = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout");
        done.click();
    }

    @Test
    public void testDetail() throws InterruptedException {
        //transit
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);
        AndroidElement search = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Search\"]");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/search_src_text");
        search_bar.sendKeys("aa\n");
        Thread.sleep(5000);

        //test
        AndroidElement item = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView");
        item.click();
    }

    @Test
    public void testAddCart() throws InterruptedException {
        //transit
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);
        AndroidElement search = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Search\"]");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/search_src_text");
        search_bar.sendKeys("aa\n");
        Thread.sleep(5000);
        AndroidElement item = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView");
        item.click();

        //test
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/product_details_fragment_add_to_cart_button");
        add_cart.click();
    }

    @Test
    public void testCart() throws InterruptedException {
        //transit
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);
        AndroidElement search = (AndroidElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Search\"]");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/search_src_text");
        search_bar.sendKeys("aa\n");
        Thread.sleep(5000);
        AndroidElement item = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView");
        item.click();
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/product_details_fragment_add_to_cart_button");
        add_cart.click();

        //test
        AndroidElement quantity = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout");
        quantity.click();
        AndroidElement quantity_0 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[1]");
        quantity_0.click();
        AndroidElement remove = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button");
        remove.click();
    }

    @Test
    public void testTerms() throws InterruptedException {
        //transit
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.wish:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
        menu.click();
        AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout");
        settings.click();

        //test
        AndroidElement legal = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.FrameLayout[7]/android.widget.TextView");
        legal.click();
    }

}