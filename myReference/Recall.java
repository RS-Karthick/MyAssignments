package myReference;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recall {
public static void main(String[] args) {
	ChromeDriver d = new ChromeDriver();
	d.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AcMMx-dGEstLEdaFe-hPwpqWeDQpb7SJ3zvLkoKsBlOrasMhgPostEDtHcjZ2kRhqtNhUKBwHZFD9Q&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	d.manage().window().maximize();
	d.findElement(By.id("identifierId")).sendKeys("karthickravics@gmail.com");
	d.findElement(By.className("whsOnd zHQkBf")).sendKeys("8148845684");
}
}