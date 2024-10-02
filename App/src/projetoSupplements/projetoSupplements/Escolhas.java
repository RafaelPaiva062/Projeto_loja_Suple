package projetoSupplements;

import java.util.List;
import java.util.Scanner;

public class Escolhas {
    private static final Itens Itens = null;
    private static Proteina pProteina = new Proteina(0, "", 0.0, 0);
    private static  Aminoacidos aminoacidosInstance = new Aminoacidos(0, "", 0.0, 0);
    private static   Hipecalorico hipecalorico = new Hipecalorico(0, "", 0.0, 0);
    private static  Vitaminas vitaminas = new Vitaminas(0, "", 0.0, 0);
    private  static Termogenicos termogeni = new Termogenicos(0, "", 0.0, 0);
    private static Pretreinos pretreinos = new Pretreinos(0, "", 0.0, 0);
    private static   CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    private static int escolha = 0;
    private static int somaQuantidade = 0;
    private static int somaProco;
    private static String getSomaQuantidade;
    public Escolhas(int escolha, int somaQuantidade,int somaProco ) {
        this.escolha = escolha;
        this.somaQuantidade = somaQuantidade;
        this.somaProco =somaProco;
    }

    public static int getEscolha() {
        return escolha;
    }

    public static void setEscolha(int escolha) {
        Escolhas.escolha = escolha;
    }

    public static int getSomaQuantidade() {
        return somaQuantidade;
    }

    public void setSomaQuantidade(int somaQuantidade) {
        this.somaQuantidade = somaQuantidade;
    }
     
    public static int getSomaProco() {
        return somaProco;
    }

    public void setSomaProco(int somaProco) {
        this.somaProco = somaProco;
    } 

    public static void Mostrador() {
        Prateleiras prateleiras = new Prateleiras();
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-Vindo(a) a o nosso SuperMercado SuplerMentos:");
        do {
           
            System.out.println("Digite sua preferencia de escolha:");
            System.out.println("1- Ver todos as categorias.");
            System.out.println("2-Mostra compras em andamento");
            System.out.println("3- Remover compras");
            System.out.println("O-Sair");
            int esco = sc.nextInt();
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
                            prateleiras.listtodosProtei();
                            System.out.println("Qual item vai querer");
                            int itenEs = sc.nextInt();
                            switch(itenEs)
                            {
                                
                                case 0:
                                pProteina.arrayProteina();
                                List<Proteina> listaProteinas = pProteina.getProteina(); 
                                Proteina proteinaEscolhida = listaProteinas.get(itenEs);
                                carrinho.adicionarItem(proteinaEscolhida);
                                // Atualiza os totais de preço e quantidade
                                somaProco += proteinaEscolhida.getPreco();
                                somaQuantidade += proteinaEscolhida.getQuantidade();
                                break;
                                case 1:
                                pProteina.arrayProteina();
                                List<Proteina> listaProteinas1 = pProteina.getProteina(); 
                                Proteina proteinaEscolhida1 = listaProteinas1.get(itenEs);
                                carrinho.adicionarItem(proteinaEscolhida1);
                                somaProco += proteinaEscolhida1.getPreco();
                                somaQuantidade += proteinaEscolhida1.getQuantidade();
                                break;

                              case 2:
                                pProteina.arrayProteina();
                                List<Proteina> listaProteinas2 = pProteina.getProteina(); 
                                Proteina proteinaEscolhida2 = listaProteinas2.get(itenEs);
                                carrinho.adicionarItem(proteinaEscolhida2);
                                somaProco += proteinaEscolhida2.getPreco();
                                somaQuantidade += proteinaEscolhida2.getQuantidade();
                                break;

                            case 3:
                                pProteina.arrayProteina();
                                List<Proteina> listaProteinas3 = pProteina.getProteina(); 
                                Proteina proteinaEscolhida3 = listaProteinas3.get(itenEs);
                                carrinho.adicionarItem(proteinaEscolhida3);
                                somaProco += proteinaEscolhida3.getPreco();
                                somaQuantidade += proteinaEscolhida3.getQuantidade();
                                break;

                            case 4:
                                pProteina.arrayProteina();
                                List<Proteina> listaProteinas4 = pProteina.getProteina(); 
                                Proteina proteinaEscolhida4 = listaProteinas4.get(itenEs);
                                carrinho.adicionarItem(proteinaEscolhida4);
                                somaProco += proteinaEscolhida4.getPreco();
                                somaQuantidade += proteinaEscolhida4.getQuantidade();
                                break;

                            case 5:
                                pProteina.arrayProteina();
                                List<Proteina> listaProteinas5 = pProteina.getProteina(); 
                                Proteina proteinaEscolhida5 = listaProteinas5.get(itenEs);
                                carrinho.adicionarItem(proteinaEscolhida5);
                                somaProco += proteinaEscolhida5.getPreco();
                                somaQuantidade += proteinaEscolhida5.getQuantidade();
                                break;

                            case 6:
                                pProteina.arrayProteina();
                                List<Proteina> listaProteinas6 = pProteina.getProteina(); 
                                Proteina proteinaEscolhida6 = listaProteinas6.get(itenEs);
                                carrinho.adicionarItem(proteinaEscolhida6);
                                somaProco += proteinaEscolhida6.getPreco();
                                somaQuantidade += proteinaEscolhida6.getQuantidade();
                                break;

                            case 7:
                                pProteina.arrayProteina();
                                List<Proteina> listaProteinas7 = pProteina.getProteina(); 
                                Proteina proteinaEscolhida7 = listaProteinas7.get(itenEs);
                                carrinho.adicionarItem(proteinaEscolhida7);
                                somaProco += proteinaEscolhida7.getPreco();
                                somaQuantidade += proteinaEscolhida7.getQuantidade();
                                break;

                            case 8:
                                pProteina.arrayProteina();
                                List<Proteina> listaProteinas8 = pProteina.getProteina(); 
                                Proteina proteinaEscolhida8 = listaProteinas8.get(itenEs);
                                carrinho.adicionarItem(proteinaEscolhida8);
                                somaProco += proteinaEscolhida8.getPreco();
                                somaQuantidade += proteinaEscolhida8.getQuantidade();
                                break;

                            case 9:
                                pProteina.arrayProteina();
                                List<Proteina> listaProteinas9 = pProteina.getProteina(); 
                                Proteina proteinaEscolhida9 = listaProteinas9.get(itenEs);
                                carrinho.adicionarItem(proteinaEscolhida9);
                                somaProco += proteinaEscolhida9.getPreco();
                                somaQuantidade += proteinaEscolhida9.getQuantidade();
                                break;

                            case 10:
                                pProteina.arrayProteina();
                                List<Proteina> listaProteinas10 = pProteina.getProteina(); 
                                Proteina proteinaEscolhida10 = listaProteinas10.get(itenEs);
                                carrinho.adicionarItem(proteinaEscolhida10);
                                somaProco += proteinaEscolhida10.getPreco();
                                somaQuantidade += proteinaEscolhida10.getQuantidade();
                                break;
                               
                                    case 11:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas11 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida11 = listaProteinas11.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida11);
                                        somaProco += proteinaEscolhida11.getPreco();
                                        somaQuantidade += proteinaEscolhida11.getQuantidade();
                                        break;
                                
                                    case 12:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas12 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida12 = listaProteinas12.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida12);
                                        somaProco += proteinaEscolhida12.getPreco();
                                        somaQuantidade += proteinaEscolhida12.getQuantidade();
                                        break;
                                
                                    case 13:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas13 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida13 = listaProteinas13.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida13);
                                        somaProco += proteinaEscolhida13.getPreco();
                                        somaQuantidade += proteinaEscolhida13.getQuantidade();
                                        break;
                                
