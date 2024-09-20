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
                   System.out.println("Mostrando as opções de produtos");
                   System.out.println("1- Proteinas.");
                   System.out.println("2- Aminoacidos ");
                   System.out.println("3- Hipercaloricos.");
                   System.out.println("4- Vitaminas.");
                   System.out.println("5- Termogenicos.");
                   System.out.println("6- Pre-treíno.");
                   System.out.println("7- Voltar");
                   System.out.println("O- Sair");
                    int intEscolido = sc.nextInt();
                    switch (intEscolido) {
                        case 1:
                            prateleiras.listatodosAmino();
                            break;
                        case 2:
                           prateleiras.listtodosProtei();
                            break;
                        case 3:
                            prateleiras.listtodosHiper();
                            break;
                        case 4:
                            prateleiras.listatodosVita();
                            break;
                        case 5:
                            prateleiras.listatodosTermo();
                            break;
                        case 6:
                            prateleiras.lidtatodosPretei();
                            break;
                        case 7:
                        System.out.println("Voltando");
                        case 0:
                        Escolhas.setEscolha(intEscolido);
                        System.out.println("Tenha um bom dia");
                        break;
                        default:
                        System.out.println("Erro");
                            break;
                    }
                    
                    break;
             
                default:
                    break;
             }

        }while(Escolhas.getEscolha()!= 0);
    }
    
}
