package projetoSupplements;
import java.util.ArrayList;
import java.util.List;
 public class Termogenicos  extends Itens
{

   List<Itens> termogenicos = new ArrayList<>();
   public Termogenicos( int item,String produto, double preco ,int quantidade){
      super(item,produto, preco , quantidade );
    
   }
   public void arrayTermo()
   {
       // Produtos Growth 
       termogenicos.add(new Termogenicos(0,"- Growth Supplements-HOT Termogênico (60 Comprimidos) -",37.80,1));
       termogenicos.add(new Termogenicos(1,"- Growth Supplements-Óleo de Cártamo + Coco + Chia + Cromo + Vit. E (75 caps) -",27.00,1));
       termogenicos.add(new Termogenicos(2,"- Growth Supplements-L-Carnitina Líquida 2000 - 420ml -",42.30,1));
       termogenicos.add(new Termogenicos(3,"- Growth Supplements-Gengibre em po 250gr -",21.60,1));
       // Produtos Max titanium 
       termogenicos.add(new Termogenicos(4,"- Max Titanium-Shot Dry 150g -",98.56,1));
       termogenicos.add(new Termogenicos(5,"- Max Titanium-2Hot 200G -",87.18 ,1));
       termogenicos.add(new Termogenicos(6,"- Max Titanium-Fire Black 60 Caps-",34.87 ,1));
       termogenicos.add(new Termogenicos(7,"- Max Titanium-Shot Thermo Max 60 Cáps-",69.84 ,1));
       termogenicos.add(new Termogenicos(8,"- Max Titanium-L Carnitina 60 Caps-",90.94 ,1));
       termogenicos.add(new Termogenicos(9,"- Max Titanium-Fire White 60 Caps-",29.88 ,1));
       termogenicos.add(new Termogenicos(10,"- Max Titanium-L-Carnitine Pure 400Ml-",83.39 ,1));
       // Produto Integrelmedica
       termogenicos.add(new Termogenicos(11,"- Integralmedica-Therma Pro Hardcore-",47.92 ,1));
       termogenicos.add(new Termogenicos(12,"- Integralmedica-Lipo Dry-",107.91 ,1));
       termogenicos.add(new Termogenicos(13,"- Integralmedica-H2OUT - DIURETIC-",78.21 ,1));
        
   }
   public List<Itens> getTermogenicos() {
      return termogenicos;
   }
   public void setTermogenicos(List<Itens> termogenicos) {
      this.termogenicos = termogenicos;
   }
}