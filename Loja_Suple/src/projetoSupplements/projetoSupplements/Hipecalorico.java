package projetoSupplements;
import java.util.ArrayList;
import java.util.List;


class Hipecalorico extends Itens
{
   private  List<Itens> hiper = new ArrayList<>();
   public Hipecalorico( int item,String produto, double preco ,int quantidade){
      super(item,produto, preco , quantidade );
     
     }
 public void arrayHiper()
 {
 // Produtos Growth
 hiper.add(new Hipecalorico(0,"-GROWTH SUPPLEMENTS-HIPER MASS (1KG) SABOR CHOCOLATE - " ,36.00 , 1));
 hiper.add(new Hipecalorico(1,"-GROWTH SUPPLEMENTS-(TOP) HIPERCALÓRICO (SABOR CHOCOLATE) (1KG) -" ,49.50 , 1));
 hiper.add(new Hipecalorico(2,"-GROWTH SUPPLEMENTS-BIG MASS PRO HIPERCALÓRICO 3KG -" ,144.00 , 1));
 // Produtos Max titanium
 hiper.add(new Hipecalorico(3,"- Max Titanium-Mass Titanium Refil 3Kg -" ,117.56 , 1));
 hiper.add(new Hipecalorico(4,"- Max Titanium-Super Gainers Refil 3Kg-" ,125.13 , 1));
 hiper.add(new Hipecalorico(5,"- Max Titanium-Mass Titanium 17500 ZERO LACTOSE 2,4kg-" ,110.00 , 1));
 hiper.add(new Hipecalorico(6,"- Max Titanium-Super Whey 900G-" ,75.85 , 1));
 hiper.add(new Hipecalorico(7,"- Max Titanium-Mass Titanium Refil 1,4Kg-" ,64.50 , 1));
    // Produtos Integralmedica
 hiper.add(new Hipecalorico(8,"-  Integralmedica -Creamass Hipercalorico com Creatina 3Kg-",110.52,1));
 hiper.add(new Hipecalorico(9,"-  Integralmedica -Nutri Whey Protein Pote 900g-",82.94,1));
 hiper.add(new Hipecalorico(10,"-  Integralmedica -Nutri Whey Protein  900g-",75.04,1));
 hiper.add(new Hipecalorico(11,"-  Integralmedica -Nutri Whey Protein  1,8Kg-",134.22,1));

 }
public List<Itens> getHiper() {
   return hiper;
}
public void setHiper(List<Itens> hiper) {
   this.hiper = hiper;
}
}