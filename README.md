# API REST para Gestão de Frota

> **Projeto Prático: Desenvolvimento para a Disciplina de Linguagem de Programação III (LP3)**

> **Curso: Análise e Desenvolvimento de Sistemas (ADS) — IFSul Campus Venâncio Aires**

---

## Sobre o Projeto

Este sistema foi desenvolvido com o objetivo de realizar o gerenciamento de veículos de uma frota por meio de uma API REST.

A aplicação disponibiliza serviços web responsáveis pelo cadastro, consulta, atualização e remoção de veículos, permitindo a integração com aplicações frontend ou outros sistemas que necessitem consumir informações da frota.

O software segue a arquitetura cliente-servidor, utilizando Java para implementação da API, persistência dos dados em banco relacional e comunicação através de requisições HTTP retornando dados no formato JSON.

---

## Tecnologias Utilizadas

* Linguagem Backend: Java
* Servidor Web: Jetty Server
* API REST: Jakarta Servlet
* Persistência de Dados: JPA (EclipseLink)
* Banco de Dados: MySQL
* Serialização JSON: Gson
* Gerenciamento de Dependências: Maven

---

## Funcionalidades Principais

### 1. Cadastro de Veículos

* Inclusão de novos veículos na base de dados.
* Armazenamento das principais informações cadastrais.
* Geração automática do identificador do registro.

### 2. Consulta de Veículos

* Listagem completa dos veículos cadastrados.
* Retorno dos dados em formato JSON.
* Disponibilização das informações para consumo por aplicações externas.

### 3. Atualização de Registros

* Alteração das informações de veículos existentes.
* Atualização de dados cadastrais e operacionais.

### 4. Exclusão de Veículos

* Remoção permanente de registros da base de dados.
* Exclusão através do identificador único do veículo.

### 5. Integração REST

A API disponibiliza endpoints HTTP para manipulação dos dados:

* GET:

  * Consulta todos os veículos cadastrados.

* POST:

  * Realiza o cadastro de novos veículos.

* PUT:

  * Atualiza informações de veículos existentes.

* DELETE:

  * Remove um veículo através de seu identificador.

### 6. Estrutura dos Dados dos Veículos

Cada veículo cadastrado possui os seguintes atributos:

* ID
* Placa
* Marca
* Modelo
* Ano de Fabricação
* Ano do Modelo
* Cor
* RENAVAM
* Chassi
* Quilometragem
* Próxima Troca de Óleo

### 7. Configuração do Banco de Dados

1. Criar uma base de dados MySQL.
2. Configurar os parâmetros de conexão na classe responsável pela criação do EntityManager.
3. Verificar o arquivo de configuração JPA localizado em: src/main/resources/META-INF/persistence.xml

---

## Pré-Requisitos para Execução do Projeto

* Java JDK 19 ou superior
* Apache Maven
* MySQL Server
* Apache NetBeans (opcional)
* (Desenvolvimento e testes realizados em plataforma Mac Silicon)

---

### Clonar o Repositório

git clone https://github.com/Alysson-afb/api-rest-java-gestao-frota.git