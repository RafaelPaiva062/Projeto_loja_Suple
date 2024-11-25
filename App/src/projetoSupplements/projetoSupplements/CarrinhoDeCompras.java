package projetoSupplements;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Itens> itens; // Lista de itens no carrinho
    private double totalPreco = 0;
    private int totalQuantidade= 0 ;

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
            System.out.println("Item :"+ item.getItem()+ "\n Produto"+item.getProduto() + "\n - Quantidade: " + item.getQuantidade() + "\n - Preço: R$" + item.getPreco());
        }
        System.out.println("Total de itens: " + totalQuantidade);
        System.out.println("Preço total: R$" + totalPreco);
    }
}
public void removerItem(Itens item) { 
    if (item == null ) {
        System.out.println("Erro: Item não pode ser nulo.");
        return;
    }
    // Verifica se o item está presente na lista
    if (itens.contains(item)) {
        itens.remove(item);
        totalPreco -= item.getPreco() * item.getQuantidade();
        totalQuantidade -= item.getQuantidade();
        System.out.println(item.getProduto() + " removido do carrinho.");
    } else {
        System.out.println("Erro: Item não encontrado no carrinho.");
    }
}


public Itens getItemPorIndice(int index) {
    if (index >= 0 && index < itens.size()) {
        return itens.get(index);
    }
    return null; // Ou lance uma exceção
}

 
    // Método para retornar o total do carrinho
    public double getTotalPreco() {
        return totalPreco;
    }

    public int getTotalQuantidade() {
        return totalQuantidade;
    }
}
