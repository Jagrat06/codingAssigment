package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class movieDetailPageWiki extends movieDetailPageImdb {
    String CountryWiki;
    String pusphaReleaseWiki;
    WebDriver driver;
    public movieDetailPageWiki(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // Elements for movie detail page in wiki
    @FindBy(xpath = "//*[text()='Release date']//ancestor::tr//li")
    WebElement releasedateinWiki;

    @FindBy(xpath = "//*[text()='Country']//parent::tr//td")
    WebElement countryoforiginWiki;
    //Methods for movie detail page in wiki
    public void extractReleaseDateWiki() {
        pusphaReleaseWiki = releasedateinWiki.getText();
        System.out.println(pusphaReleaseWiki);
    }
    public void extractCountryWiki() {
         CountryWiki = countryoforiginWiki.getText();
        System.out.println(CountryWiki);

    }
    public void verifyCountry() {
        Assert.assertEquals(CountryWiki,CountryImdb);
        System.out.println("Countries are same");
    }
    public void verifyReleaseDate(){
        Assert.assertEquals(pusphaReleaseWiki,pusphaReleaseImdb);
        System.out.println("Release Dates are same");
    }
}