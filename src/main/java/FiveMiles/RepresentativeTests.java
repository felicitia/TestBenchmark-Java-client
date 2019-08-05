package FiveMiles;

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
    private final String ACTIVITY = "com.insthub.fivemiles.Activity.WelcomeActivity";
    private final String PACKAGE = "com.thirdrock.fivemiles";
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
        AndroidElement signin_jump = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
        signin_jump.click();
        Thread.sleep(1000);

        //test
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/login_login");
        sign_in.click();
    }

    @Test
    public void testSignUp() throws InterruptedException {
        //transit
        AndroidElement sign_up_jump = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/sign_up");
        sign_up_jump.click();
        Thread.sleep(1000);

        //test
        AndroidElement email = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[3]/android.widget.FrameLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement username = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/login_first_name");
        username.sendKeys("aaa");
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[4]/android.widget.FrameLayout/android.widget.EditText");
        password.sendKeys("bbb");
        AndroidElement sign_up = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/register_register");
        sign_up.click();
    }

    @Test
    public void testAbout() throws InterruptedException {
        //transit
        AndroidElement signin_jump = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
        signin_jump.click();
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/login_login");
        sign_in.click();
        Thread.sleep(2000);
        AndroidElement skip = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/btn_skip");
        skip.click();
        AndroidElement home = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        home.click();
        AndroidElement account = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/main_tab_profile");
        account.click();
        AndroidElement settings = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/profile_setting");
        settings.click();
        //fails due to verification popup

        //test
        AndroidElement about = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/setting_aboutus");
        about.click();
    }

    @Test
    public void testAccount() throws InterruptedException {
        //transit
        AndroidElement signin_jump = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
        signin_jump.click();
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/login_login");
        sign_in.click();
        Thread.sleep(2000);
        AndroidElement skip = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/btn_skip");
        skip.click();
        AndroidElement home = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        home.click();

        //test
        AndroidElement account = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/main_tab_profile");
        account.click();
    }

    @Test
    public void testCategory() throws InterruptedException {
        //transit
        AndroidElement signin_jump = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
        signin_jump.click();
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/login_login");
        sign_in.click();
        Thread.sleep(2000);
        AndroidElement skip = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/btn_skip");
        skip.click();
        AndroidElement home = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        home.click();
        AndroidElement category = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/main_tab_search");
        category.click();

        //test
        AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TabHost/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView");
        cat_1.click();
    }

    @Test
    public void testContact() {
        //no contact info in app
    }

    @Test
    public void testHelp() throws InterruptedException {
        //transit
        AndroidElement signin_jump = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
        signin_jump.click();
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/login_login");
        sign_in.click();
        Thread.sleep(2000);
        AndroidElement skip = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/btn_skip");
        skip.click();
        AndroidElement home = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        home.click();
        AndroidElement account = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/main_tab_profile");
        account.click();

        //test
        AndroidElement help = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/profile_help");
        help.click();
        //fails due to verification popup
    }

    @Test
    public void testMenu() throws InterruptedException {
        //transit
        AndroidElement signin_jump = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
        signin_jump.click();
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/login_login");
        sign_in.click();
        Thread.sleep(2000);
        AndroidElement skip = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/btn_skip");
        skip.click();
        AndroidElement home = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        home.click();

        //test
        AndroidElement menu = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/main_tab_profile");
        menu.click();
    }

    @Test
    public void testSearch() throws InterruptedException {
        //transit
        AndroidElement signin_jump = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
        signin_jump.click();
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/login_login");
        sign_in.click();
        Thread.sleep(2000);
        AndroidElement skip = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/btn_skip");
        skip.click();
        AndroidElement home = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        home.click();

        //test
        AndroidElement search = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/lbl_search");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/edt_keyword_search");
        search_bar.sendKeys("aa\n");
    }

    @Test
    public void testFilter() throws InterruptedException {
        //transit
        AndroidElement signin_jump = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
        signin_jump.click();
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/login_login");
        sign_in.click();
        Thread.sleep(2000);
        AndroidElement skip = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/btn_skip");
        skip.click();
        AndroidElement home = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        home.click();
        AndroidElement search = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/lbl_search");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/edt_keyword_search");
        search_bar.sendKeys("aa\n");
        //fails due to enter key not working

        //test
        AndroidElement filter = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/ic_filter");
        filter.click();
        AndroidElement price = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/cbx_sort_price_asc");
        price.click();
        AndroidElement done = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/btn_save_filter");
        done.click();
    }

    @Test
    public void testDetail() throws InterruptedException {
        //transit
        AndroidElement signin_jump = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
        signin_jump.click();
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/login_login");
        sign_in.click();
        Thread.sleep(2000);
        AndroidElement skip = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/btn_skip");
        skip.click();
        AndroidElement home = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        home.click();
        AndroidElement search = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/lbl_search");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/edt_keyword_search");
        search_bar.sendKeys("aa\n");
        //fails due to enter key not working

        //test
        AndroidElement item = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/home_location_item_image");
        item.click();
    }

    @Test
    public void testAddCart() throws InterruptedException {
        //transit
        AndroidElement signin_jump = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
        signin_jump.click();
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/login_login");
        sign_in.click();
        Thread.sleep(2000);
        AndroidElement skip = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/btn_skip");
        skip.click();
        AndroidElement home = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        home.click();
        AndroidElement search = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/lbl_search");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/edt_keyword_search");
        search_bar.sendKeys("aa\n");
        //fails due to enter key not working
        AndroidElement item = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/home_location_item_image");
        item.click();

        //test
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/btn_make_offer");
        add_cart.click();
    }

    @Test
    public void testCart() {
        //no cart
    }

    @Test
    public void testTerms() throws InterruptedException {
        //transit
        AndroidElement signin_jump = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
        signin_jump.click();
        Thread.sleep(1000);
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/login_login");
        sign_in.click();
        Thread.sleep(2000);
        AndroidElement skip = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/btn_skip");
        skip.click();
        AndroidElement home = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        home.click();
        AndroidElement account = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/main_tab_profile");
        account.click();
        AndroidElement settings = (AndroidElement) driver.findElementById("com.thirdrock.fivemiles:id/profile_setting");
        settings.click();
        //fails due to verification popup

        //test
        AndroidElement legal = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]");
        legal.click();
    }

}