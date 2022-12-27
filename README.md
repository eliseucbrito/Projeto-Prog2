# Projeto de conclusão da disciplina de Programação 2

Professor: Ricardo de Andrade Araújo.

Equipe: Eliseu Brito, Álysson Michel e Vinicius Pereira.

Reescrita do código: Eliseu Brito.

*Projeto re-organizado para demonstração as próximas turmas de Programação do IFSPE - Ouricuri*

### Funcionalidades

- [x] Cadastrar Professor / Chave / Reserva
- [x] Consultar Professor / Chave / Reserva
- [x] Alterar Professor / Chave / Reserva
- [x] Remover Professor / Chave / Reserva
- [x] Listar Professor / Chave / Reserva

### Features

- [x] Listas em tabelas
- [x] GUI colorida
  
### Melhorias

- [ ] Conexão com uma DataBase
- [ ] Geração de ID automatico

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

- instalou uma IDE para execução do código
  - Recomendação *Intellij / NetBeans / VScode*  
  - Instale também o GIT
- Você instalou a SDK 17 do Java
- Leia o guia do programa
  
## 🚀 Instalando o programa

**Escolha uma das opções**

#### Baixar o arquivo como ZIP

- Clique em ***<> Code***
- Clique em ***Download ZIP***
- Extraia o arquivo na sua maquina
- Abra a pasta extraída na sua IDE
- Acesse a pasta */src/gui/app*
- Execute o programa
  
#### Clonanando o repositório

#### Intellij
- Se tiver usando o Intellij, crie um novo projeto
- Clique em GIT > CLONE
- Coloque o endereço HTTP do projeto no espaço para URl

#### VScode
- Acesse a pasta que será usada para o projeto
- Abra o terminal incluso no VScode (certifique de estar na pasta que será usada)
- Troque a opção de terminal para o Git Bash
- Efetua o login na sua conta do github
- digite ```git clone https://github.com/eliseubrito7z/Projeto-Prog2.git```

***Uma dessas opções será util em outras IDE's***

## ☕ Entendendo o projeto

#### Arquitetura
*Existem diversos padrões de projeto, como MVC, MVVM, Layered Architecture, etc...*
- O Padrão usado nesse projeto é o Layered Architecture ou Desenvolvimento de camadas

###### Camadas do projeto

- **DATA:** Onde é criada as classes utilizadas 
- **PERSISTENCE:** Camada que recupera os dados das classes e define seus novos valores
- **EXCEPTIONS:** Nossas exceptions personalizadas
- **BUSSINESS:** Regras de negócio
- **PRESENTATION:** Interface gráfica para o usuário (GUI)
