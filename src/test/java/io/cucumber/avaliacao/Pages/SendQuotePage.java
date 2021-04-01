package io.cucumber.avaliacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.avaliacao.Servicos.Configuracao;

public class SendQuotePage extends Configuracao {

    public static WebElement campoEmail (WebDriver browser) {
        return browser.findElement(By.cssSelector("#email"));
    }
    
    public static WebElement campoCell (WebDriver browser) {
        return browser.findElement(By.cssSelector("#phone"));
    }

    public static WebElement campoUsuario (WebDriver browser) {
        return browser.findElement(By.cssSelector("#username"));
    }

    public static WebElement campoSenha (WebDriver browser) {
        return browser.findElement(By.cssSelector("#password"));
    }

    public static WebElement campoConfirmsenha (WebDriver browser) {
        return browser.findElement(By.cssSelector("#confirmpassword"));
    } 

    public static WebElement botaoSend (WebDriver browser) {
        return browser.findElement(By.cssSelector("#sendemail"));
    }

    public static WebElement menssagemSucesso (WebDriver browser) {
        return browser.findElement(By.cssSelector("body>div.sweet-alert.showSweetAlert.visible>h2"));
    } 

    public static WebElement botaoOk (WebDriver browser) {
        return browser.findElement(By.cssSelector("body>div.sweet-alert.showSweetAlert.visible>div.sa-button-container>div>button"));
    }

    
}
