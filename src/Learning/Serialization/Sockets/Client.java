package Learning.Serialization.Sockets;

import Learning.Serialization.Sockets.Account;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;

import static java.util.Arrays.asList;

public class Client {

    public static void main ( String [] args) throws IOException {

        Account acc1 = new Account(2330f, 39982763, "Sean");
        Account acc2 = new Account(73830f, 12345678, "Mike");
        Account acc3 = new Account(7630f, 98876324, "Luke");

        List<Account> accounts = asList(acc1, acc2, acc3);
        ObjectOutputStream socketOut = null;

        try {

            Socket socket = new Socket(InetAddress.getLocalHost(), 8020);

            socketOut = new ObjectOutputStream(new BufferedOutputStream(socket.getOutputStream()));

            for (Account account : accounts){

                socketOut.writeObject(account);
                socketOut.flush();

                Thread.sleep(5000);

            }


        } catch (Exception e) {

            System.out.println(e);
            System.exit(1);

        } finally {
            socketOut.close();
        }
    }
}
