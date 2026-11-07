package estoque;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto p){
        produtos.add(p);
    }

    public Produto buscarPorNome(String nome){

        int id = -1;
        for (Produto p : produtos) {
            if(p.getNome().equalsIgnoreCase(nome)){
                return p;
            }
        }
        return  null;

    }

    public boolean remover(String nome){
        Produto p = buscarPorNome(nome);
        if(p == null) return false;
        produtos.remove(p);
        return true;
    }

    public double valorTotal(){
        double soma = 0.0;
        for(Produto p : produtos){
            soma += p.getPreco() * p.getQuantidade();
        }
        return  soma;
    }

    public List<Produto> listarOrdenadoPorPreco(){
        List<Produto> p = new ArrayList<>(produtos);

        p.sort(Comparator.comparingDouble(Produto::getPreco));

        return p;
    }

}
