
import java.io.*;
import java.net.*;

public class SecondServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6868); // ServerSocket listens on port 12345
            System.out.println("Server is running. Waiting for a client to connect...");

            Socket clientSocket = serverSocket.accept(); // Wait for a client to connect

            DataInputStream inFromClient = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outToClient = new DataOutputStream(clientSocket.getOutputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String serverMessage = "";
            String clientMessage = "";

            while (!serverMessage.equals("done")) {
                clientMessage = inFromClient.readUTF(); // Read message from client
                System.out.println("Client: " + clientMessage);

                serverMessage = bufferedReader.readLine(); // Read input from server
                outToClient.writeUTF(serverMessage); // Send message to client
                outToClient.flush();
            }

            inFromClient.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
