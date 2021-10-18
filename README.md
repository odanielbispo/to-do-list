# to-do-list
To Do List using Spring boot + Java

Heroku Application: https://desolate-atoll-01278.herokuapp.com/
<br>
API Documentation: https://desolate-atoll-01278.herokuapp.com/swagger-ui.html

How to use 
<br>
- Endpoint: https://desolate-atoll-01278.herokuapp.com/

Post: https://desolate-atoll-01278.herokuapp.com/api/v1/tasks

{
    "title":"Tarefa 1",
    "description":"Primeira tarefa",
    "deadline":"2021-10-20T09:45:55"
}

Get all: https://desolate-atoll-01278.herokuapp.com/api/v1/tasks

Get By ID: https://desolate-atoll-01278.herokuapp.com/api/v1/tasks/{task_id}

Put: https://desolate-atoll-01278.herokuapp.com/api/v1/tasks/{task_id}
{
    "title":"Tarefa 1" (updatable),
    "description":"Primeira tarefa" (updatable),
    "deadline":"2021-10-20T09:45:55 (updatable)"
}

Delete: https://desolate-atoll-01278.herokuapp.com/api/v1/tasks/{task_id}

