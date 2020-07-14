package Views;

import Users.Klient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Menu {
    public static void main(String[] args) {


        JFrame framefr = new JFrame();
        JPanel panelt = new JPanel(new GridLayout(2, 1));
        JLabel labelr = new JLabel();
        framefr.add(panelt);
        framefr.setSize(1000, 1000);
        framefr.setVisible(true);
        framefr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton logir = new JButton("Вход");
        JButton reg = new JButton("Нет аккаунта ? Зарегистрируйся");
        panelt.add(logir);
        panelt.add(reg);
        logir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    new Klient();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    new Registration();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
    }}
