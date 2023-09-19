package Socket;

import java.io.*;
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

    private static synchronized ServidorSocket getInstance(int port) throws IOException {
        if (instance == null) {
            instance = new ServidorSocket(port);
        }
        return instance;
    }

    private void startServer() {
        while (true) {
            try {
                Socket cliente = servidor.accept();
                synchronized (clientes) {
                    clientes.add(cliente);
                }
                new Thread(() -> {
                    try {
                        BufferedReader input = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                        String mensagem;
                        while ((mensagem = input.readLine()) != null) {
                            synchronized (clientes) {
                                for (Socket outroCliente : clientes) {
                                    if (outroCliente != cliente) {
                                        try {
                                            PrintStream saida = new PrintStream(outroCliente.getOutputStream());
                                            saida.println(mensagem);
                                        } catch (IOException e) {
                                            System.out.println("Erro ao enviar mensagem: " + e.getMessage());
                                        }
                                    }
                                }
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("Erro ao aceitar Cliente: " + e.getMessage());
                    }
                }).start();
            } catch (IOException e) {
                System.out.println("Algo deu errado: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        try {
            ServidorSocket servidor = ServidorSocket.getInstance(7000);
            servidor.startServer();
        } catch (IOException e) {
            System.out.println("Erro ao iniciar o servidor: " + e.getMessage());
        }
    }
}
