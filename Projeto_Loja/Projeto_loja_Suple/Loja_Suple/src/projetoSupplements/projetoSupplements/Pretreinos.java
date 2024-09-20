package projetoSupplements;
import java.util.ArrayList;
import java.util.List;

class Pretreinos extends Itens
{

   List<Itens> pretreino = new ArrayList<>();
   public Pretreinos( int item,String produto, double preco ,int quantidade){
      super(item,produto, preco , quantidade );
    
     }
     public void arrayPret()
     {
      // Porduto Growth
      pretreino.add(new Pretreinos(0,"- Growth Supplements-Pré-Treino Haze Hardcore 300g  -", 103.50, 1));
      pretreino.add(new Pretreinos(1,"- Growth Supplements-Pré-treino Insanity 300g  -", 108.00, 1));
      // Produtos Max titanium 
      pretreino.add(new Pretreinos(2,"- Max Titanium-Égide 300g  -", 151.71, 1));
      pretreino.add(new Pretreinos(3,"- Max Titanium-Horus 150g  -", 89.90, 1));
     // Produtp Integralmedica 
      pretreino.add(new Pretreinos(4,"- Integralmedica-Huger Pré-Treino 320g -", 111.93, 1));
      pretreino.add(new Pretreinos(5,"- Integralmedica-Beta Alanina em Pó 123g -", 70.31, 1));

     }
   public List<Itens> getPretreino() {
      return pretreino;
   }
   public void setPretreino(List<Itens> pretreino) {
      this.pretreino = pretreino;
   }
}