🚗 Smart Parking API

API REST para gerenciamento de um estacionamento inteligente, desenvolvida com Spring Boot.
O sistema controla entrada e saída de veículos, ocupação de vagas, cálculo de permanência e regras de negócio reais de um estacionamento.

O objetivo principal do projeto é praticar backend profissional, indo além de um simples CRUD.

📌 Sobre o Projeto

O Smart Parking API simula o funcionamento de um estacionamento onde:

Veículos entram e saem

As vagas são limitadas

Existe controle de vagas especiais

O tempo de permanência é calculado

O valor a pagar é gerado automaticamente

Existem clientes mensalistas

O sistema impede inconsistências (ex: carro sair sem ter entrado)

A aplicação segue boas práticas de arquitetura, separando camadas e utilizando DTOs para proteger o domínio.

⚙️ Tecnologias Utilizadas

Java 21+

Spring Boot

Spring Web

Spring Data JPA (Hibernate)

MySQL

Lombok

Bean Validation

Maven

🧱 Requisitos Funcionais

✔ Cadastrar veículos
✔ Registrar entrada de veículo
✔ Registrar saída de veículo
✔ Calcular valor da permanência
✔ Listar veículos estacionados
✔ Histórico de permanências
✔ Controle de vagas disponíveis
✔ Vagas especiais (ex: PCD)
✔ Clientes mensalistas não pagam por uso

🚧 Regras de Negócio

Não pode entrar veículo se não houver vaga disponível

Um veículo não pode estar estacionado duas vezes ao mesmo tempo

Veículo só pode sair se estiver com registro de entrada aberto

O preço é calculado com base no tempo de permanência

Tolerância de tempo inicial (ex: 15 minutos)

Vagas especiais só podem ser usadas por veículos autorizados

Mensalistas têm isenção de cobrança

🧠 O que está sendo praticado neste projeto

Este projeto foi pensado para treinar habilidades de backend em nível profissional:

🏗 Arquitetura

Separação de camadas (Controller, Service, Repository, Domain)

Uso de DTOs para entrada e saída de dados

Tratamento global de exceções

🗄 Persistência

Mapeamento objeto-relacional com JPA/Hibernate

Relacionamentos entre entidades

Transações

🌐 API REST

Boas práticas de endpoints

Uso correto de verbos HTTP

Códigos de status apropriados

🛡 Validação

Validação de dados com Bean Validation

Tratamento de erros de entrada

🧮 Lógica de Negócio

Controle de estado (entrada → saída)

Cálculo de tempo e valores

Regras condicionais reais

⚡ Conceitos Avançados (futuro)

Concorrência (última vaga disponível)

Relatórios financeiros

Documentação com Swagger

Testes unitários

Virtual Threads (Java moderno)