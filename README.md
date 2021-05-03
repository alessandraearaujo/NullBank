## Objetivo

Este projeto foi desenvolvido para a disciplina de Projeto e Implementação Orientado a Objetos e tem como objetivo criar um sistema que capaz de realizar operações CRUD e controle sessão de usuário para Web seguindo os padrões MVC II, Front Controller e Command. Trata-se de um sistema básico que permite:

*   Cadastro, edição, consulta e exclusão de clientes;

*   Cadastro de conta (empresa, trabalhador ou universitária), com associação de um cliente titular de conta.

O projeto completo está disponível no repositório do GitHub:

[https://github.com/alessandraearaujo/nullbank](https://github.com/alessandraearaujo/nullbank)

* * *

## Modelo do domínio

Para atender às exigências do trabalho, foi elaborado o modelo abaixo que busca atender de forma simplificada às exigências:

*   Associação entre classes: satisfeita através das classes `cliente` e `Conta Corrente`,em que uma conta corrente deve possuir uma pessoa;

*   Herança de 3 níveis: satisfeita através das classes `Conta Corrente,` `Conta Trabalhador` , `Conta Universitária` e `Conta Empresa`.

* * *
## Tecnologias implementadas

Para a construção dos sistema, foi utilizado para o back-end o framework Spring Boot devido à sua praticidade no processo de configuração e publicação de aplicação. Já no front-end, foi utilizado o framework Materialize.

O banco de dados utilizado foi o MYSQL e para a persistência de dados, foi utilizado o framework hibernate na classe `DataConfiguration`.

* * *

## Arquitetura do software

Para atender à exigência de padrão arquiteturaral MVC, as classes foram construídas em cima dos pacotes descritos abaixo:

*   Controllers: Contém as classes que controlam os modelo, responsáveis por enviar e receber as requisições do usuário.

*   Models: Possui as regras de negócio, sendo responsável pela leitura e escrita de dados.

*   Templates: Contém as views, onde o usuário pode interagir com o sistema e onde os controllers coletam e enviam dados.

A exigência de CRUD foi atendida através da implementação das interfaces de CRUD Resository.

* * *

## Telas


### Cadastro de cliente


### Consulta de cliente


### Cadastro de conta

