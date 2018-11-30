import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        int port = 5000;
        int limite = 3;
        String ip = "192.168.1.10";
        try {
                ServerSocket socket = new ServerSocket(port, limite, InetAddress.getByName(ip));
            } catch (IOException e) {
                System.err.println("Le port " + port + " est déjà utilisé ! ");
            }
    }
}
