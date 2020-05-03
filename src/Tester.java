import com.sun.corba.se.spi.activation.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws IOException {
        ServerSocket serf = new ServerSocket(55555);
        Socket acceptu = serf.accept();
        DataInputStream dis = new DataInputStream(acceptu.getInputStream());
        DataOutputStream dos = new DataOutputStream(acceptu.getOutputStream());
        String entert = dis.readUTF();
        FileReader redf = new FileReader("D:\\login and password.txt");
        Scanner scan = new Scanner(redf);
        String vhodr = scan.nextLine();
            while (vhodr == entert) {
                dos.writeUTF("true");
                dos.flush();
                }
                if(vhodr != entert) {
                    dos.writeUTF("false");
                    dos.flush();
                }
            }
        }