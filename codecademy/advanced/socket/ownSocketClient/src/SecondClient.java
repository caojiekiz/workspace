
import java.io.*;
import java.net.*;

public class SecondClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6868); // Connect to server on localhost, port 12345

            DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
            DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage = "";
            String serverMessage = "";

            while (!clientMessage.equals("done")) {
                clientMessage = bufferedReader.readLine(); // Read input from client
                outToServer.writeUTF(clientMessage); // Send message to server
                outToServer.flush();

                serverMessage = inFromServer.readUTF(); // Read message from server
                System.out.println("Server: " + serverMessage);
            }

            inFromServer.close();
            outToServer.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
