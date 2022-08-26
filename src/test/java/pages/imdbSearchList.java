package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class imdbSearchList {
    WebDriver driver;
    public imdbSearchList(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //Elements fot IMDB Search List Page
    @FindBy(xpath="//*[text()='Pushpa: The Rise - Part 1']")
    WebElement firstsearchresult;
    //Methods for IMDB Search List Page
    public void clickOnFirstResult(){
        firstsearchresult.click();
    }
}
