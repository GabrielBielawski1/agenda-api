# 📇 Agenda API

Uma API RESTful para gerenciamento de contatos (agenda pessoal), desenvolvida com Java e Spring Boot. Este projeto foi criado com o objetivo de praticar os fundamentos de back-end com Spring, JPA e banco de dados H2 em memória.

---

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.4.4
- Spring Data JPA
- H2 Database (em memória)
- Maven
- Lombok

---

## ⚙️ Funcionalidades

- ✅ Criar um novo contato
- ✅ Listar todos os contatos
- ✅ Buscar contato por ID
- ✅ Atualizar um contato existente
- ✅ Deletar um contato

---

## 📦 Estrutura do Projeto

```bash
src/
└── main/
    └── java/
        └── com.gabrielbielawski.agendaapi/
            ├── controller/
            ├── service/
            ├── repository/
            ├── entity/
            └── dto/
```

---

## 📌 Endpoints da API

| Método | Endpoint                 | Descrição                      |
|--------|--------------------------|--------------------------------|
| GET    | /api/contacts            | Lista todos os contatos        |
| GET    | /api/contacts/{id}       | Busca um contato por ID        |
| POST   | /api/contacts            | Cria um novo contato           |
| PUT    | /api/contacts/{id}       | Atualiza um contato existente  |
| DELETE | /api/contacts/{id}       | Deleta um contato              |

---

## ▶️ Como executar o projeto

### 1. Clone o repositório
```bash
git clone https://github.com/GabrielBielawski1/agenda-api.git
cd agenda-api
```

### 2. Execute com Maven
```bash
mvn spring-boot:run
```

### 3. Acesse a API
- Base URL: `http://localhost:8080/api/contacts`

---

## 🧪 Banco de dados H2

Acesse o console em:

```
http://localhost:8080/h2-console
```

- JDBC URL: `jdbc:h2:mem:agenda`
- Usuário: `sa`
- Senha: (em branco)

---

## 👤 Autor

**Gabriel Bielawski**  
Estudante de Ciência da Computação, desenvolvedor backend em formação.  
[🔗 LinkedIn](https://www.linkedin.com/in/gabrielbielawski)  
[🐙 GitHub](https://github.com/GabrielBielawski1)

---

## 📝 Licença

Este projeto está sob a licença MIT.
