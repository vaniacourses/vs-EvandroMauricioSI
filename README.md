[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/40wwL-ds)

# Verificação Suplementar – Qualidade e Teste

Você acabou de ser contratado na função de QA e Tester em uma startup bancária. A empresa está desenvolvendo o aplicativo BIC: Banco do Instituto de Computação e solicitou que você estudasse o que já foi produzido e inicie a implantação do processo de Qualidade e Teste dessa startup. Todo o código produzido até agora está disponível no repositório: https://github.com/Asunnya/bic-poo

---

### 1. Defina um processo de desenvolvimento e de teste para esse produto no contexto da startup. (1 ponto)

REQUISITOS:

Todas as funcionalidades da aplicação descritas nos requisitos funcionais precisam ser testadas.


- Requisitos Funcionais
    - RF01 - O usuário pode se cadastrar 
    - RF02 - O usuário pode acessar a conta
    - RF03 - O usuário pode verificar o saldo
    - RF04 - O usuário pode vizualizar o estrato
    - RF05 - O usuário pode realizar transferências
    - RF06 - O usuário pode realizar pagamentos
    - RF07 - O usuário pode realizar investimentos
    - RF08 - O sistema deve ser compatível com o sistema de pagamento PIX
    - RF09 - O sistema pode fornecer notificações sobre transações, alertas de segurança e outros eventos relevantes.




OBJETIVOS DE QUALIDADE:

Os objetivos do teste são verificar as funcionalidades da aplicação BIC, o projeto deve se concentrar em testar as operações disponíveis das entidades, em conformidade com os requisitos funcionais, para garantir que todas possam funcionar normalmente em um ambiente real de produção.



FASES DE TESTE:
- Teste de unidade
- Teste de integração
- Teste de Sistema




--- 

### 2. Defina planos, procedimentos, métricas e padrões para controlar e monitorar o processo e o produto (2 pontos)

- PLANOS
    - Plano de Qualidade
    - Plano de Teste


- PROCEDIMENTOS
    - Procedimento de Teste
    - Procedimento de Resolução de Problemas


- MÉTRICAS
    - Métricas de Qualidade
    - Métricas de Testes


- PADRÕES
    - Padrões de Qualidade
    - Padrões de Teste

---

### 3. Avalie os produtos/artefatos do BIC, seguindo os padrões definidos por você nos itens anteriores. (2 pontos) 

Serão considerados os seguintes critérios de correção:
1. Maturidade do processo definido por você (1 ponto)
1. Qualidade e completude dos planos, procedimentos, métricas e padrões (2 pontos)
1. Qualidade e completude do relatório das avaliações (2 pontos) 

---

### 4. Teste de Funcional (1 ponto)
Leia o tópico “Funcionalidades do BIC para o Cliente” no repositório e gere requisitos de teste baseado nos critérios de teste funcional Análise do Valor Limite e Particionamento em Classes de Equivalência, considerando as funcionalidades referentes à Clientes, Cartão e Contas.

Clientes
- Tipos de Clientes
- Tipos de Contas
- Tipos de cartões
    - Testar se o aplicativo permite que os usuários solicitem diferentes tipos de cartões, dependendo da renda do cliente.
- Rendimento
    - Testar se o aplicativo calcula os rendimentos corretos para cada tipo de conta.
    - Testar se o aplicativo credita os rendimentos corretos nas contas dos usuários. 

Cartão
- Criação de cartões virtuais
- Agendamento de transações
- Pagamento por débito automático

Contas
- Rendimentos


Testes de carga
- Testar se o aplicativo pode lidar com um grande número de usuários simultâneos.
- Testar se o aplicativo permanece estável sob carga


Testes de desempenho
- Testar o tempo de resposta do aplicativo para diferentes tipos de solicitações.
- Testar o uso de recursos do aplicativo.


Testes de segurança
- Testar se o aplicativo é vulnerável a ataques de segurança.
- Testar se o aplicativo implementa as melhores práticas de segurança.

Testes de usabilidade
- Testar se o aplicativo é fácil de usar.
- Testar se o aplicativo é intuitivo e fácil de navegar.


Testes de aceitação do usuário


---

### 5. Teste Estrutural (2 pontos)
Crie casos de teste para obter ao menos 80% de cobertura para o critério todas-arestas do teste estrutural para todas as classes dos pacotes cliente, cartao e conta. Considere que a menor unidade é a classe e mocke as dependências quando necessário. Envie o print da cobertura obtida em seu relatório.

- cliente
    - Cliente.java
    - ClienteEmpresa.java
    - ClientePessoa.java
    - Endereco.java

- cartao
    - Cartao.java
    - CartaoDiamond.java
    - CartaoPremium.java
    - CartaoStandard.java
    - Fatura.java


- conta
    - Conta.java
    - ContaDiamond.java
    - ContaPremium.java
    - ContaStandard.java
    - GerenciamentoCartao.java
    - Historico.java
    - Rentavel.java

---

### 6. Testes de mutação (2 pontos)
Avalie a qualidade do seu conjunto de casos de teste para as classes dos pacotes cliente e conta considerando o teste de mutação. Crie casos de teste que matem parte dos mutantes gerados. Calcule o novo score de mutação. Escreva essas informações em seu relatório.




