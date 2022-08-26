package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class imdb {
    WebDriver driver;
    public imdb(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //Elements in IMDB Page
    @FindBy(id="suggestion-search")
    WebElement searchbox;

    //Methods For IMDB page
    public void searchmovie(String name){
        searchbox.clear();
        searchbox.click();
        searchbox.sendKeys(name);
        searchbox.sendKeys(Keys.ENTER);
    }

}
