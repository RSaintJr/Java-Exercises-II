package SQL_Script_test;

public class Script {
    public String GeraScript(String codigo, String tipo, boolean notNull, boolean autoIncrement) {
        StringBuilder script = new StringBuilder();
        script.append("`").append(codigo).append("` ").append(tipo);

        if (notNull) {
            script.append(" NOT NULL");
        }

        if (autoIncrement) {
            script.append(" AUTO_INCREMENT");
        }

        return script.toString();
    }

}
