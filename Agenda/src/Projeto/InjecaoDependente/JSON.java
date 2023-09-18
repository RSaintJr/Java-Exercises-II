package Projeto.InjecaoDependente;

import com.solidfire.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class JSON implements Salvar{

    public void salva(Agenda agenda){
        Gson gson = new Gson();

        String json = gson.toJson(agenda);

        FileWriter writer = null;

        try {
            writer = new FileWriter("agenda.json");
            writer.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (writer != null) {
                try {
                    System.out.println("Arquivo JSON salvo com sucesso.");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
