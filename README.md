# Projeto Java Web com Spring Boot

## 📌 Descrição
Este é um projeto backend desenvolvido com **Spring Boot**, utilizando **Spring Data JPA** e **PostgreSQL**.
O objetivo do projeto é fornecer uma API REST para gerenciamento de usuários.

---

## ⚙️ Tecnologias utilizadas
- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- BCrypt (PasswordEncoder)
- Postman (para testes)

---

## 🚀 Funcionalidades
- Criar usuário
- Buscar todos os usuários
- Buscar usuário por ID
- Atualizar dados do usuário
- Deletar usuário
- pedidos,pagamentos e etc
- Criptografia de senha com BCrypt

---

## 🛠️ Pré-requisitos
Antes de rodar o projeto, você precisa ter instalado:
- Java 21 ou superior
- Maven
- PostgreSQL
- Git

---
## ⚠️ Avisos Importantes

- Este projeto está **rodando apenas localmente**
- Ainda **não está em produção**
- Configurações podem mudar
- Uso apenas para fins de **estudo/portifolio**



## 🔐 Configuração de variáveis de ambiente

Para executar a aplicação localmente, configure as seguintes variáveis de ambiente para a conexão com o banco de dados:

* `DB_USERNAME` — usuário do PostgreSQL
* `DB_PASSWORD` — senha do PostgreSQL

Exemplo no Linux / Mac:

```bash
export DB_USERNAME=seu_usuario
export DB_PASSWORD=sua_senha
```

Exemplo no Windows (PowerShell):

```powershell
setx DB_USERNAME "seu_usuario"
setx DB_PASSWORD "sua_senha"
```

A aplicação utiliza essas variáveis no arquivo `application-dev.properties`:

```
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```


## ▶️ Como executar o projeto localmente




### 1️⃣ Clone o repositório
```bash
git clone https://github.com/jcdev01/Projeto-java-web-spring.git





