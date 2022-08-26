package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wiki {
    WebDriver driver;
    public wiki(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
//Elements of wiki homepage
    @FindBy(id="searchInput")
    WebElement searchboxwiki;
    //Methods for wiki homepage
    public void searchmovieinwiki(String name){
        searchboxwiki.clear();
        searchboxwiki.click();
        searchboxwiki.sendKeys(name);
        searchboxwiki.sendKeys(Keys.ENTER);
    }
}

