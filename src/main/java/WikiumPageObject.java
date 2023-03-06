import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class WikiumPageObject {
    @FindBy(className = "entry-land-first-screen__title")
    WebElement main_info;
    @FindBy(className = "entry-land-first-screen__text")
    WebElement additional_info;
    @FindBy(className = "entry-land-help__list")
    WebElement help_list;

    @FindBy(className = "entry-land-comfort__list")
    WebElement apps_list;

    public String getMainText() {
        return main_info.getText();
    }

    public String getDescription() {
        return additional_info.getText();
    }

    public List<String> getList() {
        List<String> helpingList = new ArrayList<>();
        List<WebElement> listWithItems = (List<WebElement>) help_list.findElements(By.className("entry-land-help__item-title"));
        for (WebElement s : listWithItems) {
            helpingList.add(s.getText());
        }
        return helpingList;
    }

    public List<String> getAccessibleList() {
        List<String> accessibleList = new ArrayList<>();
        List<WebElement> accList = (List<WebElement>) apps_list.findElements(By.tagName("li"));
        for (WebElement s : accList) {
            accessibleList.add(s.getText());
        }
        return accessibleList;
    }
}
