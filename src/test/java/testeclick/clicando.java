package testeclick;
import java.util.Scanner;
public class clicando {
	

		    public static void main(String[] args) {
	        Scanner menu = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("##--Teste Estrutura de Menu--##\n");
	            System.out.println("|-----------------------------|");
	            System.out.println("| Opção 1 - Novo Cadastro     |");
	            System.out.println("| Opção 2 - Clientes          |");
	            System.out.println("| Opção 3 - Produtos          |");
	            System.out.println("| Opção 4 - Sair              |");
	            System.out.println("|-----------------------------|");

	            System.out.print("Digite uma opção: ");
	            opcao = menu.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.println("\nOpção Novo Cadastro Selecionado");
	                    break;
	                case 2:
	                    System.out.println("\nOpção Clientes Selecionado");
	                    break;
	                case 3:
	                    System.out.println("\nOpção Produtos Selecionado");
	                    break;
	                case 4:
	                    System.out.println("\nAté logo!");
	                    break;
	                default:
	                    System.out.println("\nOpção Inválida!");
	            }
	        } while (opcao != 4);

	        menu.close();
	    }
	}



