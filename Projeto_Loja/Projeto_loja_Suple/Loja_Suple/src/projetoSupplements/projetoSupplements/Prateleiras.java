package projetoSupplements;
import java.util.ArrayList;
import java.util.List;
public class Prateleiras {
 private Proteina pProteina = new Proteina(0, "", 0.0, 0);
 private  Aminoacidos aminoacidosInstance = new Aminoacidos(0, "", 0.0, 0);
 private  Hipecalorico hipecalorico = new Hipecalorico(0, "", 0.0, 0);
 private  Vitaminas vitaminas = new Vitaminas(0, "", 0.0, 0);
 private  Termogenicos termogeni = new Termogenicos(0, "", 0.0, 0);
 private Pretreinos pretreinos = new Pretreinos(0, "", 0.0, 0);
 public void listtodosProtei()
{
    pProteina.arrayProteina();
      List<Proteina> proteina = new ArrayList<>();
    for (Proteina pproduto : proteina) {
        System.out.println("Item: " + pproduto.getItem());
        System.out.println("Produto: " + pproduto.getProduto());
        System.out.println("Preço: R$ " + pproduto.getPreco());
        System.out.println("Quantidade:" + pproduto.getQuantidade());
        

    }
}
 public void listatodosAmino()
 {
    aminoacidosInstance.Amino();
    List<Itens> listaAminoacidos = aminoacidosInstance.getAminoacidos();
    for (Itens aminoacidosget : listaAminoacidos) {
        System.out.println("Item: " + aminoacidosget.getItem());
        System.out.println("Produto: " + aminoacidosget.getProduto());
        System.out.println("Preço: R$ " + aminoacidosget.getPreco());
        System.out.println("Quantidade:" + aminoacidosget.getQuantidade());
     }
 }
   public  void listtodosHiper()
   {
    hipecalorico.arrayHiper();
    List<Itens> listahiper = hipecalorico.getHiper();
    for (Itens hipecalorico : listahiper) {
        System.out.println("Item: " + hipecalorico.getItem());
        System.out.println("Produto: " + hipecalorico.getProduto());
        System.out.println("Preço: R$ " + hipecalorico.getPreco());
        System.out.println("Quantidade:" + hipecalorico.getQuantidade());
     }
   }
   public void listatodosVita()
   {
    vitaminas.arrayVita();
    List<Itens> vitas = vitaminas.getVitaminas();
    for (Itens vitaminas : vitas) {
        System.out.println("Item: " + vitaminas.getItem());
        System.out.println("Produto: " + vitaminas.getProduto());
        System.out.println("Preço: R$ " + vitaminas.getPreco());
        System.out.println("Quantidade:" + vitaminas.getQuantidade());
     }
   }
   public void listatodosTermo()
   {
    termogeni.arrayTermo();
    List<Itens> termo = termogeni.getTermogenicos();
    for (Itens termogeni : termo) {
        System.out.println("Item: " + termogeni.getItem());
        System.out.println("Produto: " + termogeni.getProduto());
        System.out.println("Preço: R$ " + termogeni.getPreco());
        System.out.println("Quantidade:" + termogeni.getQuantidade());
     }
   }
   public void lidtatodosPretei()
   {
     pretreinos.arrayPret();
     List<Itens> pre = pretreinos.getPretreino();
     for (Itens pretreinos : pre) {
        System.out.println("Item: " + pretreinos.getItem());
        System.out.println("Produto: " + pretreinos.getProduto());
        System.out.println("Preço: R$ " + pretreinos.getPreco());
        System.out.println("Quantidade:" + pretreinos.getQuantidade());
     }
   }
}
