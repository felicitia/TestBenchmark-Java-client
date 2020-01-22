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
        AndroidElement account = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/navigation_my_ae");
        account.click();
        AndroidElement menu_signin = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_un_login");
        menu_signin.click();
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/btn_sign_in");
        signin_jump.click();

        //test
        AndroidElement email =  (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/et_email");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/et_password");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_ali_sign_in_btn");
        sign_in.click();
    }

    @Test
    public void testSignUp() {
        //transit
        AndroidElement account = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/navigation_my_ae");
        account.click();
        AndroidElement menu_signin = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_un_login");
        menu_signin.click();
        AndroidElement signup_jump = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/btn_register");
        signup_jump.click();

        //test
        AndroidElement email = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/et_email");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/et_password");
        password.sendKeys(Configuration.password);
        AndroidElement sign_up = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_ali_register_btn");
        sign_up.click();
    }

    @Test
    public void testAbout() {
        //transit
        AndroidElement account = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/navigation_my_ae");
        account.click();
        AndroidElement settings = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_settings");
        settings.click();
        //test
        AndroidElement about = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_version_settings");
        about.click();
    }

    @Test
    public void testAccount(){
        //sign in
        AndroidElement account = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/navigation_my_ae");
        account.click();
        AndroidElement menu_signin = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_un_login");
        menu_signin.click();
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/btn_sign_in");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/et_email");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/et_password");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_ali_sign_in_btn");
        sign_in.click();

        AndroidElement settings = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_settings");
        settings.click();
        AndroidElement profile = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_account_setting");
        profile.click();
    }

    @Test
    public void testAddress() {
        //sign in
        AndroidElement account = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/navigation_my_ae");
        account.click();
        AndroidElement menu_signin = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_un_login");
        menu_signin.click();
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/btn_sign_in");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/et_email");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/et_password");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_ali_sign_in_btn");
        sign_in.click();

        AndroidElement settings = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_settings");
        settings.click();
        AndroidElement shipping = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_shipping_address");
        shipping.click();
        AndroidElement add_address = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/ll_add_address");
        add_address.click();

        AndroidElement contact_name = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/etfwc_base_edit_text");
        contact_name.sendKeys(Configuration.contact_name);
        AndroidElement phone = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/edit_address_tel_mobile");
        phone.sendKeys(Configuration.phone);
        AndroidElement street = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/edit_address_street_line1");
        street.sendKeys(Configuration.street);
        AndroidElement state = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/edit_address_province");
        state.click();
        AndroidElement state_selection = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rb_selected_item");
        state_selection.click();
        AndroidElement city_selection = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rb_selected_item");
        city_selection.click();
        AndroidElement zip = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/etfwc_base_edit_text");
        zip.sendKeys(Configuration.zip);
        AndroidElement save = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/btn_address_add");
        save.click();
    }

    @Test
    public void testCategory() {
        //transit
        AndroidElement category = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
        category.click();

        //test
        AndroidElement cat_1 = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_pic_text_mix_item_category_name");
        cat_1.click();
    }

    @Test
    public void testContact() {
        //sign in
        AndroidElement account = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/navigation_my_ae");
        account.click();
        AndroidElement menu_signin = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_un_login");
        menu_signin.click();
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/btn_sign_in");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/et_email");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/et_password");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_ali_sign_in_btn");
        sign_in.click();

        AndroidElement settings = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_settings");
        settings.click();
        AndroidElement profile = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_account_setting");
        profile.click();
    }

    @Test
    public void testHelp() {
        AndroidElement account = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/navigation_my_ae");
        account.click();

        //test
        AndroidElement help = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_custom_service");
        help.click();
    }

    @Test
    public void testMenu() {
        AndroidElement account = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/navigation_my_ae");
        account.click();
    }

    @Test
    public void testSearch() {
        //test
        AndroidElement search = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_search_box");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/abs__search_src_text");
        search_bar.sendKeys("aa\n");
    }

    @Test
    public void testFilter() {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_search_box");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/abs__search_src_text");
        search_bar.sendKeys("aa\n");

        //test
        AndroidElement filter = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/search_btn_filter");
        filter.click();
        AndroidElement rating = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/search_switch_btn");
        rating.click();
    }

    @Test
    public void testDetail() {
        //transit
        AndroidElement search = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_search_box");
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
        AndroidElement search = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_search_box");
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
        AndroidElement search = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_search_box");
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
        AndroidElement account = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/navigation_my_ae");
        account.click();
        AndroidElement settings = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/tv_settings");
        settings.click();

        //test
        AndroidElement legal = (AndroidElement) driver.findElementById("com.alibaba.aliexpresshd:id/rl_legal_information_settings");
        legal.click();
    }

}