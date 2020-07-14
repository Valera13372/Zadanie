package Questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Question3 {
    public Question3() throws IOException {
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
        TextArea que3 = new TextArea("Вопрос 3| Как вы относитесь к шоу Галилео (с Маркони)?");
        JButton que3button1 = new JButton("A.Положительно");
        JButton que3button2 = new JButton("B.Нейтрально");
        JButton que3button3 = new JButton("C.Отрицательно");
        panelt.add(que3);
        panelt.add(que3button1);
        panelt.add(que3button2);
        panelt.add(que3button3);
        que3button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("a + 1");
                    dost.flush();

                    new Question4();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        que3button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("b + 1");
                    dost.flush();

                    new Question4();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        que3button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("c + 1");
                    dost.flush();

                    new Question4();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
}

