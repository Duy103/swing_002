package testLai2;

import b11.CustomWindowListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form4 {
    JFrame jFrame = new JFrame("Test lại 2");

    public Form4() {
        this.jFrame = jFrame;
    }

    public void initConfig(){
        jFrame.setSize(300,400);
        jFrame.setLocation(50,50);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.addWindowListener(new CustomWindowListener());

        JPanel menuPanel = new JPanel();
        JPanel playGamePanel = new JPanel();

        JButton menuButton = new JButton("Menu");
        JButton playGameButton = new JButton("Play Game");

        jFrame.add(menuPanel);
        jFrame.add(playGamePanel);

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
                System.out.println("Bạn đã click vào Play Game");
            }
        });

        menuButton.addMouseListener(new CustomMouse4(menuButton, menuPanel, playGamePanel));
        playGameButton.addMouseListener(new CustomMouse4(playGameButton, playGamePanel, menuPanel));

        menuButton.setBackground(Color.GREEN);
        playGameButton.setBackground(Color.BLUE);

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
