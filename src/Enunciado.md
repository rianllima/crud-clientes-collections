## Implementação de CRUD de Clientes Usando Collections em Java

### Objetivo:

Desenvolver uma aplicação em Java que implemente um CRUD (Create, Read, Update, Delete) de clientes
utilizando as coleções (Collections) da linguagem, especificamente o ArrayList para armazenamento e
gerenciamento dos clientes. O objetivo é praticar a manipulação de dados com coleções e a
implementação de funcionalidades básicas de um sistema CRUD.

### Descrição do Exercício:

O sistema deve permitir o gerenciamento de clientes, oferecendo as seguintes funcionalidades:

1. **Cadastro de Clientes (Create)**:
   * O cliente deve ter os seguintes atributos: ID (chave única); nome; e-mail; e Telefone.
   * Implementar a funcionalidade de adicionar um novo cliente ao sistema.
   
2. **Listagem de Clientes (Read)**:
   * Permitir a listagem de todos os clientes cadastrados, exibindo suas informações.
3. **Atualização de Dados de Clientes (Update)**:
   * Permitir a atualização das informações de um cliente, dado o seu ID.
   
4. **Remoção de Clientes (Delete)**:
   * Implementar a funcionalidade de remover um cliente do sistema com base no ID.
   
5. **Busca de Clientes**:
   * Permitir buscar um cliente específico pelo ID e exibir seus detalhes.

### Requisitos Técnicos:
   * Uso de Collections: utilizar um ArrayList<Cliente> para armazenar os clientes. A busca por clientes será
   feita com base no ID, utilizando loops para encontrar o cliente correspondente.
   * Classe Cliente: criar uma classe Cliente com os atributos mencionados e métodos de acesso (getters e
   setters).
   * Classe Principal: implementar um menu no console que permita ao usuário escolher as operações
   (Cadastrar, Listar, Atualizar, Remover, Buscar).

### Entrega de Relatório contendo:
   * Capturas de tela da execução do sistema no console.
   * Código fonte completo e funcional, implementando todas as funcionalidades descritas.

### Critérios de Avaliação:
   * Correção e completude das funcionalidades implementadas.
   * Uso adequado de coleções em Java.
   * Clareza e organização do código.
   * Interação clara e funcional com o usuário via console.