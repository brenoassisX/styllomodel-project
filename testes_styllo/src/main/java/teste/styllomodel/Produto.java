package teste.styllomodel;

// Classe principal a ser testada
public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoqueInicial) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoqueInicial;
    }

    // Método 1: Vender (Regra crítica: não pode vender se estoque <= 0)
    public boolean vender(int quantidade) {
        if (quantidade > 0 && quantidade <= this.estoque) {
            this.estoque -= quantidade;
            return true;
        }
        return false;
    }

    // Método 2: Repor Estoque
    public void reporEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
        }
    }

    // Método 3: Cálculo de Desconto (Regra: Desconto entre 0 e 100)
    public double calcularPrecoComDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Desconto inválido");
        }
        return this.preco - (this.preco * (percentual / 100));
    }

    // Getters e Setters (Essenciais para os testes)
    public int getEstoque() { return estoque; }
    public double getPreco() { return preco; }
    
    public void setPreco(double novoPreco) {
        if (novoPreco >= 0) {
            this.preco = novoPreco;
        }
    }
}