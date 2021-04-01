# language: pt

Funcionalidade: Preenchendo um formulario no site da tricentis
  Preenchendo o formulario de seguro de automovel da tricentis

  Cenário: Entrar no site da tricentis e preencher o formulario “Enter Vehicle Data”
    Dado que estou no site da tricentis
    E seleciono uma marca
    E seleciono o modelo
    E digito a capacidade do cilindro
    E digito o desempenho do motor
    E insiro a data 
    E seleciono o numero de assento 
    E escolho o tipo de direcao
    E escolho novamente o numero de assento
    E escolho o tipo de combustivel 
    E digito a carga util
    E digito o peso total util
    E digito no campo preco de tabela 
    E digito no campo numero da placa do carro 
    E digito no campo milhagem anual 
    Entao clico no botao next para insurant 
  
  Cenário: Estou no site da tricentis e preenchendo o formulario da aba “Enter insurant Data”
        
    Dado que digito o nome
    E digito o sobrenome
    E insiro a data de nascimento
    E escolho um genero
    E digito o endereco
    E escolho um pais
    E digito um CEP
    E digito a cidade
    E escolho uma ocupacao
    E escolho um hobbies
    E insiro o local na rede de internet
    Entao clico no botao next para product

  Cenario: Preencher Enter Product Data
    Quando escolho uma data 
    E escolho um valor
    E escolho uma nota
    E escolho uma cobertura 
    E escolho produtos opcionais 
    E escolho uma cortesia
    Entao clico no botao next para ver a tabela de precos
  
  Cenario: Escolher tipo de Select Price Option
    Quando escolhe uma opcao 
    Entao clico no botao Next para receber orcamento

  Cenario: Preencher os campos Send Quote
    E preencho o email 
    E digito um telefone 
    E escolho um nome de usuario
    E escolho uma senha 
    E confirmo a senha 
    E faco um comentario 
    Quando clico em Send
    Entao Verifico a mensagem "Sending e-mail success!"
    E clico no botao Ok