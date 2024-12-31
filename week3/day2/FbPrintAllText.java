package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbPrintAllText {
public static void main(String[] args) {
	ChromeDriver fb = new ChromeDriver();
	fb.manage().window().maximize();
	fb.get("https://en-gb.facebook.com/");
}
}
