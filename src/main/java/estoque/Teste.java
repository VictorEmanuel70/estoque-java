package estoque;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto caneta = new Produto("Caneta", 2.50, 10);
        Produto caderno = new Produto("Caderno", 15.90, 5);
        Produto mochila = new Produto("Mochila", 120.00, 2);
        Produto lapis = new Produto("Lapis", 1.20, 50);
        estoque.adicionar(caneta);
        estoque.adicionar(caderno);
        estoque.adicionar(mochila);
        estoque.adicionar(lapis);

        System.out.println(String.format("%.2f", estoque.valorTotal()));

        System.out.println(estoque.buscarPorNome("Caderno"));

        Produto c = estoque.buscarPorNome("Borracha");
        String r = c == null ? "Não encontrado" : c.toString();
        System.out.println(r);

        System.out.println(estoque.remover("Caneta"));

        System.out.println(estoque.remover("Caneta"));

        List<Produto> produtosOrdenados = estoque.listarOrdenadoPorPreco();

        for(Produto p : produtosOrdenados){
            System.out.println(p);
        }

        try{
            new Produto("Y", 10.0, -3);
        }catch(DadosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }
}
