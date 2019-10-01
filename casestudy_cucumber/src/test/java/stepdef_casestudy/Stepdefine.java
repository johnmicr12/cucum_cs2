package stepdef_casestudy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browers.Drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefine {

public static WebDriver driver;
@Given("Sign Up")
public void sign_Up() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
       driver=Drivers.getDriver1("chrome");
   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
   driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
}

@Given("Enter Username as {string}")
public void enter_Username_as(String username) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 WebDriverWait wait=new WebDriverWait(driver, 20);
 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userName")));
 driver.findElement(By.id("userName")).sendKeys(username);
}

@Given("Enter Firstname as {string}")
public void enter_Firstname_as(String firstname) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 driver.findElement(By.id("firstName")).sendKeys(firstname);
}

@Given("Enter LastName as {string}")
public void enter_LastName_as(String lastname) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 driver.findElement(By.id("lastName")).sendKeys(lastname);
}

@Given("Enter Password as {string}")
public void enter_Password_as(String password) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 driver.findElement(By.id("password")).sendKeys(password);
}

@Given("Confirm your password {string}")
public void confirm_your_password(String password) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 driver.findElement(By.id("pass_confirmation")).sendKeys(password);
}

@Given("Select Gender as {string}")
public void select_Gender_as(String gender) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
}

@Given("Enter Email as {string}")
public void enter_Email_as(String gmail) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 driver.findElement(By.id("emailAddress")).sendKeys(gmail);
}

@Given("Enter Mobile Number as {string}")
public void enter_Mobile_Number_as(String phoneno) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 driver.findElement(By.id("mobileNumber")).sendKeys(phoneno);
}

@Given("Enter DOB as {string}")
public void enter_DOB_as(String dob) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 driver.findElement(By.name("dob")).sendKeys(dob);
}

@Given("Enter Address {string}")
public void enter_Address(String address) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 driver.findElement(By.name("address")).sendKeys(address);
}

@Given("Select Security question")
public void select_Security_question() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
 Actions act=new Actions(driver);
 WebElement sq=driver.findElement(By.id("securityQuestion"));
 act.moveToElement(sq).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
}

@Given("Answer the question as {string}")
public void answer_the_question_as(String ans) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 driver.findElement(By.name("answer")).sendKeys(ans);
}

@Given("CLick on Register")
public void click_on_Register() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 driver.findElement(By.xpath("//input[@name='Submit']")).click();
 //wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='userName']")));
}



@Given("Alex has registered into TestMeApp")
public void alex_has_registered_into_TestMeApp() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();

}

@When("Alex login with below set of {string} and {string}")
public void alex_login_with_below_set_of_and(String string, String string2) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
Thread.sleep(2000);
System.out.println(string+string2);

Thread.sleep(2000);
driver.findElement(By.name("userName")).sendKeys(string);
driver.findElement(By.name("password")).sendKeys(string2);
driver.findElement(By.xpath("//input[@name='Login']")).click();
}

@Then("Alex login successfully into TestMeApp")
public void alex_login_successfully_into_TestMeApp() {
    // Write code here that turns the phrase above into concrete actions
driver.close();
}

@Given("signin with credentials {string} and {string}")
public void signin_with_credentials_and(String string, String string2) {
 driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
 driver.findElement(By.name("userName")).sendKeys(string);
 driver.findElement(By.name("password")).sendKeys(string2);
 driver.findElement(By.xpath("//input[@name='Login']")).click();
 // Write code here that turns the phrase above into concrete actions
 //throw new cucumber.api.PendingException();
}

@Given("search for a product")
public void search_for_a_product() {
 Actions act =new Actions(driver);
 WebElement search=driver.findElement(By.id("myInput"));
 act.keyDown(search, Keys.SHIFT).sendKeys("B").pause(3000).sendKeys("A").pause(3000).sendKeys("G").pause(3000).keyUp(Keys.SHIFT).perform();
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Shopping bag')]"))).click().perform();
 // Write code here that turns the phrase above into concrete actions
 //throw new cucumber.api.PendingException();
}

@Given("click on find details")
public void click_on_find_details() {
 driver.findElement(By.xpath("//form//input[@name='val']")).click();
 // Write code here that turns the phrase above into concrete actions
 //throw new cucumber.api.PendingException();
}

@Given("click on add to cart")
public void click_on_add_to_cart() {
 driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
 // Write code here that turns the phrase above into concrete actions
 //throw new cucumber.api.PendingException();
}

@Given("click on cart")
public void click_on_cart() {
 try {
  driver.findElement(By.partialLinkText("Cart")).click();
 }
 catch(Exception e) {
  e.printStackTrace();
 }

 // Write code here that turns the phrase above into concrete actions
 //throw new cucumber.api.PendingException();
}

@Then("check if the added product is in cart or not")
public void check_if_the_added_product_is_in_cart_or_not() {
 WebElement ca = driver.findElement(By.tagName("h4"));
 String productname = ca.getText();
 if(productname=="Shopping Bag") {
  System.out.println("Valid product");
 }
 else
 {
  System.out.println("Invalid product");
 }
 // Write code here that turns the phrase above into concrete actions
 //throw new cucumber.api.PendingException();
}

@Then("click on proceed to checkout")
public void click_on_proceed_to_checkout() {
 driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']")).click();
 // Write code here that turns the phrase above into concrete actions
 //throw new cucumber.api.PendingException();
}


}


