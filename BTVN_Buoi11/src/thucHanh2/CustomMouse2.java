package thucHanh2;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomMouse2 implements MouseListener {
    private JButton button;
    private JPanel currentPanel;
    private JPanel nextPanel;

    public CustomMouse2(JButton button, JPanel currentPanel, JPanel nextPanel) {
        this.button = button;
        this.currentPanel = currentPanel;
        this.nextPanel = nextPanel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        currentPanel.setVisible(false);
        nextPanel.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
