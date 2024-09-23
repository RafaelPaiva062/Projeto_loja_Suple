package projetoSupplements;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Itens> itens; // Lista de itens no carrinho
    private double totalPreco;
    private int totalQuantidade;

    // Construtor
    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>(); 
        this.totalPreco = 0.0;
        this.totalQuantidade = 0;
    }

    public void adicionarItem(Itens item) {
        itens.add(item);
        totalPreco += item.getPreco() * item.getQuantidade();
        totalQuantidade += item.getQuantidade();
        System.out.println(item.getProduto() + " adicionado ao carrinho.");
    }
// Método para exibir os itens do carrinho
public void mostrarCarrinho() {
    if (itens.isEmpty()) {
        System.out.println("O carrinho está vazio.");
    } else {
        System.out.println("Itens no carrinho:");
        for (Itens item : itens) {
            System.out.println(item.getProduto() + "\n - Quantidade: " + item.getQuantidade() + "\n - Preço: R$" + item.getPreco());
        }
        System.out.println("Total de itens: " + totalQuantidade);
        System.out.println("Preço total: R$" + totalPreco);
    }
}
    // Método para retornar o total do carrinho
    public double getTotalPreco() {
        return totalPreco;
    }

    public int getTotalQuantidade() {
        return totalQuantidade;
    }
}
