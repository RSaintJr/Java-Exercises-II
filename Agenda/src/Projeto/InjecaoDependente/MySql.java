package Projeto.InjecaoDependente;

import Projeto.Conexao.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySql implements Salvar {

    @Override
    public void salva(Agenda agenda) {

        Connection conexao = Conexao.conectar();

        String sql = "INSERT INTO agenda (nome,telefone, nascimento ,email) VALUES (?, ?, ?, ?)";

        try {
            assert conexao != null;
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, agenda.getNome());
            statement.setString(2, agenda.getNascimento());
            statement.setString(3, agenda.getTelefone());
            statement.setString(4, agenda.getEmail());

            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir registro: " + e.getMessage());
        } finally {
            try {
                conexao.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }

}