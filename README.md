
# User Management REST API

## Project Overiew

This project is a RESTful API for managing users, developed using Spring Boot and PostgreSQL. The API provides functionality for creating, retrieving, updating, and deleting user records.




## API Reference

#### Endpoints


| HTTP Method | Endpoint     | Description                   |
| :-------- | :------- | :--------------------------------   |
| `POST`     | `/users`      | Create a new user             |
| `GET`      | `/users`      | Retrieve a list of all users  |
| `GET`      | `/users/{id}` | Retrieve a user by ID         |
| `PUT`      | `/users/{id}` | Update a user by ID           |
| `DELETE`   | `/users/{id}` | Delete a user by ID           |








## Technologies Used

- Spring Boot for building the REST API.
- PostgreSQL as the database.


## Requirements
To run the project locally, ensure you have the following installed:

- Java 17+
- Maven


## Setup Instructions

**1. Clone the repository**

```
  git clone https://github.com/akregmi/thinkon_api.git
  cd thinkon_api
```

**2. (Optional) Import the Project:**

Using IntelliJ IDEA:
- Open IntelliJ IDEA.
- Select File > New > Project from Existing Sources...
- Navigate to the cloned repository and select it.
- Coose Maven and click Next.
- Follow the prompts to finish importing the project.

Using Eclipse:

- Open Eclipse.
- Select File > Import...
- Choose Existing Maven Projects under the Maven category.
- Navigate to the cloned repository and select it.
- Click Finish to import the project.
- Using Visual Studio Code:

Open Visual Studio Code.
- Open the cloned repository folder using File > Open Folder...
- Install the Java Extension Pack and Maven for Java extensions if prompted.
- You can then use the integrated terminal to run Maven commands.


**3. Database Setup:**
- Ensure PostgreSQL is up and running
- Create a database:

    ```
    CREATE DATABASE database_name;
    ```
- Update application.properties with your PostgreSQL credentials:
    ```
    spring.datasource.url=jdbc:postgresql://localhost:5432/user_management
    spring.datasource.username=yourusername
    spring.datasource.password=yourpassword
    ```
**4. Run the application**
- Use Maven to run the application
    ```
    mvn spring-boot:run
    ```
- If imported, you can also run the application through your IDE
## Example API Requests

**1. Create New User:** ```POST /users```
```
    {
        "username": "testuser",
        "firstName": "Test",
        "lastName": "User",
        "email": "testuser@gmail.com",
        "phoneNumber": "111-111-1111"
    }
```

**2. Get All Users:** ```GET /users```

**3. Get User With ID 1:** ```GET /users/1```

**4. Update User with ID 1:** ```PUT /users/1```
```
    {
        "username": "UpdatedUsername",
        "firstName": "Updated",
        "lastName": "User",
        "email": "updatedemail@gmail.com",
        "phoneNumber": "555-555-5555"
    }
```

**5. Delete User With User 1:** ```DELETE /users/1```
