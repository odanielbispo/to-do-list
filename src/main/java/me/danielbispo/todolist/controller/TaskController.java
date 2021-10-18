package me.danielbispo.todolist.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.danielbispo.todolist.model.Task;
import me.danielbispo.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Slf4j
public class TaskController {

    TaskService taskService;

    @ApiOperation(value = "Criando uma nova tarefa")
    @ApiResponses( value = {
            @ApiResponse(code = 201, message = "Tarefa foi criada com sucesso"),
            @ApiResponse(code = 500, message = "Houve um erro ao criar a tarefa. Verifique as informações")
    } )
    @PostMapping("/tasks")
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task){
        log.info("Criando uma nova tarefa com as informacoes [{}]", task);
        return taskService.createTask(task);
    }


    @ApiOperation(value = "Listando todas as tarefas")
    @ApiResponses( value = {
            @ApiResponse(code = 200, message = "Tarefas listadas com sucesso"),
            @ApiResponse(code = 500, message = "Houve um erro ao listar as tarefas.")
    } )
    @GetMapping("/tasks")
    @ResponseStatus(HttpStatus.OK)
    public List<Task> getAllTasks() {
        log.info("Listando todas as tarefas cadastradas");
        return taskService.listAllTasks();
    }


    @ApiOperation(value = "Buscando uma tarefa pelo ID")
    @ApiResponses( value = {
            @ApiResponse(code = 200, message = "Tarefa encontrada com sucesso"),
            @ApiResponse(code = 404, message = "Não foi encontrado nenhuma tarefa com esse ID.")
    } )
    @GetMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Task> getTaskById(@PathVariable(value = "id") Long id) {
        log.info("Buscando uma tarefa por ID [{}]", id);
        return taskService.findTaskById(id);
    }


    @ApiOperation(value = "Atualizando tarefa")
    @ApiResponses( value = {
            @ApiResponse(code = 200, message = "Tarefa atualizada com sucesso"),
            @ApiResponse(code = 404, message = "Não foi possível atualizar a tarefa - arefa nao encontrada")
    } )
    @PutMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Task> updateTaskById(@PathVariable(value = "id") Long id, @RequestBody Task task) {
        log.info("Atualizando a tarefa com ID [{}] as novas informações são: [{}]", id, task);
        return taskService.updateTaskById(task, id);
    }


    @ApiOperation(value = "Excluindo uma tarefa")
    @ApiResponses( value = {
            @ApiResponse(code = 204, message = "Tarefa excluinda com sucesso"),
            @ApiResponse(code = 404, message = "Houve um erro ao excluir a tarefa - tarefa não encontrada")
    } )
    @DeleteMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Object> deleteTaskById(@PathVariable(value = "id") Long id) {
        log.info("Excluindo uma tarefa com ID [{}]", id);
        return taskService.deleteTaskById(id);
    }


}
