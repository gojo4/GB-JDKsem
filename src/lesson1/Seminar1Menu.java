package lesson1;

import UI.GeneralMenu;
import UI.InterSeminarMenu;
import lesson1.Chat.Chat;
import lesson1.ServerRun.ServerRun;
import lesson1.Window.GameWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Seminar1Menu extends JFrame implements InterSeminarMenu {
    private static final int WINDOW_HEIGHT = 300;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POS_X = 500;
    private static final int WINDOW_POS_Y = 200;

    JButton btnTicTacToe = new JButton("Start Window");
    JButton btnChat = new JButton("Start Chat");
    JButton btnServerRun = new JButton("Start ServerRun");
    JButton btnBack = new JButton("Come back to General menu");
    JButton btnExit = new JButton("Exit program");

    @Override
    public void semMenu() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Seminar 1. Menu");
        setResizable(false);

        JPanel panelButton = new JPanel(new GridLayout(1, 2));
        panelButton.add(btnBack);
        panelButton.add(btnExit);
        add(panelButton, BorderLayout.SOUTH);

        JPanel panelTask = new JPanel(new GridLayout(3, 1));
        panelTask.add(btnTicTacToe);
        panelTask.add(btnChat);
        panelTask.add(btnServerRun);
        add(panelTask, BorderLayout.CENTER);
        setVisible(true);

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GeneralMenu().generalMenu();
                setVisible(false);
            }
        });

        btnTicTacToe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GameWindow();
                setVisible(false);
            }
        });

        btnChat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Chat();
                setVisible(false);
            }
        });

        btnServerRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ServerRun();
                setVisible(false);
            }
        });

    }

}