package com.qa.sikulimain;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeVedioTest {

	public static void main(String[] args) throws FindFailed {
		WebDriver d;
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
        d=new ChromeDriver();
        d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.youtube.com/watch?v=k7UqKK6__R4");
		Screen s=new Screen();
		Pattern PauseImg= new Pattern("YPause.png");
		s.wait(PauseImg,2000);
		s.click();
		s.click();
		
		Pattern PlayImg= new Pattern("YPlay.png");
		s.wait(PlayImg,2000);
		s.click();
		s.click();
		
		Pattern SettingImg= new Pattern("YSetting.png");
		s.wait(SettingImg,2000);
		s.click();
		s.click();
		
		Pattern Y144Img= new Pattern("Y144.png");
		s.wait(Y144Img,2000);
		s.click();
		s.click();
	
	
	
	
	}

}
