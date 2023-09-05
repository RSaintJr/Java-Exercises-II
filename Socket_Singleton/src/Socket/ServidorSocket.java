package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServidorSocket {
    private static ServidorSocket instance = null;
    private ServerSocket servidor;
    private List<Socket> clientes;

    private ServidorSocket(int port) throws IOException {
        servidor = new ServerSocket(port);
        clientes = new ArrayList<>();
    }

    public static ServidorSocket getInstance(int port) throws IOException {
        if (instance == null) {
            instance = new ServidorSocket(port);
        }
        return instance;
    }

    public void startServer() {
        while (true) {
            try {
                Socket cliente = servidor.accept();
                clientes.add(cliente);
                new Thread(() -> {
                    try {
                        BufferedReader input = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                        String mensagem;
                        while ((mensagem = input.readLine()) != null) {
                            for (Socket outroCliente : clientes) {
                                if (outroCliente != cliente) {
                                    PrintStream saida = new PrintStream(outroCliente.getOutputStream());
                                    saida.println(mensagem);
                                }
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("Algo errado aconteceu");
                    }
                }).start();
            } catch (IOException e) {
                System.out.println("Algo errado aconteceu");
            }
        }
    }

    public static void main(String[] args) {
        try {
            ServidorSocket servidor = ServidorSocket.getInstance(7000);
            servidor.startServer();
        } catch (IOException e) {
            System.out.println("Algo errado aconteceu");
        }
    }

}
