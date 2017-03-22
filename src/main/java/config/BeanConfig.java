package config;

import components.AddTaskActionListener;
import components.JListClickListener;
import model.ToDoTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import components.repo.ToDoTaskRepository;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

/**
 * @author Dominik C.
 */
@Configuration
@ComponentScan("components")
public class BeanConfig {

    @Autowired
    private ToDoTaskRepository taskRepository;

    @Bean
    public JList<ToDoTask> toDoList() {
        JList<ToDoTask> toDoList = new JList<>(new DefaultListModel<ToDoTask>());
        DefaultListModel<ToDoTask> listModel = new DefaultListModel<>();

        for (ToDoTask task : taskRepository.getAll()) {
            listModel.addElement(task);
        }
        toDoList.setModel(listModel);

        JListClickListener clickListener = new JListClickListener(toDoList);
        toDoList.addMouseListener(clickListener);

        return toDoList;
    }

    @Bean
    public JButton newTaskButton(AddTaskActionListener addTaskActionListener) {
        JButton jButton = new JButton("Add new task");
        jButton.addActionListener(addTaskActionListener);

        return jButton;
    }

}
