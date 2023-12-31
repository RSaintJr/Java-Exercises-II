package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteSocket {
    private Socket cliente;
    private PrintStream saida;
    private Scanner entrada;

    public ClienteSocket(String host, int port) throws IOException {
        try {
            cliente = new Socket(host, port);
            saida = new PrintStream(cliente.getOutputStream());
            entrada = new Scanner(System.in);
        } catch (IOException e) {
            System.err.println("Erro ao criar o socket: " + e.getMessage());
        }
    }

    public void startClient() {
        new Thread(() -> {
            try {
                BufferedReader input = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                String mensagem;
                while ((mensagem = input.readLine()) != null) {
                    System.out.println(mensagem);
                }
            } catch (IOException e) {
                System.err.println("Erro ao ler dados do servidor: " + e.getMessage());
            }
        }).start();

        String texto;
        do {
            texto = entrada.nextLine();
            saida.println(texto);
        } while (!"sair".equals(texto));
        try {
            cliente.close();
            System.out.println("Usuário saiu");
        } catch (IOException e) {
            System.err.println("Erro ao encerrar o cliente: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            ClienteSocket cliente = new ClienteSocket("0.0.0.0", 7000);
            cliente.startClient();
        } catch (IOException e) {
            System.err.println("Erro ao iniciar o cliente: " + e.getMessage());
        }
    }
}

