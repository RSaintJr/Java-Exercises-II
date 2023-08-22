package Projeto.InjecaoDependente;

import java.io.FileWriter;
import java.io.IOException;

public class CSV implements Salvar {

    @Override
    public void salva(Agenda agenda) {
        StringBuilder builder = new StringBuilder();

        // Combine the values from the Agenda object into a CSV formatted string
        builder.append(escapeSpecialCharacters(agenda.getNome()))
                .append(",")
                .append(escapeSpecialCharacters(agenda.getTelefone()))
                .append(",")
                .append(escapeSpecialCharacters(agenda.getNascimento()))
                .append(",")
                .append(escapeSpecialCharacters(agenda.getEmail()));

        String csvLine = builder.toString();

        FileWriter writer = null;

        try {
            writer = new FileWriter("agenda.csv");
            writer.write(csvLine);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }
        return escapedData;
    }
}
