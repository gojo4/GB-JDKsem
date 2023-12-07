package UI;


import lesson1.Seminar1Menu;
import lesson2.Seminar2Menu;
import lesson3.Seminar3Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeneralMenu extends JFrame {
    private static final int WINDOW_HEIGHT = 200;
    private static final int WINDOW_WIDTH = 300;
    private static final int WINDOW_POS_X = 500;
    private static final int WINDOW_POS_Y = 200;

    private final JButton BTN_SEMINAR_1 = new JButton("Seminar 1");
    private final JButton BTN_SEMINAR_2 = new JButton("Seminar 2");
    private final JButton BTN_SEMINAR_3 = new JButton("Seminar 3");
    private final JButton BTN_EXIT = new JButton("Exit program");

    public void generalMenu(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("General Menu");
        setResizable(false);

        JPanel panelButton = new JPanel();
        panelButton.add(BTN_EXIT);
        add(panelButton, BorderLayout.SOUTH);

        JPanel panelTask = new JPanel(new GridLayout(3, 1));
        panelTask.add(BTN_SEMINAR_1);
        panelTask.add(BTN_SEMINAR_2);
        panelTask.add(BTN_SEMINAR_3);
        add(panelTask, BorderLayout.CENTER);

        setVisible(true);

        BTN_EXIT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        BTN_SEMINAR_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Seminar1Menu().semMenu();
                setVisible(false);
            }
        });

        BTN_SEMINAR_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Seminar2Menu().semMenu();
                setVisible(false);
            }
        });

        BTN_SEMINAR_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Seminar3Menu().semMenu();
                setVisible(false);
            }
        });
    }
}
