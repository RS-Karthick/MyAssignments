package myReference;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {
public static void main(String[] args) {
	ChromeDriver cl = new ChromeDriver(); // ctrl+shift+o - Import
	cl.get("https://www.google.com/search?q=english+to+tamil&rlz=1C1VDKB_enIN1126IN1126&oq=e&gs_lcrp=EgZjaHJvbWUqDggAEEUYJxg7GIAEGIoFMg4IABBFGCcYOxiABBiKBTIGCAEQRRhAMgYIAhBFGDkyCAgDEEUYJxg7Mg0IBBAAGIMBGLEDGIAEMgYIBRBFGDwyBggGEEUYPTIGCAcQRRg80gEIMTE4N2owajeoAgCwAgA&sourceid=chrome&ie=UTF-8");
cl.manage().window().maximize();
}
}
