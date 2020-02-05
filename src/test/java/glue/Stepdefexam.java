package glue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browserutil.DriverUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefexam {
	WebDriver driver;
	@Given("user is on the home page")
	public void user_is_on_the_home_page()
	{
		driver=DriverUtil.getDriver("chrome");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		}
	@When("user enters the adminusername and password ")
	public void user_enters_the_adminusername_and_password() {
		driver.findElement(By .linkText("SignIn")).click();
		driver.findElement(By .name("username")).sendKeys("adminusername");
		driver.findElement(By .name("password")).sendKeys("password");
		driver.findElement(By .name("Login")).click();
		}
		@Then("login_is_successful")
		public void login_is_successful()
		{
			System.out.println("Login is successful");
		}
		//@When("Admin add the new category")
		//public void adding category under the sports()
		//{
			//driver.findElement(By .linkText("Add Category")).click();
			//driver.findElement(By .name("catgName")).sendKeys("sports");
			//driver.findElement(By .name("catgDesc")).sendKeys("outdoor");
			//driver.findElement(By .xpath("//input[@value='Add']")).click();
		//}
		//@When("Admin add the subcategory")
		// void adding subcategory under the sports()
		//{
		//findElement(By .linkText("AddProductSubCategory.htm")).click();
		//	driver.findElement(By .xpath("//input[@value='11294']")).click();
			//driver.findElement(By .name("subCatgName")).sendKeys("BasketBall");
			//driver.findElement(By .name("subCatDesc")).sendKeys("outdoor");
			//driver.findElement(By .xpath("//input[@value='Add']")).click();
			//		
		//}
}
