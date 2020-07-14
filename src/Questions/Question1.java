package Questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class Question1 {
    public Question1() throws IOException {
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
        TextArea que1 = new TextArea("Вопрос 1| Чего вам больше всего не хватало в период самоизоляции?");
        JButton que1button1 = new JButton("Живого общения");
        JButton que1button2 = new JButton("Досуга вне дома");
        JButton que1button3 = new JButton("Будничной суеты");
        panelt.add(que1);
        panelt.add(que1button1);
        panelt.add(que1button2);
        panelt.add(que1button3);
        que1button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("a + 1");
                    dost.flush();
                    new Question2();


                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        que1button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("b + 1");
                    dost.flush();
                    new Question2();



                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        que1button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    framefr.setVisible(false);
                    dost.writeUTF("c + 1");
                    dost.flush();
                    new Question2();



                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
}



