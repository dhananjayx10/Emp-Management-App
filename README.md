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
