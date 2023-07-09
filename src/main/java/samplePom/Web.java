package samplePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web {
  @Test
  public void f() {
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://engineering.saraswatikharghar.edu.in/"); 
  }
}
