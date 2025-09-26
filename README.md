Inventory Management System API (Backend Challenge) ⚙️
This project is a robust, backend-heavy API designed to track and manage product inventory in a warehouse. It fulfills all the core requirements of the Associate Software Engineer (ASE) Backend Challenge (Inventory Management System API).

The system ensures data integrity by enforcing stock level constraints and provides a dedicated endpoint for monitoring low-stock items.

🚀 How to Run the Project Locally
Follow these steps to set up and run the Spring Boot API on your local machine.

Prerequisites
Java 21+ (or the version specified in your pom.xml)

Maven

MySQL Database: A running instance of a MySQL server.

Setup Steps
Clone the Repository:

Bash

git clone https://github.com/Nayan76/Inventory-API.git
cd Inventory-API
Configure the Database:

Open the file src/main/resources/application.properties.

Crucially, update the following properties with your local MySQL credentials:

Properties

# Replace 'your_database_name' with your actual database name
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
# Replace 'your_username' and 'your_password' with your credentials
spring.datasource.username=your_username
spring.datasource.password=your_password
Build the Project:

Bash

mvn clean install
Run the Application:

Bash

mvn spring-boot:run
The API will start on http://localhost:8080.

🧪 How to Run Test Cases
The project includes Unit Tests to validate the core inventory business logic, especially around stock manipulation and error handling.

Ensure you are in the root directory of the project.

Execute the Maven test command:

Bash

mvn test
This command will run all tests located in src/test/java, validating functions like decreaseStock (including the insufficient stock error) and getLowStockProducts.

I'd be happy to help you draft the required content for your README.md file! A great README is essential for the ASE challenge—it's the first thing the reviewer will look at.

Since the instructions require a specific structure, here is a template that fulfills all the submission requirements for your Inventory Management System API.

Inventory Management System API (Backend Challenge) ⚙️
This project is a robust, backend-heavy API designed to track and manage product inventory in a warehouse. It fulfills all the core requirements of the Associate Software Engineer (ASE) Backend Challenge (Inventory Management System API).

The system ensures data integrity by enforcing stock level constraints and provides a dedicated endpoint for monitoring low-stock items.

🚀 How to Run the Project Locally
Follow these steps to set up and run the Spring Boot API on your local machine.

Prerequisites
Java 17+ (or the version specified in your pom.xml)

Maven

MySQL Database: A running instance of a MySQL server.

Setup Steps
Clone the Repository:

Bash

git clone https://github.com/Nayan76/Inventory-API.git
cd Inventory-API
Configure the Database:

Open the file src/main/resources/application.properties.

Crucially, update the following properties with your local MySQL credentials:

Properties

# Replace 'your_database_name' with your actual database name
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
# Replace 'your_username' and 'your_password' with your credentials
spring.datasource.username=your_username
spring.datasource.password=your_password
Build the Project:

Bash

mvn clean install
Run the Application:

Bash

mvn spring-boot:run
The API will start on http://localhost:8080.

🧪 How to Run Test Cases
The project includes Unit Tests to validate the core inventory business logic, especially around stock manipulation and error handling.

Ensure you are in the root directory of the project.

Execute the Maven test command:

Bash

mvn test
This command will run all tests located in src/test/java, validating functions like decreaseStock (including the insufficient stock error) and getLowStockProducts.

🛠️ Design Choices & Assumptions
Feature	                                                     Design Choice	                                                                                              Rationale
Persistence	                                         Spring Data JPA with MySQL	                                                                         To meet the "backend-heavy API" goal and ensure data persistence across application restarts.

Primary Key	                                      UUID (Universally Unique Identifier)	                                                  Provides unique, non-guessable IDs, improving data security and distributed scalability over simple auto-incrementing integers.

Error Handling	                                   ResponseStatusException (HTTP 400)	                                                     Provides clear HTTP status codes (400 Bad Request) directly from the service layer for invalid operations (e.g., insufficient                                                                                                                                                  stock), making the API robust and easy to integrate with.

Bonus Feature	                         Implemented lowStockThreshold field and a GET /api/products/low-stock endpoint.	                               Fulfills the bonus requirement for inventory monitoring.



Core API Endpoints
The API is accessible at the base path /api/products. All endpoints utilize UUID for product identification.

Method	                              Endpoint	                                  Description
POST	                            /api/products	                              Create: Adds a new product to the inventory.

GET	                             /api/products/{id}	                           Read: Retrieves a specific product.

PUT	                            /api/products/{id}	                           Update: Modifies all details of a product.

DELETE	                       /api/products/{id}	                             Delete: Removes a product from the inventory.

PUT	                           /api/products/{id}/stock/add	                   Increase Stock: Adds a quantity to the product's stock.

PUT	                          /api/products/{id}/stock/remove	                Decrease Stock: Removes a quantity, returning 400 Bad Request if insufficient stock.

GET	                          /api/products/low-stock	                        Bonus: Lists all products where stockQuantity < lowStockThreshold.
