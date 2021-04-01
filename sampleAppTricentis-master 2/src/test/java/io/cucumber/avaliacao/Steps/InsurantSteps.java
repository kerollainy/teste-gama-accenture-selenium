package io.cucumber.avaliacao.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.avaliacao.Pages.InsurantPage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class InsurantSteps extends Configuracao {

        @Dado("que digito o nome")
        public void que_digito_o_nome() {
            InsurantPage.campoFirstName(browser).sendKeys("Kero");
        }
    
        @Dado("digito o sobrenome")
        public void digito_o_sobrenome(){
            InsurantPage.campoLastName(browser).sendKeys("Gomes");
        }
    
        @Dado("insiro a data de nascimento")
        public void insiro_a_data_de_nascimento() {
            InsurantPage.dataBirth(browser).sendKeys("03/17/2000");
        }
    
        @Dado("escolho um genero")
        public void escolho_um_genero() throws InterruptedException {
            WebElement element = InsurantPage.campoGender(browser);
            Actions actions = new Actions(browser);
            actions.moveToElement(element).click().perform();
        }
    
        @Dado("digito o endereco")
        public void digito_o_endereco() {
            InsurantPage.campoAddress(browser).sendKeys("rua do desespero");
        }
    
        @Dado("escolho um pais")
        public void escolho_um_pais() {
            InsurantPage.opcoesCountry(browser).click();
        }
    
        @Dado("digito um CEP")
        public void digito_um_CEP() {
            InsurantPage.campoZipecode(browser).sendKeys("44700582");
        }
    
        @Dado("digito cidade {string}")
        public void digito_cidade(String string) {
            InsurantPage.campoCity(browser).sendKeys("Loucura");
        }
    
        @Dado("escolho uma ocupacao")
        public void escolho_uma_ocupacao() {
            InsurantPage.opcoesOccupation(browser).click();
        }
    
        @Dado("escolho um hobbies")
        public void escolho_um_hobbies() {
            WebElement element = InsurantPage.campoHobbies(browser);
            Actions actions = new Actions(browser);
            actions.moveToElement(element).click().perform();
        }
    
        @Dado("insiro o local na rede de internet")
        public void insiro_o_local_na_rede_de_internet() {
            InsurantPage.campoWebsite(browser).sendKeys();
        }
        
        @Entao("clico no botao next para product")
        public void clico_no_botao_next_para_product() {
            InsurantPage.botaoNext(browser).click();
        }
    
    }