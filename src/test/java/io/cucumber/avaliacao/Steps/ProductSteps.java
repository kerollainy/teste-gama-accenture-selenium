package io.cucumber.avaliacao.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.avaliacao.Pages.ProductPage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class ProductSteps extends Configuracao{

        @Quando("escolho uma data")
        public void escolho_uma_data(){
            ProductPage.campoCalendario(browser).sendKeys("05/05/2021");;
        }
        
        @Quando("escolho um valor")
        public void escolho_um_valor() {
            ProductPage.campoValor(browser).click();
        }
        
        @Quando("escolho uma nota")
        public void escolho_uma_nota() {
            ProductPage.campoNota(browser).click();
        }
        
        @Quando("escolho uma cobertura")
        public void escolho_uma_cobertura() {
            ProductPage.campoCobertura(browser).click();
        }
        
        @Quando("escolho produtos opcionais")
        public void escolho_produtos_opcionais() {
            WebElement element = ProductPage.campoOpcao(browser);
            Actions actions = new Actions(browser);
            actions.moveToElement(element).click().perform();
        }
        
        @Quando("escolho uma cortesia")
        public void escolho_uma_cortesia() {
            ProductPage.campoCortesia(browser).click();
        }
        
        @Entao("clico no botao next para ver a tabela de precos")
        public void clico_no_botao_next_para_ver_a_tabela_de_precos() {
            ProductPage.botaoNext(browser).click();
        }    