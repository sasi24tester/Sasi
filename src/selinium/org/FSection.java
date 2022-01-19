package selinium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.grid.node.locators.ByName;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FSection {
	

    
    public static void main(String [] args) throws AWTException, IOException{
              
    	System.setProperty("webdriver.chrome.driver",
    			"C:\\Users\\91824\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
    			WebDriver driver = new ChromeDriver();
    			
    			driver.get("http://demo.guru99.com/test/web-table-element.php"); 
    			  WebElement td = driver.findElement(By.xpath("//a[contains(text(),'Bharat Electroni')]"));    	                                       
					
					
					String data = td.getText();
    	                 List<WebElement> fi = driver.findElements(By.tagName("tr"));  
    	                          for (int i = 0; i < fi.size(); i++) {
								          
								      WebElement w = fi.get(i);
								      
												WebElement d = w.findElement(By.xpath("//td[1]"));
    	                                                   String text = d.getText();
												if (text==data) {
													System.out.println(w.getText());
												}
											
												
												
											}
    	
    	                                            
    	                          }                                     
							}
    
                        	  
						
                                  
   		                  
                                                       
				
					
					
				
	        	 
				
			

  
	

	




	
	
	

