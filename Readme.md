# <h1 align = "center"> 👤 Employee Adress  1-1 Mapping 👤 </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.1.3-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

---

<p align="left">

<!-- Project Description -->
## Overview 🪟
<p align="center">This project, named "Employee Address," is a robust Spring Boot application designed for managing user data efficiently. It provides a set of API endpoints that allows you to manage User and Address 1-1 mapping to perform CRUD operations, and apply the specified validations. The application will use MySQL as the database for simplicity and we have use validation as well.
</p>

<!-- Table of Contents -->
## Table of Contents📑
1. [Technologies Used](#technologies-used)
2. [Models Key Feautures](#models-key-features🔑)
3. [Usage](#usage)
4. [Controller](#controller🎮)
5. [Endpoint API reference](#endpoint-api-reference)
6. [Acknowledgments](#acknowledgments)
7. [Contact](#contact)

<!-- Technologies Used -->
## Technologies Used🧑‍💻
- Java 21
- Spring Boot
- Spring Web Initializer
- Maven 
- Spring Web Dependency  { Spring web, Lombok, Validation, MySQL Databse, Spring JPA, Swagger, Hibernate}
- MySQL


<!-- Model --->

## Models Key Features🔑
### 1 -> Employee Model
    Attribute's
       -> id (Long)
       -> first name (String)
       -> lastName (String)
       -> address (Address)
 

### 2 -> Address Model
    Attributes's
       ->  id (Long)
       -> street (String)
       -> City (String)
       -> state (String)
       -> Zipcode (String)



<!-- Usage -->
## Usage
- Access the application at `http://localhost:8080`.
- Use the provided API endpoints to manage your User Management.

### Controller🎮:
- It consists of a class named APIController which basically controls the flow of data.
- @RestController annotation is used to make the APIController as a controller layer.
- We perform the CRUD operations such as @PostMapping , @GetMapping , @PutMapping , @DeleteMapping.

### Endpoint API Reference :

  ##### EmployeeController:

      -> GET /employees - get all employees
      -> GET /employees/{id} - get an employee by id
      -> POST /employees - create a new employee
      -> PUT /employees/{id} - update an employee by id
      -> DELETE /employees/{id} - delete an employee by id

   ##### AddressController:
    
    -> GET /addresses - get all addresses
    -> GET /addresses/{id} - get an address by id
    -> POST /addresses - create a new address
    -> PUT /addresses/{id} - update an address by id
    -> DELETE /addresses/{id} - delete an address by id

 <!-- Acknowledgments -->
## Acknowledgments
- Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

<!-- Contact -->
## Contact📲
For questions or feedback, please contact : Avadhesh Shukla👍
- Maild Id 📧: avadheshsukla1636@gmail.com

<h1 align="center">Thank You💖...<h1>
<h3 align = "center"> ***********************************************************<h3>




 
