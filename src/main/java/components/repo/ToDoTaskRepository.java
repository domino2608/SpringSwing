package components.repo;

import model.ToDoTask;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dominik C.
 */
@Repository
public class ToDoTaskRepository {

    private List<ToDoTask> taskList = new ArrayList<>();

    {
        taskList.add(new ToDoTask("Task 1"));
        taskList.add(new ToDoTask("Task 2"));
        taskList.add(new ToDoTask("Task 3"));
        taskList.add(new ToDoTask("Task 4"));
        taskList.add(new ToDoTask("Task 5"));
        taskList.add(new ToDoTask("Task 6"));
        taskList.add(new ToDoTask("Task 7"));
    }

    public List<ToDoTask> getAll() {
        return taskList;
    }

}
