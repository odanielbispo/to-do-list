# to-do-list
To Do List using Spring boot + Java

Heroku Application: https://desolate-atoll-01278.herokuapp.com/
<br>
API Documentation: https://desolate-atoll-01278.herokuapp.com/swagger-ui.html

How to use 
<br>
- Endpoint: https://desolate-atoll-01278.herokuapp.com/

Post: https://desolate-atoll-01278.herokuapp.com/api/v1/tasks

{<br>
    "title":"Tarefa 1",<br>
    "description":"Primeira tarefa",<br>
    "deadline":"2021-10-20T09:45:55"<br>
}

Get all: https://desolate-atoll-01278.herokuapp.com/api/v1/tasks<br><br>

Get By ID: https://desolate-atoll-01278.herokuapp.com/api/v1/tasks/{task_id}<br><br>

Put: https://desolate-atoll-01278.herokuapp.com/api/v1/tasks/{task_id}<br>
{<br>
    "title":"Tarefa 1" (updatable),<br>
    "description":"Primeira tarefa" (updatable),<br>
    "deadline":"2021-10-20T09:45:55 (updatable)"<br>
}<br><br>

Delete: https://desolate-atoll-01278.herokuapp.com/api/v1/tasks/{task_id}

