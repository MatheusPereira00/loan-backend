# Sistema de empréstimo financeiro

API RESTful para simulação de empréstimo financeiro com ( Spring boot + Java 21 )

---

### Enviar solicitção

`POST` /customer-loans

**Campos da Requisição**

| campo | tipo | obrigatório
|:-----:|:----:|:----------- |
| age | Integer | sim
| cpf | String | sim
| name | String | sim
| income | Double | sim
| location | String | sim

---

**Exemplo de corpo de requisição**

```json
{
    "age": 21,
    "cpf": 51691889865,
    "name": "Matheus",
    "income": 1000.00,
    "location": "SP"
}
```

---

**Respostas**

| código | descrição
| - | -
| 200 | a solicitação foi feita com sucesso
| 400 | campos inválidos

---

**Ideias para novas implementações**

- Validação de CPF e Dados Pessoais: Implementar validação para garantir que o CPF é válido e não pertence a uma lista negra de CPFs conhecidos por fraudes.
  
- Histórico de Empréstimos: Manter um histórico dos empréstimos solicitados e aprovados para cada cliente.
  
- Cálculo de Juros e Parcelamento: Adicionar funcionalidade para calcular juros sobre o valor do empréstimo e permitir simulações de diferentes planos de parcelamento.

- Notificações e Comunicações: Enviar notificações por email ou SMS sobre o status da solicitação, pagamentos próximos e outras informações relevantes.

- Score de Crédito: Integrar com serviços de score de crédito para avaliar a solvência do cliente antes de aprovar o empréstimo.
  
---

## Como executar o projeto

1. Clone este repositório: `git clone https://github.com/MatheusPereira00/loan-emprestimo-backend.git`
2. Navegue até o diretório do projeto: `cd seu-projeto`
3. Execute o projeto usando o Maven: `mvn spring-boot:run`
4. Acesse a aplicação em [http://localhost:8087](http://localhost:8080)

Certifique-se de configurar corretamente as informações do banco de dados no arquivo `application.properties`.

---
