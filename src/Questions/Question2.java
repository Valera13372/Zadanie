package Questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Question2 {
    public Question2() throws IOException {
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
        TextArea que2 = new TextArea("Вопрос 2| Какая у вас операционная система на смартфоне?");
        JButton que2button1 = new JButton("Android");
        JButton que2button2 = new JButton("IOS");
        JButton que2button3 = new JButton("Другая ОС");
        panelt.add(que2);
        panelt.add(que2button1);
        panelt.add(que2button2);
        panelt.add(que2button3);
        que2button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("a + 1");
                    dost.flush();

                    new Question3();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        que2button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("b + 1");
                    dost.flush();

                    new Question3();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        que2button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("c + 1");
                    dost.flush();

                    new Question3();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
}

