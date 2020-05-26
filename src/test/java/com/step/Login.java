package com.step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Login {
	public static WebDriver driver;
	@Given("Have to open adacin page")
	public void have_to_open_adacin_page() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dell\\eclipse-workspace\\Abi\\TestNG\\FirstProCucu\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/index.php");
	}
	
	@When("Enter {string}")
	public void enter(String string1) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(string1);
	}
	@When("Give {string}")
	public void give(String string) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
	}

	@When("click login")
	public void click_login() {
		 driver.findElement(By.xpath("//input[@id='login']")).click();
	}
	@When("Give all details in search page {string},{string},{string},{string},{string},{string},{string},{string}")
	public void give_all_details_in_search_page(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
	   Thread.sleep(20);
		WebElement loc = driver.findElement(By.xpath("//select[@id='location']"));
	    WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
	    WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
	    WebElement noofRooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
	    driver.findElement(By.id("datepick_in")).sendKeys(string5);
	    driver.findElement(By.id("datepick_out")).sendKeys(string6);
	    WebElement aRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
	    WebElement cRoom = driver.findElement(By.xpath("//select[@id='child_room']"));
	    Select s = new Select(loc);
	    s.selectByVisibleText(string);
	    Select s1 = new Select(hotels);
	    s1.selectByVisibleText(string2);
	    Select s2 = new Select(room);
	    s2.selectByVisibleText(string3);
	    Select s3 = new Select(noofRooms);
	    s3.selectByVisibleText(string4);
	    Select s6 = new Select(aRoom);
	    s6.selectByVisibleText(string7);
	    Select s7 = new Select(cRoom);
	    s7.selectByVisibleText(string8);
	   
	}
	@When("click submit")
	public void click_submit() {
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
	}
	
	@When("Give details in booking {string},{string},{string},{string},{string},{string},{string},{string}")
	public void give_details_in_booking(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		driver.findElement(By.id("first_name")).sendKeys(string);
		driver.findElement(By.id("last_name")).sendKeys(string2);
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(string3);
		driver.findElement(By.id("cc_num")).sendKeys(string4);
		WebElement ccType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s3 = new Select(ccType);
	    s3.selectByVisibleText(string5);
	    Select s6 = new Select(month);
	    s6.selectByVisibleText(string6);
	    Select s7 = new Select(year);
	    s7.selectByVisibleText(string7);
		driver.findElement(By.id("cc_cvv")).sendKeys(string8);
		
	}

	@Then("click search")
	public void click_search() throws InterruptedException {
	    driver.findElement(By.id("book_now")).click();
	    Thread.sleep(5000);
	    WebElement text = driver.findElement(By.xpath("//input[@name='order_no']"));
	    String s = text.getAttribute("value");
	    System.out.println("Attribute value:" +s);
	    driver.close();
	    
	}


}
	


