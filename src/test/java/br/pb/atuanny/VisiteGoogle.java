package br.pb.atuanny;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VisiteGoogle {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeTest
    public void abrirNavegador() {
        String caminhoDriver = "driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", caminhoDriver);
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 40);
        driver.get("https://www.google.com.br");
        driver.manage().window().maximize();
    }

    @Test
    public void devevalidarLogoGoogle(){
        String logoInitial = "body > div.L3eUgb > div.o3j99.LLD4me.yr19Zb.LS8OJ > div > img";

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(logoInitial)));

        Assert.assertEquals(driver.getTitle(), "Google");

    }

//    @Test
//    public void deveFazerPesquisaComSucesso() {
//
//        String campPesquisa = "#APjFqb";
//        String btnPesquisa = "#tsf > div:nth-child(1) > div.A8SBwf > div.RNNXgb > button";
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#APjFqb")));
//        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Jenkins");
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(btnPesquisa)));
//        driver.findElement(By.cssSelector(btnPesquisa)).click();
//
//    }public static WebDriver driver;
//    public static WebDriverWait wait;
//
//    @BeforeTest
//    public void abrirNavegador() {
//        String caminhoDriver = "driver/chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", caminhoDriver);
//        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver, 40);
//        driver.get("https://www.google.com.br");
//        driver.manage().window().maximize();
//    }
//
//    @Test
//    public void devevalidarLogoGoogle(){
//        String logoInitial = "body > div.L3eUgb > div.o3j99.LLD4me.yr19Zb.LS8OJ > div > img";
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(logoInitial)));
//
//        Assert.assertEquals(driver.getTitle(), "Google");
//
//    }
//
////    @Test
////    public void deveFazerPesquisaComSucesso() {
////
////        String campPesquisa = "#APjFqb";
////        String btnPesquisa = "#tsf > div:nth-child(1) > div.A8SBwf > div.RNNXgb > button";
////
////        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#APjFqb")));
////        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Jenkins");
////
////        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(btnPesquisa)));
////        driver.findElement(By.cssSelector(btnPesquisa)).click();
////
////    }
}
