
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;


    @Test
    public void test(){
        wd = new ChromeDriver();
        wd.get("https://accounts.google.com/v3/signin/identifier?aodrpl=1&authuser=0&checkConnection=youtube%3A316%3A0&checkedDomains=youtube&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&hl=ru&ifkv=AS5LTAQ4Ea4CusXUa9wwmbm8Hsn8-exXhEDLXrApBiGPT1QqXJbKMXZbLUHTwVOF3w3lCFTvPyb7pA&osid=1&passive=true&pstMsg=1&sarp=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S503527255%3A1718785037766910&ddm=0");
    }
}
