package GoogleExpress;

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
    private final String ACTIVITY = ".main.ShoppingMainActivity";
    //private final String ACTIVITY = ".activity.MainActivity";
    private final String PACKAGE = "com.google.android.apps.shopping.express";
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
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/account_drop_down_arrow");
        signin_jump.click();

        //test
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("//android.widget.EditText[@content-desc=\"Email or phone\"]");
        email.sendKeys(Configuration.email);
        AndroidElement signin_continue = (AndroidElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Next\"]");
        signin_continue.click();
        AndroidElement password = (AndroidElement) driver.findElementByXPath("//android.webkit.WebView[@content-desc=\"Welcome\"]/android.view.View/android.view.View[3]");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Next\"]");
        sign_in.click();
    }

    @Test
    public void testSignUp() {
        //transit
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/account_drop_down_arrow");
        signin_jump.click();
        AndroidElement sign_up_jump = (AndroidElement) driver.findElementByXPath("//android.widget.Spinner[@content-desc=\"Create account\"]");
        sign_up_jump.click();
        AndroidElement myself = (AndroidElement) driver.findElementByXPath("//android.view.MenuItem[@content-desc=\"For myself\"]");
        myself.click();

        //test
        AndroidElement username = (AndroidElement) driver.findElementByXPath("//android.widget.EditText[@content-desc=\"First name\"]");
        username.sendKeys("aaa");
        AndroidElement sign_up = (AndroidElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Next\"]");
        sign_up.click();

        //phone verification required afterward
    }

    @Test
    public void testAbout() throws InterruptedException {
        //transit
        Thread.sleep(5000);
        AndroidElement account = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/navigation_action_account");
        account.click();
        AndroidElement help = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[5]/android.widget.CheckedTextView");
        help.click();
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"More options\"]");
        menu.click();


        //test
        AndroidElement about = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout");
        about.click();
    }

    @Test
    public void testAddress() throws InterruptedException {
        //test
        Thread.sleep(5000);
        AndroidElement account = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/navigation_action_account");
        account.click();
        AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView");
        settings.click();
        Thread.sleep(5000);
        AndroidElement address =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout");
        address.click();
        AndroidElement address_add =  (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/empty_address_screen_add_address_button");
        address_add.click();
        AndroidElement address_street =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
        address_street.sendKeys("941 Bloom Walk");
        AndroidElement address_save =  (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/save_address_button");
        address_save.click();
    }

    @Test
    public void testCategory() throws InterruptedException {
        //test
        Thread.sleep(5000);
        AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView/android.support.design.card.MaterialCardView[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView");
        cat_1.click();
    }

    @Test
    public void testContact() throws InterruptedException {
        //transit
        Thread.sleep(5000);
        AndroidElement account = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/navigation_action_account");
        account.click();
        AndroidElement help = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[5]/android.widget.CheckedTextView");
        help.click();

        //test
        AndroidElement contact = (AndroidElement) driver.findElementById("com.google.android.gms:id/gh_feedback_option");
        contact.click();
    }

    @Test
    public void testHelp() throws InterruptedException {
        //transit
        Thread.sleep(5000);
        AndroidElement account = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/navigation_action_account");
        account.click();

        //test
        AndroidElement help = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[5]/android.widget.CheckedTextView");
        help.click();
    }

    @Test
    public void testSearch() throws InterruptedException {
        //test
        Thread.sleep(5000);
        AndroidElement search = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/open_search_bar_text_view");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/open_search_view_edit_text");
        search_bar.sendKeys("aa\n");
    }

    @Test
    public void testFilter() throws InterruptedException {
        //transit
        Thread.sleep(5000);
        AndroidElement search = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/open_search_bar_text_view");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/open_search_view_edit_text");
        search_bar.sendKeys("aa\n");
        Thread.sleep(5000);

        //test
        AndroidElement filter = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/filter_drawer_text");
        filter.click();
        AndroidElement sort = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[1]");
        sort.click();
        AndroidElement price = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.FrameLayout[2]/android.widget.TextView");
        price.click();
        Thread.sleep(5000);
        AndroidElement done = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/search_panel_action_text");
        done.click();
    }

    @Test
    public void testDetail() throws InterruptedException {
        //transit
        Thread.sleep(5000);
        AndroidElement search = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/open_search_bar_text_view");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/open_search_view_edit_text");
        search_bar.sendKeys("aa\n");
        Thread.sleep(5000);

        //test
        AndroidElement item = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/srp_grid_product_card_image");
        item.click();
    }

    @Test
    public void testAddCart() throws InterruptedException {
        //transit
        Thread.sleep(5000);
        AndroidElement search = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/open_search_bar_text_view");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/open_search_view_edit_text");
        search_bar.sendKeys("aa\n");
        Thread.sleep(5000);

        //test
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/cart_action_button");
        add_cart.click();
    }

    @Test
    public void testCart() throws InterruptedException {
        //transit
        Thread.sleep(5000);
        AndroidElement search = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/open_search_bar_text_view");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/open_search_view_edit_text");
        search_bar.sendKeys("aa\n");
        Thread.sleep(5000);
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/cart_action_button");
        add_cart.click();

        //test
        AndroidElement cart = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/cart_action_icon");
        cart.click();
        Thread.sleep(5000);
        AndroidElement remove = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/move_to_shopping_list");
        remove.click();
    }

    @Test
    public void testTerms() throws InterruptedException {
        //transit
        Thread.sleep(5000);
        AndroidElement account = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/navigation_action_account");
        account.click();

        //test
        AndroidElement legal = (AndroidElement) driver.findElementById("com.google.android.apps.shopping.express:id/og_tos_button");
        legal.click();
    }

}