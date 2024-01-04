package b11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Buoi11 {
    JFrame jFrame = new JFrame("Thực hành");

    public Buoi11() {
        this.jFrame = jFrame;
    }
    public void initConfig(){
        jFrame.setSize(300,400);
        jFrame.setLocation(20,50);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.addWindowListener(new CustomWindowListener());

        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");

        b1.addMouseListener(new CustomMouseListener(b1, Color.RED));
        b2.addMouseListener(new CustomMouseListener(b2, Color.BLUE));
        b3.addMouseListener(new CustomMouseListener(b3, Color.GREEN));
        b4.addMouseListener(new CustomMouseListener(b4, Color.YELLOW));

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
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        jPanel.add(b1, BorderLayout.NORTH);
        jPanel.add(b2,BorderLayout.SOUTH);
        jPanel.add(b3,BorderLayout.WEST);
        jPanel.add(b4,BorderLayout.EAST);

        jFrame.add(jPanel);

    }
    public void run(){
        jFrame.setVisible(true);
    }

}
