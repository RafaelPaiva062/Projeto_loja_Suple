package projetoSupplements;
import java.util.ArrayList;
import java.util.List;
public class Proteina extends Itens{
 private List<Proteina> proteina = new ArrayList<>();

public Proteina( int item,String produto, double preco ,int quantidade){
   super(item,produto, preco , quantidade );
  
}

public void arrayProteina(){
     // Produtos Growth
      proteina.add(new Proteina(0,"- GROWTH SUPPLEMENTS -WHEY PROTEIN CONCENTRADO (1KG)",108.00,1));
      proteina.add(new Proteina(1,"- GROWTH SUPPLEMENTS - DOSE WHEY PROTEIN CONCENTRADO 30GR)" ,3.96 ,1));
      proteina.add(new Proteina(2,"- GROWTH SUPPLEMENTS - BEBIDA LÁCTEA UHT DE PROTEÍNAS ",5.67,1));
      proteina.add(new Proteina(3,"- GROWTH SUPPLEMENTS - BARRA DE PROTEÍNA (BARRINHA DE PROTEÍNA) - DISPLAY C/ 12 UN. ",28.08,1));
      proteina.add(new Proteina(4,"- GROWTH SUPPLEMENTS - (TOP) WHEY PROTEIN ISOLADO (1KG) -",144.00,1));
      proteina.add(new Proteina(5,"- GROWTH SUPPLEMENTS - MEDIUM WHEY PROTEIN (1KG)",61.11,1));
      proteina.add(new Proteina(6,"- GROWTH SUPPLEMENTS -SOY PROTEIN (PROTEÍNA ISOLADA DE SOJA) 1KG",67.50,1));
      proteina.add(new Proteina(7,"- GROWTH SUPPLEMENTS -BASIC WHEY PROTEIN (1KG) -",41.40,1));
      proteina.add(new Proteina(8,"- GROWTH SUPPLEMENTS -COLÁGENO HIDROLISADO (150G) ",18.90,1));
      proteina.add(new Proteina(9,"- GROWTH SUPPLEMENTS -Albumina 1kg ",85.50,1));
      proteina.add(new Proteina(10,"- GROWTH SUPPLEMENTS -Blend Vegan",75.60,1));
      proteina.add(new Proteina(11,"- GROWTH SUPPLEMENTS- Rice Protein 1kg (COM SABOR) ",75.60,1));
      proteina.add(new Proteina(12,"- GROWTH SUPPLEMENTS- Colágeno Tipo 2 - 60 cápsulas - ",60.30,1));
      proteina.add(new Proteina(13,"- GROWTH SUPPLEMENTS- Proteína da ervilha 1kg (Com sabor) ",75.60,1));
      proteina.add(new Proteina(14,"- GROWTH SUPPLEMENTS-WAFER PROTEIN 100GR ",10.80,1));
      proteina.add(new Proteina(15,"- GROWTH SUPPLEMENTS-Soy Protein Proteína Isolada de Soja (Sabor Natural) 1kg ",67.40,1));
      proteina.add(new Proteina(16,"- GROWTH SUPPLEMENTS-3W Whey Protein (1kg) ",144.00,1));
      proteina.add(new Proteina(17,"- GROWTH SUPPLEMENTS-Biscoitos com Proteínas Vegetai",8.00,1));
      proteina.add(new Proteina(18,"- GROWTH SUPPLEMENTS-(TOP) Whey e Egg (sabor natural) (1KG)",80.00,1));
      proteina.add(new Proteina(19,"- GROWTH SUPPLEMENTS-Whey Protein Hidrolisado (1kg) (sabor natural)",216.00,1));
      proteina.add(new Proteina(21,"- GROWTH SUPPLEMENTS-Albumina 500g",47.70,1));
      proteina.add(new Proteina(22,"- GROWTH SUPPLEMENTS-Caseinato de Cálcio 1kg ",153.00,1));
      proteina.add(new Proteina(23,"- GROWTH SUPPLEMENTS-Colágeno Tipo 2 - 60 cápsulas",62.00,1));
      // Produtos Max Titanium
      proteina.add(new Proteina(24,"-  Max Titanium-Whey Protein Isolado IsoWhey 900g",226.90,1));
      proteina.add(new Proteina(25,"-  Max Titanium-Top Whey 3W + Performance 900G",179.90,1));
      proteina.add(new Proteina(26,"-  Max Titanium-Whey Protein Dr. Peanut 100% Whey 900g",156.90,1));
      proteina.add(new Proteina(27,"-  Max Titanium-Pack 2x 100% Whey Refil 900G",254.90,1));
      proteina.add(new Proteina(28,"-  Max Titanium-100% Whey Pote 900G",150.00,1));
      proteina.add(new Proteina(29,"-  Max Titanium-Top Whey 3W + Performance 1,8Kg",281.99,1));
      proteina.add(new Proteina(30,"-  Max Titanium-Whey Pro 1Kg",83.46,1));
      proteina.add(new Proteina(31,"-  Max Titanium-100% Whey Refil 900G",136.90,1));
      proteina.add(new Proteina(32,"-  Max Titanium-Femini Whey 900G",121.35,1));
      proteina.add(new Proteina(33,"-  Max Titanium-100% WHEY DINO POTE 900G",147.89,1));
      proteina.add(new Proteina(34,"-  Max Titanium-Top Whey 3W + Sabor Chocolate  900G",147.89,1));
      proteina.add(new Proteina(35,"-  Max Titanium-Whey Blend 900g Nova Fórmula -Baunilha",102.40,1));
      proteina.add(new Proteina(36,"-  Max Titanium-Top Whey 3W + Natural 900G",179.90,1));
      proteina.add(new Proteina(37,"-  Max Titanium-Top Vegan Protein 600g",166.94,1));
      // Produtos Integralmedica 
      proteina.add(new Proteina(38,"-  Integralmedica -MY WHEY – High quality protein powder 900g",107.92,1));
      proteina.add(new Proteina(39,"-  Integralmedica -Whey Protein Concentrado Pouch 900g",137.13,1));
      proteina.add(new Proteina(40,"-  Integralmedica -Whey 100% pure | Whey Protein Concentrado - pote 450g",54.95,1));
      proteina.add(new Proteina(41,"-  Integralmedica -Whey Protein Concentrado 900g",146.19,1));
      proteina.add(new Proteina(42,"-  Integralmedica -Whey Protein Isolado 900g",227.92,1));
      proteina.add(new Proteina(43,"-  Integralmedica -Iso Triple Zero | Whey Protein Isolado 1,8Kg",404.92,1));
   }

public List<Proteina> getProteina() {
   return proteina;
}

public void setProteina(List<Proteina> proteina) {
   this.proteina = proteina;
}

}