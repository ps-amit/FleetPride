package Configuration;

import java.awt.Robot;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestRunner.TestCaseRunner;
import Util.ConnectToMySQL;

//import Util.ExcelUtils;

import Util.DatabaseUtil;
import Util.ExcelUtils;
import Util.ExtentLogs;
import Util.Log;
import Util.SalesForceDB;
import Util.SalesForceOrderID;
import Util.XMLParser;
import io.appium.java_client.android.AndroidDriver;

import java.awt.AWTException;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Scanner;
import java.util.TreeMap;

import javax.imageio.ImageIO;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import javax.net.ssl.SSLSocket;
import javax.swing.Action;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.remote.MobileCapabilityType;
import io.restassured.RestAssured;
import io.restassured.response.Response;


import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// api imports




































import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import com.gargoylesoftware.htmlunit.javascript.host.Screen;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * Lib Class contains all the Action Keywords and Support Lib Function
 */



/**
 * @author 
 *
 * Tag: Api function
 */

public class ActionKeyword {

	/**
	 * All the static element defined here
	 */
	public static WebDriver driver = null;
	public static WebElement ActionElement;
	public static WebElement ToolTipCapture;
	public static Screen screen;
	// public static Pattern pattern;
	// public static Finder finder;
	public static List<Integer> activeframe = new ArrayList<Integer>();
	public static List<WebElement> ActiveFrameElement = new ArrayList<WebElement>();
	public static List<String> Valuestored = new ArrayList<String>();
	public static List<String> ValueCaptured = new ArrayList<String>();
	public static List<String> compsetRate = new ArrayList<String>();
	public static List<String> valueSupportList2 = new ArrayList<String>();

	public static List<String> rateCaptured = new ArrayList<String>();
	public static List<String> ExcelDataList = new ArrayList<String>();

	
	public static List<Integer> NumberValueCaptured = new ArrayList<Integer>();
	public static List<String> ValuesCaptured = new ArrayList<String>();
	
	// excel value capture
	public static List<Object> ExcelValuesCaptured = new ArrayList<Object>();
	// date capture
	public static List<Date> DateCaptured = new ArrayList<Date>();
	public static List<Date> DateCapturedMultiple = new ArrayList<Date>();
	public static List<String> MultipleChannels = new ArrayList<String>();

	public static boolean ValueCaptureIfCheck=false;

	
	public static List<Integer> SpamCaptured = new ArrayList<Integer>();
	public static List<WebElement> WebElementCollection = new ArrayList<WebElement>();
	public static List<String> WindowHandle = new ArrayList<String>();
	public static Map<String, String> DbValueCaptured = new HashMap<String, String>();
	public static int ValueCaptureindex = 0;
	public static int IEOffsetx = 0, IEOffsety = 0;
	public static String imageLocation, browser = null;
	public static List<String> AllCompset=new  ArrayList<String>();
	

	// ---------------- api ------------------------------------
	static Response res;

	static String[] parameters;
	static Integer totalParameters;
	static String[] keyValue;
	static String[] key;
	static String[] value;
	static String[] jsonAttribute;
	static JSONArray jsonArray;

	static String msg = "";
	static JSONArray jsonarr;
	static JSONObject jsonobj;
	static String responseBody;
	static Boolean flag = true;
	static Integer nullvalueCount = 0;
	// parameter hashmap
	public static TreeMap<String, String> HashMapParameter = new TreeMap<String, String>();
	public static ArrayList<String> listValues = new ArrayList<String>();
	public static ArrayList<String> listAttributes = new ArrayList<String>();
	public static ArrayList<String> nullCount = new ArrayList<String>();

	static String attribute;
	static String attributeValue;

	public static LinkedHashMap<String, String> RateAgainstDatehash = new LinkedHashMap<String, String>();

	

	// reading data from config file
	public static Properties config = new Properties();
	//RateGain
	static boolean bluepresent=false, yellowpresent=false;
	
	
	
	public static String infoMessage = "";
	private static String warningMessage = "";
	private static String skipMessage = "";
	private static String errorMessage = "";
	private static String fatalMessage = "";
	private static String passMessage = "";
	private static String failMessage = "";
	private static String eInfoMessage = "";
	private static String ePassMessage = "";
	private static String eFailMessage = "";
	private static String eSkipMessage = "";
	private static String eErrorMessage = "";

	/**
	 * Will sent text provided in the data column to the WebElement.
	 */
	public static void OpenBrowser() {
		try {

			Log.debug("ActionKeyword>OpenBrowser:Identifying Browser count and saving them in the element");
			browser = Constant.Browser[TestCaseRunner.browsercount];

			Log.debug("ActionKeyword>OpenBrowser:Logic for error message when browser value is null");
			if (browser == null || browser.contains("Blank") || browser == "") {
				fatalMessage = "Browser is not specify please Specify Browser in test suite";
				Log.fatal(fatalMessage);
				Log.debug("ActionKeyword>OpenBrowser:Opening Chrome configuration");
			} 
			 else if (browser.equalsIgnoreCase("html")) {
				 System.out.println("htmlunit driver");
				 
					 driver = new HtmlUnitDriver();
				 
			 }
			else if (browser.equalsIgnoreCase("chrome")) {
				Log.debug("ActionKeyword>OpenBrowser:Setting up capabilities for Chrome");
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities
						.setCapability(
								CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,
								true);
				Log.debug("ActionKeyword>OpenBrowser:Checking if Chrome extinction is enabled");
				if (Constant.ChromeExtEnable == true) {
					SupportLib.browserconfig("chrome");
					Constant.highlighter = true;
					driver = new ChromeDriver(SupportLib.options);
				} else if (Constant.ChromeExtEnable == false) {
					System.setProperty("webdriver.chrome.driver",
							Constant.chromedriverlocations);
					
					
					Log.debug("ActionKeyword>OpenBrowser:Lunching chrome driver");
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--disable-extensions");
					capabilities.setCapability(ChromeOptions.CAPABILITY,
							options);
					driver = new ChromeDriver(capabilities);
				}
				Log.debug("ActionKeyword>OpenBrowser:Maximizing  Chrome window");
				driver.manage().window().maximize();
				Log.debug("ActionKeyword>OpenBrowser:Setting up ImplicitWait to"
						+ Constant.ImplicitWait);
				driver.manage()
						.timeouts()
						.implicitlyWait(Constant.ImplicitWait, TimeUnit.SECONDS);
				Log.debug("ActionKeyword>OpenBrowser:Setting up Page Load wait to"
						+ Constant.PageLoadWait);
				driver.manage()
						.timeouts()
						.pageLoadTimeout(Constant.PageLoadWait,
								TimeUnit.SECONDS);
				infoMessage = "Opening Chrome for Test case execution";
			} else if (browser.equalsIgnoreCase("FireFox")) {
				Constant.highlighter = true;
				
				
		System.setProperty("webdriver.gecko.driver",
						Constant.firefoxdriverlocation);
			//	System.setProperty("webdriver.gecko.driver", "D:\\workspace\\geckodriver.exe");
				driver = new FirefoxDriver();
				/*driver.manage().window().maximize();
				if (Constant.FirefoxTabprefrence == true) {
					SupportLib.browserconfig("Firefox");
				}*/
				/*driver.manage()
						.timeouts()
						.implicitlyWait(Constant.ImplicitWait, TimeUnit.SECONDS);
				driver.manage()
						.timeouts()
						.pageLoadTimeout(Constant.PageLoadWait,
								TimeUnit.SECONDS);*/
				infoMessage = "Opening Firefox for Test case execution";

			} 
			
			//-----------------------------------------------------------------------------------
			
			else if (browser.equalsIgnoreCase("Opera")) {
				Constant.highlighter = true;
				
			//****************************************************************************************	
				System.setProperty("webdriver.opera.driver",
						Constant.operadriverlocation);
			
		OperaOptions op = new OperaOptions();
		op.setBinary(new File("D:\\Automation_Framework_Puresoftware_New\\driver\\OperaSetup.exe"));
				driver = new OperaDriver(op);

		
				driver.manage().window().maximize();
				
				driver.manage()
						.timeouts()
						.implicitlyWait(Constant.ImplicitWait, TimeUnit.SECONDS);
				driver.manage()
						.timeouts()
						.pageLoadTimeout(Constant.PageLoadWait,
								TimeUnit.SECONDS);
				infoMessage = "Opening Opera for Test case execution";

			}
			//************************************************************************************
			
			//------------------------------------------------------------------------------------
			
			else if (browser.equalsIgnoreCase("Safari")) {
				Constant.highlighter = true;
				driver = new SafariDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage()
						.timeouts()
						.implicitlyWait(Constant.ImplicitWait, TimeUnit.SECONDS);
				driver.manage()
						.timeouts()
						.pageLoadTimeout(Constant.PageLoadWait,
								TimeUnit.SECONDS);
				infoMessage = "Opening Safari for Test case execution";
			} else if (browser.equalsIgnoreCase("HTMLUnit")) {
				driver = new HtmlUnitDriver(true);
				driver.manage()
						.timeouts()
						.implicitlyWait(Constant.ImplicitWait, TimeUnit.SECONDS);
			} else if (browser.equalsIgnoreCase("IE")) {
				Constant.highlighter = false;
				DesiredCapabilities ieCapabilities = DesiredCapabilities
						.internetExplorer();

				ieCapabilities.setCapability("nativeEvents", true);
				ieCapabilities.setCapability("ignoreZoomSetting", true);
				ieCapabilities.setCapability("unexpectedAlertBehaviour",
						"accept");
				ieCapabilities.setCapability("ignoreProtectedModeSettings",
						true);
				ieCapabilities.setCapability("disable-popup-blocking", true);
				ieCapabilities.setCapability("enablePersistentHover", true);
				ieCapabilities.setCapability("REQUIRE_WINDOW_FOCUS", true);
				System.setProperty("webdriver.ie.driver", Constant.IEDRIVER);
				driver = new InternetExplorerDriver(ieCapabilities);
				infoMessage = "Opening IE for Test case execution";

				if (Constant.IECleanHistoryFlag == true) {
					Process CleanHistory = Runtime
							.getRuntime()
							.exec("RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 255");
					InputStream is = CleanHistory.getInputStream();
					int retCode = 0;
					while (retCode != -1) {
						retCode = is.read();
					}
				}

				driver.manage().deleteAllCookies();
				driver.manage()
						.timeouts()
						.implicitlyWait(Constant.ImplicitWait, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.manage()
						.timeouts()
						.pageLoadTimeout(Constant.PageLoadWait,
								TimeUnit.SECONDS);
				SupportLib.CaliberateIE();

			} else if (browser.equalsIgnoreCase("DeviceAPP")) {

				File app = new File(
						Constant.MobilesetCapability.get("Applocation"));
				DesiredCapabilities capabilities = new DesiredCapabilities();

				capabilities.setCapability("platformVersion",
						Constant.MobilesetCapability.get("platformVersion"));
				capabilities.setCapability("platformName",
						Constant.MobilesetCapability.get("platformName"));
				capabilities.setCapability("deviceName",
						Constant.MobilesetCapability.get("deviceName"));
				capabilities.setCapability("app", app);
				capabilities.setCapability("appPackage",
						Constant.MobilesetCapability.get("appPackage"));
				capabilities.setCapability("appActivity",
						Constant.MobilesetCapability.get("appActivity"));
				URL URL = new URL(Constant.MobilesetCapability.get("AppiumURL"));
				driver = new AndroidDriver(URL, capabilities);

				Thread.sleep(10000);

			} else if (browser.contains("DeviceWep")) {
				SupportLib.Mobileinfoupdate();
				browser = browser.replace("Androidweb:", "");
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("platformVersion",
						Constant.MobilesetCapability.get("platformVersion"));
				capabilities.setCapability("platformName",
						Constant.MobilesetCapability.get("platformName"));
				capabilities.setCapability("deviceName",
						Constant.MobilesetCapability.get("deviceName"));
				capabilities.setCapability("browserName", "Browser");
				capabilities.setCapability("newCommandTimeout",
						Constant.PageLoadWait);
				capabilities.setCapability("androidDeviceReadyTimeout",
						Constant.PageLoadWait);
				URL URL = new URL(Constant.MobilesetCapability.get("AppiumURL"));
				driver = new AndroidDriver(URL, capabilities);
			}

			else if (browser.contains("ChromeE")) {

				System.setProperty("webdriver.chrome.driver",
						Constant.chromedriverlocations);

				Map<String, String> mobileEmulation = new HashMap<String, String>();
				mobileEmulation.put("deviceName", "Google Nexus 5");

				Map<String, Object> chromeOptions = new HashMap<String, Object>();
				chromeOptions.put("mobileEmulation", mobileEmulation);
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability(ChromeOptions.CAPABILITY,
						chromeOptions);
				driver = new ChromeDriver(capabilities);

				SupportLib.Mobileinfoupdate();

			} else if (browser.equalsIgnoreCase("NoBrowser")) {
				browser = "";
				Robot robot = new Robot();
				robot.delay(40);
				robot.keyPress(KeyEvent.VK_WINDOWS);
				robot.keyPress(KeyEvent.VK_D);
				robot.keyRelease(KeyEvent.VK_WINDOWS);
				robot.keyRelease(KeyEvent.VK_WINDOWS);
				robot.delay(1000);

			} else if (browser.equalsIgnoreCase("Config")) {
				TestCaseRunner.Config();
			} else if (browser.equalsIgnoreCase("Appium")) {
			} else {
				TestCaseRunner.testSuitResult = false;
			}

			Thread.sleep(2000);
		} catch (Exception e) {
			errorMessage = Constant.TestSuit.get("Testcaseid")
					+ "; Error in communicating with Browser" + e.toString();
			Log.error(errorMessage);
			return;
		}

	}

	/**
	 * Click on the specific element
	 * @throws Exception 
	 * 
	 * @throws NoSuchElementException
	 */
	public static void Click() throws Exception {
	SupportLib.waitForAjax();

		if (!(Constant.TestCaseRow.get("ActionSupportValue").contains("Blank"))
				|| !(Constant.TestCaseRow.get("Data").contains("Blank"))) {
			WebElementCollection = FindElements();
			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			} else {
				ActionElement = SupportLib.SearhElement(WebElementCollection);
			}

		} else {
			ActionElement = FindElement();
		}
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ActionElement);*/
		ActionElement.click();

		// ActionElement.click();
		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription");
		Log.pass(passMessage);
		ePassMessage = "   Action Click  ";
		ExtentLogs.Pass(ePassMessage);
	}

	/**
	 * Function to Perform click action on Web-Element(if IE) Fields required:
	 * field, Web Element location, Web element locator Type Test data: N/A
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void ClickifIE() throws Exception {
		SupportLib.waitForAjax();
		if (browser.equalsIgnoreCase("IE")) {
			driver.getWindowHandle();
			ActionElement = FindElement();

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ActionElement);

			ActionElement.sendKeys(Keys.ENTER);
			ActionElement.click();
			Actions action = new Actions(driver);
			action.moveToElement(ActionElement).build().perform();
			action.moveToElement(ActionElement).click().build().perform();
			Point pt = ActionElement.getLocation();
			int x = pt.x;
			int y = pt.y;
			Robot robo;
			try {
				robo = new Robot();

				robo.mouseMove(x, y);
				robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			} catch (AWTException e) {
				Log.error(e.getStackTrace().toString());
				ExtentLogs.error(e.getStackTrace().toString());
			}

			infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Action clickifIE";
			Log.info(infoMessage);
		} else {
			skipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Browser is : " + browser + ". Skipping to next step.";
			Log.skip(skipMessage);
			eSkipMessage = " Action Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ ": Browser is : " + browser + ". Skipping to next step.";
			ExtentLogs.Skip(eSkipMessage);
		}
	}

	/**
	 * Function to perform Page-Scroll. Fields required: Action field, Web Test
	 * data: the
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void PageScroll() throws Exception {
		SupportLib.waitForAjax();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + Constant.TestCaseRow.get("Data")
				+ ")");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Log.info("Not able to sleet in PageScroll : "
					+ e.getStackTrace().toString());
			ExtentLogs.info("Not able to sleet in PageScroll : "
					+ e.getStackTrace().toString());
		}
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Action Scroll Down";
		Log.info(infoMessage);
		eInfoMessage = "Page is scrolled down by as per provided coordinates"
				+ Constant.TestCaseRow.get("Data");
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * Click if (to change to time to wait for the optional element please
	 * change value of Constant.ExplicitWaitif
	 * @throws Exception 
	 */
	public static void ClickIf() throws Exception {
		SupportLib.waitForAjax();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			Log.info("Not able to sleet in ClickIf : "
					+ e.getStackTrace().toString());
			ExtentLogs.info("Not able to sleet in ClickIf : "
					+ e.getStackTrace().toString());
		}
		int buffervalue = Constant.ExplicitWait;
		Constant.ExplicitWait = Constant.ExplicitWaitif;

		if (!(Constant.TestCaseRow.get("ActionSupportValue").contains("Blank"))
				|| !(Constant.TestCaseRow.get("Data").contains("Blank"))) {
			WebElementCollection = FindElements();
			if (WebElementCollection != null) {
				ActionElement = SupportLib.SearhElement(WebElementCollection);
			} else {
				ActionElement = null;
			}

		} else {
			ActionElement = FindElement();
		}
		if (ActionElement == null) {
			skipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Action Element is not present moving to next step";
			Log.skip(skipMessage);
			eSkipMessage = " Action Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ " moving to next step";
			ExtentLogs.Skip(eSkipMessage);
		} else {
			ActionElement.click();

			passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Action click If";
			Log.pass(passMessage);
		}
		Constant.ExplicitWait = buffervalue;
	}

	/**
	 * "Function to Perform Logical click action with following logic 1> If web
	 * element is not displayed on the screen, can be used to drag the scroll
	 * bar for this option in the element column user need to provide the xpath
	 * of the desired webelement followed by scroller xpath and need to put
	 * ""AND_XPATH:"" seperator between them.
	 * 
	 * 2>Smart element(Random webelement xpath generation if Xpath provided with
	 * ^ wherer random value is need to generated, to use this need not to
	 * provide [] for the element Fields required: Action field, Web Element
	 * location(AND_XPATH: and ^ can be use for smart option)"
	 * @throws Exception 
	 */
	public static void LClick() throws Exception {
		SupportLib.waitForAjax();
		Random Rand = new Random();
		String ExlXpath = Constant.TestCaseRow.get("Elementlocation");
		String[] Scroll_ver = ExlXpath.split("AND_XPATH:");
		String[] rnd_ver;
		String ScrollBarXpath = null;
		String EXpath = null;
		List<WebElement> LWE;

		if (Scroll_ver.length > 1) {
			ScrollBarXpath = Scroll_ver[1];
			EXpath = Scroll_ver[0];
		} else {
			EXpath = ExlXpath;
		}

		rnd_ver = EXpath.split("\\^");
		if (rnd_ver.length > 1) {
			LWE = driver.findElements(By.xpath(rnd_ver[0] + rnd_ver[1]));
			int randomnum = Rand.nextInt(LWE.size());
			if (randomnum == 0) {
				randomnum++;
			}
			EXpath = rnd_ver[0] + "[" + randomnum + "]" + rnd_ver[1];
		}
		if (Scroll_ver.length > 1) {
			WebElement we2 = driver.findElement(By.xpath(ScrollBarXpath));

			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				Log.info("Not able to sleet in LClick : "
						+ e.getStackTrace().toString());
				ExtentLogs.info("Not able to sleet in LClick : "
						+ e.getStackTrace().toString());
			}
			while (!driver.findElement(By.xpath(EXpath)).isDisplayed() == true) {
				we2.click();
			}
		}
		System.out.println("Final xpath of the element is " + EXpath);
		driver.findElement(By.xpath(EXpath)).click();

	}

	/**
	 * Clear default text in the webelement field.
	 * @throws Exception 
	 */
	public static void Clear() throws Exception {
		SupportLib.waitForAjax();
		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		ActionElement.clear();
		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action Clear";
		ePassMessage = "Action Clear is performend on "
				+ Constant.TestCaseRow.get("Elementlocation");
		Log.pass(passMessage);
		ExtentLogs.Pass(ePassMessage);
	}

	/**
	 * Close the driver
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void Close() throws IOException, InterruptedException {
		Thread.sleep(5000);
		
	
		
		totalParameters = 0;
		listValues.clear();
		listAttributes.clear();
		nullCount.clear();
		ValuesCaptured.clear();
		valueSupportList2.clear();
		DateCapturedMultiple.clear();
		MultipleChannels.clear();
		ExcelValuesCaptured.clear();
		AllCompset.clear();
		ExcelValuesCaptured.clear();
		rateCaptured.clear();
		compsetRate.clear();
		// writing everything to document
		msg = "closing test case ";
		/*
		 * String msg = "Student Name : ${name} \n Student ID : ${id} ";
		 * TemplateMatcher matcher = new TemplateMatcher("${", "}");
		 */

		TestCaseRunner.emailBody.append(" <tr>");
		TestCaseRunner.emailBody.append("<td>"
				+ Constant.TestSuit.get("Testcaseid") + "</td>");
		TestCaseRunner.emailBody.append("<td>"
				+ ExtentLogs.extent.getRunStatus().toString().toUpperCase() + "</td>");
		TestCaseRunner.emailBody.append("<td>"
				+browser + "</td>");
				//Constant.TestSuit.get("Browser") + "</td>");
		TestCaseRunner.emailBody.append("<td>"
				+ Constant.TestSuit.get("Category") + "</td>");
		TestCaseRunner.emailBody.append("</tr>");

		Log.info(msg);
		ExtentLogs.Pass(msg);
		
		
		
		
		
		
		if (driver == null) {
			warningMessage = "Browser instance value is null";
			/*Log.warn(warningMessage);
			ExtentLogs.pass(infoMessage);*/

		} else {
			

			driver.close();
			driver=null;
			infoMessage = "Closing instance of Browser: " + browser;
			/*Log.info(infoMessage);
			ExtentLogs.pass(infoMessage);*/

		}
		Quit();
	}

	/**
	 * Not a Lib Function called by Test control function from test case runner
	 * file
	 * @throws IOException 
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void Quit() throws IOException {
		
		 
		try {
			if (driver != null) {
				warningMessage = " Browser instance is active";
				Log.warn(warningMessage);
				driver.close();
			} 
				
				//else {
				
			//
				Process KillTask;
				int retCode = 0;
				KillTask = Runtime.getRuntime().exec(
						"Taskkill /f /im chromedriver.exe");
				InputStream is = KillTask.getInputStream();
				while (retCode != -1) {
					retCode = is.read();
				}
				
				retCode = 0;
				KillTask = Runtime.getRuntime().exec(
						"Taskkill /f /im geckodriver.exe");
				is = KillTask.getInputStream();
				while (retCode != -1) {
					retCode = is.read();
				}
				 retCode = 0;
				KillTask = Runtime.getRuntime().exec(
						"Taskkill /f /im WerFault.exe");
				is = KillTask.getInputStream();
				while (retCode != -1) {
					retCode = is.read();
				}
				
				
				retCode = 0;
				KillTask = Runtime.getRuntime().exec(
						"Taskkill /f /im IEDriverserver.exe");
				is = KillTask.getInputStream();
				while (retCode != -1) {
					retCode = is.read();
				}
				retCode = 0;
				KillTask = Runtime.getRuntime().exec(
						"Taskkill /f /im  firefighter.exe");
				is = KillTask.getInputStream();
				while (retCode != -1) {
					retCode = is.read();
				}
				infoMessage = "Quiting all instance of Browser(Firefox)";
				Log.info(infoMessage);
				retCode = 0;
				KillTask = Runtime.getRuntime().exec(
						"Taskkill /f /im  chromeioum.exe");
				is = KillTask.getInputStream();
				while (retCode != -1) {
					retCode = is.read();
				}
				infoMessage = "Quiting all instance of Browser(Chrome)";
				Log.info(infoMessage);
				retCode = 0;
				KillTask = Runtime.getRuntime().exec(
						"Taskkill /f /im  iexploreworld.exe");
				is = KillTask.getInputStream();
				while (retCode != -1) {
					retCode = is.read();
				}
				infoMessage = "Quiting all instance of Browser(Internet explorer)";
				Log.info(infoMessage);
			//}

		} catch (Exception e) {
			Log.fatal("Error in quiting all the browser instance"
					+ e.toString());
		}
		
		
		
		
	}

	/**
	 * Will perform drag and drop action on a element Data field should contain
	 * X and Y location refer from the current location where current location
	 * is 0,0
	 * @throws Exception 
	 */
	public static void DragDrop() throws Exception {
		SupportLib.waitForAjax();

		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		Actions builder = new Actions(driver);
		// ActionElement.click();
		String XYloc = Constant.TestCaseRow.get("Data");
		String[] xandy = XYloc.split(",");
		int x = Integer.parseInt(xandy[0]);
		int y = Integer.parseInt(xandy[1]);
		builder.dragAndDropBy(ActionElement, x, y).build().perform();

		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Drag and Drop";
		eInfoMessage = "Action: Drag and Drop is performed on "
				+ Constant.TestCaseRow.get("Elementlocation") + "Based on data"
				+ Constant.TestCaseRow.get("Data");
		Log.info(infoMessage);
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * window switch functionality required Title of the window in the data
	 * field of test case
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void WindowSwitch() throws Exception, Throwable {
		Log.debug("ActionKeyword>Window Switch:Cleaning the element");
		ActiveFrameElement.clear();
		activeframe.clear();
		boolean Result = false;
		Log.debug("ActionKeyword>Window Switch: Window Wait time: ");
		if (Constant.WindowWait) {
			int i = 0;
			while (i < Constant.WindowwaitMaxDuration) {
				i++;
				Log.debug("ActionKeyword>Window Switch: Window Wait time" + i);
				Thread.sleep(1000);

				if (WindowHandle.size() < driver.getWindowHandles().size()) {
					break;
				} else {
					continue;
				}
			}
		} else {
			Log.debug("ActionKeyword>Window Switch: Window Wait timeDefault");
			Thread.sleep(3000);
		}
		String ElementFinderType = Constant.TestCaseRow
				.get("ElementFinderType");

		if (ElementFinderType.contains("URL")) {
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
				try {
					if (driver.getCurrentUrl().contains(
							Constant.TestCaseRow.get("Data"))) {
						((JavascriptExecutor) driver)
								.executeScript("window.focus()");
						driver.manage().window().maximize();
						Result = true;
						break;
					}

				} catch (Exception e) {
					continue;
				}
			}
		} else if (ElementFinderType.contains("Title")) {
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);

				if (driver.getTitle()
						.contains(Constant.TestCaseRow.get("Data"))) {
					((JavascriptExecutor) driver)
							.executeScript("window.focus()");
					driver.manage().window().maximize();
					Result = true;
					break;
				}
			}
		} else if (ElementFinderType.contains("Xpath")
				|| ElementFinderType.contains("CSS")
				|| ElementFinderType.contains("ID")) {
			Log.debug("ActionKeyword>Window Switch: Window switch based on Xpath ");
			int TempWait = Constant.ExplicitWait;
			Constant.ExplicitWait = 10;

			for (String winHandle : driver.getWindowHandles()) {
				Log.debug("ActionKeyword>Window Switch: Switch to handle "
						+ winHandle + "outof"
						+ driver.getWindowHandles().size());
				driver.switchTo().window(winHandle);
				ActionElement = FindElement();

				if (ActionElement != null) {
					Log.debug("ActionKeyword>Window Switch: Element found in the window");
					Result = true;
					break;
				} else {
					Log.debug("ActionKeyword>Window Switch: Continue with the loop");
					continue;

				}
			}
			Constant.ExplicitWait = TempWait;
		} else if (!Result) {
			Log.debug("ActionKeyword>Window Switch: Window switch with out any detail/previous fail");
			String[] handles = driver.getWindowHandles().toArray(new String[0]);
			Log.debug("ActionKeyword>Window Switch: Current window handles size is"
					+ handles.length);
			Log.debug("ActionKeyword>Window Switch: Stored window handles size is"
					+ WindowHandle.size());
			String newwindowHandle = "";

			if (browser.equalsIgnoreCase("IE")) {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_F5);
				robot.keyRelease(KeyEvent.VK_F5);
				robot.delay(1000);
			}
			for (String windowhandleloop : handles) {
				Log.debug("ActionKeyword>Window Switch: IN the loop checking for handle"
						+ windowhandleloop);
				for (String storedhandleloop : WindowHandle) {
					Log.debug("ActionKeyword>Window Switch: againext "
							+ storedhandleloop);
					if (windowhandleloop.equals(storedhandleloop)) {
						continue;
					} else {

						newwindowHandle = windowhandleloop;
						Log.debug("ActionKeyword>Window Switch: New Window Handle is saved as "
								+ newwindowHandle);
						break;
					}
				}
			}
			if (newwindowHandle != "") {
				Result = true;
				driver.switchTo().window(newwindowHandle);
				infoMessage = Constant.TestCaseRow.get("TestStepID")
						+ ": "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Action: Window Switch is performed latest available window in the window handlers ";
				Log.info(infoMessage);

			} else {
				Result = false;
				infoMessage = Constant.TestCaseRow.get("TestStepID")
						+ ": "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Action:No New window is identified on the screen based on the provded values/driver Handles";
				Log.info(infoMessage);
			}
		}

		driver.manage().timeouts()
				.implicitlyWait(Constant.ImplicitWait, TimeUnit.SECONDS);
		boolean update = true;
		if (Result) {

			for (String str : WindowHandle) {

				if (driver.getWindowHandle().equals(str)) {
					update = false;
					break;
				}
			}
			if (update) {
				WindowHandle.add(driver.getWindowHandle());
			}

			infoMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Action: Window Switch is performed to the Desired window, Window Handle is stored at index no: "
					+ WindowHandle.size();
			Log.info(infoMessage);
			ExtentLogs.info(infoMessage);
		} else {
			errorMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Action: Window Switch is not performed to the Desired window";
			Log.error(errorMessage);
			ExtentLogs.error(errorMessage);
		}

	}

	/**
	 * window switch functionality required Title of the window in the data
	 * field of test case
	 */
	public static void TabSwitch() {
		Robot robot;
		try {
			robot = new Robot();

			int i = Integer.parseInt(Constant.TestCaseRow.get("Data"));

			robot.keyPress(KeyEvent.VK_CONTROL);
			switch (i) {
			case 1:
				robot.keyPress(KeyEvent.VK_NUMPAD1);
				robot.keyRelease(KeyEvent.VK_NUMPAD1);
				break;
			case 2:
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				break;
			case 3:
				robot.keyPress(KeyEvent.VK_NUMPAD3);
				robot.keyRelease(KeyEvent.VK_NUMPAD3);
				break;
			case 4:
				robot.keyPress(KeyEvent.VK_NUMPAD4);
				robot.keyRelease(KeyEvent.VK_NUMPAD4);
				break;
			case 5:
				robot.keyPress(KeyEvent.VK_NUMPAD5);
				robot.keyRelease(KeyEvent.VK_NUMPAD5);
				break;
			case 6:
				robot.keyPress(KeyEvent.VK_NUMPAD6);
				robot.keyRelease(KeyEvent.VK_NUMPAD6);
				break;
			case 7:
				robot.keyPress(KeyEvent.VK_NUMPAD7);
				robot.keyRelease(KeyEvent.VK_NUMPAD7);
				break;
			case 8:
				robot.keyPress(KeyEvent.VK_NUMPAD8);
				robot.keyRelease(KeyEvent.VK_NUMPAD8);
				break;
			default:
				warningMessage = Constant.TestCaseRow.get("TestStepID")
						+ ": "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Action: Tab Switch will work only for tab 1 - 8 please enter int 1-8 in test data";
				Log.warn(warningMessage);

			}
			infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Action: Tab Switched";
			Log.info(infoMessage);
			eInfoMessage = "Action: Tab Switched is performed sucessfully";
			ExtentLogs.info(eInfoMessage);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(1000);

		} catch (AWTException e) {
			Log.error(e.getStackTrace().toString());
			ExtentLogs.error(e.getStackTrace().toString());
		}
	}

	/**
	 * Move the control to the frame whose name is defined in the element column
	 * @throws Exception 
	 */
	public static void FrameSwitch() throws Exception {
		SupportLib.waitForAjax();
		ActionElement = FindElement();

		driver.switchTo().frame(ActionElement);
		ActiveFrameElement.add(ActionElement);
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "Frame Switched";
		Log.info(infoMessage);
		eInfoMessage = "Frame is Switched sucessfully";
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * Use to scroll the page back according to driver history
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void Pageback() throws Exception {
		SupportLib.waitForAjax();

		driver.navigate().back();
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "Back Button is clicked";
		eInfoMessage = "Browser Page Back Button is clicked sucessfully";
		Log.info(infoMessage);
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * Move control back to default frame
	 * @throws Exception 
	 */
	public static void FrameDefault() throws Exception {
		SupportLib.waitForAjax();

		driver.switchTo().defaultContent();
		activeframe.clear();
		ActiveFrameElement.clear();
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Default Frame Switched";
		eInfoMessage = "Default Frame Switched";
		Log.info(infoMessage);
		ExtentLogs.info(eInfoMessage);

	}
	
	
	
	public void mySQL_Database() throws Exception
	{
		String ValueFromPage= "";
		String column=Constant.TestCaseRow.get("Data");
		String query = Constant.TestCaseRow.get("Elementlocation");
		//SalesForceOrderID.query2fetchorderID(column, query);
		
		ConnectToMySQL.readDataBase(query);
		
		
		if (ValueFromPage.contains("Post")) {
			ValueFromPage = ValueFromPage.trim();
			ValueFromPage = ValueFromPage.split(" ")[0];
		}
		ValueFromPage = ValueFromPage.trim();

		ValueCaptured.add(ValueFromPage);
		int size = ValueCaptured.size();
		size = size - 1;
		infoMessage =  Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		Log.info(infoMessage);
		eInfoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+  ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		ExtentLogs.info(eInfoMessage);
	
	}



	/**
	 * Will perform mouse hover and click action on the WebElement.
	 * @throws Exception 
	 */
	public static void MouseHoverClick() throws Exception {
		SupportLib.waitForAjax();

		if (browser.contains("Safari")) {
			Click();
			return;
		}

		if (browser.contains("DeviceWep")) {
			Touchpress();
			return;
		}

		if (browser.contains("IE")) {
			JMouseHover();
			Robot robot;
			try {
				robot = new Robot();

				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
			} catch (AWTException e) {
				Log.error(e.getStackTrace().toString());
				ExtentLogs.error(e.getStackTrace().toString());
			}
			return;
		}

		if (!(Constant.TestCaseRow.get("ActionSupportValue").contains("Blank"))
				|| !(Constant.TestCaseRow.get("Data").contains("Blank"))) {
			WebElementCollection = FindElements();

		} else {
			ActionElement = FindElement();
		}
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Mouse Hover and Clicked";

		Actions action = new Actions(driver);

		action.moveToElement(ActionElement).build().perform();
		action.moveToElement(ActionElement).click().build().perform();
		ePassMessage = "Action: Mouse Hover and Clicked is performed on Element"
				+ Constant.TestCaseRow.get("Elementlocation");
		ExtentLogs.Pass(ePassMessage);
		Log.pass(passMessage);

	}

	/**
	 * Perform Mouse Hover on the provided WebElement.
	 * @throws Exception 
	 */
	public static void MouseHover() throws Exception {
		SupportLib.waitForAjax();

		if (browser.contains("Safari")) {
			Click();
			return;
		}

		if (browser.contains("IE")) {
			JMouseHover();
		}
		if (!(Constant.TestCaseRow.get("ActionSupportValue").contains("Blank"))
				|| !(Constant.TestCaseRow.get("Data").contains("Blank"))) {
			WebElementCollection = FindElements();

			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			} else {
				ActionElement = SupportLib.SearhElement(WebElementCollection);
			}

		} else {
			ActionElement = FindElement();
		}
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		Locatable hoverItem = (Locatable) ActionElement;
		Mouse mouse = ((HasInputDevices) driver).getMouse();
		mouse.mouseMove(hoverItem.getCoordinates());

		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Mouse Hover";

		Actions action = new Actions(driver);

		action.moveToElement(ActionElement).build().perform();
		ePassMessage = "Action: Mouse Hover performed on Element"
				+ Constant.TestCaseRow.get("Elementlocation");
		ExtentLogs.Pass(ePassMessage);
		Log.pass(passMessage);

	}

	public static void MouseHoverIf() throws Exception {
		SupportLib.waitForAjax();

		if (browser.contains("Safari")) {
			Click();
			return;
		}

		if (browser.contains("IE")) {
			JMouseHover();
		}
		ActionElement = FindElement();

			if (ActionElement == null) {
				System.out.println("pass");
				
				skipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ ": Action Element is not present moving to next step";
				Log.skip(skipMessage);
				eSkipMessage = " Action Element"
						+ Constant.TestCaseRow.get("Elementlocation")
						+ " moving to next step";
				ExtentLogs.Skip(eSkipMessage);
				
				
				
			} 
		 else  {
			ActionElement = FindElement();
		

		Locatable hoverItem = (Locatable) ActionElement;
		Mouse mouse = ((HasInputDevices) driver).getMouse();
		mouse.mouseMove(hoverItem.getCoordinates());

		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Mouse Hover";

		Actions action = new Actions(driver);

		action.moveToElement(ActionElement).build().perform();
		ePassMessage =  Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Mouse Hover";
		ExtentLogs.Pass(ePassMessage);
		Log.pass(passMessage);

	}
	}

	public static void JMouseHover() throws Exception {
		SupportLib.waitForAjax();
		if (!(Constant.TestCaseRow.get("ActionSupportValue").contains("Blank"))
				|| !(Constant.TestCaseRow.get("Data").contains("Blank"))) {
			WebElementCollection = FindElements();

			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			} else {
				ActionElement = SupportLib.SearhElement(WebElementCollection);
			}

		} else {
			ActionElement = FindElement();
		}
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		Point p = ActionElement.getLocation();
		int x = p.getX();
		int y = p.getY();
		Dimension d = ActionElement.getSize();
		int h = d.getHeight();
		int w = d.getWidth();
		Robot robot;
		try {
			robot = new Robot();

			robot.mouseMove(x + (w / 2) + IEOffsetx, y + (h / 2) + IEOffsety
					- 46);
		} catch (AWTException e) {
			Log.error(e.getStackTrace().toString());
			ExtentLogs.error(e.getStackTrace().toString());
		}

		ePassMessage = "Action: jMouse Hover performed on Element"
				+ Constant.TestCaseRow.get("Elementlocation");
		ExtentLogs.Pass(ePassMessage);
		Log.pass(ePassMessage);

	}

	public static void Touchpress() throws Exception {
		SupportLib.waitForAjax();
		if (!(Constant.TestCaseRow.get("ActionSupportValue").contains("Blank"))
				|| !(Constant.TestCaseRow.get("Data").contains("Blank"))) {
			WebElementCollection = FindElements();

			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			} else {
				ActionElement = SupportLib.SearhElement(WebElementCollection);
			}

		} else {
			ActionElement = FindElement();
		}
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		TouchActions action = new TouchActions(driver);
		action.singleTap(ActionElement).build().perform();

		Log.pass(passMessage);
		ePassMessage = "Touch action is performed on Element"
				+ Constant.TestCaseRow.get("Elementlocation");
		ExtentLogs.Pass(ePassMessage);
		Locatable hoverItem = (Locatable) ActionElement;
		Mouse mouse = ((HasInputDevices) driver).getMouse();
		mouse.mouseMove(hoverItem.getCoordinates());

		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Mouse Hover";

	}

	/**
	 * Will perform mouse hover and double click action on the WebElement.
	 * @throws Exception 
	 */
	public static void MouseHoverdoubleClick() throws Exception {
		SupportLib.waitForAjax();

		if (browser.contains("IE")) {
			JMouseHover();
			Robot robot = new Robot();
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			return;
		}
		if (!(Constant.TestCaseRow.get("ActionSupportValue").contains("Blank"))
				|| !(Constant.TestCaseRow.get("Data").contains("Blank"))) {
			WebElementCollection = FindElements();
			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			} else {
				ActionElement = SupportLib.SearhElement(WebElementCollection);
			}

		} else {
			ActionElement = FindElement();
		}
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;

		}
		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Mouse Hover and Double Clicked";

		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;

		}
		Actions action = new Actions(driver);
		action.moveToElement(ActionElement).doubleClick().build().perform();
		Log.pass(passMessage);
		ePassMessage = "Action: Mouse Hover and double Clicked is performed on Element"
				+ Constant.TestCaseRow.get("Elementlocation");
		ExtentLogs.Pass(ePassMessage);

	}

	/**
	 * SubmitValue action on the Web Element Fields required: Action, Element
	 * locator type, Element Location Test data: Value to enter in the
	 * Web-Element
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void SubmitValue() throws Exception, Throwable {
		FileInputStream fis = new FileInputStream(Constant.configFileLoc);
		config.load(fis);
		SupportLib.waitForAjax();

		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		
		String data=Constant.TestCaseRow.get("Data");
		if(data.contains("config")){
			ActionElement.sendKeys(config.getProperty(data));
			
			

		}else
		ActionElement.sendKeys(Constant.TestCaseRow.get("Data"));
		
		
		String  dataCol= config.getProperty(data);

		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Submitted Value: "+"Value: "
				+ dataCol;
		Log.pass(passMessage);
		ePassMessage =
				
				"Date value  "+dataCol;
		ExtentLogs.Pass(ePassMessage);
	}

	/**
	 * SubmitIfValue action on the Web Element if Web Element is present on the
	 * page Fields required: Action, Element locator type, Element Location Test
	 * data: Value to enter in the Web-Element
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void SubmitIfValue() throws Exception, Throwable {
		SupportLib.waitForAjax();

		int buffervalue = Constant.ExplicitWait;
		Constant.ExplicitWait = Constant.ExplicitWaitif;
		ActionElement = FindElement();
		if (ActionElement == null) {
			skipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Action Element is not present moving to next step";
			Log.skip(skipMessage);
			eSkipMessage = " Action Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ " moving to next step";
			ExtentLogs.Skip(eSkipMessage);
		} else {
			ActionElement.sendKeys(Constant.TestCaseRow.get("Data"));
			infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Action Submit If";
			Constant.ExplicitWait = buffervalue;
			Log.info(infoMessage);
			eInfoMessage = "Action: User provided value is submitted in Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "Value: "
					+ Constant.TestCaseRow.get("Data");
			ExtentLogs.info(eInfoMessage);

		}
	}

	
	public static void WindowPopSubmitValueHandle() throws AWTException
	{
	
		//String text = "C:\\Users\\amit.singh\\Downloads\\CostUpdateFile.xlsx";
	    
		String data=Constant.TestCaseRow.get("Data");
		
		
		/*if(data.contains("config")){
			ActionElement.sendKeys(config.getProperty(data));
			
			

		}else
		ActionElement.sendKeys(Constant.TestCaseRow.get("Data"));
		
		
		//String  dataCol= config.getProperty(data);*/
		
		StringSelection stringSelection = new StringSelection(data);
	    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	    clipboard.setContents(stringSelection, stringSelection);
        
	    /*WebElement browsebtn = driver.findElement(By.xpath(".//*[@id='fileUpload']"));
	    
	    browsebtn.sendKeys(text);*/
	    Robot r = new Robot(); 
	    
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
	    
	    
		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription");
		Log.pass(passMessage);
		eInfoMessage = "Action: File path provided on the specified place";
		ExtentLogs.Pass(ePassMessage);
	
	}
	
	/**
	 * SubmitRandom Value action on the Web Element Fields required: Action,
	 * Element locator type, Element Location Test data: type of random value :
	 * A: alphabet value, N for numbers, AN for Alphanumeric and ANS is alpha
	 * numeric with special char. test data need to contain type of random value
	 * followed by : and length of the value i.e. A:4 will enter a 4 digit
	 * alphanumeric value
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void SubmitRandom() throws Exception, Throwable {
		SupportLib.waitForAjax();
		String test = null;
		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		if (!Constant.TestCaseRow.get("Data").contains(":")) {
			int arrayindex = Integer.parseInt(Constant.TestCaseRow.get("Data"));
			String Submitvalue = Valuestored.get(arrayindex);
			ActionElement.sendKeys(Submitvalue);
		} else {
			String[] valueTD = Constant.TestCaseRow.get("Data").split(":");

			int Lengthvalue = Integer.parseInt(valueTD[1]);

			if (valueTD[0].equalsIgnoreCase("A")) {
				test = SupportLib.RandomGenerator(Lengthvalue, 1);
			} else if (valueTD[0].equalsIgnoreCase("N")) {
				test = SupportLib.RandomGenerator(Lengthvalue, 2);
			} else if (valueTD[0].equalsIgnoreCase("AN")) {
				test = SupportLib.RandomGenerator(Lengthvalue, 3);
			} else if (valueTD[0].equalsIgnoreCase("ANS")) {
				test = SupportLib.RandomGenerator(Lengthvalue, 4);
			}
			ActionElement.sendKeys(test + Keys.TAB);
			Valuestored.add(test);
		}
		int size = Valuestored.size();
		size = size - 1;

		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Submit Random Value: " + test + "; "
				+ "Index No is" + size;
		Log.info(infoMessage);
		eInfoMessage = "Action: Random value is submitted in Element"
				+ Constant.TestCaseRow.get("Elementlocation") + "Value: "
				+ test;
		ExtentLogs.info(eInfoMessage);

	}

	/**
	 * explicit wait action on the Web Element Fields required: Action, Element
	 * locator type, Element Location Test data: N/A
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void ExplicitWait() throws Exception, Throwable {
		infoMessage = Constant.TestCaseRow.get("TestStepID")
				+ ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Waited for the specific element to be present on the screen";

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(Constant.TestCaseRow.get("Elementlocation"))));
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath(Constant.TestCaseRow.get("Elementlocation"))));
		Log.info(infoMessage);
		ExtentLogs
				.info(" Waited for the specific element to be present on the screen");
	}

	/**
	 * Manual Wait for the driver Fields required: Action, Element locator type,
	 * Element Location Test data: Duration of wait in the data field
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void ThreadWait() throws Exception, Throwable {
		if (Constant.ThreadWait) {
			infoMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Waited " + Constant.TestCaseRow.get("Data")
					+ " Milli seconds for Element";
			Log.info(infoMessage);
			eInfoMessage = "Waited " + Constant.TestCaseRow.get("Data")
					+ " Milli seconds for Element";
			ExtentLogs.info(eInfoMessage);
			int waitvalue = Integer.valueOf(Constant.TestCaseRow.get("Data"));
			Thread.sleep(waitvalue);

		} else {
			skipMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Not Waited " + Constant.TestCaseRow.get("Data")
					+ ": Milli seconds for Element; Manual Wait is disabled";

			int waitvalue = Integer.valueOf(Constant.TestCaseRow.get("Data"));
			Thread.sleep(waitvalue);
			Log.skip(skipMessage);
			eSkipMessage = "Not Waited " + Constant.TestCaseRow.get("Data")
					+ ": Milli seconds for Element; Manual Wait is disabled";

			ExtentLogs.Skip(eSkipMessage);
		}
	}

	/**
	 * Will select the required value form the dropdown where the option which
	 * need to select should be specified in Data column
	 */
	public static void DropDownSelect() throws Exception, Throwable {
		SupportLib.waitForAjax();
        ActionElement = FindElement();
        if (ActionElement == null) {
            NoSuchElementException e = new NoSuchElementException();
            throw e;
        }
        String data=Constant.TestCaseRow
        .get("Data");
        if(data.contains("config")){
            ActionElement.sendKeys(config.getProperty(data));
            
            new Select(ActionElement).selectByVisibleText(config.getProperty(data));

        }
        
        else if(data.contains("index")){
			int IndexNo = SupportLib.ExtractInt(Constant.TestCaseRow.get("Data"));

            new Select(ActionElement).selectByIndex(IndexNo);

        }
        else{
        
        new Select(ActionElement).selectByVisibleText(Constant.TestCaseRow
                .get("Data"));
        
        }
        
        
		String  dataCol= config.getProperty(data);
		
		System.out.println("in drop down  "+dataCol);

        infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
                + Constant.TestCaseRow.get("TeststepDescription")+"    "  +dataCol
                + "; Action: Drop Down Select";
        Log.info(infoMessage);

        eInfoMessage =  Constant.TestCaseRow.get("TeststepDescription")+" :  "+dataCol+"  Action: Dropdown selected";
        ExtentLogs.info(eInfoMessage);

	}
	/**
	 * Click on the specific element and capture the value from there to
	 * clipboard.
	 */
	public static void ClickCopyCapture() throws Exception, Throwable {
		SupportLib.waitForAjax();
		ActionElement = FindElement();

		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		SupportLib.clearClipboard();
		ActionElement.click();
		SupportLib.SelectAll();
		SupportLib.KeyboardCopy();
		ValueCaptured.add(SupportLib.CopyClipboard());
		int size = ValueCaptured.size();
		size = size - 1;
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Copy and store following value:" + ValueCaptured.get(size)
				+ "At index no: " + size;
		Log.info(infoMessage);
		eInfoMessage = "Copy and store following value:"
				+ ValueCaptured.get(size) + "using pattern: "
				+ Constant.TestCaseRow.get("Data") + "At index no: " + size;
		ExtentLogs.info(eInfoMessage);
	}

	public static void VerifyClickCopy() throws Exception, Throwable {
		SupportLib.waitForAjax();
		ActionElement = FindElement();
		String FromPage, Verification;
		boolean Result = false;
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		SupportLib.clearClipboard();

		ActionElement.click();
		SupportLib.SelectAll();
		SupportLib.KeyboardCopy();
		FromPage = SupportLib.CopyClipboard();

		if (Constant.TestCaseRow.get("Data").contains("Capture:")) {
			int IndexNo = 0;
			IndexNo = SupportLib.ExtractInt(Constant.TestCaseRow.get("Data"));
			Verification = ValueCaptured.get(IndexNo);
		} else {
			Verification = Constant.TestCaseRow.get("Data");
			if (Verification.contains("Blank")) {
				Verification = "";
			}
		}

		FromPage = FromPage.toLowerCase();
		Verification = Verification.toLowerCase();
		if (FromPage.contains(Verification)) {
			Result = true;
		} else {
			Result = false;
		}
		if (Result) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification + "; Present in Page values: "
					+ FromPage;

			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "Value:"
					+ Verification + "; Present in Page values: " + FromPage;
			ExtentLogs.Pass(ePassMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification
					+ "; is Not Present in Page values: " + FromPage;

			Log.fail(failMessage);

			eFailMessage = "Verification Failed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "Value:"
					+ Verification + ";is not Present in Page values: "
					+ FromPage;
			ExtentLogs.Fail(eFailMessage);

		}

	}

	
	public static void Slider() throws Exception, Throwable {
	    
	    SupportLib.waitForAjax();
	    ActionElement = FindElement();

	    if (ActionElement == null) {
	        NoSuchElementException e = new NoSuchElementException();
	        throw e;
	    }
	    
	      
	        Actions move = new Actions(driver);
	        move.dragAndDropBy(ActionElement, 30, 0).build().perform();
	        move.dragAndDropBy(ActionElement, 0, 50).build().perform();
	        
	        infoMessage = 
	                "slide  " ;
	        Log.info(infoMessage);
	        eInfoMessage =  "slide " ;

	        ExtentLogs.info(eInfoMessage);
	        
	        }
	
	
	
	
	
	/**
	 * Capture and stored value to use further in the script Fields required:
	 * Action, Element locator type, Element Location, Test data: N/A
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void ValueCapture() throws Exception, Throwable {
		SupportLib.waitForAjax();
		ActionElement = FindElement();
		String DataValue = Constant.TestCaseRow.get("Data");
		String ValueFromPage = "";
		String Leftlimit = "", RightLimit = "";
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		if (!DataValue.contains("Blank")) {
			if (DataValue.contains("^")) {
				Leftlimit = DataValue.split("\\^")[0];
				RightLimit = DataValue.split("\\^")[1];
				Leftlimit = Leftlimit.replace("&lt", "");
				RightLimit = RightLimit.replace("&rt", "");
			} else if (DataValue.contains("&lt")) {
				Leftlimit = DataValue.replace("&lt", "");
			} else {
				RightLimit = DataValue.replace("&rt", "");
			}
		}

		if (Constant.TestCaseRow.get("ActionSupportValue") == "Blank") {
			ValueFromPage = ActionElement.getText();
		} else {
			ValueFromPage = ActionElement.getAttribute(Constant.TestCaseRow
					.get("ActionSupportValue"));
		}

		if (Leftlimit != "") {
			Leftlimit = Leftlimit.trim();
			ValueFromPage = ValueFromPage.split(Leftlimit)[1];
		}
		if (RightLimit != "") {
			RightLimit = RightLimit.trim();
			ValueFromPage = ValueFromPage.split(RightLimit)[0];
			// ValueFromPage = ValueFromPage.split("\\(")[0];
		}
		if (ValueFromPage.contains("Post")) {
			ValueFromPage = ValueFromPage.trim();
			ValueFromPage = ValueFromPage.split(" ")[0];
		}
		ValueFromPage = ValueFromPage.trim();

		ValueCaptured.add(ValueFromPage);
		int size = ValueCaptured.size();
		size = size - 1;
		infoMessage =  Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		Log.info(infoMessage);
		eInfoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+  ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		ExtentLogs.info(eInfoMessage);

	}

	/**
	 * Capture and stored value to use further in the script Fields required:
	 * Action, Element locator type, Element Location, Test data: N/A
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void ValueCaptureIf() throws Exception, Throwable {
		SupportLib.waitForAjax();
		ActionElement = FindElement();
		boolean checkDefault=false;
		
		try{
			
			if ( ActionElement.getText()==null) {
				
				
				
				
				
				
			}
		}
		catch(Exception e){
			
			
			checkDefault=true;
			if (Constant.TestCaseRow.get("Parameter").contains("default")){
				int value = SupportLib.ExtractInt(Constant.TestCaseRow.get("Parameter"));

				ValueCaptured.add(value+"");
			}
			
		}
		if (ActionElement == null) {
			
			System.out.println("skip case ");
			
			
			skipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": No value present   moving to next step";
			Log.skip(skipMessage);
			eSkipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": No value present   moving to next step";
			ExtentLogs.Skip(eSkipMessage);
			
			
			
			
		}else if(checkDefault==false){
			ValueCaptureIfCheck=true;
		String DataValue = Constant.TestCaseRow.get("Data");
		String ValueFromPage = "";
		String Leftlimit = "", RightLimit = "";
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		if (!DataValue.contains("Blank")) {
			if (DataValue.contains("^")) {
				Leftlimit = DataValue.split("\\^")[0];
				RightLimit = DataValue.split("\\^")[1];
				Leftlimit = Leftlimit.replace("&lt", "");
				RightLimit = RightLimit.replace("&rt", "");
			} else if (DataValue.contains("&lt")) {
				Leftlimit = DataValue.replace("&lt", "");
			} else {
				RightLimit = DataValue.replace("&rt", "");
			}
		}

		if (Constant.TestCaseRow.get("ActionSupportValue") == "Blank") {
			ValueFromPage = ActionElement.getText();
		} else {
			ValueFromPage = ActionElement.getAttribute(Constant.TestCaseRow
					.get("ActionSupportValue"));
		}

		if (Leftlimit != "") {
			Leftlimit = Leftlimit.trim();
			ValueFromPage = ValueFromPage.split(Leftlimit)[1];
		}
		if (RightLimit != "") {
			RightLimit = RightLimit.trim();
			ValueFromPage = ValueFromPage.split(RightLimit)[0];
			// ValueFromPage = ValueFromPage.split("\\(")[0];
		}
		if (ValueFromPage.contains("Post")) {
			ValueFromPage = ValueFromPage.trim();
			ValueFromPage = ValueFromPage.split(" ")[0];
		}
		ValueFromPage = ValueFromPage.trim();

		ValueCaptured.add(ValueFromPage);
		int size = ValueCaptured.size();
		size = size - 1;
		infoMessage =Constant.TestCaseRow.get("TestStepID")
				+ ": " + Constant.TestCaseRow.get("TeststepDescription")+ ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		Log.info(infoMessage);
		eInfoMessage =Constant.TestCaseRow.get("TestStepID")
				+ ": " + Constant.TestCaseRow.get("TeststepDescription")+ ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		ExtentLogs.info(eInfoMessage);

	}
	}
	
	public static void RateCaptureIf() throws Exception, Throwable {
		SupportLib.waitForAjax();
		ActionElement = FindElement();
		boolean checkDefault=false;
		
		try{
			
			if ( ActionElement.getText()==null) {
				
				
				
				
				
				
			}
		}
		catch(Exception e){
			
			
			checkDefault=true;
			if (Constant.TestCaseRow.get("Parameter").contains("default")){
				int value = SupportLib.ExtractInt(Constant.TestCaseRow.get("Parameter"));

				rateCaptured.add(value+"");
			}
			
		}
		if (ActionElement == null) {
			
			System.out.println("skip case ");
			
			
			
			
		}else if(checkDefault==false){
			ValueCaptureIfCheck=true;
		String DataValue = Constant.TestCaseRow.get("Data");
		String ValueFromPage = "";
		String Leftlimit = "", RightLimit = "";
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		if (!DataValue.contains("Blank")) {
			if (DataValue.contains("^")) {
				Leftlimit = DataValue.split("\\^")[0];
				RightLimit = DataValue.split("\\^")[1];
				Leftlimit = Leftlimit.replace("&lt", "");
				RightLimit = RightLimit.replace("&rt", "");
			} else if (DataValue.contains("&lt")) {
				Leftlimit = DataValue.replace("&lt", "");
			} else {
				RightLimit = DataValue.replace("&rt", "");
			}
		}

		if (Constant.TestCaseRow.get("ActionSupportValue") == "Blank") {
			ValueFromPage = ActionElement.getText();
		} else {
			ValueFromPage = ActionElement.getAttribute(Constant.TestCaseRow
					.get("ActionSupportValue"));
		}

		if (Leftlimit != "") {
			Leftlimit = Leftlimit.trim();
			ValueFromPage = ValueFromPage.split(Leftlimit)[1];
		}
		if (RightLimit != "") {
			RightLimit = RightLimit.trim();
			ValueFromPage = ValueFromPage.split(RightLimit)[0];
			// ValueFromPage = ValueFromPage.split("\\(")[0];
		}
		if (ValueFromPage.contains("Post")) {
			ValueFromPage = ValueFromPage.trim();
			ValueFromPage = ValueFromPage.split(" ")[0];
		}
		ValueFromPage = ValueFromPage.trim();

		rateCaptured.add(ValueFromPage);
		int size = rateCaptured.size();
		size = size - 1;
		infoMessage =Constant.TestCaseRow.get("TestStepID")
				+ ": " + Constant.TestCaseRow.get("TeststepDescription")+ rateCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		Log.info(infoMessage);
		eInfoMessage =Constant.TestCaseRow.get("TestStepID")
				+ ": " + Constant.TestCaseRow.get("TeststepDescription")+ rateCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		ExtentLogs.info(eInfoMessage);

	}
	}
	
	
	/**
	 * Capture and stored value to use further in the script Fields required:
	 * Action, Element locator type, Element Location, Test data: N/A
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void RateCapture() throws Exception, Throwable {
		SupportLib.waitForAjax();
		ActionElement = FindElement();
		String DataValue = Constant.TestCaseRow.get("Data");
		String ValueFromPage = "";
		String Leftlimit = "", RightLimit = "";
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		if (!DataValue.contains("Blank")) {
			if (DataValue.contains("^")) {
				Leftlimit = DataValue.split("\\^")[0];
				RightLimit = DataValue.split("\\^")[1];
				Leftlimit = Leftlimit.replace("&lt", "");
				RightLimit = RightLimit.replace("&rt", "");
			} else if (DataValue.contains("&lt")) {
				Leftlimit = DataValue.replace("&lt", "");
			} else {
				RightLimit = DataValue.replace("&rt", "");
			}
		}

		if (Constant.TestCaseRow.get("ActionSupportValue") == "Blank") {
			ValueFromPage = ActionElement.getText();
		} else {
			ValueFromPage = ActionElement.getAttribute(Constant.TestCaseRow
					.get("ActionSupportValue"));
		}

		if (Leftlimit != "") {
			Leftlimit = Leftlimit.trim();
			ValueFromPage = ValueFromPage.split(Leftlimit)[1];
		}
		if (RightLimit != "") {
			RightLimit = RightLimit.trim();
			ValueFromPage = ValueFromPage.split(RightLimit)[0];
			// ValueFromPage = ValueFromPage.split("\\(")[0];
		}
		if (ValueFromPage.contains("Post")) {
			ValueFromPage = ValueFromPage.trim();
			ValueFromPage = ValueFromPage.split(" ")[0];
		}
		ValueFromPage = ValueFromPage.trim();

		rateCaptured.add(ValueFromPage);
		int size = rateCaptured.size();
		size = size - 1;
		infoMessage = Constant.TestCaseRow.get("TestStepID")
				+ ": " + Constant.TestCaseRow.get("TeststepDescription")+"     "+rateCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		Log.info(infoMessage);
		eInfoMessage = Constant.TestCaseRow.get("TestStepID")
				+ ": " + Constant.TestCaseRow.get("TeststepDescription")+"    "+rateCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		ExtentLogs.info(eInfoMessage);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Append captured value in the respective index(provided in Data column)
	 * and store value to use further in the script.
	 */
	public static void AppendValueCaptured() throws Exception, Throwable {
		SupportLib.waitForAjax();
		int IndexPosition;
		String ValuetoAppend = "";
		IndexPosition = Integer.parseInt(Constant.TestCaseRow.get("Data"));
		if (Constant.TestCaseRow.get("Elementlocation").contains("Blank")) {
			ValuetoAppend = Constant.TestCaseRow.get("ActionSupportValue");
		}

		else {
			ActionElement = FindElement();
			if (Constant.TestCaseRow.get("ActionSupportValue") == "Blank") {
				ValuetoAppend = ActionElement.getText();
			} else {
				ValuetoAppend = ActionElement.getAttribute(Constant.TestCaseRow
						.get("ActionSupportValue"));
			}
		}
		ValueCaptured.get(IndexPosition).concat(ValuetoAppend);
		infoMessage = "User specified value has been append at index"
				+ IndexPosition + "New Value is: "
				+ ValueCaptured.get(IndexPosition);
		Log.info(infoMessage);
		eInfoMessage = "User specified value has been append at index"
				+ IndexPosition + "New Value is: "
				+ ValueCaptured.get(IndexPosition);
		ExtentLogs.info(eInfoMessage);

	}

	/**
	 * Capture and stored value to use further in the script Fields required:
	 * Action, Element locator type, Element Location, Test data: N/A
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyCapture() throws Exception, Throwable {
		SupportLib.waitForAjax();
		int arrayindex = 0;
		List<String> FromPageList = new ArrayList<String>();
		String Verification, FromPage = "";
		boolean Result = false;
		WebElementCollection = FindElements();

		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			FromPageList = SupportLib.GetElementAttribute(WebElementCollection,
					Constant.TestCaseRow.get("ActionSupportValue"));
		} else {
			FromPageList = SupportLib.GetElementText(WebElementCollection);
		}
		arrayindex = Integer.parseInt(Constant.TestCaseRow.get("Data"));
		Verification = ValueCaptured.get(arrayindex);

		for (String FromPageValue : FromPageList) {
			FromPage = FromPage + FromPageValue + ", ";

			FromPageValue = FromPageValue.toLowerCase();
			Verification = Verification.toLowerCase();
			if (FromPageValue.contains(Verification)) {
				Result = true;

			} else {
				Result = false;
				break;
			}
		}

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + Verification
					+ "; Value form page: " + FromPage;
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+"From page value  "+ FromPage
					+ "; Against verification value: " + Verification;
			ExtentLogs.Pass(ePassMessage);

		}

		else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + Verification
					+ "; Value form page: " + FromPage;
			Log.fail(failMessage);
			eFailMessage = "Verification Failed for Element"
					+Constant.TestCaseRow.get("TeststepDescription") + FromPage
					+ "; Againest verification value: " + Verification;
			ExtentLogs.Fail(eFailMessage);

		}

	}

	// this function verify captured value with captured value
	
	// in case of date we need to write date in the actionsupport
	public static void VerifyCapturewithCapture() throws Exception, Throwable {

		int arrayindex = 0;
		boolean Result = false;
		String Verification1, Verification2;
		arrayindex = Integer.parseInt(Constant.TestCaseRow.get("Data").split(
				",")[0]);
		
		if(Constant.TestCaseRow.get("ActionSupportValue").equalsIgnoreCase("date"))
			Verification1 = DateCaptured.get(arrayindex).toString();
		else
		Verification1 = ValueCaptured.get(arrayindex);
		
		arrayindex = Integer.parseInt(Constant.TestCaseRow.get("Data").split(",")[1]);
		
		
		if(Constant.TestCaseRow.get("ActionSupportValue").equalsIgnoreCase("date"))
			Verification2 = DateCaptured.get(arrayindex).toString();
		else
		Verification2 = ValueCaptured.get(arrayindex);

		Verification1 = Verification1.toLowerCase();
		Verification2 = Verification2.toLowerCase();
		
		// this is used to verify that both the captured values should not be same.
		if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank") && Constant.TestCaseRow.get("ActionSupportValue").equalsIgnoreCase("FALSE")) {
			
			if(!Verification1.contains(Verification2))
				Result = true;

		 else 
			Result = false;
			
		}
		
		else if (Verification1.contains(Verification2)
				|| Verification2.contains(Verification1)) {
			Result = true;

		} else {
			Result = false;
		}

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription ")
					+ "; Captured text1: " + Verification1
					+ "; Captured text2: " + Verification2;
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("TeststepDescription ")
					+ "; Captured text1: " + Verification1
					+ "; Captured text2: " + Verification2;
			ExtentLogs.Pass(ePassMessage);

		}

		else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text1: " + Verification1
					+ "; Captured text2: " + Verification2;
			Log.fail(failMessage);
			eFailMessage = "Verification Failed for Element"
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text1: " + Verification1
					+ "; Captured text2: " + Verification2;
			ExtentLogs.Fail(eFailMessage);

		}

	}
	
	

	// this function verify captured value with captured value
	
	// in case of date we need to write date in the actionsupport
	public static void VerifyCapturewithCaptureIf() throws Exception, Throwable {
		if(ValueCaptureIfCheck==true)
		{
		int arrayindex = 0;
		boolean Result = false;
		String Verification1, Verification2;
		arrayindex = Integer.parseInt(Constant.TestCaseRow.get("Data").split(
				",")[0]);
		
		if(Constant.TestCaseRow.get("ActionSupportValue").equalsIgnoreCase("date"))
			Verification1 = DateCaptured.get(arrayindex).toString();
		else
		Verification1 = ValueCaptured.get(arrayindex);
		
		arrayindex = Integer.parseInt(Constant.TestCaseRow.get("Data").split(",")[1]);
		
		
		if(Constant.TestCaseRow.get("ActionSupportValue").equalsIgnoreCase("date"))
			Verification2 = DateCaptured.get(arrayindex).toString();
		else
		Verification2 = ValueCaptured.get(arrayindex);

		Verification1 = Verification1.toLowerCase();
		Verification2 = Verification2.toLowerCase();
		
		// this is used to verify that both the captured values should not be same.
		if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank") && Constant.TestCaseRow.get("ActionSupportValue").equalsIgnoreCase("FALSE")) {
			
			if(!Verification1.contains(Verification2))
				Result = true;

		 else 
			Result = false;
			
		}
		
		else if (Verification1.contains(Verification2)
				|| Verification2.contains(Verification1)) {
			Result = true;

		} else {
			Result = false;
		}

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text1: " + Verification1
					+ "; Captured text2: " + Verification2;
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text1: " + Verification1
					+ "; Captured text2: " + Verification2;
			ExtentLogs.Pass(ePassMessage);

		}

		else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text1: " + Verification1
					+ "; Captured text2: " + Verification2;
			Log.fail(failMessage);
			eFailMessage = "Verification Failed for Element"
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text1: " + Verification1
					+ "; Captured text2: " + Verification2;
			ExtentLogs.Fail(eFailMessage);

		}
		}else{
			System.out.println("skip case: VerifyCapturewithCaptureIf");
			
			
			skipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ":  Element is not present moving to next step";
			Log.skip(skipMessage);
			eSkipMessage = " Action Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ " moving to next step";
			ExtentLogs.Skip(eSkipMessage);
		}
	}

	/**
	 * Submit stored value to the web element: Action, Element locator type,
	 * Element Location, Test data: Index of capture value
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void SubmitCapture() throws Exception, Throwable {
		SupportLib.waitForAjax();
		List<String> IndexArray = new ArrayList<String>();
		List<String> ValueArray = new ArrayList<String>();
		String FinalValue = "";
		int arrayindex = 0;

		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		StringTokenizer st = new StringTokenizer(
				Constant.TestCaseRow.get("Data"), ",");

		while (st.hasMoreTokens()) {
			IndexArray.add(st.nextToken());
		}
		for (String s : IndexArray) {
			arrayindex = Integer.parseInt(s);
			ValueArray.add(ValueCaptured.get(arrayindex));
		}

		for (String value : ValueArray) {
			FinalValue = FinalValue + value;
			if (!Constant.TestCaseRow.get("ActionSupportValue").contains(
					"Blank")) {
				FinalValue = FinalValue
						+ Constant.TestCaseRow.get("ActionSupportValue");
			} else {
				continue;
			}
		}

		ActionElement.sendKeys(FinalValue);

		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Submited stored value";
		Log.info(infoMessage);
		eInfoMessage = "Captured value is submitted for Element"
				+ Constant.TestCaseRow.get("Elementlocation") + "; Value: "
				+ ValueCaptured.get(arrayindex);
		ExtentLogs.info(eInfoMessage);

	}

	public static void SubmitDBCapture() throws Exception, Throwable {
		if (Constant.SubmitDBCaptureLagTime) {
			Thread.sleep(Constant.SubmitDBCaptureLagTimeduration);
		}

		boolean ColumnExist = false;
		String DBColumn, FromDB = "";
		String query = Constant.TestCaseRow.get("Elementlocation");
		List<String> columnNames = new ArrayList<String>();
		DBColumn = Constant.TestCaseRow.get("ActionSupportValue");

		DatabaseUtil dbUtil = new DatabaseUtil();
		ResultSet resultSet = dbUtil.executeQuery(query);

		if (Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			infoMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";Column Name is not provided, Please provide column name in ActionSupportValue";
			Log.info(infoMessage);
			eInfoMessage = "Column Name is not provided, Please provide column name in ActionSupportValue"
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.info(eInfoMessage);

		}

		ResultSetMetaData columns = resultSet.getMetaData();
		int i = 0;
		while (i < columns.getColumnCount()) {
			i++;
			columnNames.add(columns.getColumnName(i));
		}
		for (String culumn_name : columnNames) {
			if (culumn_name.equalsIgnoreCase(DBColumn)) {
				ColumnExist = true;
				break;
			} else {
				continue;
			}
		}

		if (!ColumnExist) {
			errorMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";Correct Column Name is not provided, Please provide column name in ActionSupportValue";
			Log.error(errorMessage);
			eErrorMessage = "Column Name is not provided, Please provide column name in ActionSupportValue"
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.error(eErrorMessage);
		}

		resultSet.beforeFirst();
		while (resultSet.next()) {
			FromDB = resultSet.getString(DBColumn);

			break;
		}
		dbUtil.CloseDB();
		ValueCaptured.add(FromDB);
		int size = ValueCaptured.size();
		size = size - 1;
		infoMessage = ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		Log.info(infoMessage);
		eInfoMessage = ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * Capture screenshot and save it for verification purpose.
	 */
	public static void CaptureScreen() throws Exception, Throwable {
		SupportLib.waitForAjax();
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(Constant.screenshotloc
				+ Constant.TestSuit.get("Testcaseid") + "_"
				+ Constant.TestCaseRow.get("TestStepID") + ".jpg");
		FileUtils.copyFile(scrFile, targetFile);

		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Capture screen";
		Log.info(infoMessage);
		eInfoMessage = "Screenshot is Captured ";
		ExtentLogs.info(eInfoMessage);

	}

	/**
	 * Used for capturing screenshots.
	 */
	public static String ErrorCaptureScreen() throws Exception, Throwable {
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Error capture screen";
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(Constant.screenshotloc + "Error_"
				+ Constant.TestSuit.get("Testcaseid") + "_"
				+ Constant.TestCaseRow.get("TestStepID") + ".png");
		FileUtils.copyFile(scrFile, targetFile);
		String location = Constant.screenshotloc
				+ Constant.TestSuit.get("Testcaseid") + "_"
				+ Constant.TestCaseRow.get("TestStepID") + ".png";
		return location;
	}

	/**
	 * URL navigation on the Driver Fields required: Action, Element Location as
	 * URL Test data: N/A
	 * 
	 * @throws Throwable
	 */
	public static void OpenURL() throws Throwable {
		
		
		if (browser.equalsIgnoreCase("Api")) {
			
			System.out.println("api test case");
		}
		if (browser.equalsIgnoreCase("chrome")||  (browser.equalsIgnoreCase("firefox"))){
		try{
		String dataValue = Constant.TestCaseRow.get("Data");
		if (dataValue != null && dataValue != ""
				&& !dataValue.contains("Blank")) {
			driver.get(ValueCaptured.get(Integer.parseInt(dataValue)));
		} else {
			if (Constant.TestCaseRow.get("ElementFinderType").equalsIgnoreCase(
					"Objectrep")) 
			{
				
				String locstr=Constant.TestCaseRow.get("Elementlocation");
				System.out.println("loc in open url is    "+locstr);
				
				String objrepstr=Constant.ObjrepLoc.get(locstr);
				System.out.println("url in open url method  "+objrepstr);
				
				/*driver.navigate().to(Constant.ObjrepLoc.get(Constant.TestCaseRow
						.get("Elementlocation")));*/
				
				
				driver.navigate().to(objrepstr);
				
				
				
			} else {
				
				System.out.println("driver value is "+driver);
				String urlopen=Constant.TestCaseRow.get("Elementlocation");
				
				System.out.println("url is     -----"+urlopen);
/*				driver.get(Constant.TestCaseRow.get("Elementlocation"));
 * 
*/
			driver.navigate().to(urlopen);	
			
			}
		}

		if (browser.contains("Safari")) {
			driver.navigate().refresh();
		}
		
		
		
  	   Thread.sleep(2000);	 

		JavascriptExecutor js= (JavascriptExecutor)driver;
        while(true){
     	   Thread.sleep(2000);	 
     	   System.out.println(" we are in js executer");

        if(js.executeScript("return document.readyState").equals("complete")){
        	
        	System.out.println("we are in complete state");
     	   break;
        }
        else{
     	   System.out.println("refresh");
     	   
     	   driver.navigate().refresh();
     	   
     	  
        }
        }
		
		//SupportLib.waitForPageLoad(driver);
		
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: open URL";
		// System.out.println(driver.getPageSource());
		Log.info(infoMessage);
		ePassMessage = "open URL sucessfully" + driver.getCurrentUrl();
		ExtentLogs.Pass(ePassMessage);
		WindowHandle.add(driver.getWindowHandle());
		
		}catch(Exception e){
			e.printStackTrace();
			
			System.out.println("driver is not loaded");
			refresh();
	     	   Thread.sleep(2000);	 

			JavascriptExecutor js= (JavascriptExecutor)driver;

	        if(js.executeScript("return document.readyState").equals("complete")){
	        	
	        	System.out.println("we are in complete state");
	        }
	        else{
	     	   System.out.println("refresh");
	     	  driver.close();
	     	 //  driver.navigate().refresh();
	     	   
	     	  
	        }
			
			
			
			
			
		}
		}
		else if(browser.equalsIgnoreCase("IE")){
			String urlopen=Constant.TestCaseRow.get("Elementlocation");
			
			System.out.println("url is     -----"+urlopen);

		driver.navigate().to(urlopen);	
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	////////////////////
	
	
	
	
public static void OpenGivenURL() throws Exception  {
	
	
		
		if (browser.equalsIgnoreCase("chrome")||  (browser.equalsIgnoreCase("firefox"))){
			try{
		String dataValue = Constant.TestCaseRow.get("Data");
		
	if (dataValue != null && dataValue != "" && !dataValue.contains("Blank")) {
			driver.get(ValueCaptured.get(Integer.parseInt(dataValue)));
		} else {
			if (Constant.TestCaseRow.get("ElementFinderType").equalsIgnoreCase("Objectrep")) 
			{
				
				String locstr=Constant.TestCaseRow.get("Elementlocation");
				System.out.println("loc in open given url is    "+locstr);
				
				String objrepstr=Constant.ObjrepLoc.get(locstr);
				System.out.println("url in open url method  "+objrepstr);
				
			
				try{
				driver.navigate().to(objrepstr);
				}
				catch(Exception e){
					Thread.sleep(2000);	 

					JavascriptExecutor js= (JavascriptExecutor)driver;
			        while(true){
			     	   Thread.sleep(2000);	 
			     	   System.out.println(" we are in js executer");

			     	   
			     	   try{
			     		   
			     		   if(js.executeScript("return document.readyState").equals("complete"));
			     	   }
			     	   catch(Exception ee){
							Thread.sleep(2000);	 
								System.out.println("refresh which not concern about ready state");
			     		  driver.navigate().refresh();
			     	   }
			     	   
			     	   
			     	   
			        if(js.executeScript("return document.readyState").equals("complete")){
			        	
			        	System.out.println(" complete state successfull");
			     	   break;
			        }
			        else{
			     	   System.out.println("refresh");
			     	   
			     	   driver.navigate().refresh();
			     	   
			     	  
			        }
				}
				
				
				
			} 
			}else {
				
				System.out.println("driver name is "+driver);
				String urlopen=Constant.TestCaseRow.get("Elementlocation");
				
				System.out.println("url is    "+urlopen);
try{
				driver.navigate().to(urlopen);	
}
catch(Exception e){
	
	

	Thread.sleep(2000);	 

	JavascriptExecutor js= (JavascriptExecutor)driver;
    while(true){
 	   Thread.sleep(2000);	 
 	   System.out.println(" we are in js executer");

 	   
 	   try{
 		   
 		   if(js.executeScript("return document.readyState").equals("complete"));
 	   }
 	   catch(Exception ee){
			Thread.sleep(2000);	 
				System.out.println("refresh which not concern about ready state");
 		  driver.navigate().refresh();
 	   }
 	   
 	   
 	   
    if(js.executeScript("return document.readyState").equals("complete")){
    	
    	System.out.println(" complete state successfull");
 	   break;
    }
    else{
 	   System.out.println("refresh");
 	   
 	   driver.navigate().refresh();
 	   
 	  
    }
}




}

			}
		}

		
		
		
		
  	   
        
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: open URL";
		
		Log.info(infoMessage);
		ePassMessage = "open URL sucessfully" + driver.getCurrentUrl();
		ExtentLogs.Pass(ePassMessage);
		WindowHandle.add(driver.getWindowHandle());
		
		
}
			catch(Exception e){
				
				System.out.println("error in loading browser------------- close browser and move further");
				 driver.close();
			}
			}
		else if(browser.equalsIgnoreCase("IE")){
			if (Constant.TestCaseRow.get("ElementFinderType").equalsIgnoreCase("Objectrep")) 
			{
				
				String locstr=Constant.TestCaseRow.get("Elementlocation");
				System.out.println("loc in open given url is    "+locstr);
				
				String objrepstr=Constant.ObjrepLoc.get(locstr);
				System.out.println("url in open url method  "+objrepstr);
				
			
				try{
				driver.navigate().to(objrepstr);
				}
				catch(Exception e){
					Thread.sleep(2000);	 

					JavascriptExecutor js= (JavascriptExecutor)driver;
			        while(true){
			     	   Thread.sleep(2000);	 
			     	   System.out.println(" we are in js executer");

			     	   
			     	   try{
			     		   
			     		   if(js.executeScript("return document.readyState").equals("complete"));
			     	   }
			     	   catch(Exception ee){
							Thread.sleep(2000);	 
								System.out.println("refresh which not concern about ready state");
			     		  driver.navigate().refresh();
			     	   }
			     	   
			     	   
			     	   
			        if(js.executeScript("return document.readyState").equals("complete")){
			        	
			        	System.out.println(" complete state successfull");
			     	   break;
			        }
			        else{
			     	   System.out.println("refresh");
			     	   
			     	   driver.navigate().refresh();
			     	   
			     	  
			        }
				}
				
				
				
			} 
			}else {
				
				System.out.println("driver name is "+driver);
				String urlopen=Constant.TestCaseRow.get("Elementlocation");
				
				System.out.println("url is    "+urlopen);
		}}
		else if(browser.equalsIgnoreCase("html")){
			
			System.out.println("open url html");
			System.out.println(driver);
			
			
			String locstr=Constant.TestCaseRow.get("Elementlocation");
			System.out.println("loc in open given url is    "+locstr);
			
			String objrepstr=Constant.ObjrepLoc.get(locstr);
			System.out.println("url in open url method  "+objrepstr);
			
		
			try{
				
				System.out.println(objrepstr);
				
			driver.navigate().to(objrepstr);
			
			Thread.sleep(5000);
			}
			catch(Exception e){
				System.out.println("open url html exception");

			}
			
			
		}
		
}

	
	
	///////////////////
	public static void OpenNewtab() throws Exception, Throwable {
		driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL, "t");
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: open NewTab";
		Log.info(infoMessage);
		ePassMessage = "New Tab open sucessfully" + driver.getCurrentUrl();
		ExtentLogs.Pass(ePassMessage);
		WindowHandle.add(driver.getWindowHandle());
	}

	/**
	 * Move control to Alert box and accept it with alert message in the log
	 */
	public static void Alert() throws Exception, Throwable {
		// SupportLib.waitForAjax();
		if (Constant.WaitforAlert) {
			new WebDriverWait(driver, Constant.Alertwait)
					.until(ExpectedConditions.alertIsPresent());
		}
		Alert alert = driver.switchTo().alert();
		String Alertmessage = alert.getText();
		alert.accept();
		infoMessage = "Alert detected: {}" + Alertmessage;
		Log.info(infoMessage);
		eInfoMessage = "Alert detected: {}" + Alertmessage;
		ExtentLogs.info(eInfoMessage);
	}

	public static void Alertif() throws Exception, Throwable {
		// SupportLib.waitForAjax();
		try {
			Alert alert = driver.switchTo().alert();
			String Alertmessage = alert.getText();
			alert.accept();
			infoMessage = "Alert detected: {}" + Alertmessage;
			Log.info(infoMessage);
			eInfoMessage = "Alert detected: {}" + Alertmessage;
			ExtentLogs.info(eInfoMessage);
		} catch (Exception e) {
			infoMessage = "Alert is not detected on the page";
			Log.info(infoMessage);
			eInfoMessage = "Alert is not detected on the page";
			ExtentLogs.info(eInfoMessage);
		}

	}

	
	
	public static void BrowserAuthPopUp() throws AWTException, InterruptedException
	{
		//Enter user name by ctrl-v
				
		StringSelection username = new StringSelection("pure-ipandit");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);
		
		Robot rb = new Robot();
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);

		//tab to password entry field
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		//Enter password by ctrl-v
		
		StringSelection password = new StringSelection("Pure@1234567");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(password, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		

		//press enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription");
		Log.pass(passMessage);
		eInfoMessage = "Action: User credentials are provided in the browser authentication pop up";
		ExtentLogs.Pass(ePassMessage);
	}
	
	
	
	
	/**
	 * Move control to Alert box and reject it with alert message in the log
	 */
	public static void AlertRejected() throws Exception, Throwable {

		// SupportLib.waitForAjax();
		if (Constant.WaitforAlert) {
			new WebDriverWait(driver, Constant.Alertwait)
					.until(ExpectedConditions.alertIsPresent());
		}
		Alert alert = driver.switchTo().alert();
		String Alertmessage = alert.getText();

		alert.dismiss();
		infoMessage = "Alert Rejected: {}" + Alertmessage;
		Log.info(infoMessage);
		eInfoMessage = "Alert Rejected: {}" + Alertmessage;
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * Move control to Alert box and dismiss it with alert message in the log
	 */
	public static void AlertSubmit() throws Exception, Throwable {
		// SupportLib.waitForAjax();

		if (Constant.WaitforAlert) {
			new WebDriverWait(driver, Constant.Alertwait)
					.until(ExpectedConditions.alertIsPresent());
		}
		Alert alert = driver.switchTo().alert();
		String Alertmessage = alert.getText();

		alert.dismiss();
		infoMessage = "Alert Rejected: {}" + Alertmessage;
		Log.info(infoMessage);
		eInfoMessage = "Alert Rejected: {}" + Alertmessage;
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * Match the Data(Yes) column value, with the alert message and print in
	 * log.
	 */
	public static void AlertVerify() throws Exception, Throwable {
		boolean Result = false;
		// SupportLib.waitForAjax();
		Alert alert = driver.switchTo().alert();
		String AlertMessage = alert.getText();
		alert.accept();
		String Verification = Constant.TestCaseRow.get("Data");
		if (AlertMessage.contains(Verification)) {
			Result = true;
		} else {
			Result = false;
		}
		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification
					+ "; Present in Alert message values: " + AlertMessage;
			Log.pass(passMessage);

			ePassMessage = "Expected values are Present in Alert message: "
					+ AlertMessage;
			ExtentLogs.Pass(ePassMessage);
		} else {
			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification
					+ "; is Not Present in Alert message values: "
					+ AlertMessage;
			Log.fail(failMessage);
			eFailMessage = "Expected values are not Present in Alert message: "
					+ AlertMessage;
			ExtentLogs.Fail(eFailMessage);
		}

	}

	/**
	 * Close the driver
	 */
	public static void CloseWindow() throws Exception, Throwable {
		driver.close();
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Close window";
		Log.info(infoMessage);
		eInfoMessage = " Closed active window";
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * Lib Function which can be used to refresh the page required:Action item
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void refresh() throws Exception, Throwable {
		SupportLib.waitForAjax();
		driver.navigate().refresh();
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Refresh Active window";
		Log.info(infoMessage);
		eInfoMessage = " Active Window refresh button is pressed";
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * Function which can be modified to test all the function Test data: TBD
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void TESTFUN() throws Exception, Throwable {

	}

	/**
	 * Need to provide java script for execution in the Element column
	 */
	public static void JavaScript() throws Exception, Throwable {
		SupportLib.waitForAjax();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Constant.TestCaseRow.get("Elementlocation"));
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Java Script is executed";
		Log.info(infoMessage);
		eInfoMessage = " Action: Java Script is executed";
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * Function to execute Sikuli scripts can be used for Non Identified
	 * elements Fields required:Action, Element Location as Sikuli IDE location
	 * Test data: N/A
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void sikuli() throws Exception, Throwable {

		java.lang.ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/C",
				Constant.SikuliIDE, "-r",
				Constant.TestCaseRow.get("Elementlocation"));
		java.lang.Process p = pb.start();

		String line;
		BufferedReader r = new BufferedReader(new InputStreamReader(
				p.getInputStream()));
		while ((line = r.readLine()) != null) {
			failMessage = line;
			if (line.contains("error")) {
				SupportLib.createScreenshot();
				throw new Exception("Sikuli script Fail");

			}
			Log.fail(failMessage);
			eFailMessage = line;
			ExtentLogs.Fail(eFailMessage);
		}

		p.destroy();
		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Sikuli Script Executed";
		Log.pass(infoMessage);
		ePassMessage = " Action: Sikuli Script Executed";
		ExtentLogs.Pass(ePassMessage);

	}

	/**
	 * Function to verify text of web element Fields required:Action, Element
	 * Location Test data: Verification value for the text
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyText() throws Exception, Throwable {
		SupportLib.waitForAjax();
		List<String> FromPageList = new ArrayList<String>();
		String Verification, FromPage = "";
		boolean Result = false;
		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		FromPageList = SupportLib.GetElementText(WebElementCollection);
		Verification = Constant.TestCaseRow.get("Data");

		String VerificationSecond = "";
		if (Verification.contains("&&&&")) {
			VerificationSecond = Verification.split("&&&&")[1].trim();

			for (String FromPageValue : FromPageList) {
				FromPage = FromPage + FromPageValue + ", ";

				FromPageValue = FromPageValue.toLowerCase();
				Verification = Verification.toLowerCase();
				if (FromPageValue.contains(Verification)
						&& FromPageValue.contains(VerificationSecond)) {
					Result = true;
				} else {
					Result = false;
					break;
				}
			}
		} else {
			for (String FromPageValue : FromPageList) {
				FromPage = FromPage + FromPageValue + ", ";

				FromPageValue = FromPageValue.toLowerCase();
				Verification = Verification.toLowerCase();
				if (FromPageValue.contains(Verification)) {
					Result = true;
				} else {
					Result = false;
					break;
				}
			}
		}

		if (Result) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification + "; Present in Page values: "
					+ FromPage;

			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "Value:"
					+ Verification + "; Present in Page values: " + FromPage;
			ExtentLogs.Pass(ePassMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification
					+ "; is Not Present in Page values: " + FromPage;

			Log.fail(failMessage);

			eFailMessage = "Verification Failed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "Value:"
					+ Verification + ";is not Present in Page values: "
					+ FromPage;
			ExtentLogs.Fail(eFailMessage);

		}

	}

	public static void VerifyDropDown() throws Exception, Throwable {
		SupportLib.waitForAjax();
		List<String> FromPageList = new ArrayList<String>();
		String Verification, FromPage = "";
		boolean Result = false;
		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		FromPageList = SupportLib.GetElementText(WebElementCollection);
		Verification = Constant.TestCaseRow.get("Data");

		String VerificationSecond = "";
		if (Verification.contains("&&&&")) {
			VerificationSecond = Verification.split("&&&&")[1].trim();

			for (String FromPageValue : FromPageList) {
				FromPage = FromPage + FromPageValue + ", ";

				FromPageValue = FromPageValue.toLowerCase();
				Verification = Verification.toLowerCase();
				if (FromPageValue.contains(Verification)
						&& FromPageValue.contains(VerificationSecond)) {
					Result = true;
				} else {
					Result = false;
					break;
				}
			}
		} else {
			for (String FromPageValue : FromPageList) {
				FromPage = FromPage + FromPageValue + ", ";

				FromPageValue = FromPageValue.toLowerCase();
				Verification = Verification.toLowerCase();
				if (FromPageValue.contains(Verification)) {
					Result = true;
				} else {
					Result = false;
					break;
				}
			}
		}

		if (Result) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification + "; Present in Page values: "
					+ FromPage;

			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "Value:"
					+ Verification + "; Present in Page values: " + FromPage;
			ExtentLogs.Pass(ePassMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification
					+ "; is Not Present in Page values: " + FromPage;

			Log.fail(failMessage);

			eFailMessage = "Verification Failed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "Value:"
					+ Verification + ";is not Present in Page values: "
					+ FromPage;
			ExtentLogs.Fail(eFailMessage);

		}

	}

	public static void VerifySingleText() throws Exception, Throwable {

		SupportLib.waitForAjax();
		List<String> FromPageList = new ArrayList<String>();
		String Verification, FromPage = "";
		boolean Result = false;
		WebElementCollection = FindElements();

		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			FromPageList = SupportLib.GetElementAttribute(WebElementCollection,
					Constant.TestCaseRow.get("ActionSupportValue"));
		} else {
			FromPageList = SupportLib.GetElementText(WebElementCollection);
		}
		Verification = Constant.TestCaseRow.get("Data");

		if (Verification.contains("Capture:")) {
			int i = SupportLib.ExtractInt(Verification);
			Verification = ValueCaptured.get(i);
		}
		for (String FromPageValue : FromPageList) {
			FromPage = FromPage + FromPageValue + ", ";

			FromPageValue = FromPageValue.toLowerCase();
			Verification = Verification.toLowerCase();
			if (FromPageValue.contains(Verification)) {
				Result = true;
				break;

			}
		}

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + Verification
					+ "; is present in List form page: " + FromPage;
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element list"
					+ Constant.TestCaseRow.get("Elementlocation") + FromPage
					+ "; Againest verification value: " + Verification;
			ExtentLogs.Pass(ePassMessage);

		}

		else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + Verification
					+ "; is not present in List form page:  " + FromPage;
			Log.fail(failMessage);
			eFailMessage = "Verification Failed for Element list"
					+ Constant.TestCaseRow.get("Elementlocation") + FromPage
					+ "; Againest verification value: " + Verification;
			ExtentLogs.Fail(eFailMessage);

		}

	}

	public static void iFrameSwitchToDisplay() throws Exception, Throwable {

		SupportLib.waitForAjax();
		int TempWait = Constant.ExplicitWait;
		Constant.ExplicitWait = 1;
		List<WebElement> ele = driver.findElements(By.tagName("iframe"));
		int frameno = 0;
		boolean Result = false;

		for (frameno = 1; frameno <= ele.size(); frameno++) {
			ele = driver.findElements(By.tagName("iframe"));
			driver.switchTo().frame(frameno);
			ActionElement = FindElement();

			if (ActionElement != null && ActionElement.isDisplayed()) {
				activeframe.add(frameno);
				Result = true;
				break;

			} else {
				driver.switchTo().defaultContent();
			}

		}

		if (!Result) {
			infoMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "Not able to find the element in any of the present Frame Switched";
			Log.info(infoMessage);
		} else {
			infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "Frame Switched";
		}
		Constant.ExplicitWait = TempWait;
		Log.info(infoMessage);
	}

	/**
	 * Function to verify text in List of web element Fields required:Action,
	 * Element Location Test data: Verification value for the text
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyList() throws Exception, Throwable {
		SupportLib.waitForAjax();
		String Verification;
		boolean result = false;
		List<String> fetchfrompage = new ArrayList<String>();

		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
			}
		if (Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			for (WebElement we : WebElementCollection) {
				fetchfrompage.add(we.getText());
			}
		} else if (!(Constant.TestCaseRow.get("ActionSupportValue")
				.contains("Blank"))) {

			for (WebElement we : WebElementCollection) {
				fetchfrompage.add(we.getAttribute(Constant.TestCaseRow
						.get("ActionSupportValue")));
			}
		}
		Verification = Constant.TestCaseRow.get("Data");
		System.out.println("Verification  "+Verification);
		if (Verification.contains(":")) {
			StringTokenizer st = new StringTokenizer(Verification, ":");
			List<String> VerificationList = new ArrayList<String>();
			
			System.out.println("list complete "+VerificationList);
			
			while (st.hasMoreTokens()) {
				VerificationList.add(st.nextToken());
			}
			for (String local : VerificationList) {
				for (String FP : fetchfrompage) {

					FP = FP.toLowerCase();
					local = local.toLowerCase();
					if (FP.contains(local)) {
						result = true;
						
					} else {
						result = false;
						break;
					}

				}

				if (result == false) {
					break;
				}
			}

		} else {
			for (String FP : fetchfrompage) {

				if (FP.contains(Verification)) {
					result = true;
				} else {
					result = false;
					break;
				}
			}
		}

		if (result == true) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Text is found in " + fetchfrompage.size()
					+ "WebElements" + "; Againest user Defined Value: "
					+ Verification;
			Log.pass(passMessage);

			ePassMessage = "Range verification passed for "
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "All the value present on the page fall inbetween verificaiton Value:"
					+ Verification;
			ExtentLogs.Pass(ePassMessage);
		} else if (result == false) {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ ": Text is not found in one of the Webelement out of"
					+ fetchfrompage.size() + "WebElement;User Defined Value: "
					+ Verification;
			Log.fail(failMessage);

			eFailMessage = "Range verification failed for "
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "Value present dose not fall inbetween verificaiton Value:"
					+ Verification;
			ExtentLogs.Fail(eFailMessage);

		}

	}

	/**
	 * Function to verify text in List of web element Fields required:Action,
	 * Element Location Test data: Verification value for the text
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */

	/**
	 * Function to verify Attribute value of web element Fields required:Action,
	 * Element Location Test data: Verification value for the Attribute Test
	 * ActionSupportValue: Attribute name and property
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyAttribute() throws Exception, Throwable {

		SupportLib.waitForAjax();
		List<String> FromPageList = new ArrayList<String>();
		String Verification = null, FromPage = "";
		boolean Result = false;
		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		FromPageList = SupportLib.GetElementAttribute(WebElementCollection,
				Constant.TestCaseRow.get("ActionSupportValue"));
		
		
		if(Constant.TestCaseRow.get("Data").contains("config")){
			
			Verification=	config.getProperty(Constant.TestCaseRow.get("Data"));
		}
		else if(Constant.TestCaseRow.get("Data").contains("index"))
		
		{
				int arrayindex = SupportLib.ExtractInt(Constant.TestCaseRow.get("Data"));

				Verification=ValueCaptured.get(arrayindex);
				
		}
			
			
		else
		Verification = Constant.TestCaseRow.get("Data");

		for (String FromPageValue : FromPageList) {
			FromPage = FromPage + FromPageValue + ", ";

			FromPageValue = FromPageValue.toLowerCase();
			Verification = Verification.toLowerCase();
			if (FromPageValue.contains(Verification)) {
				Result = true;
			} else {
				Result = false;
				break;
			}
		}

		if (Result) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification + "; Present in Page values: "
					+ FromPage;
			Log.pass(passMessage);
			ePassMessage = "Verification Passed for Element: "
					+ Constant.TestCaseRow.get("Elementlocation") + "Values: "
					+ FromPage + "; Againest verification values"
					+ Verification;
			ExtentLogs.Pass(ePassMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification
					+ "; is Not Present in Page values: " + FromPage;
			Log.fail(failMessage);
			eFailMessage = "Verification failed for Element: "
					+ Constant.TestCaseRow.get("Elementlocation") + "Values: "
					+ FromPage + "; Againest verification values"
					+ Verification;
			ExtentLogs.Fail(eFailMessage);
		}

	}
	
	
	
	
	
	
public static void SalesforceDBConnect() throws Exception {
		
		
		String column=Constant.TestCaseRow.get("Data");
		String query = Constant.TestCaseRow.get("Elementlocation");
		SalesForceDB.queryContacts(column,query);
		infoMessage = Constant.TestCaseRow.get("TestStepID")
				+ ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ";Column Name is not provided, Please provide column name in ActionSupportValue";
		Log.info(infoMessage);
		eInfoMessage = "Column Name is not provided, Please provide column name in ActionSupportValue"
				+ Constant.TestCaseRow.get("Elementlocation");
		ExtentLogs.info(eInfoMessage);

	}



public static void SalesforceDBConnect1() throws Exception {
	
    String ValueFromPage= "";
	String column=Constant.TestCaseRow.get("Data");
	String query = Constant.TestCaseRow.get("Elementlocation");
	SalesForceOrderID.query2fetchorderID(column, query);
	
	
	if (ValueFromPage.contains("Post")) {
		ValueFromPage = ValueFromPage.trim();
		ValueFromPage = ValueFromPage.split(" ")[0];
	}
	ValueFromPage = ValueFromPage.trim();

	ValueCaptured.add(ValueFromPage);
	int size = ValueCaptured.size();
	size = size - 1;
	infoMessage =  Constant.TestCaseRow.get("TestStepID") + ": "
			+ Constant.TestCaseRow.get("TeststepDescription")
			+ ValueCaptured.get(size)
			+ "; Value has been stored in index: " + size;
	Log.info(infoMessage);
	eInfoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
			+ Constant.TestCaseRow.get("TeststepDescription")
			+  ValueCaptured.get(size)
			+ "; Value has been stored in index: " + size;
	ExtentLogs.info(eInfoMessage);

}

	/**
	 * Function to verify Element existence on the web page Fields
	 * required:Action, Element Location Test data: N/A
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyElement() throws Exception, Throwable {
		SupportLib.waitForAjax();
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Element Verification";

		if (!Constant.TestCaseRow.get("Elementlocation").contains("Blank")) {
			ActionElement = FindElement();
		} else {
			Constant.TestCaseRow.put("Elementlocation",
					Constant.TestCaseRow.get("Data"));
			ActionElement = FindElement();
		}

		if ((ActionElement != null)) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription") + "; "
					+ "Passed; " + "; Element is present on the active page";
			Log.pass(passMessage);

			ePassMessage = "Verification Passed for Element: "
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "Present in the active window ";
			ExtentLogs.Pass(ePassMessage);
		} else {
			SupportLib.createScreenshot();
			failMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Failed; Sepcified Element is not present on the page; "
					+ Constant.TestCaseRow.get("TeststepDescription");

			Log.fail(failMessage);
			eFailMessage = "Verification Failed for Element: "
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "is not Present in the active window ";
			ExtentLogs.Fail(eFailMessage);

		}
	}

	/**
	 * Return the WebElemet according to the parameters provided.
	 */
	public static WebElement FindElement() {

		String Type = Constant.TestCaseRow.get("ElementFinderType");
		String Loc = Constant.TestCaseRow.get("Elementlocation");
		WebElement we = null;
		if (Type.equalsIgnoreCase("Xpath")) {
			we = SupportLib.FindElement(1, Loc);
		} else if (Type.equalsIgnoreCase("ID")) {
			we = SupportLib.FindElement(2, Loc);
		} else if (Type.equalsIgnoreCase("CSS")) {
			we = SupportLib.FindElement(3, Loc);
		} else if (Type.equalsIgnoreCase("Link")) {
			we = SupportLib.FindElement(4, Loc);
		} else if (Type.equalsIgnoreCase("Name")) {
			we = SupportLib.FindElement(5, Loc);
		} else if (Type.equalsIgnoreCase("Class")) {
			we = SupportLib.FindElement(6, Loc);
		} else if (Type.equalsIgnoreCase("partialLink")) {
			we = SupportLib.FindElement(7, Loc);
		} else if (Type.equalsIgnoreCase("tagName")) {
			we = SupportLib.FindElement(8, Loc);
		} else if (Type.equalsIgnoreCase("ObjectRep")) {
			we = SupportLib.SearchObjRep();

		} else {
			errorMessage = Constant.TestCaseRow.get("TestStepID")
					+ "Element Location type is not defined";

			Log.error(errorMessage);
		}

		return we;

	}

	/**
	 * Return the WebElemets List according to the parameters provided.
	 */
	public static List<WebElement> FindElements() {

		String Type = Constant.TestCaseRow.get("ElementFinderType");
		String Loc = Constant.TestCaseRow.get("Elementlocation");
		List<WebElement> we = null;
		if (Type.equalsIgnoreCase("Xpath")) {
			we = SupportLib.FindElements(1, Loc);
		} else if (Type.equalsIgnoreCase("ID")) {
			we = SupportLib.FindElements(2, Loc);
		} else if (Type.equalsIgnoreCase("CSS")) {
			we = SupportLib.FindElements(3, Loc);
		} else if (Type.equalsIgnoreCase("Link")) {
			we = SupportLib.FindElements(4, Loc);
		} else if (Type.equalsIgnoreCase("Name")) {
			we = SupportLib.FindElements(5, Loc);
		} else if (Type.equalsIgnoreCase("Class")) {
			we = SupportLib.FindElements(6, Loc);
		} else if (Type.equalsIgnoreCase("partialLink")) {
			we = SupportLib.FindElements(7, Loc);
		} else if (Type.equalsIgnoreCase("tagName")) {
			we = SupportLib.FindElements(8, Loc);
		} else if (Type.equalsIgnoreCase("ObjectRep")) {
			we = SupportLib.SearchObjReps();
		} else {
			errorMessage = Constant.TestCaseRow.get("TestStepID")
					+ "Element Location type is not defined";

			Log.error(errorMessage);
		}

		return we;

	}

	public static List<WebElement> FindElementsFromActionSupport() {

		String Type = Constant.TestCaseRow.get("ElementFinderType");
		String Loc = Constant.TestCaseRow.get("ActionSupportValue");
		List<WebElement> we = null;
		if (Type.equalsIgnoreCase("Xpath")) {
			we = SupportLib.FindElements(1, Loc);
		} else if (Type.equalsIgnoreCase("ID")) {
			we = SupportLib.FindElements(2, Loc);
		} else if (Type.equalsIgnoreCase("CSS")) {
			we = SupportLib.FindElements(3, Loc);
		} else if (Type.equalsIgnoreCase("Link")) {
			we = SupportLib.FindElements(4, Loc);
		} else if (Type.equalsIgnoreCase("Name")) {
			we = SupportLib.FindElements(5, Loc);
		} else if (Type.equalsIgnoreCase("Class")) {
			we = SupportLib.FindElements(6, Loc);
		} else if (Type.equalsIgnoreCase("partialLink")) {
			we = SupportLib.FindElements(7, Loc);
		} else if (Type.equalsIgnoreCase("tagName")) {
			we = SupportLib.FindElements(8, Loc);
		} else if (Type.equalsIgnoreCase("ObjectRep")) {
			we = SupportLib.SearchObjReps();
		} else {
			errorMessage = Constant.TestCaseRow.get("TestStepID")
					+ "Element Location type is not defined";

			Log.error(errorMessage);
		}

		return we;

	}

	/**
	 * Function for a Robot keys as a crude method Fields required:N/A TestData:
	 * All the values to sent through Keyboard and Keys mention in the hash map
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void RobotKey() throws Exception, Throwable {
		Robot robot = new Robot();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("VK_TAB", new Integer(KeyEvent.VK_TAB));
		hm.put("VK_SPACE", new Integer(KeyEvent.VK_SPACE));
		hm.put("VK_ENTER", new Integer(KeyEvent.VK_ENTER));
		hm.put("VK_DELETE", new Integer(KeyEvent.VK_DELETE));
		hm.put("VK_CONTROL", new Integer(KeyEvent.VK_CONTROL));
		hm.put("VK_ALT", new Integer(KeyEvent.VK_ALT));
		hm.put("VK_SHIFT", new Integer(KeyEvent.VK_SHIFT));
		hm.put("w", new Integer(KeyEvent.VK_W));
		hm.put("VK_ESC", new Integer(KeyEvent.VK_ESCAPE));
		hm.put("VK_F5", new Integer(KeyEvent.VK_F5));
		hm.put("VK_T", new Integer(KeyEvent.VK_T));
		hm.put("VK_SHIFT", new Integer(KeyEvent.VK_SHIFT));
		hm.put("VK_DOWN", new Integer(KeyEvent.VK_DOWN));
		hm.put("VK_UP", new Integer(KeyEvent.VK_UP));
		hm.put("VK_Right", new Integer(KeyEvent.VK_RIGHT));
		hm.put("VK_Left", new Integer(KeyEvent.VK_LEFT));
		hm.put("VK_S", new Integer(KeyEvent.VK_S));
		String Keysevent = Constant.TestCaseRow.get("Data");
		if (Keysevent.contains(":")) {

		}
		String[] Seperated = Keysevent.split(":");
		int i = 0, j = 0;
		while (i < Seperated.length) {
			if (Seperated[i].contains("VK_")) {
				String[] Seperatedseq = Keysevent.split("\\+");
				while (j < Seperatedseq.length) {
					robot.delay(40);
					robot.keyPress((int) hm.get(Seperatedseq[j]));
					j++;
				}
				while (j > 0) {
					j--;
					robot.keyRelease((int) hm.get(Seperatedseq[j]));

				}

			} else {
				System.out
						.println("this one is a char sequence" + Seperated[i]);

				byte[] bytes = Seperated[i].getBytes();
				for (byte b : bytes) {
					int code = b;
					if (code > 96 && code < 123)
						code = code - 32;
					robot.delay(40);
					robot.keyPress(code);
					robot.delay(40);
					robot.keyRelease(code);
					robot.delay(40);
				}
			}

			i++;

		}

	}

	/*
	 * public static void SMove() throws Exception, Throwable { String Loc, Key;
	 * 
	 * if
	 * (Constant.TestCaseRow.get("ElementFinderType").equalsIgnoreCase("Objectrep"
	 * )) { Key = Constant.TestCaseRow.get("Elementlocation");
	 * 
	 * Loc = Constant.ObjrepLoc.get(Key); } else { Loc =
	 * Constant.TestCaseRow.get("Elementlocation"); }
	 * 
	 * screen = new Screen(); if
	 * (Constant.TestCaseRow.get("Data").contains("Blank")) {
	 * screen.hover(Constant.SikuliImageLocation + Loc); } else { String
	 * Datavalue = Constant.TestCaseRow.get("Data"); sikulipattern(Datavalue,
	 * Loc); screen.hover(pattern);
	 * 
	 * } passMessage = Constant.TestCaseRow.get("TestStepID") + ": " +
	 * Constant.TestCaseRow.get("TeststepDescription") + ": Sikuli Clicked" +
	 * " using pattern: " + Constant.TestCaseRow.get("Data");
	 * Log.pass(passMessage); ePassMessage = "Sikuli Clicked" +
	 * " using pattern: " + Constant.TestCaseRow.get("Data");
	 * ExtentLogs.pass(ePassMessage); }
	 *//**
	 * Function for a Sikuli click: Required Fields: Element as Image Name in
	 * Images Unitaction folder Data: Optional(can set offset parameter(int x
	 * int y) and matching percentage (float)
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	/*
	 * public static void Sclick() throws Exception, Throwable { String Loc,
	 * Key;
	 * 
	 * if
	 * (Constant.TestCaseRow.get("ElementFinderType").equalsIgnoreCase("Objectrep"
	 * )) { Key = Constant.TestCaseRow.get("Elementlocation");
	 * 
	 * Loc = Constant.ObjrepLoc.get(Key); } else { Loc =
	 * Constant.TestCaseRow.get("Elementlocation"); }
	 * 
	 * screen = new Screen();
	 * 
	 * if (Constant.TestCaseRow.get("Data") != "Blank") {
	 * screen.click(Constant.SikuliImageLocation + Loc); String Datavalue =
	 * Constant.TestCaseRow.get("Data"); sikulipattern(Datavalue, Loc);
	 * screen.click(pattern); passMessage =
	 * Constant.TestCaseRow.get("TestStepID") + ": " +
	 * Constant.TestCaseRow.get("TeststepDescription") + ": Sikuli Clicked" +
	 * " using pattern: " + Constant.TestCaseRow.get("Data"); }
	 * Log.pass(passMessage); ePassMessage = "Sikuli Clicked" +
	 * " using pattern: " + Constant.TestCaseRow.get("Data");
	 * ExtentLogs.pass(ePassMessage); }
	 * 
	 * public static void SSubmitCapture() throws Exception, Throwable {
	 * 
	 * String Loc, Key;
	 * 
	 * if
	 * (Constant.TestCaseRow.get("ElementFinderType").equalsIgnoreCase("Objectrep"
	 * )) { Key = Constant.TestCaseRow.get("Elementlocation");
	 * 
	 * Loc = Constant.ObjrepLoc.get(Key); } else { Loc =
	 * Constant.TestCaseRow.get("Elementlocation"); } int arrayindex = 0; screen
	 * = new Screen(); arrayindex =
	 * Integer.parseInt(Constant.TestCaseRow.get("ActionSupportValue"));
	 * sikulipattern(Constant.TestCaseRow.get("Data"), Loc);
	 * screen.paste(pattern, ValueCaptured.get(arrayindex)); }
	 *//**
	 * Function for a Sikuli Mouse scroll down: Required Fields: Element as
	 * Image Name in Images Unitaction folder Data: Optional(can set wheel
	 * number (int number)
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	/*
	 * public static void SMDscroll() throws Exception, Throwable { screen = new
	 * Screen();
	 * 
	 * if (Constant.TestCaseRow.get("Data") != "Blank") { screen.wheel(1,
	 * Integer.parseInt(Constant.TestCaseRow.get("Data"))); } else {
	 * screen.wheel(1, 1); } passMessage =
	 * Constant.TestCaseRow.get("TestStepID") + ": " +
	 * Constant.TestCaseRow.get("TeststepDescription") +
	 * ": Sikuli Mouse Down Scrolled"; Log.pass(passMessage);
	 * 
	 * ePassMessage = "Sikuli Mouse Down Scrolled sucessfully";
	 * ExtentLogs.pass(ePassMessage); }
	 *//**
	 * Function for a Sikuli Mouse scroll up: Required Fields: Element as
	 * Image Name in Images Unitaction folder Data: Optional(can set wheel
	 * number (int number)
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	/*
	 * public static void SMUscroll() throws Exception, Throwable { screen = new
	 * Screen();
	 * 
	 * if (Constant.TestCaseRow.get("Data") != "Blank") { screen.wheel(-1,
	 * Integer.parseInt(Constant.TestCaseRow.get("Data"))); } else {
	 * screen.wheel(-1, 1); } infoMessage =
	 * Constant.TestCaseRow.get("TestStepID") + ": " +
	 * Constant.TestCaseRow.get("TeststepDescription") +
	 * ": Sikuli Mouse Up Scrolled"; Log.info(infoMessage); ePassMessage =
	 * "Sikuli Mouse UP Scrolled sucessfully"; ExtentLogs.pass(ePassMessage); }
	 *//**
	 * Function for a Sikuli Mouse double click: Required Fields: Element as
	 * Image Name in Images Unitaction folder Data: Optional(can set wheel
	 * number (int number)
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	/*
	 * public static void SDclick() throws Exception, Throwable { String Loc,
	 * Key;
	 * 
	 * if
	 * (Constant.TestCaseRow.get("ElementFinderType").equalsIgnoreCase("Objectrep"
	 * )) { Key = Constant.TestCaseRow.get("Elementlocation");
	 * 
	 * Loc = Constant.ObjrepLoc.get(Key); } else { Loc =
	 * Constant.TestCaseRow.get("Elementlocation"); } screen = new Screen(); if
	 * (Constant.TestCaseRow.get("Data") == "Blank") {
	 * 
	 * screen.doubleClick(Constant.SikuliImageLocation + Loc); passMessage =
	 * Constant.TestCaseRow.get("TestStepID") + ": " +
	 * Constant.TestCaseRow.get("TeststepDescription") +
	 * ": Sikuli double Clicked" + " using pattern: " +
	 * Constant.TestCaseRow.get("Data");
	 * 
	 * ePassMessage = "Sikuli double Clicked" + " using pattern: " +
	 * Constant.TestCaseRow.get("Data");
	 * 
	 * }
	 * 
	 * if (Constant.TestCaseRow.get("Data") == "Blank") { String Datavalue =
	 * Constant.TestCaseRow.get("Data"); sikulipattern(Datavalue, Loc);
	 * screen.doubleClick(pattern); passMessage =
	 * Constant.TestCaseRow.get("TestStepID") + ": " +
	 * Constant.TestCaseRow.get("TeststepDescription") +
	 * ": Sikuli double Clicked" + " using pattern: " +
	 * Constant.TestCaseRow.get("Data"); ePassMessage = "Sikuli double Clicked"
	 * + " using pattern: " + Constant.TestCaseRow.get("Data"); } else {
	 * screen.doubleClick(Constant.SikuliImageLocation +
	 * Constant.TestCaseRow.get("Elementlocation")); passMessage =
	 * Constant.TestCaseRow.get("TestStepID") + ": " +
	 * Constant.TestCaseRow.get("TeststepDescription") +
	 * ": Sikuli double Clicked"; ePassMessage =
	 * "Sikuli double Clicked is performed"; }
	 * 
	 * Log.pass(passMessage); ExtentLogs.pass(ePassMessage); }
	 *//**
	 * Function for a Sikuli drag and drop: Required Fields: Element address
	 * as Image Name data as target image location
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	/*
	 * public static void SDragDrop() throws Exception, Throwable { String Loc,
	 * Key;
	 * 
	 * if
	 * (Constant.TestCaseRow.get("ElementFinderType").equalsIgnoreCase("Objectrep"
	 * )) { Key = Constant.TestCaseRow.get("Elementlocation");
	 * 
	 * Loc = Constant.ObjrepLoc.get(Key); } else { Loc =
	 * Constant.TestCaseRow.get("Elementlocation"); } screen = new Screen();
	 * String[] image; String image1, image2, imagecomp;
	 * 
	 * imagecomp = Loc;
	 * 
	 * image = imagecomp.split("\\+"); image1 = Constant.SikuliImageLocation +
	 * image[0]; image2 = Constant.SikuliImageLocation + image[1];
	 * screen.dragDrop(image1, image2); infoMessage =
	 * Constant.TestCaseRow.get("TestStepID") + ": " +
	 * Constant.TestCaseRow.get("TeststepDescription") +
	 * ": Sikuli Drag and Drop"; Log.info(infoMessage);
	 * 
	 * ePassMessage = "Sikuli Drag and Drop is performed sucessfully";
	 * ExtentLogs.pass(ePassMessage);
	 * 
	 * }
	 *//**
	 * Function for a Sikuli drag and drop: Required Fields: Element address
	 * as Image Name data as target image location
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	/*
	 * 
	 * public static void SDragDropxy() throws Exception, Throwable { String
	 * Loc, Key;
	 * 
	 * if
	 * (Constant.TestCaseRow.get("ElementFinderType").equalsIgnoreCase("Objectrep"
	 * )) { Key = Constant.TestCaseRow.get("Elementlocation");
	 * 
	 * Loc = Constant.ObjrepLoc.get(Key); } else { Loc =
	 * Constant.TestCaseRow.get("Elementlocation"); } screen = new Screen(); int
	 * x = 0, y = 0; String[] xyloc; String image1 =
	 * Constant.SikuliImageLocation + Loc; Match m;
	 * 
	 * xyloc = Constant.TestCaseRow.get("Data").split(","); x =
	 * Integer.parseInt(xyloc[0]); y = Integer.parseInt(xyloc[1]);
	 * System.out.println(image1 + "----------" + x + "------------" + y);
	 * System.out.println(image1 + "----------" + x + "------------" + y); m =
	 * screen.find(image1); screen.dragDrop(m, m.offset(x, y));
	 * 
	 * infoMessage = Constant.TestCaseRow.get("TestStepID") + ": " +
	 * Constant.TestCaseRow.get("TeststepDescription") +
	 * ": Sikuli Drag and Drop"; Log.info(infoMessage);
	 * 
	 * eInfoMessage =
	 * "Sikuli Drag and Drop is performed sucessfully for coordinates: " +
	 * Constant.TestCaseRow.get("Data"); ExtentLogs.info(eInfoMessage);
	 * 
	 * }
	 *//**
	 * Function to support Sikuli click action: Required Fields: N/A N/A
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	/*
	 * public static void sikulipattern(String Datavalue, String Loc) throws
	 * Exception, Throwable {
	 * 
	 * String[] datavalue = Datavalue.split(",");
	 * 
	 * if (datavalue.length == 1) { pattern = new
	 * Pattern(Constant.SikuliImageLocation +
	 * Loc).similar((Float.parseFloat(datavalue[1]) / 100)); } else if
	 * (datavalue.length == 2) {
	 * 
	 * pattern = new Pattern(Constant.SikuliImageLocation +
	 * Loc).similar(Float.parseFloat(datavalue[0]))
	 * .targetOffset(Integer.parseInt(datavalue[1]),
	 * Integer.parseInt(datavalue[2])); } else if (datavalue.length == 3) {
	 * pattern = new Pattern(Constant.SikuliImageLocation +
	 * Constant.TestCaseRow.get("Elementlocation")) .similar((float)
	 * 0.7).targetOffset(Integer.parseInt(datavalue[0]),
	 * Integer.parseInt(datavalue[1]));
	 * 
	 * } }
	 * 
	 * public static void SFind() throws Exception, Throwable { String Loc, Key;
	 * boolean Result = false;
	 * 
	 * if
	 * (Constant.TestCaseRow.get("ElementFinderType").equalsIgnoreCase("Objectrep"
	 * )) { Key = Constant.TestCaseRow.get("Elementlocation");
	 * 
	 * Loc = Constant.ObjrepLoc.get(Key); } else { Loc =
	 * Constant.TestCaseRow.get("Elementlocation"); } screen = new Screen();
	 * Match m = null;
	 * 
	 * if (!Constant.TestCaseRow.get("Data").contains("Blank")) { pattern = new
	 * Pattern(Constant.SikuliImageLocation + Loc)
	 * .similar(Float.parseFloat(Constant.TestCaseRow.get("Data"))); } else {
	 * 
	 * pattern = new Pattern(Constant.SikuliImageLocation + Loc).similar((float)
	 * 0.7); } Double mgetscore = 0.0; try { m = screen.find(pattern);
	 * 
	 * mgetscore = m.getScore(); if (mgetscore > 0.9 && m != null &&
	 * Constant.TestCaseRow.get("Data").contains("Blank")) { Result = true; }
	 * else if (mgetscore > Float.parseFloat(Constant.TestCaseRow.get("Data"))
	 * || m == null) { Result = true; } } catch (Exception e) { Result = false;
	 * 
	 * }
	 * 
	 * if (Result) {
	 * 
	 * passMessage = Constant.TestCaseRow.get("TestStepID") + "; " + "Passed; "
	 * + Constant.TestCaseRow.get("TeststepDescription") +
	 * "; Image is available on the page with " + mgetscore + ", % matching";
	 * Log.pass(passMessage);
	 * 
	 * ePassMessage = "Image is available on the page with " + mgetscore +
	 * ", % matching"; ExtentLogs.pass(ePassMessage); } else { failMessage =
	 * Constant.TestCaseRow.get("TestStepID") + "; " + "Failed; " +
	 * Constant.TestCaseRow.get("TeststepDescription") +
	 * ";Not able to search Image on the page with " + mgetscore +
	 * ", % matching";
	 * 
	 * Log.fail(failMessage); eFailMessage =
	 * "Not able to search Image on the page with " + mgetscore +
	 * ", % matching"; ExtentLogs.Fail(eFailMessage);
	 * 
	 * } }
	 * 
	 * public static void SFindOR() throws Exception, Throwable { String[] Loc =
	 * null, Key; String image = ""; int count = 0; boolean Result = false;
	 * screen = new Screen(); Match m = null; Double mgetscore = 0.0;
	 * 
	 * if
	 * (Constant.TestCaseRow.get("ElementFinderType").equalsIgnoreCase("Objectrep"
	 * )) { Key = Constant.TestCaseRow.get("Elementlocation").split("::");
	 * 
	 * for (String value : Key) { Loc[count] = Constant.ObjrepLoc.get(value);
	 * count++; } } else { Loc =
	 * Constant.TestCaseRow.get("Elementlocation").split("::"); }
	 * 
	 * for (String Value : Loc) { if
	 * (!Constant.TestCaseRow.get("Data").contains("Blank")) { pattern = new
	 * Pattern(Constant.SikuliImageLocation + Value)
	 * .similar(Float.parseFloat(Constant.TestCaseRow.get("Data"))); } else {
	 * 
	 * pattern = new Pattern(Constant.SikuliImageLocation +
	 * Value).similar((float) 0.7); }
	 * 
	 * try { m = screen.find(pattern); mgetscore = m.getScore(); if (mgetscore >
	 * 0.9 && m != null && Constant.TestCaseRow.get("Data").contains("Blank")) {
	 * Result = true; image = Value; break; } else if (mgetscore >
	 * Float.parseFloat(Constant.TestCaseRow.get("Data")) || m == null) { Result
	 * = true; image = Value; break; }
	 * 
	 * } catch (Exception e) { continue; } } if (Result) {
	 * 
	 * passMessage = Constant.TestCaseRow.get("TestStepID") + "; " + "Passed; "
	 * + Constant.TestCaseRow.get("TeststepDescription") + ";" + image +
	 * " Image is available on the page with " + mgetscore + ", % matching";
	 * Log.pass(passMessage);
	 * 
	 * ePassMessage = image + "Image is available on the page with " + mgetscore
	 * + ", % matching"; ExtentLogs.pass(ePassMessage); } else { failMessage =
	 * Constant.TestCaseRow.get("TestStepID") + "; " + "Failed; " +
	 * Constant.TestCaseRow.get("TeststepDescription") +
	 * ";Not able to search Image on the page with " + mgetscore +
	 * ", % matching";
	 * 
	 * Log.fail(failMessage); eFailMessage =
	 * "Not able to search Image on the page with " + mgetscore +
	 * ", % matching"; ExtentLogs.Fail(eFailMessage);
	 * 
	 * } }
	 *//**
	 * Function for a Sikuli type: Required Fields: Element as Image Name in
	 * Images Unitaction folder Data: Optional(can set offset parameter(int x
	 * int y) and matching percentage (float)
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	/*
	 * public static void Stype() throws Exception, Throwable { String Loc, Key;
	 * 
	 * if
	 * (Constant.TestCaseRow.get("ElementFinderType").equalsIgnoreCase("Objectrep"
	 * )) { Key = Constant.TestCaseRow.get("Elementlocation");
	 * 
	 * Loc = Constant.ObjrepLoc.get(Key); } else { Loc =
	 * Constant.TestCaseRow.get("Elementlocation"); } screen = new Screen();
	 * 
	 * if (Constant.TestCaseRow.get("Data") != "Blank") { String Datavalue =
	 * Constant.TestCaseRow.get("Data");
	 * 
	 * sikulipattern(Datavalue, Loc); screen.type(pattern,
	 * Constant.TestCaseRow.get("ActionSupportValue")); } else {
	 * screen.type(Constant.SikuliImageLocation + Loc,
	 * Constant.ActionSupportValue); } infoMessage =
	 * Constant.TestCaseRow.get("TestStepID") + ": " +
	 * Constant.TestCaseRow.get("TeststepDescription") + ": Sikuli Typed";
	 * 
	 * Log.info(infoMessage); }
	 * 
	 * public static void SWait() throws Exception, Throwable { screen = new
	 * Screen();
	 * 
	 * String Datavalue = Constant.TestCaseRow.get("Data"); Float DataValue_F =
	 * new Float(Datavalue);
	 * 
	 * screen.wait(DataValue_F); }
	 *//**
	 * Function for Sikuli to capture the value of the text box and get a
	 * string from the same. TestData: All the values to sent through Keyboard
	 * and Keys mention in the hash map
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	/*
	 * public static void SCapture() throws Exception, Throwable { String Loc,
	 * Key;
	 * 
	 * if
	 * (Constant.TestCaseRow.get("ElementFinderType").equalsIgnoreCase("Objectrep"
	 * )) { Key = Constant.TestCaseRow.get("Elementlocation");
	 * 
	 * Loc = Constant.ObjrepLoc.get(Key); } else { Loc =
	 * Constant.TestCaseRow.get("Elementlocation"); } screen = new Screen(); if
	 * (Constant.TestCaseRow.get("Data") == "Blank") {
	 * screen.click(Constant.SikuliImageLocation + Loc); }
	 * 
	 * if (Constant.TestCaseRow.get("Data") != "Blank") { String Datavalue =
	 * Constant.TestCaseRow.get("Data"); sikulipattern(Datavalue, Loc);
	 * screen.click(pattern); } SupportLib.SelectAll();
	 * SupportLib.KeyboardCopy(); ValueCaptured.add(SupportLib.CopyClipboard());
	 * int size = ValueCaptured.size(); size = size - 1; infoMessage =
	 * Constant.TestCaseRow.get("TestStepID") + ": " +
	 * Constant.TestCaseRow.get("TeststepDescription") +
	 * ": Copy and store following value:" + ValueCaptured.get(size) +
	 * "using pattern: " + Constant.TestCaseRow.get("Data") + "At index no: " +
	 * size; Log.info(infoMessage); eInfoMessage =
	 * "Copy and store following value:" + ValueCaptured.get(size) +
	 * "using pattern: " + Constant.TestCaseRow.get("Data") + "At index no: " +
	 * size; ExtentLogs.info(eInfoMessage); }
	 */

	/**
	 * Function for Logical Robot keys as a crude method Fields required:N/A
	 * TestData: All the values to sent through Keyboard and Keys mention in the
	 * hash map
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void RobotLKey() throws Exception, Throwable {
		Robot robot = new Robot();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("VK_TAB", new Integer(KeyEvent.VK_TAB));
		hm.put("VK_SPACE", new Integer(KeyEvent.VK_SPACE));
		hm.put("VK_ENTER", new Integer(KeyEvent.VK_ENTER));
		hm.put("VK_DELETE", new Integer(KeyEvent.VK_DELETE));
		hm.put("VK_CONTROL", new Integer(KeyEvent.VK_CONTROL));
		hm.put("VK_ALT", new Integer(KeyEvent.VK_ALT));
		hm.put("VK_SHIFT", new Integer(KeyEvent.VK_SHIFT));
		hm.put("VK_DOWN", new Integer(KeyEvent.VK_DOWN));
		hm.put("VK_UP", new Integer(KeyEvent.VK_UP));
		hm.put("VK_Right", new Integer(KeyEvent.VK_RIGHT));
		hm.put("VK_Left", new Integer(KeyEvent.VK_LEFT));
		String Keysevent = Constant.TestCaseRow.get("Data");
		String[] Seperated = Keysevent.split("\\^");
		int i = 0;
		while (i < Seperated.length) {
			if (Seperated[i].contains("VK_")) {
				// System.out.println(Seperated.length + Seperated[i]);
				robot.delay(40);
				robot.keyPress((int) hm.get(Seperated[i]));
				robot.delay(40);
			}

			else {
				System.out
						.println("this one is a char sequence" + Seperated[i]);

				byte[] bytes = Seperated[i].getBytes();
				for (byte b : bytes) {
					int code = b;
					if (code > 96 && code < 123)
						code = code - 32;
					robot.delay(40);
					robot.keyPress(code);
					robot.delay(40);
					robot.keyRelease(code);
					robot.delay(40);
				}

			}
			i++;
		}
		i = 0;
		while (i < Seperated.length) {
			if (Seperated[i].contains("VK_")) {
				robot.delay(40);
				robot.keyRelease((int) hm.get(Seperated[i]));
				robot.delay(40);
			}

			else {
			}
			i++;
		}

	}

	/**
	 * Press Tab action on the Web Element Fields required: Action, Element
	 * locator type, Element Location Test data: Value to enter in the
	 * Web-Element before pressing tab.
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void PressTab() throws Exception, Throwable {
		SupportLib.waitForAjax();
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Tab Pressed ";
		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		ActionElement.sendKeys(Constant.TestCaseRow.get("Data") + Keys.TAB);
		Log.info(infoMessage);
	}

	public static void VerifyNumbers() throws Exception, Throwable {
		SupportLib.waitForAjax();
		List<Integer> fromPage = new ArrayList<Integer>();
		List<String> TextListfromPage = new ArrayList<String>();
		String Operatorvalue;
		int LogicalCase = 0;
		HashMap<String, Integer> LogicalOperator = new HashMap<String, Integer>();
		boolean Result = false;
		int valuefrompage = 0, verification;

		LogicalOperator.put("<", 1);
		LogicalOperator.put(">", 2);
		LogicalOperator.put("=>", 3);
		LogicalOperator.put("<=", 4);
		LogicalOperator.put("!=", 5);

		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		String fromscript = "";
		fromscript = Constant.TestCaseRow.get("Data");
		if (fromscript.contains(",")) {
			Operatorvalue = fromscript.split(",")[1];
			LogicalCase = LogicalOperator.get(Operatorvalue);
		}

		if (!Constant.TestCaseRow.get("Data").contains("Capture:")) {
			verification = SupportLib.ExtractInt(fromscript.split(",")[0]);
		} else {
			int i = SupportLib.ExtractInt(fromscript.split(",")[0]);
			fromscript = ValueCaptured.get(i);
			List<Integer> fromScriptList = new ArrayList<Integer>();
			fromScriptList = SupportLib.ExtractRange(fromscript);
			verification = fromScriptList.get(0);
		}

		if (Constant.TestCaseRow.get("ActionSupportValue") != "Blank") {
			TextListfromPage = SupportLib.GetElementAttribute(
					WebElementCollection,
					Constant.TestCaseRow.get("ActionSupportValue"));

			for (String se : TextListfromPage) {
				valuefrompage = SupportLib.processnumbers(se);
				fromPage.add(valuefrompage);

			}
		} else {
			TextListfromPage = SupportLib.GetElementText(WebElementCollection);

			for (String se : TextListfromPage) {
				valuefrompage = SupportLib.processnumbers(se);
				fromPage.add(valuefrompage);
			}
		}
		String Printvalue = "";
		for (int valuefrompage1 : fromPage) {
			Printvalue = Printvalue + valuefrompage1 + ",";
			switch (LogicalCase) {
			case 0:
				if (verification == valuefrompage1) {
					Result = true;
				} else {
					Result = false;
				}
				break;
			case 1:
				if (verification > valuefrompage1) {
					Result = true;
				} else {
					Result = false;
				}
				break;
			case 2:
				if (verification < valuefrompage1) {
					Result = true;
				} else {
					Result = false;
				}
				break;
			case 3:
				if (verification >= valuefrompage1) {
					Result = true;
				} else {
					Result = false;
				}
				break;
			case 4:
				if (verification <= valuefrompage1) {
					Result = true;
				} else {
					Result = false;
				}
				break;
			case 5:
				if (verification != valuefrompage1) {
					Result = true;
				} else {
					Result = false;
				}
				break;
			}

			if (!Result) {
				break;
			}
		}
		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; from page: " + Printvalue + "; User Defined Value: "
					+ verification;
			Log.pass(passMessage);

			ePassMessage = "Verification of numbers pass for the value from page: "
					+ Printvalue
					+ " againest User Defined Value: "
					+ verification;
			ExtentLogs.Pass(ePassMessage);
		} else {
			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ ": from page: " + Printvalue + "User Defined Value: "
					+ verification;
			Log.fail(failMessage);

			eFailMessage = "Verification of numbers fail for the value from page: "
					+ Printvalue
					+ " againest User Defined Value: "
					+ verification;
			ExtentLogs.Fail(eFailMessage);
		}

	}

	public static void VerifyClickCopyNumbers() throws Exception, Throwable {
		SupportLib.waitForAjax();
		String Operatorvalue;
		int LogicalCase = 0;
		HashMap<String, Integer> LogicalOperator = new HashMap<String, Integer>();
		boolean Result = false;
		int valuefrompage = 0, verification;

		LogicalOperator.put("<", 1);
		LogicalOperator.put(">", 2);
		LogicalOperator.put("=>", 3);
		LogicalOperator.put("<=", 4);
		LogicalOperator.put("!=", 5);
		ActionElement = FindElement();

		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		ActionElement.click();
		SupportLib.clearClipboard();
		SupportLib.SelectAll();
		SupportLib.KeyboardCopy();
		valuefrompage = SupportLib.processnumbers(SupportLib.CopyClipboard());
		String fromscript = "";
		fromscript = Constant.TestCaseRow.get("Data");
		if (fromscript.contains(",")) {
			Operatorvalue = fromscript.split(",")[1];
			LogicalCase = LogicalOperator.get(Operatorvalue);
		}

		if (!Constant.TestCaseRow.get("Data").contains("Capture:")) {

			verification = SupportLib.ExtractInt(fromscript.split(",")[0]);
		} else {
			int i = SupportLib.ExtractInt(fromscript.split(",")[0]);
			fromscript = ValueCaptured.get(i);
			List<Integer> fromScriptList = new ArrayList<Integer>();
			fromScriptList = SupportLib.ExtractRange(fromscript);
			verification = fromScriptList.get(0);
		}

		switch (LogicalCase) {
		case 0:
			if (verification == valuefrompage) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 1:
			if (verification > valuefrompage) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 2:
			if (verification < valuefrompage) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 3:
			if (verification >= valuefrompage) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 4:
			if (verification <= valuefrompage) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 5:
			if (verification != valuefrompage) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		}
		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; from page: " + valuefrompage
					+ "; User Defined Value: " + verification;
			Log.pass(passMessage);

			ePassMessage = "Verification of numbers pass for the value from page: "
					+ valuefrompage
					+ " againest User Defined Value: "
					+ verification;
			ExtentLogs.Pass(ePassMessage);
		} else {
			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ ": from page: " + valuefrompage + "User Defined Value: "
					+ verification;
			Log.fail(failMessage);

			eFailMessage = "Verification of numbers fail for the value from page: "
					+ valuefrompage
					+ " againest User Defined Value: "
					+ verification;
			ExtentLogs.Fail(eFailMessage);
		}

	}

	/**
	 * Function to verify page title. required: Action, Element Location Test
	 * data: N/A
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyPageTitle() throws Exception, Throwable {
		SupportLib.waitForAjax();
		String pagetitle = driver.getTitle();
		String expectedtitle = Constant.TestCaseRow.get("Data");

		pagetitle = pagetitle.toLowerCase();
		expectedtitle = expectedtitle.toLowerCase();
		if (pagetitle.contains(expectedtitle)) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription") + "; "
					+ "Passed; " + "Value from page: " + pagetitle
					+ "; User Defined title:" + expectedtitle;
			Log.pass(passMessage);
			ePassMessage = "Title  from page: " + pagetitle
					+ "; Dose contains User Defined title:" + expectedtitle;
			ExtentLogs.Pass(ePassMessage);
		} else {
			SupportLib.createScreenshot();
			failMessage = "Failed; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; from page: " + pagetitle + "; User Defined title:"
					+ expectedtitle;
			Log.fail(failMessage);

			eFailMessage = "Title  from page: " + pagetitle
					+ "; Dose not contains User Defined title:" + expectedtitle;
			ExtentLogs.Fail(eFailMessage);
		}
	}

	/**
	 * Function to verify page URL. required: Action, Element Location Test
	 * data: N/A
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyPageURL() throws Exception, Throwable {
		SupportLib.waitForAjax();
		String expectedURL, pageURL;
		pageURL = driver.getCurrentUrl();
		if (!Constant.TestCaseRow.get("Data").toLowerCase().contains("capture")) {
			expectedURL = Constant.TestCaseRow.get("Data");
		} else {
			String indexno = Constant.TestCaseRow.get("Data").toLowerCase()
					.replace("capture:", "");
			int arrayindex = Integer.parseInt(indexno);
			expectedURL = ValueCaptured.get(arrayindex);
		}
		pageURL = pageURL.toLowerCase();
		expectedURL = expectedURL.toLowerCase();
		if (pageURL.contains(expectedURL)) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription") + "; "
					+ "Passed; " + "; Value from page: " + pageURL
					+ "; User Defined URL:" + expectedURL;
			Log.pass(passMessage);
			ePassMessage = "URL from page: " + pageURL
					+ "; dose contains User Defined URL:" + expectedURL;
			ExtentLogs.Pass(ePassMessage);
		} else {
			SupportLib.createScreenshot();
			failMessage = "Failed; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; from page: " + pageURL + "; User Defined URL:"
					+ expectedURL;

			Log.fail(failMessage);

			eFailMessage = "URL from page: " + pageURL
					+ "; dose not contains User Defined URL:" + expectedURL;
			ExtentLogs.Fail(eFailMessage);
		}
	}

	/**
	 * Run exe auto script (location specify in the element location cell)
	 * Please use '//' for location folder structure.
	 */
	public static void Autoit() throws Exception, Throwable {
		Process AutoitProcess;
		int retCode = 0;
		if (!Constant.TestCaseRow.get("Data").contains("Blank")) {
			Thread.sleep(5000);
			AutoitProcess = Runtime.getRuntime().exec(
					Constant.autoit
							+ Constant.TestCaseRow.get("Elementlocation") + " "
							+ Constant.autoit
							+ Constant.TestCaseRow.get("Data"));
		} else {
			AutoitProcess = Runtime.getRuntime().exec(
					Constant.TestCaseRow.get("Elementlocation"));
		}

		InputStream is = AutoitProcess.getInputStream();

		while (retCode != -1) {
			retCode = is.read();
		}
		infoMessage = Constant.autoit + Constant.TestCaseRow.get("Data")
				+ ": is executed sucessfully";
		Log.info(infoMessage);
		ExtentLogs.info(Constant.autoit + Constant.TestCaseRow.get("Data")
				+ ": is executed sucessfully");
	}

	/**
	 * Will close the current tab
	 */
	public static void CloseTab() throws Exception, Throwable {
		Robot robot = new Robot();

		robot.delay(40);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(40);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(40);

	}

	/**
	 * Function to print values in log and on screen only
	 */
	public static void ShowRecord() throws Exception, Throwable {
		SupportLib.waitForAjax();
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Show Record";
		Log.info(infoMessage);
		String fetchfrompage;
		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		fetchfrompage = ActionElement.getText();
		if (Constant.ExtReportloglevel == 3) {
			imageLocation = SupportLib.createScreenshot();
		}
		infoMessage = "Record Details are: " + fetchfrompage;
		Log.info(infoMessage);

	}

	
	/**
	 * Function to verify and Available text value in the web element test
	 * Fields required: Action, Element Location Test data: Should contain : as
	 * a splitter for more then one value to verify in the text
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyAnd() throws Exception, Throwable {

		SupportLib.waitForAjax();
		List<String> FromPageList = new ArrayList<String>();
		List<String> VerificationList = new ArrayList<String>();
		String Verification, FromPage = "";
		boolean Result = false;
		WebElementCollection = FindElements();

		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			FromPageList = SupportLib.GetElementAttribute(WebElementCollection,
					Constant.TestCaseRow.get("ActionSupportValue"));
		} else {
			FromPageList = SupportLib.GetElementText(WebElementCollection);
		}
		Verification = Constant.TestCaseRow.get("Data");
		VerificationList = SupportLib.ProcessData(Verification);

		for (String FromPageValue : FromPageList) {
			FromPage = FromPage + FromPageValue + ", ";
			for (String VerificationValue : VerificationList) {
				FromPageValue = FromPageValue.toLowerCase();
				VerificationValue = VerificationValue.toLowerCase();

				if (FromPageValue.contains(VerificationValue)) {
					Result = true;
					break;
				} else {
					Result = false;
					break;
				}
			}

			if (!Result) {
				break;
			}
		}

		if (Result) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";All Value among: " + Verification
					+ "; Are Present in Page values: " + FromPage;
			ePassMessage = "All value among: " + Verification
					+ "; are Present in Page values: " + FromPage;
			ExtentLogs.Pass(ePassMessage);

			Log.pass(passMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ ";All value among: " + Verification
					+ "; are Not Present in Page values: " + FromPage;

			Log.fail(failMessage);
			eFailMessage = "All value among: " + Verification
					+ "; are Not Present in Page values: " + FromPage;
			ExtentLogs.Fail(eFailMessage);

		}
	}

	/**
	 * Function to verify Range available in the webelement test Fields
	 * required: Action, Element Location Test data: Should contain : as a
	 * splitter for more then one value to verify in the text
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyRange() throws Exception, Throwable {
		Log.debug("ActionKeyword:VerifyRange Waiting for Ajax");
		SupportLib.waitForAjax();
		List<String> FromPageList = new ArrayList<String>();
		String Verification, FromPage = "", ErrorValue = "";
		boolean Result = false;
		WebElementCollection = FindElements();
		Log.debug("ActionKeyword:VerifyRange Number of webelements found "
				+ WebElementCollection.size());
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		FromPageList = SupportLib.GetElementText(WebElementCollection);

		if (!Constant.TestCaseRow.get("ActionSupportValue").equalsIgnoreCase(
				"Blank")) {
			FromPageList = SupportLib.GetElementAttribute(WebElementCollection,
					Constant.TestCaseRow.get("ActionSupportValue"));
		} else {
			FromPageList = SupportLib.GetElementText(WebElementCollection);
		}
		for (String value : FromPageList) {
			Log.debug("ActionKeyword:List from page contains " + value);
		}
		Verification = Constant.TestCaseRow.get("Data");

		String[] verificationstring = Verification.split("-");
		int verification1 = Integer.parseInt(verificationstring[0]);
		int verification2 = Integer.parseInt(verificationstring[1]);
		Log.debug("ActionKeyword:Verification value 1 and 2 from script is "
				+ verification1 + " " + verification2);

		List<Integer> a1 = new ArrayList<Integer>();
		for (String FromPageValue : FromPageList) {
			a1 = SupportLib.ExtractRange(FromPageValue);
			int rangefrompage2 = a1.get(0);
			int rangefrompage1 = a1.get(0);
			if (a1.size() > 1) {
				rangefrompage2 = a1.get(1);

				if (verification1 >= rangefrompage1
						&& verification1 <= rangefrompage2
						|| verification2 >= rangefrompage1
						&& verification2 <= rangefrompage2
						|| verification1 <= rangefrompage1
						&& verification2 >= rangefrompage2) {
					Log.debug("ActionKeyword:Verify range logic is TRUE verification1 >= rangefrompage1 && verification1 <= rangefrompage2|| verification2 >= rangefrompage1 && verification2 <= rangefrompage2|| verification1 <= rangefrompage1 && verification2 >= rangefrompage2 "
							+ "for verification value"
							+ verification1
							+ " "
							+ verification2
							+ "for Page Value "
							+ rangefrompage1 + " " + rangefrompage2);

					Result = true;
					FromPage = FromPage + FromPageValue + ", ";
				} else {
					Log.debug("ActionKeyword:Verify range logic is False verification1 >= rangefrompage1 && verification1 <= rangefrompage2|| verification2 >= rangefrompage1 && verification2 <= rangefrompage2|| verification1 <= rangefrompage1 && verification2 >= rangefrompage2 "
							+ "for verification value"
							+ verification1
							+ " "
							+ verification2
							+ "for Page Value "
							+ rangefrompage1 + " " + rangefrompage2);
					ErrorValue = FromPageValue;
					Result = false;
					break;
				}
			} else {
				if (rangefrompage1 >= verification1
						&& rangefrompage1 <= verification2) {
					Result = true;
					FromPage = FromPage + FromPageValue + ", ";
				} else {
					ErrorValue = FromPageValue;
					Result = false;
					break;
				}
			}

		}
		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription") + "; "
					+ "Passed" + "; Value: " + Verification
					+ "; Present in Range from WebElements: " + FromPage;
			Log.pass(passMessage);
			ePassMessage = "Range provided for verification: " + Verification
					+ "; Present in value from WebElements: " + FromPage;
			ExtentLogs.Pass(ePassMessage);
		} else {
			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification
					+ "; is Not Present in Range from WebElements: "
					+ ErrorValue;
			Log.fail(failMessage);
			eFailMessage = "Range provided for verification : " + Verification
					+ "; is Not Present in value from WebElements: " + FromPage;
			ExtentLogs.Fail(eFailMessage);

		}

	}

	/**
	 * Function to verify Range available in the webelement test Fields
	 * required: Action, Element Location Test data: Should contain : as a
	 * splitter for more then one value to verify in the text
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyRangeif() throws Exception, Throwable {
		SupportLib.waitForAjax();
		int buffervalue = Constant.ExplicitWait;
		Constant.ExplicitWait = Constant.ExplicitWaitif;

		List<String> FromPageList = new ArrayList<String>();
		String Verification, FromPage = "", ErrorValue = "";
		boolean Result = false;
		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription") + "; "
					+ "WebElement not found on the page moving to next step";
			Log.info(infoMessage);
			skipMessage = "WebElement not found on the page moving to next step";
			eSkipMessage = " Action Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ " moving to next step";
			ExtentLogs.Skip(eSkipMessage);
			Log.skip(skipMessage);

		} else {
			FromPageList = SupportLib.GetElementText(WebElementCollection);
			if (!Constant.TestCaseRow.get("ActionSupportValue")
					.equalsIgnoreCase("Blank")) {
				FromPageList = SupportLib.GetElementAttribute(
						WebElementCollection,
						Constant.TestCaseRow.get("ActionSupportValue"));
			} else {
				FromPageList = SupportLib.GetElementText(WebElementCollection);
			}
			Verification = Constant.TestCaseRow.get("Data");
			String[] verificationstring = Verification.split("-");
			int verification1 = Integer.parseInt(verificationstring[0]);
			int verification2 = Integer.parseInt(verificationstring[1]);

			List<Integer> a1 = new ArrayList<Integer>();
			for (String FromPageValue : FromPageList) {
				a1 = SupportLib.ExtractRange(FromPageValue);
				int rangefrompage2 = a1.get(0);
				int rangefrompage1 = a1.get(0);
				if (a1.size() > 1) {
					rangefrompage2 = a1.get(1);

					if (verification1 >= rangefrompage1
							&& verification1 <= rangefrompage2
							|| verification2 >= rangefrompage1
							&& verification2 <= rangefrompage2
							|| verification1 <= rangefrompage1
							&& verification2 >= rangefrompage2) {

						Result = true;
						FromPage = FromPage + FromPageValue + ", ";
					} else {
						ErrorValue = FromPageValue;
						Result = false;
						break;
					}
				} else {
					if (rangefrompage1 >= verification1
							&& rangefrompage1 <= verification2) {
						Result = true;
						FromPage = FromPage + FromPageValue + ", ";
					} else {
						ErrorValue = FromPageValue;
						Result = false;
						break;
					}
				}

			}
			if (Result) {
				passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; " + "Passed" + "; Value: " + Verification
						+ "; Present in Range from WebElements: " + FromPage;
				Log.pass(passMessage);
				ePassMessage = "Range provided for verification: "
						+ Verification
						+ "; Present in value from WebElements: " + FromPage;
				ExtentLogs.Pass(ePassMessage);
			} else {
				SupportLib.createScreenshot();
				failMessage = "Failed: "
						+ Constant.TestCaseRow.get("TestStepID") + ": "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Value: " + Verification
						+ "; is Not Present in Range from WebElements: "
						+ ErrorValue;
				Log.fail(failMessage);
				eFailMessage = "Range provided for verification : "
						+ Verification
						+ "; is Not Present in value from WebElements: "
						+ FromPage;
				ExtentLogs.Fail(eFailMessage);

			}
		}

		Constant.ExplicitWait = buffervalue;
	}

	/**
	 * Function to verify value of web element generated randomly earlier in the
	 * test Fields required:Action, Element Location Test data: Should contain
	 * the index number of submitrandom action i.e of need to verfiy value
	 * randomely generated first time in the test script then test data should
	 * contain '0'
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyRandom() throws Exception, Throwable {
		SupportLib.waitForAjax();
		List<String> FromPageList = new ArrayList<String>();
		String Verification, FromPage = "";
		int arrayindex;
		arrayindex = Integer.parseInt(Constant.TestCaseRow.get("Data"));
		Verification = ValueCaptured.get(arrayindex);
		boolean Result = false;
		WebElementCollection = FindElements();

		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			FromPageList = SupportLib.GetElementAttribute(WebElementCollection,
					Constant.TestCaseRow.get("ActionSupportValue"));
		} else {
			FromPageList = SupportLib.GetElementText(WebElementCollection);
		}

		for (String FromPageValue : FromPageList) {
			FromPage = FromPage + FromPageValue + ", ";

			FromPageValue = FromPageValue.toLowerCase();
			Verification = Verification.toLowerCase();
			if (FromPageValue.contains(Verification)) {
				Result = true;

			} else {
				Result = false;
				break;
			}
		}

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + Verification
					+ "; Value form page: " + FromPage;
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + FromPage
					+ "; Againest verification value: " + Verification;
			ExtentLogs.Pass(ePassMessage);

		}

		else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + Verification
					+ "; Value form page: " + FromPage;
			Log.fail(failMessage);
			eFailMessage = "Verification Failed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + FromPage
					+ "; Againest verification value: " + Verification;
			ExtentLogs.Fail(eFailMessage);

		}

	}

	/**
	 * Capture Capache and process the logic (-,+,*,/) and save the result in
	 * the list(Need to remember the index no for further use)
	 */
	public static void CaptchaCapture() throws Exception, Throwable {
		SupportLib.waitForAjax();
		ActionElement = FindElement();
		String equation = ActionElement.getText();
		String[] parts, parts2;
		String leftPart, rightPart, subPart;
		int p1, p2, result = 0;
		parts = equation.split("[-+*/]");
		if (equation.contains("+")) {
			leftPart = parts[0];
			subPart = parts[1];

			parts2 = subPart.split("=");
			rightPart = parts2[0];

			p1 = Integer.parseInt(leftPart.trim());
			p2 = Integer.parseInt(rightPart.trim());
			result = p1 + p2;
		}

		if (equation.contains("-")) {
			leftPart = parts[0];
			subPart = parts[1];

			parts2 = subPart.split("=");
			rightPart = parts2[0];

			p1 = Integer.parseInt(leftPart.trim());
			p2 = Integer.parseInt(rightPart.trim());
			result = p1 - p2;
		}
		SpamCaptured.add(result);
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Captcha Captured: " + equation;
		Log.info(infoMessage);

		eInfoMessage = " Captcha is Captured: " + equation;
		ExtentLogs.info(eInfoMessage);
	}

	public static void SubmitCaptcha() throws Exception, Throwable {
		SupportLib.waitForAjax();
		int arrayIndex = 0;

		ActionElement = FindElement();
		arrayIndex = Integer.parseInt(Constant.TestCaseRow.get("Data"));

		String value = new Integer(SpamCaptured.get(arrayIndex)).toString();
		ActionElement.sendKeys(value);
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Submit Captcha: " + value;
		Log.info(infoMessage);
		eInfoMessage = "Submit Captcha is sucessfully done " + value;
		ExtentLogs.info(eInfoMessage);

	}

	/**
	 * Run common steps form another excel file for multiple test cases. Take
	 * test case SheetName from ElementLocation column and TestSuit name from
	 * Data Column.
	 */
	public static void CommonSteps() throws Throwable {
		Constant.commonsteps = true;
		String BufferTestScriptSheet, BufferTestScriptSheetworkbook, Commonstepssheet, Commonstepsworkbook;
		int i;
		i = TestCaseRunner.testScriptIndex;
		Commonstepssheet = Constant.TestCaseRow.get("Elementlocation");
		Commonstepsworkbook = Constant.TestCaseRow.get("Data");

		BufferTestScriptSheet = Constant.TestScriptSheet;
		BufferTestScriptSheetworkbook = Constant.TestScriptWorkbook;

		Constant.TestScriptSheet = Commonstepsworkbook;
		Constant.TestScriptWorkbook = Commonstepssheet;

		TestCaseRunner.teststepsrun();

		Constant.TestScriptSheet = BufferTestScriptSheet;
		Constant.TestScriptWorkbook = BufferTestScriptSheetworkbook;
		TestCaseRunner.testScriptIndex = i;
		Constant.commonsteps = false;
	}

	/**
	 * Function to Submit random Email address to a text field cases test Fields
	 * required:Action, Element Location should contain the sheet name for
	 * common steps
	 * 
	 * @throws Throwable
	 */

	public static void SubmitRandomMail() throws Throwable {
		SupportLib.waitForAjax();

		ActionElement = FindElement();
		String Submitvalue = SupportLib.RandomGenerator(5, 3);
		Submitvalue = Submitvalue + "@yopmail.com";

		ActionElement.sendKeys(Submitvalue);

		infoMessage = Constant.TestCaseRow.get("Testcaseid") + "; "
				+ Constant.TestCaseRow.get("TestStepID") + "; "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Submit Random Email Value: " + Submitvalue + "; ";

		Log.info(infoMessage);
		eInfoMessage = "; Action: Submit Random Email Value: " + Submitvalue;
		ExtentLogs.info(eInfoMessage);
	}

	public static void verifyElementCount() throws Exception, Throwable {
		SupportLib.waitForAjax();
		List<WebElement> located_elements = FindElements();
		if (located_elements == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;

		}
		int count = 0;
		for (WebElement located_element : located_elements) {

			if (located_element.isDisplayed() && located_element.isEnabled()) {
				count++;
			}
		}

		String Operatorvalue;
		int LogicalCase = 0;
		HashMap<String, Integer> LogicalOperator = new HashMap<String, Integer>();
		boolean Result = false;
		int verification;

		LogicalOperator.put("<", 1);
		LogicalOperator.put(">", 2);
		LogicalOperator.put("=>", 3);
		LogicalOperator.put("<=", 4);
		LogicalOperator.put("!=", 5);
		LogicalOperator.put("=", 6);

		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		String fromscript = "";
		fromscript = Constant.TestCaseRow.get("Data");
		if (fromscript.contains(",")) {
			Operatorvalue = fromscript.split(",")[1];
			LogicalCase = LogicalOperator.get(Operatorvalue);
		}

		if (!Constant.TestCaseRow.get("Data").contains("Capture:")) {
			verification = SupportLib.ExtractInt(fromscript.split(",")[0]);
		} else {

			int i = SupportLib.ExtractInt(fromscript.split(",")[0]);
			fromscript = ValueCaptured.get(i);
			List<Integer> fromScriptList = new ArrayList<Integer>();
			fromScriptList = SupportLib.ExtractRange(fromscript);
			verification = fromScriptList.get(0);
		}

		String Printvalue = "";

		switch (LogicalCase) {
		case 0:
			if (verification == count) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 1:
			if (verification > count) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 2:
			if (verification < count) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 3:
			if (verification >= count) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 4:
			if (verification <= count) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 5:
			if (verification != count) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 6:
			if (verification == count) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		}

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Element count from page: " + count
					+ "; User Defined Value: " + verification;
			Log.pass(passMessage);

			ePassMessage = "Verification of Elementcount pass for the value from page: "
					+ count + " againest User Defined Value: " + verification;
			ExtentLogs.Pass(ePassMessage);
		} else {
			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ ": Element count from page: " + count
					+ "User Defined Value: " + verification;
			Log.fail(failMessage);

			eFailMessage = "Verification of numbers fail for the value from page: "
					+ Printvalue
					+ " againest User Defined Value: "
					+ verification;
			ExtentLogs.Fail(eFailMessage);
		}

	}

	public static void verifyElementCountif() throws Exception, Throwable {
		SupportLib.waitForAjax();
		List<WebElement> located_elements = FindElements();

		if (located_elements == null) {
			skipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Action Element is not present moving to next step";
			Log.skip(skipMessage);
			eSkipMessage = " Action Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ " moving to next step";
			ExtentLogs.Skip(eSkipMessage);
		} else {
			int count = 0;
			for (WebElement located_element : located_elements) {

				if (located_element.isDisplayed()
						&& located_element.isEnabled()) {
					count++;
				}
			}

			String Operatorvalue;
			int LogicalCase = 0;
			HashMap<String, Integer> LogicalOperator = new HashMap<String, Integer>();
			boolean Result = false;
			int verification;

			LogicalOperator.put("<", 1);
			LogicalOperator.put(">", 2);
			LogicalOperator.put("=>", 3);
			LogicalOperator.put("<=", 4);
			LogicalOperator.put("!=", 5);
			WebElementCollection = FindElements();
			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			}

			String fromscript = "";
			fromscript = Constant.TestCaseRow.get("Data");
			if (fromscript.contains(",")) {
				Operatorvalue = fromscript.split(",")[1];
				LogicalCase = LogicalOperator.get(Operatorvalue);
			}

			if (!Constant.TestCaseRow.get("Data").contains("Capture:")) {
				verification = SupportLib.ExtractInt(fromscript.split(",")[0]);
			} else {

				int i = SupportLib.ExtractInt(fromscript.split(",")[0]);
				fromscript = ValueCaptured.get(i);
				List<Integer> fromScriptList = new ArrayList<Integer>();
				fromScriptList = SupportLib.ExtractRange(fromscript);
				verification = fromScriptList.get(0);
			}

			String Printvalue = "";

			switch (LogicalCase) {
			case 0:
				if (verification == count) {
					Result = true;
				} else {
					Result = false;
				}
				break;
			case 1:
				if (verification > count) {
					Result = true;
				} else {
					Result = false;
				}
				break;
			case 2:
				if (verification < count) {
					Result = true;
				} else {
					Result = false;
				}
				break;
			case 3:
				if (verification >= count) {
					Result = true;
				} else {
					Result = false;
				}
				break;
			case 4:
				if (verification <= count) {
					Result = true;
				} else {
					Result = false;
				}
				break;
			case 5:
				if (verification != count) {
					Result = true;
				} else {
					Result = false;
				}
				break;
			}

			if (Result) {
				passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Passed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Element count from page: " + count
						+ "; User Defined Value: " + verification;
				Log.pass(passMessage);

				ePassMessage = "Verification of Elementcount pass for the value from page: "
						+ count
						+ " againest User Defined Value: "
						+ verification;
				ExtentLogs.Pass(ePassMessage);
			} else {
				SupportLib.createScreenshot();
				failMessage = "Failed: "
						+ Constant.TestCaseRow.get("TestStepID") + ": "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ ": Element count from page: " + count
						+ "User Defined Value: " + verification;
				Log.fail(failMessage);

				eFailMessage = "Verification of numbers fail for the value from page: "
						+ Printvalue
						+ " againest User Defined Value: "
						+ verification;
				ExtentLogs.Fail(eFailMessage);
			}
		}

	}

	/**
	 * Capture the element count provided in particular Xpath, Id, CSS, etc.
	 */
	public static void CaptureElementCount() throws Exception, Throwable {
		SupportLib.waitForAjax();

		List<WebElement> located_elements = FindElements();
		if (located_elements == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;

		}
		int count = 0;
		for (WebElement located_element : located_elements) {
			if (located_element.isDisplayed() && located_element.isEnabled()) {
				count++;
			}
		}

		String countstr = Integer.toString(count);

		ValueCaptured.add(countstr);
		int size = ValueCaptured.size();
		size = size - 1;
		infoMessage = ValueCaptured.get(size)
				+ "; Count Value has been stored in index: " + size;
		Log.info(infoMessage);
		eInfoMessage = ValueCaptured.get(size)
				+ "; Count Value has been stored in index: " + size;
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * Capture the number of count of elements and store in index
	 * accordingly(if->if element present, then it capture the count, else move
	 * to next step).
	 */
	public static void CaptureElementCountif() throws Exception, Throwable {
		SupportLib.waitForAjax();

		List<WebElement> located_elements = FindElements();
		if (located_elements == null) {
			ValueCaptured.add("Blank");
			skipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Action Element is not present moving to next step";
			Log.skip(skipMessage);
			eSkipMessage = " Action Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ " moving to next step";
			ExtentLogs.Skip(eSkipMessage);
		}

		else {
			int count = 0;
			for (WebElement located_element : located_elements) {
				if (located_element.isEnabled()) {
					count++;
				}
			}

			String countstr = Integer.toString(count);

			ValueCaptured.add(countstr);
			int size = ValueCaptured.size();
			size = size - 1;
			infoMessage = ValueCaptured.get(size)
					+ "; Count Value has been stored in index: " + size;
			Log.info(infoMessage);
			eInfoMessage = ValueCaptured.get(size)
					+ "; Count Value has been stored in index: " + size;
			ExtentLogs.info(eInfoMessage);
		}
	}

	/**
	 * Function to verify if Web element is available in the webpage Fields
	 * required: Action, Element Location Test data, and data 1 is optional
	 * 
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */

	public static void VerifyIf() throws Exception, Throwable {
		SupportLib.waitForAjax();
		int buffervalue = Constant.ExplicitWait;
		Constant.ExplicitWait = Constant.ExplicitWaitif;
		List<String> FromPageList = new ArrayList<String>();
		String Verification, FromPage = "";
		boolean Result = false;
		WebElementCollection = FindElements();

		if (WebElementCollection == null) {
			infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Action Element is not present moving to next step";
			skipMessage = "Action Element is not present moving to next step";
			eSkipMessage = " Action Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ " moving to next step";
			ExtentLogs.Skip(eSkipMessage);
			Log.skip(skipMessage);
		} else {

			if (!Constant.TestCaseRow.get("ActionSupportValue").contains(
					"Blank")) {
				FromPageList = SupportLib.GetElementAttribute(
						WebElementCollection,
						Constant.TestCaseRow.get("ActionSupportValue"));
			} else {
				FromPageList = SupportLib.GetElementText(WebElementCollection);
			}
			Verification = Constant.TestCaseRow.get("Data");

			for (String FromPageValue : FromPageList) {
				FromPage = FromPage + FromPageValue + ", ";

				FromPageValue = FromPageValue.toLowerCase();
				Verification = Verification.toLowerCase();
				if (FromPageValue.contains(Verification)) {
					Result = true;
				} else {
					Result = false;
					break;
				}
			}

			if (Result) {

				passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Passed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Value: " + Verification
						+ "; Present in Page values: " + FromPage;
				ePassMessage = " Verification passed for the Value: "
						+ Verification + "; is Not Present in Page values: "
						+ FromPage;
				ExtentLogs.Pass(ePassMessage);
				Log.pass(passMessage);
			} else {

				SupportLib.createScreenshot();
				failMessage = "Failed: "
						+ Constant.TestCaseRow.get("TestStepID") + ": "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Value: " + Verification
						+ "; is Not Present in Page values: " + FromPage;

				Log.fail(failMessage);

				eFailMessage = " Verification failed for the Value: "
						+ Verification + "; is Not Present in Page values: "
						+ FromPage;
				ExtentLogs.Fail(eFailMessage);

			}
		}

		Constant.ExplicitWait = buffervalue;

		Log.info(infoMessage);

	}

	
	// new 
	
	public static void VerifyElementIf() throws Exception, Throwable {
		SupportLib.waitForAjax();
		int buffervalue = Constant.ExplicitWait;
		Constant.ExplicitWait = Constant.ExplicitWaitif;
		List<String> FromPageList = new ArrayList<String>();
		String Verification, FromPage = "";
		boolean Result = false;
		WebElementCollection = FindElements();

		if (WebElementCollection == null) {
			infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Action Element is not present moving to next step";
			skipMessage = Constant.TestCaseRow.get("TestStepID") + "; "+"Action Element is not present moving to next step";
			eSkipMessage =Constant.TestCaseRow.get("TestStepID") + "; "+ " Action Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ " moving to next step";
			ExtentLogs.Skip(eSkipMessage);
			Log.skip(skipMessage);
		} else {

			
					Result = true;
				


				passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Passed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						
						+ "; Present in Page  ";
				ePassMessage =  Constant.TestCaseRow.get("TeststepDescription")
						
						+ "; Present in Page  ";
				ExtentLogs.Pass(ePassMessage);
				Log.pass(passMessage);
			} 
		



	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * VerifySortNum will verify any list of numbers are sort as per data
	 * provided: Action, Element locator type, Element Location Test data: only
	 * "Asc" or "Dsc"
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifySortNR() throws Exception, Throwable {
		Log.debug("ActionKeyword:VerifySortNR Waiting for Ajax");
		SupportLib.waitForAjax();
		Log.debug("ActionKeyword:VerifySortNR Finding elements");
		WebElementCollection = FindElements();
		Log.debug("ActionKeyword:VerifySortNR Elements found"
				+ WebElementCollection.size());
		List<String> elements = new LinkedList<String>();
		List<Integer> Rangecomplete = new ArrayList<Integer>();
		List<Integer> Range = new ArrayList<Integer>();
		if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			for (WebElement we : WebElementCollection) {

				elements.add(we.getAttribute(Constant.TestCaseRow
						.get("ActionSupportValue")));
			}
		}

		else {

			for (WebElement we : WebElementCollection) {

				elements.add(we.getText());
				Log.debug("ActionKeyword:VerifySortNR Extracting values are"
						+ we.getText());
			}

		}

		for (String s : elements) {
			Rangecomplete = SupportLib.ExtractRange(s);
			Range.add(Rangecomplete.get(0));
			Log.debug("ActionKeyword:VerifySortNR Extracting values are"
					+ Rangecomplete.get(0));
		}

		boolean value = SupportLib.checknumbersort(Range,
				Constant.TestCaseRow.get("Data"));
		Log.debug("ActionKeyword:VerifySortNR Boolean result is");
		if (value) {
			Log.debug("ActionKeyword:VerifySortNR Boolean result is true");
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; List appear in page is sorted by order: "
					+ Constant.TestCaseRow.get("Data");

			Log.pass(passMessage);
			ePassMessage = "List appear in page is  sorted by order: "
					+ Constant.TestCaseRow.get("Data");
			ExtentLogs.Pass(ePassMessage);
		}

		else {
			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "List appear in page is not sorted by order: "
					+ Constant.TestCaseRow.get("Data");
			Log.fail(failMessage);
			eFailMessage = "List appear in page is not sorted by order: "
					+ Constant.TestCaseRow.get("Data");
			ExtentLogs.Fail(eFailMessage);

		}
	}

	/**
	 * VerifySorttool will verify any list of numbers are sort as per data
	 * provided: Action, Element locator type, Element Location Test data: only
	 * "Asc" or "Dsc" This perticulat method customized for a specific
	 * requirment of module need to seperate it
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifySortTooltip() throws Exception, Throwable {
		SupportLib.waitForAjax();

		WebElementCollection = FindElements();
		List<String> elements = new ArrayList<String>();
		List<Integer> Range = new ArrayList<Integer>();
		if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			for (WebElement we : WebElementCollection) {

				elements.add(we.getAttribute(Constant.TestCaseRow
						.get("ActionSupportValue")));
				if (we.getAttribute(
						Constant.TestCaseRow.get("ActionSupportValue"))
						.isEmpty()) {
					elements.add(we.getAttribute("innerHTML"));

				}
			}
		} else {

			for (WebElement we : WebElementCollection) {

				elements.add(we.getText());
				if (we.getText().isEmpty()) {
					elements.add(we.getAttribute("innerHTML"));
				}
			}

		}

		for (String s : elements) {
			if (s.isEmpty()) {
				continue;
			}
			int i = SupportLib.Extracttooltip(s);
			Range.add(i);
		}

		boolean value = SupportLib.checknumbersort(Range,
				Constant.TestCaseRow.get("Data"));
		if (value) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; List appear in page is sorted by order: "
					+ Constant.TestCaseRow.get("Data");

			Log.pass(passMessage);
			ePassMessage = "List appear in page is  sorted by order: "
					+ Constant.TestCaseRow.get("Data");
			ExtentLogs.Pass(ePassMessage);
		} else {
			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "List appear in page is not sorted by order: "
					+ Constant.TestCaseRow.get("Data");
			Log.fail(failMessage);
			eFailMessage = "List appear in page is not sorted by order: "
					+ Constant.TestCaseRow.get("Data");
			ExtentLogs.Fail(eFailMessage);

		}
	}

	/**
	 * VerifySortstring will verify any list of String are sort as per data
	 * provided: Action, Element locator type, Element Location Test data: only
	 * "Asc" or "Dsc"
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifySortString() throws Exception, Throwable {
		SupportLib.waitForAjax();

		WebElementCollection = FindElements();
		List<String> elements = new ArrayList<String>();
		if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			for (WebElement we : WebElementCollection) {

				elements.add(we.getAttribute(Constant.TestCaseRow
						.get("ActionSupportValue")));
				if (we.getAttribute(
						Constant.TestCaseRow.get("ActionSupportValue"))
						.isEmpty()) {
					elements.add(we.getAttribute("innerHTML"));
				}
			}
		} else {

			for (WebElement we : WebElementCollection) {

				elements.add(we.getText());
				if (we.getText().isEmpty()) {
					elements.add(we.getAttribute("innerHTML"));
				}
			}

		}

		boolean value = SupportLib.checkstringsort(elements,
				Constant.TestCaseRow.get("Data"));
		if (value) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; List appear in page is sorted by order: "
					+ Constant.TestCaseRow.get("Data");
			ePassMessage = "List appear in page is  sorted by order: "
					+ Constant.TestCaseRow.get("Data");
			ExtentLogs.Pass(ePassMessage);

			Log.pass(passMessage);
		} else {
			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "List appear in page is not sorted by order: "
					+ Constant.TestCaseRow.get("Data");
			eFailMessage = "List appear in page is not sorted by order: "
					+ Constant.TestCaseRow.get("Data");
			ExtentLogs.Fail(eFailMessage);
			Log.fail(failMessage);

		}
	}

	/**
	 * this action will add the attribute value visibility=hidden to the list of
	 * elements .This action require address of array of element in the element
	 * column
	 */
	public static void HideMapTicker() throws Exception, Throwable {
		SupportLib.waitForAjax();

		List<WebElement> WebElements = FindElements();
		if (WebElements == null) {
			skipMessage = Constant.TestCaseRow.get("TestStepID")
					+ "; "
					+ "Skiped; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Map ticker are not available on the screen moving to next step";
			Log.skip(skipMessage);
			eSkipMessage = " Map ticker are not available on the screen moving to next step";
			ExtentLogs.Skip(eSkipMessage);
			return;
		}

		String js = "arguments[0].style.visibility='hidden';";

		for (WebElement element : WebElements) {
			((JavascriptExecutor) driver).executeScript(js, element);

		}

		infoMessage = Constant.TestCaseRow.get("TestStepID") + "; "
				+ "Passed; " + Constant.TestCaseRow.get("TeststepDescription")
				+ "; CSS value" + Constant.TestCaseRow.get("Data")
				+ "is set for all the ticker";
		Log.info(infoMessage);
		eInfoMessage = " Map ticker value attribute is set to hide for all the ticker";
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * Function which can be modified to test all the function Test data: TBD
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void ShowMapTicker() throws Exception, Throwable {
		SupportLib.waitForAjax();

		List<WebElement> WebElements = FindElements();
		String js = "arguments[0].style.visibility='visible';";

		for (WebElement element : WebElements) {
			((JavascriptExecutor) driver).executeScript(js, element);

		}

		infoMessage = Constant.TestCaseRow.get("TestStepID") + "; "
				+ "Passed; " + Constant.TestCaseRow.get("TeststepDescription")
				+ "; CSS value" + Constant.TestCaseRow.get("Data")
				+ "is set for all the ticker: ";
		Log.info(infoMessage);
		eInfoMessage = " Map ticker value attribute is set to visible for all the ticker and"
				+ Constant.TestCaseRow.get("Data")
				+ "is set for all the attribute: ";
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * Change attribute of a element data should contain the value of attribute
	 * which we need to set i.e " style.visibility=hidden
	 */
	public static void changeAttribute() throws Exception, Throwable {
		SupportLib.waitForAjax();
		WebElement WebElements = FindElement();
		String dataValue = Constant.TestCaseRow.get("Data");

		String js = "arguments[0]." + dataValue + ";";

		if (dataValue.contains("removeReadOnly")) {
			js = "arguments[0].removeAttribute('readonly','readonly')";
		}

		((JavascriptExecutor) driver).executeScript(js, WebElements);

		infoMessage = Constant.TestCaseRow.get("TestStepID") + "; "
				+ "Passed; " + Constant.TestCaseRow.get("TeststepDescription")
				+ "; CSS value" + Constant.TestCaseRow.get("Data")
				+ "is set for the Element: ";
		Log.info(infoMessage);
		eInfoMessage = " CSS value" + Constant.TestCaseRow.get("Data")
				+ "is set for all the Element: ";
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * "Change attribute of a elements data should contain the value of attribute which we need to set i.e "
	 * " style.visibility=hidden Need to provide WebElement Array location in
	 * Element address field."
	 */
	public static void changeAttributeGroup() throws Exception, Throwable {
		SupportLib.waitForAjax();
		List<WebElement> WebElements = FindElements();
		String js = "arguments[0].style." + Constant.TestCaseRow.get("Data")
				+ ";";

		for (WebElement element : WebElements) {
			((JavascriptExecutor) driver).executeScript(js, element);

		}

		infoMessage = Constant.TestCaseRow.get("TestStepID") + "; "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; CSS value" + Constant.TestCaseRow.get("Data")
				+ "is set for all the nodes: ";
		Log.info(infoMessage);
		eInfoMessage = " CSS value" + Constant.TestCaseRow.get("Data")
				+ "is set for all the nodes: ";
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * Function to verify text of web element Fields required:Action, Element
	 * Location Test data: Verification value for the text
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyTextExact() throws Exception, Throwable {
		SupportLib.waitForAjax();
		String fetchfrompage, Verification;
		ActionElement = FindElement();
		if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			fetchfrompage = ActionElement.getAttribute(Constant.TestCaseRow
					.get("ActionSupportValue"));
		} else {
			fetchfrompage = ActionElement.getText();
		}
		Verification = Constant.TestCaseRow.get("Data");
		System.out.println(fetchfrompage);
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription");

		fetchfrompage = fetchfrompage.toLowerCase();
		Verification = Verification.toLowerCase();
		if (fetchfrompage.equals(Verification)) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; from page: " + fetchfrompage
					+ "; User Defined Value: " + Verification;

			Log.pass(passMessage);

			ePassMessage = "Exact Verification Pass for value from page: "
					+ fetchfrompage + "User Defined Value: " + Verification;
			ExtentLogs.Pass(ePassMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ ": from page: " + fetchfrompage + "User Defined Value: "
					+ Verification;
			Log.fail(failMessage);
			eFailMessage = "Exact Verification fail for value from page: "
					+ fetchfrompage + "User Defined Value: " + Verification;
			ExtentLogs.Fail(eFailMessage);
		}

	}

	/**
	 * Function to verify web element is not associated with the DOM or not
	 * displayed on the page Fields required:Action, Element Location Test data:
	 * Verification value for the text
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyNot() throws Exception, Throwable {
		Log.debug("ActionKeyword>VerifyNot: is called");
		SupportLib.waitForAjax();
		boolean Result = false;
		WebElementCollection = FindElements();
		if (WebElementCollection == null || WebElementCollection.size() == 0) {
			Log.debug("ActionKeyword>VerifyNot: Logic to check that element is not associated with the respective DOM");
			Result = true;
		}

		else {

			for (WebElement webelement : WebElementCollection) {
				Log.debug("ActionKeyword>VerifyNot: Iterator run started to check visibility if elements are associated with respective DOM");
				boolean status = webelement.isDisplayed();
				if (status) {
					Result = false;
					break;
				} else {
					Result = true;

				}
			}
		}
		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Element is not present/dispayed on the page";
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "; Not Present on the page";
			ExtentLogs.Pass(ePassMessage);

		}

		else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Element is present/displayed on the page";
			Log.fail(failMessage);
			eFailMessage = "Verification Failed for Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ ";Element is present and displayed on the page ";
			ExtentLogs.Fail(eFailMessage);

		}

	}

	// For verify that specified text is not present in the element
	public static void VerifyTextNot() throws Exception, Throwable {
		SupportLib.waitForAjax();
		List<String> FromPageList = new ArrayList<String>();
		String Verification, FromPage = "";
		boolean Result = false;
		WebElementCollection = FindElements();

		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			FromPageList = SupportLib.GetElementAttribute(WebElementCollection,
					Constant.TestCaseRow.get("ActionSupportValue"));
		} else {
			FromPageList = SupportLib.GetElementText(WebElementCollection);
		}
		if (Constant.TestCaseRow.get("Data").contains("Capture:")) {
			String fromscript = Constant.TestCaseRow.get("Data");
			int i = SupportLib.ExtractInt(fromscript.split(",")[0]);
			Verification = ValueCaptured.get(i);

		} else {
			Verification = Constant.TestCaseRow.get("Data");
		}
		for (String FromPageValue : FromPageList) {
			FromPage = FromPage + FromPageValue + ", ";

			FromPageValue = FromPageValue.toLowerCase();
			Verification = Verification.toLowerCase();
			if (FromPageValue.contains(Verification)) {
				Result = false;

			} else {
				Result = true;
				break;
			}
		}

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + Verification
					+ "; Value form page: " + FromPage+"  should not be same";
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + FromPage
					+ "; Againest verification value" + Verification
					+ "present on the in the element";
			ExtentLogs.Pass(ePassMessage);

		}

		else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + Verification
					+ "; Value form page: " + FromPage;
			Log.fail(failMessage);
			eFailMessage = "Verification Failed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + FromPage
					+ "; Againest verification value: " + Verification
					+ "both are same";
			ExtentLogs.Fail(eFailMessage);

		}

	}

	public static void TellmeTheFramename() throws Exception, Throwable {
		List<WebElement> ele = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of frames in a page :" + ele.size());
	}

	/**
	 * Print current active window title, Url in the logger
	 */
	public static void GetDetail() throws Exception, Throwable {
		SupportLib.waitForAjax();
		System.out.println("Active Page Title is" + driver.getTitle()
				+ "URL is" + driver.getCurrentUrl() + driver.getPageSource());

	}

	public static void iFrameSwitchTo() throws Exception, Throwable {

		SupportLib.waitForAjax();
		int TempWait = Constant.ExplicitWait;
		Constant.ExplicitWait = 1;
		List<WebElement> ele = driver.findElements(By.tagName("iframe"));
		int frameno = 0;
		boolean Result = false;

		for (frameno = 0; frameno <= ele.size(); frameno++) {
			ele = driver.findElements(By.tagName("iframe"));
			driver.switchTo().frame(frameno);
			ActionElement = FindElement();

			if (ActionElement != null && ActionElement.isDisplayed()) {
				activeframe.add(frameno);
				Result = true;
				break;

			} else {
				driver.switchTo().defaultContent();
			}

		}

		if (!Result) {
			infoMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "Not able to find the element in any of the present Frame Switched";
			Log.info(infoMessage);
		} else {
			infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "Frame Switched";
		}
		Constant.ExplicitWait = TempWait;
		Log.info(infoMessage);
	}

	/**
	 * VerifySortDate will verify any list of String contains date in dd MMMM
	 * formate are sort as per data provided: Action, Element locator type,
	 * Element Location Test data: only "Asc" or "Dsc"
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifySortDate() throws Exception, Throwable {
		SupportLib.waitForAjax();

		WebElementCollection = FindElements();
		List<String> elements = new ArrayList<String>();
		if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			for (WebElement we : WebElementCollection) {

				elements.add(we.getAttribute(Constant.TestCaseRow
						.get("ActionSupportValue")));
				if (we.getAttribute(
						Constant.TestCaseRow.get("ActionSupportValue"))
						.isEmpty()) {
					elements.add(we.getAttribute("innerHTML"));

				}
			}
		} else {

			for (WebElement we : WebElementCollection) {

				elements.add(we.getText());
				if (we.getText().isEmpty()) {
					elements.add(we.getAttribute("innerHTML"));
				}
			}

		}

		boolean value = SupportLib.checkDatesort(elements,
				Constant.TestCaseRow.get("Data"));
		if (value == true) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; List appear in page is sorted by order: "
					+ Constant.TestCaseRow.get("Data");
			Log.pass(passMessage);
			ePassMessage = "List appear in page is  sorted by order: "
					+ Constant.TestCaseRow.get("Data");
			ExtentLogs.Pass(ePassMessage);
		}

		else {
			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "List appear in page is not sorted by order: "
					+ Constant.TestCaseRow.get("Data");
			Log.fail(failMessage);
			eFailMessage = "List appear in page is not sorted by order: "
					+ Constant.TestCaseRow.get("Data");
			ExtentLogs.Fail(eFailMessage);

		}
	}

	/**
	 * VerifyInnerHTML will verify any againest a text in the innerHTML of a
	 * Element
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyInnerHTML() throws Exception, Throwable {
		SupportLib.waitForAjax();
		ActionElement = FindElement();
		String fetchfrompage = ActionElement.getAttribute("innerHTML");
		System.out.println(fetchfrompage);
		String Verification = Constant.TestCaseRow.get("Data");

		fetchfrompage = fetchfrompage.toLowerCase();
		Verification = Verification.toLowerCase();
		if (fetchfrompage.contains(Verification)) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; User Defined Value: " + Verification
					+ "Found in the element HTML";

			Log.pass(passMessage);
			ePassMessage = " User Defined Value: " + Verification
					+ "Found in the element HTML";
			ExtentLogs.Pass(ePassMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "User Defined Value: " + Verification
					+ ": Dose not found in the element HTML";
			eFailMessage = " User Defined Value: " + Verification
					+ "is not Available in element HTML";
			ExtentLogs.Fail(eFailMessage);
			Log.fail(failMessage);

		}

	}

	/**
	 * VerifyNumberexist will verify that is there are number available in
	 * webelement text/attribute value provided: Action, Element locator type,
	 * Element Location
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */

	public static void VerifyNumberexist() throws Exception, Throwable {
		SupportLib.waitForAjax();
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Verification of numbers in a string ";
		ActionElement = FindElement();
		String valuefrompage;

		if (Constant.TestCaseRow.get("ActionSupportValue") != "Blank") {
			valuefrompage = ActionElement.getAttribute(Constant.TestCaseRow
					.get("ActionSupportValue"));
		} else {
			valuefrompage = ActionElement.getText();
		}
		int i = SupportLib.ExtractInt(valuefrompage);
		if (i != 0) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Webelement contains number in text " + valuefrompage;
			Log.pass(passMessage);
			ePassMessage = "Webelement contains number in text "
					+ valuefrompage;
			ExtentLogs.Pass(ePassMessage);
		} else {
			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Webelement dose not contains number in text "
					+ valuefrompage;
			Log.fail(failMessage);
			eFailMessage = "Webelement dose not contains number in text "
					+ valuefrompage;
			ExtentLogs.Fail(eFailMessage);
		}

	}

	public static void VerifyStrLen() throws Exception, Throwable {
		SupportLib.waitForAjax();
		String fetchfrompage;
		boolean Result = false;
		int verification;

		String Operatorvalue;
		int LogicalCase = 0;
		HashMap<String, Integer> LogicalOperator = new HashMap<String, Integer>();
		LogicalOperator.put(">", 1);
		LogicalOperator.put("<", 2);
		LogicalOperator.put("=>", 3);
		LogicalOperator.put("<=", 4);
		LogicalOperator.put("!=", 5);
		String fromscript = "";

		fromscript = Constant.TestCaseRow.get("Data");
		if (fromscript.contains(",")) {
			Operatorvalue = fromscript.split(",")[1];
			LogicalCase = LogicalOperator.get(Operatorvalue);
		}

		if (!Constant.TestCaseRow.get("Data").contains("Capture:")) {
			verification = SupportLib.ExtractInt(fromscript.split(",")[0]);
		} else {
			int i = SupportLib.ExtractInt(fromscript.split(",")[0]);
			fromscript = ValueCaptured.get(i);
			verification = Integer.valueOf(fromscript);
		}

		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		fetchfrompage = ActionElement.getText();

		int StrLenPage = fetchfrompage.length();

		switch (LogicalCase) {
		case 0:
			if (verification == StrLenPage) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 1:
			if (verification > StrLenPage) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 2:
			if (verification < StrLenPage) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 3:
			if (verification >= StrLenPage) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 4:
			if (verification <= StrLenPage) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 5:
			if (verification != StrLenPage) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		}
		if (Result) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; String Lenght from page: " + StrLenPage
					+ "; User Defined Value: " + verification;
			ePassMessage = " Length verification passed; Length for verificaiton: "
					+ verification
					+ "; Lenght of Value form page: "
					+ StrLenPage;
			ExtentLogs.Pass(ePassMessage);
			Log.pass(passMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ ": String Lenght from page: " + StrLenPage
					+ "User Defined Value: " + verification;
			eFailMessage = " Length verification Failed; Length of Captured text: "
					+ verification
					+ "; Lenght of Value form page: "
					+ StrLenPage;
			ExtentLogs.Fail(eFailMessage);
			Log.fail(failMessage);

		}

	}

	/**
	 * Capture the length of the element.
	 */
	public static void CapturStrLen() throws Exception, Throwable {
		SupportLib.waitForAjax();
		String fetchfrompage;

		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		fetchfrompage = ActionElement.getText();

		String StrLenPage = Integer.toString(fetchfrompage.length());

		ValueCaptured.add(StrLenPage);
		int size = ValueCaptured.size();
		size = size - 1;
		infoMessage = ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		Log.info(infoMessage);
		eInfoMessage = ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		ExtentLogs.info(eInfoMessage);

	}

	public static void VerifyCaptureLength() throws Exception, Throwable {
		SupportLib.waitForAjax();
		int fetchfrompage, Verification;
		int arrayindex = 0;
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Verify stored value";

		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		arrayindex = Integer.parseInt(Constant.TestCaseRow.get("Data"));

		Verification = Integer.valueOf(ValueCaptured.get(arrayindex));
		if (Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			fetchfrompage = (ActionElement.getText()).length();

			if (fetchfrompage == Verification) {
				passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Passed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ ";Length of Captured text: " + Verification
						+ ";Length of Value form page: " + fetchfrompage;
				Log.pass(passMessage);
				ePassMessage = " Length verification passed; Length of Captured text: "
						+ Verification
						+ "; Lenght of Value form page: "
						+ fetchfrompage;
				ExtentLogs.Pass(ePassMessage);

			} else {
				failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
						+ ": "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ ";Length of Captured text: " + Verification
						+ ";Length of Value form page: " + fetchfrompage;
				Log.fail(failMessage);

				eFailMessage = " Length verification failed; Length of Captured text: "
						+ Verification
						+ "; Lenght of Value form page: "
						+ fetchfrompage;
				ExtentLogs.Fail(eFailMessage);
			}

		} else if (!Constant.TestCaseRow.get("ActionSupportValue").contains(
				"Blank")) {

			fetchfrompage = ActionElement.getAttribute(
					Constant.TestCaseRow.get("ActionSupportValue")).length();

			if (Verification == fetchfrompage) {
				passMessage = Constant.TestCaseRow.get("TestStepID") + ": "

				+ "Passed; " + Constant.TestCaseRow.get("TeststepDescription")
						+ ";Length of Captured text: " + Verification
						+ "; Lenght of Value form page: " + fetchfrompage;
				Log.pass(passMessage);
				ePassMessage = " Length verification passed; Length of Captured text: "
						+ Verification
						+ "; Lenght of Value form page: "
						+ fetchfrompage;
				ExtentLogs.Pass(ePassMessage);
			} else {
				failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
						+ ": "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Length of Captured text: " + Verification
						+ "; Lenght of Value form page: " + fetchfrompage;
				Log.fail(failMessage);

				eFailMessage = " Length verification failed; Length of Captured text: "
						+ Verification
						+ "; Lenght of Value form page: "
						+ fetchfrompage;
				ExtentLogs.Fail(eFailMessage);
			}

		}

	}

	/**
	 * Capture and stored value to use further in the script Fields required:
	 * Action, Element locator type, Element Location, Test data: N/A
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void ValuesCapture() throws Exception, Throwable {
		SupportLib.waitForAjax();
		
		
		List<String> FromPageList = new ArrayList<String>();
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Capture and stored value";

		
		String str;
		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
	
			
			
			if(Constant.TestCaseRow.get("ActionSupportValue").contains("line[")){
				String storeTmp = Constant.TestCaseRow.get("ActionSupportValue");
				str = storeTmp.replaceAll("[^0-9]+", " ");
				str = str.trim();
				
				Integer index = Integer.valueOf(str);
				
				FromPageList = SupportLib.GetParticularText(WebElementCollection,index);
				
				ValuesCaptured.addAll(FromPageList);
				
				// optima specific as last values are average and we are not storing these value in excel file
				
				ValuesCaptured.remove(ValuesCaptured.size()-1);
				ValuesCaptured.remove(ValuesCaptured.size()-1);
			
		} else {
			for (WebElement we : WebElementCollection) {
				ValuesCaptured.add(we.getText());
			}
		}

		for (String value : ValuesCaptured) {
			infoMessage = infoMessage + ", " + value;
		}
		infoMessage = "List of following Values has been stored" + infoMessage;
		Log.info(infoMessage);
		eInfoMessage = "List of following Values has been stored" + infoMessage;
		ExtentLogs.info(eInfoMessage);
	}

	
	
	
	
	
	
	// new
	// this function is used if we need two values capture
	
	public static void ValuesCaptureSupport() throws Exception, Throwable {
		SupportLib.waitForAjax();
		
		
		List<String> FromPageList = new ArrayList<String>();
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Capture and stored value";

		
		String str;
		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
	
			
			
		
				
				FromPageList = SupportLib.GetElementText(WebElementCollection);
				
				compsetRate.addAll(FromPageList);
				
				
				
			
		
		for (String value : compsetRate) {
			infoMessage = infoMessage + ", " + value;
		}
		infoMessage = "List of following Values has been stored" + infoMessage;
		Log.info(infoMessage);
		eInfoMessage = "List of following Values has been stored" + infoMessage;
		ExtentLogs.info(eInfoMessage);
	}
	
	
	
	// new
		// this function is used if we need two values capture
		
		public static void ValuesCaptureSupport2() throws Exception, Throwable {
			SupportLib.waitForAjax();
			
			
			List<String> FromPageList = new ArrayList<String>();
			infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Action: Capture and stored value";

			
			String str;
			WebElementCollection = FindElements();
			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			}
		
				
				
			
					
					FromPageList = SupportLib.GetElementText(WebElementCollection);
					
					valueSupportList2.addAll(FromPageList);
					
					
					
				
			
			for (String value : valueSupportList2) {
				infoMessage = infoMessage + ", " + value;
			}
			infoMessage = "List of following Values has been stored" + infoMessage;
			Log.info(infoMessage);
			eInfoMessage = "List of following Values has been stored" + infoMessage;
			ExtentLogs.info(eInfoMessage);
		}
		
		
	
	
	
	
	/**
	 * Right click on MULTIPLE WebElements and select the option from the index
	 * position provided in the ActionSupportValue Column.
	 */
	public static void ContextClickMany() throws Exception, Throwable {
		SupportLib.waitForAjax();
		String winHandle = driver.getWindowHandle();
		int OptionIndex, reps = 0;
		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		if (Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			errorMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ":ActionSupportValue (Context menu index no) is not defined";
			Log.error(errorMessage);
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		} else {
			OptionIndex = Integer.parseInt(Constant.TestCaseRow
					.get("ActionSupportValue"));
		}
		int Limit = Integer.parseInt(Constant.TestCaseRow.get("Data"));
		Actions action = new Actions(driver);

		for (WebElement we : WebElementCollection) {
			reps++;
			driver.switchTo().window(winHandle);
			action.contextClick(we).build().perform();

			for (int i = 0; i < OptionIndex; i++) {
				action.sendKeys(Keys.ARROW_DOWN).build().perform();
			}
			action.sendKeys(Keys.ENTER).build().perform();

			if (reps == Limit) {
				break;
			}
		}
		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Action Context click";
		Log.pass(passMessage);
		ePassMessage = "Context Clicked is performed on Element: "
				+ Constant.TestCaseRow.get("Elementlocation");
		ExtentLogs.Pass(ePassMessage);

	}

	/**
	 * Right click and select the option from the index position provided in the
	 * ActionSupportValue Column.
	 */
	public static void ContextClick() throws Exception, Throwable {
		SupportLib.waitForAjax();
		String winHandle = driver.getWindowHandle();
		int OptionIndex;
		WebElementCollection = FindElements();
		if (!(Constant.TestCaseRow.get("ActionSupportValue").contains("Blank"))
				|| !(Constant.TestCaseRow.get("Data").contains("Blank"))) {
			WebElementCollection = FindElements();
			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			} else {
				ActionElement = SupportLib.SearhElement(WebElementCollection);
			}

		} else {
			ActionElement = FindElement();
		}
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		if (Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			errorMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ":ActionSupportValue (Context menu index no) is not defined";
			Log.error(errorMessage);
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		OptionIndex = Integer.parseInt(Constant.TestCaseRow
				.get("ActionSupportValue"));

		Actions action = new Actions(driver);
		driver.switchTo().window(winHandle);
		action.contextClick(ActionElement).build().perform();

		for (int i = 0; i < OptionIndex; i++) {
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		action.sendKeys(Keys.ENTER).build().perform();
		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Action Context click";
		Log.pass(passMessage);
		ePassMessage = "Context Clicked is performed on Element: "
				+ Constant.TestCaseRow.get("Elementlocation");
		ExtentLogs.Pass(ePassMessage);

	}

	/**
	 * Click the WebElement, till the limit provided in the Data column.
	 */
	public static void ClickAll() throws Exception, Throwable {
		SupportLib.waitForAjax();
		String winHandle = driver.getWindowHandle();
		int reps = 0;
		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		int Limit = Integer.parseInt(Constant.TestCaseRow.get("Data"));
		for (WebElement we : WebElementCollection) {
			driver.switchTo().window(winHandle);
			reps++;
			we.click();
			if (reps == Limit) {
				break;
			}
		}
		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Action click All";
		Log.pass(passMessage);
		ePassMessage = "Context Click All on Elements: "
				+ Constant.TestCaseRow.get("Elementlocation");
		ExtentLogs.Pass(ePassMessage);

	}

	/**
	 * Capture and stored values to use further in the script Fields required:
	 * Action, Element locator type, Element Location, Test data: N/A
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyDatesCaptured() throws Exception, Throwable {
		SupportLib.waitForAjax();
		boolean Result = false;
		ActionElement = FindElement();

		List<Date> postDatesFromPg = SupportLib
				.getFormattedDateFromPage(ValuesCaptured);
		Date postDateFromFilter = new Date();

		String filterValue = ActionElement.getText();

		DateFormat df = new SimpleDateFormat("ddMMM");

		if (filterValue.equalsIgnoreCase("All")) {

		} else if (filterValue.equalsIgnoreCase("Yesterday")) {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, -1);
			String date = df.format(cal.getTime());
			postDateFromFilter = df.parse(date);
		} else if (filterValue.equalsIgnoreCase("Last Week")) {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, -7);
			String date = df.format(cal.getTime());
			postDateFromFilter = df.parse(date);
		} else if (filterValue.equalsIgnoreCase("Last 2 Weeks")) {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, -14);
			String date = df.format(cal.getTime());
			postDateFromFilter = df.parse(date);
		} else if (filterValue.equalsIgnoreCase("Last 3 Weeks")) {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, -21);
			String date = df.format(cal.getTime());
			postDateFromFilter = df.parse(date);
		} else if (filterValue.equalsIgnoreCase("Last Month")) {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, -30);
			String date = df.format(cal.getTime());
			postDateFromFilter = df.parse(date);
		} else if (filterValue.equalsIgnoreCase("Last 2 Months")) {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, -60);
			String date = df.format(cal.getTime());
			postDateFromFilter = df.parse(date);
		} else if (filterValue.equalsIgnoreCase("Last 4 Months")) {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, -120);
			String date = df.format(cal.getTime());
			postDateFromFilter = df.parse(date);
		}
		String fromPg = "";

		for (int i = 0; i < postDatesFromPg.size(); i++) {
			fromPg = fromPg + postDatesFromPg.get(i);
			if (postDatesFromPg.get(i).after(postDateFromFilter)
					|| postDatesFromPg.get(i).equals(postDateFromFilter)) {
				Result = true;
			} else {
				Result = false;
				break;
			}
		}

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + postDateFromFilter
					+ "; Value form page: " + fromPg;

			Log.pass(passMessage);
			ePassMessage = "Dates has been verified againest Captured text: "
					+ postDateFromFilter + ";for Value form page: " + fromPg;

			ExtentLogs.Pass(ePassMessage);
		} else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + postDateFromFilter
					+ "; Value form page: " + postDatesFromPg;

			Log.fail(failMessage);

			eFailMessage = "Verification failed for Dates againest Captured text: "
					+ postDateFromFilter
					+ ";for Value form page: "
					+ postDatesFromPg;

			ExtentLogs.Fail(eFailMessage);
		}

	}

	/**
	 * "Verify the value in DataBase with already captured value. Query will be
	 * fetched from ElementLocation Column, Index of the capturedValue
	 * (ValueCaptured list) from Data column and VerificationColumn from the
	 * ActionSupportValue Column. Database Details are in Constant.java file."
	 */
	public static void DbVerifyCapturedValue() throws Exception {
		if (Constant.DBLagTime) {
			Thread.sleep(Constant.DBLagTimeDuration);
		}

		int indexarray = 0;
		boolean Result = false, ColumnExist = false;
		String Verification, VerificationColumn, FromDB = "";
		String query = Constant.TestCaseRow.get("Elementlocation");
		List<String> columnNames = new ArrayList<String>();
		indexarray = Integer.parseInt(Constant.TestCaseRow.get("Data"));
		Verification = ValueCaptured.get(indexarray).toLowerCase();
		VerificationColumn = Constant.TestCaseRow.get("ActionSupportValue");

		DatabaseUtil dbUtil = new DatabaseUtil();
		ResultSet resultSet = dbUtil.executeQuery(query);

		if (Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			infoMessage = "Fail; "
					+ Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";Column Name is not provided, Please provide column name in ActionSupportValue";
			Log.info(errorMessage);
			eInfoMessage = "Column Name is not provided, Please provide column name in ActionSupportValue"
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.info(eInfoMessage);

		}
		ResultSetMetaData columns = resultSet.getMetaData();
		int i = 0;
		while (i < columns.getColumnCount()) {
			i++;
			System.out.print(columns.getColumnName(i) + "\t");
			columnNames.add(columns.getColumnName(i));
		}
		for (String culumn_name : columnNames) {
			if (culumn_name.equalsIgnoreCase(VerificationColumn)) {
				ColumnExist = true;
				break;
			} else {
				continue;
			}
		}

		if (!ColumnExist) {
			errorMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";Correct Column Name is not provided, Please provide column name in ActionSupportValue";
			Log.error(errorMessage);
			eErrorMessage = "Column Name is not provided, Please provide column name in ActionSupportValue"
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.error(eErrorMessage);
			return;
		}

		while (resultSet.next()) {
			if (Verification.equalsIgnoreCase(resultSet
					.getString(VerificationColumn))) {
				FromDB = resultSet.getString(VerificationColumn);
				Result = true;
				// break;
			} else {
				failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
						+ ": "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Captured text: " + Verification
						+ ";Dose not exist in database result for column "
						+ VerificationColumn;
				Log.fail(failMessage);
				eFailMessage = "Database value Verification Failed for the query"
						+ Constant.TestCaseRow.get("Elementlocation")
						+ "for column"
						+ VerificationColumn
						+ "; Againest verification value: " + Verification;
				ExtentLogs.Fail(eFailMessage);

				continue;
			}
		}

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + Verification
					+ "; Value form database: " + FromDB;
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + FromDB
					+ "; Againest verification value: " + Verification;
			ExtentLogs.Pass(ePassMessage);

		}
	}

	/**
	 * "Verify the value in DataBase with the provided value in Data column.
	 * Query will be fetched from ElementLocation Column and VerificationColumn
	 * from the ActionSupportValue Column. Database Details are in Constant.java
	 * file."
	 */
	/*public static void DbVerifyValue() throws Exception {
		if (Constant.DBLagTime) {
			Thread.sleep(Constant.DBLagTimeDuration);
		}
		boolean Result = false, ColumnExist = false;

		String Verification, VerificationColumn, FromDB = "";
		String query = Constant.TestCaseRow.get("Elementlocation");
		Verification = Constant.TestCaseRow.get("Data");
		List<String> columnNames = new ArrayList<String>();
		VerificationColumn = Constant.TestCaseRow.get("ActionSupportValue");

		if (Verification.contains("index")) {
			int index = Integer.parseInt(Verification.split("index")[1]);
			Verification = ValueCaptured.get(index);
		}

		int pgValueIndex = 0;
		if (query.contains(":")) {
			pgValueIndex = Integer.parseInt(query.split(":")[1]);

			String valueToBeReplaced = ValueCaptured.get(pgValueIndex);

			query = query.split(":")[0].trim();
			query = query.replaceAll("value", valueToBeReplaced);
		}

		DatabaseUtil dbUtil = new DatabaseUtil();
		ResultSet resultSet = dbUtil.executeQuery(query);

		if (Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			infoMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";Column Name is not provided, Please provide column name in ActionSupportValue";
			Log.info(infoMessage);
			eInfoMessage = "Column Name is not provided, Please provide column name in ActionSupportValue"
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.info(eInfoMessage);

		}

		ResultSetMetaData columns = resultSet.getMetaData();
		int i = 0;
		while (i < columns.getColumnCount()) {
			i++;
			columnNames.add(columns.getColumnName(i));
		}
		for (String culumn_name : columnNames) {
			if (culumn_name.equalsIgnoreCase(VerificationColumn)) {
				ColumnExist = true;
				break;
			} else {
				continue;
			}
		}

		if (!ColumnExist) {
			errorMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";Correct Column Name is not provided, Please provide column name in ActionSupportValue";
			Log.error(errorMessage);
			eErrorMessage = "Column Name is not provided, Please provide column name in ActionSupportValue"
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.error(eErrorMessage);
		}

		resultSet.beforeFirst();
		while (resultSet.next()) {
			if ((resultSet.getString(VerificationColumn))
					.contains(Verification)) {
				FromDB = resultSet.getString(VerificationColumn);
				Result = true;
				break;
			} else {
				FromDB = resultSet.getString(VerificationColumn);
				continue;
			}
		}
		dbUtil.CloseDB();

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + Verification
					+ "; Value form database: " + FromDB;
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + FromDB
					+ "; Againest verification value: " + Verification;
			ExtentLogs.pass(ePassMessage);

		}

		else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Verification text: " + Verification
					+ ";does not exist in database result for column "
					+ VerificationColumn;
			Log.fail(failMessage);
			eFailMessage = "Database value Verification Failed for the query"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "for column" + VerificationColumn + "Values" + FromDB
					+ "; Againest verification value: " + Verification;
			ExtentLogs.Fail(eFailMessage);

		}

	}*/
	
	
	
	
	public static void DbVerifyValue() throws Exception {
		if (Constant.DBLagTime) {
			Thread.sleep(Constant.DBLagTimeDuration);
		}
		boolean Result = false, ColumnExist = true;

		String Verification, VerificationColumn, FromDB = "";
		String query = Constant.TestCaseRow.get("Elementlocation");
		Verification = Constant.TestCaseRow.get("Data");
		List<String> columnNames = new ArrayList<String>();
		
		List<String> stordevalues = new ArrayList<String>();

		VerificationColumn = Constant.TestCaseRow.get("ActionSupportValue");

        
		DatabaseUtil dbUtility = new DatabaseUtil();
		
      
		
		ResultSet resultSet = dbUtility.executeQuery(query);
		
		

		if (VerificationColumn.contains(",")) {
			columnNames = Arrays.asList(VerificationColumn.split(","));
		}
		else 
		{
			columnNames.add(VerificationColumn);
			
		}
		
		for (int i = 0; i < columnNames.size(); i++) {
			System.out.println(resultSet.getString(columnNames.get(i)));
			
			
		stordevalues.add(resultSet.getString(columnNames.get(i)));
		}
		
		
		
		
		
		if (Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			infoMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";Column Name is not provided, Please provide column name in ActionSupportValue";
			Log.info(infoMessage);
			eInfoMessage = "Column Name is not provided, Please provide column name in ActionSupportValue"
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.info(eInfoMessage);

		}

		ResultSetMetaData columns = resultSet.getMetaData();
		int i = 0;
		while (i < columns.getColumnCount()) {
			i++;
			columnNames.add(columns.getColumnName(i));
		}
		for (String culumn_name : columnNames) {
			if (culumn_name.equalsIgnoreCase(VerificationColumn)) {
				ColumnExist = true;
				break;
			} else {
				continue;
			}
		}

		if (!ColumnExist) {
			errorMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";Correct Column Name is not provided, Please provide column name in ActionSupportValue";
			Log.error(errorMessage);
			eErrorMessage = "Column Name is not provided, Please provide column name in ActionSupportValue"
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.error(eErrorMessage);
		}

		resultSet.beforeFirst();
		
		dbUtility.CloseDB();	
		
		

	}

	/**
	 * "Verify MULTIPLE values in DataBase with already captured values. Query
	 * will be fetched from ElementLocation Column, MULTIPLE Indexes of the
	 * capturedValue (ValueCaptured list) from Data column and MULTIPLE
	 * VerificationColumns from the ActionSupportValue Column. Database Details
	 * are in Constant.java file."
	 */
	public static void DbVerifyCapturedValues() throws Exception {
		if (Constant.DBLagTime) {
			Thread.sleep(Constant.DBLagTimeDuration);
		}
		SupportLib.waitForAjax();

		List<String> VerificationColumnsList = new ArrayList<String>();
		List<Integer> VerificationIndexesList = new ArrayList<Integer>();

		String VerificationColumn = "", VerificationValue = "";
		int VerificationIndex;
		boolean Result = false;

		String VerificationColumns = Constant.TestCaseRow
				.get("ActionSupportValue");
		String VerificationIndexes = Constant.TestCaseRow.get("data");
		String query = Constant.TestCaseRow.get("Elementlocation");

		if (VerificationColumns.contains("Blank")) {
			infoMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";Column Name is not provided, Please provide column name in ActionSupportValue";
			Log.info(infoMessage);
			eInfoMessage = "Column Name is not provided, Please provide column name in ActionSupportValue"
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.info(eInfoMessage);

		}

		while (VerificationColumns.contains(",")) {
			VerificationColumn = VerificationColumns.split(",")[0];
			VerificationColumnsList.add(VerificationColumn);
		}

		while (VerificationIndexes.contains(",")) {
			VerificationIndex = Integer
					.parseInt(VerificationIndexes.split(",")[0]);
			VerificationIndexesList.add(VerificationIndex);
		}

		DatabaseUtil dbUtil = new DatabaseUtil();
		ResultSet resultSet = dbUtil.executeQuery(query);

		String dbValue = "";
		int count = 0;

		while (resultSet.next()) {

			for (int vIndex : VerificationIndexesList) {
				VerificationColumn = VerificationColumnsList.get(count);
				VerificationValue = ValueCaptured.get(vIndex);

				int columnIndex = resultSet.findColumn(VerificationColumn);
				if (columnIndex != -1) {
					dbValue = resultSet.getString(VerificationColumn);
					if (dbValue == null) {
						dbValue = "null";
					}

					if (dbValue.equalsIgnoreCase(VerificationValue)) {
						count++;
						if (count == VerificationIndexesList.size())
							Result = true;
					} else {
						failMessage = "Fail; "
								+ Constant.TestCaseRow.get("TestStepID")
								+ ": "
								+ Constant.TestCaseRow
										.get("TeststepDescription")
								+ "; Captured text: "
								+ VerificationValue
								+ ";Dose not exist in database result for column "
								+ VerificationColumn;
						Log.fail(failMessage);
						eFailMessage = "Database value Verification Failed for the query"
								+ Constant.TestCaseRow.get("Elementlocation")
								+ "for column"
								+ VerificationColumn
								+ "; Againest verification value: "
								+ VerificationValue;
						ExtentLogs.Fail(eFailMessage);
					}
				}
			}
		}

		dbUtil.CloseDB();

		if (!Result) {
		} else {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured indexes: " + VerificationIndexes;
			Log.pass(passMessage);
			ePassMessage = "Verification passed for indexes"
					+ VerificationIndexes + "; Inside Db";
			ExtentLogs.Pass(ePassMessage);
		}
	}

	/**
	 * "Verify MULTIPLE values in DataBase with the provided values in Data
	 * column. Query will be fetched from ElementLocation Column and MULTIPLE
	 * VerificationColumns from the ActionSupportValue Column. Database Details
	 * are in Constant.java file."
	 */
	public static void DbVerifyValues() throws Exception {
		SupportLib.waitForAjax();
		if (Constant.DBLagTime) {
			Thread.sleep(Constant.DBLagTimeDuration);
		}
		List<String> VerificationColumnsList = new ArrayList<String>();
		List<String> VerificationvalueList = new ArrayList<String>();
		String VerificationColumn = "", VerificationValue = "";

		boolean Result = false, NoFail = true;

		VerificationColumn = Constant.TestCaseRow.get("ActionSupportValue");
		VerificationValue = Constant.TestCaseRow.get("Data");
		String query = Constant.TestCaseRow.get("Elementlocation");

		int pgValueIndex = 0;
		if (query.contains(":")) {
			pgValueIndex = Integer.parseInt(query.split(":")[1]);

			String valueToBeReplaced = ValueCaptured.get(pgValueIndex);

			query = query.split(":")[0].trim();
			if (query.contains("valuenumber")) {
				query = query.replaceAll("valuenumber", valueToBeReplaced);
			} else {
				query = query
						.replaceAll("value", "'" + valueToBeReplaced + "'");
			}

		}

		if (VerificationColumn.contains("Blank")) {
			infoMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";Column Name is not provided, Please provide column name in ActionSupportValue";
			Log.info(infoMessage);
			eInfoMessage = "Column Name is not provided, Please provide column name in ActionSupportValue"
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.info(eInfoMessage);

		}

		StringTokenizer st = new StringTokenizer(VerificationColumn, ",");

		while (st.hasMoreTokens()) {
			VerificationColumnsList.add(st.nextToken());
		}

		if (VerificationValue.contains("index")) {
			String capturedValIndex = VerificationValue.split("index")[1]
					.charAt(0) + "";
			String capturedValue = ValueCaptured.get(Integer
					.parseInt(capturedValIndex));
			VerificationvalueList.add(capturedValue);
		} else {
			StringTokenizer st1 = new StringTokenizer(VerificationValue, ",");

			while (st1.hasMoreTokens()) {
				VerificationvalueList.add(st1.nextToken());
			}
		}

		DatabaseUtil dbUtil = new DatabaseUtil();
		ResultSet resultSet = dbUtil.executeQuery(query);

		String dbValue = "";
		resultSet.beforeFirst();
		while (resultSet.next()) {
			dbValue = "";
			for (int i = 0; i < VerificationColumnsList.size(); i++) {
				String Value = VerificationvalueList.get(i);
				String VerificationColumnValue = VerificationColumnsList.get(i);

				String resultSetValue = resultSet
						.getString(VerificationColumnValue);
				if (resultSetValue == null) {
					resultSetValue = "null";
				}

				if (Value.contains(resultSetValue)) {
					dbValue = dbValue + resultSetValue + ",";
					Result = true;
				} else {
					dbValue = dbValue + resultSetValue + ",";

					NoFail = false;

				}
			}

			break;
		}

		dbUtil.CloseDB();
		if (!Result || !NoFail) {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Row containing following values: " + VerificationValue
					+ ";Dose not exist in database result for columns "
					+ VerificationColumn + "; Value in DB: " + dbValue;
			Log.fail(failMessage);
			failMessage = "Database value Verification Failed for the query"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "for columns" + VerificationColumn
					+ "; Againest verification value: " + VerificationValue
					+ "Value in DB: " + dbValue;
			ExtentLogs.Fail(failMessage);
		}
		if (Result && NoFail) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Row containing following values exist in data base: "
					+ VerificationValue + "; Value in DB: " + dbValue;
			Log.pass(passMessage);
			ePassMessage = "Row containing following values exist in data base: "
					+ VerificationValue + "Value in DB: " + dbValue;
			ExtentLogs.Pass(ePassMessage);
		}
	}

	public static void DbVerifyValuesAll() throws Exception {
		SupportLib.waitForAjax();

		if (Constant.DBLagTime) {
			Thread.sleep(Constant.DBLagTimeDuration);
		}
		List<String> VerificationColumnsList = new ArrayList<String>();
		List<String> VerificationvalueList = new ArrayList<String>();
		String VerificationColumn = "", VerificationValue = "";
		int LoopCount = 0;

		boolean Result = false, NoFail = true;

		VerificationColumn = Constant.TestCaseRow.get("ActionSupportValue");
		VerificationValue = Constant.TestCaseRow.get("Data");
		String query = Constant.TestCaseRow.get("Elementlocation");

		if (VerificationValue.contains("Row:")) {
			if (VerificationValue.contains("Capture:")) {
				String RowCount = VerificationValue.split("Row:Capture:")[1];
				int indexno = Integer.parseInt(RowCount);
				if (ValueCaptured.get(indexno).contains("Blank")) {
					LoopCount = 1;
				} else {
					LoopCount = Integer.parseInt(ValueCaptured.get(indexno));
					VerificationValue = VerificationValue.split("Row:Capture:")[0];
				}
			} else {
				String RowCount = VerificationValue.split("Row:")[1];
				LoopCount = Integer.parseInt(RowCount);
				VerificationValue = VerificationValue.split("Row:")[0];
			}
		}

		else {
			LoopCount = 100;
		}
		if (VerificationColumn.contains("Blank")) {
			infoMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";Column Name is not provided, Please provide column name in ActionSupportValue";
			Log.info(infoMessage);
			eInfoMessage = "Column Name is not provided, Please provide column name in ActionSupportValue"
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.info(eInfoMessage);

		}

		StringTokenizer st = new StringTokenizer(VerificationColumn, ",");

		while (st.hasMoreTokens()) {
			VerificationColumnsList.add(st.nextToken());
		}

		StringTokenizer st1 = new StringTokenizer(VerificationValue, ",");

		while (st1.hasMoreTokens()) {
			VerificationvalueList.add(st1.nextToken());
		}

		DatabaseUtil dbUtil = new DatabaseUtil();
		ResultSet resultSet = dbUtil.executeQuery(query);

		String dbValue = "";
		resultSet.beforeFirst();
		int mainloop = 0;
		while (resultSet.next() && mainloop < LoopCount) {
			dbValue = "";
			for (int i = 0; i < VerificationColumnsList.size(); i++) {
				String Value = VerificationvalueList.get(i);
				String VerificationColumnValue = VerificationColumnsList.get(i);

				String resultSetValue = resultSet
						.getString(VerificationColumnValue);
				if (resultSetValue == null) {
					resultSetValue = "null";
				}

				if (Value.contains(resultSetValue)) {
					dbValue = dbValue + resultSetValue + ",";
					Result = true;
				} else {
					dbValue = dbValue + resultSetValue + ",";

					NoFail = false;

				}
			}
			if (!Result || !NoFail) {
				failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
						+ ": "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Row containing following values: "
						+ VerificationValue
						+ ";Dose not exist in database result for columns "
						+ VerificationColumn + "; Value in DB: " + dbValue;
				Log.fail(failMessage);
				failMessage = "Database value Verification Failed for the query"
						+ Constant.TestCaseRow.get("Elementlocation")
						+ "for columns"
						+ VerificationColumn
						+ "; Againest verification value: "
						+ VerificationValue
						+ "Value in DB: " + dbValue;
				ExtentLogs.Fail(failMessage);
			}
			if (Result && NoFail) {
				passMessage = Constant.TestCaseRow.get("TestStepID")
						+ "; "
						+ "Passed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Row containing following values exist in data base: "
						+ VerificationValue + "; Value in DB: " + dbValue;
				Log.pass(passMessage);
				ePassMessage = "Row containing following values exist in data base: "
						+ VerificationValue + "Value in DB: " + dbValue;
				ExtentLogs.Pass(ePassMessage);
			}
			mainloop++;
			// break;
		}

		dbUtil.CloseDB();

	}

	public static void VerifySortOrder() throws Exception {
		SupportLib.waitForAjax();

		boolean Result = false;

		String sortType = Constant.TestCaseRow.get("ActionSupportValue");
		String indexes = Constant.TestCaseRow.get("Data");
		int from = -1, to = -1;

		List<Integer> integerValueCaptured = new ArrayList<Integer>();
		List<Integer> indexesList = new ArrayList<Integer>();

		if (indexes.contains("-")) {
			from = Integer.parseInt(indexes.split("-")[0].trim());
			to = Integer.parseInt(indexes.split("-")[1].trim());
		}

		while (indexes.contains(",")) {
			indexes.trim();
			String[] splitted = indexes.split(",");
			indexesList.add(Integer.parseInt(splitted[0].trim()));
			indexes = splitted[1];
		}

		if (from == -1 || to == -1 || indexesList.size() < 2) {
			System.out.println("No values found to sort");
		} else if (from != -1 && to != -1) {
			for (int i = from; i <= to; i++) {
				int value = Integer.parseInt(ValueCaptured.get(i));
				integerValueCaptured.add(value);
			}
		} else if (indexesList.size() > 1) {
			for (int index : indexesList) {
				int value = Integer.parseInt(ValueCaptured.get(index));
				integerValueCaptured.add(value);
			}
		}

		if (sortType.equalsIgnoreCase("asc")) {
			for (int i = 0; i < integerValueCaptured.size() - 1; i++) {
				if (integerValueCaptured.get(i) < integerValueCaptured
						.get(i + 1)) {
					Result = true;
				} else {
					Result = false;
				}
			}
		}

		if (sortType.equalsIgnoreCase("dsc")) {
			for (int i = 1; i <= integerValueCaptured.size(); i++) {
				if (integerValueCaptured.get(i) > integerValueCaptured
						.get(i - 1)) {
					Result = true;
				} else {
					Result = false;
				}
			}
		}

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Values Captured : " + integerValueCaptured + "are in "
					+ sortType + "order";
			Log.pass(passMessage);
			ExtentLogs.Pass(passMessage);
		} else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ "; " + "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Values Captured : " + integerValueCaptured
					+ "are NOT in " + sortType + "order";
			Log.fail(failMessage);
			ExtentLogs.Fail(failMessage);
		}
	}

	public static void VerifyXML() throws Exception, Throwable {

		boolean Result = false;
		String fromXMLVerification, Verification;

		fromXMLVerification = XMLParser.ParseXML(driver.getCurrentUrl(),
				Constant.TestCaseRow.get("Elementlocation"));

		Verification = Constant.TestCaseRow.get("Data");

		if (fromXMLVerification.contains(Verification)) {
			Result = true;
		} else {
			Result = false;
		}

		if (Result) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification + "; Present in Page values: "
					+ fromXMLVerification;

			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "Value:"
					+ Verification + "; Present in Page values: "
					+ fromXMLVerification;
			ExtentLogs.Pass(ePassMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification
					+ "; is Not Present in Page values: " + fromXMLVerification;

			Log.fail(failMessage);

			eFailMessage = "Verification Failed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "Value:"
					+ Verification + ";is not Present in Page values: "
					+ fromXMLVerification;
			ExtentLogs.Fail(eFailMessage);

		}

	}

	public static void VerifyCaptureXMLnumbers() throws Exception, Throwable {

		boolean Result = false;
		String fromXMLVerification;
		int Verification, fromXML, Verificationindex;
		fromXMLVerification = XMLParser.ParseXML(driver.getCurrentUrl(),
				Constant.TestCaseRow.get("Elementlocation"));

		Verificationindex = Integer.parseInt(Constant.TestCaseRow.get("Data"));
		Verification = SupportLib.processnumbers(ValueCaptured
				.get(Verificationindex));
		double dxml = Double.parseDouble(fromXMLVerification);

		fromXML = (int) dxml;

		if (fromXML == Verification) {
			Result = true;

		} else {
			Result = false;
		}

		if (Result) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification + "; Present in XML: "
					+ fromXML;

			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "Value:"
					+ Verification + "; Present in XML: " + fromXML;
			ExtentLogs.Pass(ePassMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification + "; is Not Present in XML: "
					+ fromXML;

			Log.fail(failMessage);

			eFailMessage = "Verification Failed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "Value:"
					+ Verification + ";is not Present in XML: " + fromXML;
			ExtentLogs.Fail(eFailMessage);

		}

	}

	public static void ValueCaptureXML() throws Exception, Throwable {
		String DataValue = Constant.TestCaseRow.get("Data");
		String ValueFromXML = "";
		String Leftlimit = "", RightLimit = "";

		if (!DataValue.contains("Blank")) {
			if (DataValue.contains("^")) {
				Leftlimit = DataValue.split("\\^")[0];
				RightLimit = DataValue.split("\\^")[1];
				Leftlimit = Leftlimit.replace("&lt", "");
				RightLimit = RightLimit.replace("&rt", "");
			} else if (DataValue.contains("&lt")) {
				Leftlimit = DataValue.replace("&lt", "");
			} else {
				RightLimit = DataValue.replace("&rt", "");
			}
		}
		ValueFromXML = XMLParser.ParseXML(driver.getCurrentUrl(),
				Constant.TestCaseRow.get("Elementlocation"));

		if (Leftlimit != "") {
			Leftlimit = Leftlimit.trim();
			ValueFromXML = ValueFromXML.split(Leftlimit)[1];
		}
		if (RightLimit != "") {
			RightLimit = RightLimit.trim();
			ValueFromXML = ValueFromXML.split(RightLimit)[0];
			// ValueFromPage = ValueFromPage.split("\\(")[0];
		}
		if (ValueFromXML.contains("Post")) {
			ValueFromXML = ValueFromXML.trim();
			ValueFromXML = ValueFromXML.split(" ")[0];
		}
		ValueFromXML = ValueFromXML.trim();

		ValueCaptured.add(ValueFromXML);
		int size = ValueCaptured.size();
		size = size - 1;
		infoMessage = ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		Log.info(infoMessage);
		eInfoMessage = ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		ExtentLogs.info(eInfoMessage);
	}

	public static void VerifyCaptureXMLtext() throws Exception, Throwable {

		boolean Result = false;
		String fromXMLVerification, fromXML, Verification;
		int Verificationindex;
		fromXMLVerification = XMLParser.ParseXML(driver.getCurrentUrl(),
				Constant.TestCaseRow.get("Elementlocation"));

		Verificationindex = Integer.parseInt(Constant.TestCaseRow.get("Data"));
		Verification = ValueCaptured.get(Verificationindex).trim();
		fromXML = fromXMLVerification.trim();

		if (fromXML.contains(Verification)) {
			Result = true;

		} else {
			Result = false;
		}

		if (Result) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification + "; Present in XML: "
					+ fromXML;

			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "Value:"
					+ Verification + "; Present in XML: " + fromXML;
			ExtentLogs.Pass(ePassMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification + "; is Not Present in XML: "
					+ fromXML;

			Log.fail(failMessage);

			eFailMessage = "Verification Failed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "Value:"
					+ Verification + ";is not Present in XML: " + fromXML;
			ExtentLogs.Fail(eFailMessage);

		}

	}

	public static void TrimValueCaptured() throws Exception, Throwable {
		SupportLib.waitForAjax();
		int IndexPosition;
		String trimmedValue = "";
		boolean result = false;

		IndexPosition = Integer.parseInt(Constant.TestCaseRow.get("Data"));
		ActionElement = FindElement();
		String actionSupportValue = Constant.TestCaseRow
				.get("ActionSupportValue");
		if (!(actionSupportValue == "Blank")
				&& actionSupportValue.contains("Trim:")) {

			String ValueToTrim = Constant.TestCaseRow.get("ActionSupportValue");
			ValueToTrim = ValueToTrim.replace("Trim:", "").trim();
			if (ValueCaptured.get(IndexPosition).contains(ValueToTrim)) {

				int position = 0;
				String[] wordArray = ValueCaptured.get(IndexPosition)
						.split(" ");
				for (int i = 0; i < wordArray.length; i++) {
					if (wordArray[i].equalsIgnoreCase(ValueToTrim)) {
						position = i;
						break;
					}
				}

				if (position == 0) {
					trimmedValue = ValueCaptured.get(IndexPosition)
							.replace(ValueToTrim, "").trim();
				} else {
					for (int i = 0; i < position; i++) {
						trimmedValue += (wordArray[i] + " ");
					}
				}
				trimmedValue = trimmedValue.trim();
				ValueCaptured.remove(IndexPosition);
				ValueCaptured.add(IndexPosition, trimmedValue);
			}
			result = true;

		} else if (!(actionSupportValue == "Blank")
				&& (actionSupportValue.contains("lt") || actionSupportValue
						.contains("rt"))) {
			String Leftlimit = "", RightLimit = "";
			if (actionSupportValue.contains("^")) {
				Leftlimit = actionSupportValue.split("\\^")[0];
				RightLimit = actionSupportValue.split("\\^")[1];
				Leftlimit = Leftlimit.replace("&lt", "");
				RightLimit = RightLimit.replace("&rt", "");
			} else if (actionSupportValue.contains("&lt")) {
				Leftlimit = actionSupportValue.replace("&lt", "");
			} else {
				RightLimit = actionSupportValue.replace("&rt", "");
			}
			Leftlimit = Leftlimit.trim();
			RightLimit = RightLimit.trim();

			if (Leftlimit != ""
					&& ValueCaptured.get(IndexPosition).contains(Leftlimit)) {
				trimmedValue = ValueCaptured.get(IndexPosition)
						.split(Leftlimit)[1];
			}
			if (RightLimit != "") {
				trimmedValue = ValueCaptured.get(IndexPosition).split(
						RightLimit)[0];
			}

			trimmedValue = trimmedValue.trim();
			ValueCaptured.remove(IndexPosition);
			ValueCaptured.add(IndexPosition, trimmedValue);

			result = true;
		}

		if (result) {
			infoMessage = "User specified value has been trimmed at index"
					+ IndexPosition + "New Value is: "
					+ ValueCaptured.get(IndexPosition);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been trimmed at index"
					+ IndexPosition + "New Value is: "
					+ ValueCaptured.get(IndexPosition);
			ExtentLogs.info(eInfoMessage);
		} else {
			infoMessage = "User specified value has been trimmed at index"
					+ IndexPosition + "New Value is: "
					+ ValueCaptured.get(IndexPosition);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been trimmed at index"
					+ IndexPosition + "New Value is: "
					+ ValueCaptured.get(IndexPosition);
			ExtentLogs.info(eInfoMessage);
		}
	}

	public static void VerifyFormattedDate() throws Exception, Throwable {
		SupportLib.waitForAjax();
		boolean Result = false;

		int IndexPosition;
		String filter = "";
		String currentDateString = "";

		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		IndexPosition = Integer.parseInt(Constant.TestCaseRow.get("Data"));
		filter = Constant.TestCaseRow.get("ActionSupportValue");

		if ((filter != null) && (filter != "") && (filter != "Blank")) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);

			String operator = "";

			if (filter.contains("-")) {
				operator = "-";
			} else if (filter.contains("+")) {
				operator = "+";
			}

			String filterType = "";

			if (operator != "") {
				if (filter.contains("mon")) {
					filterType = "mon";
				} else if (filter.contains("yr")) {
					filterType = "yr";
				} else if (filter.contains("day")) {
					filterType = "day";
				}
			}

			if (operator != "" && filterType != "") {
				String trimmedFilter = filter.split(operator)[1];

				trimmedFilter = trimmedFilter.split(filterType)[0];

				int valueToFilter = 0;
				if (trimmedFilter.contains("index")) {
					String firstChar = trimmedFilter.split("index")[1]
							.charAt(0) + "";
					String capturedVal = ValueCaptured.get(Integer
							.parseInt(firstChar));

					valueToFilter = Integer.parseInt(capturedVal);
				} else {
					valueToFilter = Integer.parseInt(trimmedFilter);
				}

				if (filterType == "day") {
					cal.add(Calendar.DATE, -valueToFilter);
					date = cal.getTime();
				} else if (filterType == "mon") {
					cal.add(Calendar.MONTH, -valueToFilter);
					date = cal.getTime();
				} else if (filterType == "yr") {
					cal.add(Calendar.YEAR, -valueToFilter);
					date = cal.getTime();
				}
			}

			currentDateString = dateFormat.format(date);
		}

		String valueCaptured = ValueCaptured.get(IndexPosition);
		Date capturedDate = dateFormat.parse(valueCaptured);

		int dateMargin = getZeroTimeDate(capturedDate).compareTo(
				getZeroTimeDate(date));

		if (dateMargin == 0) {
			Result = true;
		} else {
			Result = false;
		}

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + ValueCaptured.get(IndexPosition)
					+ "; with Current Date: " + currentDateString;

			Log.pass(passMessage);
			ePassMessage = "Dates has been verified againest Captured text: "
					+ ValueCaptured.get(IndexPosition)
					+ "; with Current Date: " + currentDateString;

			ExtentLogs.Pass(ePassMessage);
		} else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + ValueCaptured.get(IndexPosition)
					+ "; with Current Date: " + currentDateString;

			Log.fail(failMessage);

			eFailMessage = "Verification failed for Date against Captured text: "
					+ ValueCaptured.get(IndexPosition)
					+ "; with Current Date: " + currentDateString;

			ExtentLogs.Fail(eFailMessage);
		}

	}

	/**
	 * Used in VerifyFormattedDate for comparison.
	 */
	public static Date getZeroTimeDate(Date fecha) {
		Date res = fecha;
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(fecha);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		res = calendar.getTime();

		return res;
	}

	public static void ScrollToElement() throws Exception {

		SupportLib.waitForAjax();

		ActionElement = FindElement();

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView(true);", ActionElement);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Log.info(e.getStackTrace().toString());
			ExtentLogs.info(e.getStackTrace().toString());
		}
		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Action Scroll Down";
		Log.info(infoMessage);
		eInfoMessage = "Page is scrolled down by as per provided coordinates"
				+ Constant.TestCaseRow.get("Data");
		ExtentLogs.info(eInfoMessage);
	}

	/**
	 * Format the capturedDated on index(provided in Data column) from
	 * ValueCapture list to the format passed in ActionSupportValue.
	 * @throws Exception 
	 */
	public static void FormatDate() throws Exception {
		SupportLib.waitForAjax();

		int indexPosition = 0;
		indexPosition = Integer.parseInt(Constant.TestCaseRow.get("Data"));

		String actionSupportValue = "dd/MM/yyyy";

		actionSupportValue = Constant.TestCaseRow.get("ActionSupportValue");

		String fromFormat = "dd/MM/yyyy";
		String toFormat = "dd/MM/yyyy";
		if (actionSupportValue.contains("to")) {
			fromFormat = actionSupportValue.split("to")[0].trim();
			toFormat = actionSupportValue.split("to")[1].trim();
		}

		String valueToFormat = ValueCaptured.get(indexPosition);
		String formattedValue = valueToFormat;

		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat(fromFormat);

		try {
			date = dateFormat.parse(valueToFormat);

			dateFormat = new SimpleDateFormat(toFormat);
			formattedValue = dateFormat.format(date);
		} catch (ParseException e) {
			Log.error(e.toString());
			ExtentLogs.error(e.toString());
		}

		if (formattedValue != "") {
			ValueCaptured.remove(indexPosition);
			ValueCaptured.add(indexPosition, formattedValue.trim());
		}
	}

	public static void VerifyDecimalValues() throws Exception {
		SupportLib.waitForAjax();

		String filter = Constant.TestCaseRow.get("Data");

		int beforeValue = -1, afterValue = -1;
		String trimmedBefore = "", trimmedAfter = "";

		if (filter.contains(":")) {
			trimmedBefore = filter.split(":")[0];
			trimmedAfter = filter.split(":")[1];
		}

		if (filter.contains("before")) {
			if (trimmedBefore != "") {
				beforeValue = Integer
						.parseInt(trimmedBefore.split("before")[1]);
			} else {
				beforeValue = Integer.parseInt(filter.split("before")[1]);
			}

		}

		if (filter.contains("after")) {
			if (trimmedAfter != "") {
				afterValue = Integer.parseInt(trimmedAfter.split("after")[1]);
			} else {
				afterValue = Integer.parseInt(filter.split("after")[1]);
			}
		}

		List<String> fromPageList = new ArrayList<String>();
		for (String value : ValuesCaptured) {
			String valuefrompage = value.replaceAll("[^\\d.]", "");
			fromPageList.add(valuefrompage);
		}

		boolean resultAfterValue = true;
		boolean resultBeforeValue = true;

		String failedValue = "";

		if (afterValue >= 0) {
			for (String fromPgValue : fromPageList) {
				String afterDecimal = fromPgValue.split("\\.")[1];

				if (afterDecimal.length() <= afterValue) {
					resultAfterValue = true;
				} else {
					resultAfterValue = false;
					failedValue = fromPgValue;
					break;
				}
			}
		}

		if (beforeValue >= 0) {
			for (String fromPgValue : fromPageList) {
				String beforerDecimal = fromPgValue.split("\\.")[0];

				if (beforerDecimal.length() <= beforeValue) {
					resultBeforeValue = true;
				} else {
					resultBeforeValue = false;
					failedValue = fromPgValue;
					break;
				}
			}
		}

		if (resultAfterValue && resultBeforeValue) {
			passMessage = Constant.TestCaseRow.get("TestStepID")
					+ "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured values are verified for provided decimal places.";

			Log.pass(passMessage);
			ePassMessage = Constant.TestCaseRow.get("TestStepID")
					+ "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured values are verified for provided decimal places.";
			ExtentLogs.Pass(ePassMessage);
		} else {
			failMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Failed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured value " + failedValue
					+ " is failed for provided decimal places.";

			Log.fail(failMessage);

			eFailMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Failed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured value " + failedValue
					+ " is failed for provided decimal places.";
			ExtentLogs.Fail(eFailMessage);
		}

	}

	public static void VerifySortByPattern() throws Exception {
		SupportLib.waitForAjax();

		String pattern = Constant.TestCaseRow.get("Data");

		List<String> patternValuesList = new ArrayList<String>();
		int patternTypes = 0;
		boolean result = true;

		if (pattern.contains(":")) {
			String[] patternValues = pattern.split(":");
			for (String value : patternValues) {
				value = value.trim();
				patternValuesList.add(value);
				patternTypes++;
			}
		} else {
			pattern = pattern.trim();
			patternValuesList.add(pattern);
			patternTypes++;
		}

		int count = 0;
		for (int i = 0; i < ValuesCaptured.size();) {
			String capturedValue = ValuesCaptured.get(i);

			if (count < patternTypes) {
				if (capturedValue
						.equalsIgnoreCase(patternValuesList.get(count))) {
					i++;
					continue;
				} else {
					count++;
					continue;
				}
			} else {
				result = false;
				break;
			}
		}

		if (result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured values are verified for provided pattern.";

			Log.pass(passMessage);
			ePassMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured values are verified for provided pattern.";
			ExtentLogs.Pass(ePassMessage);
		} else {
			failMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Failed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured values are failed for provided pattern.";

			Log.fail(failMessage);

			eFailMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Failed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured values are failed for provided pattern.";
			ExtentLogs.Fail(eFailMessage);
		}
	}

	public static void ClearIf() throws Exception {
		SupportLib.waitForAjax();
		ActionElement = FindElement();

		if (ActionElement == null) {
			skipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Action Element is not present moving to next step";
			Log.skip(skipMessage);
			eSkipMessage = " Action Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ " moving to next step";
			ExtentLogs.Skip(eSkipMessage);
		} else {
			ActionElement.clear();
			passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Action Clear";
			ePassMessage = "Action Clear is performend on "
					+ Constant.TestCaseRow.get("Elementlocation");
			Log.pass(passMessage);
			ExtentLogs.Pass(ePassMessage);
		}
	}

	public static void AlertAccept() throws Exception {
		 SupportLib.waitForAjax();
		 Thread.sleep(1000);
		/*if (Constant.WaitforAlert) {
			new WebDriverWait(driver, Constant.Alertwait)
					.until(ExpectedConditions.alertIsPresent());
		}*/
		Alert alert = driver.switchTo().alert();
		String Alertmessage = "";
		if (alert != null) {
			Alertmessage = alert.getText();
			alert.accept();
		}

		infoMessage = "Alert Rejected: {}" + Alertmessage;
		Log.info(infoMessage);
		eInfoMessage = "Alert Rejected: {}" + Alertmessage;
		ExtentLogs.info(eInfoMessage);
	}

	public static void VerifyIfCheckBoxesOrder() throws Exception {
		SupportLib.waitForAjax();
		WebElementCollection = FindElements();
		boolean result = false;

		if (WebElementCollection == null) {
			skipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Browser is : " + browser + ". Skipping to next step.";
			Log.skip(skipMessage);
			eSkipMessage = " Action Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ ": Browser is : " + browser + ". Skipping to next step.";
			ExtentLogs.Skip(eSkipMessage);

		} else {
			int selectedCheckBoxCount = 0;
			boolean firstUncheckedFound = false;

			for (WebElement we : WebElementCollection) {
				if (we.isSelected()) {
					selectedCheckBoxCount++;
					if (firstUncheckedFound) {
						result = false;
						break;
					} else {
						result = true;
						continue;
					}

				} else {
					result = true;
					firstUncheckedFound = true;
				}
			}

			if (result) {
				passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Passed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Checked check boxes are coming first.";

				Log.pass(passMessage);
				ePassMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Passed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Checked check boxes are coming first.";
				ExtentLogs.Pass(ePassMessage);
			} else {
				failMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Failed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Checked check boxes are NOT coming first.";

				Log.fail(failMessage);

				eFailMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Failed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Checked check boxes are NOT coming first.";
				ExtentLogs.Fail(eFailMessage);
			}
		}
	}

	
	
	public static void AddInValueCaptured() throws Exception {
		SupportLib.waitForAjax();
		String newValue = "";
		newValue = Constant.TestCaseRow.get("ActionSupportValue");
		String dataValue = Constant.TestCaseRow.get("Data");

		if (newValue != "" && !newValue.equalsIgnoreCase("Blank")) {
			if (newValue.contains("index")) {
				String splittedIndex = newValue.split("index")[1].trim();
				String capturedValue = ValueCaptured.get(Integer
						.parseInt(splittedIndex));

				if (dataValue != "" && !dataValue.equalsIgnoreCase("Blank"))
					newValue = dataValue.replace("value", capturedValue);
			}

			ValueCaptured.add(newValue);

			infoMessage = "User specified value " + newValue
					+ " has been added to ValueCaptured List";
			Log.info(infoMessage);
			eInfoMessage = "User specified value " + newValue
					+ " has been added to ValueCaptured List";
			ExtentLogs.info(eInfoMessage);
		}

		String query = Constant.TestCaseRow.get("Elementlocation");

		if (query != "" && !query.equalsIgnoreCase("Blank")) {
			DatabaseUtil dbUtil = new DatabaseUtil();
			ResultSet resultSet = dbUtil.executeQuery(query);

			if (dataValue.equalsIgnoreCase("rownumber")) {
				newValue = "";
				int count = 0;

				while (resultSet.next()) {
					++count;
				}
				newValue = "" + count;

				ValueCaptured.add(newValue);

				infoMessage = "User specified value " + newValue
						+ " has been added to ValueCaptured List";
				Log.info(infoMessage);
				eInfoMessage = "User specified value " + newValue
						+ " has been added to ValueCaptured List";
				ExtentLogs.info(eInfoMessage);
			}
		}
	}

	public static void CompareStoredNumbers() throws Exception, Throwable {
		SupportLib.waitForAjax();

		String Operatorvalue = "";
		int firstIndex = 0;
		int secondIndex = 0;

		int LogicalCase = 0;
		HashMap<String, Integer> LogicalOperator = new HashMap<String, Integer>();
		boolean Result = false;

		LogicalOperator.put("<", 1);
		LogicalOperator.put(">", 2);
		LogicalOperator.put("=>", 3);
		LogicalOperator.put("<=", 4);
		LogicalOperator.put("!=", 5);
		LogicalOperator.put("--", 6);
		LogicalOperator.put("++", 7);

		String dataValue = Constant.TestCaseRow.get("Data");

		if (dataValue.contains(",")) {
			String[] splittedValue = dataValue.split(",");

			firstIndex = Integer.parseInt(splittedValue[0]);
			Operatorvalue = splittedValue[1];
			secondIndex = Integer.parseInt(splittedValue[2]);
			LogicalCase = LogicalOperator.get(Operatorvalue);
		}

		int firstVlaue = Integer.parseInt(ValueCaptured.get(firstIndex));
		int secondValue = Integer.parseInt(ValueCaptured.get(secondIndex));

		switch (LogicalCase) {
		case 0:
			if (firstVlaue == secondValue) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 1:
			if (firstVlaue < secondValue) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 2:
			if (firstVlaue > secondValue) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 3:
			if (firstVlaue >= secondValue) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 4:
			if (firstVlaue <= secondValue) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 5:
			if (firstVlaue != secondValue) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 6:
			if ((firstVlaue - 1) == secondValue) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		case 7:
			if ((firstVlaue + 1) == secondValue) {
				Result = true;
			} else {
				Result = false;
			}
			break;
		}

		if (Result) {
			passMessage = "Passed : " + Constant.TestCaseRow.get("TestStepID")
					+ " , " + Constant.TestCaseRow.get("TeststepDescription")
					+ " : " + firstVlaue + " " + Operatorvalue + " "
					+ secondValue;
			Log.pass(passMessage);

			ePassMessage = "Passed : " + Constant.TestCaseRow.get("TestStepID")
					+ " , " + Constant.TestCaseRow.get("TeststepDescription")
					+ " : " + firstVlaue + " " + Operatorvalue + " "
					+ secondValue;
			ExtentLogs.Pass(ePassMessage);
		} else {
			SupportLib.createScreenshot();
			failMessage = "Failed : " + Constant.TestCaseRow.get("TestStepID")
					+ " , " + Constant.TestCaseRow.get("TeststepDescription")
					+ " : " + firstVlaue + " " + Operatorvalue + " "
					+ secondValue;
			Log.fail(failMessage);

			eFailMessage = "Failed : " + Constant.TestCaseRow.get("TestStepID")
					+ " , " + Constant.TestCaseRow.get("TeststepDescription")
					+ " : " + firstVlaue + " " + Operatorvalue + " "
					+ secondValue;
			ExtentLogs.Fail(eFailMessage);
		}
	}

	public static void SubmitCaptureIf() throws Exception, Throwable {
		SupportLib.waitForAjax();
		List<String> IndexArray = new ArrayList<String>();
		List<String> ValueArray = new ArrayList<String>();
		String FinalValue = "";
		int arrayindex = 0;

		ActionElement = FindElement();
		if (ActionElement == null) {
			skipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Action Element is not present moving to next step";
			Log.skip(skipMessage);
			eSkipMessage = " Action Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ " moving to next step";
			ExtentLogs.Skip(eSkipMessage);
		} else {
			StringTokenizer st = new StringTokenizer(
					Constant.TestCaseRow.get("Data"), ",");

			while (st.hasMoreTokens()) {
				IndexArray.add(st.nextToken());
			}
			for (String s : IndexArray) {
				arrayindex = Integer.parseInt(s);
				ValueArray.add(ValueCaptured.get(arrayindex));
			}

			for (String value : ValueArray) {
				FinalValue = FinalValue + value;
				if (!Constant.TestCaseRow.get("ActionSupportValue").contains(
						"Blank")) {
					FinalValue = FinalValue
							+ Constant.TestCaseRow.get("ActionSupportValue");
				} else {
					continue;
				}
			}

			ActionElement.sendKeys(FinalValue);

			infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Action: Submited stored value";
			Log.info(infoMessage);
			eInfoMessage = "Captured value is submitted for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "; Value: "
					+ ValueCaptured.get(arrayindex);
			ExtentLogs.info(eInfoMessage);
		}
	}

	static int gIndex = 0;

	public static void VerifyMultiCaptureClick() throws Exception, Throwable {
		SupportLib.waitForAjax();
		gIndex = 0;

		String Verification = "";
		WebElementCollection = FindElements();

		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		String dataValue = Constant.TestCaseRow.get("Data");
		String[] splitted = null;
		if (dataValue.contains(",")) {
			splitted = dataValue.split(",");
		}

		Verification = ValueCaptured.get(Integer.parseInt(splitted[0]));

		boolean firstResult = verifyCaptureCustom(Verification);
		int firstValueIndex = 0;
		boolean secondResult = false;

		if (firstResult) {
			firstValueIndex = gIndex;
			gIndex = 0;
			WebElementCollection = FindElementsFromActionSupport();

			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			}

			Verification = ValueCaptured.get(Integer.parseInt(splitted[1]));
			secondResult = verifyCaptureCustom(Verification);
		}

		if (secondResult && firstValueIndex == gIndex) {
			WebElement we = WebElementCollection.get(firstValueIndex - 1);
			we.click();

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription");
			Log.pass(passMessage);
			ePassMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription");
			ExtentLogs.Pass(ePassMessage);

		}

		else {
			failMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Failed; "
					+ Constant.TestCaseRow.get("TeststepDescription");
			Log.fail(failMessage);
			eFailMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Failed; "
					+ Constant.TestCaseRow.get("TeststepDescription");
			ExtentLogs.Fail(eFailMessage);

		}

	}

	public static boolean verifyCaptureCustom(String Verification) {
		String FromPage = "";
		List<String> FromPageList = new ArrayList<String>();
		boolean Result = false;

		FromPageList = SupportLib.GetElementText(WebElementCollection);

		for (String FromPageValue : FromPageList) {
			gIndex++;
			FromPage = FromPage + FromPageValue + ", ";

			FromPageValue = FromPageValue.toLowerCase();
			Verification = Verification.toLowerCase();
			if (FromPageValue.contains(Verification)) {
				Result = true;
				break;
			} else {
				Result = false;
			}
		}
		return Result;
	}
	
	
	
	

	public static void EditElementlocation() throws Exception {
		
		 FileInputStream fis = new FileInputStream(Constant.configFileLoc);
	        config.load(fis);
	        
	        String[] splited;
	        String Loc=null;
	    
	        
	        /*String data=Constant.TestCaseRow.get("Data");
	        if(data.contains("config")){
	            ActionElement.sendKeys(config.getProperty(data));*/
	    
	        String configValue = null;
	        
	        
	        
	        
	        SupportLib.waitForAjax();
	        String key = "", Type = "";
	    
	        
	        String data=Constant.TestCaseRow.get("Data");
	        
	        if(data.contains(":")){
	            
	            Loc = Constant.TestCaseRow.get("Elementlocation");
	            
	            splited=data.split(":");
	            switch (splited.length) {
	            case 2:
	                
	            	if(splited[0].contains("config.grid.startDate")||splited[0].contains("config.downloadrateshop.startdate")||splited[0].contains("config.grid.enddate")){
	            		
	            		int arrayindex = SupportLib.ExtractInt(Constant.TestCaseRow.get("Parameter"));
		               // configValue=splited[arrayindex];
	            		
	            		
	                    configValue=    config.getProperty(splited[0]);
	                    String[] dateMonth=configValue.split(" ");
	                    
	                    
	                    Loc = Loc.replace("value1", dateMonth[arrayindex]);
	                    
	                }
	            	
	            	
	            	else if(splited[0].contains("config")){
	                    configValue=    config.getProperty(splited[0]);
	                    Loc = Loc.replace("value1", configValue);
	                    
	                }
	                
	                else if(splited[0].contains("index")){
	                    int arrayindex = SupportLib.ExtractInt(splited[0]);
	                    configValue = ValueCaptured.get(arrayindex);
	                    
	                    Loc = Loc.replace("value1", configValue);
	                    
	                }
	                
	                if(splited[1].contains("config")){
	                    configValue=    config.getProperty(splited[1]);
	                    Loc = Loc.replace("value2", configValue);
	                    
	                }
	                
	                else if(splited[1].contains("index")){
	                    int arrayindex = SupportLib.ExtractInt(splited[1]);
	                    configValue = ValueCaptured.get(arrayindex);
	                    
	                    Loc = Loc.replace("value2", configValue);
	                    
	                }
	                
	                
	                
	                
	                
	                
	                
	                Constant.TestCaseRow.put("Elementlocation", configValue);
	                if (!Constant.TestCaseRow.get("ActionSupportValue").contains(
	                        "Blank")) {
	                    key = Constant.TestCaseRow.get("ActionSupportValue");
	                    Type = Constant.TestCaseRow.get("ElementFinderType");
	                    Constant.ObjrepLoc.put(key, Loc);
	                    Constant.ObjrepType.put(key, Type);
	                }
	                
	                System.out.println("  new element is     "+Loc+"  can be found with"+ key+"  and have elementg loc type objrep");
	                break;
	        
	            
	        }
	            
	        }
	        else if(Constant.TestCaseRow.get("Data").contains("config")){
	        
	        Loc = Constant.TestCaseRow.get("Elementlocation");
	    
	        if(Constant.TestCaseRow.get("Data").contains("config")){
	            configValue=    config.getProperty(Constant.TestCaseRow.get("Data"));
	            
	            
	            if(!Constant.TestCaseRow.get("Parameter").contains("Blank")){
	                
	                String splitted[]=configValue.split(" ");
	                int arrayindex = SupportLib.ExtractInt(Constant.TestCaseRow.get("Parameter"));
	                configValue=splitted[arrayindex];
	                
	            }
	            
	            
	            Loc = Loc.replace("value", configValue);
	            
	            Constant.TestCaseRow.put("Elementlocation", configValue);
	            if (!Constant.TestCaseRow.get("ActionSupportValue").contains(
	                    "Blank")) {
	                key = Constant.TestCaseRow.get("ActionSupportValue");
	                Type = Constant.TestCaseRow.get("ElementFinderType");
	                Constant.ObjrepLoc.put(key, Loc);
	                Constant.ObjrepType.put(key, Type);
	            }
	            //System.out.println("pass     -----------------");
	            
	        }
	        }
	        else{
	        int index = Integer.parseInt(Constant.TestCaseRow.get("Data"));

	        
          Loc = Constant.TestCaseRow.get("Elementlocation");
	        String requiredValue = ValueCaptured.get(index).trim();
	        if (Loc.contains("value") && requiredValue != null) {
	            Loc = Loc.replace("value", requiredValue);
	            Constant.TestCaseRow.put("Elementlocation", requiredValue);
	            if (!Constant.TestCaseRow.get("ActionSupportValue").contains(
	                    "Blank")) {
	                key = Constant.TestCaseRow.get("ActionSupportValue");
	                Type = Constant.TestCaseRow.get("ElementFinderType");
	                Constant.ObjrepLoc.put(key, Loc);
	                Constant.ObjrepType.put(key, Type);
	            }
	        }
	        }
	    
	        infoMessage = "New Element Location is : "
	                + Constant.TestCaseRow.get("Elementlocation")
	                + "Stored in ObjRep using element name: " + key + ": Type: "
	                + Type;
	        
	        System.out.println("  new element is     "+Loc+"  can be found with"+ key+"  and have elementg loc type objrep");
	        Log.info(infoMessage);
	        eInfoMessage = "New Element Location is : "
	                + Constant.TestCaseRow.get("Elementlocation")
	                + "Stored in ObjRep using element name: " + key + ": Type: "
	                + Type;
	        ;
	        ExtentLogs.info(eInfoMessage);

	    }

	public static void SkipIf() throws Exception {
		SupportLib.waitForAjax();

		ActionElement = FindElement();

		if (ActionElement != null) {

			skipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Element is found. Moving to next Step.";
			Log.skip(skipMessage);
			eSkipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Element is found. Moving to next Step.";
			ExtentLogs.Skip(eSkipMessage);
		} else {
			int rowsToSkip = Integer.parseInt(Constant.TestCaseRow.get("Data"));

			TestCaseRunner.testScriptIndex = TestCaseRunner.testScriptIndex
					+ rowsToSkip;

			infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Element Not Found. Skipping " + rowsToSkip + " rows";
			Log.info(infoMessage);
			eInfoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Element Not Found. Skipping " + rowsToSkip + " rows";
			ExtentLogs.info(eInfoMessage);
		}
	}

	public static void CleanValueCaptured() throws Exception {
		SupportLib.waitForAjax();

		ValueCaptured.clear();
		ValuesCaptured.clear();
		ExcelValuesCaptured.clear();
		compsetRate.clear();

		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Value Captured list is clean now";
		Log.info(infoMessage);
		eInfoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Value Captured list is clean now";
		ExtentLogs.info(eInfoMessage);
	}
	
	public static void CleanValuesCapturedOnly() throws Exception {
		SupportLib.waitForAjax();

		
		ValuesCaptured.clear();
		

		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Values Captured list is clean now";
		Log.info(infoMessage);
		eInfoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Values Captured list is clean now";
		ExtentLogs.info(eInfoMessage);
	}
	public static void CleanRateExcelcaptured() throws Exception {
		SupportLib.waitForAjax();

		
		ExcelValuesCaptured.clear();
		rateCaptured.clear();
		ValuesCaptured.clear();

		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Value Captured list is clean now";
		Log.info(infoMessage);
		eInfoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Value Captured list is clean now";
		ExtentLogs.info(eInfoMessage);
	}

	public static void VerifyMultiCaptureNot() throws Exception, Throwable {
		SupportLib.waitForAjax();
		gIndex = 0;

		String Verification = "";
		WebElementCollection = FindElements();

		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		String dataValue = Constant.TestCaseRow.get("Data");
		String[] splitted = null;
		if (dataValue.contains(",")) {
			splitted = dataValue.split(",");
		}

		Verification = ValueCaptured.get(Integer.parseInt(splitted[0]));

		boolean firstResult = verifyCaptureCustom(Verification);
		int firstValueIndex = 0;
		boolean secondResult = false;

		if (firstResult) {
			firstValueIndex = gIndex;
			gIndex = 0;
			WebElementCollection = FindElementsFromActionSupport();

			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			}

			Verification = ValueCaptured.get(Integer.parseInt(splitted[1]));
			secondResult = verifyCaptureCustom(Verification);
		}

		if (!secondResult || firstValueIndex != gIndex) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription");
			Log.pass(passMessage);
			ePassMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription");
			ExtentLogs.Pass(ePassMessage);

		} else {
			failMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Failed; "
					+ Constant.TestCaseRow.get("TeststepDescription");
			Log.fail(failMessage);
			eFailMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Failed; "
					+ Constant.TestCaseRow.get("TeststepDescription");
			ExtentLogs.Fail(eFailMessage);

		}

	}

	public static void DbVerifyAnyExact() throws Exception {
		if (Constant.DBLagTime) {
			Thread.sleep(Constant.DBLagTimeDuration);
		}
		boolean Result = false, ColumnExist = false;

		String Verification, VerificationColumn, FromDB = "";
		List<String> VerificationList = new ArrayList<String>();
		String query = Constant.TestCaseRow.get("Elementlocation");
		Verification = Constant.TestCaseRow.get("Data");
		List<String> columnNames = new ArrayList<String>();
		VerificationColumn = Constant.TestCaseRow.get("ActionSupportValue");

		VerificationList = SupportLib.ProcessData(Verification);

		if (Verification.contains("index")) {
			int index = Integer.parseInt(Verification.split("index")[1]);
			Verification = ValueCaptured.get(index);
		}

		int pgValueIndex = 0;
		if (query.contains(":")) {
			pgValueIndex = Integer.parseInt(query.split(":")[1]);

			String valueToBeReplaced = ValueCaptured.get(pgValueIndex);

			query = query.split(":")[0].trim();
			query = query.replaceAll("value", valueToBeReplaced);
		}

		DatabaseUtil dbUtil = new DatabaseUtil();
		ResultSet resultSet = dbUtil.executeQuery(query);

		if (Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			infoMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";Column Name is not provided, Please provide column name in ActionSupportValue";
			Log.info(infoMessage);
			eInfoMessage = "Column Name is not provided, Please provide column name in ActionSupportValue"
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.info(eInfoMessage);

		}

		ResultSetMetaData columns = resultSet.getMetaData();
		int i = 0;
		while (i < columns.getColumnCount()) {
			i++;
			columnNames.add(columns.getColumnName(i));
		}
		for (String culumn_name : columnNames) {
			if (culumn_name.equalsIgnoreCase(VerificationColumn)) {
				ColumnExist = true;
				break;
			} else {
				continue;
			}
		}

		if (!ColumnExist) {
			errorMessage = Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";Correct Column Name is not provided, Please provide column name in ActionSupportValue";
			Log.error(errorMessage);
			eErrorMessage = "Column Name is not provided, Please provide column name in ActionSupportValue"
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.error(eErrorMessage);
		}

		resultSet.beforeFirst();
		while (resultSet.next()) {
			if (Result)
				break;
			for (String VerificationValue : VerificationList) {
				if ((resultSet.getString(VerificationColumn))
						.equalsIgnoreCase(VerificationValue)) {
					FromDB = resultSet.getString(VerificationColumn);
					Result = true;
					break;
				} else {
					FromDB = resultSet.getString(VerificationColumn);
					continue;
				}
			}
		}
		dbUtil.CloseDB();

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + Verification
					+ "; Value form database: " + FromDB;
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + FromDB
					+ "; Againest verification value: " + Verification;
			ExtentLogs.Pass(ePassMessage);

		}

		else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Verification text: " + Verification
					+ ";does not exist in database result for column "
					+ VerificationColumn;
			Log.fail(failMessage);
			eFailMessage = "Database value Verification Failed for the query"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "for column" + VerificationColumn + "Values" + FromDB
					+ "; Againest verification value: " + Verification;
			ExtentLogs.Fail(eFailMessage);

		}

	}

	public static void VerifyPrevMonthsSpecific() throws Exception {
		SupportLib.waitForAjax();

		String actionSupVal = Constant.TestCaseRow.get("ActionSupportValue");
		String indexes = Constant.TestCaseRow.get("Data");
		String[] splittedIndexes = null;

		if (actionSupVal.equalsIgnoreCase("current")) {
			Date date = new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			actionSupVal = "" + (cal.get(Calendar.MONTH) + 1);
		}

		if (indexes.contains(",")) {
			splittedIndexes = indexes.split(",");
		}

		if (splittedIndexes.length == 3) {
			List<String> capturedValues = new ArrayList<String>();

			for (String index : splittedIndexes) {
				int i = Integer.parseInt(index);
				capturedValues.add(ValueCaptured.get(i));
			}

			boolean Result = false;

			switch (Integer.parseInt(actionSupVal)) {
			case 1:
				Result = capturedValues.get(0).contains("Dec");
				if (Result)
					Result = capturedValues.get(1).contains("Nov");
				if (Result)
					Result = capturedValues.get(2).contains("Oct");
				break;
			case 2:
				Result = capturedValues.get(0).contains("Jan");
				if (Result)
					Result = capturedValues.get(1).contains("Dec");
				if (Result)
					Result = capturedValues.get(2).contains("Nov");
				break;
			case 3:
				Result = capturedValues.get(0).contains("Feb");
				if (Result)
					Result = capturedValues.get(1).contains("Jan");
				if (Result)
					Result = capturedValues.get(2).contains("Dec");
				break;
			case 4:
				Result = capturedValues.get(0).contains("Mar");
				if (Result)
					Result = capturedValues.get(1).contains("Feb");
				if (Result)
					Result = capturedValues.get(2).contains("Jan");
				break;
			case 5:
				Result = capturedValues.get(0).contains("Apr");
				if (Result)
					Result = capturedValues.get(1).contains("Mar");
				if (Result)
					Result = capturedValues.get(2).contains("Feb");
				break;
			case 6:
				Result = capturedValues.get(0).contains("May");
				if (Result)
					Result = capturedValues.get(1).contains("Apr");
				if (Result)
					Result = capturedValues.get(2).contains("Mar");
				break;
			case 7:
				Result = capturedValues.get(0).contains("Jun");
				if (Result)
					Result = capturedValues.get(1).contains("May");
				if (Result)
					Result = capturedValues.get(2).contains("Apr");
				break;
			case 8:
				Result = capturedValues.get(0).contains("Jul");
				if (Result)
					Result = capturedValues.get(1).contains("Jun");
				if (Result)
					Result = capturedValues.get(2).contains("May");
				break;
			case 9:
				Result = capturedValues.get(0).contains("Aug");
				if (Result)
					Result = capturedValues.get(1).contains("Jul");
				if (Result)
					Result = capturedValues.get(2).contains("Jun");
				break;
			case 10:
				Result = capturedValues.get(0).contains("Sep");
				if (Result)
					Result = capturedValues.get(1).contains("Aug");
				if (Result)
					Result = capturedValues.get(2).contains("Jul");
				break;
			case 11:
				Result = capturedValues.get(0).contains("Oct");
				if (Result)
					Result = capturedValues.get(1).contains("Sep");
				if (Result)
					Result = capturedValues.get(2).contains("Aug");
				break;
			case 12:
				Result = capturedValues.get(0).contains("Nov");
				if (Result)
					Result = capturedValues.get(1).contains("Oct");
				if (Result)
					Result = capturedValues.get(2).contains("Sep");
				break;
			}

			if (Result) {
				passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Passed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Verified Against Captured Values: "
						+ capturedValues.get(0) + " , " + capturedValues.get(1)
						+ " , " + capturedValues.get(2);
				Log.pass(passMessage);
				ePassMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Passed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Verified Against Captured Values: "
						+ capturedValues.get(0) + " , " + capturedValues.get(1)
						+ " , " + capturedValues.get(2);
				ExtentLogs.Pass(ePassMessage);
			} else {
				failMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Failed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Verified Against Captured Values: "
						+ capturedValues.get(0) + " , " + capturedValues.get(1)
						+ " , " + capturedValues.get(2);
				Log.fail(failMessage);
				eFailMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Failed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Verified Against Captured Values: "
						+ capturedValues.get(0) + " , " + capturedValues.get(1)
						+ " , " + capturedValues.get(2);
				ExtentLogs.Fail(eFailMessage);

			}
		} else {
			failMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Failed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Data has less than 3 indexes";
			Log.fail(failMessage);
			eFailMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Failed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Data has less than 3 indexes";
			ExtentLogs.Fail(eFailMessage);
		}

	}

	
	
	// this function helps in capturing date for verify range
	//takes date format:attribute value in action support
	
	
	
	public static void CaptureDateRange() throws Exception, Throwable {
		
		
		
		SupportLib.waitForAjax();
		List<String> FromPageList = new ArrayList<String>();
		String Verification, FromPage = "", ErrorValue = "";
		boolean Result = false;
		boolean range = false;
		int days = 0;
		String[] date = null;
		
		int valueOne;
		int valueTwo;
		
		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		// dateformat:Attributevalue    
		if(Constant.TestCaseRow.get("ActionSupportValue").contains(":")){
			String[] FormatAttribute=Constant.TestCaseRow.get("ActionSupportValue").split(":");
			
			String AttributeValue=ActionElement.getAttribute(FormatAttribute[1]);
			
			if(AttributeValue.contains("-")){
				date	=AttributeValue.split("-");
				range=true;
				}
			else if(AttributeValue.contains("to")){
				date	=AttributeValue.split("to");
			range=true;
		}
			

			if(range){
			String sDate1=date[0];  
		    Date date1=new SimpleDateFormat(FormatAttribute[0]).parse(sDate1);  
		   
		    String sDate2= date[1];  
		    
		    Date date2=new SimpleDateFormat(FormatAttribute[0]).parse(sDate2);
		    Calendar c = Calendar.getInstance(); 
		     c.setTime(date1);
		     Date  dt = date1 ;
			 DateCapturedMultiple.add(dt);

		    while(dt.compareTo(date2) != 0){
		    c.add(Calendar.DATE, 1);
		    dt = c.getTime();
		    
		    DateCapturedMultiple.add(dt);
		    }
		 
		      
		
		    DateCaptured.add(date1);
		    DateCaptured.add(date2);
		    
		    

			}
			else{
				 Date date1=new SimpleDateFormat(FormatAttribute[0]).parse(AttributeValue);  
				    DateCaptured.add(date1);

			}
		
		
		}
		
		
	
		infoMessage =  Constant.TestCaseRow.get("TestStepID")
		+ ": " + Constant.TestCaseRow.get("TeststepDescription")+"Date selected: " + DateCaptured;
		Log.info(infoMessage);
		eInfoMessage = "Date selected:   " + DateCaptured;
		ExtentLogs.info(eInfoMessage);
		
	
	
	}
		

		
		
		public static void VerifyDateRange() throws Exception, Throwable {
			
			
			
			SupportLib.waitForAjax();
			List<String> FromPageList = new ArrayList<String>();
			String Verification, FromPage = "", ErrorValue = "";
			boolean Result = false;
			int days = 0;
			String[] date = null;
			
			Date start;
			Date end;
			
		
			ActionElement = FindElement();
			if (ActionElement == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			}

			
				String DateFormat=Constant.TestCaseRow.get("ActionSupportValue");
				
				String frompagedate=ActionElement.getText();
				
				
	 
			
		start=	DateCaptured.get(0);
		end=	DateCaptured.get(1);
			
			 Date verificationDate=new SimpleDateFormat(DateFormat).parse(frompagedate);  
			 
	
			 if (verificationDate.after(start) || (verificationDate.equals(start))
						&& verificationDate.before(end)|| (verificationDate.equals(start))) {
					Result = true;
				} else {
					Result = false;
					
				}
			
			 if (Result) {
					passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
							+ Constant.TestCaseRow.get("TeststepDescription") + "; "
							+ "Passed" + "; Value: " + verificationDate
							+ "; is present in Range between " + start+"  and "+end;
					Log.pass(passMessage);
					ePassMessage = Constant.TestCaseRow.get("TestStepID") + ": "
							+ Constant.TestCaseRow.get("TeststepDescription") + "; "
							+ "Passed" + "; Value: " + verificationDate
							+ "; is present in Range between " + start+"  and "+end;
					ExtentLogs.Pass(ePassMessage);
				} else {
					SupportLib.createScreenshot();
					failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
							+ ": " + Constant.TestCaseRow.get("TeststepDescription")
							+ "; Value: " + verificationDate
							+ "; is not in Range between " + start+"  and "+end;
					Log.fail(failMessage);
					eFailMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
							+ ": " + Constant.TestCaseRow.get("TeststepDescription")
							+ "; Value: " + verificationDate
							+ "; is not in Range between " + start+"  and "+end;
					ExtentLogs.Fail(eFailMessage);
				}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	public static void SubmitRandomAndCapture() throws Exception, Throwable {
		SupportLib.waitForAjax();
		String test = null;
		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		if (Constant.TestCaseRow.get("Data").contains(":")) {
			String[] valueTD = Constant.TestCaseRow.get("Data").split(":");

			int Lengthvalue = Integer.parseInt(valueTD[1]);

			if (valueTD[0].equalsIgnoreCase("A")) {
				test = SupportLib.RandomGenerator(Lengthvalue, 1);
			} else if (valueTD[0].equalsIgnoreCase("N")) {
				test = SupportLib.RandomGenerator(Lengthvalue, 2);
			} else if (valueTD[0].equalsIgnoreCase("AN")) {
				test = SupportLib.RandomGenerator(Lengthvalue, 3);
			} else if (valueTD[0].equalsIgnoreCase("ANS")) {
				test = SupportLib.RandomGenerator(Lengthvalue, 4);
			}
			ActionElement.sendKeys(test + Keys.TAB);
			ValueCaptured.add(test);
		}
		int size = ValueCaptured.size();
		size = size - 1;

		infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Submit Random Value: " + test + "; "
				+ "Index No at ValueCaptured list is" + size;
		Log.info(infoMessage);
		eInfoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ "; Action: Submit Random Value: " + test + "; "
				+ "Index No at ValueCaptured list is" + size;
		ExtentLogs.info(eInfoMessage);
	}

	public static void AddMonthInValueCaptured() throws Exception {
		SupportLib.waitForAjax();

		String filterType = "";
		int valueToFilter = 0;

		String dataValue = Constant.TestCaseRow.get("Data");

		if (dataValue.contains("day")) {
			filterType = "day";
		} else if (dataValue.contains("mon")) {
			filterType = "mon";
		} else if (dataValue.contains("yr")) {
			filterType = "yr";
		}

		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		int requiredValue = 0;
		valueToFilter = Integer
				.parseInt(dataValue.split("-")[1].charAt(0) + "");

		String actionSupportValue = Constant.TestCaseRow
				.get("ActionSupportValue");

		if (actionSupportValue.contains("index")) {
			String capturedVal = ValueCaptured.get(valueToFilter);
			valueToFilter = Integer.parseInt(capturedVal);
		}

		if (filterType.equalsIgnoreCase("day")) {
			cal.add(Calendar.DATE, -valueToFilter);
			requiredValue = cal.get(Calendar.DATE);
		} else if (filterType.equalsIgnoreCase("mon")) {
			cal.add(Calendar.MONTH, -valueToFilter);
			requiredValue = cal.get(Calendar.MONTH);
		} else if (filterType.equalsIgnoreCase("yr")) {
			cal.add(Calendar.YEAR, -valueToFilter);
			requiredValue = cal.get(Calendar.YEAR);
		}

		switch (requiredValue) {
		case 0:
			ValueCaptured.add("JAN");
			break;
		case 1:
			ValueCaptured.add("FEB");
			break;
		case 2:
			ValueCaptured.add("MAR");
			break;
		case 3:
			ValueCaptured.add("APR");
			break;
		case 4:
			ValueCaptured.add("MAY");
			break;
		case 5:
			ValueCaptured.add("JUN");
			break;
		case 6:
			ValueCaptured.add("JUL");
			break;
		case 7:
			ValueCaptured.add("AUG");
			break;
		case 8:
			ValueCaptured.add("SEP");
			break;
		case 9:
			ValueCaptured.add("OCT");
			break;
		case 10:
			ValueCaptured.add("NOV");
			break;
		case 11:
			ValueCaptured.add("DEC");
			break;
		}
	}

	public static void MonToInt() throws Exception {
		SupportLib.waitForAjax();

		String dataValue = Constant.TestCaseRow.get("Data");
		if (dataValue.contains("Capture:")) {
			int arrayindex = SupportLib.ExtractInt(Constant.TestCaseRow
					.get("Data"));
			dataValue = ValueCaptured.get(arrayindex);
		}
		switch (dataValue) {
		case "JAN":
			ValueCaptured.add("1");
			break;
		case "FEB":
			ValueCaptured.add("2");
			break;
		case "MAR":
			ValueCaptured.add("3");
			break;
		case "APR":
			ValueCaptured.add("4");
			break;
		case "MAY":
			ValueCaptured.add("5");
			break;
		case "JUN":
			ValueCaptured.add("6");
			break;
		case "JUL":
			ValueCaptured.add("7");
			break;
		case "AUG":
			ValueCaptured.add("8");
			break;
		case "SEP":
			ValueCaptured.add("9");
			break;
		case "OCT":
			ValueCaptured.add("10");
			break;
		case "NOV":
			ValueCaptured.add("11");
			break;
		case "DEC":
			ValueCaptured.add("12");
			break;
		}
	}

	public static void VerifyLastMonQuarterSpecific() throws Exception {
		SupportLib.waitForAjax();

		boolean Result = false;

		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		int currentMonth = cal.get(Calendar.MONTH);
		int currentYear = cal.get(Calendar.YEAR);

		String requiredStr = "";

		String actionSupportValue = Constant.TestCaseRow
				.get("ActionSupportValue");

		if (actionSupportValue.contains("prev")) {
			if (currentMonth < 3) {
				currentMonth = currentMonth + 12;
				currentYear = currentYear - 1;
			}
			currentMonth = currentMonth - 3;
		}

		if (currentMonth == 0 || currentMonth == 1 || currentMonth == 2) {
			requiredStr = "OCT-DEC " + (currentYear - 1);
		} else if (currentMonth == 3 || currentMonth == 4 || currentMonth == 5) {
			requiredStr = "JAN-MAR " + currentYear;
		} else if (currentMonth == 6 || currentMonth == 7 || currentMonth == 8) {
			requiredStr = "APR-JUN " + currentYear;
		} else if (currentMonth == 9 || currentMonth == 10
				|| currentMonth == 11) {
			requiredStr = "JUL-SEP " + currentYear;
		}

		String dataValue = Constant.TestCaseRow.get("Data");
		String capturedVal = ValueCaptured.get(Integer.parseInt(dataValue));

		if (capturedVal.contains(requiredStr)) {
			Result = true;
		} else {
			Result = false;
		}

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription") + "; "
					+ "Passed" + "; Required Value: " + requiredStr
					+ "; is present in Captured Value : " + capturedVal;
			Log.pass(passMessage);
			ePassMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription") + "; "
					+ "Passed" + "; Required Value: " + requiredStr
					+ "; is present in Captured Value : " + capturedVal;
			ExtentLogs.Pass(ePassMessage);
		} else {
			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; " + "; Required Value: " + requiredStr
					+ "; is NOT present in Captured Value : " + capturedVal;
			Log.fail(failMessage);
			eFailMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; " + "; Required Value: " + requiredStr
					+ "; is NOT present in Captured Value : " + capturedVal;
			ExtentLogs.Fail(eFailMessage);
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
public static void VerifyCapturewithConfig() throws Exception {
		
		FileInputStream fis = new FileInputStream(Constant.configFileLoc);
		config.load(fis);
		SupportLib.waitForAjax();
		
		String data=Constant.TestCaseRow.get("Data");
		
		
			int arrayindex = 0;
			boolean Result = false;
			String Verification1, Verification2;
			
				Verification1 = config.getProperty(data.split(",")[0]);

			arrayindex = Integer.parseInt(Constant.TestCaseRow.get("Data").split(
					",")[1]);

			
				Verification2 = ValueCaptured.get(arrayindex);

			Verification1 = Verification1.toLowerCase();
			Verification2 = Verification2.toLowerCase();

			// this is used to verify that both the captured values should not be
			// same.
			
			
			

			 if (Verification1.contains(Verification2)
					|| Verification2.contains(Verification1)) {
				Result = true;

			} else {
				Result = false;
			}

			if (Result) {
				passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ " Passed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Captured text1: " + Verification1
						+ "; Captured text2: " + Verification2;
				Log.pass(passMessage);
				ePassMessage = "   Verification passed :  "
						+ "; Captured text1: " + Verification1
						+ "; Captured text2: " + Verification2;
				ExtentLogs.Pass(ePassMessage);

			}

			else {
				failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
						+ ": " + Constant.TestCaseRow.get("TeststepDescription")
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Captured text1: " + Verification1
						+ "; Captured text2: " + Verification2;
				Log.fail(failMessage);
				eFailMessage = "Verification Failed for Element"
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "; Captured text1: " + Verification1
						+ "; Captured text2: " + Verification2;
				ExtentLogs.Fail(eFailMessage);

			}

		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void VerifyAfterDecimalLength() throws Exception, Throwable {
		SupportLib.waitForAjax();
		int Verification = 0;
		List<String> FromPageList = new ArrayList<String>();
		String FromPage = "";
		boolean Result = false;
		WebElementCollection = FindElements();

		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			FromPageList = SupportLib.GetElementAttribute(WebElementCollection,
					Constant.TestCaseRow.get("ActionSupportValue"));
		} else {
			FromPageList = SupportLib.GetElementText(WebElementCollection);
		}
		Verification = Integer.parseInt(Constant.TestCaseRow.get("Data"));

		for (String FromPageValue : FromPageList) {
			FromPageValue = FromPageValue.replaceAll("[^\\d.]", "");
			String afterDecimal = "";

			if (FromPageValue.contains(".")) {
				afterDecimal = FromPageValue.split("\\.")[1];
			} else {
				Result = false;
				break;
			}

			if (afterDecimal.length() == Verification) {
				Result = true;
			} else {
				Result = false;
				break;
			}
		}

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; After Decimal, Values should be : " + Verification
					+ "; Value form page: " + FromPage;
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + FromPage
					+ "; Against verification value: " + Verification;
			ExtentLogs.Pass(ePassMessage);

		}

		else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; After Decimal, Values should be : " + Verification
					+ "; Value form page: " + FromPage;
			Log.fail(failMessage);
			eFailMessage = "Verification Failed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + FromPage
					+ "; Against verification value: " + Verification;
			ExtentLogs.Fail(eFailMessage);

		}

	}

	public static void VerifyCaptureXMLNumbersSpecific() throws Exception,
			Throwable {

		boolean Result = false;
		String fromXMLVerification;
		double Verification;
		int Verificationindex;
		fromXMLVerification = XMLParser.ParseXML(driver.getCurrentUrl(),
				Constant.TestCaseRow.get("Elementlocation"));

		Verificationindex = Integer.parseInt(Constant.TestCaseRow.get("Data"));
		Verification = Double.parseDouble(ValueCaptured.get(Verificationindex));
		double dxml = Double.parseDouble(fromXMLVerification);

		if (dxml == Verification) {
			Result = true;
		} else {
			Result = false;
		}

		if (Result) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification + "; Present in XML: " + dxml;

			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "Value:"
					+ Verification + "; Present in XML: " + dxml;
			ExtentLogs.Pass(ePassMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Value: " + Verification + "; is Not Present in XML: "
					+ dxml;

			Log.fail(failMessage);

			eFailMessage = "Verification Failed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "Value:"
					+ Verification + ";is not Present in XML: " + dxml;
			ExtentLogs.Fail(eFailMessage);

		}
	}

	public static void DbVerifyAny() throws Exception {
		if (Constant.DBLagTime) {
			Thread.sleep(Constant.DBLagTimeDuration);
		}
		boolean Result = false;
		String FromDB = "";

		String query = Constant.TestCaseRow.get("Elementlocation");
		String dataValue = Constant.TestCaseRow.get("Data");
		String actionSupportValue = Constant.TestCaseRow
				.get("ActionSupportValue");

		String Verification = ValueCaptured.get(Integer.parseInt(dataValue));

		DatabaseUtil dbUtil = new DatabaseUtil();
		ResultSet resultSet = dbUtil.executeQuery(query);

		ResultSetMetaData metaData = resultSet.getMetaData();
		int columnCount = metaData.getColumnCount();

		resultSet.beforeFirst();
		while (resultSet.next()) {
			for (int i = 0; i < columnCount; i++) {
				if (resultSet.getString(actionSupportValue).contains(
						Verification)) {
					FromDB = resultSet.getString(actionSupportValue);
					Result = true;
					break;
				} else {
					Result = false;
				}
			}
			if (Result)
				break;
		}
		dbUtil.CloseDB();

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Captured text: " + Verification
					+ "; Value form database: " + FromDB;
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + FromDB
					+ "; Againest verification value: " + Verification;
			ExtentLogs.Pass(ePassMessage);
		} else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Verification text: " + Verification
					+ ";does not exist in database result for column "
					+ Verification;
			Log.fail(failMessage);
			eFailMessage = "Database value Verification Failed for the query"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "for column" + Verification + "Values" + FromDB
					+ "; Againest verification value: " + Verification;
			ExtentLogs.Fail(eFailMessage);

		}
	}

	public static void VerifyFileExistence() throws Exception {
		SupportLib.waitForAjax();

		boolean Result = false;

		int index1 = 0, index2 = 0;

		String dataValue = Constant.TestCaseRow.get("Data");
		String actionSupportValue = Constant.TestCaseRow
				.get("ActionSupportValue");

		String fileName = dataValue;

		if (actionSupportValue.contains(",")) {
			String[] splitted = actionSupportValue.split(",");
			index1 = Integer.parseInt(splitted[0].trim());
			index2 = Integer.parseInt(splitted[1].trim());
		}

		if (dataValue.contains("value1") && dataValue.contains("value2")) {
			String capturedVal1 = ValueCaptured.get(index1);
			String capturedVal2 = ValueCaptured.get(index2);

			fileName = fileName.replace("value1", capturedVal1);
			fileName = fileName.replace("value2", capturedVal2);
		}

		if (!dataValue.contains("Blank")) {
			File file = new File(fileName);
			if (file.exists()) {
				Result = true;
			} else {
				Result = false;
			}
		}

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; File : " + fileName + " is present";
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "; File : "
					+ fileName + " is present";
			ExtentLogs.Pass(ePassMessage);
		} else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; File : " + fileName + " is NOT present";
			Log.fail(failMessage);
			eFailMessage = "Database value Verification Failed for the query"
					+ Constant.TestCaseRow.get("Elementlocation") + "; File : "
					+ fileName + " is NOT present";
			ExtentLogs.Fail(eFailMessage);
		}
	}
	
	
	public static void ExcelFilter() throws Exception {
		
		
		String Filelocation = "C:\\Users\\vinayak.bansal\\Downloads\\Optima_16506_20170808_103157(1).xlsm";
		
		FileInputStream ExcelFile = new FileInputStream(Filelocation);
		XSSFWorkbook ExcelWBook = new XSSFWorkbook(ExcelFile);
		XSSFSheet ExcelWSheet = ExcelWBook.getSheet("Detail Data");
		
		
		String userData=Constant.TestCaseRow.get("Data");
		
		int rowNumber ;
		int columnnumber;
		
		int rowAgainstvalue = 0;
		String attributeval = null;
				
		String[] strArr= Constant.TestCaseRow.get("ActionSupportValue").split(",");
		rowNumber=Integer.parseInt(strArr[0]);
		columnnumber=Integer.parseInt(strArr[1]);
		
		
		int count=0;
		 XSSFCell Cell = null;
		
		
		 XSSFCell cell= ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
		 
		 
		 
		 String filterValue = "Milestone Hotel Kensington";
		if (cell != null && cell.getCellType() == Cell.CELL_TYPE_NUMERIC && cell.getStringCellValue() == filterValue) {
	            System.out.println("Found cell with value " + filterValue + " at [" + rowNumber + "," + columnnumber + "]");
	        } 
		
	}

	public static void VerifyValueInExcel() throws Exception {
		
		
		
		
		
		
		SupportLib.waitForAjax();

		boolean Result=false;

		String Filelocation = Constant.ExcelfileName;
	
		FileInputStream ExcelFile = new FileInputStream(Filelocation);
		XSSFWorkbook ExcelWBook = new XSSFWorkbook(ExcelFile);
		XSSFSheet ExcelWSheet = ExcelWBook.getSheet(Constant.TestCaseRow.get("Elementlocation"));
		
		
		
		
		
		
		
		
		
		
		String userData=Constant.TestCaseRow.get("Data");
		
		int rowNumber ;
		int columnnumber;
		
		int rowAgainstvalue = 0;
		String attributeval = null;
				
		String[] strArr= Constant.TestCaseRow.get("ActionSupportValue").split(",");
		rowNumber=Integer.parseInt(strArr[0]);
		columnnumber=Integer.parseInt(strArr[1]);
		
		
		int count=0;
		 XSSFCell Cell;
		
		
		 XSSFCell cell= ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
				
		 String Excelvalue=ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getStringCellValue();
		
		
		if(Excelvalue.contains(userData))
			Result=true;
		
		
		
		
		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+  userData + " is present in excel";
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation")
										+  userData + " is present in excel";

			ExtentLogs.Pass(ePassMessage);
		} else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
						+  userData 
					+ " is NOT present";
			Log.fail(failMessage);
			eFailMessage = "Database value Verification Failed for the query"
					+ Constant.TestCaseRow.get("Elementlocation")
					+  userData 
					+ " is NOT present";
			ExtentLogs.Fail(eFailMessage);
		}
	}

	public static void Deletefileinfolder() throws Exception {
		int index1 = 0, index2 = 0;
		String Filelocation = Constant.TestCaseRow.get("Elementlocation");
		String actionSupportValue = Constant.TestCaseRow
				.get("ActionSupportValue");

		String fileName = Filelocation;

		if( Constant.TestCaseRow.get("Data").equalsIgnoreCase("new")){
			
			String dir="C:\\Users\\"+System.getProperty("user.name") +"\\Downloads";

			File fl = new File(dir);
	    File[] files = fl.listFiles(new FileFilter() {          
	        public boolean accept(File file) {
	            return file.isFile();
	        }
	    });
	    long lastMod = Long.MIN_VALUE;
	    File choice = null;
	    for (File file : files) {
	        if (file.lastModified() > lastMod) {
	            choice = file;
	            lastMod = file.lastModified();
	        }
	    }

	    System.out.println( choice.getName());
	    fileName=choice.getName().toString();
		Path path = Paths.get(choice.toString());
	    
		try {
			boolean success = Files.deleteIfExists(path);
			System.out.println("Delete status: " + success);
		} catch (Exception e) {
			infoMessage = "Specified file is not deleted at location: "
					+ fileName + "Becasue of " + e.toString();

			Log.info(infoMessage);
			eInfoMessage = "Specified file is not deleted at location: "
					+ fileName + "Becasue of " + e.toString();
			ExtentLogs.info(eInfoMessage);
		}
	    
		}
		else{
		
			if (actionSupportValue.contains(",")) {
			String[] splitted = actionSupportValue.split(",");
			index1 = Integer.parseInt(splitted[0].trim());
			index2 = Integer.parseInt(splitted[1].trim());
		}

		if (fileName.contains("value1") && fileName.contains("value2")) {
			String capturedVal1 = ValueCaptured.get(index1);
			String capturedVal2 = ValueCaptured.get(index2);
			fileName = fileName.replace("value1", capturedVal1);
			fileName = fileName.replace("value2", capturedVal2);
		}

		Path path = Paths.get(fileName);
		try {
			boolean success = Files.deleteIfExists(path);
			System.out.println("Delete status: " + success);
		} catch (Exception e) {
			infoMessage = "Specified file is not deleted at location: "
					+ fileName + "Because of " + e.toString();

			Log.info(infoMessage);
			eInfoMessage = "Specified file is not deleted at location: "
					+ fileName + "Becasue of " + e.toString();
			ExtentLogs.info(eInfoMessage);
		}
		infoMessage = "Specified file deleted at location: " + fileName;

		Log.info(infoMessage);
		eInfoMessage = "Specified file is not deleted at location: " + fileName;
		ExtentLogs.info(eInfoMessage);
	}
	}
	public static void DbVerifyEmptyColumn() throws Exception {
		if (Constant.DBLagTime) {
			Thread.sleep(Constant.DBLagTimeDuration);
		}
		boolean Result = false;

		String query = Constant.TestCaseRow.get("Elementlocation");
		String actionSupportValue = Constant.TestCaseRow
				.get("ActionSupportValue");

		int pgValueIndex = 0;
		if (query.contains(":")) {
			pgValueIndex = Integer.parseInt(query.split(":")[1]);

			String valueToBeReplaced = ValueCaptured.get(pgValueIndex);

			query = query.split(":")[0].trim();
			if (query.contains("valuenumber")) {
				query = query.replaceAll("valuenumber", valueToBeReplaced);
			}
		}

		DatabaseUtil dbUtil = new DatabaseUtil();
		ResultSet resultSet = dbUtil.executeQuery(query);

		if (resultSet.first()) {
			resultSet.beforeFirst();
			while (resultSet.next()) {
				if (resultSet.getString(actionSupportValue) == null) {
					Result = true;
				} else {
					Result = false;
					break;
				}
			}
		} else {
			Result = true;
		}

		dbUtil.CloseDB();

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Column : " + actionSupportValue
					+ " is empty or not present.";
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "; Column : " + actionSupportValue
					+ " is empty or not present..";
			ExtentLogs.Pass(ePassMessage);
		} else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Column : " + actionSupportValue + " is NOT empty.";
			Log.fail(failMessage);
			eFailMessage = "Database value Verification Failed for the query"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "; Column : " + actionSupportValue + " is NOT empty.";
			ExtentLogs.Fail(eFailMessage);

		}
	}

	public static void DbAddToValueCaptured() throws Exception {
		if (Constant.DBLagTime) {
			Thread.sleep(Constant.DBLagTimeDuration);
		}
		boolean Result = false;

		String query = Constant.TestCaseRow.get("Elementlocation");
		String actionSupportValue = Constant.TestCaseRow
				.get("ActionSupportValue");
		String dbValue = "";

		int pgValueIndex = 0;
		if (query.contains(":")) {
			pgValueIndex = Integer.parseInt(query.split(":")[1]);

			String valueToBeReplaced = ValueCaptured.get(pgValueIndex);

			query = query.split(":")[0].trim();
			if (query.contains("valuenumber")) {
				query = query.replaceAll("valuenumber", valueToBeReplaced);
			}
		}

		DatabaseUtil dbUtil = new DatabaseUtil();
		ResultSet resultSet = dbUtil.executeQuery(query);

		resultSet.beforeFirst();
		while (resultSet.next()) {
			if (resultSet.getString(actionSupportValue) != null
					&& resultSet.getString(actionSupportValue).length() > 0) {
				dbValue = resultSet.getString(actionSupportValue);
				ValueCaptured.add(dbValue);
				Result = true;
				break;
			} else {
				Result = false;
			}
		}
		dbUtil.CloseDB();

		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; DB Value : " + dbValue
					+ " has been added to ValueCaptured list.";
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "; DB Value : " + dbValue
					+ " has been added to ValueCaptured list.";
			ExtentLogs.Pass(ePassMessage);
		} else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; DB Value : " + dbValue + " is null or empty.";
			Log.fail(failMessage);
			eFailMessage = "Database value Verification Failed for the query"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "; DB Value : " + dbValue + " is null or ampty.";

		}
	}

	
	
	
	
	/*tooltip is nothing but the the mouse hover on the screen
	 * 
	 * 
	 * Remember that the xpath which we use with tooltip is slightly different
	 * 
	 * .//*[@id='CompetitivenessChart']/div/div[1]/*[name()='svg']//*[local-name() = 'g'][6]
	 * /*[local-name() = 'g']/*[local-name() = 'g'][8]/*[local-name()='path']
	 * 
	 * */
	
	
	
	
	public static void ToolTipCapture() throws Exception {
		SupportLib.waitForAjax();

		if (!(Constant.TestCaseRow.get("ActionSupportValue").contains("Blank"))
				|| !(Constant.TestCaseRow.get("Data").contains("Blank"))) {
			WebElementCollection = FindElements();

			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			} else {
				ActionElement = SupportLib.SearhElement(WebElementCollection);
			}

		} else {
			ActionElement = FindElement();
			Actions action = new Actions(driver);
			action.moveToElement(ActionElement).build().perform();
			passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": ToolTipNavigation";
			Log.pass(passMessage);
			ePassMessage = "ToolTip Navigation is performed: "
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.Pass(ePassMessage);
		}
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

	}
	
	
	public static void ToolTipCaptureIf() throws Exception {
		SupportLib.waitForAjax();
		
		ActionElement = FindElement();
		if (ActionElement == null) {
			skipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ":  Element is not present or it is a case of 'NA Rate' moving to next step";
			Log.skip(skipMessage);
			eSkipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ":  Element is not present or it is a case of 'NA Rate' moving to next step";
			ExtentLogs.Skip(eSkipMessage);
		} else{

		if (!(Constant.TestCaseRow.get("ActionSupportValue").contains("Blank"))
				|| !(Constant.TestCaseRow.get("Data").contains("Blank"))) {
			WebElementCollection = FindElements();

			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			} else {
				ActionElement = SupportLib.SearhElement(WebElementCollection);
			}

		} else {
			ActionElement = FindElement();
			Actions action = new Actions(driver);
			action.moveToElement(ActionElement).build().perform();
			passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": ToolTipNavigation";
			Log.pass(passMessage);
			ePassMessage = "ToolTip Navigation is performed: "
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.Pass(ePassMessage);
		}
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		}
	}

	public static void GetText() throws Exception {
		SupportLib.waitForAjax();

		if (!(Constant.TestCaseRow.get("ActionSupportValue").contains("Blank"))
				|| !(Constant.TestCaseRow.get("Data").contains("Blank"))) {
			WebElementCollection = FindElements();

			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			} else {
				ActionElement = SupportLib.SearhElement(WebElementCollection);
			}

		} else {
			ActionElement = FindElement();
			String CapturedText = ActionElement.getText();
			/* String CapturedText=ActionElement.getAttribute("value"); */
			System.out.println(CapturedText);
			passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ": Getting the text from webElement";
			Log.pass(passMessage);
			ePassMessage = "Text captured suessfully: "
					+ Constant.TestCaseRow.get("Elementlocation");
			ExtentLogs.Pass(ePassMessage);

		}
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

	}

	

	public static void MouseDoubleClick() throws Exception {

		SupportLib.waitForAjax();
		if (!(Constant.TestCaseRow.get("ActionSupportValue").contains("Blank"))
				|| !(Constant.TestCaseRow.get("Data").contains("Blank"))) {
			WebElementCollection = FindElements();

			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			} else {
				ActionElement = SupportLib.SearhElement(WebElementCollection);
			}

		} else {
			ActionElement = FindElement();
			Actions action = new Actions(driver);
			action.doubleClick(ActionElement).perform();

		}

	}

	public static void DatePicker() throws Exception {

		SupportLib.waitForAjax();
		String Verification = "";
		ActionElement = FindElement();
		Verification = Constant.TestCaseRow.get("Data");
		String InputDate = Verification.substring(0, Verification.indexOf("."));
		/* System.out.println(A); */
		WebElement dateWidget = ActionElement;
		List rows = dateWidget.findElements(By.tagName("tr"));
		/* int a=rows.size(); */
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
		/* int b =columns.size(); */

		for (WebElement cell : columns) {
			// Select 13th Date
			String DatePick = cell.getText();

			if (DatePick.equalsIgnoreCase(InputDate)) {
				cell.click();

				break;

			}
		}

	}

	public static void NumberValueCapture() throws Exception, Throwable {
		SupportLib.waitForAjax();
		ActionElement = FindElement();
		String DataValue = Constant.TestCaseRow.get("Data");
		String ValueFromPage = "";
		String Leftlimit = "", RightLimit = "";
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		if (!DataValue.contains("Blank")) {
			if (DataValue.contains("^")) {
				Leftlimit = DataValue.split("\\^")[0];
				RightLimit = DataValue.split("\\^")[1];
				Leftlimit = Leftlimit.replace("&lt", "");
				RightLimit = RightLimit.replace("&rt", "");
			} else if (DataValue.contains("&lt")) {
				Leftlimit = DataValue.replace("&lt", "");
			} else {
				RightLimit = DataValue.replace("&rt", "");
			}
		}

		if (Constant.TestCaseRow.get("ActionSupportValue") == "Blank") {
			ValueFromPage = ActionElement.getText();
		} else {
			ValueFromPage = ActionElement.getAttribute(Constant.TestCaseRow
					.get("ActionSupportValue"));
		}

		if (Leftlimit != "") {
			Leftlimit = Leftlimit.trim();
			ValueFromPage = ValueFromPage.split(Leftlimit)[1];
		}
		if (RightLimit != "") {
			RightLimit = RightLimit.trim();
			ValueFromPage = ValueFromPage.split(RightLimit)[0];
			// ValueFromPage = ValueFromPage.split("\\(")[0];
		}
		if (ValueFromPage.contains("Post")) {
			ValueFromPage = ValueFromPage.trim();
			ValueFromPage = ValueFromPage.split(" ")[0];
		}
		ValueFromPage = ValueFromPage.trim();

		int capturedNumber = Integer.parseInt(ValueFromPage);
		NumberValueCaptured.add(capturedNumber);

		int size = ValueCaptured.size();
		size = size - 1;
		infoMessage = ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		Log.info(infoMessage);
		eInfoMessage = ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		ExtentLogs.info(eInfoMessage);

	}

	public static void FindFileDirectory() throws Exception, Throwable {
		SupportLib.waitForAjax();
		String FileName = Constant.TestCaseRow.get("Data");
		String GetDirectory = Constant.TestCaseRow.get("Elementlocation");
		File dir = new File(FileName);
		File[] dir_contents = dir.listFiles();
		String FileFormat = Constant.TestCaseRow.get("ActionSupportValue");
		if (FileFormat.equalsIgnoreCase("PDF")) {
			String temp = FileName + ".PDF";

			for (int i = 0; i < dir_contents.length; i++) {
				if (dir_contents[i].getName() == (temp)) {

				}
			}
		}

	}

	
	
	
	public static void VerifyExcelSheets() throws Exception {
		boolean Result=false;

		
		
		String Filelocation ="C:\\Users\\vinayak.bansal\\Downloads\\Optima_16137_20170804_121950.xlsm";
			//	Constant.ExcelfileName;
		FileInputStream ExcelFile = new FileInputStream(Filelocation);
		XSSFWorkbook ExcelWBook = new XSSFWorkbook(ExcelFile);
		List<String> sheetNames = new ArrayList<String>();
		for (int i=0; i<ExcelWBook.getNumberOfSheets(); i++) {
		    sheetNames.add( ExcelWBook.getSheetName(i) );
		}
		
		String[] checkWith = Constant.TestCaseRow.get("Data").split(",");

		for (int i = 0; i < checkWith.length; i++) {
			if(sheetNames.contains(checkWith[i])){
				Result=true;
			}
			else{
				Result=false;
			break;
			}
		}
		
		
		
		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "sheets from file "+sheetNames+" contains sheets user defined "+Arrays.toString(checkWith);
			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation")
				+ "sheets from file "+sheetNames+" contains sheets user defined "+Arrays.toString(checkWith);

			ExtentLogs.Pass(ePassMessage);
		} else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
									+ "sheets from file "+sheetNames+" dosenot contains sheets user defined "+Arrays.toString(checkWith);

			Log.fail(failMessage);
			eFailMessage = "Database value Verification Failed for the query"
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "sheets from file "+sheetNames+" dosenot contains sheets user defined "+Arrays.toString(checkWith);

		}
		
		
	}
	
	public static void VerifyPriceChangeFromExcel() throws Exception {
		String datacolumn=Constant.TestCaseRow.get("Data");
		 XSSFCell Cell;
			
		 XSSFSheet ExcelWSheet1 = null ;
		 XSSFSheet ExcelWSheet2 = null ;

			XSSFWorkbook ExcelWBook1;
			FileInputStream ExcelFile1;
			String allFilters1[] = null;
			
			XSSFWorkbook ExcelWBook2;
			FileInputStream ExcelFile2;
			String allFilters2[] = null;
			
		if(datacolumn.contains("config")){
			String twoSheets[]=	datacolumn.split(",");
			
			if(twoSheets[0].contains("config.file.Report")){
			String configdata=	config.getProperty(twoSheets[0]);
			String filesheet[]=configdata.split(",");
			
			String Filelocation=filesheet[0];
			 ExcelFile1 = new FileInputStream(Filelocation);
			 ExcelWBook1 = new XSSFWorkbook(ExcelFile1);
			ExcelWSheet1= ExcelWBook1.getSheet(filesheet[1]);
				
			}
			
			
			if(twoSheets[1].contains("config.file.LastReport")){
				String configdata=	config.getProperty(twoSheets[0]);
				String filesheet[]=configdata.split(",");
				
				String Filelocation=filesheet[0];
				 ExcelFile2 = new FileInputStream(Filelocation);
				 ExcelWBook2 = new XSSFWorkbook(ExcelFile2);
				ExcelWSheet2= ExcelWBook2.getSheet(filesheet[1]);
					
				}
				
			}
		
		
		String filter=Constant.TestCaseRow.get("Elementlocation");

		
		
		
		
		
		
	}
	
	public static void CompetitionGraphValuesCapture() throws Exception {
	
		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		
		String hoverelement= Constant.TestCaseRow.get("ActionSupportValue");

		
		
		for (int i = 0; i < WebElementCollection.size(); i++) {
			
			
			
			Actions action = new Actions(driver);
			action.moveToElement(WebElementCollection.get(i)).build().perform();
			Thread.sleep(1000);

			String value=driver.findElement(By.xpath(hoverelement)).getText();
			Thread.sleep(1000);
			ValuesCaptured.add(value);
			
		}
	}
	
	
	
//refer test 0088, 66 , 67
	public static void VerifyRatesInExcel() throws Exception {
		SupportLib.waitForAjax();

		boolean Result=false;
		boolean skipresult=false;

		 String[] key=new String[8];
		 String[] value = new String[8];
		 
		 int column0,column1,column2,column3,column4,column5,column6,column7,column8;
			String value0=null,value1 = null,value3=null,value4=null,value5=null,value6=null,value7=null,value8=null;
			Date value2=null;
			String data=null;
			int count=0;
			 XSSFCell Cell;
			
			 XSSFSheet ExcelWSheet = null ;
				XSSFWorkbook ExcelWBook;
				FileInputStream ExcelFile;
				String allFilters[] = null;
				
				

				String datacolumn=Constant.TestCaseRow.get("Data");
				
			if(Constant.ExcelfileName!=null)
			{
		String Filelocation = Constant.ExcelfileName;
	
		 ExcelFile = new FileInputStream(Filelocation);
		 ExcelWBook = new XSSFWorkbook(ExcelFile);
		 ExcelWSheet = ExcelWBook.getSheet(Constant.TestCaseRow.get("Data"));
		
			
			}
		
			
				
			else if(datacolumn.contains("config")){
		
			String configdata=	config.getProperty(datacolumn);
			String filesheet[]=configdata.split(",");
			
			String Filelocation=filesheet[0];
			 ExcelFile = new FileInputStream(Filelocation);
			 ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet= ExcelWBook.getSheet(filesheet[1]);
				
				
				
			}else{
		 String Filelocation = "C:\\Users\\vinayak.bansal\\Downloads\\Optima_16530_20170809_145931.xlsm";
				 
				 
			
		 ExcelFile = new FileInputStream(Filelocation);
		 ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet= ExcelWBook.getSheet("Detail Data");
		
		
		
			}
		int lastRow=ExcelWSheet.getLastRowNum();
		
		
		
		
		int rowNumber ;
		int columnnumber;
		
		int rowAgainstvalue = 0;
		String attributeval = null;
				
		String[] strArr= Constant.TestCaseRow.get("ActionSupportValue").split(",");
		rowNumber=Integer.parseInt(strArr[0]);
		columnnumber=Integer.parseInt(strArr[1]);
		
		String filter=Constant.TestCaseRow.get("Elementlocation");
		
		if(filter.contains(":")){
	
		 allFilters= filter.split(":");
		
		
		for (int i = 0; i < allFilters.length; i++) {

			keyValue = allFilters[i].split(",");

			key[i] = keyValue[0];
			value[i] = keyValue[1];

		}
		
		}
		
		
		
		if(!filter.contains(":")){
		if(Constant.TestCaseRow.get("Elementlocation")!=null && !(Constant.TestCaseRow.get("Elementlocation").contains("config"))){
		String[] rowAttribure= Constant.TestCaseRow.get("Elementlocation").split(",");
		rowAgainstvalue=	SupportLib.ExtractInt(rowAttribure[0]);
		attributeval=rowAttribure[1];
		}
		else if(Constant.TestCaseRow.get("Elementlocation")!=null && (Constant.TestCaseRow.get("Elementlocation").contains("config"))){
			String[] rowAttribure= Constant.TestCaseRow.get("Elementlocation").split(",");
			rowAgainstvalue=	SupportLib.ExtractInt(rowAttribure[0]);
			
			attributeval=config.getProperty(rowAttribure[1]);
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 while(ValuesCaptured.size()!=count && lastRow>rowNumber)
		 {
		//	System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber-1).getStringCellValue());
			
			 
			if(ExcelWSheet.getRow(rowNumber).getCell(rowAgainstvalue).getStringCellValue().contains(attributeval)){
		//		 System.out.println("  "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber));
				XSSFCell cell= ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
				
				 // checking if its an number
				 if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
				 {
					 System.out.println("number");
					 // by default numbers are stored in double 
					double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getNumericCellValue();
				
					// convert from double to int
					int intvalue=(int) doublevalue;
					
					// now storing value in arraylist
							ExcelValuesCaptured.add(intvalue);
				 }
				 
					
						
			 else{
				 ExcelValuesCaptured.add(ExcelWSheet.getRow(rowNumber).getCell(columnnumber));
			 System.out.println("else condition");
			 }
				 
				 count++;
			 }
			 else if(Constant.TestCaseRow.get("Data").equalsIgnoreCase("Rank")){
				 XSSFCell cell= ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
					
				 // checking if its an number
				 if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
				 {
					 System.out.println("number");
					 // by default numbers are stored in double 
					double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getNumericCellValue();
				
					// convert from double to int
					int intvalue=(int) doublevalue;
					
					// now storing value in arraylist
							ExcelValuesCaptured.add(intvalue);
				 }
				 count++;
			 }
			 else if(Constant.TestCaseRow.get("Data").equalsIgnoreCase("parity")&&ExcelWSheet.getRow(rowNumber).getCell(rowAgainstvalue).getStringCellValue().equalsIgnoreCase(attributeval)){
				 
				 XSSFCell cell= ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
					
				 // checking if its an number
				 if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
				 {
					 System.out.println("number");
					 // by default numbers are stored in double 
					double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getNumericCellValue();
				
					// convert from double to int
					int intvalue=(int) doublevalue;
												ExcelValuesCaptured.add(intvalue);

					// now storing value in arraylist
				 }
				 else if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING){
					String value11= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getStringCellValue();
					ExcelValuesCaptured.add(value11);

				 }
				 count++;
				 
			 }
			 
			 
		
			 rowNumber++;
			
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		else{
			switch (allFilters.length) {
			case 2:
				// Statements
				column0=	SupportLib.ExtractInt(key[0]);
				if(value[0].contains("config")){
					
					
					
					
					
					
					
					 data=Constant.TestCaseRow.get("Data");
					
					value0=config.getProperty(value[0]);
				}
				else if(value[0].contains("index")){
					
					
					
					
					
					int arrayindex = SupportLib.ExtractInt(value[0]);
				    value0 = ValueCaptured.get(arrayindex);
					
					
				
					}
				else if(value[0].contains("date")){
					int arrayindex = SupportLib.ExtractInt(value[0]);
					 value0 =	DateCaptured.get(arrayindex)+"";
				}
				
					// 1
				
				 column1=	SupportLib.ExtractInt(key[1]);
					if(value[1].contains("config")){
						
						
						
						 data=Constant.TestCaseRow.get("Data");
						
						value1=config.getProperty(value[1]);
					}
					else if(value[1].contains("index")){
						
						
						
						
						
						int arrayindex = SupportLib.ExtractInt(value[1]);
					    value1 = ValueCaptured.get(arrayindex);
						
						
					
						}
					else if(value[1].contains("date")){
						int arrayindex = SupportLib.ExtractInt(value[1]);
						 value0 =	DateCaptured.get(arrayindex)+"";
					}
					else{
						value1=value[1];
					}

					
					
					
					
					
					
					
					Boolean checkchannel=false;
					 //rate datails specific
					 while(ValuesCaptured.size()!=count && lastRow>rowNumber)
					 {
					//	System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber-1).getStringCellValue());
						 
						 
						if( checkchannel==false&&ExcelWSheet.getRow(rowNumber).getCell(column0).getStringCellValue().equalsIgnoreCase(value0)){
							checkchannel=true;
						}
						if(	checkchannel==true	&& ExcelWSheet.getRow(rowNumber).getCell(column1).getStringCellValue().equalsIgnoreCase(value1)
								){
					//		 System.out.println("  "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber));
							XSSFCell cell= ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
							
							 // checking if its an number
							 if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
							 {
								 System.out.println("number");
								 // by default numbers are stored in double 
								double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getNumericCellValue();
							
								// convert from double to int
								int intvalue=(int) doublevalue;
								
								// now storing value in arraylist
										ExcelValuesCaptured.add(intvalue);
							 }
							 
							 else	 if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING)
							 {
							//	 System.out.println("string");
								 // by default numbers are stored in double 
								String Stringvalue= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getStringCellValue();
							
								// convert from double to int
								
								// now storing value in arraylist
										ExcelValuesCaptured.add(Stringvalue);
							 }
							 
							 
							 
							 count++;
						}
						System.out.println(rowNumber);
						
						 rowNumber++;

						
						
					 }
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				break;

			case 3:
				// Statements
				
				
				 column0=	SupportLib.ExtractInt(key[0]);
				if(value[0].contains("config")){
					
					
					
					
					
					
					
					 data=Constant.TestCaseRow.get("Data");
					
					value0=config.getProperty(value[0]);
				}
				else if(value[0].contains("index")){
					
					
					
					
					
					int arrayindex = SupportLib.ExtractInt(value[0]);
				    value0 = ValueCaptured.get(arrayindex);
					
					
				
					}
				else if(value[0].contains("date")){
					int arrayindex = SupportLib.ExtractInt(value[0]);
					 value0 =	DateCaptured.get(arrayindex)+"";
				}
				
					// 1
				
				 column1=	SupportLib.ExtractInt(key[1]);
					if(value[1].contains("config")){
						
						
						
						 data=Constant.TestCaseRow.get("Data");
						
						value1=config.getProperty(value[1]);
					}
					else if(value[1].contains("index")){
						
						
						
						
						
						int arrayindex = SupportLib.ExtractInt(value[1]);
					    value1 = ValueCaptured.get(arrayindex);
						
						
					
						}
					else if(value[1].contains("date")){
						int arrayindex = SupportLib.ExtractInt(value[1]);
						 value0 =	DateCaptured.get(arrayindex)+"";
					}
					else if(value[1].contains("all")){
						value1 =	"";
					}
					
					
				// 2
					
					
					 column2=	SupportLib.ExtractInt(key[2]);
						if(value[2].contains("config")){
							 data=Constant.TestCaseRow.get("Data");
							
							value1=config.getProperty(value[2]);
						}
						else if(value[2].contains("index")){
							
							
							
							
							
							int arrayindex = SupportLib.ExtractInt(value[2]);
						    value0 = ValueCaptured.get(arrayindex);
							
							
						
							}
						else if(value[2].contains("date")){
							int arrayindex = SupportLib.ExtractInt(value[2]);
							 value2 =	DateCaptured.get(arrayindex);
						}
					
						
						
						
						
						
						
						
						/////////////////
						/*
						int count=0;
						 XSSFCell Cell;*/
						System.out.println("condition  "+ExcelWSheet.getRow(rowNumber).getCell(column0).getStringCellValue());
						 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber).getCell(column1).getStringCellValue());
						 

						 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber).getCell(column2).getDateCellValue());
						 
					/*	 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber+1).getCell(columnnumber));
						 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber+1).getCell(columnnumber-1));
					//	 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber+1).getCell(columnnumber-3));
						 
						 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber+2).getCell(columnnumber));
						 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber+2).getCell(columnnumber-1));
					//	 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber+2).getCell(columnnumber-3));
*/
					
						// while(ExcelWSheet.getRow(rowNumber).getCell(columnnumber-1)!=null){
						 
						 while(ValuesCaptured.size()!=count && lastRow>rowNumber)
						 {
						//	System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber-1).getStringCellValue());
							
							 
							 
							 try{
								 
								 ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
								 }catch(Exception e){
									// System.out.println("null");
									 break;
									 
								 }
								
							 
							 if(rowNumber==5587)
								 //System.out.println("here");
								 
								 
							if(ExcelWSheet.getRow(rowNumber).getCell(column0).getStringCellValue().contains(value0)
									&& ExcelWSheet.getRow(rowNumber).getCell(column1).getStringCellValue().contains(value1)
									&& ExcelWSheet.getRow(rowNumber).getCell(column2).getDateCellValue().equals(value2)
									){
						//		 System.out.println("  "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber));
								XSSFCell cell= ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
								
								 // checking if its an number
								 if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
								 {
									 System.out.println("number");
									 // by default numbers are stored in double 
									double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getNumericCellValue();
								
									// convert from double to int
									int intvalue=(int) doublevalue;
									
									// now storing value in arraylist
											ExcelValuesCaptured.add(intvalue);
								 }
								 
								 else	 if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING)
								 {
									 System.out.println("string");
									 // by default numbers are stored in double 
									String Stringvalue= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getStringCellValue();
								
									// convert from double to int
									
									// now storing value in arraylist
											ExcelValuesCaptured.add(Stringvalue);
								 }
								 
								 
								 
								 count++;
							}
							
							
							 rowNumber++;

							
							
						 }
						
					//////////////////////
				
				break;
			
				
				/////////////////case 4 start
			case 4:
			
				if(value[0].contains("config.filter.Restriction")){}
				 column0=	SupportLib.ExtractInt(key[0]);
					if(value[0].contains("config")){
						 data=Constant.TestCaseRow.get("Data");
						
						value0=config.getProperty(value[0]);
					}
					else if(value[0].contains("index")){
						
						
						
						
						
						int arrayindex = SupportLib.ExtractInt(value[0]);
					    value0 = ValueCaptured.get(arrayindex);
						
						
					
						}
					else if(value[0].contains("date")){
						int arrayindex = SupportLib.ExtractInt(value[0]);
						 value0 =	DateCaptured.get(arrayindex)+"";
					}
					
						// 1
					
					 column1=	SupportLib.ExtractInt(key[1]);
						if(value[1].contains("config")){
							 data=Constant.TestCaseRow.get("Data");
							
							value1=config.getProperty(value[1]);
						}
						else if(value[1].contains("index")){
							
							
							
							
							
							int arrayindex = SupportLib.ExtractInt(value[1]);
						    value1 = ValueCaptured.get(arrayindex);
							
							
						
							}
						else if(value[1].contains("date")){
							int arrayindex = SupportLib.ExtractInt(value[1]);
							 value1 =	DateCaptured.get(arrayindex)+"";
						}
						
						else if(value[1].contains("all")){
							value1 =	"";
						}
						
					// 2
						
						
						 column2=	SupportLib.ExtractInt(key[2]);
							if(value[2].contains("config")){
								 data=Constant.TestCaseRow.get("Data");
								
								value1=config.getProperty(value[2]);
							}
							else if(value[2].contains("index")){
								
								
								
								
								
								int arrayindex = SupportLib.ExtractInt(value[2]);
							    value0 = ValueCaptured.get(arrayindex);
								
								
							
								}
							else if(value[2].contains("date")){
								int arrayindex = SupportLib.ExtractInt(value[2]);
								 value2 =	DateCapturedMultiple.get(arrayindex);
							}
						
							// 3
							
							
							 column3=	SupportLib.ExtractInt(key[3]);
								if(value[3].contains("config")){
									if(value[3].contains("config.filter.Restriction")){
										
										data=config.getProperty(value[3]);
										
										if(data.equalsIgnoreCase("all"))
											value3="";
									else if(data.equalsIgnoreCase("Un-Restricted"))
											value3="No";
										else
											value3="Yes";

									}
									else if(value[3].contains("config.filter.Qualification")){
										
										data=config.getProperty(value[3]);

										if(data.equalsIgnoreCase("all"))
											value3="";
									else if(data.equalsIgnoreCase("Un-Qualified"))
											value3="Unqualified";
										else
											value3="New_Qualification";

									}
									else if(value[3].contains("config.filter.Promotion")){
										
										data=config.getProperty(value[3]);
										if(data.equalsIgnoreCase("all"))
											value3="";
									else if(data.equalsIgnoreCase("Non-Promotional"))
											value3="No";
										else
											value3="Yes";

									}
									
									else if(value[3].contains("config.filter.RoomType")){
										
										data=config.getProperty(value[3]);
										if(data.equalsIgnoreCase("all"))
											value3="";
									
										else
											value3=data;

									}
									
									else if(value[3].contains("config.filter.LOS")){
										
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									
									else if(value[3].contains("config.filter.GuestCount")){
	
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									else if(value[3].contains("config.filter.Inclusions")){
										
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									else if(value[3].contains("config.filter.Channel")){
										
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									else if(value[3].contains("config.filter.Compset")){
										
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									
									 
								}
								else if(value[3].contains("index")){
								
									int arrayindex = SupportLib.ExtractInt(value[3]);
								    value3 = ValueCaptured.get(arrayindex);
									
									
								
									}
								
				
				
				
				
				
				
								 while(ValuesCaptured.size()!=count && lastRow>rowNumber )
								 {
									 
									 if(rowNumber==422||rowNumber==400){
									// System.out.println("here");
									 }
									 
									 
									 try{
									 
									 ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
									 }catch(Exception e){
										// System.out.println("null");
										 break;
										 
									 }
									

									 
									 
									 double filtercondition=0;
									 
									 if(ExcelWSheet.getRow(rowNumber).getCell(column3).getCellType()==XSSFCell.CELL_TYPE_NUMERIC){
											double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(column3).getNumericCellValue();
											 filtercondition=Double.parseDouble(value3);
										}
									
									 
									// System.out.println(ExcelWSheet.getRow(rowNumber).getCell(column3).getStringCellValue());
									 
									if(ExcelWSheet.getRow(rowNumber).getCell(column0).getStringCellValue().equalsIgnoreCase(value0)

											&& ((ExcelWSheet.getRow(rowNumber).getCell(column1).getStringCellValue().contains("Rank")
											&&ExcelWSheet.getRow(rowNumber).getCell(column1).getStringCellValue().contains(value1)&&value[1].equalsIgnoreCase("all")
											)||(ExcelWSheet.getRow(rowNumber).getCell(column1).getStringCellValue().equalsIgnoreCase(value1)
											)||(ExcelWSheet.getRow(rowNumber).getCell(column1).getStringCellValue().contains(value1)
											&&value[1].equalsIgnoreCase("all")))
											
											
											
											&& ExcelWSheet.getRow(rowNumber).getCell(column2).getDateCellValue().equals(value2)
											&&( 
													
											
												(ExcelWSheet.getRow(rowNumber).getCell(column3).getCellType()==XSSFCell.CELL_TYPE_STRING
												&& ExcelWSheet.getRow(rowNumber).getCell(column3).getStringCellValue().contains(value3))
											|| (
													
													ExcelWSheet.getRow(rowNumber).getCell(column3).getCellType()==XSSFCell.CELL_TYPE_NUMERIC
													
												&&	ExcelWSheet.getRow(rowNumber).getCell(column3).getNumericCellValue()==(filtercondition)
											
											
											)
											
													
													
													)
											
											)
											
											{
										
										System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(column0));
										System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(column1));
										System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(column2));
										System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(column3));
										
										
										
										
								//		 System.out.println("  "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber));
										XSSFCell cell= ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
										
										 // checking if its an number
										 if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
										 {
											 System.out.println("number");
											 // by default numbers are stored in double 
											double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getNumericCellValue();
										
											// convert from double to int
											int intvalue=(int) doublevalue;
											
											// now storing value in arraylist
													ExcelValuesCaptured.add(intvalue);
										 }
										 
										 else	 if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING)
										 {
											 System.out.println("string");
											 // by default numbers are stored in double 
											String Stringvalue= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getStringCellValue();
										
											// convert from double to int
											
											// now storing value in arraylist
													ExcelValuesCaptured.add(Stringvalue);
										 }
										 
										 
										 
										 count++;
									}
									
									
									 rowNumber++;
									
									 
									 
									 
									
									
									
								 }
				
				
				
				
				
				
				
				
			break;
			// case 4 ends
			
			
			
			
			
			
			
			////// case 5 start
			
			
			
			
			
			
			case 5:
			///0
		
				 column0=	SupportLib.ExtractInt(key[0]);
					if(value[0].contains("config")){
						 data=Constant.TestCaseRow.get("Data");
						
						value0=config.getProperty(value[0]);
					}
					else if(value[0].contains("index")){
						
						
						
						
						
						int arrayindex = SupportLib.ExtractInt(value[0]);
					    value0 = ValueCaptured.get(arrayindex);
						
						
					
						}
					else if(value[0].contains("date")){
						int arrayindex = SupportLib.ExtractInt(value[0]);
						 value0 =	DateCaptured.get(arrayindex)+"";
					}
					
						// 1
					
					 column1=	SupportLib.ExtractInt(key[1]);
						if(value[1].contains("config")){
							 data=Constant.TestCaseRow.get("Data");
							
							value1=config.getProperty(value[1]);
						}
						else if(value[1].contains("index")){
							
							
							
							
							
							int arrayindex = SupportLib.ExtractInt(value[1]);
						    value1 = ValueCaptured.get(arrayindex);
							
							
						
							}
						else if(value[1].contains("date")){
							int arrayindex = SupportLib.ExtractInt(value[1]);
							 value0 =	DateCaptured.get(arrayindex)+"";
						}
						
						else if(value[1].contains("all")){
							value1 =	"";
						}
						
					// 2
						
						
						 column2=	SupportLib.ExtractInt(key[2]);
							if(value[2].contains("config")){
								 data=Constant.TestCaseRow.get("Data");
								
								value1=config.getProperty(value[2]);
							}
							else if(value[2].contains("index")){
								
								
								
								
								
								int arrayindex = SupportLib.ExtractInt(value[2]);
							    value0 = ValueCaptured.get(arrayindex);
								
								
							
								}
							else if(value[2].contains("date")){
								int arrayindex = SupportLib.ExtractInt(value[2]);
								 value2 =	DateCapturedMultiple.get(arrayindex);
							}
						
							// 3
							
							
							 column3=	SupportLib.ExtractInt(key[3]);
								if(value[3].contains("config")){
									if(value[3].contains("config.filter.Restriction")){
										
										data=config.getProperty(value[3]);
										
										if(data.equalsIgnoreCase("all"))
											value3="";
									else if(data.equalsIgnoreCase("Un-Restricted"))
											value3="No";
										else
											value3="Yes";

									}
									else if(value[3].contains("config.filter.Qualification")){
										
										data=config.getProperty(value[3]);

										if(data.equalsIgnoreCase("all"))
											value3="";
									else if(data.equalsIgnoreCase("Un-Qualified"))
											value3="Unqualified";
										else
											value3="New_Qualification";

									}
									else if(value[3].contains("config.filter.Promotion")){
										
										data=config.getProperty(value[3]);
										if(data.equalsIgnoreCase("all"))
											value3="";
									else if(data.equalsIgnoreCase("Non-Promotional"))
											value3="No";
										else
											value3="Yes";

									}
									
									else if(value[3].contains("config.filter.RoomType")){
										
										data=config.getProperty(value[3]);
										if(data.equalsIgnoreCase("all"))
											value3="";
									
										else
											value3=data;

									}
									
									else if(value[3].contains("config.filter.LOS")){
										
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									
									else if(value[3].contains("config.filter.GuestCount")){
	
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									else if(value[3].contains("config.filter.Inclusions")){
										
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									else if(value[3].contains("config.filter.Channel")){
										
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									else if(value[3].contains("config.filter.Compset")){
										
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									
									 
								}
								else if(value[3].contains("index")){
								
									int arrayindex = SupportLib.ExtractInt(value[3]);
								    value3 = ValueCaptured.get(arrayindex);
									
									
								
									}
								
								// 4
								
								
								 column4=	SupportLib.ExtractInt(key[4]);
									if(value[4].contains("config")){
										if(value[4].contains("config.filter.Restriction")){
											
											data=config.getProperty(value[4]);
											
											if(data.equalsIgnoreCase("all"))
												value4="";
										else if(data.equalsIgnoreCase("Un-Restricted"))
												value4="No";
											else
												value4="Yes";

										}
										else if(value[4].contains("config.filter.Qualification")){
											
											data=config.getProperty(value[4]);

											if(data.equalsIgnoreCase("all"))
												value4="";
										else if(data.equalsIgnoreCase("Un-Qualified"))
												value4="Unqualified";
											else
												value4="New_Qualification";

										}
										else if(value[4].contains("config.filter.Promotion")){
											
											data=config.getProperty(value[4]);
											if(data.equalsIgnoreCase("all"))
												value4="";
										else if(data.equalsIgnoreCase("Non-Promotional"))
												value4="No";
											else
												value4="Yes";

										}
										
										else if(value[4].contains("config.filter.RoomType")){
											
											data=config.getProperty(value[4]);
											if(data.equalsIgnoreCase("all"))
												value4="";
										
											else
												value4=data;

										}
										
										else if(value[4].contains("config.filter.LOS")){
											
											data=config.getProperty(value[4]);
											
												value4=data;

										}
										
										else if(value[4].contains("config.filter.GuestCount")){
		
											data=config.getProperty(value[4]);
											
												value4=data;

										}
										else if(value[4].contains("config.filter.Inclusions")){
											
											data=config.getProperty(value[4]);
											
												value4=data;

										}
										else if(value[4].contains("config.filter.Channel")){
											
											data=config.getProperty(value[4]);
											
												value4=data;

										}
										else if(value[4].contains("config.filter.Compset")){
											
											data=config.getProperty(value[4]);
											
												value4=data;

										}
										
										 
									}
									else if(value[4].contains("index")){
									
										int arrayindex = SupportLib.ExtractInt(value[4]);
									    value4 = ValueCaptured.get(arrayindex);
										
										
									
										}
									//// 4 ends
				
									// 5
									
									
									 column5=	SupportLib.ExtractInt(key[5]);
										if(value[5].contains("config")){
											if(value[5].contains("config.filter.Restriction")){
												
												data=config.getProperty(value[5]);
												
												if(data.equalsIgnoreCase("all"))
													value5="";
											else if(data.equalsIgnoreCase("Un-Restricted"))
													value5="No";
												else
													value5="Yes";

											}
											else if(value[5].contains("config.filter.Qualification")){
												
												data=config.getProperty(value[5]);

												if(data.equalsIgnoreCase("all"))
													value5="";
											else if(data.equalsIgnoreCase("Un-Qualified"))
													value5="Unqualified";
												else
													value5="New_Qualification";

											}
											else if(value[5].contains("config.filter.Promotion")){
												
												data=config.getProperty(value[5]);
												if(data.equalsIgnoreCase("all"))
													value5="";
											else if(data.equalsIgnoreCase("Non-Promotional"))
													value5="No";
												else
													value5="Yes";

											}
											
											else if(value[5].contains("config.filter.RoomType")){
												
												data=config.getProperty(value[5]);
												if(data.equalsIgnoreCase("all"))
													value5="";
											
												else
													value5=data;

											}
											
											else if(value[5].contains("config.filter.LOS")){
												
												data=config.getProperty(value[5]);
												
													value5=data;

											}
											
											else if(value[5].contains("config.filter.GuestCount")){
			
												data=config.getProperty(value[5]);
												
													value5=data;

											}
											else if(value[5].contains("config.filter.Inclusions")){
												
												data=config.getProperty(value[5]);
												
													value4=data;

											}
											else if(value[5].contains("config.filter.Channel")){
												
												data=config.getProperty(value[5]);
												
													value5=data;

											}
											else if(value[5].contains("config.filter.Compset")){
												
												data=config.getProperty(value[5]);
												
													value5=data;

											}
											
											 
										}
										else if(value[5].contains("index")){
										
											int arrayindex = SupportLib.ExtractInt(value[5]);
										    value5 = ValueCaptured.get(arrayindex);
											
											
										
											}
										//// 5 ends
				
				
				
								 while(ValuesCaptured.size()!=count && lastRow>rowNumber )
								 {
									 
									 
									 
									 
									 
									 
									 try{
									 
									 ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
									 }catch(Exception e){
										// System.out.println("null");
										 break;
										 
									 }
									

									 
									 
									 double filtercondition=0;
									 
									 if(ExcelWSheet.getRow(rowNumber).getCell(column3).getCellType()==XSSFCell.CELL_TYPE_NUMERIC){
											double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(column3).getNumericCellValue();
											 filtercondition= doublevalue;
										}
									
									 
									// System.out.println(ExcelWSheet.getRow(rowNumber).getCell(column3).getStringCellValue());
									 
									if(ExcelWSheet.getRow(rowNumber).getCell(column0).getStringCellValue().equalsIgnoreCase(value0)

											&& ExcelWSheet.getRow(rowNumber).getCell(column1).getStringCellValue().contains(value1)
											
											
											
											&& ExcelWSheet.getRow(rowNumber).getCell(column2).getDateCellValue().equals(value2)
											&&( 
													
											
												(ExcelWSheet.getRow(rowNumber).getCell(column3).getCellType()==XSSFCell.CELL_TYPE_STRING
												&& ExcelWSheet.getRow(rowNumber).getCell(column3).getStringCellValue().contains(value3))
											|| (
													
													ExcelWSheet.getRow(rowNumber).getCell(column3).getCellType()==XSSFCell.CELL_TYPE_NUMERIC
													
												&&	ExcelWSheet.getRow(rowNumber).getCell(column3).getNumericCellValue()==(filtercondition)
											
											
											)
											
													
													
													)
													&&( 
													
											
												(ExcelWSheet.getRow(rowNumber).getCell(column4).getCellType()==XSSFCell.CELL_TYPE_STRING
												&& ExcelWSheet.getRow(rowNumber).getCell(column4).getStringCellValue().contains(value4))
											|| (
													
													ExcelWSheet.getRow(rowNumber).getCell(column4).getCellType()==XSSFCell.CELL_TYPE_NUMERIC
													
												&&	ExcelWSheet.getRow(rowNumber).getCell(column4).getNumericCellValue()==(filtercondition)
											
											
											)
											
													
													
													)
													&&( 
													
											
												(ExcelWSheet.getRow(rowNumber).getCell(column5).getCellType()==XSSFCell.CELL_TYPE_STRING
												&& ExcelWSheet.getRow(rowNumber).getCell(column5).getStringCellValue().contains(value5))
											|| (
													
													ExcelWSheet.getRow(rowNumber).getCell(column5).getCellType()==XSSFCell.CELL_TYPE_NUMERIC
													
												&&	ExcelWSheet.getRow(rowNumber).getCell(column5).getNumericCellValue()==(filtercondition)
											
											
											)
											
													
													
													)
											
											)
											
											{
										
										System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(column0));
										System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(column1));
										System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(column2));
										System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(column3));
										
										
										
										
								//		 System.out.println("  "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber));
										XSSFCell cell= ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
										
										 // checking if its an number
										 if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
										 {
											 System.out.println("number");
											 // by default numbers are stored in double 
											double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getNumericCellValue();
										
											// convert from double to int
											int intvalue=(int) doublevalue;
											
											// now storing value in arraylist
													ExcelValuesCaptured.add(intvalue);
										 }
										 
										 else	 if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING)
										 {
											 System.out.println("string");
											 // by default numbers are stored in double 
											String Stringvalue= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getStringCellValue();
										
											// convert from double to int
											
											// now storing value in arraylist
													ExcelValuesCaptured.add(Stringvalue);
										 }
										 
										 
										 
										 count++;
									}
									
									
									 rowNumber++;
									
									 
									 
								
									
									
								 }
				
				
				
				
				
				
				
				
			break;
			
			
			
			
			
			
			
			
			/// case 5 ends
			
			
			

			////// case  8 start
			
			
			
			
			
			
			case 8:
			///0
		
				 column0=	SupportLib.ExtractInt(key[0]);
					if(value[0].contains("config")){
						 data=Constant.TestCaseRow.get("Data");
						
						value0=config.getProperty(value[0]);
					}
					else if(value[0].contains("index")){
						
						
						
						
						
						int arrayindex = SupportLib.ExtractInt(value[0]);
					    value0 = ValueCaptured.get(arrayindex);
						
						
					
						}
					else if(value[0].contains("date")){
						int arrayindex = SupportLib.ExtractInt(value[0]);
						 value0 =	DateCaptured.get(arrayindex)+"";
					}
					
						// 1
					
					 column1=	SupportLib.ExtractInt(key[1]);
						if(value[1].contains("config")){
							 data=Constant.TestCaseRow.get("Data");
							
							value1=config.getProperty(value[1]);
						}
						else if(value[1].contains("index")){
							
							
							
							
							
							int arrayindex = SupportLib.ExtractInt(value[1]);
						    value1 = ValueCaptured.get(arrayindex);
							
							
						
							}
						else if(value[1].contains("date")){
							int arrayindex = SupportLib.ExtractInt(value[1]);
							 value0 =	DateCaptured.get(arrayindex)+"";
						}
						
						else if(value[1].contains("all")){
							value1 =	"";
						}
						
					// 2
						
						
						 column2=	SupportLib.ExtractInt(key[2]);
							if(value[2].contains("config")){
								 data=Constant.TestCaseRow.get("Data");
								
								value1=config.getProperty(value[2]);
							}
							else if(value[2].contains("index")){
								
								
								
								
								
								int arrayindex = SupportLib.ExtractInt(value[2]);
							    value0 = ValueCaptured.get(arrayindex);
								
								
							
								}
							else if(value[2].contains("date")){
								int arrayindex = SupportLib.ExtractInt(value[2]);
								 value2 =	DateCapturedMultiple.get(arrayindex);
							}
						
							// 3
							
							
							 column3=	SupportLib.ExtractInt(key[3]);
								if(value[3].contains("config")){
									if(value[3].contains("config.filter.Restriction")){
										
										data=config.getProperty(value[3]);
										
										if(data.equalsIgnoreCase("all"))
											value3="";
									else if(data.equalsIgnoreCase("Un-Restricted"))
											value3="No";
										else
											value3="Yes";

									}
									else if(value[3].contains("config.filter.Qualification")){
										
										data=config.getProperty(value[3]);

										if(data.equalsIgnoreCase("all"))
											value3="";
									else if(data.equalsIgnoreCase("Un-Qualified"))
											value3="Unqualified";
										else
											value3="New_Qualification";

									}
									else if(value[3].contains("config.filter.Promotion")){
										
										data=config.getProperty(value[3]);
										if(data.equalsIgnoreCase("all"))
											value3="";
									else if(data.equalsIgnoreCase("Non-Promotional"))
											value3="No";
										else
											value3="Yes";

									}
									
									else if(value[3].contains("config.filter.RoomType")){
										
										data=config.getProperty(value[3]);
										if(data.equalsIgnoreCase("all"))
											value3="";
									
										else
											value3=data;

									}
									
									else if(value[3].contains("config.filter.LOS")){
										
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									
									else if(value[3].contains("config.filter.GuestCount")){
	
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									else if(value[3].contains("config.filter.Inclusions")){
										
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									else if(value[3].contains("config.filter.Channel")){
										
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									else if(value[3].contains("config.filter.Compset")){
										
										data=config.getProperty(value[3]);
										
											value3=data;

									}
									
									 
								}
								else if(value[3].contains("index")){
								
									int arrayindex = SupportLib.ExtractInt(value[3]);
								    value3 = ValueCaptured.get(arrayindex);
									
									
								
									}
								
								// 4
								
								
								 column4=	SupportLib.ExtractInt(key[4]);
									if(value[4].contains("config")){
										if(value[4].contains("config.filter.Restriction")){
											
											data=config.getProperty(value[4]);
											
											if(data.equalsIgnoreCase("all"))
												value4="";
										else if(data.equalsIgnoreCase("Un-Restricted"))
												value4="No";
											else
												value4="Yes";

										}
										else if(value[4].contains("config.filter.Qualification")){
											
											data=config.getProperty(value[4]);

											if(data.equalsIgnoreCase("all"))
												value4="";
										else if(data.equalsIgnoreCase("Un-Qualified"))
												value4="Unqualified";
											else
												value4="New_Qualification";

										}
										else if(value[4].contains("config.filter.Promotion")){
											
											data=config.getProperty(value[4]);
											if(data.equalsIgnoreCase("all"))
												value4="";
										else if(data.equalsIgnoreCase("Non-Promotional"))
												value4="No";
											else
												value4="Yes";

										}
										
										else if(value[4].contains("config.filter.RoomType")){
											
											data=config.getProperty(value[4]);
											if(data.equalsIgnoreCase("all"))
												value4="";
										
											else
												value4=data;

										}
										
										else if(value[4].contains("config.filter.LOS")){
											
											data=config.getProperty(value[4]);
											
												value4=data;

										}
										
										else if(value[4].contains("config.filter.GuestCount")){
		
											data=config.getProperty(value[4]);
											
												value4=data;

										}
										else if(value[4].contains("config.filter.Inclusions")){
											
											data=config.getProperty(value[4]);
											
												value4=data;

										}
										else if(value[4].contains("config.filter.Channel")){
											
											data=config.getProperty(value[4]);
											
												value4=data;

										}
										else if(value[4].contains("config.filter.Compset")){
											
											data=config.getProperty(value[4]);
											
												value4=data;

										}
										
										 
									}
									else if(value[4].contains("index")){
									
										int arrayindex = SupportLib.ExtractInt(value[4]);
									    value4 = ValueCaptured.get(arrayindex);
										
										
									
										}
									//// 4 ends
				
									// 5
									
									
									 column5=	SupportLib.ExtractInt(key[5]);
										if(value[5].contains("config")){
											if(value[5].contains("config.filter.Restriction")){
												
												data=config.getProperty(value[5]);
												
												if(data.equalsIgnoreCase("all"))
													value5="";
											else if(data.equalsIgnoreCase("Un-Restricted"))
													value5="No";
												else
													value5="Yes";

											}
											else if(value[5].contains("config.filter.Qualification")){
												
												data=config.getProperty(value[5]);

												if(data.equalsIgnoreCase("all"))
													value5="";
											else if(data.equalsIgnoreCase("Un-Qualified"))
													value5="Unqualified";
												else
													value5="New_Qualification";

											}
											else if(value[5].contains("config.filter.Promotion")){
												
												data=config.getProperty(value[5]);
												if(data.equalsIgnoreCase("all"))
													value5="";
											else if(data.equalsIgnoreCase("Non-Promotional"))
													value5="No";
												else
													value5="Yes";

											}
											
											else if(value[5].contains("config.filter.RoomType")){
												
												data=config.getProperty(value[5]);
												if(data.equalsIgnoreCase("all"))
													value5="";
											
												else
													value5=data;

											}
											
											else if(value[5].contains("config.filter.LOS")){
												
												data=config.getProperty(value[5]);
												
													value5=data;

											}
											
											else if(value[5].contains("config.filter.GuestCount")){
			
												data=config.getProperty(value[5]);
												
													value5=data;

											}
											else if(value[5].contains("config.filter.Inclusions")){
												
												data=config.getProperty(value[5]);
												
													value4=data;

											}
											else if(value[5].contains("config.filter.Channel")){
												
												data=config.getProperty(value[5]);
												
													value5=data;

											}
											else if(value[5].contains("config.filter.Compset")){
												
												data=config.getProperty(value[5]);
												
													value5=data;

											}
											
											 
										}
										else if(value[5].contains("index")){
										
											int arrayindex = SupportLib.ExtractInt(value[5]);
										    value5 = ValueCaptured.get(arrayindex);
											
											
										
											}
										//// 5 ends
				// 6 start internal
										// 6
										
										
										 column6=	SupportLib.ExtractInt(key[6]);
											if(value[6].contains("config")){
												if(value[6].contains("config.filter.Restriction")){
													
													data=config.getProperty(value[6]);
													
													if(data.equalsIgnoreCase("all"))
														value6="";
												else if(data.equalsIgnoreCase("Un-Restricted"))
														value6="No";
													else
														value6="Yes";

												}
												else if(value[6].contains("config.filter.Qualification")){
													
													data=config.getProperty(value[6]);

													if(data.equalsIgnoreCase("all"))
														value6="";
												else if(data.equalsIgnoreCase("Un-Qualified"))
														value6="Unqualified";
													else
														value6="New_Qualification";

												}
												else if(value[6].contains("config.filter.Promotion")){
													
													data=config.getProperty(value[6]);
													if(data.equalsIgnoreCase("all"))
														value6="";
												else if(data.equalsIgnoreCase("Non-Promotional"))
														value6="No";
													else
														value6="Yes";

												}
												
												else if(value[6].contains("config.filter.RoomType")){
													
													data=config.getProperty(value[6]);
													if(data.equalsIgnoreCase("all"))
														value6="";
												
													else
														value6=data;

												}
												
												else if(value[6].contains("config.filter.LOS")){
													
													data=config.getProperty(value[6]);
													
														value6=data;

												}
												
												else if(value[6].contains("config.filter.GuestCount")){
				
													data=config.getProperty(value[6]);
													
														value6=data;

												}
												else if(value[6].contains("config.filter.Inclusions")){
													
													data=config.getProperty(value[6]);
													
														value6=data;

												}
												else if(value[6].contains("config.filter.Channel")){
													
													data=config.getProperty(value[6]);
													
														value6=data;

												}
												else if(value[6].contains("config.filter.Compset")){
													
													data=config.getProperty(value[6]);
													
														value6=data;

												}
												
												 
											}
											else if(value[6].contains("index")){
											
												int arrayindex = SupportLib.ExtractInt(value[6]);
											    value6 = ValueCaptured.get(arrayindex);
												
												
											
												}
													
				// 6 end internal
											
							// 7 internal start
											
											// 7
											
											
											 column7=	SupportLib.ExtractInt(key[7]);
												if(value[7].contains("config")){
													if(value[7].contains("config.filter.Restriction")){
														
														data=config.getProperty(value[7]);
														
														if(data.equalsIgnoreCase("all"))
															value7="";
													else if(data.equalsIgnoreCase("Un-Restricted"))
															value7="No";
														else
															value7="Yes";

													}
													else if(value[7].contains("config.filter.Qualification")){
														
														data=config.getProperty(value[7]);

														if(data.equalsIgnoreCase("all"))
															value7="";
													else if(data.equalsIgnoreCase("Un-Qualified"))
															value7="Unqualified";
														else
															value7="New_Qualification";

													}
													else if(value[7].contains("config.filter.Promotion")){
														
														data=config.getProperty(value[7]);
														if(data.equalsIgnoreCase("all"))
															value7="";
													else if(data.equalsIgnoreCase("Non-Promotional"))
															value7="No";
														else
															value7="Yes";

													}
													
													else if(value[7].contains("config.filter.RoomType")){
														
														data=config.getProperty(value[7]);
														if(data.equalsIgnoreCase("all"))
															value7="";
													
														else
															value7=data;

													}
													
													else if(value[7].contains("config.filter.LOS")){
														
														data=config.getProperty(value[7]);
														
															value7=data;

													}
													
													else if(value[7].contains("config.filter.GuestCount")){
					
														data=config.getProperty(value[7]);
														
															value7=data;

													}
													else if(value[7].contains("config.filter.Inclusions")){
														
														data=config.getProperty(value[7]);
														
															value7=data;

													}
													else if(value[7].contains("config.filter.Channel")){
														
														data=config.getProperty(value[7]);
														
															value7=data;

													}
													else if(value[7].contains("config.filter.Compset")){
														
														data=config.getProperty(value[7]);
														
															value7=data;

													}
													
													 
												}
												else if(value[7].contains("index")){
												
													int arrayindex = SupportLib.ExtractInt(value[7]);
												    value7 = ValueCaptured.get(arrayindex);
													
													
												
													}
														
											
							// 7 internal ends
											
											
											
										/*	// 8 internal start
												// 8
												
												
												 column8=	SupportLib.ExtractInt(key[8]);
													if(value[8].contains("config")){
														if(value[8].contains("config.filter.Restriction")){
															
															data=config.getProperty(value[8]);
															
															if(data.equalsIgnoreCase("all"))
																value8="";
														else if(data.equalsIgnoreCase("Un-Restricted"))
																value8="No";
															else
																value8="Yes";

														}
														else if(value[8].contains("config.filter.Qualification")){
															
															data=config.getProperty(value[8]);

															if(data.equalsIgnoreCase("all"))
																value8="";
														else if(data.equalsIgnoreCase("Un-Qualified"))
																value8="Unqualified";
															else
																value8="New_Qualification";

														}
														else if(value[8].contains("config.filter.Promotion")){
															
															data=config.getProperty(value[8]);
															if(data.equalsIgnoreCase("all"))
																value8="";
														else if(data.equalsIgnoreCase("Non-Promotional"))
																value8="No";
															else
																value8="Yes";

														}
														
														else if(value[8].contains("config.filter.RoomType")){
															
															data=config.getProperty(value[8]);
															if(data.equalsIgnoreCase("all"))
																value8="";
														
															else
																value8=data;

														}
														
														else if(value[8].contains("config.filter.LOS")){
															
															data=config.getProperty(value[8]);
															
																value8=data;

														}
														
														else if(value[8].contains("config.filter.GuestCount")){
						
															data=config.getProperty(value[8]);
															
																value8=data;

														}
														else if(value[8].contains("config.filter.Inclusions")){
															
															data=config.getProperty(value[8]);
															
																value8=data;

														}
														else if(value[8].contains("config.filter.Channel")){
															
															data=config.getProperty(value[8]);
															
																value8=data;

														}
														else if(value[8].contains("config.filter.Compset")){
															
															data=config.getProperty(value[8]);
															
																value8=data;

														}
														
														 
													}
													else if(value[8].contains("index")){
													
														int arrayindex = SupportLib.ExtractInt(value[8]);
													    value8 = ValueCaptured.get(arrayindex);
														
														
													
														}
													
											
											
											// 8 internal ends
											*/
											
				
								 while(ValuesCaptured.size()!=count && lastRow>rowNumber )
								 {
									 
									 
									 
									 
									 
									 
									 try{
									 
									 ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
									 }catch(Exception e){
										// System.out.println("null");
										 break;
										 
									 }
									

									 
									 
									 double filterconditionLOS=0;
									 double filterconditionGuest=0;

									 if(ExcelWSheet.getRow(rowNumber).getCell(column3).getCellType()==XSSFCell.CELL_TYPE_NUMERIC){
											double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(column3).getNumericCellValue();
											filterconditionLOS= doublevalue;
										}
									 
									 if(ExcelWSheet.getRow(rowNumber).getCell(column4).getCellType()==XSSFCell.CELL_TYPE_NUMERIC){
											double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(column4).getNumericCellValue();
											filterconditionGuest= doublevalue;
										}
									
									 
									// System.out.println(ExcelWSheet.getRow(rowNumber).getCell(column3).getStringCellValue());
									 
									if(ExcelWSheet.getRow(rowNumber).getCell(column0).getStringCellValue().equalsIgnoreCase(value0)

											&& ExcelWSheet.getRow(rowNumber).getCell(column1).getStringCellValue().contains(value1)
											
											
											
											&& ExcelWSheet.getRow(rowNumber).getCell(column2).getDateCellValue().equals(value2)
											&&( 
													
											
												(ExcelWSheet.getRow(rowNumber).getCell(column3).getCellType()==XSSFCell.CELL_TYPE_STRING
												&& ExcelWSheet.getRow(rowNumber).getCell(column3).getStringCellValue().contains(value3))
											|| (
													
													ExcelWSheet.getRow(rowNumber).getCell(column3).getCellType()==XSSFCell.CELL_TYPE_NUMERIC
													
												&&	ExcelWSheet.getRow(rowNumber).getCell(column3).getNumericCellValue()==(filterconditionLOS)
											
											
											)
											
													
													
													)
													&&( 
													
											
												(ExcelWSheet.getRow(rowNumber).getCell(column4).getCellType()==XSSFCell.CELL_TYPE_STRING
												&& ExcelWSheet.getRow(rowNumber).getCell(column4).getStringCellValue().contains(value4))
											|| (
													
													ExcelWSheet.getRow(rowNumber).getCell(column4).getCellType()==XSSFCell.CELL_TYPE_NUMERIC
													
												&&	ExcelWSheet.getRow(rowNumber).getCell(column4).getNumericCellValue()==(filterconditionGuest)
											
											
											)
											
													
													
													)
													&&( 
													
											
												(ExcelWSheet.getRow(rowNumber).getCell(column5).getCellType()==XSSFCell.CELL_TYPE_STRING
												&& ExcelWSheet.getRow(rowNumber).getCell(column5).getStringCellValue().contains(value5))
											
											
													
													
													)
													
													&&( 
													
											
												(ExcelWSheet.getRow(rowNumber).getCell(column6).getCellType()==XSSFCell.CELL_TYPE_STRING
												&& ExcelWSheet.getRow(rowNumber).getCell(column6).getStringCellValue().contains(value6))
											
											
													
													
													)
													
													&&( 
													
											
												(ExcelWSheet.getRow(rowNumber).getCell(column7).getCellType()==XSSFCell.CELL_TYPE_STRING
												&& ExcelWSheet.getRow(rowNumber).getCell(column7).getStringCellValue().contains(value7))
											
													
													
													)
											
											)
											
											{
										
										System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(column0));
										System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(column1));
										System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(column2));
										System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(column3));
										
										
										
										
								//		 System.out.println("  "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber));
										XSSFCell cell= ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
										
										 // checking if its an number
										 if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
										 {
											 System.out.println("number");
											 // by default numbers are stored in double 
											double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getNumericCellValue();
										
											// convert from double to int
											int intvalue=(int) doublevalue;
											
											// now storing value in arraylist
													ExcelValuesCaptured.add(intvalue);
										 }
										 
										 else	 if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING)
										 {
											 System.out.println("string");
											 // by default numbers are stored in double 
											String Stringvalue= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getStringCellValue();
										
											// convert from double to int
											
											// now storing value in arraylist
													ExcelValuesCaptured.add(Stringvalue);
										 }
										 
										 
										 
										 count++;
									}
									
									
									 rowNumber++;
									
									 
									 
								
									
									
								 }
				
				
				
				
				
				
				
				
			break;
			
			
			
			
			
			
			
			
			/// case 8 ends
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		}
		
		
		
		
		
	
		// while(ExcelWSheet.getRow(rowNumber).getCell(columnnumber-1)!=null){
		 
		
	//	 System.out.println("========================");
		// System.out.println(ExcelValuesCaptured.size());
		//System.out.println(ExcelValuesCaptured);
		
		
		
		
		for (int i = 0; i < ValuesCaptured.size(); i++) {
			
			if(ExcelValuesCaptured.isEmpty() && ValuesCaptured.size()==1 && ValuesCaptured.get(0).equalsIgnoreCase("na") )
			{
				
				System.out.println("Value from  UI is "+ValuesCaptured.get(i)+ "  and excel value is empty so skip");

				
				
				
				skipMessage = Constant.TestCaseRow.get("TestStepID") + ": "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+ "since the value from UI is NA no value found in excel : skip case and move further";
				Log.skip(skipMessage);
				eSkipMessage = " Action Element"
						+ Constant.TestCaseRow.get("Elementlocation")
						+ "since the value from UI is NA no value found in excel : skip case and move further";
				ExtentLogs.Skip(eSkipMessage);
				skipresult=true;
				break;
				
				
				
			}else if(ExcelValuesCaptured.isEmpty()){
				System.out.println("no matching value found in excel");
				break;
			}
			
			else{
				
				System.out.println("from sheet "+ExcelValuesCaptured.get(i)+"    from ui "+ValuesCaptured.get(i));
				
			if(ValuesCaptured.get(i).equalsIgnoreCase("NA") ){
				try{
					
					
		
					 if(ExcelValuesCaptured.get(i).toString().contains("--")){
					 Result=true;
					 }
					 
					 else
							{Result=false;
							System.out.println("fail case");
							break;
							}
						 
				}
				catch(Exception e){
					Result=false;
					System.out.println("-----------------------------");
					break;
				}
				
				
			}
			else if(ValuesCaptured.get(i).equalsIgnoreCase(ExcelValuesCaptured.get(i).toString())){
				Result=true;
			}
			else{
				
				System.out.println("fail=================");
				Result=false;
				break;
			}
		}
		}
				
	if(skipresult==false){
		if (Result) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "values from excel "+ExcelValuesCaptured+" and values from ui " +ValuesCaptured+"are same";
			Log.pass(passMessage);
			ePassMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
				
					+ "    values from excel "+ExcelValuesCaptured+" and values from ui " +ValuesCaptured+"are same";
			ExtentLogs.Pass(ePassMessage);
		} else {
			failMessage = "Fail; " + Constant.TestCaseRow.get("TestStepID")
					
					+ "    values from excel  "+ExcelValuesCaptured+" and values from ui " +ValuesCaptured+" are either not same or no matching value present";
			Log.fail(failMessage);
			eFailMessage ="Fail; " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "values from excel  "+ExcelValuesCaptured+" and values from ui " +ValuesCaptured+" are either not same or no matching value present";
			ExtentLogs.Fail(eFailMessage);
		}
	}
	}
	
	
	public static void VerifyDownloadedFileFormat() throws ParseException {
		boolean Result = false;
		
		
		String fileName;

		String userDefinedFromat=Constant.TestCaseRow.get("Data");
			
			String dir="C:\\Users\\"+System.getProperty("user.name") +"\\Downloads";

			File fl = new File(dir);
	    File[] files = fl.listFiles(new FileFilter() {          
	        public boolean accept(File file) {
	            return file.isFile();
	        }
	    });
	    long lastMod = Long.MIN_VALUE;
	    File choice = null;
	    for (File file : files) {
	        if (file.lastModified() > lastMod) {
	            choice = file;
	            lastMod = file.lastModified();
	        }
	    }
	    
	    Constant.ExcelfileName=choice.toString();
	    
	    System.out.println( choice.getName());
	    fileName=choice.getName().toString();
		Path path = Paths.get(choice.toString());
		String ext = choice.getAbsolutePath();
		
		
		
		if(FilenameUtils.isExtension(choice.getName(),userDefinedFromat)){
			Result=true;
		}
		
		 if (Result) {
				passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
						+ Constant.TestCaseRow.get("TeststepDescription") + "; "
						+ "download file format is same with user defined format";
				Log.pass(passMessage);
				ePassMessage =Constant.TestCaseRow.get("TestStepID") + ": "
						+ Constant.TestCaseRow.get("TeststepDescription") + "; "
						+ "download file format is same with user defined format";

				ExtentLogs.Pass(ePassMessage);
			} else {
				SupportLib.createScreenshot();
				failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
						+ Constant.TestCaseRow.get("TeststepDescription") + "; "
						+ "download file format is not same with user defined format";

				Log.fail(failMessage);
				eFailMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
						+ Constant.TestCaseRow.get("TeststepDescription") + "; "
						+ "download file format is not same with user defined format";

				ExtentLogs.Fail(eFailMessage);
			}
		
	}


	
	
	public static void VerifyDaysCount() throws Exception {
		SupportLib.waitForAjax();
		List<String> FromPageList = new ArrayList<String>();
		String Verification, FromPage = "", ErrorValue = "";
		boolean Result = false;
		int days = 0;
		String[] date = null;
		
		int valueOne;
		int valueTwo;
		
		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		// dateformat:Attributevalue    
		if(Constant.TestCaseRow.get("ActionSupportValue").contains(":")){
			String[] FormatAttribute=Constant.TestCaseRow.get("ActionSupportValue").split(":");
			
			String AttributeValue=ActionElement.getAttribute(FormatAttribute[1]);
			
			if(AttributeValue.contains("-"))
				date	=AttributeValue.split("-");
			else if(AttributeValue.contains("to"))
				date	=AttributeValue.split("to");

			
			String sDate1=date[0];  
		    Date date1=new SimpleDateFormat(FormatAttribute[0]).parse(sDate1);  
		    String sDate2= date[1];  
		    Date date2=new SimpleDateFormat(FormatAttribute[0]).parse(sDate2);  
		 days  = (int)( (date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24));
		   
			
			
		}else{
		FromPageList = SupportLib.GetElementText(WebElementCollection);
		
		
		if (!Constant.TestCaseRow.get("ActionSupportValue").equalsIgnoreCase(
				"Blank")) {
			if(FromPageList.contains("-"))
				date	=FromPageList.get(0).split("-");
			else if(FromPageList.contains("to"))
				date	=FromPageList.get(0).split("to");

			
			String sDate1=date[0];  
		    Date date1=new SimpleDateFormat("MM/dd/yyyy").parse(sDate1);  
		    String sDate2= date[1];  
		    Date date2=new SimpleDateFormat("MM/dd/yyyy").parse(sDate2);  
		   days= (int)( (date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24));
		}
		}
		
		// if taking value from t
		   if(Constant.TestCaseRow.get("Data").contains("index")){
			   int arrayindex = SupportLib.ExtractInt(Constant.TestCaseRow
						.get("Data"));
			   String value1 = ValueCaptured.get(arrayindex);
			   valueOne=Integer.parseInt(value1);
				 valueTwo = days;
				
				if(valueOne==valueTwo){
				
					Result=true;
				}else{
					Result=false;

				}
				

			
		}
		   else{
			   
			   String value1 = Constant.TestCaseRow.get("Data");
				   valueOne=Integer.parseInt(value1);
					 valueTwo = days;
					
					if(valueOne==valueTwo){
						System.out.println("pass");
						Result=true;

					}else{
						Result=false;
					}
			   
		   }
		 
		   
		   if (Result) {
				passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
						+ Constant.TestCaseRow.get("TeststepDescription") + "; "
						+ "Passed" + "; Value: " + valueOne
						+ "; and value " + + valueTwo+"are same";
				Log.pass(passMessage);
				ePassMessage =Constant.TestCaseRow.get("TestStepID") + ": "
						+ Constant.TestCaseRow.get("TeststepDescription") + "; "
						+ "Passed" + "; Value: " + valueOne
						+ "; and value " + + valueTwo+"are same";
				ExtentLogs.Pass(ePassMessage);
			} else {
				SupportLib.createScreenshot();
				failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
						+ Constant.TestCaseRow.get("TeststepDescription") + "; "
						+ "Passed" + "; Value: " + valueOne
						+ "; and value " + + valueTwo+"are not same";
				Log.fail(failMessage);
				eFailMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
						+ Constant.TestCaseRow.get("TeststepDescription") + "; "
						+ "Passed" + "; Value: " + valueOne
						+ "; and value " + + valueTwo+"are not same";
				ExtentLogs.Fail(eFailMessage);
			}
	}
	
	
	
	
	// ///////////////////////////////////////////// rate gain functions  //////////////////////////////////////////////

	
	/**
	 * Function to verify text of web element Fields required:Action, Element
	 * Location Test data: Verification value for the text
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyTextPresent() throws Exception, Throwable {
		SupportLib.waitForAjax();
		List<String> FromPageList = new ArrayList<String>();
		String Verification, FromPage = "";
		boolean Result = false;
		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		FromPageList = SupportLib.GetElementText(WebElementCollection);
		
		
		if(FromPageList.size()!=0)
			Result = true;
				 else 
					Result = false;
					
				
			
	

		if (Result) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Text is present for the given emement element : "
					+ FromPage;

			Log.pass(passMessage);
			ePassMessage = "Verification passed for Element"
					+ Constant.TestCaseRow.get("Elementlocation") + "; Text is present for the given  element " + FromPage;
			ExtentLogs.Pass(ePassMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ "; Text is present for the given emement element : " + FromPage;

			Log.fail(failMessage);

			eFailMessage = "Verification Failed for Element"
					+ Constant.TestCaseRow.get("Elementlocation")+ "; Text is present for the given  element " + FromPage;
			ExtentLogs.Fail(eFailMessage);

		}

	}
	
	
	
	
	
	public static void MonthYearchange() throws Exception {
		SupportLib.waitForAjax();
		
		
		
		
		String[] dateMonth = null;
		int usermonth,calandermonth;
		String monthpick;
		WebElement element;
		String[] daymonth = null;
		
		FileInputStream fis = new FileInputStream(Constant.configFileLoc);
		config.load(fis);
		

	String months[]=new String[12];
	months[0] = "January";
	months[1] = "February";
	months[2] = "March";
	months[3] = "April";
	months[4] = "May";
	months[5] = "June";
	months[6] = "July";
	months[7] = "August";
	months[8] = "September";
	months[9] = "October";
	months[10] = "November";
	months[11] = "December";
		
		
		
		

	
			ActionElement = FindElement();
		
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}

		
		
		String str = ActionElement.getText();
		String[] splited = str.split(" ");
		String month = splited[0];
		String year = splited[1];

		String data=Constant.TestCaseRow.get("Data");
		if(data.contains("config")){
			 daymonth=config.getProperty(data).split(" ");
			

		}
		
		
		
		usermonth=Arrays.asList(months).indexOf(daymonth[1]);
		 calandermonth=Arrays.asList(months).indexOf(month);
		  if(usermonth==calandermonth){
			  
			  System.out.println("both the months are same");
			  
		  }
		 else if(usermonth>calandermonth){
			while(usermonth!=calandermonth){
				
				
				element=driver.findElement(By.xpath(".//*[@id='month']/a[@class='nextMonth']/i"));
				element.click();
				Thread.sleep(8000);

				
				 monthpick=ActionElement.getText();
				 
				 String[] splitedvalue =  monthpick.split(" ");
				calandermonth=Arrays.asList(months).indexOf(splitedvalue[0]);
				
			}
			
			
			
		}
		
		else if(usermonth<calandermonth){
			while(usermonth!=calandermonth){
				
				
				element=driver.findElement(By.xpath(".//*[@id='month']/a[@class='previousMonth']/i"));
				element.click();
				Thread.sleep(8000);
				
				 monthpick=ActionElement.getText();
				 
				 String[] splitedvalue =  monthpick.split(" ");
				calandermonth=Arrays.asList(months).indexOf(splitedvalue[0]);
				
			}
			
			
			
		}
		
		
		
		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Action month changed to user defind month";
		Log.pass(passMessage);
		ePassMessage = "Clicked is performed on Element: "
				+ Constant.TestCaseRow.get("Elementlocation");
		ExtentLogs.Pass(ePassMessage);

	}

	
	
/*	this function helps in verifying all the mentioned value in data column
 * 
 * suppose you find an xpath which will find 8 value of same kind then you can mention generic xpath for those 8 values 
 * and against that values in the data column.
 * 
 * Note: make sure give value by colon separated values like vinayak:bansal:puresoftware
 * 
 *  
 *  all these 3 values should be exactly same
 *  
 * 
*/	
	
	
	public static void VerifyAll() throws Exception {
		SupportLib.waitForAjax();
		String Verification;
		boolean result = false;
		List<String> fetchfrompage = new ArrayList<String>();

		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
			}
		if (Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			for (WebElement we : WebElementCollection) {
				fetchfrompage.add(we.getText());
			}
		} else if (!(Constant.TestCaseRow.get("ActionSupportValue")
				.contains("Blank"))) {

			for (WebElement we : WebElementCollection) {
				fetchfrompage.add(we.getAttribute(Constant.TestCaseRow
						.get("ActionSupportValue")));
			}
		}
		Verification = Constant.TestCaseRow.get("Data");
		System.out.println("Verification  "+Verification);
		if (Verification.contains(":")) {
			StringTokenizer st = new StringTokenizer(Verification, ":");
			List<String> VerificationList = new ArrayList<String>();
			
			System.out.println("list complete "+VerificationList);
			
			while (st.hasMoreTokens()) {
				VerificationList.add(st.nextToken());
			}
			
			
			if(VerificationList.containsAll(fetchfrompage)){
				result = true;
			}
			else{
				result = false;
			}
			
	
		} 
		
		else {
			for (String FP : fetchfrompage) {

				if (FP.contains(Verification)) {
					result = true;
				} else {
					result = false;
					break;
				}
			}
		}

		if (result == true) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; Text is found in " + fetchfrompage.size()
					+ "   WebElements" + "; Against user Defined Value: "
					+ Verification;
			Log.pass(passMessage);

			ePassMessage = "Range verification passed for "
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "All the value present on the page fall inbetween verificaiton Value:"
					+ Verification;
			ExtentLogs.Pass(ePassMessage);
		} else if (result == false) {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ ": Text is not found in one of the Webelement out of"
					+ fetchfrompage.size() + "WebElement;User Defined Value: "
					+ Verification;
			Log.fail(failMessage);

			eFailMessage = "Range verification failed for "
					+ Constant.TestCaseRow.get("Elementlocation")
					+ "Value present dose not fall inbetween verificaiton Value:"
					+ Verification;
			ExtentLogs.Fail(eFailMessage);

		}

	}
	
	

	
	public static void RateAgainstDate() throws Exception {
		SupportLib.waitForAjax();
		String[] strArr=new String[5];
		System.out.println("======================================================");

		List<WebElement>  calanderRows= driver.findElements(By.xpath("	//*[@id='monthCalendarTable']/table/tbody/tr"));
	//	System.out.println(calanderRows.size());
		
		for (int i = 1; i <= calanderRows.size(); i++) {
			String path="//*[@id='monthCalendarTable']/table/tbody/tr["+i+"]/td";
			List<WebElement>  calandercolumns= driver.findElements(By.xpath(path));

			if(i==calanderRows.size()){
				
			}
			
			//System.out.println(calandercolumns.size());
			
			
			String partialColumnPath="//*[@id='monthCalendarTable']/table/tbody/tr["+i+"]/td/div/div/span[@class='price ng-binding']";
		
			List<WebElement>  calandercolumnspartial= driver.findElements(By.xpath(partialColumnPath));

	//	System.out.println("partialColumnPath"+calandercolumnspartial.size());
			
			
			int diff=(calandercolumns.size()-calandercolumnspartial.size());
		//	System.out.println("diff   "+diff);
			
			//*[@id='monthCalendarTable']/table/tbody/tr[1]/td
			
			//*[@id='monthCalendarTable']/table/tbody/tr[1]/td[5]/div/div/span[@class='price ng-binding']
			
			if(i!=calanderRows.size()){
			for (int j = 1+diff; j <= calandercolumns.size(); j++) {
				
				String datepath="//*[@id='monthCalendarTable']/table/tbody/tr["+i+"]/td["+j+"]/div/div/span[@class='date ng-binding']";
				
				//*[@id='monthCalendarTable']/table/tbody/tr[1]/td/div[1]/div/span
				WebElement currentDate= driver.findElement(By.xpath(datepath));
				
				
				System.out.println("  date   "+currentDate.getText());

				String ratepath="//*[@id='monthCalendarTable']/table/tbody/tr["+i+"]/td["+j+"]/div/div/span[@class='price ng-binding'][text()]";
				
				WebElement currentRate= driver.findElement(By.xpath(ratepath));
				

				strArr = currentRate.getText().split("\\r?\\n");
				System.out.println("value we get     " + strArr[0]);
				RateAgainstDatehash.put(currentDate.getText(), strArr[0]);
				
				
			}
			}
			else{
				
				for (int j = 1; j <= calandercolumnspartial.size(); j++) {
					
					String datepath="//*[@id='monthCalendarTable']/table/tbody/tr["+i+"]/td["+j+"]/div/div/span[@class='date ng-binding']";
					
					//*[@id='monthCalendarTable']/table/tbody/tr[1]/td/div[1]/div/span
					WebElement currentDate= driver.findElement(By.xpath(datepath));
					System.out.println("  date   "+currentDate.getText());

					String ratepath="//*[@id='monthCalendarTable']/table/tbody/tr["+i+"]/td["+j+"]/div/div/span[@class='price ng-binding'][text()]";
					
					WebElement currentRate= driver.findElement(By.xpath(ratepath));
					strArr = currentRate.getText().split("\\r?\\n");
					System.out.println("value we get     " + strArr[0]);
					RateAgainstDatehash.put(currentDate.getText(), strArr[0]);
				
				//	System.out.println("--------------");
				}
				
			}
			
			
			
			

		}
		
		
		Iterator itr=RateAgainstDatehash.entrySet().iterator();
		
		while (itr.hasNext()) {
			
	Map.Entry count=		(Map.Entry)itr.next();
	
	//  System.out.println(count.getKey()+"--------------------"+count.getValue());
		
			Log.info(count.getKey()+"--------------------"+count.getValue());
	
		}
		
		
		passMessage = Constant.TestCaseRow.get("TestStepID") + ": "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+ ": Action rateAgainstDate";
		Log.pass(passMessage);
		ePassMessage = "rateAgainstDate is performed on Element: ";
		ExtentLogs.Pass(ePassMessage);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void VerifyCapturedValueFromExcel() throws Exception {

		/*
		 * This method should compare the excel data and the value is captured
		 * using the method
		 */
		SupportLib.waitForAjax();
		String Filelocation = Constant.TestCaseRow.get("Elementlocation");
		String Excel_value = "";
		String VarificaitonValue = "";
		String fileName = Filelocation;
		FileInputStream ExcelFile = new FileInputStream(fileName);
		XSSFWorkbook ExcelWBook = new XSSFWorkbook(ExcelFile);
		XSSFSheet ExcelWSheet = ExcelWBook.getSheet(ExcelWBook.getSheetName(0));
		int totalRows=ExcelWSheet.getLastRowNum();
		int count=1;
		
			for (Row row : ExcelWSheet) {
				for (Cell cell : row) {
					if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
						Excel_value = cell.getRichStringCellValue().getString()
								.trim();
						int size = ValueCaptured.size();
						ExcelDataList.add(Excel_value);
						
						
					}}
				
				
			}
			
		
	if(ExcelDataList.containsAll(ValueCaptured)){
			
		passMessage = Constant.TestCaseRow
				.get("TestStepID")
				+ "; "
				+ "Passed; "
				+ Constant.TestCaseRow
						.get("TeststepDescription")
				+ "; values captured  match with values in excel ";
		Log.pass(passMessage);
		ePassMessage =  "captured  values  matched with excel values";
		ExtentLogs.Pass(ePassMessage);
		}else{
			
			failMessage = "Fail; "
					+ Constant.TestCaseRow.get("TestStepID")
					+ ": "
					+ Constant.TestCaseRow
							.get("TeststepDescription")
					+ "; values captured not match with values in excel ";
			Log.fail(failMessage);
			eFailMessage = "captured  values not matched with excel values";
				
			ExtentLogs.Fail(eFailMessage);
			
		}
	
	}
	
	


	
	
	
	
	
	public static void CaptureAttributeValue() throws Exception {

		SupportLib.waitForAjax();
		List<String> FromPageAttribute = new ArrayList<String>();
		String Verification, FromPage = "";
		boolean Result = false;
		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		FromPageAttribute = SupportLib.GetElementAttribute(WebElementCollection,
				Constant.TestCaseRow.get("ActionSupportValue"));


		
		
		

		ValueCaptured.add(FromPageAttribute.get(0));
		int size = ValueCaptured.size();
		size = size - 1;
		infoMessage = ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		Log.info(infoMessage);
		eInfoMessage = ValueCaptured.get(size)
				+ "; Value has been stored in index: " + size;
		ExtentLogs.info(eInfoMessage);

		
		
	

	}
	public static void VerifyNumberOrOtherExist() throws Exception {
		//dx
		boolean result=false;
		SupportLib.waitForAjax();
		int IndexNo = 0;
		
		if(Constant.TestCaseRow.get("ActionSupportValue").contains("captured")){
			IndexNo = SupportLib.ExtractInt(Constant.TestCaseRow.get("ActionSupportValue"));
			
			
			String[] checkWith = Constant.TestCaseRow.get("Data").split(",");
			
			for (String ck : checkWith) {
				if(ck.equalsIgnoreCase("number")){
					
					try{
					int i=SupportLib.ExtractInt(ValueCaptured.get(IndexNo));
					result=true;
					break;
					}
					catch(Exception e){
						result=false;
					}
					
			
				}
				else if(ck.equalsIgnoreCase("na")){
					
					if(ValueCaptured.get(IndexNo).equalsIgnoreCase("na"))
					result=true;
					else
						result=false;

						break;
					
				}
				else{
					result=false;
				}
				
			}
			
			
			
		}
		else{
			
			WebElementCollection = FindElements();
			if (WebElementCollection == null) {
				NoSuchElementException e = new NoSuchElementException();
				throw e;
			} else {
				
				
				String[] checkWith = Constant.TestCaseRow.get("Data").split(",");
for (WebElement element : WebElementCollection) {
	
	/*for (String check : checkWith) {
		if(check.equalsIgnoreCase("number")){
			try  
			  {  
				
			    Integer d = Integer.parseDouble(element.getText());  
			  }  
			  catch(NumberFormatException nfe)  
			  {  
			    return false;  
			  }  
		}
	}*/
	
	
}				
				
			}
		}
		
		
		
		
		if (result == true) {
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; verification value is either  " +Constant.TestCaseRow.get("Data");
			Log.pass(passMessage);

			ePassMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ "; verification value is either  " +Constant.TestCaseRow.get("Data");
			ExtentLogs.Pass(ePassMessage);
		} else if (result == false) {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")+
				"; verification value is not found against  " +Constant.TestCaseRow.get("Data");
					
			Log.fail(failMessage);

			eFailMessage = "Range verification failed for "
					+ Constant.TestCaseRow.get("Elementlocation")+
					"; verification value is not found against  " +Constant.TestCaseRow.get("Data");
			ExtentLogs.Fail(eFailMessage);

		}
		
	}
	
	
	
	
	
	
	/**
	 * Function to verify Any Available text value in the web element test
	 * Fields required: Action, Element Location Test data: Should contain : as
	 * a splitter for more then one value to verify in the text
	 * 
	 * @throws Exception
	 * @throws Throwable
	 */
	public static void VerifyAnyRate() throws Exception, Throwable {
		SupportLib.waitForAjax();
		List<String> FromPageList = new ArrayList<String>();
		List<String> VerificationList = new ArrayList<String>();
		String Verification, FromPage = "";
		boolean Result = false;
		WebElementCollection = FindElements();

		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		String strArr[] = new String[5];
		 String str;
		
		if(Constant.TestCaseRow.get("ActionSupportValue").contains("line[")){
			
			String storeTmp = Constant.TestCaseRow.get("ActionSupportValue");
			str = storeTmp.replaceAll("[^0-9]+", " ");
			str = str.trim();
			
			Integer index = Integer.valueOf(str);
			//System.out.println("index is    " + index);
			
			FromPageList = SupportLib.GetParticularText(WebElementCollection,index);

			
		}
			
			
		else if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
			FromPageList = SupportLib.GetElementAttribute(WebElementCollection,
					Constant.TestCaseRow.get("ActionSupportValue"));
		} else {
			FromPageList = SupportLib.GetElementText(WebElementCollection);
		}
		Verification = Constant.TestCaseRow.get("Data");
		VerificationList = SupportLib.ProcessData(Verification);

		for (String FromPageValue : FromPageList) {
			FromPage = FromPage + FromPageValue + ", ";
			for (String VerificationValue : VerificationList) {
				FromPageValue = FromPageValue.toLowerCase();
				VerificationValue = VerificationValue.toLowerCase();
				if(FromPageValue.matches(".*\\d+.*")){
					
					int val = SupportLib.ExtractInt(FromPageValue);
					FromPageValue=val+"";
				}
			
				
				

				if(VerificationValue.equalsIgnoreCase("number") && StringUtils.isNumeric(FromPageValue)){
					Result = true;
					break;
				}
				
				
				else if (FromPageValue.contains(VerificationValue)) {
					Result = true;
					
					break;
				}
			}
			if (!Result) {
				break;
			}
		}

		if (Result) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+ ";Any Value among: " + Verification
					+ "; Are Present in Page values: " + FromPage;
			ePassMessage = "Any value among: " + Verification
					+ "; are Present in Page values: " + FromPage;
			ExtentLogs.Pass(ePassMessage);

			Log.pass(passMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ ";Any value among: " + Verification
					+ "; are Not Present in Page values: " + FromPage;

			Log.fail(failMessage);
			eFailMessage = "Any value among: " + Verification
					+ "; are Not Present in Page values: " + FromPage;
			ExtentLogs.Fail(eFailMessage);

		}
	}

	
	
	// file name common words in data and format in action support and extension in action support
	public static void VerifyFileDownloaded() throws Exception {
		
		String Filelocation = Constant.TestCaseRow.get("Elementlocation");
		String extension = Constant.TestCaseRow
				.get("ActionSupportValue");

		String fileName = Filelocation;

		
			
			String dir="C:\\Users\\"+System.getProperty("user.name") +"\\Downloads";

			File fl = new File(dir);
	    File[] files = fl.listFiles(new FileFilter() {          
	        public boolean accept(File file) {
	            return file.isFile();
	        }
	    });
	    long lastMod = Long.MIN_VALUE;
	    File choice = null;
	    for (File file : files) {
	        if (file.lastModified() > lastMod) {
	            choice = file;
	            lastMod = file.lastModified();
	        }
	    }
	    
	    Constant.ExcelfileName=choice.toString();
	    
	    System.out.println( choice.getName());
	    fileName=choice.getName().toString();
		Path path = Paths.get(choice.toString());
		String ext = choice.getAbsolutePath();
		
		
		
		if(FilenameUtils.isExtension(choice.getName(),extension)){
		
		
		System.out.println(ext);
		try {
		if(choice.toString().contains(Constant.TestCaseRow.get("Data")))
			infoMessage =  Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ " file   downloaded "+choice.toString();

			Log.info(infoMessage);
			ePassMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ " file   downloaded "+choice.toString();
			ExtentLogs.info(ePassMessage);		
			
		} catch (Exception e) {
			infoMessage = " file  not downloaded "
					+ fileName + "Becasue of " + e.toString();

			Log.info(infoMessage);
			eInfoMessage = "Specified file is not deleted at location: "
					+ fileName + "Becasue of " + e.toString();
			ExtentLogs.info(eInfoMessage);
		}
	    
		}else{
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ " file extension is not same "+choice.toString()+"  as defined "+extension;
			ExtentLogs.info(ePassMessage);		

			Log.fail(failMessage);
			eFailMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
					+ " file extension is not same "+choice.toString()+"  as defined "+extension;
			ExtentLogs.Fail(eFailMessage);
		}
	
	}
	
	
	
	
	public static void EditValuesCaptured() throws Exception, Throwable {
		SupportLib.waitForAjax();
		int IndexPosition = 0;
		String str;
		String strArr[] = new String[5];
 
		String DataValue = Constant.TestCaseRow.get("Data");

		
		if (DataValue.contains("line[")) {
			String storeTmp = DataValue;
			str = storeTmp.replaceAll("[^0-9]+", " ");
			str = str.trim();
			// System.out.println("str after deleting alphanumeric character   "+str);

			Integer index = Integer.valueOf(str);
			//System.out.println("index is    " + index);
			
			for (int i = 0; i < ValuesCaptured.size(); i++) {
				String temp = ValuesCaptured.get(i);
				strArr = temp.split("\\r?\\n");
				String value=strArr[index];
				
				ValuesCaptured.set(i, strArr[index]);
				
			}
			
			System.out.println(ValuesCaptured);

			infoMessage = "User specified value has been replaced at index";
					
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					;
			ExtentLogs.info(eInfoMessage);

		}
		
		
		else if (DataValue.contains("string[")) {
			String storeTmp = DataValue;
			str = storeTmp.replaceAll("[^0-9]+", " ");
			str = str.trim();
			//System.out.println("str after deleting character   " + str);

			Integer index = Integer.valueOf(str);
			
			
			
			for (int i = 0; i < ValuesCaptured.size(); i++) {
				String temp = ValuesCaptured.get(i);
				strArr = temp.split(" ");
				String value=strArr[index];
				
				ValuesCaptured.set(i, strArr[index]);
				
			}
			


			infoMessage = "User specified values has been replaced at index"
					+ (ValuesCaptured.size() - 1) + "New Value is: "
					+ ValuesCaptured.get(ValuesCaptured.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = "User specified values has been replaced at index"
					+ (ValuesCaptured.size() - 1) + "New Value is: "
					+ ValuesCaptured.get(ValuesCaptured.size() - 1);
			ExtentLogs.info(eInfoMessage);
		} 
		else if (DataValue.contains("number")) {
			
			
			for (int i = 0; i < ValuesCaptured.size(); i++) {
				String temp = ValuesCaptured.get(i);
				int value = SupportLib.ExtractInt(temp);
				
				ValuesCaptured.set(i, value+"");
				
			}
			
			
			
			

			infoMessage = "User specified values has been replaced at index"
					+ (ValuesCaptured.size() - 1) + "New Value is: "
					+ ValuesCaptured.get(ValuesCaptured.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					+ (ValuesCaptured.size() - 1) + "New Value is: "
					+ ValuesCaptured.get(ValuesCaptured.size() - 1);
			ExtentLogs.info(eInfoMessage);
			

		}
		
		
		
		else if (Constant.TestCaseRow.get("ActionSupportValue").contains("remove")) {
			
			
			
			String ActionSupportValue=Constant.TestCaseRow.get("ActionSupportValue");
			/*str = ActionSupportValue.replaceAll("[^0-9]+", " ");
			
			System.out.println(str);*/
			
			int count = SupportLib.ExtractInt(Constant.TestCaseRow.get("ActionSupportValue"));
					
			
			
			
			////////////////
			
			
			
			
			

			
			
			///////////
			//String temp = ValueCaptured.get(ValueCaptured.size() - 1);
			if(Constant.TestCaseRow.get("ActionSupportValue").contains("last")){
				for (int i = 0; i < ValuesCaptured.size(); i++) {
					String temp = ValuesCaptured.get(i);
					
					
					temp=temp.substring(0, temp.length()-count);
					
					ValuesCaptured.set(i, temp);
					
				}
				
				
			}
		//	temp=temp.substring(0, temp.length()-count);
			else if(Constant.TestCaseRow.get("ActionSupportValue").contains("first"))
			{
				for (int i = 0; i < ValuesCaptured.size(); i++) {
					String temp2 = ValuesCaptured.get(i);
					
					
					temp2=temp2.substring(count, temp2.length());
					
					ValuesCaptured.set(i, temp2);
					
				}
				
			}
//				temp=temp.substring(count, temp.length());


				
			//	ValueCaptured.set(ValueCaptured.size() - 1, temp);
					
					infoMessage = "User specified value has been replaced at index"
							+ (ValueCaptured.size() - 1) + "New Value is: "
							+ ValueCaptured.get(ValueCaptured.size() - 1);
					Log.info(infoMessage);
					eInfoMessage = "User specified value has been replaced at index"
							+ (ValueCaptured.size() - 1) + "New Value is: "
							+ ValueCaptured.get(ValueCaptured.size() - 1);
					ExtentLogs.info(eInfoMessage);
				} 
		
	}
	public static void EditSupportCaptured() throws Exception, Throwable {
		SupportLib.waitForAjax();
		int IndexPosition = 0;
		String str;
		String strArr[] = new String[5];
 
		String DataValue = Constant.TestCaseRow.get("Data");

		
		if (DataValue.contains("line[")) {
			String storeTmp = DataValue;
			str = storeTmp.replaceAll("[^0-9]+", " ");
			str = str.trim();
			// System.out.println("str after deleting alphanumeric character   "+str);

			Integer index = Integer.valueOf(str);
			System.out.println("index is    " + index);
			
			for (int i = 0; i < compsetRate.size(); i++) {
				String temp = compsetRate.get(i);
				strArr = temp.split("\\r?\\n");
				String value=strArr[index];
				
				compsetRate.set(i, strArr[index]);
				
			}
			
			System.out.println(compsetRate);

			infoMessage = "User specified value has been replaced at index";
					
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					;
			ExtentLogs.info(eInfoMessage);

		}
		
		
		else if (DataValue.contains("string[")) {
			String storeTmp = DataValue;
			str = storeTmp.replaceAll("[^0-9]+", " ");
			str = str.trim();
			//System.out.println("str after deleting character   " + str);

			Integer index = Integer.valueOf(str);
			
			
			
			for (int i = 0; i < compsetRate.size(); i++) {
				String temp = compsetRate.get(i);
				strArr = temp.split(" ");
				String value=strArr[index];
				
				
				compsetRate.set(i, strArr[index]);
				
			}
			


			infoMessage = "User specified values has been replaced at index"
					+ (				
							compsetRate.size() - 1) + "New Value is: "
					+ 				
					compsetRate.get(				
							compsetRate.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = "User specified values has been replaced at index"
					+ (compsetRate.size() - 1) + "New Value is: "
					+ compsetRate.get(compsetRate.size() - 1);
			ExtentLogs.info(eInfoMessage);
		} 
		else if (DataValue.contains("number")) {
			
			
			for (int i = 0; i < compsetRate.size(); i++) {
				String temp = compsetRate.get(i);
				int value = SupportLib.ExtractInt(temp);
				
				compsetRate.set(i, value+"");
				
			}
	

			infoMessage = "User specified values has been replaced at index"
					+ (compsetRate.size() - 1) + "New Value is: "
					+ compsetRate.get(compsetRate.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					+ (compsetRate.size() - 1) + "New Value is: "
					+ compsetRate.get(compsetRate.size() - 1);
			ExtentLogs.info(eInfoMessage);
			

		}
else if (DataValue.contains("int")) {
			
			List<String> NumberValues=new ArrayList<String>();
			for (int i = 0; i < compsetRate.size(); i++) {
				String temp = compsetRate.get(i);
				try{
				int value = SupportLib.ExtractInt(temp);
				
				NumberValues.add( value+"");
				
				}catch(Exception e){}
				
			}
			compsetRate.clear();
			NumberValues.removeAll(Collections.singleton("0"));

			compsetRate.addAll(NumberValues);
			
			
			

			infoMessage = "User specified values has been replaced at index"
					+ (compsetRate.size() - 1) + "New Value is: "
					+ compsetRate.get(compsetRate.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					+ (compsetRate.size() - 1) + "New Value is: "
					+ compsetRate.get(compsetRate.size() - 1);
			ExtentLogs.info(eInfoMessage);
			

		}
		
		
 if (Constant.TestCaseRow.get("ActionSupportValue").contains("remove")) {
			
	
	
	String ActionSupportValue=Constant.TestCaseRow.get("ActionSupportValue");
	/*str = ActionSupportValue.replaceAll("[^0-9]+", " ");
	
	System.out.println(str);*/
	
	int count = SupportLib.ExtractInt(Constant.TestCaseRow.get("ActionSupportValue"));
			
	
	
	for (int i = 0; i < compsetRate.size(); i++) {
		String temp = compsetRate.get(i);
		String value=temp.substring(0, temp.length()-count);
		
		
		
		compsetRate.set(i, value);
		
		
		
		
	}

	
	
	
			
}
		
	}
	
	

	/* 
	 EditValueCapture work directly if there is space between words and you have to take value 
	 from those
	
	ex:  string "Amit Kumar Singh puresoftware"
	for value of Kumar use string[1] in data column 
	
	
	----For next line----
	
	ex: Amit
		Kumar
		Singh
		puresoftware
		
			
		for value of puresoftware use line[3] in data column 


Note:  please make sure that EditValueCaptured should be called just after valueCapture
	
	*/

	public static void EditValueCaptured() throws Exception, Throwable {
		SupportLib.waitForAjax();
		int IndexPosition = 0;
		String str;
		String strArr[] = new String[5];
 
		String DataValue = Constant.TestCaseRow.get("Data");

		
		if (DataValue.contains("line[")) {
			String storeTmp = DataValue;
			str = storeTmp.replaceAll("[^0-9]+", " ");
			str = str.trim();
			// System.out.println("str after deleting alphanumeric character   "+str);

			Integer index = Integer.valueOf(str);
			System.out.println("index is    " + index);
			String temp = ValueCaptured.get(ValueCaptured.size() - 1);

			strArr = temp.split("\\r?\\n");
			String value=strArr[index];
			
			// this is used to remove 0 from dates like 07 to verify it with 7
			if(Constant.TestCaseRow.get("ActionSupportValue").equalsIgnoreCase("first") && value.startsWith("0"))
			value=value.substring(1, value.length());
			if(strArr.length==1)
				ValueCaptured.set(ValueCaptured.size() - 1, strArr[0]);
			else
			ValueCaptured.set(ValueCaptured.size() - 1, value);

			infoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			ExtentLogs.info(eInfoMessage);

		}
	
		else if (DataValue.contains("string[")) {
			String storeTmp = DataValue;
			str = storeTmp.replaceAll("[^0-9]+", " ");
			str = str.trim();
			//System.out.println("str after deleting character   " + str);

			Integer index = Integer.valueOf(str);
			String temp = ValueCaptured.get(ValueCaptured.size() - 1);

			strArr = temp.split(" ");

			ValueCaptured.set(ValueCaptured.size() - 1, strArr[index]);

			infoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			ExtentLogs.info(eInfoMessage);
		} 
		
		// this is used if we have index in data and tofrom value to be edited in actionsupport column
		else if (DataValue.contains("index")) {
			
			int arrayindex = SupportLib.ExtractInt(Constant.TestCaseRow
					.get("Data"));
			
		String valueTobeEdited=	ValueCaptured.get(arrayindex);
		valueTobeEdited=valueTobeEdited.trim();
		
		String[] ToFrom = Constant.TestCaseRow.get("ActionSupportValue").split(",");
		
		String value=valueTobeEdited.replace(ToFrom[1], ToFrom[0]);
		
		ValueCaptured.set(ValueCaptured.size() - 1, value);
			
			infoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			ExtentLogs.info(eInfoMessage);
		} 
		
		//this is used to remove starting or last characters in the captured value
else if (Constant.TestCaseRow.get("ActionSupportValue").contains("remove")) {
			
	
	
	String ActionSupportValue=Constant.TestCaseRow.get("ActionSupportValue");
	/*str = ActionSupportValue.replaceAll("[^0-9]+", " ");
	
	System.out.println(str);*/
	
	int count = SupportLib.ExtractInt(Constant.TestCaseRow.get("ActionSupportValue"));
			
	
	
	String temp = ValueCaptured.get(ValueCaptured.size() - 1);
	if(Constant.TestCaseRow.get("ActionSupportValue").contains("last"))
	temp=temp.substring(0, temp.length()-count);
	else if(Constant.TestCaseRow.get("ActionSupportValue").contains("first"))
		temp=temp.substring(count, temp.length());


		
		ValueCaptured.set(ValueCaptured.size() - 1, temp);
			
			infoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			ExtentLogs.info(eInfoMessage);
		} 
		
else if (Constant.TestCaseRow.get("ActionSupportValue").contains(
        "starting")) {

    String ActionSupportValue = Constant.TestCaseRow
            .get("ActionSupportValue");

    int count = SupportLib.ExtractInt(Constant.TestCaseRow
            .get("ActionSupportValue"));

    String temp = ValueCaptured.get(ValueCaptured.size() - 1);

    temp = temp.substring(0, count);
    ValueCaptured.set(ValueCaptured.size() - 1, temp);

    infoMessage = "User specified value has been replaced at index"
            + (ValueCaptured.size() - 1) + "New Value is: "
            + ValueCaptured.get(ValueCaptured.size() - 1);
    Log.info(infoMessage);
    eInfoMessage = "User specified value has been replaced at index"
            + (ValueCaptured.size() - 1) + "New Value is: "
            + ValueCaptured.get(ValueCaptured.size() - 1);
    ExtentLogs.info(eInfoMessage);
}
		
		
		
		
else if (DataValue.contains("number")) {
	String temp = ValueCaptured.get(ValueCaptured.size() - 1);

	int value = SupportLib.ExtractInt(temp);


	ValueCaptured.set(ValueCaptured.size() - 1, value+"");

	infoMessage = "User specified value has been replaced at index"
			+ (ValueCaptured.size() - 1) + "New Value is: "
			+ ValueCaptured.get(ValueCaptured.size() - 1);
	Log.info(infoMessage);
	eInfoMessage = "User specified value has been replaced at index"
			+ (ValueCaptured.size() - 1) + "New Value is: "
			+ ValueCaptured.get(ValueCaptured.size() - 1);
	ExtentLogs.info(eInfoMessage);
	

}
		
		
		
		else {

			String firstTwoChars = DataValue.charAt(0) + ""
					+ DataValue.charAt(1);
			IndexPosition = Integer.parseInt(firstTwoChars);

			DataValue = DataValue.replace(firstTwoChars, "");
			String newValue = Constant.TestCaseRow.get("ActionSupportValue");

			String oldValue = ValueCaptured.get(IndexPosition);

			String Leftlimit = "", RightLimit = "";

			if (!DataValue.contains("Blank")) {
				if (DataValue.contains("^")) {
					Leftlimit = DataValue.split("\\^")[0];
					RightLimit = DataValue.split("\\^")[1];
					Leftlimit = Leftlimit.replace("&lt", "");
					RightLimit = RightLimit.replace("&rt", "");
				} else if (DataValue.contains("&lt")) {
					Leftlimit = DataValue.replace("&lt", "");
				} else {
					RightLimit = DataValue.replace("&rt", "");
				}
			}

			if (Leftlimit != "") {
				Leftlimit = Leftlimit.trim();
				oldValue = oldValue.split(Leftlimit)[1];
			}
			if (RightLimit != "") {
				RightLimit = RightLimit.trim();
				oldValue = oldValue.split(RightLimit)[0];
			}

			String requiredURL = ValueCaptured.get(IndexPosition).replace(
					oldValue, newValue);
			ValueCaptured.remove(IndexPosition);
			ValueCaptured.add(IndexPosition, requiredURL);

			infoMessage = "User specified value has been replaced at index"
					+ IndexPosition + "New Value is: "
					+ ValueCaptured.get(IndexPosition);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					+ IndexPosition + "New Value is: "
					+ ValueCaptured.get(IndexPosition);
			ExtentLogs.info(eInfoMessage);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void EditValueCapturedIf() throws Exception, Throwable {
		SupportLib.waitForAjax();
		int IndexPosition = 0;
		String str;
		String strArr[] = new String[5];
 
		
		if(ValueCaptured.size()!=0 && ValueCaptureIfCheck==true){
		
		String DataValue = Constant.TestCaseRow.get("Data");

		
		if (DataValue.contains("line[")) {
			String storeTmp = DataValue;
			str = storeTmp.replaceAll("[^0-9]+", " ");
			str = str.trim();
			// System.out.println("str after deleting alphanumeric character   "+str);

			Integer index = Integer.valueOf(str);
			System.out.println("index is    " + index);
			String temp = ValueCaptured.get(ValueCaptured.size() - 1);

			strArr = temp.split("\\r?\\n");
			String value=strArr[index];
			
			// this is used to remove 0 from dates like 07 to verify it with 7
			if(Constant.TestCaseRow.get("ActionSupportValue").equalsIgnoreCase("first") && value.startsWith("0"))
			value=value.substring(1, value.length());
			if(strArr.length==1)
				ValueCaptured.set(ValueCaptured.size() - 1, strArr[0]);
			else
			ValueCaptured.set(ValueCaptured.size() - 1, value);

			infoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			ExtentLogs.info(eInfoMessage);

		}
	
		else if (DataValue.contains("string[")) {
			String storeTmp = DataValue;
			str = storeTmp.replaceAll("[^0-9]+", " ");
			str = str.trim();
			//System.out.println("str after deleting character   " + str);

			Integer index = Integer.valueOf(str);
			String temp = ValueCaptured.get(ValueCaptured.size() - 1);

			strArr = temp.split(" ");

			ValueCaptured.set(ValueCaptured.size() - 1, strArr[index]);

			infoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			ExtentLogs.info(eInfoMessage);
		} 
		
		// this is used if we have index in data and tofrom value to be edited in actionsupport column
		else if (DataValue.contains("index")) {
			
			int arrayindex = SupportLib.ExtractInt(Constant.TestCaseRow
					.get("Data"));
			
		String valueTobeEdited=	ValueCaptured.get(arrayindex);
		valueTobeEdited=valueTobeEdited.trim();
		
		String[] ToFrom = Constant.TestCaseRow.get("ActionSupportValue").split(",");
		
		String value=valueTobeEdited.replace(ToFrom[1], ToFrom[0]);
		
		ValueCaptured.set(ValueCaptured.size() - 1, value);
			
			infoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			ExtentLogs.info(eInfoMessage);
		} 
		
		//this is used to remove starting or last characters in the captured value
else if (Constant.TestCaseRow.get("ActionSupportValue").contains("remove")) {
			
	
	
	String ActionSupportValue=Constant.TestCaseRow.get("ActionSupportValue");
	/*str = ActionSupportValue.replaceAll("[^0-9]+", " ");
	
	System.out.println(str);*/
	
	int count = SupportLib.ExtractInt(Constant.TestCaseRow.get("ActionSupportValue"));
			
	
	
	String temp = ValueCaptured.get(ValueCaptured.size() - 1);
	if(Constant.TestCaseRow.get("ActionSupportValue").contains("last"))
	temp=temp.substring(0, temp.length()-count);
	else if(Constant.TestCaseRow.get("ActionSupportValue").contains("first"))
		temp=temp.substring(count, temp.length());


		
		ValueCaptured.set(ValueCaptured.size() - 1, temp);
			
			infoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					+ (ValueCaptured.size() - 1) + "New Value is: "
					+ ValueCaptured.get(ValueCaptured.size() - 1);
			ExtentLogs.info(eInfoMessage);
		} 
else if (DataValue.contains("number")) {
	String temp = ValueCaptured.get(ValueCaptured.size() - 1);

	int value = SupportLib.ExtractInt(temp);


	ValueCaptured.set(ValueCaptured.size() - 1, value+"");

	infoMessage = "User specified value has been replaced at index"
			+ (ValueCaptured.size() - 1) + "New Value is: "
			+ ValueCaptured.get(ValueCaptured.size() - 1);
	Log.info(infoMessage);
	eInfoMessage = "User specified value has been replaced at index"
			+ (ValueCaptured.size() - 1) + "New Value is: "
			+ ValueCaptured.get(ValueCaptured.size() - 1);
	ExtentLogs.info(eInfoMessage);
	

}
		
		
		
		else {

			String firstTwoChars = DataValue.charAt(0) + ""
					+ DataValue.charAt(1);
			IndexPosition = Integer.parseInt(firstTwoChars);

			DataValue = DataValue.replace(firstTwoChars, "");
			String newValue = Constant.TestCaseRow.get("ActionSupportValue");

			String oldValue = ValueCaptured.get(IndexPosition);

			String Leftlimit = "", RightLimit = "";

			if (!DataValue.contains("Blank")) {
				if (DataValue.contains("^")) {
					Leftlimit = DataValue.split("\\^")[0];
					RightLimit = DataValue.split("\\^")[1];
					Leftlimit = Leftlimit.replace("&lt", "");
					RightLimit = RightLimit.replace("&rt", "");
				} else if (DataValue.contains("&lt")) {
					Leftlimit = DataValue.replace("&lt", "");
				} else {
					RightLimit = DataValue.replace("&rt", "");
				}
			}

			if (Leftlimit != "") {
				Leftlimit = Leftlimit.trim();
				oldValue = oldValue.split(Leftlimit)[1];
			}
			if (RightLimit != "") {
				RightLimit = RightLimit.trim();
				oldValue = oldValue.split(RightLimit)[0];
			}

			String requiredURL = ValueCaptured.get(IndexPosition).replace(
					oldValue, newValue);
			ValueCaptured.remove(IndexPosition);
			ValueCaptured.add(IndexPosition, requiredURL);

			infoMessage = "User specified value has been replaced at index"
					+ IndexPosition + "New Value is: "
					+ ValueCaptured.get(IndexPosition);
			Log.info(infoMessage);
			eInfoMessage = "User specified value has been replaced at index"
					+ IndexPosition + "New Value is: "
					+ ValueCaptured.get(IndexPosition);
			ExtentLogs.info(eInfoMessage);
		}}
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void EditRateCaptured() throws Exception, Throwable {
		SupportLib.waitForAjax();
		int IndexPosition = 0;
		String str;
		String strArr[] = new String[5];
 
		String DataValue = Constant.TestCaseRow.get("Data");

		
		if (DataValue.contains("line[")) {
			String storeTmp = DataValue;
			str = storeTmp.replaceAll("[^0-9]+", " ");
			str = str.trim();
			// System.out.println("str after deleting alphanumeric character   "+str);

			Integer index = Integer.valueOf(str);
			//System.out.println("index is    " + index);
			String temp = rateCaptured.get(rateCaptured.size() - 1);

			strArr = temp.split("\\r?\\n");
			String value=strArr[index];
			
			// this is used to remove 0 from dates like 07 to verify it with 7
			if(Constant.TestCaseRow.get("ActionSupportValue").equalsIgnoreCase("first") && value.startsWith("0"))
			value=value.substring(1, value.length());
			if(strArr.length==1)
				rateCaptured.set(rateCaptured.size() - 1, strArr[0]);
			else
				rateCaptured.set(rateCaptured.size() - 1, value);

			infoMessage = Constant.TestCaseRow.get("TestStepID") +"User specified value has been replaced at index"
					+ (rateCaptured.size() - 1) + "New Value is: "
					+ rateCaptured.get(rateCaptured.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = Constant.TestCaseRow.get("TestStepID") +"  value has been replaced at index"
					+ (rateCaptured.size() - 1) + " with the new Value: "
					+ rateCaptured.get(rateCaptured.size() - 1);
			ExtentLogs.info(eInfoMessage);

		}

		else if (DataValue.contains("string[")) {
			String storeTmp = DataValue;
			str = storeTmp.replaceAll("[^0-9]+", " ");
			str = str.trim();
			//System.out.println("str after deleting character   " + str);

			Integer index = Integer.valueOf(str);
			String temp = rateCaptured.get(rateCaptured.size() - 1);

			strArr = temp.split(" ");

			rateCaptured.set(rateCaptured.size() - 1, strArr[index]);

			infoMessage =Constant.TestCaseRow.get("TestStepID") + "value has been replaced at index"
					+ (rateCaptured.size() - 1) + " with new Value: "
					+ rateCaptured.get(rateCaptured.size() - 1);
			Log.info(infoMessage);
			eInfoMessage = Constant.TestCaseRow.get("TestStepID") +"value has been replaced at index "
					+ (rateCaptured.size() - 1) + "  with new Value is: "
					+ rateCaptured.get(rateCaptured.size() - 1);
			ExtentLogs.info(eInfoMessage);
		} 
		
		// this is used if we have index in data and tofrom value to be edited in actionsupport column
		else if (DataValue.contains("index")) {
			
			int arrayindex = SupportLib.ExtractInt(Constant.TestCaseRow
					.get("Data"));
			
		String valueTobeEdited=	rateCaptured.get(arrayindex);
		valueTobeEdited=valueTobeEdited.trim();
		
		String[] ToFrom = Constant.TestCaseRow.get("ActionSupportValue").split(",");
		
		String value=valueTobeEdited.replace(ToFrom[1], ToFrom[0]);
		
		rateCaptured.set(rateCaptured.size() - 1, value);
			
			infoMessage =Constant.TestCaseRow.get("TestStepID") + "User specified value has been replaced at index"
					+ (rateCaptured.size() - 1) + "New Value is: "
					+ rateCaptured.get(rateCaptured.size() - 1);
			Log.info(infoMessage);
			eInfoMessage =Constant.TestCaseRow.get("TestStepID") + "User specified value has been replaced at index"
					+ (rateCaptured.size() - 1) + "New Value is: "
					+ rateCaptured.get(rateCaptured.size() - 1);
			ExtentLogs.info(eInfoMessage);
		} 
		
		//this is used to remove starting or last characters in the captured value
else if (Constant.TestCaseRow.get("ActionSupportValue").contains("remove")) {
			
	
	
	String ActionSupportValue=Constant.TestCaseRow.get("ActionSupportValue");
	/*str = ActionSupportValue.replaceAll("[^0-9]+", " ");
	
	System.out.println(str);*/
	
	int count = SupportLib.ExtractInt(Constant.TestCaseRow.get("ActionSupportValue"));
			
	
	
	String temp = rateCaptured.get(rateCaptured.size() - 1);
	if(Constant.TestCaseRow.get("ActionSupportValue").contains("last"))
	temp=temp.substring(0, temp.length()-count);
	else if(Constant.TestCaseRow.get("ActionSupportValue").contains("first"))
		temp=temp.substring(count, temp.length());


		
	rateCaptured.set(rateCaptured.size() - 1, temp);
			
			infoMessage = Constant.TestCaseRow.get("TestStepID") +"User specified value has been replaced at index"
					+ (rateCaptured.size() - 1) + "New Value is: "
					+ rateCaptured.get(rateCaptured.size() - 1);
			Log.info(infoMessage);
			eInfoMessage =Constant.TestCaseRow.get("TestStepID") + "User specified value has been replaced at index"
					+ (rateCaptured.size() - 1) + "New Value is: "
					+ rateCaptured.get(rateCaptured.size() - 1);
			ExtentLogs.info(eInfoMessage);
		} 
else if (DataValue.contains("number")) {
	String temp = rateCaptured.get(rateCaptured.size() - 1);

	int value = SupportLib.ExtractInt(temp);


	rateCaptured.set(rateCaptured.size() - 1, value+"");

	infoMessage = Constant.TestCaseRow.get("TestStepID") +"User specified value has been replaced at index"
			+ (rateCaptured.size() - 1) + "New Value is: "
			+ rateCaptured.get(rateCaptured.size() - 1);
	Log.info(infoMessage);
	eInfoMessage = Constant.TestCaseRow.get("TestStepID") +"User specified value has been replaced at index"
			+ (rateCaptured.size() - 1) + "New Value is: "
			+ rateCaptured.get(rateCaptured.size() - 1);
	ExtentLogs.info(eInfoMessage);
	

}
		
		
		
		else {

			String firstTwoChars = DataValue.charAt(0) + ""
					+ DataValue.charAt(1);
			IndexPosition = Integer.parseInt(firstTwoChars);

			DataValue = DataValue.replace(firstTwoChars, "");
			String newValue = Constant.TestCaseRow.get("ActionSupportValue");

			String oldValue = rateCaptured.get(IndexPosition);

			String Leftlimit = "", RightLimit = "";

			if (!DataValue.contains("Blank")) {
				if (DataValue.contains("^")) {
					Leftlimit = DataValue.split("\\^")[0];
					RightLimit = DataValue.split("\\^")[1];
					Leftlimit = Leftlimit.replace("&lt", "");
					RightLimit = RightLimit.replace("&rt", "");
				} else if (DataValue.contains("&lt")) {
					Leftlimit = DataValue.replace("&lt", "");
				} else {
					RightLimit = DataValue.replace("&rt", "");
				}
			}

			if (Leftlimit != "") {
				Leftlimit = Leftlimit.trim();
				oldValue = oldValue.split(Leftlimit)[1];
			}
			if (RightLimit != "") {
				RightLimit = RightLimit.trim();
				oldValue = oldValue.split(RightLimit)[0];
			}

			String requiredURL = rateCaptured.get(IndexPosition).replace(
					oldValue, newValue);
			rateCaptured.remove(IndexPosition);
			rateCaptured.add(IndexPosition, requiredURL);

			infoMessage = Constant.TestCaseRow.get("TestStepID") +"User specified value has been replaced at index"
					+ IndexPosition + "New Value is: "
					+ ValueCaptured.get(IndexPosition);
			Log.info(infoMessage);
			eInfoMessage =Constant.TestCaseRow.get("TestStepID") + "User specified value has been replaced at index"
					+ IndexPosition + "New Value is: "
					+ ValueCaptured.get(IndexPosition);
			ExtentLogs.info(eInfoMessage);
		}
	}

	
	
	public static void valueCapturedToValuesCapture() throws Exception, Throwable {
		
		ValuesCaptured.addAll(ValueCaptured);
	}
	
public static void rateCapturedToValuesCapture() throws Exception, Throwable {
		
		ValuesCaptured.addAll(rateCaptured);
		
		
		
		passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
				+ "Passed; "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+" Rate captured values transfered to values captured";
		

		ePassMessage =" Rate captured values transfered to values captured";
		ExtentLogs.Pass(ePassMessage);

		Log.pass(passMessage);
	}



/*
public static void VerifyCapturedWithSuppoprtCaptured() throws Exception, Throwable {
	boolean Result=false;
	for(int i = 0;i < compsetRate.size();i++)
	{
	String v1=	compsetRate.get(i);
	String v2=	ValuesCaptured.get(i);
	
	if(v1.equalsIgnoreCase(v2)){
		Result=true;
	}
	else{
		
		break;
		
	}
	
		
		}
	
	

if (Result) {

	passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
			+ "Passed; "
			+ Constant.TestCaseRow.get("TeststepDescription")
			+" captured value ["+compsetRate+"  ] and captured value ["+ValuesCaptured+"  ] are same";
	

	ePassMessage =" captured value ["+compsetRate+"  ] and captured value ["+ValuesCaptured+"  ] are same";
	ExtentLogs.pass(ePassMessage);

	Log.pass(passMessage);
} else {

	SupportLib.createScreenshot();
	failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
			+" captured value ["+compsetRate+"  ] and captured value ["+ValuesCaptured+"  ] are not same";

	Log.fail(failMessage);
	eFailMessage =" captured value ["+compsetRate+"  ] and captured value ["+ValuesCaptured+"  ] are not same";
	ExtentLogs.Fail(eFailMessage);

}



	
	
	
	
}
*/



public static void VerifyCapturedWithSuppoprtCaptured() throws Exception, Throwable {
    SupportLib.waitForAjax();
    String v1 = null;
    String v2 = null;

    

    boolean Result = false;
    for (int i = 0; i < compsetRate.size(); i++) {
    v1    = compsetRate.get(i);
        v2 = ValuesCaptured.get(i);

    
        

        if (!Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")&& Constant.TestCaseRow.get("ActionSupportValue").equalsIgnoreCase("FALSE")) {

            if (v1.contains(v2))
                Result = false;

            else{
                Result = true;
            break;
            }
        }else if (v1.equalsIgnoreCase(v2) &&Constant.TestCaseRow.get("ActionSupportValue").contains("Blank")) {
            Result = true;
        } else{
            Result = false;
            break;

        }

    }

if (Result) {

passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
        + "Passed; "
        + Constant.TestCaseRow.get("TeststepDescription")
        +" captured value ["+compsetRate+"  ] and captured value ["+ValuesCaptured+"  ] ";


ePassMessage =" captured value ["+compsetRate+"  ] and captured value ["+ValuesCaptured+"  ] ";
ExtentLogs.Pass(ePassMessage);

Log.pass(passMessage);
} else {

SupportLib.createScreenshot();
failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
        +" captured value ["+compsetRate+"  ] and captured value ["+ValuesCaptured+"  ] are not same";

Log.fail(failMessage);
eFailMessage =" captured value ["+compsetRate+"  ] and captured value ["+ValuesCaptured+"  ] are not same";
ExtentLogs.Fail(eFailMessage);

}



}

public static void formulaOnCaptured() throws Exception, Throwable {
	String type =	Constant.TestCaseRow.get("ActionSupportValue") ;

	String DataValue = Constant.TestCaseRow.get("Data");
	String storeTmp[];
	int value1=0,value2=0;
	
	int result = 0;
	if (DataValue.contains(",")) {
		storeTmp=DataValue.split(",");
		
		
		int index1=Integer.parseInt(storeTmp[0]);
		int index2=Integer.parseInt(storeTmp[1]);

		String value1Str = ValueCaptured.get(index1);
		String value2Str = ValueCaptured.get(index2);
		
		
		if(value1Str.equalsIgnoreCase("NA"))
			value1=0;
		else
			value1=Integer.parseInt(value1Str);
		
		if(value2Str.equalsIgnoreCase("NA"))
			value2=0;
		else
		 value2=Integer.parseInt(value2Str);
		
		if(type.equalsIgnoreCase("-")){
			result=	value1-value2;
			ValueCaptured.add(result+"");
		}
		
		
	}
	int size = ValueCaptured.size();
	size = size - 1;
	infoMessage =  "Passed: " + Constant.TestCaseRow.get("TestStepID")
			+ ": " + Constant.TestCaseRow.get("TeststepDescription")
			+"Type of formula is "+type+"  value1 "+value1+"  value2  "+value2+"  and calculated value  "+result;
	Log.info(infoMessage);
	eInfoMessage = "Type of formula is "+type+"  value1  "+value1+"  value2  "+value2+"  and calculated value  "+result;
	ExtentLogs.info(eInfoMessage);


}


public static void CompsetAvgRate() throws Exception, Throwable {

	double calculated=0;
	boolean Result=false;
	int percentageUI=0;
	int rateUI=0;
	
	
	
	
	ActionElement = FindElement();
	if (ActionElement == null) {
		NoSuchElementException e = new NoSuchElementException();
		throw e;
	}
	
	
	
	
Integer arr[]= new Integer[30];
	String [] percentageCompatator =  (String[]) compsetRate.toArray(new String[compsetRate.size()]);
	Integer[] numberspercent = new Integer[percentageCompatator.length];
	
	String [] gridrateStr =  (String[]) ValuesCaptured.toArray(new String[ValuesCaptured.size()]);
	Integer[] numbersGrid = new Integer[gridrateStr.length];
	for(int i = 0;i < gridrateStr.length;i++)
	{
	   // Note that this is assuming valid input
	   // If you want to check then add a try/catch 
	   // and another index for the numbers if to continue adding the others (see below)
		
		try{
			numbersGrid[i] = Integer.parseInt(gridrateStr[i]);
			numberspercent[i] = Integer.parseInt(percentageCompatator[i]);

			
			arr[i]=numbersGrid[i]*numberspercent[i];
		}
		catch(Exception e){
			
			
		}
	}

	

List<Integer> listGrid = new ArrayList<Integer>(Arrays.asList(arr));
listGrid.removeAll(Collections.singleton(null));
numbersGrid = listGrid.toArray(new Integer[listGrid.size()]);


List<Integer> listpercent = new ArrayList<Integer>(Arrays.asList(numberspercent));
listpercent.removeAll(Collections.singleton(null));
numberspercent = listpercent.toArray(new Integer[listpercent.size()]);

double sum = 0;
double sumdivision = 0;

for (int i : numbersGrid)
    sum += i;

for (int i : numberspercent)
	sumdivision += i;
	


try{
	double round=sum/sumdivision;
 rateUI= Integer.parseInt(ActionElement.getText());

 System.out.println("cal culated value  "+round);
 // it is picking up ceil value for 98.4 it is taking from page 99
 calculated=Math.round(round);
 
 System.out.println("calculated value  "+calculated);
if(calculated==rateUI)	
	Result=true;


}
catch(Exception e)
{
	
	calculated=0;
System.out.println("NA case appear ");	

}

if (Result) {

	passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
			+ "Passed; "
			+ Constant.TestCaseRow.get("TeststepDescription")
			+"rate from page  "+rateUI+" and rate calculated are same "+calculated;
	

	ePassMessage ="rate from page  "+rateUI+" and rate calculated are same "+calculated;
	ExtentLogs.Pass(ePassMessage);

	Log.pass(passMessage);
} else {

	SupportLib.createScreenshot();
	failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
			+ ": " + Constant.TestCaseRow.get("TeststepDescription")
								+"rate from page  "+ActionElement.getText()+" and rate calculated are not same "+calculated;


	Log.fail(failMessage);
	eFailMessage ="rate from page  "+ActionElement.getText()+" and rate calculated are not same "+calculated;

	ExtentLogs.Fail(eFailMessage);

}



}

public static void OthersFilter() throws Exception, Throwable {


	ActionElement = FindElement();
	if (ActionElement == null) {
		NoSuchElementException e = new NoSuchElementException();
		throw e;
	}
	
	

	
	String data=Constant.TestCaseRow.get("Data");
	if(data.contains("config")){
		
		
		if(config.getProperty(data).contains(":")){
		
			String[] filterValues=config.getProperty(data).split(":");
			
			
			if(data.contains("Channel")){
				Collections.addAll(MultipleChannels,filterValues);
			}
			
			
			for (int i = 0; i < filterValues.length; i++) {
				
				ActionElement.click();
				
				Thread.sleep(500);
				
				
				
				ActionElement.sendKeys(filterValues[i]);

				  Robot robot = new Robot();  // Robot class throws AWT Exception	
				  
				   Thread.sleep(500);	

				   
				   robot.delay(40);
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.delay(40);

					robot.keyRelease(KeyEvent.VK_ENTER);

				   
				   //robot.keyPress(KeyEvent.VK_ENTER);	
				   Thread.sleep(1000);	

			}
			
			
			
			
		}
		else{
			
			
			
			
			ActionElement.click();
			
			Thread.sleep(1000);
			
			
			
			
			ActionElement.sendKeys(config.getProperty(data));

			  Robot robot = new Robot();  // Robot class throws AWT Exception	
			  
			   Thread.sleep(2000);	

			   
			   robot.delay(40);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.delay(40);

				robot.keyRelease(KeyEvent.VK_ENTER);

			   
			   //robot.keyPress(KeyEvent.VK_ENTER);	
			   Thread.sleep(2000);	
			
			
		}

	}else
	ActionElement.sendKeys(Constant.TestCaseRow.get("Data"));
		
	  
			String  dataCol= config.getProperty(data);

	        infoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
	                + Constant.TestCaseRow.get("TeststepDescription")
	                + "; Action:  filter values";
	        Log.info(infoMessage);

	        eInfoMessage = Constant.TestCaseRow.get("TestStepID") + ": "
	                + Constant.TestCaseRow.get("TeststepDescription")+"   data:"               + dataCol;
	        ExtentLogs.info(eInfoMessage);

}


public static void VerifyChannels() throws Exception, Throwable {
	boolean Result=true;
	List<WebElement>  propelement=driver.findElements(By.xpath("(//*[@id='firstgridDiv']/div[1]/table/tbody/tr/td/div)[ position()<last()-1]"));
int propCountChannel=0;
	int propCountAll=propelement.size();
	
StringBuilder builder= new StringBuilder();
	List<WebElement> we =	driver.findElements(By.xpath("(//*[@id='content']/div[2]/div/div[1]/div/span)[position()>1]"));
	if (we == null) {
		NoSuchElementException e = new NoSuchElementException();
		throw e;
	}
	
	for (int i = 0; i < we.size(); i++) {
		
	String channel=	we.get(i).getText();
	builder.append(channel+" ");
	
		

	
	//div[div[text()='BookIt']/following-sibling::table/tbody/tr/td/div]/following-sibling::div[@class='rTable']/div//table/tbody/tr/td[1]
	
	
	
		String xpath="//*[@id='content']/div/div/div/div/span[text()='"+channel+"']";
		
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(3000);
		
		
	String 	xpathvalues="	(//div[div[text()='"+channel+"']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr/td/div/span)[position()>1 and position()<last()-1]";
				
	List<WebElement> wevalue=driver.findElements(By.xpath(xpathvalues));
		//(//div[div[text()='value1']/following-sibling::table/tbody/tr/td/div[@title='value2']]/following-sibling::div[@class='rTable']/div//table/tbody/tr[1]/td)
		
		
	
	for (WebElement weele : wevalue) {
		ValuesCaptured.add(weele.getText());
	}
	
	
	
	
String path="(//div[div[text()='"+channel+"']/following-sibling::table/tbody/tr/td/div]/following-sibling::div[@class='rTable']/div//table/tbody/tr/td[1])[ position()<last()-1]";
	List<WebElement>  Channelpropelement=driver.findElements(By.xpath(path));
	propCountChannel= Channelpropelement.size();
	
	
	if(propCountAll!=propCountChannel){
		Result=false;
		SupportLib.createScreenshot();
		failMessage = "Failed: " + "count for properties are not same";


		Log.fail(failMessage);
		eFailMessage = "Failed: " + "count for properties are not same";

		ExtentLogs.Fail(eFailMessage);
		break;
	}

	driver.findElement(By.xpath(".//*[@id='toTop']/i")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath(xpath)).click();
	}
	
	if(Result){
	passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
			+ "Passed; "
			+ Constant.TestCaseRow.get("TeststepDescription")
			+"channels count for present channals ["+builder.toString()+"  ] are same";
	ePassMessage =Constant.TestCaseRow.get("TestStepID") + "; "
			+ "Passed; "
			+ Constant.TestCaseRow.get("TeststepDescription")
				+"channels count for present channals ["+builder.toString()+"  ] are same";
	ExtentLogs.Pass(ePassMessage);

	Log.pass(passMessage);
	
	}
}


public static void CheckInDateParity() throws Exception, Throwable {
	
	 List<String> valuesList = new ArrayList<String>();

	
	String data=Constant.TestCaseRow.get("Data");
	if(data.contains("config")){
		data=	config.getProperty(data);

	}
	
	int CheckInDateCount=0;
	int RateViolation=0;
	
	boolean Result=false;

	String xpathDates="//*[@id='"+data+"']/div/div/div/table/tbody/tr[td/div/span]";
	List<WebElement> weTotalDates =	driver.findElements(By.xpath(xpathDates));
	if (weTotalDates == null) {
		NoSuchElementException e = new NoSuchElementException();
		throw e;
	}
	String xpathRows="//*[@id='"+data+"']/div/div/div/table/tbody/tr[1]/td/div/span";
	List<WebElement> weRows =	driver.findElements(By.xpath(xpathRows));
	if (weRows == null) {
		NoSuchElementException e = new NoSuchElementException();
		throw e;
	}
	

	for (int i = 1; i < weTotalDates.size(); i++) {
		
		for (int j = 1; i < weTotalDates.size(); i++) {
			
			String xpath="//*[@id='"+data+"']/div/div/div/table/tbody/tr["+j+"]/td["+i+"]/div/span";

			valuesList.add(driver.findElement(By.xpath(xpath)).getText());
			
			
		}
		boolean IsNA=true;
		String value = valuesList.get(0);
		  for (int ii = 1; i < valuesList.size(); ++ii) {
		    if (valuesList.get(ii) != value)
		    	IsNA= false;
		  }
		if(!IsNA==true){
			CheckInDateCount++;
		}
		
	}
	
	
	

}


public static void CompsetAvgSupply() throws Exception, Throwable {
	
		List<String> Total = new ArrayList<String>();
		List<String> Closed = new ArrayList<String>();

		
		boolean Result=false;
 int percentageUI=0;
		
		
		
		
		ActionElement = FindElement();
		if (ActionElement == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		
		
	List<WebElement> we =	driver.findElements(By.xpath("(//*[@id='content']/div[2]/div/div[1]/div/span)[position()>1]"));
	if (we == null) {
		NoSuchElementException e = new NoSuchElementException();
		throw e;
	}
	
	for (int i = 0; i < we.size(); i++) {
		
	String channel=	we.get(i).getText();
		
		String xpath="//*[@id='content']/div/div/div/div/span[text()='"+channel+"']";
		
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(4000);
		
		
	String 	xpathvalues="	(//div[div[text()='"+channel+"']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr/td[1]/div/span)[position()>1 and position()<last()-2]";
				
	List<WebElement> wevalue=driver.findElements(By.xpath(xpathvalues));
		//(//div[div[text()='value1']/following-sibling::table/tbody/tr/td/div[@title='value2']]/following-sibling::div[@class='rTable']/div//table/tbody/tr[1]/td)
		
		
	
	for (WebElement weele : wevalue) {
		ValuesCaptured.add(weele.getText());
	}
	

	driver.findElement(By.xpath(".//*[@id='toTop']/i")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath(xpath)).click();
	}
	
	
	
	
	//Total = ValuesCaptured.clone();
	
	Total.addAll(ValuesCaptured);
	

	Total.removeAll(Collections.singleton("NP"));
	Total.removeAll(Collections.singleton("NA"));
	
	Closed.addAll(Total);
	
	Closed.retainAll(Collections.singleton("Closed"));
	
	int s1=Closed.size();
	Closed.clear();
	Closed.addAll(Total);
	
	
	Closed.retainAll(Collections.singleton("NR"));
	int s2=Closed.size();
	
	int closednr=s1+s2;
	double size=Total.size()-closednr;
	double percentagecalulated = 0;
	
	
	
	try{
		
		double getsize=Total.size();
		System.out.println("side and total size  "+size+"     "+getsize);
		double  totalsize=size/getsize;
		System.out.println("Total size   "+totalsize);
		
		percentagecalulated=totalsize*100;
		percentagecalulated=Math.ceil(percentagecalulated);
	 percentageUI= Integer.parseInt(ActionElement.getText());
	
	 if(percentagecalulated==percentageUI)	
	Result=true;


	}catch(Exception e){
		System.out.println("NA case appear");
		
		System.out.println("From page value for compset rate  "+ActionElement.getText());
	}



if (Result) {

	passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
			+ "Passed; "
			+ Constant.TestCaseRow.get("TeststepDescription")
			+"percentage from page  "+percentageUI+" and percentage calculated are same "+percentagecalulated;
	ePassMessage ="percentage from page  "+percentageUI+" and percentage calculated are same "+percentagecalulated;
	ExtentLogs.Pass(ePassMessage);

	Log.pass(passMessage);
} else {

	SupportLib.createScreenshot();
	failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
			+ ": " + Constant.TestCaseRow.get("TeststepDescription")
								+"percentage from page  "+ActionElement.getText()+" and percentage calculated are not same "+percentagecalulated;


	Log.fail(failMessage);
	eFailMessage ="percentage from page  "+ActionElement.getText()+" and percentage calculated are not same "+percentagecalulated;

	ExtentLogs.Fail(eFailMessage);

}




}







public static void AllRatesCaptureWithFilters() throws Exception, Throwable {
	
	
	 List<String> ExcelRatesByDate = new ArrayList<String>();

	 int IndexNo=1;
	StringBuffer buffer= new StringBuffer();
	
	FileInputStream fis = new FileInputStream(Constant.configFileLoc);
	config.load(fis);
	SupportLib.waitForAjax();

	
	String property= config.getProperty("config.property");
	

	
	String data=Constant.TestCaseRow.get("Data");
	
	
		

		
		boolean Result=false;
		
		String 	xpathvalues = null;
 
		
 
	List<WebElement> we =	driver.findElements(By.xpath("(//*[@id='content']/div[2]/div/div[1]/div/span)[position()>1]"));

 
	String channel=null;
	
	if(data.equalsIgnoreCase("subscriber"))
	{
		
		AllCompset.add(property);
	}
	
	
 
 // date
 for (int j = 0; j < DateCapturedMultiple.size();j++) {
	
	int k=j+1;
	
	//compset
	for (int l = 0; l < AllCompset.size(); l++) {
		
		
	//channel 
	for (int i = 0; i < we.size(); i++) {
			
		
		
		 channel=	we.get(i).getText();
				
				String xpath="//*[@id='content']/div/div/div/div/span[text()='"+channel+"']";
				
				driver.findElement(By.xpath(xpath)).click();
				Thread.sleep(5000);
				
				 data=Constant.TestCaseRow.get("Data");
				if(!data.isEmpty()&&data.contains("compset")){
					
					 
					
					 property=AllCompset.get(l);
					 
					 
				}else{
					ValueCaptured.add(IndexNo+"");
				}
				
				
				
			
					
				
				if(data.equalsIgnoreCase("subscriber"))
					xpathvalues="	(//div[div[text()='"+channel+"']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr["+1+"]/td/div/span)["+k+"]";

				else
					xpathvalues="	(//div[div[text()='"+channel+"']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr["+ValueCaptured.get(l)+"]/td/div/span)["+k+"]";
						
			
		//	System.out.println(xpathvalues);
		//	System.out.println(xpathvalues);
			
			WebElement wevalue=driver.findElement(By.xpath(xpathvalues));
				//(//div[div[text()='value1']/following-sibling::table/tbody/tr/td/div[@title='value2']]/following-sibling::div[@class='rTable']/div//table/tbody/tr[1]/td)
				
				
			
			String storeTmp = "0";
			String str = storeTmp.replaceAll("[^0-9]+", " ");
			str = str.trim();
			// System.out.println("str after deleting alphanumeric character   "+str);

			Integer index = Integer.valueOf(str);
			//System.out.println("index is    " + index);
			String temp = wevalue.getText();

			String[] strArr = temp.split("\\r?\\n");
			String value=strArr[index];
			
			
			ValuesCaptured.add(value);
			
			
		//ValuesCaptured.add(wevalue.getText());
			
			

			driver.findElement(By.xpath(".//*[@id='toTop']/i")).click();
			Thread.sleep(2500);

			driver.findElement(By.xpath(xpath)).click();
			
		//	 System.out.println( "UI values for date "+DateCapturedMultiple.get(j)+" and   channel  "+channel+"  are "+ValuesCaptured);
		//	 buffer.append("UI values for date "+DateCapturedMultiple.get(j)+" and   channel  "+channel+"  are "+ValuesCaptured+"     ");
			 Collections.sort(MultipleChannels);
		Object ratefromExcel=	 RateFinder.Rate(
					 property,
					 DateCapturedMultiple.get(j),
					 MultipleChannels.get(i),
					 config.getProperty("config.filter.LOS"),
					 config.getProperty("config.filter.GuestCount"),
					 config.getProperty("config.filter.Qualification"),
					 config.getProperty("config.filter.Promotion"),
					 config.getProperty("config.filter.Restriction"),
					 config.getProperty("config.filter.RoomType"),
					 config.getProperty("config.filter.Inclusion"));
			 
		
		// System.out.println( "Excel values for date "+DateCapturedMultiple.get(j)+" and   channel  "+channel+"  are "+ratefromExcel.toString());
		 
		 buffer.append(  " values for property "+property+"date "+DateCapturedMultiple.get(j)+" and   channel  "+channel+"  in  excel value "+ratefromExcel.toString()+" on UI value  "+ValuesCaptured.get(0)+"   ******* ");
	// buffer.append(System.getProperty("line.separator")).append('\n');
		 if(ratefromExcel.toString().contains(ValuesCaptured.get(0))){
			 System.out.println( " values for property "+property+" date "+DateCapturedMultiple.get(j)+" and   channel  "+channel+"  in  excel value "+ratefromExcel.toString()+" on UI value  "+ValuesCaptured.get(0));

			 Result=true;
			 
		 }else{
			 
			 System.out.println("----------------------FAIL--------------------------------");
			 System.out.println( " values for property "+property+" date "+DateCapturedMultiple.get(j)+" and   channel  "+channel+"  in  excel value "+ratefromExcel.toString()+" on UI value  "+ValuesCaptured.get(0));
			 System.out.println("----------------------FAIL ENDS--------------------------------");

			 
			 Result= false;
		 }

		 ExcelRatesByDate.add(ratefromExcel.toString());
			 ValuesCaptured.clear();	
			 ExcelValuesCaptured.clear();
			 //ExcelValuesCaptured.clear();
	 }
	buffer.append("+++++++++++++++");
	
	
 }
	 ExcelRatesByDate.removeAll(Collections.singleton("NA"));
	 
	 
	if(ExcelRatesByDate.isEmpty())
		ExcelRatesByDate.add("NA");
	
	
	 Collections.sort(ExcelRatesByDate);
	 System.out.println("----------------------MIN VALUE-----------------------------");
	 System.out.println("MIN  value for date "+DateCapturedMultiple.get(j)+"    is   "+ExcelRatesByDate.get(0));
	 System.out.println("------------------------------------------------------------");

	 ExcelRatesByDate.clear();
}
 
 

 if(Result==false){
	 failMessage =  "Failed:  "
				+ " no matching Value  "+buffer;
		Log.fail(failMessage);
		eErrorMessage = " No matching Value  "+buffer;
		ExtentLogs.Fail(eErrorMessage);
	}else
	
	
	{

	passMessage = "Passed:  "+Constant.TestCaseRow.get("TestStepID") + ": "
			+ Constant.TestCaseRow.get("TeststepDescription")
			+ " Value  "+buffer;
	Log.pass(passMessage);
	ePassMessage =  " Value:    "+buffer;
	ExtentLogs.Pass(ePassMessage);

	}


}



public static void ParityVoilation() throws Exception, Throwable {
	
	
	List<WebElement> channels =	driver.findElements(By.xpath(".//*[@id='content']/div/div/div/div[@class='ChannelCapsule']/span"));
	List<WebElement> OneRowDue =	driver.findElements(By.xpath("(//div[div[text()='OTA']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr/td[1]/div/span)"));
	  Map<Integer, Integer> ByChannel = new HashMap<Integer, Integer>(); 
	  Map<Integer, Integer> Availablity = new HashMap<Integer, Integer>(); 
	  Map<String, Integer> ChannelCount = new LinkedHashMap<String, Integer>(); 

	
	String channelArray[]={"OTA","TRIPADVISOR","TRIVAGO"};

List<WebElement> weTotalOTA =	driver.findElements(By.xpath("(//div[div[text()='OTA']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr[1]/td/div/span)"));
List<WebElement> OneRowOTA =	driver.findElements(By.xpath("(//div[div[text()='OTA']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr/td[1]/div/span)"));

	boolean Result=false;
	for (int k = 0; k < channels.size(); k++) {
		
	
	
	
	List<String> Total = new ArrayList<String>();

	
	

	
	int Totalcheckindate=0;
	int RateDisparity=0;
	int Availabledisparity=0;
	int ViolatorDuetoRate=0;
	int ViolatorDuetoAvailability=0;
	

List<WebElement> weTotal =	driver.findElements(By.xpath("(//div[div[text()='"+channelArray[k]+"']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr[1]/td/div/span)"));
List<WebElement> OneRow =	driver.findElements(By.xpath("(//div[div[text()='"+channelArray[k]+"']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr/td[1]/div/span)"));

if (weTotal == null) {
	NoSuchElementException e = new NoSuchElementException();
	throw e;
}

for (int i = 0; i < weTotal.size(); i++) {
	try{
		int value=Integer.parseInt((weTotal.get(i).getText()));
		Totalcheckindate++;

	}
	catch(Exception e){
 if(weTotal.get(i).getText().equalsIgnoreCase("closed")||weTotal.get(i).getText().equalsIgnoreCase("NP"))
{
	
	Totalcheckindate++;
	}
	}


}


for (int i = 1; i <= weTotal.size(); i++) {


	String xpath="//div[div[text()='"+channelArray[k]+"']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr[1]/td["+i+"]/div/span";
	
	WebElement element=driver.findElement(By.xpath(xpath));
	
	try{
		Integer value=Integer.parseInt(element.getText());
		
		int count=2;
		while (count!=OneRow.size()) {

			
			String xpathrow="//div[div[text()='"+channelArray[k]+"']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr["+count+"]/td["+i+"]/div/span";

			WebElement elementRow=driver.findElement(By.xpath(xpathrow));
			if(elementRow.getAttribute("class").contains("high"))
			{
				RateDisparity++;
				
				
				
			break;
			}
			
			count++;
		}
		
	}catch(Exception e){}
		
		
}




for (int i1 = 1; i1 <= weTotal.size(); i1++) {
	String xpathq="//div[div[text()='"+channelArray[k]+"']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr[1]/td["+i1+"]/div/span";
	if(driver.findElement(By.xpath(xpathq)).getText().equalsIgnoreCase("closed")||driver.findElement(By.xpath(xpathq)).getText().equalsIgnoreCase("NP"))
	{
	for (int j = 1; j < OneRow.size(); j++) {

		String xpathcheck="//div[div[text()='"+channelArray[k]+"']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr["+j+"]/td["+i1+"]/div/span";

	 
	try{
		int valueq=Integer.parseInt(driver.findElement(By.xpath(xpathcheck)).getText());
		Availabledisparity++;
		break;
	}
	catch(Exception e){
		
		
	
}
	}

}
	

}

	
System.out.println("channal "+channelArray[k]+"   "+"total "+Totalcheckindate+"  rate  "+RateDisparity+"  availablity "+Availabledisparity);

compsetRate.add(Totalcheckindate+"");
compsetRate.add(RateDisparity+"");
compsetRate.add(Availabledisparity+"");



// channal 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

/////////////
for (int i = 1; i <= weTotalOTA.size(); i++) {


String xpath="//div[div[text()='OTA']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr[1]/td["+i+"]/div/span";

WebElement element=driver.findElement(By.xpath(xpath));

try{

if(driver.findElement(By.xpath(xpath)).getText().equalsIgnoreCase("closed")||driver.findElement(By.xpath(xpath)).getText().equalsIgnoreCase("NP"))
{	
int count=2;
while (count<=OneRowOTA.size()) {

	
	String xpathrow="//div[div[text()='OTA']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr["+count+"]/td["+i+"]/div/span";

	WebElement elementRow=driver.findElement(By.xpath(xpathrow));
	if(elementRow.getAttribute("class").contains("high"))
	{
		if(ByChannel.containsKey(count)){
			ByChannel.put(count, ByChannel.get(count)+1);
        } else {
        	ByChannel.put(count, 1);
        }
		
		
	
	}
	
	count++;
}
}
}catch(Exception e){}


}


//////////

for (int i = 1; i <= weTotalOTA.size(); i++) {


String xpath="//div[div[text()='OTA']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr[1]/td["+i+"]/div/span";

WebElement element=driver.findElement(By.xpath(xpath));

try{

Integer value=Integer.parseInt(element.getText());		{	
int count=2;
while (count<=OneRowOTA.size()) {

	
	String xpathrow="//div[div[text()='OTA']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr["+count+"]/td["+i+"]/div/span";

	WebElement elementRow=driver.findElement(By.xpath(xpathrow));
	if(elementRow.getAttribute("class").contains("high"))
	{
		if(Availablity.containsKey(count)){
			Availablity.put(count, Availablity.get(count)+1);
        } else {
        	Availablity.put(count, 1);
        }
		
		
	
	}
	
	count++;
}
}
}catch(Exception e){}


}


//
		
		///////////////////////////////
		
List<WebElement> WebElementsChannel=driver.findElements(By.xpath("(//*[@id='channel_OTA']/div/div[1]/table/tbody/tr/td/div)")) ;


if (WebElementsChannel == null) {
	NoSuchElementException e = new NoSuchElementException();
	throw e;
} 

	




try{
if(driver.findElement(By.xpath("//*[@id='TripAdvisor']/div/div/div/table/tbody"))!=null){

List<WebElement> weTotalTRIPADVISOR =	driver.findElements(By.xpath("(//div[div[text()='TRIPADVISOR']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr[1]/td/div/span)"));
List<WebElement> OneRowTRIPADVISOR =	driver.findElements(By.xpath("(//div[div[text()='TRIPADVISOR']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr/td[1]/div/span)"));

int RateDisparityTrip=0;
	for (int i = 1; i <= weTotalTRIPADVISOR.size(); i++) {


		String xpath="//div[div[text()='TRIPADVISOR']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr[1]/td["+i+"]/div/span";
		
		WebElement element=driver.findElement(By.xpath(xpath));
		
		try{
			Integer value=Integer.parseInt(element.getText());
			
			int count=2;
			while (count!=OneRowTRIPADVISOR.size()) {

				
				String xpathrow="//div[div[text()='TRIPADVISOR']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr["+count+"]/td["+i+"]/div/span";

				WebElement elementRow=driver.findElement(By.xpath(xpathrow));
				if(elementRow.getAttribute("class").contains("high"))
				{
					RateDisparityTrip++;
					
					
					
					
				break;
				}
				
				count++;
			}
			
		}catch(Exception e){}
			
			
	}
	
	
	
	

	valueSupportList2.add(RateDisparityTrip+"");
	
	System.out.println("RateDisparityTrip--------"+RateDisparityTrip);

}
}catch(Exception e){
	
	valueSupportList2.add(0+"");

}



try{
if(driver.findElement(By.xpath("//*[@id='Trivago']/div/div/div/table/tbody"))!=null){

List<WebElement> weTotalTRIVAGO =	driver.findElements(By.xpath("(//div[div[text()='TRIVAGO']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr[1]/td/div/span)"));
List<WebElement> OneRowTRIVAGO =	driver.findElements(By.xpath("(//div[div[text()='TRIVAGO']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr/td[1]/div/span)"));

int RateDisparityTRIVAGO=0;
	for (int i = 1; i <= weTotalTRIVAGO.size(); i++) {


		String xpath="//div[div[text()='TRIVAGO']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr[1]/td["+i+"]/div/span";
		
		WebElement element=driver.findElement(By.xpath(xpath));
		
		try{
			Integer value=Integer.parseInt(element.getText());
			
			int count=2;
			while (count!=OneRowTRIVAGO.size()) {

				
				String xpathrow="//div[div[text()='TRIVAGO']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr["+count+"]/td["+i+"]/div/span";

				WebElement elementRow=driver.findElement(By.xpath(xpathrow));
				if(elementRow.getAttribute("class").contains("high"))
				{
					RateDisparityTRIVAGO++;
					
					
					
					
				break;
				}
				
				count++;
			}
			
		}catch(Exception e){}
			
			
	}
	
	
	valueSupportList2.add(RateDisparityTRIVAGO+"");
	System.out.println("RateDisparityTRIVAGO--------"+RateDisparityTRIVAGO);
}
}catch(Exception e){
	
	valueSupportList2.add(0+"");

}




	


for (int j = 1; j < WebElementsChannel.size(); j++) {
	
	ChannelCount.put(WebElementsChannel.get(j).getText(), j+1);
	
	
	
	
	
	
}

Set entries = ChannelCount.entrySet();
Iterator iterator = entries.iterator();
String [] keys = new String[ChannelCount.size()];
Integer [] date_value = new Integer[ChannelCount.size()];
int i = 0;
while(iterator.hasNext()){

    Map.Entry mapping = (Map.Entry)iterator.next();
    keys[i] = mapping.getKey().toString(); 
    date_value[i] = ChannelCount.get(keys[i]);

    i++;
    }










for (int i1 = 0; i1 < ChannelCount.size(); i1++) {
	
	if (ByChannel.containsKey(date_value[i1])) 
		valueSupportList2.add(ByChannel.get(date_value[i1]).toString());
	else{
		valueSupportList2.add(0+"");
	}

}




for (int i1 = 0; i1 < ChannelCount.size(); i1++) {
	
	if (Availablity.containsKey(date_value[i1])) 
		valueSupportList2.add(Availablity.get(date_value[i1]).toString());
	else{
		valueSupportList2.add(0+"");
	}

}
		
Collections.sort(ValuesCaptured);
Collections.reverse(ValuesCaptured);

Collections.sort(valueSupportList2);
Collections.reverse(valueSupportList2);

//[0, 0, 0, 0, 0, 0, 1, 2, 3, 3]
//





		//////////////////////////////////////

////////////
	
	
	
	

for (int i1 = 0; i1 < compsetRate.size(); i1++) {
	
	if(ValueCaptured.get(i1).contains(compsetRate.get(i1)))
		Result=true;
	else{
		Result=false;
		
		System.out.println("fail parity ");
	break;
	}
}
	

System.out.println("status in upper table "+Result);

System.out.println("valueSupportList2"+valueSupportList2);

for (int i1 = 0; i1 < valueSupportList2.size(); i1++) {
	
	if(ValuesCaptured.get(i1).contains(valueSupportList2.get(i1)))
		Result=true;
	else{
		Result=false;
		
		System.out.println("fail parity ");
	break;
	}
}
System.out.println("status in lower table "+Result);



	
	System.out.println("result  "+Result);

if (Result) {

passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
		+ "Passed; "
		+ Constant.TestCaseRow.get("TeststepDescription")
		+"values from chart and from Grid view are same ";
ePassMessage ="values from chart and from Grid view are same ";
ExtentLogs.Pass(ePassMessage);

Log.pass(passMessage);
} else {

SupportLib.createScreenshot();
failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
		+ ": " + Constant.TestCaseRow.get("TeststepDescription")
							+"values from chart and from Grid view are not same ";


Log.fail(failMessage);
eFailMessage ="values from chart and from Grid view are not same ";

ExtentLogs.Fail(eFailMessage);

}




}









public static void MySupply() throws Exception, Throwable {
	
	List<String> Total = new ArrayList<String>();
	List<String> ClosedCount = new ArrayList<String>();

	
	boolean Result=false;

	
	
	
	
	
List<WebElement> we =	driver.findElements(By.xpath("(//*[@id='content']/div[2]/div/div[1]/div/span)[position()>1]"));
if (we == null) {
	NoSuchElementException e = new NoSuchElementException();
	throw e;
}

for (int i = 0; i < we.size(); i++) {
	
String channel=	we.get(i).getText();
	
	String xpath="//*[@id='content']/div/div/div/div/span[text()='"+channel+"']";
	
	driver.findElement(By.xpath(xpath)).click();
	Thread.sleep(4000);
	
	
String 	xpathvalues="	(//div[div[text()='"+channel+"']/following-sibling::table/tbody/tr/td]/following-sibling::div[@class='rTable']/div//table/tbody/tr/td/div/span)[1]";
			
WebElement wevalue=driver.findElement(By.xpath(xpathvalues));
	//(//div[div[text()='value1']/following-sibling::table/tbody/tr/td/div[@title='value2']]/following-sibling::div[@class='rTable']/div//table/tbody/tr[1]/td)
	
	

	ValuesCaptured.add(wevalue.getText());



driver.findElement(By.xpath(".//*[@id='toTop']/i")).click();
Thread.sleep(2000);

driver.findElement(By.xpath(xpath)).click();
}

Total.addAll(ValuesCaptured);
ClosedCount.addAll(ValuesCaptured);
ValuesCaptured.removeAll(Collections.singleton("NP"));
ValuesCaptured.removeAll(Collections.singleton("NA"));


ClosedCount.removeAll(Collections.singleton("Closed"));
ClosedCount.removeAll(Collections.singleton("NR"));



Total.removeAll(Collections.singleton("NP"));


int percentagecalulated=((ValuesCaptured.size()-ClosedCount.size())/ValuesCaptured.size())*100;



Result=true;


 ValueCaptured.add(percentagecalulated+"");
 int size=ValueCaptured.size();
size = size - 1;



if (Result) {

passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
		+ "Passed; "
		+ Constant.TestCaseRow.get("TeststepDescription")
		+" percentage calculated  "+percentagecalulated+" is stored at index  "+size;
ePassMessage =" percentage calculated  "+percentagecalulated+" is stored at index  "+size;
ExtentLogs.Pass(ePassMessage);

Log.pass(passMessage);
} else {

SupportLib.createScreenshot();
failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
		+ ": " + Constant.TestCaseRow.get("TeststepDescription")
							+"percentage calculated are not same "+percentagecalulated+" is stored at index  "+size;


Log.fail(failMessage);
eFailMessage =" percentage calculated are not same "+percentagecalulated+" is stored at index  "+size;

ExtentLogs.Fail(eFailMessage);

}




}


public static void ThresholdBreachGrid() throws Exception, Throwable {

	
	boolean Result=false;
	
	String Attribute=null;
	 List<Integer> listMax = new ArrayList<Integer>();
	 List<Integer> listMin = new ArrayList<Integer>();

		WebElementCollection = FindElements();
		if (WebElementCollection == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		} 
	
	
	
	
	
	String [] lowStr =  (String[]) compsetRate.toArray(new String[compsetRate.size()]);
	

	String [] HighStr =  (String[]) compsetRate.toArray(new String[valueSupportList2.size()]);
	
	
	String data=Constant.TestCaseRow.get("Data");
	
	int index=Integer.parseInt(data);
	String subscriberRateStr=ValueCaptured.get(index);
	
	int subscriberRate=Integer.parseInt(subscriberRateStr);
	
	String [] gridrateStr =  (String[]) ValuesCaptured.toArray(new String[ValuesCaptured.size()]);
	Integer[] numbersGrid = new Integer[gridrateStr.length];
	
	
	for (int i = 0; i < compsetRate.size(); i++) {
		
		int val=subscriberRate-Integer.parseInt(lowStr[i]);
		
		listMin.add(val);
		
		
	}
	
	for (int i = 0; i < valueSupportList2.size(); i++) {
		
		int val=subscriberRate+Integer.parseInt(HighStr[i]);
		
		listMax.add(val);
	
	}
	
	
	
	for (int i = 0; i < gridrateStr.length; i++) {
		
		try{
		int gridValue=Integer.parseInt(gridrateStr[i]);
		
		int minvalue=	listMin.get(i);
		int maxvalue=	listMax.get(i);

		
		
		if(gridValue<minvalue){
			
			 Attribute=WebElementCollection.get(i).getAttribute("class");
			 if(Attribute.equalsIgnoreCase("yellow"))
			 Result=true;
			
		}

		else if(gridValue>maxvalue){
			
			 Attribute=WebElementCollection.get(i).getAttribute("class");
			 if(Attribute.equalsIgnoreCase("Blue"))
			 Result=true;
			 else
				 Result=false;

			 
			 
		}else if(gridValue<maxvalue&&gridValue>minvalue){
			
			 Attribute=WebElementCollection.get(i).getAttribute("class");
			 if(Attribute.contains(Attribute))
			 Result=true;
			 else
				 Result=false;
		}
		
		else {
			
			System.out.println("fail case");
			 Result=false;
		}
		
		
		
		
		
		
		
		
		
	}catch(Exception e){
		
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	if (Result) {

		passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
				+ "Passed; "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+"Price Thrashold is as expected";
		ePassMessage ="Price Thrashold is as expected ";
		ExtentLogs.Pass(ePassMessage);

		Log.pass(passMessage);
	} else {

		SupportLib.createScreenshot();
		failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
				+ ": " + Constant.TestCaseRow.get("TeststepDescription")+
								"Price Thrashold is as expected";


		Log.fail(failMessage);
		eFailMessage =	"Price Thrashold is as expected";
		ExtentLogs.Fail(eFailMessage);

	}
	
	
	
	
	
	}
	




public static void CapturePriceThresholdBreach() throws Exception, Throwable {
	
try{
	WebElement blue = driver.findElement(By.xpath(".//*[@id='myScrollPane']/div/div/div/table/tbody/tr/td/div/em[@class='blue']"));
	
	bluepresent=true;

}
catch(Exception e){
	System.out.println("blue not present");

	
}
try{
	WebElement yellow = driver.findElement(By.xpath(".//*[@id='myScrollPane']/div/div/div/table/tbody/tr/td/div/em[@class='yellow']"));
	yellowpresent=true;

}
catch(Exception e){
	System.out.println("blue not present");

	
}

}


public static void VerifyPriceThresholdBreach() throws Exception, Throwable {

	String Loc = "", Type = "";
	if(Constant.TestCaseRow.get("ElementFinderType").contains("ObjectRep"))
	{
		
		String Key = Constant.TestCaseRow.get("Elementlocation");
		
		try {
			Loc = Constant.ObjrepLoc.get(Key);
			Type = Constant.ObjrepType.get(Key);
		} catch (Exception e) {
			System.out.println("fail---------------");
		}
		
		
	}
		
		

	
	if(bluepresent==true&&yellowpresent==false ){
		Loc=Loc+"[@class='blue']";

	}
	else if(bluepresent==false&&yellowpresent==true){
		Loc=Loc+"[@class='yellow']";
	}
	else if(bluepresent==true&&yellowpresent==true){
		Loc=Loc+"[@class='both']";
	}
	else
		Loc=Loc+"[not (@class='yellow') and not (@class='blue') and not (@class='both')]";
	
	
	
	ActionElement = driver.findElement(By.xpath(Loc));	
	if (ActionElement == null) {
		
		
		
		SupportLib.createScreenshot();
		failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
				+ ": " + Constant.TestCaseRow.get("TeststepDescription")
									+"  Threshold breach not match ";


		Log.fail(failMessage);
		eFailMessage ="  no highest value found on page ";

		ExtentLogs.Fail(eFailMessage);
		
		
		
		/*NoSuchElementException e = new NoSuchElementException();
		throw e;*/
	}
	else{
		
		passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
				+ "Passed; "
				+ Constant.TestCaseRow.get("TeststepDescription")
				+"Threshold breach blue/yellow check  blue is "+bluepresent+" yellow is "+yellowpresent;
		ePassMessage ="Threshold breach blue/yellow is as it defined on grid blue  is "+bluepresent+" yellow is "+yellowpresent;
		ExtentLogs.Pass(ePassMessage);

		Log.pass(passMessage);
		
	}
	
	
	
	
}
public static void HighestLowestRate() throws Exception, Throwable {
	
	// tc 76
	

//	(//*[@id='myScrollPane']/div/div/div/table/tbody/tr/td/div/span)[position()<last()-1]

			
	WebElement highLow;
	String attribute = null;
			boolean Result=false;
			
			

			
				String indexStr=	Constant.TestCaseRow.get("Data");
				Integer index = Integer.valueOf(indexStr);
				String CalanderValue=ValueCaptured.get(index);
			
			if(CalanderValue.equalsIgnoreCase("dayCol ng-scope")){
				highLow=driver.findElement(By.xpath("(//*[@id='myScrollPane']/div/div/div/table/tbody/tr/td/div/span)[1]"));
				 attribute=highLow.getAttribute("class");
				if(attribute.equalsIgnoreCase("ng-binding"))
					Result=true;
				
			}
			else if(CalanderValue.equalsIgnoreCase("dayCol ng-scope high")){
				
				highLow=driver.findElement(By.xpath("(//*[@id='myScrollPane']/div/div/div/table/tbody/tr/td/div/span)[1]"));
				 attribute=highLow.getAttribute("class");
				if(attribute.equalsIgnoreCase("ng-binding high"))
					Result=true;
			}
			else if(CalanderValue.equalsIgnoreCase("dayCol ng-scope low")){
				
				highLow=driver.findElement(By.xpath("(//*[@id='myScrollPane']/div/div/div/table/tbody/tr/td/div/span)[1]"));
				attribute=highLow.getAttribute("class");
				if(attribute.equalsIgnoreCase("ng-binding low"))
					Result=true;
					}
			
			
			
			

			if (Result) {

				passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Passed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+"highest/lowest from calander view  "+CalanderValue+"  and from grid view "+attribute;
				ePassMessage ="highest/lowest from calander view  "+CalanderValue+"  and from grid view "+attribute;
				ExtentLogs.Pass(ePassMessage);

				Log.pass(passMessage);
			} else {

				SupportLib.createScreenshot();
				failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
						+ ": " + Constant.TestCaseRow.get("TeststepDescription")
											+"highest/lowest from calander view  "+CalanderValue+"  and from grid view "+attribute+" are not same";


				Log.fail(failMessage);
				eFailMessage =	"highest/lowest from calander view  "+CalanderValue+"  and from grid view "+attribute+" are not same";

				ExtentLogs.Fail(eFailMessage);

			}
			
			
			
			
			
			
			
			
			
			
			
}

public static void getHighestValue() throws Exception, Throwable {
		

		boolean Result=false;
		

		

		
		String str;
		String[] strArr;
		
		String Verification;
		
		 int verificationvalue = 0;
		 ActionElement = FindElement();
			if (ActionElement == null) {
				
				
				
				SupportLib.createScreenshot();
				failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
						+ ": " + Constant.TestCaseRow.get("TeststepDescription")
											+"  no highest value found on page ";


				Log.fail(failMessage);
				eFailMessage ="  no highest value found on page ";

				ExtentLogs.Fail(eFailMessage);
				
				
				
				/*NoSuchElementException e = new NoSuchElementException();
				throw e;*/
			}
			
			
			
			String [] numberStrs =  (String[]) ValuesCaptured.toArray(new String[ValuesCaptured.size()]);
			Integer[] numbers = new Integer[numberStrs.length];
			for(int i = 0;i < numberStrs.length;i++)
			{
			   // Note that this is assuming valid input
			   // If you want to check then add a try/catch 
			   // and another index for the numbers if to continue adding the others (see below)
				
				try{
			   numbers[i] = Integer.parseInt(numberStrs[i]);
				}
				catch(Exception e){
					
					
				}
			}
		
			List<Integer> list = new ArrayList<Integer>(Arrays.asList(numbers));
			list.removeAll(Collections.singleton(null));
			numbers = list.toArray(new Integer[list.size()]);
			
			if(numbers.length!=0){
			int    max = numbers[0];

	        for(int i = 0; i < numbers.length; i++)

	        {

	            if(max < numbers[i])

	            {

	                max = numbers[i];

	            }

	        }
	        
	        
	    
				
				
		
			if (Constant.TestCaseRow.get("ActionSupportValue").contains("line[")) {
				
				
				String storeTmp = Constant.TestCaseRow.get("ActionSupportValue");
				str = storeTmp.replaceAll("[^0-9]+", " ");
				str = str.trim();
				
				Integer index = Integer.valueOf(str);
				
				
				
				
				

				
				
				Verification=	ActionElement.getText();
				
				strArr = Verification.split("\\r?\\n");
				Verification=strArr[index];
				 verificationvalue=Integer.parseInt(Verification);
				
				
				
				
			}
		
		if(max==verificationvalue)
			Result=true;
			
			
			
			
			if (Result) {

				passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Passed; "
						+ Constant.TestCaseRow.get("TeststepDescription")
						+"highest value defined by user is same with list "+verificationvalue+"  "+max;
				ePassMessage ="highest value defined by user is same with list "+verificationvalue+"  "+max;
				ExtentLogs.Pass(ePassMessage);

				Log.pass(passMessage);
			} else {

				SupportLib.createScreenshot();
				failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
						+ ": " + Constant.TestCaseRow.get("TeststepDescription")
											+"highest value defined by user is not same with list "+verificationvalue+"   "+max;


				Log.fail(failMessage);
				eFailMessage ="highest value defined by user is not same with list "+verificationvalue+"   "+max;

				ExtentLogs.Fail(eFailMessage);

			}
			}
			else{
				
				passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
						+ "Fail/Skip; "
						+eFailMessage
						+ Constant.TestCaseRow.get("TeststepDescription")
						+"No  Integer value found in Table , All NA case";
				ePassMessage =eFailMessage+"No  Integer value found in Table , All NA case";
				System.out.println(ePassMessage);
				
				
				
			}
			
	
	}
	

public static void getLowestValue() throws Exception, Throwable {
	
	boolean Result=false;
	

	

	
	String str;
	String[] strArr;
	
	String Verification;
	
	 int verificationvalue = 0;
	 ActionElement = FindElement();
		if (ActionElement == null) {
			
			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
										+"  no lowest value found on page ";


			Log.fail(failMessage);
			eFailMessage ="  no lowest value found on page ";

		//	ExtentLogs.Fail(eFailMessage);
			
			
			/*NoSuchElementException e = new NoSuchElementException();
			throw e;*/
		}
		
		
		
		String [] numberStrs =  (String[]) ValuesCaptured.toArray(new String[ValuesCaptured.size()]);
		Integer[] numbers = new Integer[numberStrs.length];
		for(int i = 0;i < numberStrs.length;i++)
		{
		   // Note that this is assuming valid input
		   // If you want to check then add a try/catch 
		   // and another index for the numbers if to continue adding the others (see below)
			
			try{
		   numbers[i] = Integer.parseInt(numberStrs[i]);
			}
			catch(Exception e){
				
				
			}
		}
	
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(numbers));
		list.removeAll(Collections.singleton(null));
		numbers = list.toArray(new Integer[list.size()]);
		
		if(numbers.length!=0){
		int    min = numbers[0];

        for(int i = 0; i < numbers.length; i++)

        {

            if(min > numbers[i])

            {

                min = numbers[i];

            }

        }
        
        
    
			
			
	
		if (Constant.TestCaseRow.get("ActionSupportValue").contains("line[")) {
			
			
			String storeTmp = Constant.TestCaseRow.get("ActionSupportValue");
			str = storeTmp.replaceAll("[^0-9]+", " ");
			str = str.trim();
			
			Integer index = Integer.valueOf(str);
			
			
			
			
			

			
			
			Verification=	ActionElement.getText();
			
			strArr = Verification.split("\\r?\\n");
			Verification=strArr[index];
			 verificationvalue=Integer.parseInt(Verification);
			
			
			
			
		}
	
	if(min==verificationvalue)
		Result=true;
		
		
		
		
	
		
		if (Result) {

			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Passed; "
					+ Constant.TestCaseRow.get("TeststepDescription")
					+"lowest  value defined by user is same with list "+verificationvalue+"  "+min;
			ePassMessage ="lowest  value defined by user is same with list "+verificationvalue+"  "+min;
			ExtentLogs.Pass(ePassMessage);

			Log.pass(passMessage);
		} else {

			SupportLib.createScreenshot();
			failMessage = "Failed: " + Constant.TestCaseRow.get("TestStepID")
					+ ": " + Constant.TestCaseRow.get("TeststepDescription")
										+"  lowest value defined by user is not same with list "+verificationvalue;


			Log.fail(failMessage);
			eFailMessage ="  lowest value defined by user is not same with list "+verificationvalue;

			ExtentLogs.Fail(eFailMessage);

		}
		
		}
		else{
			
			passMessage = Constant.TestCaseRow.get("TestStepID") + "; "
					+ "Fail/Skip; "
					+eFailMessage
					+ Constant.TestCaseRow.get("TeststepDescription")
					+"No  Integer value found in Table , All NA case";
			ePassMessage =eFailMessage+"No  Integer value found in Table , All NA case";
			System.out.println(ePassMessage);
			
			
			
		}
		

}


public static void SelectDateDownloadRateShop() throws Exception {
	
	SupportLib.waitForAjax();

	FileInputStream fis = new FileInputStream(Constant.configFileLoc);
	config.load(fis);
	

String months[]=new String[12];
months[0] = "January";
months[1] = "February";
months[2] = "March";
months[3] = "April";
months[4] = "May";
months[5] = "June";
months[6] = "July";
months[7] = "August";
months[8] = "September";
months[9] = "October";
months[10] = "November";
months[11] = "December";
	

	String[] dateMonth;
	int usermonth,calandermonth;
	String monthpick;
	
	
	SupportLib.waitForAjax();
	String key = "", Type = "";
	String Loc = null;
	//String Loc = Constant.TestCaseRow.get("Elementlocation");
	if(Constant.TestCaseRow.get("Data").contains("config.downloadrateshop.selectdate")){
		
		String data=config.getProperty(Constant.TestCaseRow.get("Data"));
		dateMonth=data.split(" ");
		String month=dateMonth[1];
		
		WebElement element=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[@class='ui-datepicker-month']"));
		 monthpick=element.getText();
		
		 if(month.equalsIgnoreCase(monthpick)){
			element=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
			element.click();
		}
		else {
			usermonth=Arrays.asList(months).indexOf(month);
			 calandermonth=Arrays.asList(months).indexOf(monthpick);
			if(usermonth>calandermonth){
				while(usermonth!=calandermonth){
					
					
					element=driver.findElement(By.xpath("//a/span[text()='Next']"));
					element.click();
					
					element=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[@class='ui-datepicker-month']"));
					 monthpick=element.getText();
					calandermonth=Arrays.asList(months).indexOf(monthpick);
					
				}
				
				element=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
				element.click();
				
			}
			else if(usermonth<calandermonth){
				while(usermonth!=calandermonth){
					
					
					element=driver.findElement(By.xpath("//a/span[text()='Prev']"));
					element.click();
					
					element=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[@class='ui-datepicker-month']"));
					 monthpick=element.getText();
					calandermonth=Arrays.asList(months).indexOf(monthpick);
					
				}
				
				element=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
				element.click();
				
			}
			
			
	}
	}
	else if(Constant.TestCaseRow.get("Data").contains("config.downloadrateshop.enddate")){
		
		String data=config.getProperty(Constant.TestCaseRow.get("Data"));
		dateMonth=data.split(" ");
		String month=dateMonth[1];
		
		WebElement element=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[@class='ui-datepicker-month']"));
		 monthpick=element.getText();
		
		if(month.equalsIgnoreCase(monthpick)){
			element=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
			element.click();
		}
		else {
			usermonth=Arrays.asList(months).indexOf(month);
			 calandermonth=Arrays.asList(months).indexOf(monthpick);
			if(usermonth>calandermonth){
				while(usermonth!=calandermonth){
					
					
					element=driver.findElement(By.xpath("//a/span[text()='Next']"));
					element.click();
					
					element=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[@class='ui-datepicker-month']"));
					 monthpick=element.getText();
					calandermonth=Arrays.asList(months).indexOf(monthpick);
					
				}
				
				element=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
				element.click();
				
			}
			else if(usermonth<calandermonth){
				while(usermonth!=calandermonth){
					
					
					element=driver.findElement(By.xpath("//a/span[text()='Prev']"));
					element.click();
					
					element=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[@class='ui-datepicker-month']"));
					 monthpick=element.getText();
					calandermonth=Arrays.asList(months).indexOf(monthpick);
					
				}
				
				element=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
				element.click();
				
			}
			
			
	}
	}
	
}

/*

public static void SelectDateGrid() throws Exception {
    

    FileInputStream fis = new FileInputStream(Constant.configFileLoc);
    config.load(fis);


String months[]=new String[12];
months[0] = "January";
months[1] = "February";
months[2] = "March";
months[3] = "April";
months[4] = "May";
months[5] = "June";
months[6] = "July";
months[7] = "August";
months[8] = "September";
months[9] = "October";
months[10] = "November";
months[11] = "December";
    

    String[] dateMonth;
    int usermonth,calandermonth;
    String monthpick;
    
    
    SupportLib.waitForAjax();
    String key = "", Type = "";
    String Loc = null;
    //String Loc = Constant.TestCaseRow.get("Elementlocation");
if(Constant.TestCaseRow.get("Data").contains("config.")){
        
        String data=config.getProperty(Constant.TestCaseRow.get("Data"));
        dateMonth=data.split(" ");
        String month=dateMonth[1];
        
        WebElement element=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-month'])[1]"));
         monthpick=element.getText();
        
         if(month.equalsIgnoreCase(monthpick)){
            element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div[1]/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
            element.click();
        }
        else {
            usermonth=Arrays.asList(months).indexOf(month);
             calandermonth=Arrays.asList(months).indexOf(monthpick);
            if(usermonth>calandermonth){
                while(usermonth!=calandermonth){
                    
                    
                    element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div/div/a/span[text()='Next']"));
                    element.click();
                    
                    element=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-month'])[1]"));
                     monthpick=element.getText();
                    calandermonth=Arrays.asList(months).indexOf(monthpick);
                    
                }
                
                element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div[1]/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
                element.click();
                
            }
            else if(usermonth<calandermonth){
                while(usermonth!=calandermonth){
                    
                    
                    element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div/div/a/span[text()='Prev']"));
                    element.click();
                    
                    element=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-month'])[1]"));
                     monthpick=element.getText();
                    calandermonth=Arrays.asList(months).indexOf(monthpick);
                    
                }
                
                element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div[1]/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
                element.click();
                
            }
            
            
    }
    }
    else if(Constant.TestCaseRow.get("Data").contains("config")){
        
        String data=config.getProperty(Constant.TestCaseRow.get("Data"));
        dateMonth=data.split(" ");
        String month=dateMonth[1];
        
        WebElement element=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-month'])[1]"));
         monthpick=element.getText();
        
        if(month.equalsIgnoreCase(monthpick)){
            element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div[1]/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
            element.click();
        }
        else {
            usermonth=Arrays.asList(months).indexOf(month);
             calandermonth=Arrays.asList(months).indexOf(monthpick);
            if(usermonth>calandermonth){
                while(usermonth!=calandermonth){
                    
                    
                    element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div/div/a/span[text()='Next']"));
                    element.click();
                    
                    element=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-month'])[1]"));                     monthpick=element.getText();
                    calandermonth=Arrays.asList(months).indexOf(monthpick);
                    
                }
                
                element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div[1]/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
                element.click();
                
            }
            else if(usermonth<calandermonth){
                while(usermonth!=calandermonth){
                    
                    
                    element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div/div/a/span[text()='Prev']"));
                    element.click();
                    
                     element=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-month'])[1]"));
                     monthpick=element.getText();
                    calandermonth=Arrays.asList(months).indexOf(monthpick);
                    
                }
                
                element=driver.findElement(By.xpath(".//*[contains(@id,rangeSel_')]/div/div[1]/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
                element.click();
                
            }
            
            
    }
    }

String dateSelected=config.getProperty(Constant.TestCaseRow.get("Data"));
infoMessage =  Constant.TestCaseRow.get("TestStepID")
+ ": " + Constant.TestCaseRow.get("TeststepDescription")+"Date selected: " + dateSelected;
Log.info(infoMessage);
eInfoMessage =Constant.TestCaseRow.get("TestStepID")
+ ": " + Constant.TestCaseRow.get("TeststepDescription")+ "Date selected: " + dateSelected;
ExtentLogs.info(eInfoMessage);
    
    }

*/

//

public static void SelectDateGrid() throws Exception {
	SupportLib.waitForAjax();

    JavascriptExecutor executor = (JavascriptExecutor) driver;

    FileInputStream fis = new FileInputStream(Constant.configFileLoc);
    config.load(fis);
    SupportLib.waitForAjax();

    String Years[]=new String[12];
    Years[0] = "2016";
    Years[1] = "2017";
    Years[2] = "2018";
    Years[3] = "2019";

String months[]=new String[12];
months[0] = "January";
months[1] = "February";
months[2] = "March";
months[3] = "April";
months[4] = "May";
months[5] = "June";
months[6] = "July";
months[7] = "August";
months[8] = "September";
months[9] = "October";
months[10] = "November";
months[11] = "December";
    

    String[] dateMonth;
    int usermonth,calandermonth;
    int useryear,calanderyear = 0;

    String monthpick,yearpick;
    
    
    SupportLib.waitForAjax();
    String key = "", Type = "";
    String Loc = null;
    //String Loc = Constant.TestCaseRow.get("Elementlocation");
if(Constant.TestCaseRow.get("Data").contains("config.")){
        
        String data=config.getProperty(Constant.TestCaseRow.get("Data"));
        dateMonth=data.split(" ");
        
        String year=dateMonth[2];
        WebElement elementyear=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-year'])[1]"));
        yearpick=elementyear.getText();
        
       
     
         
         //year case
         if(year.equalsIgnoreCase(yearpick)){
            
        }
         // year case
         else {
             useryear=Arrays.asList(Years).indexOf(year);
              calandermonth=Arrays.asList(Years).indexOf(yearpick);
             if(useryear>calanderyear){
                 while(useryear!=calanderyear){
                     
                     
                     elementyear=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div/div/a/span[text()='Next']"));
                
                        executor.executeScript("arguments[0].click();", elementyear);

                    // elementyear.click();
                     
                     elementyear=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-year'])[1]"));
                     yearpick=elementyear.getText();
                     calanderyear=Arrays.asList(Years).indexOf(yearpick);
                     
                 }
             
             }
             else if(useryear<calanderyear){
                 while(useryear!=calanderyear){
                     
                     
                     elementyear=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div/div/a/span[text()='Prev']"));
                    // elementyear.click();
                     executor.executeScript("arguments[0].click();", elementyear);

                     elementyear=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-month'])[1]"));
                     yearpick=elementyear.getText();
                     calandermonth=Arrays.asList(Years).indexOf(yearpick);
                     
                 }
                 
         
             }
             
             
     }
         
         
         String month=dateMonth[1];
         
         WebElement element=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-month'])[1]"));
          monthpick=element.getText();
        
         if(month.equalsIgnoreCase(monthpick)){
            element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div[1]/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
           // element.click();
             executor.executeScript("arguments[0].click();", element);

        }
        else {
            usermonth=Arrays.asList(months).indexOf(month);
             calandermonth=Arrays.asList(months).indexOf(monthpick);
            if(usermonth>calandermonth){
                while(usermonth!=calandermonth){
                    
                    
                    element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div/div/a/span[text()='Next']"));
                  //  element.click();
                     executor.executeScript("arguments[0].click();", element);

                    element=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-month'])[1]"));
                     monthpick=element.getText();
                    calandermonth=Arrays.asList(months).indexOf(monthpick);
                    
                }
                
                element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div[1]/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
             //   element.click();
                 executor.executeScript("arguments[0].click();", element);

            }
            else if(usermonth<calandermonth){
                while(usermonth!=calandermonth){
                    
                    
                    element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div/div/a/span[text()='Prev']"));
                //    element.click();
                     executor.executeScript("arguments[0].click();", element);

                    element=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-month'])[1]"));
                     monthpick=element.getText();
                    calandermonth=Arrays.asList(months).indexOf(monthpick);
                    
                }
                
                element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div[1]/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
             //   element.click();
                 executor.executeScript("arguments[0].click();", element);

            }
            
            
    }
    }
    else if(Constant.TestCaseRow.get("Data").contains("config")){
        
        String data=config.getProperty(Constant.TestCaseRow.get("Data"));
        dateMonth=data.split(" ");
        String month=dateMonth[1];
        
        WebElement element=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-month'])[1]"));
         monthpick=element.getText();
        
        if(month.equalsIgnoreCase(monthpick)){
            element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div[1]/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
          //  element.click();
            
             executor.executeScript("arguments[0].click();", element);

        }
        else {
            usermonth=Arrays.asList(months).indexOf(month);
             calandermonth=Arrays.asList(months).indexOf(monthpick);
            if(usermonth>calandermonth){
                while(usermonth!=calandermonth){
                    
                    
                    element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div/div/a/span[text()='Next']"));
                    element.click();
                    
                    element=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-month'])[1]"));                     monthpick=element.getText();
                    calandermonth=Arrays.asList(months).indexOf(monthpick);
                    
                }
                
                element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div[1]/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
                //element.click();
                 executor.executeScript("arguments[0].click();", element);

            }
            else if(usermonth<calandermonth){
                while(usermonth!=calandermonth){
                    
                    
                    element=driver.findElement(By.xpath(".//*[contains(@id,'rangeSel_')]/div/div/div/a/span[text()='Prev']"));
                   // element.click();
                     executor.executeScript("arguments[0].click();", element);

                     element=driver.findElement(By.xpath("(//*[contains(@id,'rangeSel_')]//div/div/span[@class='ui-datepicker-month'])[1]"));
                     monthpick=element.getText();
                    calandermonth=Arrays.asList(months).indexOf(monthpick);
                    
                }
                
                element=driver.findElement(By.xpath(".//*[contains(@id,rangeSel_')]/div/div[1]/table/tbody/tr/td/a[text()='"+dateMonth[0]+"']"));
             //   element.click();
                 executor.executeScript("arguments[0].click();", element);

            }
            
            
    }
    }

String dateSelected=config.getProperty(Constant.TestCaseRow.get("Data"));
infoMessage =  Constant.TestCaseRow.get("TestStepID")
+ ": " + Constant.TestCaseRow.get("TeststepDescription")+"Date selected: " + dateSelected;
Log.info(infoMessage);
eInfoMessage = "Date selected: " + dateSelected;
ExtentLogs.info(eInfoMessage);
    
    }


//








public static void getTDIndex() throws Exception {
	
	SupportLib.waitForAjax();
	
	int counter=0;
	String splitedcompset[];
	WebElementCollection = FindElements();
	if (WebElementCollection == null) {
		NoSuchElementException e = new NoSuchElementException();
		throw e;
	} 
	String verification=null,data=null;
	data=Constant.TestCaseRow.get("Data");
	String ActionValue=Constant.TestCaseRow.get("ActionSupportValue");
	if(data.contains("config")){
		verification=config.getProperty(data);
		
		if(verification.contains(":")){
			
			splitedcompset	=	verification.split(":");
			AllCompset.addAll(Arrays.asList(splitedcompset));
		
			for (int i = 0; i < AllCompset.size(); i++) {
				if(AllCompset.get(i).toCharArray().length>26)
					AllCompset.set(i, AllCompset.get(i).substring(0, AllCompset.get(i).toCharArray().length-18));

					else
						AllCompset.set(i, AllCompset.get(i).substring(0, AllCompset.get(i).toCharArray().length-7));
			}
			
			
		
			
			
		}else{
			
			
			
			if(verification.toCharArray().length>26)
				verification=verification.substring(0, verification.length()-18);

				else
				verification=verification.substring(0, verification.length()-7);
			
			
			AllCompset.add(verification);
		}
		
		
		
		

	}else{
		verification=data;
	}
	
	
	
	
	Set<String> hs = new HashSet<String>();
	hs.addAll(AllCompset);
	AllCompset.clear();
	AllCompset.addAll(hs);

	System.out.println("size of AllCompset   "+AllCompset.size());
	System.out.println(AllCompset);
	
	for (int i = 0; i < AllCompset.size(); i++) {
		
	
	
	for (int j = 1; j <= WebElementCollection.size(); j++) {
		
		
		String xpath=Constant.TestCaseRow.get("Elementlocation");
		xpath="("+xpath+")["+j+"]";
		WebElement element=driver.findElement(By.xpath(xpath));
		
		 if(!ActionValue.contains("Blank") && ActionValue.contains("text") && element.getText().contains(AllCompset.get(i))){
		        System.out.println(j);
		           
		           ValueCaptured.add(j+"");
		       }
		
		
		 else if (ActionValue.contains("Blank") && element.getAttribute("title").contains(AllCompset.get(i))) {
	        System.out.println(j);
	        
	        ValueCaptured.add(j+"");
	       
	    }
	}
	        
	}  
	
	Set<String> hss = new LinkedHashSet<String>();
	hss.addAll(ValueCaptured);
	ValueCaptured.clear();
	ValueCaptured.addAll(hss);

	System.out.println("size of ValueCaptured   "+ValueCaptured.size());
	System.out.println(ValueCaptured);
	
	
	        int size = ValueCaptured.size();
	        
	        if(size==0){
	        	infoMessage = "Fail:  No property found  Make sure the property you are selecting is present in the list";
				Log.fail(infoMessage);
				eInfoMessage  = "Fail:  No property found  Make sure the property you are selecting is present in the list";

				ExtentLogs.Fail(eInfoMessage);
				NoSuchElementException e = new NoSuchElementException();
				throw e;
	        	
	        }else{
	        
			size = size - 1;
			infoMessage = ValueCaptured.get(size)
					+ "; Value has been stored in index: " + size;
			Log.info(infoMessage);
			eInfoMessage = ValueCaptured.get(size)
					+ "; Value has been stored in index: " + size;
			ExtentLogs.info(eInfoMessage);
	        
	        } 
	    }
	
	
	
	
	
	



	// ///////////////////////////////////////////// rate gain specific functions  end //////////////////////////////////////////////

	
	//////////////////////////// Api functions /////////////////////////////////////
	
	

	
	
	
	public static void BaseUri() throws IOException, InvocationTargetException,
			NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InterruptedException {
		// System.out.println("__________________ergrre_____________");

		RestAssured.baseURI = Constant.ObjrepLoc.get(Constant.TestCaseRow
				.get("Elementlocation"));

		passMessage = "base uri to be open is "
				+ Constant.ObjrepLoc.get(Constant.TestCaseRow
						.get("Elementlocation"));

		Log.pass(passMessage);
		ExtentLogs.Pass(passMessage);

	}

	/*
	 * public static void ajaxWaitandJquery() throws InterruptedException {
	 * 
	 * JavascriptExecutor executor = (JavascriptExecutor) ActionClass.driver; if
	 * ((Boolean) executor .executeScript("return window.jQuery != undefined"))
	 * { while (!(Boolean) executor .executeScript("return jQuery.active == 0"))
	 * { Thread.sleep(1000); } } return;
	 * 
	 * }
	 */
	public static void GetRequest() throws IOException,
			InvocationTargetException, NoSuchMethodException,
			SecurityException, IllegalAccessException,
			IllegalArgumentException, InterruptedException {
		if (Constant.TestCaseRow.get("Parameter") != null
				&& !Constant.TestCaseRow.get("Parameter").equals("")) {
			parameters = Constant.TestCaseRow.get("Parameter").split(",");
			totalParameters = parameters.length;
			key = new String[totalParameters];
			value = new String[totalParameters];

			for (int i = 0; i < totalParameters; i++) {

				keyValue = parameters[i].split("=");

				key[i] = keyValue[0];
				value[i] = keyValue[1];

			}
		}
		if (totalParameters != null && totalParameters != 0) {
			switch (totalParameters) {
			case 1:
				// Statements
				res = given()

						.param(key[0], value[0])
						.when()
						.get(Constant.ObjrepLoc.get(Constant.TestCaseRow
								.get("Elementlocation")));
				responseBody = res.getBody().asString();

				break;

			case 2:
				// Statements
				res = given()

						.param(key[0], value[0])
						.param(key[1], value[1])

						.when()
						.get(Constant.ObjrepLoc.get(Constant.TestCaseRow
								.get("Elementlocation")));

				responseBody = res.getBody().asString();

				break;

			case 3:
				// Statements
				res = given()

						.param(key[0], value[0])
						.param(key[1], value[1])
						.param(key[2], value[2])
						.when()
						.get(Constant.ObjrepLoc.get(Constant.TestCaseRow
								.get("Elementlocation")));
				responseBody = res.getBody().asString();

				break;

			case 4:
				// Statements
				res = given()

						.param(key[0], value[0])
						.param(key[1], value[1])
						.param(key[2], value[2])
						.param(key[3], value[3])

						.when()
						.get(Constant.ObjrepLoc.get(Constant.TestCaseRow
								.get("Elementlocation")));
				responseBody = res.getBody().asString();

				break;

			default:
				res = given()

				.when().get(
						Constant.ObjrepLoc.get(Constant.TestCaseRow
								.get("Elementlocation")));
				responseBody = res.getBody().asString();
			}
		} else {
			res = given().when().get();
			responseBody = res.getBody().asString();
		}
		msg = "get request having parameter is added  "+""+Constant.TestCaseRow.get("Parameter")+"   added with base uri";
				

		Log.pass(msg);
		ExtentLogs.Pass(msg);
	}

	public static void PostRequest() throws IOException {
		// System.out.println("we are in post request");
		// String str="{\"name\":\"vinayak bansal\"}";

		String body = Constant.TestCaseRow.get("Parameter");
		body = body.replaceAll("\"", "\\\"");
		System.out.println("post request body is  " + body);
		// RequestSpecification re=
		res = given().auth().none().contentType("application/json").
		// body("{\"name\":\"vinayak bansal\"}")
				body("{\"name\":\"Ajay bansal\"}")

				.

				when().post("http://127.0.0.1:5984/restassured");
		// .post("http://ip.jsontest.com/ ");
		// http://ip.jsontest.com/
		// res= re.post();
		// System.out.println( res.getHeaders());
		// System.out.println(res.getHeader("Location"));
		responseBody = res.getBody().asString();
		// System.out.println(responseBody);
		msg = "post request  created at url " + res.getHeader("Location");

		Log.pass(msg);
		ExtentLogs.Pass(msg);

		/*
		 * URL url = new URL(RestAssured.baseURI ); HttpURLConnection conn =
		 * (HttpURLConnection) url.openConnection(); conn.setDoOutput(true);
		 * conn.setRequestMethod("POST");
		 * conn.setRequestProperty("Content-Type", "application/json");
		 * 
		 * String input = "{\"name\":\"vinayak bansal\"}";
		 * 
		 * OutputStream os = conn.getOutputStream(); os.write(input.getBytes());
		 * os.flush(); System.out.println("end--------"); String output;
		 * System.out.println("Output from Server .... \n");
		 * System.out.println(conn.getHeaderField("Location")); BufferedReader
		 * br = new BufferedReader(new InputStreamReader(
		 * (conn.getInputStream()))); while ((output = br.readLine()) != null) {
		 * System.out.println(output);
		 * 
		 * }
		 * 
		 * RequestSpecification
		 * re=given().auth().none().contentType(conn.getHeaderField("Location"))
		 * . body("{\"name\":\"Jimi Hendrix\"}") .
		 * 
		 * when() .proxy(RestAssured.baseURI);
		 * 
		 * res= re.post(); responseBody = res.getBody().asString();
		 * 
		 * res=(Response) conn; System.out.println("we are here"); msg =
		 * "post request  created at url " + conn.getHeaderField("Location");
		 * 
		 * ConsoleLogs.INFOPass(msg); ExtentHTML.pass(msg);
		 */
	}

	public static void statusCode() {

		int requiredStatusCode = Integer.parseInt(Constant.TestCaseRow
				.get("Data"));
		if (res.statusCode() == requiredStatusCode) {

			msg = "verify :  status code form API is " + res.statusCode()
					+ "  is verified against "
					+ Constant.TestCaseRow.get("Data") + " and are same ";

			Log.pass(passMessage);
			ExtentLogs.Pass(passMessage);
		}
		if (res.statusCode() != requiredStatusCode) {

			msg = "verify :  status code form API " + res.statusCode()
					+ "  and required status code "
					+ Constant.TestCaseRow.get("Data") + " are not same";

			Log.fail(msg);
			ExtentLogs.Fail(msg);

		}

	}

	public static void JsonToJavaObject() {
		try {
			jsonobj = new JSONObject(responseBody);
			msg = "convert json object to java object";

			Log.pass(msg);
			ExtentLogs.Pass(msg);
		} catch (Exception e) {
			msg = e.getMessage();

			Log.fail(msg);
			ExtentLogs.Fail(msg);

		}

	}

	//

	public static void GetJSONArray() throws JSONException {
		String strd = Constant.TestCaseRow.get("Data");
		jsonAttribute = strd.split("/");

		if (responseBody.startsWith("[")) {
			jsonArray = new JSONArray(responseBody);
			// System.out.println(jsonArray);

			// String capital = jsonArray.getJSONObject(0).getString("capital");

			// Asserting that capital of Norway is Oslo
			// Assert.assertEquals(capital, "Oslo");

			msg = "converted to array";

		} else {

			jsonobj = new JSONObject(responseBody);
			msg = "convert json object to java object";
			System.out.println(msg);

			if (jsonAttribute.length > 1) {
				jsonarr = jsonobj.getJSONArray(jsonAttribute[0]);

				for (int i = 0; i < jsonarr.length(); i++) {
					// System.out.println(jsonarr.length());
					JSONObject jsonobj2 = jsonarr.getJSONObject(i);
					String str = jsonobj2.getString(jsonAttribute[1]);
					// System.out.println("formatted_address" + str);
					String strint = str.toString();
					listValues.add(strint.toString());
				}
			} else {

				JSONObject obj = new JSONObject(responseBody);
				Iterator itr = obj.keys();
				while (itr.hasNext()) {
					// Get key somehow? itr.getKey() ???

					// contains the sub items

					String key = (String) itr.next();
					String str = obj.getString(key);
					listValues.add(str);

				}

			}
			msg = "";
			for (int i = 0; i < jsonAttribute.length; i++) {
				msg += " " + jsonAttribute[i];
			}
			msg = "Atribute value  " + msg + " are digged";

		}

		Log.pass(msg);
		ExtentLogs.Pass(msg);
	}

	@SuppressWarnings("rawtypes")
	public static void NullValues() throws JSONException {
		JSONObject obj = new JSONObject(responseBody);
		Iterator itr = obj.keys();
		while (itr.hasNext()) {
			// Get key somehow? itr.getKey() ???

			// contains the sub items

			String key = (String) itr.next();
			String str = obj.getString(key);
			if (str == "null") {
				nullCount.add(key);
				nullvalueCount++;
			}
		}
		msg = nullvalueCount + " attributes having null values";

		Log.pass(passMessage);
		ExtentLogs.Pass(passMessage);
	}

	// AttributeName

	public static void VerifyAttributeApi() throws JSONException {
		attribute = Constant.TestCaseRow.get("Data");
		flag = false;

		if (responseBody.startsWith("[")) {

			if (jsonArray.getJSONObject(0).getString(attribute) != null) {
				flag = true;
				msg = "Attribute  " + attribute + "   found in the list";
				Log.pass(passMessage);
				ExtentLogs.Pass(passMessage);
				flag = true;
			}

		} else {

			jsonobj = new JSONObject(responseBody);

			Iterator itr = jsonobj.keys();
			while (itr.hasNext()) {
				// Get key somehow? itr.getKey() ???

				// contains the sub items

				// System.out.println("key "+itr.next());
				listAttributes.add((String) itr.next());
			}
			for (int i = 0; i < listAttributes.size(); i++) {
				// System.out.println("value " + i + " " + listValues.get(i));
				if (listAttributes.get(i).equalsIgnoreCase(attribute)) {
					msg = "Attribute  " + attribute + "   found in the list";

					Log.pass(passMessage);
					ExtentLogs.Pass(passMessage);
					flag = true;
				}
			}
		}
		if (flag == false) {

			msg = "value " + attribute + "  not  found in the list";

			Log.fail(passMessage);
			ExtentLogs.Fail(passMessage);

		}

	}

	public static void VerifyValueApi() throws InterruptedException, JSONException {
		attributeValue = Constant.TestCaseRow.get("Data");
		attributeValue = attributeValue.trim();
		flag = false;
		// System.out.println("list valus are");

		if (responseBody.startsWith("[")) {

			String pageAttributevalue = jsonArray.getJSONObject(0).getString(
					attribute);
			if (attributeValue.equalsIgnoreCase(pageAttributevalue)) {
				flag = true;
				msg = "value " + attributeValue + "   found in the list";

				Log.pass(passMessage);
				ExtentLogs.Pass(passMessage);
			}
		}

		else {

			for (int i = 0; i < listValues.size(); i++) {

				// System.out.println("value " + i + " " + listValues.get(i));
				if (listValues.get(i).equalsIgnoreCase(attributeValue)) {
					msg = "value " + attributeValue + "   found in the list";

					Log.pass(passMessage);
					ExtentLogs.Pass(passMessage);

					flag = true;
				}
			}
		}
		if (flag == false) {

			msg = "value " + attributeValue + "  not  found in the list";

			Log.fail(passMessage);
			ExtentLogs.Fail(passMessage);

		}

	}
	
	
	public static void close() throws InterruptedException {

		totalParameters = 0;
		listValues.clear();
		listAttributes.clear();
		nullCount.clear();

		// writing everything to document
		msg = "closing test case ";
		
		
		
		
		
		
		
		
		
		
		TestCaseRunner.emailBody.append(" <tr>");
		TestCaseRunner.emailBody.append("<td>"
				+ Constant.TestSuit.get("Testcaseid") + "</td>");
		TestCaseRunner.emailBody.append("<td>"
				+ ExtentLogs.extent.getRunStatus().toString().toUpperCase() + "</td>");
		TestCaseRunner.emailBody.append("<td>"
				+browser + "</td>");
				//Constant.TestSuit.get("Browser") + "</td>");
		TestCaseRunner.emailBody.append("<td>"
				+ Constant.TestSuit.get("Category") + "</td>");
		
		
		TestCaseRunner.emailBody.append("</tr>");
		
		
		
		
		/*
		 * String msg = "Student Name : ${name} \n Student ID : ${id} ";
		 * TemplateMatcher matcher = new TemplateMatcher("${", "}");
		 */
/*
		BuildObjrep.emailBody.append(" <tr>");
		BuildObjrep.emailBody.append("<td>"
				+ BuildObjrep.TestSuitHashmap.get("Testcaseid") + "</td>");
		BuildObjrep.emailBody.append("<td>"
				+ ExtentHTML.testrep.getRunStatus().toString() + "</td>");
		BuildObjrep.emailBody.append("<td>"
				+ BuildObjrep.TestSuitHashmap.get("Environment") + "</td>");
		BuildObjrep.emailBody.append("</tr>");

		ConsoleLogs.INFOPass(msg);
		ExtentHTML.pass(msg);*/
		/*
		 * System.out.println("test case status is " +
		 * ExtentHTML.testrep.getRunStatus().toString());
		 * System.out.println("test case enviroment is " +
		 * BuildObjrep.TestSuitHashmap.get("Environment"));
		 * 
		 * System.out.println("test case name is " +
		 * BuildObjrep.TestSuitHashmap.get("Testcaseid"));
		 */

	}

	


}