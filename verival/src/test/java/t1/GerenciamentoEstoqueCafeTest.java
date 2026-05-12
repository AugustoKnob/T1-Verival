package t1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GerenciamentoEstoqueCafeTest {

    @Test
    void adicionaLeite() {
        GerenciamentoEstoqueCafe estoque = new GerenciamentoEstoqueCafe(0, 0, 0, 0);
        estoque.adicionarEstoque("leite", 5);
        assertEquals(5, estoque.obterEstoqueLeite());
    }

    @Test
    void removeCafe() {
        GerenciamentoEstoqueCafe estoque = new GerenciamentoEstoqueCafe(0, 10, 0, 0);
        boolean retirado = estoque.removerEstoque("cafe", 3);
        assertTrue(retirado);
        assertEquals(7, estoque.obterEstoqueCafe());
    }

    @Test
    void somaTotal() {
        GerenciamentoEstoqueCafe estoque = new GerenciamentoEstoqueCafe(2, 3, 4, 1);
        assertEquals(10, estoque.calcularTotalItens());
    }

    @Test
    void estoqueCritico() {
        GerenciamentoEstoqueCafe estoque = new GerenciamentoEstoqueCafe(4, 4, 6, 6);
        assertTrue(estoque.estoqueCritico());
    }

    @Test
    void negaNegativo() {
        GerenciamentoEstoqueCafe estoque = new GerenciamentoEstoqueCafe(5, 5, 5, 5);
        assertFalse(estoque.removerEstoque("leite", -1));
        assertEquals(5, estoque.obterEstoqueLeite());
    }
}
