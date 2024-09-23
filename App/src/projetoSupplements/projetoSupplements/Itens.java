package projetoSupplements;


interface Categoria{
   String getProduto();
   double getPreco();
   int getQuantidade();
   int getItem();
}
abstract  class Itens implements Categoria{

    private  int item;
    private String produto;
    private double preco;
    private  int quantidade;
   
   
   
    public  Itens( int item, String produto, double preco ,int quantidade)
    {
        this.item= item; 
        this.produto = produto;
        this.preco= preco; 
        this.quantidade= quantidade;
        

    }
    public String getProduto() {
        return produto;
    }
    public double getPreco() {
        return preco;
    } public int getQuantidade() {
        return quantidade ;
    }
    public int getItem() {
      return item ;
  }
}