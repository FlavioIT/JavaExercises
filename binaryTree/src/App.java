import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        int option;
        
        System.out.println("Pressione o número juntamente com a tecla enter para acessar a opção desejada:");
        System.out.println("1-Criar árvore binária");
        System.out.println("2-Inserir valores");

        do{
            option = scn.nextInt();
            switch(option){
                case 1:
                    bt.deleteTree(bt.root);
                    System.out.println("Árvore binária criada!\nDados antigos foram sobrepostos.");
                    break;
                case 2:
                    System.out.println("Quantos valores deseja inserir à árvore?");
                    int numValores = scn.nextInt();
                    System.out.println("Insira o(s) valor(es) desejados(a cada valor inserido, pressione a tecla enter):");
                    for(int i = 0; i < numValores; i++){
                        int valorAdd = scn.nextInt();
                        bt.add(valorAdd);
                    }
                    break;
                case 0:
                    System.out.println("Sistema finalizado!");
                    break;
                default:
                    break;
            }
        }while(option != 0);
        scn.close();
    }  
}
