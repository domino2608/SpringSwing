package model;

/**
 * @author Dominik C.
 */
public class ToDoTask {

    private String description;

    public ToDoTask(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ToDoTask{" +
                "description='" + description + '\'' +
                '}';
    }
}
