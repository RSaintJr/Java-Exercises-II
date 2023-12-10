import java.util.*;
class Aresta{
    int origem;
    int destino;
    int peso;

    public Aresta(int origem, int destino, int peso){
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }
}
public class Grafo {

    private final boolean testeConexao = true;
    private int nVertices;
    private List<LinkedList<Aresta>> adjacencias;
    private final boolean direcionado;

    public boolean isTesteConexao() {
        return testeConexao;
    }

    public int getnVertices() {
        return nVertices;
    }

    public void setnVertices(int nVertices) {
        this.nVertices = nVertices;
    }

    public List<LinkedList<Aresta>> getAdjacencias() {
        return adjacencias;
    }

    public void setAdjacencias(List<LinkedList<Aresta>> adjacencias) {
        this.adjacencias = adjacencias;
    }

    public boolean isDirecionado() {
        return direcionado;
    }

    public Grafo(int nVertices, boolean direcionado) {
        this.nVertices = nVertices;
        this.direcionado = direcionado;
        this.adjacencias = new ArrayList<>(nVertices);
        for (int i = 0; i < nVertices; i++) {
            adjacencias.add(new LinkedList<>());
        }
    }

    public void AdicionaAresta(int u, int v, int peso) {
        Aresta aresta = new Aresta(u, v, peso);
        adjacencias.get(u).add(aresta);
        if (!direcionado) {
            Aresta arestainvertida = new Aresta(v, u, peso);
            adjacencias.get(v).add(arestainvertida);
        }
    }

    public void RemoverAresta(int u, int v) {
        adjacencias.get(u).removeIf(aresta -> aresta.destino == v);
        if (!direcionado) {
            adjacencias.get(v).removeIf(aresta -> aresta.destino == u);
        }
    }

    public void RemoverVertice(int vertice){
        for (int i = 0; i < nVertices; i++) {
            List<Aresta> arestas = adjacencias.get(i);
            arestas.removeIf(aresta -> aresta.origem == vertice || aresta.destino == vertice);
        }
        adjacencias.remove(vertice);
        nVertices--;
    }

    public boolean verificaCompleto() {
        int totalArestas = adjacencias.stream().mapToInt(List::size).sum();
        return totalArestas == (nVertices * (nVertices - 1));
    }

    public boolean verificaConexo() {
        boolean[] visitado = new boolean[nVertices];

        if (nVertices == 0) {
            return true;
        }

        bfs(0, visitado);

        for (boolean v : visitado) {
            if (!v) {
                return false;
            }
        }

        return true;
    }

    public boolean euleriano() {
        return adjacencias.stream().allMatch(arestas -> arestas.size() % 2 == 0);
    }

    public boolean semiEuleriano() {
        long count = adjacencias.stream().filter(arestas -> arestas.size() % 2 != 0).count();
        return count == 2;
    }

    public boolean hamiltoniano() {
        return adjacencias.stream().allMatch(arestas -> arestas.size() >= nVertices - 1);
    }

    public boolean semiHamiltoniano() {
        long count = adjacencias.stream().filter(arestas -> arestas.size() < nVertices - 1).count();
        return count == 2;
    }

    public void TodasAdjcencias() {
        for (int i = 0; i < nVertices; i++) {
            System.out.print("Vertice " + i + ": ");
            StringBuilder sb = new StringBuilder();
            for (Aresta aresta : adjacencias.get(i)) {
                sb.append("(").append(aresta.destino).append(", Peso: ").append(aresta.peso).append(")");
            }
            System.out.println(sb);
        }
    }

    public void verticeAdjacencias(int vertice) {
        System.out.print("Vertice " + vertice + ": ");
        StringBuilder sb = new StringBuilder();
        for (Aresta aresta : adjacencias.get(vertice)) {
            sb.append("(").append(aresta.destino).append(", Peso: ").append(aresta.peso).append(")");
        }
        System.out.println(sb);
    }


    public void bfs(int verticeInicial, boolean[] visitado) {
        Queue<Integer> fila = new LinkedList<>();
        visitado[verticeInicial] = true;
        fila.add(verticeInicial);
        System.out.println("Resultado da busca em largura a partir do vértice " + verticeInicial + ":");
        while (!fila.isEmpty()) {
            int verticeAtual = fila.poll();
            System.out.print(verticeAtual + " ");

            for (Aresta aresta : adjacencias.get(verticeAtual)) {
                int vizinho = aresta.destino;
                if (!visitado[vizinho]) {
                    visitado[vizinho] = true;
                    fila.add(vizinho);
                }
            }
        }
        System.out.println();
    }

        public void dfs(int verticeInicial) {
        boolean[] visitado = new boolean[nVertices];
        Stack<Integer> pilha = new Stack<>();

        visitado[verticeInicial] = true;
        pilha.push(verticeInicial);

        System.out.println("Resultado da busca em profundidade a partir do vértice " + verticeInicial + ":");
        while (!pilha.isEmpty()) {
            int verticeAtual = pilha.pop();
            System.out.print(verticeAtual + " ");

            for (Aresta aresta : adjacencias.get(verticeAtual)) {
                int vizinho = aresta.destino;
                if (!visitado[vizinho]) {
                    visitado[vizinho] = true;
                    pilha.push(vizinho);
                }
            }
        }
        System.out.println();
    }

    public void Dijkstra(int origem, int destino){

        int[] distancia = new int[nVertices];

        for(int i=0; i<nVertices; i++){
            distancia[i] = Integer.MAX_VALUE;
        }

        distancia[origem] = 0;
        Set<Integer> visitados = new HashSet<>();

        while(true){
            int u = -1;
            for(int i=0; i<nVertices; i++){
                if(!visitados.contains(i) && (u == -1 || distancia[i] < distancia[u])){
                    u = i;
                }
            }

            if(u == -1) break;
            visitados.add(u);

            for(Aresta aresta : adjacencias.get(u)){
                int v = aresta.destino;
                int peso = aresta.peso;

                if(distancia[u] + peso < distancia[v]){
                    distancia[v] = distancia[u] + peso;
                }
            }
        }
        System.out.println("A menor distancia da origem: " + origem + " para o destino" +
                ": " + destino + " é de: " + distancia[destino]);
    }

}