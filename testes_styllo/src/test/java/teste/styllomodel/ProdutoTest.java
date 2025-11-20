package teste.styllomodel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProdutoTest {

    // CASO 1: Testar a criação e os dados iniciais do produto
    @Test
    public void testCriacaoProduto() {
        Produto p = new Produto("Camiseta", 50.00, 10);
        assertEquals(50.00, p.getPreco(), 0.01); // 0.01 é a margem de erro para doubles
        assertEquals(10, p.getEstoque());
    }

    // CASO 2: Venda com sucesso e retorno esperado (TRUE)
    @Test
    public void testVendaSucesso() {
        Produto p = new Produto("Calça Jeans", 100.00, 5);
        assertTrue(p.vender(2));
    }

    // CASO 3: Verificação da baixa correta no estoque após a venda
    @Test
    public void testAtualizacaoEstoqueAposVenda() {
        Produto p = new Produto("Calça Jeans", 100.00, 5);
        p.vender(2);
        assertEquals(3, p.getEstoque()); // 5 - 2 = 3
    }

    // CASO 4: Venda falha por falta de estoque (Falha esperada/FALSE)
    @Test
    public void testVendaSemEstoque() {
        Produto p = new Produto("Boné", 30.00, 2);
        assertFalse(p.vender(5)); // Tenta vender 5 tendo só 2
    }

    // CASO 5: Não permitir venda de quantidade zero ou negativa
    @Test
    public void testVendaQuantidadeInvalida() {
        Produto p = new Produto("Meia", 10.00, 10);
        assertFalse(p.vender(0));
        assertFalse(p.vender(-1));
    }

    // CASO 6: Reposição de estoque (Entrada de mercadoria)
    @Test
    public void testReposicaoEstoque() {
        Produto p = new Produto("Bermuda", 60.00, 10);
        p.reporEstoque(5);
        assertEquals(15, p.getEstoque());
    }

    // CASO 7: Ignorar reposição de valor negativo (não deve alterar o estoque)
    @Test
    public void testReposicaoInvalida() {
        Produto p = new Produto("Bermuda", 60.00, 10);
        p.reporEstoque(-5); 
        assertEquals(10, p.getEstoque());
    }

    // CASO 8: Cálculo de desconto correto (Regra de Negócio)
    @Test
    public void testCalculoDesconto() {
        Produto p = new Produto("Jaqueta", 200.00, 1);
        double valorFinal = p.calcularPrecoComDesconto(10); // 10% de 200 = 20. Final = 180.
        assertEquals(180.00, valorFinal, 0.01);
    }

    // CASO 9: Alteração de preço válida
    @Test
    public void testAlteracaoPreco() {
        Produto p = new Produto("Cinto", 40.00, 5);
        p.setPreco(45.00);
        assertEquals(45.00, p.getPreco(), 0.01);
    }

    // CASO 10: Impedir que o preço seja definido como negativo
    @Test
    public void testPrecoNegativo() {
        Produto p = new Produto("Cinto", 40.00, 5);
        p.setPreco(-10.00); // Tenta colocar -10, mas o valor deve permanecer 40
        assertEquals(40.00, p.getPreco(), 0.01);
    }
}