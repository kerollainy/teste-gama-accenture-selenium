package io.cucumber.avaliacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.avaliacao.Servicos.Configuracao;

public class VehiclePage extends Configuracao {

    public static WebElement dropdownMarca (WebDriver browser) {
        return browser.findElement(By.cssSelector("#make>option:nth-child(14)"));
    }

    public static WebElement campoModelo (WebDriver browser) {
        return browser.findElement(By.cssSelector("#model>option:nth-child(2)"));
    }

    public static WebElement campoCilindro (WebDriver browser) {
        return browser.findElement(By.cssSelector("#cylindercapacity"));
    }

    public static WebElement campoMotor (WebDriver browser) {
        return browser.findElement(By.cssSelector("#engineperformance"));
    }

    public static WebElement botaoCalendario (WebDriver browser) {
        return browser.findElement(By.cssSelector("button#opendateofmanufacturecalender"));
    }

    public static WebElement dataCalendario (WebDriver browser) {
        return browser.findElement(By.cssSelector(".ui-state-default.ui-state-hover"));
    }

    public static WebElement opcoesAssent (WebDriver browser) {
        return browser.findElement(By.cssSelector("select#numberofseats > option[value='4']"));
    }

    public static WebElement campoDirecao (WebDriver browser) {
        return browser.findElement(By.cssSelector("input[id*='yes']"));
    }

    public static WebElement opcoesNovamente (WebDriver browser) {
        return browser.findElement(By.cssSelector("#numberofseatsmotorcycle > option[value='3']"));
    }

    public static WebElement opcoescombustivel (WebDriver browser) {
        return browser.findElement(By.cssSelector("#fuel option:nth-child(4)"));
    }
    
    public static WebElement campoCarga (WebDriver browser) {
        return browser.findElement(By.cssSelector("#payload"));
    }

    public static WebElement campoTotal (WebDriver browser) {
        return browser.findElement(By.cssSelector("#totalweight"));
    }

    public static WebElement campoPreco (WebDriver browser) {
        return browser.findElement(By.cssSelector("#listprice"));
    }

    public static WebElement campoLicenca (WebDriver browser) {
        return browser.findElement(By.cssSelector("#licenseplatenumber"));
    }
    
    public static WebElement campoMilhagem (WebDriver browser) {
        return browser.findElement(By.cssSelector("#annualmileage"));
    } 

    public static WebElement botaoNext (WebDriver browser) {
        return browser.findElement(By.cssSelector(".next"));
    }


}
