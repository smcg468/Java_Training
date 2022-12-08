package Learning.Serialization.Sockets;

import Learning.Serialization.Sockets.Account;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main ( String[] args) throws IOException {

        Socket socket = null;
        ObjectInputStream socketIn = null;

        ServerSocket serverSocket = new ServerSocket(8020);

        try {
            System.out.println("Waiting for Connection");

            socket = serverSocket.accept();

            socketIn = new ObjectInputStream( new BufferedInputStream(socket.getInputStream()));

            while (true) {
                Account account = (Account) socketIn.readObject();
                System.out.println(account);

            }

        } catch (Exception e) {

            System.out.println(e);
            System.exit(1);

        } finally {

            socket.close();
            socketIn.close();

        }

    }

}
