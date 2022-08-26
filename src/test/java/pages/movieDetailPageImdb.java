package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class movieDetailPageImdb {
    String CountryImdb;
    String pusphaReleaseImdb;
    WebDriver driver;
    public movieDetailPageImdb(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    // Elements for Imdb Movie Detail Page
    @FindBy(xpath="//*[text()='Release date']//parent::li//li//a")
    WebElement releasedate;
    @FindBy(xpath="//*[text()='Country of origin']//parent::li//li//a")
    WebElement countryoforiginImdb;

    //Methods for Imdb Movie Detail Page
    public void extractReleaseDateImdb (){
        releasedate.click();
        pusphaReleaseImdb= driver.findElement(By.xpath("//*[@id=\"releaseinfo_content\"]/table[1]/tbody/tr[6]/td[2]")).getText();
        System.out.println(pusphaReleaseImdb);
    }

    public void extractCountryImdb(){
        CountryImdb=countryoforiginImdb.getText();
        System.out.println(CountryImdb);
    }
}
