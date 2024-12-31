package myReference;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
public static void main(String[] args) {
	ChromeDriver cd = new ChromeDriver();
//	EdgeDriver ed = new EdgeDriver ();
	//FirefoxDriver fd  = new FirefoxDriver();
	cd.get("https://www.youtube.com/watch?v=2YWU9RNDz9o&list=PL699Xf-_ilW6vI9FHmePi1TvKyzYATgXi&index=4");
cd.manage().window().maximize();
}
}
