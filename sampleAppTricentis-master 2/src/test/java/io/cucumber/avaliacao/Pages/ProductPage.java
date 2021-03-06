package io.cucumber.avaliacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.avaliacao.Servicos.Configuracao;

public class ProductPage extends Configuracao{

    public static WebElement campoCalendario (WebDriver browser) {
        return browser.findElement(By.cssSelector("#startdate"));
    }

    public static WebElement campoValor (WebDriver browser) {
        return browser.findElement(By.cssSelector("#insurancesum option:nth-child(5)"));
    }

    public static WebElement campoNota (WebDriver browser) {
        return browser.findElement(By.cssSelector("#meritrating option:nth-child(5)"));
    }

    public static WebElement campoCobertura (WebDriver browser) {
        return browser.findElement(By.cssSelector("#damageinsurance option:nth-child(2)"));
    } 

    public static WebElement campoOpcao (WebDriver browser) {
        return browser.findElement(By.cssSelector("#EuroProtection"));
    }

    public static WebElement campoCortesia (WebDriver browser) {
        return browser.findElement(By.cssSelector("#courtesycar option:nth-child(2)"));
    }

    public static WebElement botaoNext (WebDriver browser) {
        return browser.findElement(By.cssSelector("#nextselectpriceoption"));
    }
    
}
