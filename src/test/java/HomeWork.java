import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
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
    public void classwork2() {
        WebElement loginButton = wd.findElement(By.cssSelector("[name='login']"));
        String text = loginButton.getText();
        System.out.println(text);


        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();
        System.out.println("******************");
        System.out.println(textForm);

        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("******************");
        System.out.println(textAll);

        WebElement br = wd.findElement(By.tagName("br"));
        System.out.println("******************");
        System.out.println("text br--->" +br.getText());
    }




    @Test
    public  void  classwork(){
        //parent

        WebElement el = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el2 = wd.findElement(By.xpath("//h1/.."));
                                                             //h1/ancestor::body
        //h1/ancestor::div[1] or 2.3.4
        //ancestor

        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*")); //all
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div")); //two options
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]")); //one option

        //ancestor or self

        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling

        WebElement el7 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::a[2]"));
        List<WebElement> list2 = wd.findElements(By.xpath("//a[last()]/preceding-sibling::*"));

    }


    @Test
    public void  homeWork1(){

        //by tag name
    WebElement tagN1 = wd.findElement(By.tagName("div"));
    WebElement tagN2 = wd.findElement(By.tagName("h1"));
    WebElement tagN3 = wd.findElement(By.cssSelector("div"));
    WebElement input = wd.findElement(By.tagName("input"));
    List<WebElement> butType = wd.findElements(By.tagName("a"));

        //cw
        WebElement el = wd.findElement(By.tagName("body")); //<body>
        WebElement el1 = wd.findElement(By.cssSelector("body"));
        WebElement ele42 = wd.findElement(By.xpath("/html//body"));
        WebElement ele41 = wd.findElement(By.xpath("//body"));

        WebElement el2 = wd.findElement(By.tagName("div"));
        WebElement el3 = wd.findElement(By.cssSelector("div"));
        WebElement ele43 = wd.findElement(By.xpath("/html//div"));

        WebElement el4 = wd.findElement(By.tagName("h1"));
        WebElement el5 = wd.findElement(By.cssSelector("h1"));
        WebElement ele44 = wd.findElement(By.xpath("/html//h1"));

        WebElement el6 = wd.findElement(By.tagName("a"));
        WebElement el7 = wd.findElement(By.cssSelector("a"));
        WebElement ele45 = wd.findElement(By.xpath("/html//a"));

        WebElement el8 = wd.findElement(By.tagName("form"));
        WebElement el9 = wd.findElement(By.cssSelector("form"));
        WebElement ele46 = wd.findElement(By.xpath("/html//form"));

        WebElement el10 = wd.findElement(By.tagName("input"));
        WebElement el11 = wd.findElement(By.cssSelector("input"));
        WebElement ele47 = wd.findElement(By.xpath("/html//input"));


        //by class
    WebElement cl1 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
    WebElement cl2 = wd.findElement(By.cssSelector(".container"));
    WebElement ele48 = wd.findElement(By.xpath("//*[@class='container']"));



        //by id
        WebElement id1 = wd.findElement(By.id("root"));
        WebElement id2 = wd.findElement(By.cssSelector("#root"));
        WebElement ele36 = wd.findElement(By.xpath("//*[@id='root']"));


        //by attribute
        List<WebElement> verticalList1 = wd.findElements(By.cssSelector("[style = 'vertical-align: inherit']"));


        //by tag name
        WebElement ele = wd.findElement(By.tagName("body"));
        WebElement ele1 = wd.findElement(By.cssSelector("body"));
        WebElement ele37 = wd.findElement(By.xpath("/html//body"));

        WebElement ele2 = wd.findElement(By.tagName("div"));
        WebElement ele3 = wd.findElement(By.cssSelector("div"));
        WebElement ele38 = wd.findElement(By.xpath("/html//div"));

        WebElement ele4 = wd.findElement(By.tagName("h1"));
        WebElement ele5 = wd.findElement(By.cssSelector("h1"));
        WebElement ele39 = wd.findElement(By.xpath("/html//h1"));

        WebElement ele6 = wd.findElement(By.tagName("a"));
        WebElement ele7 = wd.findElement(By.cssSelector("a"));
        WebElement ele40 = wd.findElement(By.xpath("/html//a"));

        WebElement ele8 = wd.findElement(By.tagName("form"));
        WebElement ele9 = wd.findElement(By.cssSelector("form"));
        WebElement ele65 = wd.findElement(By.xpath("/html//form"));

        WebElement ele10 = wd.findElement(By.tagName("input"));
        WebElement ele11 = wd.findElement(By.cssSelector("input"));
        WebElement ele49 = wd.findElement(By.xpath("/html//input"));

        WebElement el12 = wd.findElement(By.tagName("button"));
        WebElement el13 = wd.findElement(By.cssSelector("button"));
       WebElement el29=wd.findElement(By.xpath("/html//button"));


        //by class
        WebElement el14 = wd.findElement(By.className("container"));
        WebElement el15 = wd.findElement(By.cssSelector(".container"));
        WebElement el30=wd.findElement(By.xpath("//*[@class='container']"));

        WebElement el16 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el17 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement ele50 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement el18 = wd.findElement(By.className("active"));
        WebElement el19 = wd.findElement(By.cssSelector(".active"));
        WebElement ele51 = wd.findElement(By.xpath("//*[@class='active']"));


        //by id

        WebElement el20 = wd.findElement(By.id("root"));
        WebElement el21 = wd.findElement(By.cssSelector("#root"));
        WebElement el31 = wd.findElement(By.xpath("//*[@id='root']"));


        //by attribute
        WebElement el22 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement ele52 = wd.findElement(By.xpath("//*[@href='/home']"));

        WebElement el23 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement el24 = wd.findElement(By.name("email"));
        WebElement ele53 = wd.findElement(By.xpath("//*[@name='email']"));


        WebElement el25 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el32 = wd.findElement(By.xpath("//*[@placeholder='Email']"));
        WebElement el63 = wd.findElement(By.cssSelector("[placeholder^='Em']"));
        WebElement el64 = wd.findElement(By.cssSelector("[placeholder$='il']"));
        WebElement el65 = wd.findElement(By.cssSelector("[placeholder*='ai']"));


        WebElement el26 = wd.findElement(By.cssSelector("[placeholder^='Em']"));
        WebElement el33 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Em')]"));
        WebElement el66 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Pas')]"));

        WebElement el27 = wd.findElement(By.cssSelector("[placeholder$='il']"));
        WebElement el35 = wd.findElement(By.xpath("//*[contains(@placeholder,'il')]"));

        WebElement el28 = wd.findElement(By.cssSelector("[placeholder*='ma']"));
        WebElement el34 = wd.findElement(By.xpath("//*[contains(@placeholder,'ma')]"));

        WebElement ele60 = wd.findElement(By.xpath("//*[@rel='stylesheet']"));
        WebElement ele61 = wd.findElement(By.xpath("//*[text()='ABOUT']"));
        WebElement ele62 = wd.findElement(By.xpath("//*[starts-with(@name,'regis')]"));
        WebElement ele63 = wd.findElement(By.xpath("//*[contains(@name,'ration')]"));
        WebElement ele64 = wd.findElement(By.xpath("//*[contains(@name,'gist')]"));
    }
    @AfterClass
    public void postCondition() {
        wd.quit();
    }
}
 //  //h1/.. - parent upp    //h1/parent::*  (name of element (os)
