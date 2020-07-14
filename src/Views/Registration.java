package Views;

import Questions.Question1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;

public class Registration {
    FileWriter zaregai = new FileWriter("D:\\login and password.txt");
    public Registration() throws IOException {
        Socket socket =new Socket("localhost",55555);
        DataInputStream ince;
        DataInputStream inpe = new DataInputStream(socket.getInputStream());

        DataOutputStream dost = new DataOutputStream(socket.getOutputStream());
        JFrame framefr = new JFrame();
        JPanel panelt = new JPanel(new GridLayout(5,1));
        JLabel labelr = new JLabel();
        framefr.add(panelt);
        framefr.setSize(1000,1000);
        framefr.setVisible(true);
        framefr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel enterLogin = new JLabel("Введите Логин");
        panelt.add(enterLogin);
        JTextField Reglogin = new JTextField();
        panelt.add(Reglogin);
        JLabel enterPassword = new JLabel("Введите Пароль");
        panelt.add(enterPassword);
        JTextField Regpassword = new JTextField();
        panelt.add(Regpassword);
        JButton vhod= new JButton("Зарегистрироваться");
        panelt.add(vhod);
        vhod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    dost.writeUTF( Reglogin.getText() + " " + Regpassword.getText());
                    dost.flush();

                    String entered = inpe.readUTF();
                    if (entered.equals("false")){
                        System.out.println("ОШИБКА!!!");
                        socket.close();


                    }
                    if (entered.equals("true")){
                        System.out.println("Вы зарегистрировались");
                        new Question1();
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
