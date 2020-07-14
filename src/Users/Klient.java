package Users;

import Questions.Question1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Klient {
    public Klient() throws IOException {
            Socket socket =new Socket("localhost",55555);
            DataInputStream ince;
            DataInputStream inpe = new DataInputStream(socket.getInputStream());

          DataOutputStream dost = new DataOutputStream(socket.getOutputStream());
        JFrame framefr = new JFrame();
        JPanel panelt = new JPanel(new GridLayout(5,1));
        JLabel labelr = new JLabel();
        framefr.add(panelt);
        framefr.setSize(1000,1000);
        framefr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        framefr.setVisible(true);
        JLabel enterLogin = new JLabel("Логин");
        panelt.add(enterLogin);
        JTextField login = new JTextField();
        panelt.add(login);
        JLabel enterPassword = new JLabel("Пароль");
        panelt.add(enterPassword);
        JTextField password = new JTextField();
        panelt.add(password);
        JButton vhod= new JButton("Войти");
        panelt.add(vhod);
        vhod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    dost.writeUTF( login.getText() + " " + password.getText());
                    dost.flush();

                    String entered = inpe.readUTF();
                    System.out.println(entered);
                    if (entered.equals("false")){
                        System.out.println("Не правильный логин или пароль");
                        socket.close();

                        
                    }
                    if (entered.equals("trueKlient")) {
                        System.out.println("Вы вошли под КЛИЕНТОМ");
                        framefr.setVisible(false);
                        new Question1();
                    }

                    if (entered.equals("trueAdmin")) {
                        System.out.println("Вы вошли под АДМИНОМ");
                        framefr.setVisible(false);
                        new Question1();

                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    }

