import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork{

    WebDriver wd;


    @BeforeClass
    public  void  setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void  homeWork1(){

        //by tag name
    WebElement tagN1 = wd.findElement(By.tagName("div"));
    WebElement tagN2 = wd.findElement(By.tagName("h1"));
    WebElement tagN3 = wd.findElement(By.cssSelector("div"));
    WebElement input = wd.findElement(By.tagName("input"));
    List<WebElement> butType = wd.findElements(By.tagName(".a"));


        //by class
    WebElement cl1 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
    WebElement cl2 = wd.findElement(By.cssSelector(".container"));


        //by id
        WebElement id1 = wd.findElement(By.id("root"));
        WebElement id2 = wd.findElement(By.cssSelector("#root"));

        //by attribute
     //  WebElement


    }
}
