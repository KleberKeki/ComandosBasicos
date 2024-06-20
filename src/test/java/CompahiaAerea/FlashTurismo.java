package CompahiaAerea;

import java.util.Scanner;

public class FlashTurismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner menu = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha Seu Destino\n");
            System.out.println("|-----------------------------|");
            System.out.println("| Destino 1 - Londres  - UK   |");
            System.out.println("| Destino 2 - Munique  - GER  |");
            System.out.println("| Destino 3 - Las Vegas- USA  |");
            System.out.println("| Destino 4 - New York - USA  |");
            System.out.println("| Destino 5 - Toronto  - CAN  |");
            System.out.println("| Destino 6 - Manaus   - BR   |");
            System.out.println("|-----------------------------|");

            System.out.print("Digite o numero da opção escolhida: ");
            opcao = menu.nextInt();

            switch (opcao) {
                case 1:
                	int Londres;
                    System.out.println("\nLondres  - UK  Selecionado");
                    System.out.println("Escolha a data da viagem\n");
                    System.out.println("|--------------------|");
                    System.out.println("| Data 1 - 20/07/24  |");
                    System.out.println("| Data 2 - 15/08/24  |");                                   
                    System.out.println("| Data 3 - 23/10/24  |");
                    System.out.println("|-----------|");

                    System.out.print("Digite o numero da data escolhida: ");
                    
                    opcao = menu.nextInt();                 
                                               
                    
                    int pagamento;
                    System.out.println("\nQual o meio de pagamento");                  
                    System.out.println("|--------------------|");
                    System.out.println("| Debito             |");
                    System.out.println("| Credito a vista    |");                                   
                    System.out.println("| Credito Parcelado  |");
                    System.out.println("|--------------------|");

                    System.out.print("Digite o meio de pagamento: ");
                    
                    opcao = menu.nextInt();                 
                                               
                    
                    
                    
                    
                    
                    
                    
                                 
                                        break;
                case 2:
                    System.out.println("\nOpção Clientes Selecionado");
                    break;
                case 3:
                    System.out.println("\nOpção Produtos Selecionado");
                    break;
                case 4:
                    System.out.println("\nOpção Produtos Selecionado");
                    break;
                case 5:
                    System.out.println("\nOpção Produtos Selecionado");
                    break;
                case 6:
                    System.out.println("\nOpção Produtos Selecionado");
                    break;                                 
                           
                case 7:
                    System.out.println("\nAté logo!");
                    break;
                default:
                    System.out.println("\nOpção Inválida!");
            }
        } while (opcao != 7);

        menu.close();
    }
}



