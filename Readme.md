# Restaurant-API
This project is a simple implementation of a Restaurant API using Spring Boot and Jakarta Persistence. The API provides basic CRUD operations for managing restaurants and their menus.

## Endpoints
The following endpoints are available:
### Restaurants
- **GET /api/restaurants -** Retrieves all restaurants
- **GET /api/restaurants/{id} -** Retrieves a restaurant by ID
- **POST /api/restaurants -** Creates a new restaurant
- **PUT /api/restaurants/{id} -** Updates an existing restaurant
- **DELETE /api/restaurants/{id} -** Deletes a restaurant by ID

### Foods
- **GET /api/foods -** Retrieves all foods
- **GET /api/foods/{id} -** Retrieves a food by ID
- **POST /api/foods -** Creates a new food
- **PUT /api/foods/{id} -** Updates an existing food
- **DELETE /api/foods/{id} -** Deletes a food by ID

## Model
The project has two main entities:
### Restaurant
- id: Long
- name: String
- address: String
- menu: List<Food>

### Food
- id: Long
- name: String
- price: Double
- restaurant: Restaurant

## Technologies
The following technologies were used in this project:
- Spring Boot
- Jakarta Persistence
- Lombok
- Maven
- java
- Mysql  
  
## Project Summary
 This is a Java Spring Boot API for managing restaurants and their menus. The API includes endpoints for CRUD operations on restaurants and foods, as well as validation of input data. It also includes integration with a MySQL database for data persistence. 
