package thucHanh2;

import b11.CustomWindowListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form2 {
    JFrame jFrame = new JFrame("Thực hành 2");

    public Form2() {
        this.jFrame = jFrame;
    }

    public void initConfig(){
        jFrame.setSize(300,300);
        jFrame.setLocation(20,50);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.addWindowListener(new CustomWindowListener());


        JPanel menuPanel = new JPanel();
        JPanel playGamePanel = new JPanel();

        JButton menuButton = new JButton("Menu");
        JButton playGameButton = new JButton("Play Game");

        menuButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Bạn đã click vào Menu");
            }
        });
        playGameButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Bạn đã click vào PlayGame");
            }
        });



        menuButton.addMouseListener(new CustomMouse2(menuButton, menuPanel, playGamePanel));
        playGameButton.addMouseListener(new CustomMouse2(playGameButton, playGamePanel, menuPanel));

        menuPanel.setBackground(Color.GREEN);
        playGamePanel.setBackground(Color.BLUE);

        menuPanel.add(menuButton);
        playGamePanel.add(playGameButton);

        jFrame.add(menuPanel);
        jFrame.add(playGamePanel);

        playGamePanel.setVisible(false);
    }
    public void run(){
        jFrame.setLayout(new FlowLayout());
        jFrame.setVisible(true);
    }
}
