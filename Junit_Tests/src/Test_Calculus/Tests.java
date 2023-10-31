package Test_Calculus;

import junit.framework.TestCase;

public class Tests extends TestCase{
    Calculus calc = new Calculus();
    double[] arrayTeste = new double[]{37,35,36,34,37,35,38,35,33,39,37,37,36,36,38,34,39,36};


    public void testeModa(){
        assertEquals(37.0,calc.Moda(arrayTeste));
    }

    public void testeMedia(){
        assertEquals(36.22222222222222,calc.Media(arrayTeste));
    }

    public void testeMediana(){
        assertEquals(36.0,calc.Mediana(arrayTeste));
    }

    public void testeVariancia(){
        assertEquals(2.728395061728394,calc.Variancia(arrayTeste));
    }

    public void testeDesvio(){
        assertEquals(1.6517854163687224,calc.Desvio(arrayTeste));
    }
}
