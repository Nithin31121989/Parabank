package Maven1.M1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ProjectParabank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\NITHIN RAJ\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		Thread.sleep(1000);
		
		WebElement register = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a"));
		register.click();
	    Thread.sleep(1000);
	    WebElement firstname = driver.findElement(By.id("customer.firstName"));
	    firstname.sendKeys("Nithin");
	    Thread.sleep(1000);
	    WebElement lastname = driver.findElement(By.id("customer.lastName"));
	    lastname.sendKeys("R");
	    Thread.sleep(1000);
	    WebElement address = driver.findElement(By.id("customer.address.street"));
	    address.sendKeys("Rohini Vadackal P O");
	    Thread.sleep(1000);
	    WebElement city = driver.findElement(By.id("customer.address.city"));
	    city.sendKeys("Alappuzha");
	    Thread.sleep(1000);
	    WebElement state = driver.findElement(By.id("customer.address.state"));
	    state.sendKeys("Kerala");
	    Thread.sleep(1000);
	    WebElement zip = driver.findElement(By.id("customer.address.zipCode"));
	    zip.sendKeys("688003");
	    Thread.sleep(1000);
	    WebElement phone = driver.findElement(By.id("customer.phoneNumber"));
	    phone.sendKeys("8089233626");
	    Thread.sleep(1000);
	    WebElement ssn = driver.findElement(By.id("customer.ssn"));
	    ssn.sendKeys("123456789");
	    Thread.sleep(1000);
	    WebElement username = driver.findElement(By.id("customer.username"));
	    username.sendKeys("nithinraj199");
	    Thread.sleep(1000);
	    WebElement password = driver.findElement(By.id("customer.password"));
	    password.sendKeys("Nithin89@");
	    Thread.sleep(1000);
	    WebElement confirmpassword = driver.findElement(By.id("repeatedPassword"));
	    confirmpassword.sendKeys("Nithin89@");
	    Thread.sleep(1000);
	    WebElement registerbutton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input"));
	    registerbutton.click();
	    Thread.sleep(2000);
	    WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[8]/a"));
	    logout.click();
	    Thread.sleep(2000);
	    WebElement username1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input"));
	    username1.sendKeys("nithinraj89");
	    Thread.sleep(1000);
	    WebElement password1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input"));
	    password1.sendKeys("nithin89@");
	    Thread.sleep(1000);
	    WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input"));
	    login.click();
	    Thread.sleep(2000);
	    
	    //WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Welcome John Smith')]"));

        // Change text using JavaScript
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].innerText = 'Welcome Nithin R Rajan';", element);
        //Thread.sleep(1000);
        

   
        //String updatedText = element.getText();
        //System.out.println("Updated Text: " + updatedText);
        //Thread.sleep(1000);
        
	   
	    WebElement newaccount = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a"));
	    newaccount.click();
	    
	    Thread.sleep(1000);
	    WebElement accounttype = driver.findElement(By.id("type"));
	    accounttype.sendKeys("Savings");
	    Thread.sleep(1000);
	    
	    WebElement accountDropdown = driver.findElement(By.id("fromAccountId")); 
	    Select select = new Select(accountDropdown);
	    select.selectByIndex(0);
	    System.out.println("Selected Account: " + select.getFirstSelectedOption().getText());
	    
	   
	    Thread.sleep(1000);
	    WebElement newaccountbutton = driver.findElement(By.xpath("//*[@id=\"openAccountForm\"]/form/div/input"));
	    newaccountbutton.click();
	    Thread.sleep(2000);
	    
	    WebElement transfer = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a"));
	    transfer.click();
	    Thread.sleep(1000);
	    WebElement amount = driver.findElement(By.id("amount"));
	    amount.sendKeys("5000");
	    Thread.sleep(1000);
	    
	    WebElement fromDropdown = driver.findElement(By.id("fromAccountId"));
        Select fromSelect = new Select(fromDropdown);

       
        WebElement toDropdown = driver.findElement(By.id("toAccountId"));
        Select toSelect = new Select(toDropdown);

        
        int totalOptions = fromSelect.getOptions().size();

        if (totalOptions > 1) {
            
            fromSelect.selectByIndex(0);

            
            toSelect.selectByIndex(totalOptions - 1);
        } else {
            System.out.println("Not enough accounts to transfer funds!");
        }
        Thread.sleep(1000);
        
        WebElement transferbutton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/div[2]/input"));
        transferbutton.click();
        Thread.sleep(2000);
        
        
	  
     
	    WebElement logout1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[8]/a"));
	    logout1.click();
	    Thread.sleep(2000);
	    
	    driver.quit();
	    
	    
	 
	    
	
}
}
