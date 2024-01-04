package testLai;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomMouse3 implements MouseListener {
    private JButton button;
    private Color newColor;

    public CustomMouse3(JButton button, Color newColor) {
        this.button = button;
        this.newColor = newColor;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        button.setBackground(newColor);
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
