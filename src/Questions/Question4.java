package Questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Question4 {
    public Question4() throws IOException {
        Socket socket = new Socket("localhost", 55555);
        DataInputStream inpe = new DataInputStream(socket.getInputStream());
        DataOutputStream dost = new DataOutputStream(socket.getOutputStream());
        JFrame framefr = new JFrame();
        JPanel panelt = new JPanel(new GridLayout(4, 1));
        JLabel labelr = new JLabel();
        framefr.add(panelt);
        framefr.setVisible(true);
        framefr.setSize(1000,1000);
        framefr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TextArea que4 = new TextArea("Вопрос 4| Любите ли вы массаж?");
        JButton que4button1 = new JButton("Да, приятно от него");
        JButton que4button2 = new JButton("Нет, но приходится делать в лечебных целях");
        JButton que4button3 = new JButton("Не знаю, ни разу не делали");
        panelt.add(que4);
        panelt.add(que4button1);
        panelt.add(que4button2);
        panelt.add(que4button3);
        que4button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("a + 1");
                    dost.flush();

                    new Question5();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        que4button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("b + 1");
                    dost.flush();

                    new Question5();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        que4button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("c + 1");
                    dost.flush();

                    new Question5();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
}

