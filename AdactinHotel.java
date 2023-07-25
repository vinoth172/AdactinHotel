package episode14;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AdactinHotel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Vinothkumar172");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("30N5F8");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		WebElement name = driver.findElement(By.name("location"));
		Select select = new Select(name);
		select.selectByIndex(6);
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select select1 = new Select(hotel);
		select1.selectByIndex(2);
		WebElement room = driver.findElement(By.id("room_type"));
		Select select2 = new Select(room);
		select2.selectByIndex(4);
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(roomno);
		select3.selectByIndex(1);
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		WebElement con = driver.findElement(By.id("continue"));
		con.click();
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("vinoth");
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("M");
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("xasdfghjkl");
		WebElement cc = driver.findElement(By.name("cc_num"));
		cc.sendKeys("1234567812345678");
		WebElement cctype = driver.findElement(By.name("cc_type"));
		Select select4 = new Select(cctype);
		select4.selectByIndex(2);
		WebElement expmonth = driver.findElement(By.name("cc_exp_month"));
		Select select5 = new Select (expmonth);
		select5.selectByIndex(2);
		WebElement expyear = driver.findElement(By.name("cc_exp_year"));
		Select select6 = new Select (expyear);
		select6.selectByIndex(2);
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("123");
		WebElement book = driver.findElement(By.name("book_now"));
		book.click();
		Thread.sleep(8000);
		WebElement order = driver.findElement(By.name("order_no"));
		String ordertxt = order.getAttribute("value");
		System.out.println(ordertxt);
		}

		}
		

