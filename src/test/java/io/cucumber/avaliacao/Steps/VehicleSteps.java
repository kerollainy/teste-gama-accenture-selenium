package io.cucumber.avaliacao.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.avaliacao.Pages.VehiclePage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class VehicleSteps extends Configuracao{


	@Dado("que estou no site da tricentis")
	public void que_estou_no_site_da_tricentis(){
		Configuracao.open("http://sampleapp.tricentis.com/101/app.php");
	}

	@Dado("escolho uma marca")
	public void escolho_uma_marca()  {
		VehiclePage.dropdownMarca(browser).click();
	}

	@Dado("escolho o modelo")
	public void escolho_o_modelo() {
		VehiclePage.campoModelo(browser).click();
	}

	@Dado("digito a capacidade do cilindro")
	public void digito_a_capacidade_do_cilindro() {
		VehiclePage.campoCilindro(browser).sendKeys('200');
	}	

	@Dado("digito o desempenho do motor")
	public void digito_o_desempenho_do_motor() {
		VehiclePage.campoMotor(browser).sendKeys('1000');
	}	

	@Dado("insiro a data")
	public void insiro_a_data() throws InterruptedException {
		VehiclePage.botaoCalendario(browser).click();
		Thread.sleep(2000);
		VehiclePage.dataCalendario(browser).click();
	}
	
	@Dado("escolho o numero de assento")
	public void escolho_o_numero_de_assento() {
		VehiclePage.opcoesAssent(browser).click();
	}

	@Dado("escolho o tipo de direcao")
	public void escolho_o_tipo_de_direcao()throws InterruptedException {
		WebElement element = VehiclePage.opcaoDirecao(browser);
		Actions actions = new Actions(browser);
		actions.moveToElement(element).click().perform();
	}	

	@Dado("escolho novamente o numero de assento")
	public void escolho_novamente_o_numero_de_assento() {
		VehiclePage.opcoesNovamente(browser).click();
	}

	@Dado("escolho o tipo de combustivel")
	public void escolho_o_tipo_de_combustivel() {
		VehiclePage.opcoescombustivel(browser).click();
	}

	@Dado("digito a carga util")
	public void digito_a_carga_util() {
		VehiclePage.campoCarga(browser).sendKeys("1587");
	}
	
	@Dado("digito o peso total util")
	public void digito_o_peso_total_util() {
		VehiclePage.campoTotal(browser).sendKeys("1452");
	}	
		
	@Dado("digito no campo preco de tabela")
	public void digito_no_campo_preco_de_tabela() {
		VehiclePage.campoPreco(browser).sendKeys("1400");
	}

	@Dado("digito no campo numero da placa do carro")
	public void digito_no_campo_numero_da_placa_do_carro()  {
		VehiclePage.campoLicenca(browser).sendKeys("PWE1574");
	}

	@Dado("digito no campo milhagem anual")
	public void digito_no_campo_milhagem_anual()  {
		VehiclePage.campoMilhagem(browser).sendKeys("1500");
	}

	@Entao("clico no botao next para insurant")
	public void clico_no_botao_next_para_insurant() {
		VehiclePage.botaoNext(browser).click();
	}

}