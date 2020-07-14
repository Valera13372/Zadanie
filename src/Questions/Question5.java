package Questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Question5 {
    public Question5() throws IOException {
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
        TextArea que5 = new TextArea("Вопрос 5| Какая сеть супермаркетов лучше?");
        JButton que5button1 = new JButton("Пятерочка");
        JButton que5button2 = new JButton("Магнит");
        JButton que5button3 = new JButton("FixPrice");
        panelt.add(que5);
        panelt.add(que5button1);
        panelt.add(que5button2);
        panelt.add(que5button3);
        que5button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("a + 1");
                    dost.flush();

                    new TheEnd();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        que5button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("b + 1");
                    dost.flush();

                    new TheEnd();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        que5button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("c + 1");
                    dost.flush();
                    new TheEnd();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
}

