package Projeto.Conexao;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexao {

    final static String NOME_DO_BANCO = "agenda";

    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/" + NOME_DO_BANCO;
            return DriverManager.getConnection(url, "root", "");
        } catch (Exception e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
            return null;
        }
    }
}
