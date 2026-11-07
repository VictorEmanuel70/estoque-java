package estoque;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        if(nome == null || nome.isEmpty()) throw new DadosInvalidosException("Nome não pode ser vazio");

        if(preco <= 0 ) throw new DadosInvalidosException("Preço deve ser maior que zero");

        if(quantidade < 0) throw new DadosInvalidosException("Quantidade não pode ser negativa");

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
