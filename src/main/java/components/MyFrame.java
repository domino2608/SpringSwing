package components;

import model.ToDoTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

/**
 * @author Dominik C.
 */
@Component
public class MyFrame extends JFrame {

//    @Autowired
    private JTextArea textArea;

    @Autowired
    private JList<ToDoTask> taskList;

    @Autowired
    private JButton addTaskButton;

    @PostConstruct
    public void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(taskList);
        add(addTaskButton, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }

}
