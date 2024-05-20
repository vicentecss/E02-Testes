package test;

import org.junit.Test;
import org.junit.Before;
import stack.Stack;

import static org.junit.Assert.*;

public class StackTest {

    private Stack<String> pilha;

    @Before
    public void init(){
        this.pilha = new Stack<>();
    }

    @Test
    public void testPilhaVazia(){
        assertTrue(pilha.estaVazia());
    }

    @Test
    public void testPilhaNaoVazia(){
        pilha.empilhar("1");
        assertFalse(pilha.estaVazia());
    }

    @Test
    public void testEmpilhar(){
        pilha.empilhar("1");
        pilha.empilhar("2");
        pilha.empilhar("3");

        assertEquals(3, pilha.tamanho());
    }

    @Test
    public void testDesempilhar() throws Exception {
        pilha.empilhar("1");
        pilha.empilhar("2");
        pilha.empilhar("3");

        pilha.desempilhar();
        String retorno = pilha.desempilhar();

        assertEquals("2", retorno);
    }

    @Test (expected = java.lang.Exception.class)
    public void testDesempilhaVazia() throws Exception {
        pilha.desempilhar();
    }
}
