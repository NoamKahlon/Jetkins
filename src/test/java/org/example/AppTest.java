package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    ExtentReports extent;
    ExtentTest test;



            @Test
            public void testAddition() {

                extent = new ExtentReports();

                String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
                String reportPath = "src/test" + timeStamp + ".html";
                ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
                extent.attachReporter(htmlReporter);


                WebDriver driver = new ChromeDriver();

                test = extent.createTest("Sample Google Test");

                driver.get("https://www.turnitin.com/newuser_join.asp?svr=6&session-id=dd0a42c27e8b4002bc0a03105cb569a1&lang=en_us&r=12.9911285417791");
                String pageTitle = driver.getTitle();

                if (pageTitle.equals("Create a User Profile")) {
                    test.pass("Page title contains 'Create a User Profile22222222222222222222222'");
                } else {
                    test.fail("Page title does not contain 'Google'111111111111111111111");
                }

                System.err.println("wwwwwwwwwwwwawwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
            }

    @Test
    public void test2() {

        extent = new ExtentReports();

        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        String reportPath = "src/test" + timeStamp + ".html";
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
        extent.attachReporter(htmlReporter);


        WebDriver driver = new ChromeDriver();

        test = extent.createTest("Sample Google Test");

        driver.get("https://www.turnitin.com/newuser_join.asp?svr=6&session-id=dd0a42c27e8b4002bc0a03105cb569a1&lang=en_us&r=12.9911285417791");
        String pageTitle = driver.getTitle();

        if (pageTitle.equals("Create a User Profile")) {
            test.pass("Page title contains 'Create a User Profile22222222222222222222222'");
        } else {
            test.fail("Page title does not contain 'Google'111111111111111111111");
        }

        extent.flush();

            }



}

