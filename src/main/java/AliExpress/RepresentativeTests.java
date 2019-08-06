package AliExpress;

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
    private final String ACTIVITY = "com.alibaba.aliexpresshd.module.home.MainActivity";
    private final String PACKAGE = "com.alibaba.aliexpresshd";
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
        AndroidElement no = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/buttonDefaultNegative");
        no.click();
    }

    @Test
    public void testSignIn() {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/left_action");
        menu.click();
        AndroidElement menu_signin = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]");
        menu_signin.click();
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/btn_sign_in");
        signin_jump.click();

        //test
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_forgot_password_label");
        sign_in.click();
    }

    @Test
    public void testSignUp() {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/left_action");
        menu.click();
        AndroidElement menu_signin = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]");
        menu_signin.click();
        AndroidElement sign_up_jump = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/btn_register");
        sign_up_jump.click();

        //test
        AndroidElement email = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement username = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/et_first_name");
        username.sendKeys("aaa");
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[4]/android.widget.EditText");
        password.sendKeys("bbb");
        AndroidElement sign_up = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_ali_register_btn");
        sign_up.click();
    }

    @Test
    public void testAbout() {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ImageButton[1]");
        menu.click();

        //test
        AndroidElement about = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[10]");
        about.click();
    }

    @Test
    public void testAddress() {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/left_action");
        menu.click();
        AndroidElement menu_signin = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]");
        menu_signin.click();
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/btn_sign_in");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.EditText");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.EditText");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_forgot_password_label");
        sign_in.click();
        menu = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ImageButton[1]");
        menu.click();

        //test
        AndroidElement account = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/iv_shipping_address");
        account.click();
        AndroidElement address =  (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/ll_add_address");
        address.click();
        //got locked out of account before I could get the id/xpath of address input fields...
    }

    @Test
    public void testCategory() {
        //transit
        AndroidElement category = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
        category.click();

        //test
        AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout");
        cat_1.click();
    }

    @Test
    public void testContact() {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/left_action");
        menu.click();

        //test
        AndroidElement contact = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[12]");
        contact.click();
    }

    @Test
    public void testHelp() {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/left_action");
        menu.click();

        //test
        AndroidElement help = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[13]");
        help.click();
    }

    @Test
    public void testMenu() {
        //test
        AndroidElement menu = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/left_action");
        menu.click();
    }

    @Test
    public void testSearch() {
        //test
        AndroidElement search = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/search_hint");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/abs__search_src_text");
        search_bar.sendKeys("aa\n");
    }

    @Test
    public void testFilter() {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/search_hint");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/abs__search_src_text");
        search_bar.sendKeys("aa\n");

        //test
        AndroidElement sort = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_spinner_item");
        sort.click();
        AndroidElement price = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]");
        price.click();
    }

    @Test
    public void testDetail() {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/search_hint");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/abs__search_src_text");
        search_bar.sendKeys("aa\n");

        //test
        AndroidElement item = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/riv_productsummary_img");
        item.click();
    }

    @Test
    public void testAddCart() {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/search_hint");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/abs__search_src_text");
        search_bar.sendKeys("aa\n");
        AndroidElement item = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/riv_productsummary_img");
        item.click();

        //test
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/ll_addToCart");
        add_cart.click();
    }

    @Test
    public void testCart() {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/search_hint");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/abs__search_src_text");
        search_bar.sendKeys("aa\n");
        AndroidElement item = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/riv_productsummary_img");
        item.click();
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/ll_addToCart");
        add_cart.click();

        //test
        AndroidElement cart = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/menu_shopcart");
        cart.click();
        AndroidElement select = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/select_all");
        select.click();
        AndroidElement remove = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/menu_delete");
        remove.click();
    }

    @Test
    public void testTerms() {
        //transit
        AndroidElement menu = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ImageButton[1]");
        menu.click();
        AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[10]");
        settings.click();

        //test
        AndroidElement legal = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_privacy_policy_settings");
        legal.click();
    }

}