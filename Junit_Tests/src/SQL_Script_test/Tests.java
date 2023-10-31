package SQL_Script_test;

import junit.framework.TestCase ;

public class Tests extends TestCase{

    public void testeScriptCorreto() {
        Script g = new Script();
        String script = g.GeraScript("codigo", "INT", true, true);
        assertEquals("`codigo` INT NOT NULL AUTO_INCREMENT", script);
    }

    public void testeScriptSemNotNull() {
        Script g = new Script();
        String script = g.GeraScript("codigo", "INT", false, true);
        assertEquals("`codigo` INT AUTO_INCREMENT", script);
    }

    public void testeScriptSemAutoIncrement() {
        Script g = new Script();
        String script = g.GeraScript("codigo", "INT", true, false);
        assertEquals("`codigo` INT NOT NULL", script);
    }

    public void testeScriptNomeTipoDiferente() {
        Script g = new Script();
        String script = g.GeraScript("nome", "VARCHAR(100)", true, true);
        assertEquals("`codigo` INT NOT NULL AUTO_INCREMENT", script);
    }
}
