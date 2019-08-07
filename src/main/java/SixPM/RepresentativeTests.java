package SixPM;

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
    private final String ACTIVITY = "com.zappos.android.activities.HomeActivity";
    private final String PACKAGE = "com.zappos.android.sixpmFlavor";
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
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
        menu.click();
        AndroidElement menu_signin = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]");
        menu_signin.click();
        Thread.sleep(5000);

        //test
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("//android.widget.EditText[@content-desc=\"Email\"]");
        email.sendKeys(Configuration.email);
        Thread.sleep(7000);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("//android.webkit.WebView[@content-desc=\"6pm Sign-In\"]/android.view.View[2]/android.view.View[5]/android.widget.EditText");
        password.sendKeys(Configuration.password);
        Thread.sleep(7000);
        AndroidElement sign_in = (AndroidElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\" Sign-In \"]");
        sign_in.click();
    }

    @Test
    public void testSignUp() throws InterruptedException {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
        menu.click();
        AndroidElement menu_signin = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]");
        menu_signin.click();
        Thread.sleep(5000);
        AndroidElement sign_up_jump = (AndroidElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Create a new 6pm account\"]");
        sign_up_jump.click();

        //test
        AndroidElement email = (AndroidElement) driver.findElementByXPath("//android.widget.EditText[@content-desc=\"Your email address\"]");
        email.sendKeys(Configuration.email);
        Thread.sleep(7000);
        AndroidElement username = (AndroidElement) driver.findElementByXPath("//android.widget.EditText[@content-desc=\"Name\"]");
        username.sendKeys("aaa");
        Thread.sleep(7000);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("//android.webkit.WebView[@content-desc=\"6pm Registration\"]/android.view.View[3]/android.view.View[5]/android.widget.EditText");
        password.sendKeys("bbb");
        Thread.sleep(7000);
        AndroidElement sign_up = (AndroidElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\" Create your 6pm account \"]");
        sign_up.click();
    }

    @Test
    public void testAbout() {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
        menu.click();
        AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[6]");
        settings.click();

        //test
        AndroidElement about = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.RelativeLayout");
        about.click();
    }

    @Test
    public void testAddress() throws InterruptedException {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
        menu.click();
        AndroidElement menu_account = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]");
        menu_account.click();
        Thread.sleep(5000);

        //test
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("//android.widget.EditText[@content-desc=\"Email\"]");
        email.sendKeys(Configuration.email);
        Thread.sleep(15000);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("//android.webkit.WebView[@content-desc=\"6pm Sign-In\"]/android.view.View[2]/android.view.View[5]/android.widget.EditText");
        password.sendKeys(Configuration.password);
        Thread.sleep(7000);
        AndroidElement sign_in = (AndroidElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\" Sign-In \"]");
        sign_in.click();

        //test
        AndroidElement address =  (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/my_account_shipping");
        address.click();
        AndroidElement add =  (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/generic_add_to_fab");
        add.click();
        AndroidElement street =  (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/add_update_shipping_address_address_line_1");
        street.sendKeys("941 Bloom Walk");
        AndroidElement save =  (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/add_update_save_btn");
        save.click();
    }

    @Test
    public void testCategory() throws InterruptedException {
        //transit
        AndroidElement category = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]");
        category.click();
        Thread.sleep(4000);

        //test
        AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView");
        cat_1.click();
    }

    @Test
    public void testContact() {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
        menu.click();

        //test
        AndroidElement contact = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[5]");
        contact.click();
    }

    @Test
    public void testHelp() {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
        menu.click();
        AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[6]");
        settings.click();

        //test
        AndroidElement help = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.RelativeLayout");
        help.click();
    }

    @Test
    public void testMenu() {
        //test
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
        menu.click();
    }

    @Test
    public void testSearch() {
        //test
        AndroidElement search = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/menu_search");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/search_src_text");
        search_bar.sendKeys("aa\n");
    }

    @Test
    public void testFilter() {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/menu_search");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/search_src_text");
        search_bar.sendKeys("aa\n");
        AndroidElement filter_done = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/search_filter_done_btn");
        filter_done.click();

        //test
        AndroidElement sort = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/menu_sort");
        sort.click();
        AndroidElement price = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
        price.click();
        AndroidElement done = (AndroidElement) driver.findElementById("android:id/button1");
        done.click();
    }

    @Test
    public void testDetail() throws InterruptedException {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/menu_search");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/search_src_text");
        search_bar.sendKeys("aa\n");
        AndroidElement filter_done = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/search_filter_done_btn");
        filter_done.click();
        Thread.sleep(1000);

        //test
        AndroidElement item = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.slidingpanelayout.widget.SlidingPaneLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
        item.click();
    }

    @Test
    public void testAddCart() throws InterruptedException {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/menu_search");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/search_src_text");
        search_bar.sendKeys("aa\n");
        AndroidElement filter_done = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/search_filter_done_btn");
        filter_done.click();
        Thread.sleep(1000);
        AndroidElement item = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.slidingpanelayout.widget.SlidingPaneLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
        item.click();

        //test
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/add_to_cart_fab");
        add_cart.click();
    }

    @Test
    public void testCart() throws InterruptedException {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/menu_search");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/search_src_text");
        search_bar.sendKeys("aa\n");
        AndroidElement filter_done = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/search_filter_done_btn");
        filter_done.click();
        Thread.sleep(1000);
        AndroidElement item = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.slidingpanelayout.widget.SlidingPaneLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
        item.click();
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/add_to_cart_fab");
        add_cart.click();

        //test
        AndroidElement cart = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/icon");
        cart.click();
        AndroidElement remove = (AndroidElement) driver.findElementById("com.zappos.android.sixpmFlavor:id/menu_remove_all");
        remove.click();
    }

    @Test
    public void testTerms() {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
        menu.click();
        AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[6]");
        settings.click();

        //test
        AndroidElement more = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]/android.widget.RelativeLayout");
        more.click();
        AndroidElement legal = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.RelativeLayout");
        legal.click();
    }

}