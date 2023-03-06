import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class FiveElements extends BasicClass{
    static WikiumPageObject wikiumPObj = PageFactory.initElements(driver, WikiumPageObject.class);
    @BeforeClass
 public static void openWebPage(){
        driver.get("https://www.wikium.net");
    }
    @Test
    public void printTexts(){
        System.out.println(driver.getTitle());
        System.out.println("Info: "+wikiumPObj.getMainText());
        System.out.println("Additional: "+wikiumPObj.getDescription());
        System.out.println("App helps you: "+wikiumPObj.getList());
        System.out.println("Accessible and convenient: "+wikiumPObj.getAccessibleList());
    }
}