package Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) throws InterruptedException, IOException, ParseException {
	
	WebDriver driver = null;
	
	
//	WebDriver driver= new FirefoxDriver();
	
	
	
	
	
	
	
	
	 Date date1=new SimpleDateFormat("MM/dd/yyyy").parse("09/13/2017");  
	   
	System.out.println("date "+date1);
	
	
	
	
	String Filelocation = "C:\\Users\\vinayak.bansal\\Downloads\\Optima_16506_20170808_103157(1).xlsm";
	System.out.println(Filelocation);
	FileInputStream ExcelFile = new FileInputStream(Filelocation);
	XSSFWorkbook ExcelWBook = new XSSFWorkbook(ExcelFile);
	XSSFSheet ExcelWSheet = ExcelWBook.getSheet("Detail Data");
	
	 
	System.setProperty("webdriver.chrome.driver", "D:\\Vinayak\\workspace\\asdasd\\Driver\\chromedriver.exe");
	 
	// Initialize browser
	driver=new ChromeDriver();
	System.out.println("start---------------------");
	driver.get("https://optima-demo.rategain.com/optima/login");
//	driver.manage().window().maximize();
	Thread.sleep(10000);
	
	WebElement username=driver.findElement(By.xpath("html/body/pgh-layout/ui-view/form/div/div/input[@type='email']"));
	username.sendKeys("Pooja.tapan@rategain.com");
	WebElement password=driver.findElement(By.xpath("html/body/pgh-layout/ui-view/form/div/div/input[@type='Password']"));
	password.sendKeys("pgh@1234");
	
	WebElement login= driver.findElement(By.xpath(".//*[@id='btnLogin']"));
	login.click();
	
	Thread.sleep(15000);
	
	WebElement monthyear= driver.findElement(By.xpath(".//*[@id='monthYear']"));
	String str=monthyear.getText();
	String[] splited = str.split(" ");
	String month=splited[0];
	String year= splited[1];
	System.out.println(month+"---------"+year);
	
	
	
	System.out.println(monthyear.getText());
	/*
	Thread.sleep(5000);


	WebElement shopdate= driver.findElement(By.xpath("//ul/c/li/div[contains(text(),'Price Threshold Breach')]/em"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", shopdate);
	Thread.sleep(10000);

	
	System.out.println("shopdate");
	WebElement trends= driver.findElement(By.xpath("//div[@class='leftPane dsk ng-scope']//div/a[contains(@href,'trends')]"));
	
	
	 js.executeScript("arguments[0].click();", trends);
	Thread.sleep(10000);*/
}
}
