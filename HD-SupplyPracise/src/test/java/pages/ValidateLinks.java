package pages;

import java.io.File;
import java.io.FileWriter;

import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import actionsClass.BaseClass2;

public class ValidateLinks extends BaseClass {
	@Test(priority=1)
	public void testLinks() throws Exception {
		Set<String> setToAppend1 = new HashSet<String>();
		Set<String> setToAppend2 = new HashSet<String>();
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		for(WebElement link:Links) {
			String linkURL=link.getAttribute("href");
			Set<String> linkset=new HashSet<String>();
			linkset.add(linkURL);
			String textToAppend=linkURL;
			File file=new File("abi12.txt");
			try(FileWriter fileWriter1 = new FileWriter(file, true);
			PrintWriter printWriter1 = new PrintWriter(fileWriter1);) { 
					  printWriter1.println(textToAppend);
					}
			
			//String fileName = "D:/TSL/HD-SupplyPracise/xyz.txt";
			URL url=new URL(linkURL);
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection httpURLConnection=(HttpURLConnection)urlConnection;
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect();
			if(httpURLConnection.getResponseCode()==200) {
				System.out.println(linkURL + "--"+httpURLConnection.getResponseMessage());
				
			}
			else {
				System.err.println(linkURL + "--"+httpURLConnection.getResponseMessage());
			
				
			}		
			
			
		}
			
		
	}


	

}
