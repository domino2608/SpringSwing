package components;

import model.ToDoTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Dominik C.
 */
@Component
public class JListClickListener extends MouseAdapter {

    private JList<ToDoTask> taskList;

    public JListClickListener(JList<ToDoTask> taskList) {
        this.taskList = taskList;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int clickCount = e.getClickCount();

        if (clickCount == 2) {
            DefaultListModel listModel = (DefaultListModel) taskList.getModel();

            listModel.removeElement(taskList.getSelectedValue());
        }
    }
}
