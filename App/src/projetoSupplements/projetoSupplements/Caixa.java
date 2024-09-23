package projetoSupplements;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Caixa {
    private Escolhas escolhas = new Escolhas(0, 0, 0);
    private  static Date date = new Date();
    private  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaa HH:mm:ss");
    private static String endereco;
    private static String cpf;
    public Caixa(String endereco,String cpf )
    {
        this.endereco= endereco;
        this.cpf = cpf;
    }
    public static void MostraCaixa()
    {
      
        Scanner sc= new Scanner(System.in);
              if(Escolhas.getSomaProco() != 0 )
        {
           System.out.println("Digite seu CPF:");
            cpf = sc.nextLine();
            System.out.println("Digite seu endereço:");
            endereco= sc.nextLine();
        if(endereco != null && cpf != null)

        {
            System.out.println(" Qual a formade de pagamento ");
            System.out.println("1- Pix.");
            System.out.println("2- Creditor.");
            System.out.println("3-Débito.");
            System.out.println("4- Dinhero físico.");
            int cartao= sc.nextInt();
            switch (cartao) {
                case 1:
                     System.out.println("Date é hora da compra:"+  sdf.format(date));
                      System.out.println("Quantedade: "+Escolhas.getSomaQuantidade());
                      System.out.println("Total: "+Escolhas.getSomaProco() );
                      
                    
                    break;
                case 2:
                System.out.println("Date é hora da compra:"+  sdf.format(date));
                    System.out.println("Quantas vezes quer dividir:");
                     double dividir= sc.nextDouble();
                     System.out.println("Quantedade: "+Escolhas.getSomaQuantidade());
                     System.out.println("Total: "+Escolhas.getSomaProco());
                     System.out.println("Vezes: "+dividir);
                    System.out.println("Total: R$"+ Escolhas.getSomaProco( )/ dividir );
                    break;
                case 3:
                System.out.println("Date é hora da compra:"+  sdf.format(date));
                System.out.println("Quantedade: "+Escolhas.getSomaQuantidade());
                System.out.println("Total: "+Escolhas.getSomaProco());
                    break;
                case 4:
                System.out.println("Date é hora da compra:"+  sdf.format(date));
                System.out.println("Quantedade: "+Escolhas.getSomaQuantidade());
                System.out.println("Total: "+Escolhas.getSomaProco());
                    break;
                default:
                    break;
            }
        }
        }
        else{
           System.out.println("Bye...");
        }
     
    }
}
