package myNewProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookieTest264 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("welcome to Cookie testing :D");
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Set<Cookie>s=driver.manage().getCookies();
		System.out.print("cookie names are  ");
		for (Cookie c:s)
		{
			System.out.println("name is " +c.getName()+", "+ "Expiry date is  "+ c.getExpiry());
			if (c.isSecure()==true)
			{
				Thread.sleep(2000);
				String d=c.getDomain();
				System.out.print("this is a secured cookie \n");
				System.out.println(d);
				if (c.getDomain().contains("google.co.in"))
						{
							System.out.println("this cookie is of same domain");
						}
				if(c.getDomain().contains("google.com"))
				{
					System.out.println("this is a super domain cookie");
				}
			}
		}
		Thread.sleep(3000);
		driver.close();	
		System.out.println("jai PNR");
		
	}

}
