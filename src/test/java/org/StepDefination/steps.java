package org.StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import java.util.concurrent.TimeUnit;

public class steps {

    //Below are the object of the page factory class
    WebDriver driver;
    imdb imdbpage;
    imdbSearchList imdbpage2;
    wiki wikipage;
    wikiSearchList wikipage2;
    movieDetailPageImdb movieDetailImdb;
    movieDetailPageWiki movieDetailwiki;

    //Steps
    @Given("User opens browser")
    public void user_opens_browser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @And("User hits the url {string}")
    public void user_hits_the_url(String imdb) {
        driver.get(imdb);
    }
    @And("User enters the movie name in imdb {string}")
    public void User_enters_the_movie_name_in_imdb(String moviename){
        imdbpage =new imdb(driver);
        imdbpage.searchmovie(moviename);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @And("User opens movie page details")
    public void User_opens_movie_page_details(){
        imdbpage2= new imdbSearchList(driver);
        imdbpage2.clickOnFirstResult();
    }
    @And("User opens movie page details in wiki")
    public void User_opens_movie_page_details_in_wiki(){
        wikipage2= new wikiSearchList(driver);
        wikipage2.clickOnFirstResultwiki();
    }
    @Given("User enters the movie name in wiki {string}")
    public void user_enters_the_movie_name_in_wiki(String moviename) {
       wikipage=new wiki(driver);
       wikipage.searchmovieinwiki(moviename);
    }
   @Then("User Extracts date of release and country from imdb")
    public void User_Extracts_date_of_release_and_country_from_imdb(){
        movieDetailImdb=new movieDetailPageImdb(driver);
        movieDetailImdb.extractCountryImdb();
        movieDetailImdb.extractReleaseDateImdb();
    }
    @Then("User Extracts date of release and country from wiki")
    public void User_Extracts_date_of_release_and_country_from_wiki(){
        movieDetailwiki=new movieDetailPageWiki(driver);
        movieDetailwiki.extractCountryWiki();
        movieDetailwiki.extractReleaseDateWiki();
    }
    @Then("User verifies country in wiki and imdb")
    public void User_verifies_country_in_wiki_and_imdb(){
        movieDetailwiki=new movieDetailPageWiki(driver);
        movieDetailwiki.verifyCountry();
    }
    @Then ("User verifies release date in wiki and imdb")
    public void User_verifies_release_date_in_wiki_and_imdb(){
        movieDetailwiki=new movieDetailPageWiki(driver);
        movieDetailwiki.verifyReleaseDate();
    }
}
