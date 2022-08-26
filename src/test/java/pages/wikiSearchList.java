package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wikiSearchList {
    WebDriver driver;
    public wikiSearchList(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //Elements for wiki search list page
    @FindBy(xpath="//*[text()='Pushpa: The Rise']")
    WebElement firstsearchresultwiki;
    //Methods for wiki search list page
    public void clickOnFirstResultwiki(){
        firstsearchresultwiki.click();
    }
}