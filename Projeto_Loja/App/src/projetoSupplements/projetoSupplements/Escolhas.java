package projetoSupplements;
import java.util.Scanner;
public class Escolhas {
    private static int escolha = 0 ;
    private int somaQuantidade =0 ;
    public Escolhas (int escolha , int somaQuantidade)
    {
        this.escolha = escolha;
        this.somaQuantidade = somaQuantidade;
    }
    public static int getEscolha() {
        return escolha;
    }
    public static void setEscolha(int escolha) {
        Escolhas.escolha = escolha;
    }
    public int getSomaQuantidade() {
        return somaQuantidade;
    }
    public void setSomaQuantidade(int somaQuantidade) {
        this.somaQuantidade = somaQuantidade;
    }
    public static void Mostrador()
    {
        Escolhas.getEscolha();
        Prateleiras prateleiras = new Prateleiras();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-Vindo(a) a o nosso SuperMercado SuplerMentos:");
        do
        {
            System.out.println("Digite sua preferencia de escolha:");
            System.out.println("1- Ver todos as categorias.");
            System.out.println("2-Ver tipos de Marcas e seu produtos");
            System.out.println("3- Verja se é cadrastrado.");
            System.out.println("O-Sair");
            int esco =sc.nextInt();
            Escolhas.setEscolha(esco);
             switch (esco) {
                case 1:
                   
                    
                    break;
             
                default:
                    break;
             }

        }while(Escolhas.getEscolha()!= 0);
    }
    
}
