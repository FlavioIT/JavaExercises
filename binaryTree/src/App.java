import java.util.Scanner;

public class App {

    public static void treeErrorMsg() {
        System.out.println("Favor criar a árvore antes de utilizar esta opção!");
    };

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        int option;
        boolean arvore = false;

        do {
            System.out.println("Pressione o número juntamente com a tecla enter para acessar a opção desejada:");
            System.out.println("1-Criar árvore binária");
            System.out.println("2-Inserir valores");
            System.out.println("3-Remover item");
            System.out.println("4-Pesquisar valor");
            System.out.println("5-Verificar árvore");
            System.out.println("0-Sair");
            option = scn.nextInt();
            switch (option) {
                case 1:
                    if (arvore == false) {
                        System.out.println("Árvore binária criada!");
                        arvore = true;
                    } else {
                        treeErrorMsg();
                    }
                    break;
                case 2:
                    if (arvore == true) {
                        System.out.println("Quantos valores deseja inserir à árvore?");
                        int numValores = scn.nextInt();
                        System.out.println(
                                "Insira o(s) valor(es) desejados(a cada valor inserido, pressione a tecla enter):");
                        for (int i = 0; i < numValores; i++) {
                            int valorAdd = scn.nextInt();
                            bt.add(valorAdd);
                        }
                    } else {
                        treeErrorMsg();
                    }
                    break;
                case 3:
                    if (arvore == true) {
                        System.out.println("Insira o valor que deseja remover:");
                        int valorDelete = scn.nextInt();
                        bt.delete(valorDelete);
                        System.out.println("Valor removido!");
                    } else {
                        treeErrorMsg();
                    }
                    break;
                case 4: 
                    if (arvore == true){
                        System.out.println("Insira o valor que deseja pesquisar:");
                        int valorPesquisa = scn.nextInt();
                        if(bt.containsNode(valorPesquisa) == true){
                            System.out.println("Valor encontrado na árvore!");
                        }else{
                            System.out.println("Valor não contido na árvore!");
                        }
                    }else{
                        treeErrorMsg();
                    }
                    break;
                case 5:
                    if (arvore == true){

                    }else{
                        treeErrorMsg();
                    }
                case 0:
                    System.out.println("Sistema finalizado!");
                    break;
                default:
                    break;
            }
        } while (option != 0);
        scn.close();
    }
}
