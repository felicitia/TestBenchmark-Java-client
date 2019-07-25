package global;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;



public class HelperClass {

    public static void screenshot(String filename, AndroidDriver driver) throws IOException{
        File srcFile=driver.getScreenshotAs(OutputType.FILE);
        String currentDir =   System.getProperty("user.dir");
        File targetFile=new File(currentDir + "/screenshots/" + filename +".jpg");
//        System.out.print("filepath = " + targetFile.getAbsolutePath());
        FileUtils.copyFile(srcFile,targetFile);
    }
}
