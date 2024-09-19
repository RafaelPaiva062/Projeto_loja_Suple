package projetoSupplements;
import java.util.ArrayList;
import java.util.List;


class Vitaminas  extends Itens
{
   private List<Itens> vitaminas = new ArrayList<>();
   public Vitaminas( int item,String produto, double preco ,int quantidade){
      super(item,produto, preco , quantidade );
      
     }
     public void arrayVita()
     {
      vitaminas.add(new Vitaminas(0,"- Growth Supplements-Multivitamínico (120 cáps) (nova fórmula)- ",36.90,1));
      vitaminas.add(new Vitaminas(1,"- Growth Supplements-Óleo de Peixe Ultra (75 softgel) - ",42.30,1));
      vitaminas.add(new Vitaminas(2,"- Growth Supplements-Vitamina D ULTRA (2000UI) 120 caps  - ",27.00,1));
      vitaminas.add(new Vitaminas(3,"- Growth Supplements-Vitamina B12 com 120 cápsulas -",19.80,1));
      vitaminas.add(new Vitaminas(4,"- Growth Supplements-Cloreto de Magnésio 120 comp -",18.00,1));
      vitaminas.add(new Vitaminas(5,"- Growth Supplements-Coenzima Q10 -",31.50,1));
      vitaminas.add(new Vitaminas(6,"- Growth Supplements- Vitamina C (120 caps)-",14.40,1));
      vitaminas.add(new Vitaminas(7,"- Growth Supplements-ZMA (120 caps)-",22.68,1));
      vitaminas.add(new Vitaminas(8,"- Growth Supplements-Vitamina C + Zinco Efervescente Tubete c/ 10 Tabs -",7.20,1));
      vitaminas.add(new Vitaminas(8,"- Growth Supplements-Polivitamínico Mastigável 120Comp -",23.40,1));
      vitaminas.add(new Vitaminas(9,"- Growth Supplements-Vitamina K2 60 Cápsulas -",19.80,1));
      vitaminas.add(new Vitaminas(10,"- Growth Supplements-NAC (N-ACETIL L-CISTEÍNA) 60CAPS-",36.00,1));
      vitaminas.add(new Vitaminas(11,"- Growth Supplements-Growth Skin 345g (Colágeno tipo 1 + Colágeno VERISOL&reg; + Ácido Hialurônico + Vitamina C) -",88.20,1));
      vitaminas.add(new Vitaminas(12,"- Growth Supplements-Vitamina D (75 cápsulas)-",13.50,1));
      vitaminas.add(new Vitaminas(13,"- Growth Supplements-Óleo de Cártamo + Coco + Chia + Cromo + Vit. E (75 caps) -",27.00,1));
      vitaminas.add(new Vitaminas(14,"- Growth Supplements-Cálcio + Vitamina D + Vitamina K - 120 comp -",63.00,1));
      vitaminas.add(new Vitaminas(15,"- Growth Supplements-Picolinato de Cromo 120caps-",18.00,1));
      vitaminas.add(new Vitaminas(16,"- Growth Supplements-HAIR SKIN GUMMY 30UN-",36.00,1));
      vitaminas.add(new Vitaminas(17,"- Growth Supplements-Vitamina E (75caps)-",13.50,1));
       // Produtos Max titanium  
      vitaminas.add(new Vitaminas(18,"- Max Titanium-Omega 3 90 Caps-",56.85,1));
      vitaminas.add(new Vitaminas(19,"- Max Titanium-Multimax Complex 90 Caps-",56.85,1));
      vitaminas.add(new Vitaminas(20,"- Max Titanium- Vitamina D3 60 Caps",60.62,1));
      vitaminas.add(new Vitaminas(21,"- Max Titanium- Vitamina C 500Mg-",48.40,1));
      vitaminas.add(new Vitaminas(22,"- Max Titanium- CA - Óleo de Cártamo 120 Caps-",63.85,1));
      // Produtos Integralmedica 
      vitaminas.add(new Vitaminas(23,"- Integralmedica-ZMA Testo Booster-",39.92,1));
      vitaminas.add(new Vitaminas(24,"- Integralmedica- VitaPure Super-",72.12,1));
      vitaminas.add(new Vitaminas(25,"- Integralmedica- 4 Sleep Night Time Recovery-",53.32,1));
      vitaminas.add(new Vitaminas(26,"- Integralmedica- Reforz- C Immunity-",90.12,1));
    
     }
   public List<Itens> getVitaminas() {
      return vitaminas;
   }
   public void setVitaminas(List<Itens> vitaminas) {
      this.vitaminas = vitaminas;
   }
}