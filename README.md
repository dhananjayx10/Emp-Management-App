![image alt](https://github.com/dhananjayx10/Emp-Management-App/blob/9fe1bd9f84aa809c52af0ef23a08f4c21e93da68/ClassEntities.png)
![image alt](https://github.com/dhananjayx10/Emp-Management-App/blob/2264240bd047184ce7c78bc70dbe49e5a50e1f26/H2database.png)
Explanation
Controller (EmployeeController.java):
Located in the controller package and handles HTTP requests.

DTO (EmployeeDTO.java):
Placed in the dto package, this Data Transfer Object can be used to define the data structure for incoming/outgoing employee data, helping to keep the API separate from the internal Employee entity structure.

Exception Handling:
Custom Exception (ResourceNotFoundException.java): Located in the exception package to handle cases when an employee is not found.
Global Exception Handler (GlobalExceptionHandler.java): Also in the exception package, this handler catches various exceptions and sends a structured error response to the client.

Model (Employee.java):
Located in the model package, this is the entity that represents the data structure in the database.

Repository (EmployeeRepository.java):
Located in the repository package, this interface provides CRUD operations via Spring Data JPA.

Service (EmployeeService.java and EmployeeFileReader.java):
In the service package, these classes contain business logic, such as reading files, managing employee data, and interacting with the repository.



Example Usage in API:
http://localhost:8080/api/employees
__________________________________
Creating an Employee:
POST /api/employees
Content-Type: application/json

{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
}
_________________________________
Updating an Employee:
PUT /api/employees/1
Content-Type: application/json
{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
}
__________________________________
Getting an Employee by ID:
GET /api/employees/1
__________________________________
Deleting an Employee:
DELETE /api/employees/1
__________________________________
