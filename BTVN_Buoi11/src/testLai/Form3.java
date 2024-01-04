package testLai;

import b11.CustomMouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form3 {
    JFrame jFrame = new JFrame("Test lại");

    public Form3() {
        this.jFrame = jFrame;
    }

    public void initConFig(){
        jFrame.setSize(300,400);
        jFrame.setLocation(50,50);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.addWindowListener(new CustomWin3());

        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");

        b1.addMouseListener(new CustomMouse3(b1, Color.YELLOW));
        b2.addMouseListener(new CustomMouse3(b2, Color.RED));
        b3.addMouseListener(new CustomMouse3(b3, Color.BLUE));
        b4.addMouseListener(new CustomMouse3(b4, Color.GREEN));

        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Bạn đã click vào button 1");
            }
        });
        b2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Bạn đã click vào button 2");
            }
        });
        b3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Bạn đã click vào button 3");
            }
        });
        b4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Bạn đã click vào button 4");
            }
        });
        JPanel  jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        jPanel.add(b1, BorderLayout.NORTH);
        jPanel.add(b2, BorderLayout.EAST);
        jPanel.add(b3, BorderLayout.WEST);
        jPanel.add(b4, BorderLayout.SOUTH);

        jFrame.add(jPanel);




    }
    public void run(){
        jFrame.setVisible(true);
    }
}
