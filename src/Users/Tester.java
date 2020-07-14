package Users;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.file.NoSuchFileException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.CompletionException;

public class Tester {
    public static void main(String[] args) throws IOException, SocketException {
            try {
                try {


                    ServerSocket serf = new ServerSocket(55555);
                    Socket acceptu = serf.accept();
                    DataInputStream dis = new DataInputStream(acceptu.getInputStream());
                    DataOutputStream dos = new DataOutputStream(acceptu.getOutputStream());
                    int a = 0;
                    int b = 0;
                    int c = 0;
                    FileReader KlientReader = new FileReader("D:\\login and password.txt");
                    FileReader AdminReader = new FileReader("D:\\Admins login and password.txt");
                    Scanner scanKlient = new Scanner(KlientReader);
                    Scanner scanAdmin = new Scanner(AdminReader);
                    String vhodrAdmin = scanAdmin.nextLine();
                    String vhodrKlient = scanKlient.nextLine();
                    System.out.println("Пароль админа " + vhodrAdmin);
                    System.out.println("Пароль клиента " + vhodrKlient);

                    String entert = dis.readUTF();
                    System.out.println("Прочитал " + entert);
                    if (entert.equals(entert) == vhodrAdmin.equals(vhodrAdmin)) {
                        dos.writeUTF("trueAdmin");
                        dos.flush();
                    }

                    if (entert.equals(entert) == vhodrKlient.equals(vhodrKlient)) {
                        dos.writeUTF("trueKlient");
                        dos.flush();
                    }
                    if (entert.equals(entert) != vhodrAdmin.equals(vhodrAdmin) && entert.equals(entert) != vhodrKlient.equals(vhodrKlient))
                        dos.writeUTF("false");
                    dos.flush();

                    String que1 = dis.readUTF();
                    if (que1.equals("a + 1")) {
                        a = a + 1;
                        dos.writeUTF("True a + 1");

                    }
                    if (que1.equals("b + 1")) {
                        b = b + 1;
                        dos.writeUTF("True b + 1");

                    }
                    if (que1.equals("c + 1")) {
                        c = c + 1;
                        dos.writeUTF("True c + 1");

                    }

                    String que2 = dis.readUTF();
                    if (que2.equals("a + 1")) {
                        a = a + 1;
                        dos.writeUTF("True a + 1");

                    }
                    if (que2.equals("b + 1")) {
                        b = b + 1;
                        dos.writeUTF("True b + 1");

                    }
                    if (que2.equals("c + 1")) {
                        c = c + 1;
                        dos.writeUTF("True c + 1");

                    }

                    String que3 = dis.readUTF();
                    if (que3.equals("a + 1")) {
                        a = a + 1;
                        dos.writeUTF("True a + 1");

                    }
                    if (que3.equals("b + 1")) {
                        b = b + 1;
                        dos.writeUTF("True b + 1");

                    }
                    if (que3.equals("c + 1")) {
                        c = c + 1;
                        dos.writeUTF("True c + 1");

                    }

                    String que4 = dis.readUTF();
                    if (que4.equals("a + 1")) {
                        a = a + 1;
                        dos.writeUTF("True a + 1");

                    }
                    if (que4.equals("b + 1")) {
                        b = b + 1;
                        dos.writeUTF("True b + 1");

                    }
                    if (que4.equals("c + 1")) {
                        c = c + 1;
                        dos.writeUTF("True c + 1");

                    }

                    String que5 = dis.readUTF();
                    if (que5.equals("a + 1")) {
                        a = a + 1;
                        dos.writeUTF("True a + 1");

                    }
                    if (que5.equals("b + 1")) {
                        b = b + 1;
                        dos.writeUTF("True b + 1");

                    }
                    if (que5.equals("c + 1")) {
                        c = c + 1;
                        dos.writeUTF("True c + 1");

                    }



                } catch (SocketException Connectionresetbypeer) {
                    Connectionresetbypeer.printStackTrace();
                }
            } catch (SocketException Conectionreset) {
            Conectionreset.printStackTrace();
            System.out.println("Клиент вышел");
        }

    }
}