                                    case 14:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas14 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida14 = listaProteinas14.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida14);
                                        somaProco += proteinaEscolhida14.getPreco();
                                        somaQuantidade += proteinaEscolhida14.getQuantidade();
                                        break;
                                
                                    case 15:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas15 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida15 = listaProteinas15.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida15);
                                        somaProco += proteinaEscolhida15.getPreco();
                                        somaQuantidade += proteinaEscolhida15.getQuantidade();
                                        break;
                                
                                    case 16:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas16 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida16 = listaProteinas16.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida16);
                                        somaProco += proteinaEscolhida16.getPreco();
                                        somaQuantidade += proteinaEscolhida16.getQuantidade();
                                        break;
                                
                                    case 17:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas17 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida17 = listaProteinas17.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida17);
                                        somaProco += proteinaEscolhida17.getPreco();
                                        somaQuantidade += proteinaEscolhida17.getQuantidade();
                                        break;
                                
                                    case 18:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas18 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida18 = listaProteinas18.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida18);
                                        somaProco += proteinaEscolhida18.getPreco();
                                        somaQuantidade += proteinaEscolhida18.getQuantidade();
                                        break;
                                
                                    case 19:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas19 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida19 = listaProteinas19.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida19);
                                        somaProco += proteinaEscolhida19.getPreco();
                                        somaQuantidade += proteinaEscolhida19.getQuantidade();
                                        break;
                                
                                    case 20:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas20 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida20 = listaProteinas20.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida20);
                                        somaProco += proteinaEscolhida20.getPreco();
                                        somaQuantidade += proteinaEscolhida20.getQuantidade();
                                        break;
                                
                                    case 21:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas21 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida21 = listaProteinas21.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida21);
                                        somaProco += proteinaEscolhida21.getPreco();
                                        somaQuantidade += proteinaEscolhida21.getQuantidade();
                                        break;
                                
                                    case 22:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas22 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida22 = listaProteinas22.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida22);
                                        somaProco += proteinaEscolhida22.getPreco();
                                        somaQuantidade += proteinaEscolhida22.getQuantidade();
                                        break;
                                
                                    case 23:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas23 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida23 = listaProteinas23.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida23);
                                        somaProco += proteinaEscolhida23.getPreco();
                                        somaQuantidade += proteinaEscolhida23.getQuantidade();
                                        break;
                                
                                    case 24:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas24 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida24 = listaProteinas24.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida24);
                                        somaProco += proteinaEscolhida24.getPreco();
                                        somaQuantidade += proteinaEscolhida24.getQuantidade();
                                        break;
                                
                                    case 25:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas25 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida25 = listaProteinas25.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida25);
                                        somaProco += proteinaEscolhida25.getPreco();
                                        somaQuantidade += proteinaEscolhida25.getQuantidade();
                                        break;
                                
                                    case 26:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas26 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida26 = listaProteinas26.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida26);
                                        somaProco += proteinaEscolhida26.getPreco();
                                        somaQuantidade += proteinaEscolhida26.getQuantidade();
                                        break;
                                
                                    case 27:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas27 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida27 = listaProteinas27.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida27);
                                        somaProco += proteinaEscolhida27.getPreco();
                                        somaQuantidade += proteinaEscolhida27.getQuantidade();
                                        break;
                                
                                    case 28:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas28 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida28 = listaProteinas28.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida28);
                                        somaProco += proteinaEscolhida28.getPreco();
                                        somaQuantidade += proteinaEscolhida28.getQuantidade();
                                        break;
                                
                                    case 29:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas29 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida29 = listaProteinas29.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida29);
                                        somaProco += proteinaEscolhida29.getPreco();
                                        somaQuantidade += proteinaEscolhida29.getQuantidade();
                                        break;
                                
                                    case 30:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas30 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida30 = listaProteinas30.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida30);
                                        somaProco += proteinaEscolhida30.getPreco();
                                        somaQuantidade += proteinaEscolhida30.getQuantidade();
                                        break;
                                
                                    case 31:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas31 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida31 = listaProteinas31.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida31);
                                        somaProco += proteinaEscolhida31.getPreco();
                                        somaQuantidade += proteinaEscolhida31.getQuantidade();
                                        break;
                                
                                    case 32:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas32 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida32 = listaProteinas32.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida32);
                                        somaProco += proteinaEscolhida32.getPreco();
                                        somaQuantidade += proteinaEscolhida32.getQuantidade();
                                        break;
                                
                                    case 33:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas33 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida33 = listaProteinas33.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida33);
                                        somaProco += proteinaEscolhida33.getPreco();
                                        somaQuantidade += proteinaEscolhida33.getQuantidade();
                                        break;
                                
                                    case 34:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas34 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida34 = listaProteinas34.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida34);
                                        somaProco += proteinaEscolhida34.getPreco();
                                        somaQuantidade += proteinaEscolhida34.getQuantidade();
                                        break;
                                
                                    case 35:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas35 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida35 = listaProteinas35.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida35);
                                        somaProco += proteinaEscolhida35.getPreco();
                                        somaQuantidade += proteinaEscolhida35.getQuantidade();
                                        break;
                                
                                    case 36:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas36 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida36 = listaProteinas36.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida36);
                                        somaProco += proteinaEscolhida36.getPreco();
                                        somaQuantidade += proteinaEscolhida36.getQuantidade();
                                        break;
                                
                                    case 37:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas37 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida37 = listaProteinas37.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida37);
                                        somaProco += proteinaEscolhida37.getPreco();
                                        somaQuantidade += proteinaEscolhida37.getQuantidade();
                                        break;
                                
                                    case 38:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas38 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida38 = listaProteinas38.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida38);
                                        somaProco += proteinaEscolhida38.getPreco();
                                        somaQuantidade += proteinaEscolhida38.getQuantidade();
                                        break;
                                
                                    case 39:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas39 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida39 = listaProteinas39.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida39);
                                        somaProco += proteinaEscolhida39.getPreco();
                                        somaQuantidade += proteinaEscolhida39.getQuantidade();
                                        break;
                                
                                    case 40:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas40 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida40 = listaProteinas40.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida40);
                                        somaProco += proteinaEscolhida40.getPreco();
                                        somaQuantidade += proteinaEscolhida40.getQuantidade();
                                        break;
                                
                                    case 41:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas41 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida41 = listaProteinas41.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida41);
                                        somaProco += proteinaEscolhida41.getPreco();
                                        somaQuantidade += proteinaEscolhida41.getQuantidade();
                                        break;
                                
                                    case 42:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas42 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida42 = listaProteinas42.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida42);
                                        somaProco += proteinaEscolhida42.getPreco();
                                        somaQuantidade += proteinaEscolhida42.getQuantidade();
                                        break;
                                
                                    case 43:
                                        pProteina.arrayProteina();
                                        List<Proteina> listaProteinas43 = pProteina.getProteina(); 
                                        Proteina proteinaEscolhida43 = listaProteinas43.get(itenEs);
                                        carrinho.adicionarItem(proteinaEscolhida43);
                                        somaProco += proteinaEscolhida43.getPreco();
                                        somaQuantidade += proteinaEscolhida43.getQuantidade();
                                        break;
                                
                                    default:
                                        System.out.println("Item não encontrado");
                                        break;
                            }
                            
                        case 2:
                            prateleiras.listatodosAmino();
                            System.out.println("Qual item vai querer");
                            itenEs = sc.nextInt();
                            switch (itenEs) {
                                case 0:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino0 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI0 = listaAmino0.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI0);
                                    somaProco += aminoacidosI0.getPreco();
                                    somaQuantidade += aminoacidosI0.getQuantidade();
                                    break;
                            
                                case 1:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino1 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI1 = listaAmino1.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI1);
                                    somaProco += aminoacidosI1.getPreco();
                                    somaQuantidade += aminoacidosI1.getQuantidade();
                                    break;
                            
                                case 2:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino2 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI2 = listaAmino2.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI2);
                                    somaProco += aminoacidosI2.getPreco();
                                    somaQuantidade += aminoacidosI2.getQuantidade();
                                    break;
                            
                                case 3:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino3 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI3 = listaAmino3.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI3);
                                    somaProco += aminoacidosI3.getPreco();
                                    somaQuantidade += aminoacidosI3.getQuantidade();
                                    break;
                            
                                case 4:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino4 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI4 = listaAmino4.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI4);
                                    somaProco += aminoacidosI4.getPreco();
                                    somaQuantidade += aminoacidosI4.getQuantidade();
                                    break;
                            
                                case 5:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino5 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI5 = listaAmino5.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI5);
                                    somaProco += aminoacidosI5.getPreco();
                                    somaQuantidade += aminoacidosI5.getQuantidade();
                                    break;
                            
                                case 6:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino6 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI6 = listaAmino6.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI6);
                                    somaProco += aminoacidosI6.getPreco();
                                    somaQuantidade += aminoacidosI6.getQuantidade();
                                    break;
                            
                                case 7:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino7 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI7 = listaAmino7.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI7);
                                    somaProco += aminoacidosI7.getPreco();
                                    somaQuantidade += aminoacidosI7.getQuantidade();
                                    break;
                            
                                case 8:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino8 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI8 = listaAmino8.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI8);
                                    somaProco += aminoacidosI8.getPreco();
                                    somaQuantidade += aminoacidosI8.getQuantidade();
                                    break;
                            
                                case 9:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino9 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI9 = listaAmino9.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI9);
                                    somaProco += aminoacidosI9.getPreco();
                                    somaQuantidade += aminoacidosI9.getQuantidade();
                                    break;
                            
                                case 10:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino10 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI10 = listaAmino10.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI10);
                                    somaProco += aminoacidosI10.getPreco();
                                    somaQuantidade += aminoacidosI10.getQuantidade();
                                    break;
                            
                                case 11:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino11 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI11 = listaAmino11.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI11);
                                    somaProco += aminoacidosI11.getPreco();
                                    somaQuantidade += aminoacidosI11.getQuantidade();
                                    break;
                            
                                case 12:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino12 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI12 = listaAmino12.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI12);
                                    somaProco += aminoacidosI12.getPreco();
                                    somaQuantidade += aminoacidosI12.getQuantidade();
                                    break;
                            
                                case 13:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino13 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI13 = listaAmino13.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI13);
                                    somaProco += aminoacidosI13.getPreco();
                                    somaQuantidade += aminoacidosI13.getQuantidade();
                                    break;
                            
                                case 14:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino14 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI14 = listaAmino14.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI14);
                                    somaProco += aminoacidosI14.getPreco();
                                    somaQuantidade += aminoacidosI14.getQuantidade();
                                    break;
                            
                                case 15:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino15 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI15 = listaAmino15.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI15);
                                    somaProco += aminoacidosI15.getPreco();
                                    somaQuantidade += aminoacidosI15.getQuantidade();
                                    break;
                            
                                case 16:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino16 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI16 = listaAmino16.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI16);
                                    somaProco += aminoacidosI16.getPreco();
                                    somaQuantidade += aminoacidosI16.getQuantidade();
                                    break;
                            
                                case 17:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino17 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI17 = listaAmino17.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI17);
                                    somaProco += aminoacidosI17.getPreco();
                                    somaQuantidade += aminoacidosI17.getQuantidade();
                                    break;
                            
                                case 18:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino18 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI18 = listaAmino18.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI18);
                                    somaProco += aminoacidosI18.getPreco();
                                    somaQuantidade += aminoacidosI18.getQuantidade();
                                    break;
                            
                                case 19:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino19 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI19 = listaAmino19.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI19);
                                    somaProco += aminoacidosI19.getPreco();
                                    somaQuantidade += aminoacidosI19.getQuantidade();
                                    break;
                            
                                case 20:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino20 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI20 = listaAmino20.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI20);
                                    somaProco += aminoacidosI20.getPreco();
                                    somaQuantidade += aminoacidosI20.getQuantidade();
                                    break;
                            
                                case 21:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino21 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI21 = listaAmino21.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI21);
                                    somaProco += aminoacidosI21.getPreco();
                                    somaQuantidade += aminoacidosI21.getQuantidade();
                                    break;
                            
                                case 22:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino22 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI22 = listaAmino22.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI22);
                                    somaProco += aminoacidosI22.getPreco();
                                    somaQuantidade += aminoacidosI22.getQuantidade();
                                    break;
                            
                                case 23:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino23 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI23 = listaAmino23.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI23);
                                    somaProco += aminoacidosI23.getPreco();
                                    somaQuantidade += aminoacidosI23.getQuantidade();
                                    break;
                            
                                case 24:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino24 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI24 = listaAmino24.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI24);
                                    somaProco += aminoacidosI24.getPreco();
                                    somaQuantidade += aminoacidosI24.getQuantidade();
                                    break;
                            
                                case 25:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino25 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI25 = listaAmino25.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI25);
                                    somaProco += aminoacidosI25.getPreco();
                                    somaQuantidade += aminoacidosI25.getQuantidade();
                                    break;
                            
                                case 26:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino26 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI26 = listaAmino26.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI26);
                                    somaProco += aminoacidosI26.getPreco();
                                    somaQuantidade += aminoacidosI26.getQuantidade();
                                    break;
                            
                                case 27:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino27 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI27 = listaAmino27.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI27);
                                    somaProco += aminoacidosI27.getPreco();
                                    somaQuantidade += aminoacidosI27.getQuantidade();
                                    break;
                            
                                case 28:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino28 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI28 = listaAmino28.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI28);
                                    somaProco += aminoacidosI28.getPreco();
                                    somaQuantidade += aminoacidosI28.getQuantidade();
                                    break;
                            
                                case 29:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino29 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI29 = listaAmino29.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI29);
                                    somaProco += aminoacidosI29.getPreco();
                                    somaQuantidade += aminoacidosI29.getQuantidade();
                                    break;
                            
                                case 30:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino30 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI30 = listaAmino30.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI30);
                                    somaProco += aminoacidosI30.getPreco();
                                    somaQuantidade += aminoacidosI30.getQuantidade();
                                    break;
                            
                                case 31:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino31 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI31 = listaAmino31.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI31);
                                    somaProco += aminoacidosI31.getPreco();
                                    somaQuantidade += aminoacidosI31.getQuantidade();
                                    break;
                            
                                case 32:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino32 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI32 = listaAmino32.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI32);
                                    somaProco += aminoacidosI32.getPreco();
                                    somaQuantidade += aminoacidosI32.getQuantidade();
                                    break;
                            
                                case 33:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino33 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI33 = listaAmino33.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI33);
                                    somaProco += aminoacidosI33.getPreco();
                                    somaQuantidade += aminoacidosI33.getQuantidade();
                                    break;
                            
                                case 34:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino34 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI34 = listaAmino34.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI34);
                                    somaProco += aminoacidosI34.getPreco();
                                    somaQuantidade += aminoacidosI34.getQuantidade();
                                    break;
                            
                                case 35:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino35 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI35 = listaAmino35.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI35);
                                    somaProco += aminoacidosI35.getPreco();
                                    somaQuantidade += aminoacidosI35.getQuantidade();
                                    break;
                            
                                case 36:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino36 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI36 = listaAmino36.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI36);
                                    somaProco += aminoacidosI36.getPreco();
                                    somaQuantidade += aminoacidosI36.getQuantidade();
                                    break;
                            
                                case 37:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino37 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI37 = listaAmino37.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI37);
                                    somaProco += aminoacidosI37.getPreco();
                                    somaQuantidade += aminoacidosI37.getQuantidade();
                                    break;
                            
                                case 38:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino38 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI38 = listaAmino38.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI38);
                                    somaProco += aminoacidosI38.getPreco();
                                    somaQuantidade += aminoacidosI38.getQuantidade();
                                    break;
                            
                                case 39:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino39 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI39 = listaAmino39.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI39);
                                    somaProco += aminoacidosI39.getPreco();
                                    somaQuantidade += aminoacidosI39.getQuantidade();
                                    break;
                            
                                case 40:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino40 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI40 = listaAmino40.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI40);
                                    somaProco += aminoacidosI40.getPreco();
                                    somaQuantidade += aminoacidosI40.getQuantidade();
                                    break;
                            
                                case 41:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino41 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI41 = listaAmino41.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI41);
                                    somaProco += aminoacidosI41.getPreco();
                                    somaQuantidade += aminoacidosI41.getQuantidade();
                                    break;
                            
                                case 42:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino42 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI42 = listaAmino42.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI42);
                                    somaProco += aminoacidosI42.getPreco();
                                    somaQuantidade += aminoacidosI42.getQuantidade();
                                    break;
                            
                                case 43:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino43 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI43 = listaAmino43.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI43);
                                    somaProco += aminoacidosI43.getPreco();
                                    somaQuantidade += aminoacidosI43.getQuantidade();
                                    break;
                            
                                case 44:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino44 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI44 = listaAmino44.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI44);
                                    somaProco += aminoacidosI44.getPreco();
                                    somaQuantidade += aminoacidosI44.getQuantidade();
                                    break;
                            
                                case 45:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino45 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI45 = listaAmino45.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI45);
                                    somaProco += aminoacidosI45.getPreco();
                                    somaQuantidade += aminoacidosI45.getQuantidade();
                                    break;
                                case 46:
                                    aminoacidosInstance.Amino();
                                    List<Itens> listaAmino46 = aminoacidosInstance.getAminoacidos(); 
                                    Itens aminoacidosI46 = listaAmino46.get(itenEs);
                                    carrinho.adicionarItem(aminoacidosI46);
                                    somaProco += aminoacidosI46.getPreco();
                                    somaQuantidade += aminoacidosI46.getQuantidade();
                                    break;
                                default:
                                    System.out.println("Item não encontrado");
                                    break;
                            }
                            
                            break;
                        case 3:
                            prateleiras.listtodosHiper();                    
                            System.out.println("Qual item vai querer");
                            itenEs = sc.nextInt();
                            switch (itenEs) {
                                case 0:
                                    hipecalorico.arrayHiper();
                                    List<Itens> listaHiper0 = hipecalorico.getHiper(); 
                                    Itens hItens0 = listaHiper0.get(itenEs);
                                    carrinho.adicionarItem(hItens0);
                                    somaProco += hItens0.getPreco();
                                    somaQuantidade += hItens0.getQuantidade();
                                    break;
                            
                                case 1:
                                    hipecalorico.arrayHiper();
                                    List<Itens> listaHiper1 = hipecalorico.getHiper(); 
                                    Itens hItens1 = listaHiper1.get(itenEs);
                                    carrinho.adicionarItem(hItens1);
                                    somaProco += hItens1.getPreco();
                                    somaQuantidade += hItens1.getQuantidade();
                                    break;
                            
                                case 2:
                                    hipecalorico.arrayHiper();
                                    List<Itens> listaHiper2 = hipecalorico.getHiper(); 
                                    Itens hItens2 = listaHiper2.get(itenEs);
                                    carrinho.adicionarItem(hItens2);
                                    somaProco += hItens2.getPreco();
                                    somaQuantidade += hItens2.getQuantidade();
                                    break;
                            
                                case 3:
                                    hipecalorico.arrayHiper();
                                    List<Itens> listaHiper3 = hipecalorico.getHiper(); 
                                    Itens hItens3 = listaHiper3.get(itenEs);
                                    carrinho.adicionarItem(hItens3);
                                    somaProco += hItens3.getPreco();
                                    somaQuantidade += hItens3.getQuantidade();
                                    break;
                            
                                case 4:
                                    hipecalorico.arrayHiper();
                                    List<Itens> listaHiper4 = hipecalorico.getHiper(); 
                                    Itens hItens4 = listaHiper4.get(itenEs);
                                    carrinho.adicionarItem(hItens4);
                                    somaProco += hItens4.getPreco();
                                    somaQuantidade += hItens4.getQuantidade();
                                    break;
                            
                                case 5:
                                    hipecalorico.arrayHiper();
                                    List<Itens> listaHiper5 = hipecalorico.getHiper(); 
                                    Itens hItens5 = listaHiper5.get(itenEs);
                                    carrinho.adicionarItem(hItens5);
                                    somaProco += hItens5.getPreco();
                                    somaQuantidade += hItens5.getQuantidade();
                                    break;
                            
                                case 6:
                                    hipecalorico.arrayHiper();
                                    List<Itens> listaHiper6 = hipecalorico.getHiper(); 
                                    Itens hItens6 = listaHiper6.get(itenEs);
                                    carrinho.adicionarItem(hItens6);
                                    somaProco += hItens6.getPreco();
                                    somaQuantidade += hItens6.getQuantidade();
                                    break;
                            
                                case 7:
                                    hipecalorico.arrayHiper();
                                    List<Itens> listaHiper7 = hipecalorico.getHiper(); 
                                    Itens hItens7 = listaHiper7.get(itenEs);
                                    carrinho.adicionarItem(hItens7);
                                    somaProco += hItens7.getPreco();
                                    somaQuantidade += hItens7.getQuantidade();
                                    break;
                            
                                case 8:
                                    hipecalorico.arrayHiper();
                                    List<Itens> listaHiper8 = hipecalorico.getHiper(); 
                                    Itens hItens8 = listaHiper8.get(itenEs);
                                    carrinho.adicionarItem(hItens8);
                                    somaProco += hItens8.getPreco();
                                    somaQuantidade += hItens8.getQuantidade();
                                    break;
                            
                                case 9:
                                    hipecalorico.arrayHiper();
                                    List<Itens> listaHiper9 = hipecalorico.getHiper(); 
                                    Itens hItens9 = listaHiper9.get(itenEs);
                                    carrinho.adicionarItem(hItens9);
                                    somaProco += hItens9.getPreco();
                                    somaQuantidade += hItens9.getQuantidade();
                                    break;
                            
                                case 10:
                                    hipecalorico.arrayHiper();
                                    List<Itens> listaHiper10 = hipecalorico.getHiper(); 
                                    Itens hItens10 = listaHiper10.get(itenEs);
                                    carrinho.adicionarItem(hItens10);
                                    somaProco += hItens10.getPreco();
                                    somaQuantidade += hItens10.getQuantidade();
                                    break;
                            
                                case 11:
                                    hipecalorico.arrayHiper();
                                    List<Itens> listaHiper11 = hipecalorico.getHiper(); 
                                    Itens hItens11 = listaHiper11.get(itenEs);
                                    carrinho.adicionarItem(hItens11);
                                    somaProco += hItens11.getPreco();
                                    somaQuantidade += hItens11.getQuantidade();
                                    break;
                            
                                default:
                                    System.out.println("Item não encontrado");
                                    break;
                            }
                            
                            break;
                        case 4:
                            prateleiras.listatodosVita();
                            System.out.println("Qual item vai querer");
                            itenEs = sc.nextInt();
                            switch (itenEs) {
                                case 0:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita0 = vitaminas.getVitaminas(); 
                                    Itens vItens0 = listaVita0.get(itenEs);
                                    carrinho.adicionarItem(vItens0);
                                    somaProco += vItens0.getPreco();
                                    somaQuantidade += vItens0.getQuantidade();
                                    break;
                            
                                case 1:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita1 = vitaminas.getVitaminas(); 
                                    Itens vItens1 = listaVita1.get(itenEs);
                                    carrinho.adicionarItem(vItens1);
                                    somaProco += vItens1.getPreco();
                                    somaQuantidade += vItens1.getQuantidade();
                                    break;
                            
                                case 2:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita2 = vitaminas.getVitaminas(); 
                                    Itens vItens2 = listaVita2.get(itenEs);
                                    carrinho.adicionarItem(vItens2);
                                    somaProco += vItens2.getPreco();
                                    somaQuantidade += vItens2.getQuantidade();
                                    break;
                            
                                case 3:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita3 = vitaminas.getVitaminas(); 
                                    Itens vItens3 = listaVita3.get(itenEs);
                                    carrinho.adicionarItem(vItens3);
                                    somaProco += vItens3.getPreco();
                                    somaQuantidade += vItens3.getQuantidade();
                                    break;
                            
                                case 4:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita4 = vitaminas.getVitaminas(); 
                                    Itens vItens4 = listaVita4.get(itenEs);
                                    carrinho.adicionarItem(vItens4);
                                    somaProco += vItens4.getPreco();
                                    somaQuantidade += vItens4.getQuantidade();
                                    break;
                            
                                case 5:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita5 = vitaminas.getVitaminas(); 
                                    Itens vItens5 = listaVita5.get(itenEs);
                                    carrinho.adicionarItem(vItens5);
                                    somaProco += vItens5.getPreco();
                                    somaQuantidade += vItens5.getQuantidade();
                                    break;
                            
                                case 6:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita6 = vitaminas.getVitaminas(); 
                                    Itens vItens6 = listaVita6.get(itenEs);
                                    carrinho.adicionarItem(vItens6);
                                    somaProco += vItens6.getPreco();
                                    somaQuantidade += vItens6.getQuantidade();
                                    break;
                            
                                case 7:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita7 = vitaminas.getVitaminas(); 
                                    Itens vItens7 = listaVita7.get(itenEs);
                                    carrinho.adicionarItem(vItens7);
                                    somaProco += vItens7.getPreco();
                                    somaQuantidade += vItens7.getQuantidade();
                                    break;
                            
                                case 8:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita8 = vitaminas.getVitaminas(); 
                                    Itens vItens8 = listaVita8.get(itenEs);
                                    carrinho.adicionarItem(vItens8);
                                    somaProco += vItens8.getPreco();
                                    somaQuantidade += vItens8.getQuantidade();
                                    break;
                            
                                case 9:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita9 = vitaminas.getVitaminas(); 
                                    Itens vItens9 = listaVita9.get(itenEs);
                                    carrinho.adicionarItem(vItens9);
                                    somaProco += vItens9.getPreco();
                                    somaQuantidade += vItens9.getQuantidade();
                                    break;
                            
                                case 10:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita10 = vitaminas.getVitaminas(); 
                                    Itens vItens10 = listaVita10.get(itenEs);
                                    carrinho.adicionarItem(vItens10);
                                    somaProco += vItens10.getPreco();
                                    somaQuantidade += vItens10.getQuantidade();
                                    break;
                            
                                case 11:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita11 = vitaminas.getVitaminas(); 
                                    Itens vItens11 = listaVita11.get(itenEs);
                                    carrinho.adicionarItem(vItens11);
                                    somaProco += vItens11.getPreco();
                                    somaQuantidade += vItens11.getQuantidade();
                                    break;
                            
                                case 12:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita12 = vitaminas.getVitaminas(); 
                                    Itens vItens12 = listaVita12.get(itenEs);
                                    carrinho.adicionarItem(vItens12);
                                    somaProco += vItens12.getPreco();
                                    somaQuantidade += vItens12.getQuantidade();
                                    break;
                            
                                case 13:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita13 = vitaminas.getVitaminas(); 
                                    Itens vItens13 = listaVita13.get(itenEs);
                                    carrinho.adicionarItem(vItens13);
                                    somaProco += vItens13.getPreco();
                                    somaQuantidade += vItens13.getQuantidade();
                                    break;
                            
                                case 14:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita14 = vitaminas.getVitaminas(); 
                                    Itens vItens14 = listaVita14.get(itenEs);
                                    carrinho.adicionarItem(vItens14);
                                    somaProco += vItens14.getPreco();
                                    somaQuantidade += vItens14.getQuantidade();
                                    break;
                            
                                case 15:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita15 = vitaminas.getVitaminas(); 
                                    Itens vItens15 = listaVita15.get(itenEs);
                                    carrinho.adicionarItem(vItens15);
                                    somaProco += vItens15.getPreco();
                                    somaQuantidade += vItens15.getQuantidade();
                                    break;
                            
                                case 16:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita16 = vitaminas.getVitaminas(); 
                                    Itens vItens16 = listaVita16.get(itenEs);
                                    carrinho.adicionarItem(vItens16);
                                    somaProco += vItens16.getPreco();
                                    somaQuantidade += vItens16.getQuantidade();
                                    break;
                            
                                case 17:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita17 = vitaminas.getVitaminas(); 
                                    Itens vItens17 = listaVita17.get(itenEs);
                                    carrinho.adicionarItem(vItens17);
                                    somaProco += vItens17.getPreco();
                                    somaQuantidade += vItens17.getQuantidade();
                                    break;
                            
                                case 18:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita18 = vitaminas.getVitaminas(); 
                                    Itens vItens18 = listaVita18.get(itenEs);
                                    carrinho.adicionarItem(vItens18);
                                    somaProco += vItens18.getPreco();
                                    somaQuantidade += vItens18.getQuantidade();
                                    break;
                            
                                case 19:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita19 = vitaminas.getVitaminas(); 
                                    Itens vItens19 = listaVita19.get(itenEs);
                                    carrinho.adicionarItem(vItens19);
                                    somaProco += vItens19.getPreco();
                                    somaQuantidade += vItens19.getQuantidade();
                                    break;
                            
                                case 20:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita20 = vitaminas.getVitaminas(); 
                                    Itens vItens20 = listaVita20.get(itenEs);
                                    carrinho.adicionarItem(vItens20);
                                    somaProco += vItens20.getPreco();
                                    somaQuantidade += vItens20.getQuantidade();
                                    break;
                            
                                case 21:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita21 = vitaminas.getVitaminas(); 
                                    Itens vItens21 = listaVita21.get(itenEs);
                                    carrinho.adicionarItem(vItens21);
                                    somaProco += vItens21.getPreco();
                                    somaQuantidade += vItens21.getQuantidade();
                                    break;
                            
                                case 22:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita22 = vitaminas.getVitaminas(); 
                                    Itens vItens22 = listaVita22.get(itenEs);
                                    carrinho.adicionarItem(vItens22);
                                    somaProco += vItens22.getPreco();
                                    somaQuantidade += vItens22.getQuantidade();
                                    break;
                            
                                case 23:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita23 = vitaminas.getVitaminas(); 
                                    Itens vItens23 = listaVita23.get(itenEs);
                                    carrinho.adicionarItem(vItens23);
                                    somaProco += vItens23.getPreco();
                                    somaQuantidade += vItens23.getQuantidade();
                                    break;
                            
                                case 24:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita24 = vitaminas.getVitaminas(); 
                                    Itens vItens24 = listaVita24.get(itenEs);
                                    carrinho.adicionarItem(vItens24);
                                    somaProco += vItens24.getPreco();
                                    somaQuantidade += vItens24.getQuantidade();
                                    break;
                            
                                case 25:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita25 = vitaminas.getVitaminas(); 
                                    Itens vItens25 = listaVita25.get(itenEs);
                                    carrinho.adicionarItem(vItens25);
                                    somaProco += vItens25.getPreco();
                                    somaQuantidade += vItens25.getQuantidade();
                                    break;
                            
                                case 26:
                                    vitaminas.arrayVita();
                                    List<Itens> listaVita26 = vitaminas.getVitaminas(); 
                                    Itens vItens26 = listaVita26.get(itenEs);
                                    carrinho.adicionarItem(vItens26);
                                    somaProco += vItens26.getPreco();
                                    somaQuantidade += vItens26.getQuantidade();
                                    break;
                            
                                default:
                                    System.out.println("Item não encontrado");
                                    break;
                            }
                            
                            break;
                        case 5:
                            prateleiras.listatodosTermo();
                            System.out.println("Qual item vai querer");
                            itenEs = sc.nextInt();
                            switch (itenEs) {
                                case 0:
                                    termogeni.arrayTermo();
                                    List<Itens> listatermo0 = termogeni.getTermogenicos(); 
                                    Itens tItens0 = listatermo0.get(itenEs);
                                    carrinho.adicionarItem(tItens0);
                                    somaProco += tItens0.getPreco();
                                    somaQuantidade += tItens0.getQuantidade();
                                    break;
                            
                                case 1:
                                    termogeni.arrayTermo();
                                    List<Itens> listatermo1 = termogeni.getTermogenicos(); 
                                    Itens tItens1 = listatermo1.get(itenEs);
                                    carrinho.adicionarItem(tItens1);
                                    somaProco += tItens1.getPreco();
                                    somaQuantidade += tItens1.getQuantidade();
                                    break;
                            
                                case 2:
                                    termogeni.arrayTermo();
                                    List<Itens> listatermo2 = termogeni.getTermogenicos(); 
                                    Itens tItens2 = listatermo2.get(itenEs);
                                    carrinho.adicionarItem(tItens2);
                                    somaProco += tItens2.getPreco();
                                    somaQuantidade += tItens2.getQuantidade();
                                    break;
                            
                                case 3:
                                    termogeni.arrayTermo();
                                    List<Itens> listatermo3 = termogeni.getTermogenicos(); 
                                    Itens tItens3 = listatermo3.get(itenEs);
                                    carrinho.adicionarItem(tItens3);
                                    somaProco += tItens3.getPreco();
                                    somaQuantidade += tItens3.getQuantidade();
                                    break;
                            
                                case 4:
                                    termogeni.arrayTermo();
                                    List<Itens> listatermo4 = termogeni.getTermogenicos(); 
                                    Itens tItens4 = listatermo4.get(itenEs);
                                    carrinho.adicionarItem(tItens4);
                                    somaProco += tItens4.getPreco();
                                    somaQuantidade += tItens4.getQuantidade();
                                    break;
                            
                                case 5:
                                    termogeni.arrayTermo();
                                    List<Itens> listatermo5 = termogeni.getTermogenicos(); 
                                    Itens tItens5 = listatermo5.get(itenEs);
                                    carrinho.adicionarItem(tItens5);
                                    somaProco += tItens5.getPreco();
                                    somaQuantidade += tItens5.getQuantidade();
                                    break;
                            
                                case 6:
                                    termogeni.arrayTermo();
                                    List<Itens> listatermo6 = termogeni.getTermogenicos(); 
                                    Itens tItens6 = listatermo6.get(itenEs);
                                    carrinho.adicionarItem(tItens6);
                                    somaProco += tItens6.getPreco();
                                    somaQuantidade += tItens6.getQuantidade();
                                    break;
                            
                                case 7:
                                    termogeni.arrayTermo();
                                    List<Itens> listatermo7 = termogeni.getTermogenicos(); 
                                    Itens tItens7 = listatermo7.get(itenEs);
                                    carrinho.adicionarItem(tItens7);
                                    somaProco += tItens7.getPreco();
                                    somaQuantidade += tItens7.getQuantidade();
                                    break;
                            
                                case 8:
                                    termogeni.arrayTermo();
                                    List<Itens> listatermo8 = termogeni.getTermogenicos(); 
                                    Itens tItens8 = listatermo8.get(itenEs);
                                    carrinho.adicionarItem(tItens8);
                                    somaProco += tItens8.getPreco();
                                    somaQuantidade += tItens8.getQuantidade();
                                    break;
                            
                                case 9:
                                    termogeni.arrayTermo();
                                    List<Itens> listatermo9 = termogeni.getTermogenicos(); 
                                    Itens tItens9 = listatermo9.get(itenEs);
                                    carrinho.adicionarItem(tItens9);
                                    somaProco += tItens9.getPreco();
                                    somaQuantidade += tItens9.getQuantidade();
                                    break;
                            
                                case 10:
                                    termogeni.arrayTermo();
                                    List<Itens> listatermo10 = termogeni.getTermogenicos(); 
                                    Itens tItens10 = listatermo10.get(itenEs);
                                    carrinho.adicionarItem(tItens10);
                                    somaProco += tItens10.getPreco();
                                    somaQuantidade += tItens10.getQuantidade();
                                    break;
                            
                                case 11:
                                    termogeni.arrayTermo();
                                    List<Itens> listatermo11 = termogeni.getTermogenicos(); 
                                    Itens tItens11 = listatermo11.get(itenEs);
                                    carrinho.adicionarItem(tItens11);
                                    somaProco += tItens11.getPreco();
                                    somaQuantidade += tItens11.getQuantidade();
                                    break;
                            
                                case 12:
                                    termogeni.arrayTermo();
                                    List<Itens> listatermo12 = termogeni.getTermogenicos(); 
                                    Itens tItens12 = listatermo12.get(itenEs);
                                    carrinho.adicionarItem(tItens12);
                                    somaProco += tItens12.getPreco();
                                    somaQuantidade += tItens12.getQuantidade();
                                    break;
                            
                                case 13:
                                    termogeni.arrayTermo();
                                    List<Itens> listatermo13 = termogeni.getTermogenicos(); 
                                    Itens tItens13 = listatermo13.get(itenEs);
                                    carrinho.adicionarItem(tItens13);
                                    somaProco += tItens13.getPreco();
                                    somaQuantidade += tItens13.getQuantidade();
                                    break;
                            
                                default:
                                    System.out.println("Item não encontrado");
                                    break;
                            }
                            
                            break;
                        case 6:
                            prateleiras.lidtatodosPretei();
                            System.out.println("Qual item vai querer");
                            itenEs = sc.nextInt();
                            switch (itenEs) {
                                case 0:
                                    pretreinos.arrayPret();
                                    List<Itens> listaPre0 = pretreinos.getPretreino(); 
                                    Itens preItens0 = listaPre0.get(itenEs);
                                    carrinho.adicionarItem(preItens0);
                                    somaProco += preItens0.getPreco();
                                    somaQuantidade += preItens0.getQuantidade();
                                    break;
                            
                                case 1:
                                    pretreinos.arrayPret();
                                    List<Itens> listaPre1 = pretreinos.getPretreino(); 
                                    Itens preItens1 = listaPre1.get(itenEs);
                                    carrinho.adicionarItem(preItens1);
                                    somaProco += preItens1.getPreco();
                                    somaQuantidade += preItens1.getQuantidade();
                                    break;
                            
                                case 2:
                                    pretreinos.arrayPret();
                                    List<Itens> listaPre2 = pretreinos.getPretreino(); 
                                    Itens preItens2 = listaPre2.get(itenEs);
                                    carrinho.adicionarItem(preItens2);
                                    somaProco += preItens2.getPreco();
                                    somaQuantidade += preItens2.getQuantidade();
                                    break;
                            
                                case 3:
                                    pretreinos.arrayPret();
                                    List<Itens> listaPre3 = pretreinos.getPretreino(); 
                                    Itens preItens3 = listaPre3.get(itenEs);
                                    carrinho.adicionarItem(preItens3);
                                    somaProco += preItens3.getPreco();
                                    somaQuantidade += preItens3.getQuantidade();
                                    break;
                            
                                case 4:
                                    pretreinos.arrayPret();
                                    List<Itens> listaPre4 = pretreinos.getPretreino(); 
                                    Itens preItens4 = listaPre4.get(itenEs);
                                    carrinho.adicionarItem(preItens4);
                                    somaProco += preItens4.getPreco();
                                    somaQuantidade += preItens4.getQuantidade();
                                    break;
                            
                                case 5:
                                    pretreinos.arrayPret();
                                    List<Itens> listaPre5 = pretreinos.getPretreino(); 
                                    Itens preItens5 = listaPre5.get(itenEs);
                                    carrinho.adicionarItem(preItens5);
                                    somaProco += preItens5.getPreco();
                                    somaQuantidade += preItens5.getQuantidade();
                                    break;
                            
                                case 6:
                                    pretreinos.arrayPret();
                                    List<Itens> listaPre6 = pretreinos.getPretreino(); 
                                    Itens preItens6 = listaPre6.get(itenEs);
                                    carrinho.adicionarItem(preItens6);
                                    somaProco += preItens6.getPreco();
                                    somaQuantidade += preItens6.getQuantidade();
                                    break;
                            
                                default:
                                    System.out.println("Item não encontrado");
                                    break;
                            }
                            
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
                 case 2:
                 carrinho.mostrarCarrinho();
                 break;
                 case 3:
                 System.out.println("Qual item deseja remover? (Digite o índice)");
                 int indexRemover = sc.nextInt(); // Obtenha o índice do item a ser removido
                 Itens itemParaRemover = carrinho.getItemPorIndice(indexRemover); // Método que você deve implementar
                 carrinho.removerItem(itemParaRemover);
                 break;
                default:
                    break;
            }
        } while (Escolhas.getEscolha() != 0);
        Caixa.MostraCaixa();
    }
}
