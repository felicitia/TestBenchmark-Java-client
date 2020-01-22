package Home;

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
    private final String ACTIVITY = "com.contextlogic.wish.activity.login.LoginActivity";
    private final String PACKAGE = "com.contextlogic.home";
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
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.contextlogic.home:id/login_fragment_sign_in_button");
        signin_jump.click();

        //test
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_sign_in_button");
        sign_in.click();
    }

    @Test
    public void testSignUp() {
        //transit
//        AndroidElement sign_up_jump = (AndroidElement) driver.findElementById("com.contextlogic.home:id/login_fragment_create_account_button");
//        sign_up_jump.click();

        //test
        AndroidElement firstname = (AndroidElement) driver.findElementById("com.contextlogic.home:id/create_account_fragment_first_name_text");
        firstname.sendKeys(Configuration.firstname);
        AndroidElement lastname = (AndroidElement) driver.findElementById("com.contextlogic.home:id/create_account_fragment_last_name_text");
        lastname.sendKeys(Configuration.lastname);
        AndroidElement email = (AndroidElement) driver.findElementById("com.contextlogic.home:id/create_account_fragment_email_text");
        email.sendKeys(Configuration.email);
//        AndroidElement confirm_email = (AndroidElement) driver.findElementById("com.contextlogic.home:id/create_account_fragment_confirm_email_text");
//        confirm_email.sendKeys(Configuration.email);
//        AndroidElement username = (AndroidElement) driver.findElementById("com.contextlogic.home:id/create_account_fragment_first_name_text");
//        username.sendKeys("aaa");
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.home:id/create_account_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_up = (AndroidElement) driver.findElementById("com.contextlogic.home:id/create_account_fragment_create_account_button");
        sign_up.click();
    }

    @Test
    public void testAbout() throws InterruptedException {
        //sign in
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.contextlogic.home:id/login_fragment_sign_in_button");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
        menu.click();

        //test
        AndroidElement about = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[11]");
        about.click();
    }

    @Test
    public void testAccount() throws InterruptedException {
        //sign in
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.contextlogic.home:id/login_fragment_sign_in_button");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
        menu.click();

        //test
        AndroidElement account = (AndroidElement) driver.findElementById("com.contextlogic.home:id/menu_view_profile_arrow");
        account.click();
    }

    @Test
    public void testCategory() throws InterruptedException {
        //sign in
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.contextlogic.home:id/login_fragment_sign_in_button");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        //test
        AndroidElement cat_1 = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[3]");
        cat_1.click();
    }

    @Test
    public void testContact() throws InterruptedException {
        //sign in
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.contextlogic.home:id/login_fragment_sign_in_button");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
        menu.click();
        Thread.sleep(1000);

        //test
        AndroidElement contact = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[9]");
        contact.click();
    }

    @Test
    public void testHelp() throws InterruptedException {
        //sign in
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.contextlogic.home:id/login_fragment_sign_in_button");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
        menu.click();
        Thread.sleep(1000);

        //test
        AndroidElement help = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[10]");
        help.click();
    }

    @Test
    public void testMenu() throws InterruptedException {
        //sign in
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.contextlogic.home:id/login_fragment_sign_in_button");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
        menu.click();
    }

    @Test
    public void testSearch() throws InterruptedException {
        //sign in
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.contextlogic.home:id/login_fragment_sign_in_button");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        //test
        AndroidElement search = (AndroidElement) driver.findElementById("com.contextlogic.home:id/search_mag_icon");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.contextlogic.home:id/search_src_text");
        search_bar.sendKeys("aa\n");
    }

    @Test
    public void testFilter() throws InterruptedException{
        // no filter after search

    }

    @Test
    public void testDetail() throws InterruptedException {
        //sign in
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.contextlogic.home:id/login_fragment_sign_in_button");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        //test
        AndroidElement search = (AndroidElement) driver.findElementById("com.contextlogic.home:id/search_mag_icon");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.contextlogic.home:id/search_src_text");
        search_bar.sendKeys("aa\n");

        AndroidElement item = (AndroidElement) driver.findElementById("com.contextlogic.home:id/product_feed_image");
        item.click();
    }

    @Test
    public void testAddCart() throws InterruptedException {
        //sign in
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.contextlogic.home:id/login_fragment_sign_in_button");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        AndroidElement search = (AndroidElement) driver.findElementById("com.contextlogic.home:id/search_mag_icon");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.contextlogic.home:id/search_src_text");
        search_bar.sendKeys("aa\n");
        AndroidElement item = (AndroidElement) driver.findElementById("com.contextlogic.home:id/product_feed_image");
        item.click();

        //test
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.contextlogic.home:id/product_details_fragment_add_to_cart_button");
        add_cart.click();
    }

    @Test
    public void testCart() throws InterruptedException {
        //sign in
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.contextlogic.home:id/login_fragment_sign_in_button");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        AndroidElement search = (AndroidElement) driver.findElementById("com.contextlogic.home:id/search_mag_icon");
        search.click();
        AndroidElement search_bar = (AndroidElement) driver.findElementById("com.contextlogic.home:id/search_src_text");
        search_bar.sendKeys("aa\n");
        AndroidElement item = (AndroidElement) driver.findElementById("com.contextlogic.home:id/product_feed_image");
        item.click();
        AndroidElement add_cart = (AndroidElement) driver.findElementById("com.contextlogic.home:id/product_details_fragment_add_to_cart_button");
        add_cart.click();

        AndroidElement cart = (AndroidElement) driver.findElementById("com.contextlogic.home:id/action_bar_item_icon");
        cart.click();
        //test
        AndroidElement quantity = (AndroidElement) driver.findElementById("com.contextlogic.home:id/cart_fragment_quantity_dropdown_icon");
        quantity.click();
        AndroidElement zero = (AndroidElement) driver.findElementById("com.contextlogic.home:id/simple_list_view_text_view");
        zero.click();
        AndroidElement remove = (AndroidElement) driver.findElementByXPath("//android.widget.Button[@text=\"Remove\"]");
        remove.click();
    }

    @Test
    public void testTerms() throws InterruptedException {
        //sign in
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.contextlogic.home:id/login_fragment_sign_in_button");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
        menu.click();
        AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[11]");
        settings.click();

        //test
        AndroidElement legal = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.FrameLayout[4]");
        legal.click();
    }

    @Test
    public void testAddress() throws InterruptedException {
        //sign in
        AndroidElement signin_jump = (AndroidElement) driver.findElementById("com.contextlogic.home:id/login_fragment_sign_in_button");
        signin_jump.click();
        AndroidElement email =  (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_email_text");
        email.sendKeys(Configuration.email);
        AndroidElement password = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_password_text");
        password.sendKeys(Configuration.password);
        AndroidElement sign_in = (AndroidElement) driver.findElementById("com.contextlogic.home:id/sign_in_fragment_sign_in_button");
        sign_in.click();
        Thread.sleep(5000);

        AndroidElement menu = (AndroidElement) driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open Menu\"]");
        menu.click();
        AndroidElement settings = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[11]");
        settings.click();

        //test
        AndroidElement address =  (AndroidElement) driver.findElementByXPath("//android.widget.TextView[@text=\"Manage Addresses\"]");
        address.click();
        AndroidElement add_address = (AndroidElement) driver.findElementById("com.contextlogic.home:id/address_book_footer_text");
        add_address.click();
        AndroidElement street = (AndroidElement) driver.findElementById("com.contextlogic.home:id/shipping_address_form_street_address_text");
        street.sendKeys(Configuration.street);
        AndroidElement state = (AndroidElement) driver.findElementById("com.contextlogic.home:id/shipping_address_form_state_spinner");
        state.click();
        //choose the first state
        AndroidElement state_selection = (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
        state_selection.click();
        AndroidElement city = (AndroidElement) driver.findElementById("com.contextlogic.home:id/shipping_address_form_city_text");
        city.sendKeys(Configuration.city);
        AndroidElement zipcode = (AndroidElement) driver.findElementById("com.contextlogic.home:id/shipping_address_form_zip_postal_text");
        zipcode.sendKeys(Configuration.zip);
        AndroidElement phone = (AndroidElement) driver.findElementById("com.contextlogic.home:id/shipping_address_form_phone_text");
        phone.sendKeys(Configuration.phone);
        AndroidElement save = (AndroidElement) driver.findElementById("com.contextlogic.home:id/cart_fragment_cart_shipping_floating_done_button");
        save.click();
    }

}