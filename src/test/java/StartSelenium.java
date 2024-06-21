
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;


    @Test
    public void test(){
        wd = new ChromeDriver();
      //  wd.get("https://telranedu.web.app/home"); //open without steps on website

        wd.navigate().to("https://telranedu.web.app/home"); //with steps
//        wd.navigate().back();
//        wd.navigate().forward();
//        wd.navigate().refresh();

//        wd.close();//only tab
//        wd.quit();//all
    }
}
