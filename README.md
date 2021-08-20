# Aplicação Park H / Back-end 
Documentação back-end da aplicação Park H.<br/> 

**Aviso:** O projeto foi desenvolvido para fins de estudos acadêmicos, por isso não recomendamos aplicar essa arquitetura na sua empresa sem avaliar se os conceitos se aplicam para resolver às demandas de sua empresa.
<br/>

## Introdução
Os projetos neste repositório são microsserviços programados na **linguagem Java** com arquitetura **API RestFull** sobre o tema de aplicativo para divulgação de aluguel de garagem, onde os serviços vão desde a criação de conta do usuário até o anuncio do aluguel da garagem junto do preço.

### Tecnologias e ferramentas utilizadas

- **IDE:** Eclipse. **Obs.:** Recomendamos escolher a opção de instalar o package **Eclipse IDE for Enterprise Java and Web Developers** durante o download do Eclipse IDE;
- **Apache Maven:** 
  - Maven compiler plugin;  
  - Maven buid;
  - Maven clean; 
  - Maven starter test;
- **Apache Commons:**
  - Commons Collections 4;
- **Amazon Web Service Tecnologies:**
  - AWS SDK;
  - AWS DynamoDB;
  - AWS CLI;
  - Amazon Elastic Container Registry (Amazon ECR);
  - Amazon Elastic Container Service (Amazon ECS); 
- **Spring Boot Framework:** 
  - Spring Boot Maven plugin;
  - Spring data DynamoDB;
  - Spring starter;
  - Spring starter parent;
  - Spring starter test;
  - Spring starter web;
  - Spring dev tools;
- **Swagger:** 
  - Swagger2 ui;
- **JUnit:**
  - JUnit test 4;
- **Docker:** utilizado para fazer os containers dos microsserviços.
- **Postman:** utilizado para realizar os testes dos serviços RestFULL de forma programada e automatizada.

### Arquitetura do projeto<br/>
O back-end dos microsserviços foram feitos em projeto **Maven Java**, com dependências das tecnologias da **AWS, SpringBoot Framework e Junit**. As libary's dessas tecnologias que foram utilizadas no código do back-end foi o banco de dados NoSQL da Amazon que é o **AWS DynamoDB**, o **Spring boot framework** foi usado as library's de serviço **Rest** e **Controller**, e o **JUnit4** foi usado para fazer os testes automatizados na IDE Eclipse. <br/>

<p align="center">
  <img alt="Fluxograma da arquitetura do projeto" src=".github/Arquitetura dos microsserviços.png" width="799px" height="343">
</p>

Fora do back-end, indo direto para o lado do cliente, foi utilizado a interface do **SwaggerUi (Swagger lib)** para visualizar os dados em **formato JSON** e interagir com os **protocolos Rest**, nesse caso foi também usado a ferramenta **Postman** para fazer os testes de requisição de forma automatizada. <br/>
