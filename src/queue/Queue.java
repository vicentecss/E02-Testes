package queue;

import java.util.ArrayList;
import java.util.List;

public class Queue<Trem> {

    private List<Trem> vetor;
    private int inicio;

    public Queue() {
        this.vetor = new ArrayList<Trem>();
        this.inicio = 0;
    }

    public boolean estaVazia() {
        return this.vetor.isEmpty();
    }

    public void enfileirar(Trem x) {
        this.vetor.add(x);
        this.inicio++;
    }

    public int tamanho() {
        return this.vetor.size();
    }

    public Trem desenfileirar() throws Exception {
        if(this.estaVazia()) {
            throw new Exception("Fila vazia!");
        }

        return vetor.remove(0);
    }
}
