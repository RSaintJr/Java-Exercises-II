import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Testes {

    @Test
    void testAdicionaAresta() {
        Grafo grafo = new Grafo(3, false);
        grafo.AdicionaAresta(0, 1,2);

        assertEquals(1, grafo.getAdjacencias().get(0).size());
        assertEquals(1, grafo.getAdjacencias().get(1).size());

        Aresta aresta = grafo.getAdjacencias().get(0).get(0);
        assertEquals(0, aresta.origem);
        assertEquals(1, aresta.destino);
        assertEquals(2, aresta.peso);
    }

    @Test
    void testRemoveAresta() {
        Grafo grafo = new Grafo(3, false);
        grafo.AdicionaAresta(0, 1,2);
        grafo.RemoverAresta(0, 1);

        assertEquals(0, grafo.getAdjacencias().get(0).size());
        assertEquals(0, grafo.getAdjacencias().get(1).size());
    }

    @Test
    void testRemoveVertice() {
        Grafo grafo = new Grafo(3, false);
        grafo.AdicionaAresta(0, 1, 2);
        grafo.AdicionaAresta(1, 2, 3);
        grafo.RemoverVertice(1);

        assertEquals(2, grafo.getAdjacencias().size());
        assertEquals(0, grafo.getAdjacencias().get(0).size());
        assertEquals(0, grafo.getAdjacencias().get(1).size());
    }

    @Test
    void testVerificaCompleto() {
        Grafo grafo = new Grafo(3, false);
        grafo.AdicionaAresta(0, 1, 1);
        grafo.AdicionaAresta(1, 2, 1);

        assertFalse(grafo.verificaCompleto());
    }

    @Test
    void testVerificaConexo() {
        Grafo grafo = new Grafo(3, false);
        grafo.AdicionaAresta(0, 1, 1);
        grafo.AdicionaAresta(1, 2, 1);

        assertTrue(grafo.verificaConexo());
    }

    @Test
    void testEuleriano() {
        Grafo grafo = new Grafo(3, false);
        grafo.AdicionaAresta(0, 1, 1);
        grafo.AdicionaAresta(1, 2, 1);

        assertFalse(grafo.euleriano());
    }

    @Test
    void testSemiEuleriano() {
        Grafo grafo = new Grafo(3, false);
        grafo.AdicionaAresta(0, 1, 1);
        grafo.AdicionaAresta(1, 2, 1);

        assertTrue(grafo.semiEuleriano());
    }

    @Test
    void testHamiltoniano() {
        Grafo grafo = new Grafo(3, false);
        grafo.AdicionaAresta(0, 1, 1);
        grafo.AdicionaAresta(1, 2, 1);

        assertFalse(grafo.hamiltoniano());
    }

    @Test
    void testSemiHamiltoniano() {
        Grafo grafo = new Grafo(3, false);
        grafo.AdicionaAresta(0, 1, 1);
        grafo.AdicionaAresta(1, 2, 1);

        assertTrue(grafo.semiHamiltoniano());
    }

    @Test
    void testBfs() {
        Grafo grafo = new Grafo(4, false);
        grafo.AdicionaAresta(0, 1, 1);
        grafo.AdicionaAresta(0, 2, 1);
        grafo.AdicionaAresta(1, 3, 1);

        boolean[] visitado = new boolean[4];
        grafo.bfs(0, visitado);

        assertTrue(visitado[0]);
        assertTrue(visitado[1]);
        assertTrue(visitado[2]);
    }

    @Test
    void testDfs() {
        Grafo grafo = new Grafo(4, false);
        grafo.AdicionaAresta(0, 1, 1);
        grafo.AdicionaAresta(0, 2, 1);
        grafo.AdicionaAresta(1, 3, 1);

        grafo.dfs(0);

        int[] visitado = {0, 2, 1, 3};

        assertEquals(4, visitado.length);
        assertEquals(0, visitado[0]);
        assertEquals(2, visitado[1]);
        assertEquals(1, visitado[2]);
        assertEquals(3, visitado[3]);

    }

    @Test
    void testDijkstra() {
        Grafo grafo = new Grafo(4, false);
        grafo.AdicionaAresta(0, 1, 1);
        grafo.AdicionaAresta(0, 2, 3);
        grafo.AdicionaAresta(1, 3, 2);
        grafo.AdicionaAresta(2, 3, 1);

        grafo.Dijkstra(0, 3);

        int distanciaResultado = 3;

        assertEquals(distanciaResultado, 3);

    }

}
