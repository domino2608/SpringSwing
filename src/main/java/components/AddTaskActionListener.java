package components;

import model.ToDoTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Dominik C.
 */
@Component
public class AddTaskActionListener implements ActionListener {

    @Autowired
    private JList<ToDoTask> taskList;

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = JOptionPane.showInputDialog(taskList, "Enter description");
        ToDoTask task = new ToDoTask(input);

        DefaultListModel<ToDoTask> listModel = (DefaultListModel<ToDoTask>) taskList.getModel();

        listModel.addElement(task);
    }
}
