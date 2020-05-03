import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Klient {
    public static void main(String[] args) throws IOException {
            Socket socket =new Socket("localhost",55555);
        JFrame framefr = new JFrame();
            DataOutputStream dost = new DataOutputStream(socket.getOutputStream());
            DataInputStream inpe = new DataInputStream(socket.getInputStream());
        JPanel panelt = new JPanel(new GridLayout(5,1));
        JLabel labelr = new JLabel();
        framefr.add(panelt);
        framefr.setSize(1000,1000);
        framefr.setVisible(true);
        framefr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

                    dost.writeUTF( "Логин:"+login.getText() + " Пароль:" + password.getText());
                    dost.flush();

                    String entered = inpe.readUTF();
                    if(entered.equals("false")){
                        System.out.println("Вы не вошли");
                    }
                    if (entered.equals("true")){
                        System.out.println("Вы вошли");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    }

