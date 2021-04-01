package io.cucumber.avaliacao.Steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.avaliacao.Pages.SendQuotePage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class SendQuoteSteps extends Configuracao {

        @Dado("preencho o email")
        public void preencho_o_email() {
            SendQuotePage.campoEmail(browser).sendKeys('Kero.Gomes@tester.com.br');
        }
        
        @Dado("digito um telefone")
        public void digito_um_telfone() {
            SendQuotePage.campoPhone(browser).sendKeys('81986869752');
        }
        
        @Dado("escolho um nome de usuario")
        public void escolho_um_nome_de_usuario() {
            SendQuotePage.campoUsername(browser).sendKeys('Kero');
        }
        
        @Dado("escolho uma senha")
     public void escolho_uma_senha() {
            SendQuotePage.campoPassword(browser).sendKeys('Pass154d');
        }
        
        @@Dado("confirmo a senha")
        public void confirmo_a_senha() {
            SendQuotePage.campoConfirmPassword(browser).sendKeys('Pass154d');
        }
        
        @Quando("clico em Send")
        public void clico_em_Send(){
            SendQuotePage.botaoSend(browser).click();
        
        }
          
        @Entao("Verifico a mensagem {string}")
        public void verifico_a_mensagem(String string) throws InterruptedException {
            Thread.sleep(12000);
            assertEquals(string, SendQuotePage.menssagemSucesso(browser).getText());
        }    
    
        @Quando("clico no botao Ok")
        public void clico_no_botao_Ok() {
            SendQuotePage.botaoOk(browser).click();
            browser.close();
        }
        

    
}
