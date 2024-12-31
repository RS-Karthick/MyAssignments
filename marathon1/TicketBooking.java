package marathon1;

import org.openqa.selenium.chrome.ChromeDriver;

public class TicketBooking {

	public static void main(String[] args) {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.pvrcinemas.com/");
		cd.manage().window().maximize();

	}

}
