package CompahiaAerea;

import java.util.Scanner;

public class FlashTurismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
        
            System.out.println("Bem vindo a Compahia Aere Flash Turismo \n Aqui seu sonho vira Realidade");
            System.out.println("Qual a data que deseja Viajar:");
            
            String data = scanner.next();
            System.out.println (data +" otima sugestao de data");
            System.out.println("atendemos os seguintes destinos: ");
            System.out.println("|-----------|");
            System.out.println("|  Londres  |");
            System.out.println("|  Munique  |");
            System.out.println("|  LasVegas |");
            System.out.println("|  NewYork  |");
            System.out.println("|  Toronto  |");
            System.out.println("|  Manaus   |");
            System.out.println("|-----------|");
            System.out.println("Digite seu Destino ");
            
            String destino = scanner.next();
            System.out.println("Otima escolha "+ destino +" é um lugar lindo");
          
            
            int valorNacional = 1500;
            int valorInternacional = 4000;                              
                          
                        
            switch (destino) {
            case "Londres":
                	
                    System.out.println("Voce escolheu um otimo destino os inglesss sao boas pessoas.");
                    System.out.println("o valopr da sua passagem é 4.000 Reais.");
                    System.out.println("aceitamos pagamento somente no cartão de credito, a vista ou parcelado em ate 10x sem juros.");
                    System.out.println("Como deseja pagar avista ou parcelado?");
                    
                    String formaPagamento = scanner.next();
                   
                   
                    
                    switch (formaPagamento) {
                    case "avista":
                    
                  
                    	System.out.println("voce selecionou a opçao " + formaPagamento); 
                    	System.out.println("");
                    	System.out.println("O valor da passagem é 4.000 Reais.");
                    	System.out.println("recebemos o pagamento " + formaPagamento + " Parabens");
                    	System.out.println("Espero que Proveite seu destino \nObrigado por voar com a Flash");                                   
                    	System.out.println("Todos nossos voos sem do aeroporto do Galeão no Rio de Janeiro");
                    	break; 
                    	 
                    	
                    case "parcelado":                           
                    
                    	System.out.println("voce selecionou a opçao " + formaPagamento);
                    	System.out.println("");
                    	System.out.println("O valor da passagem é 4.000 Reais.");
                    	System.out.println("Realizamos o parcelamento em ate 10x sem juros");
                    	System.out.println("Digite o numero de parcelas");
                    	int numeroparcela =scanner.nextInt();
                    	int valordaparcela = valorInternacional/numeroparcela;
                    	System.out.println("O valor da sua parcela fica em " + valordaparcela+ "Reais");
                    	System.out.println("Espero que Proveite seu destino \nObrigado por voar com a Flash");                                   
                    	System.out.println("Todos nossos voos saem do aeroporto do Galeão no Rio de Janeiro");
                    	break; 
                    	 
                    default:
                        System.out.println("\nOpção Inválida!");
                        break;
                    }
           
                    break;
                                 
              case "Munique":
                	
                    System.out.println("Voce escolheu um otimo destino!.");
                    System.out.println("o valor da sua passagem é 4.000 Reais.");
                    System.out.println("aceitamos pagamento somente no cartão de credito, a vista ou parcelado em ate 10x sem juros.");
                    System.out.println("Como deseja pagar avista ou parcelado?");
                    
                    String formaPagamento1 =  scanner.next();
                                     
                    
                    switch (formaPagamento1) {
                    case "avista":
                    
                  
                    	System.out.println("voce selecionou a opçao " + formaPagamento1); 
                    	System.out.println("");
                    	System.out.println("O valor da passagem é 4.000 Reais.");
                    	System.out.println("recebemos o pagamento " + formaPagamento1 + " Parabens");
                    	System.out.println(" Espero que Proveite seu destino \nObrigado por voar com a Flash");                                   
                    	System.out.println("Todos nossos voos saem do aeroporto do Galeão no Rio de Janeiro");
                    	break; 
                    	 
                    	
                    case "parcelado":                           
                    
                    	System.out.println("voce selecionou a opçao " + formaPagamento1);
                    	System.out.println("");
                    	System.out.println("O valor da passagem é 4.000 Reais.");
                    	System.out.println("Realizamos o parcelamento em ate 10x sem juros");
                    	System.out.println("Digite o numero de parcelas");
                    	int numeroparcela =scanner.nextInt();
                    	int valordaparcela = valorInternacional/numeroparcela;
                    	System.out.println("O valor da sua parcela fica em " + valordaparcela+ "Reais");
                    	System.out.println("Espero que Proveite seu destino \nObrigado por voar com a Flash");                                   
                    	System.out.println("Todos nossos voos saem do aeroporto do Galeão no Rio de Janeiro");
                    	break; 
                    	 
                    default:
                        System.out.println("\nOpção Inválida!");
                        break;
                    }
           
              case "LasVegas":
              	
                  System.out.println("Voce escolheu um otimo destino!.");
                  System.out.println("o valopr da sua passagem é 4.000 Reais.");
                  System.out.println("aceitamos pagamento somente no cartão de credito, a vista ou parcelado em ate 10x sem juros.");
                  System.out.println("Como deseja pagar avista ou parcelado?");
                  
                  String formaPagamento2 =  scanner.next();
                 
                 
                  
                  switch (formaPagamento2) {
                  case "avista":
                  
                
                  	System.out.println("voce selecionou a opçao " + formaPagamento2); 
                  	System.out.println("");
                  	System.out.println("O valor da passagem é 4.000 Reais.");
                  	System.out.println("recebemos o pagamento " + formaPagamento2 + " Parabens");
                  	System.out.println("Espero que Proveite seu destino \nObrigado por voar com a Flash");                                   
                  	System.out.println("Todos nossos voos saem do aeroporto do Galeão no Rio de Janeiro");
                  	break; 
                  	 
                  	
                  case "parcelado":                           
                  
                  	System.out.println("voce selecionou a opçao " + formaPagamento2);
                  	System.out.println("");
                  	System.out.println("O valor da passagem é 4.000 Reais.");
                  	System.out.println("Realizamos o parcelamento em ate 10x sem juros");
                  	System.out.println("Digite o numero de parcelas");
                  	int numeroparcela =scanner.nextInt();
                  	int valordaparcela = valorInternacional/numeroparcela;
                  	System.out.println("O valor da sua parcela fica em " + valordaparcela+ "Reais");
                  	System.out.println("Espero que Proveite seu destino \nObrigado por voar com a Flash");                                   
                  	System.out.println("Todos nossos voos saem do aeroporto do Galeão no Rio de Janeiro");
                  	break; 
                  	 
                  default:
                      System.out.println("\nOpção Inválida!");
                      break;
                  }
                  
              case "NewYork":
              	
                  System.out.println("Voce escolheu um otimo destino!.");
                  System.out.println("o valopr da sua passagem é 4.000 Reais.");
                  System.out.println("aceitamos pagamento somente no cartão de credito, a vista ou parcelado em ate 10x sem juros.");
                  System.out.println("Como deseja pagar avista ou parcelado?");
                  
                  String formaPagamento3 =  scanner.next();
                  
                 
                  
                  switch (formaPagamento3) {
                  case "avista":
                  
                
                  	System.out.println("voce selecionou a opçao " + formaPagamento3); 
                  	System.out.println("");
                  	System.out.println("O valor da passagem é 4.000 Reais.");
                  	System.out.println("recebemos o pagamento " + formaPagamento3 + " Parabens");
                  	System.out.println(" Espero que Proveite seu destino \nObrigado por voar com a Flash");                                   
                  	System.out.println("Todos nossos voos saem do aeroporto do Galeão no Rio de Janeiro");
                  	break; 
                  	 
                  	
                  case "parcelado":                           
                  
                  	System.out.println("voce selecionou a opçao" + formaPagamento3);
                  	System.out.println("");
                  	System.out.println("O valor da passagem é 4.000 Reais.");
                  	System.out.println("Realizamos o parcelamento em ate 10x sem juros");
                  	System.out.println("Digite o numero de parcelas");
                  	int numeroparcela =scanner.nextInt();
                  	int valordaparcela = valorInternacional/numeroparcela;
                  	System.out.println("O valor da sua parcela fica em " + valordaparcela+ "Reais");
                  	System.out.println("Espero que Proveite seu destino \n  por voar com a Flash");                                   
                  	System.out.println("Todos nossos voos saem do aeroporto do Galeão no Rio de Janeiro");
                  	break; 
                  	 
                  default:
                      System.out.println("\nOpção Inválida!");
                      break;
                  }
              case "Toronto":
              	
                  System.out.println("Voce escolheu um otimo destino!.");
                  System.out.println("o valopr da sua passagem é 4.000 Reais.");
                  System.out.println("aceitamos pagamento somente no cartão de credito, a vista ou parcelado em ate 10x sem juros.");
                  System.out.println("Como deseja pagar avista ou parcelado?");
                  
                  String formaPagamento4 =  scanner.next();
                 
                  
                  switch (formaPagamento4) {
                  case "avista":
                  
                
                  	System.out.println("voce selecionou a opçao " + formaPagamento4); 
                  	System.out.println("");
                  	System.out.println("O valor da passagem é 4.000 Reais.");
                  	System.out.println("recebemos o pagamento " + formaPagamento4 + " Parabens");
                  	System.out.println("Espero que Proveite seu destino \nObrigado por voar com a Flash");                                   
                  	System.out.println("Todos nossos voos saem do aeroporto do Galeão no Rio de Janeiro");
                  	break; 
                  	 
                  	
                  case "parcelado":                           
                  
                  	System.out.println("voce selecionou a opçao " + formaPagamento4);
                  	System.out.println("");
                  	System.out.println("O valor da passagem é 4.000 Reais.");
                  	System.out.println("Realizamos o parcelamento em ate 10x sem juros");
                  	System.out.println("Digite o numero de parcelas");
                  	int numeroparcela =scanner.nextInt();
                  	int valordaparcela = valorInternacional/numeroparcela;
                  	System.out.println("O valor da sua parcela fica em " + valordaparcela+ "Reais");
                  	System.out.println("Espero que Proveite seu destino \nObrigado por voar com a Flash");                                   
                  	System.out.println("Todos nossos voos saem do aeroporto do Galeão no Rio de Janeiro");
                  	break; 
                  	 
                  default:
                      System.out.println("\nOpção Inválida!");
                     
                  }
                  
              case "Manaus":
              	
                  System.out.println("Voce escolheu um otimo destino!.");
                  System.out.println("o valopr da sua passagem é 1.500 Reais.");
                  System.out.println("aceitamos pagamento somente no cartão de credito, a vista ou parcelado em ate 10x sem juros.");
                  System.out.println("Como deseja pagar avista ou parcelado?");
                  
                  String formaPagamento5 =  scanner.next();
                  
                 
                  
                  switch (formaPagamento5) {
                  case "avista":
                  
                
                  	System.out.println("voce selecionou a opçao " + formaPagamento5); 
                  	System.out.println("");
                  	System.out.println("O valor da passagem é 1.500 Reais.");
                  	System.out.println("recebemos o pagamento " + formaPagamento5 + " ");
                  	System.out.println("Espero que Proveite seu destino \nObrigado por voar com a Flash");                                   
                  	System.out.println("Todos nossos voos saem do aeroporto do Galeão no Rio de Janeiro");
                  	break; 
                  	 
                  	
                  case "parcelado":                           
                  
                  	System.out.println("voce selecionou a opçao " + formaPagamento5);
                  	System.out.println("");
                  	System.out.println("O valor da passagem é 1.500 Reais.");
                  	System.out.println("Realizamos o parcelamento em ate 10x sem juros");
                  	System.out.println("Digite o numero de parcelas");
                  	int numeroparcela =scanner.nextInt();
                  	int valordaparcela = valorNacional/numeroparcela;
                  	System.out.println("O valor da sua parcela fica em " + valordaparcela+ "Reais");
                  	System.out.println("Espero que Proveite seu destino \nObrigado por voar com a Flash");                                   
                  	System.out.println("Todos nossos voos saem do aeroporto do Galeão no Rio de Janeiro");
                  	break; 
                  	 
                  default:
                      System.out.println("\nOpção Inválida!");
                      break;
                  }
            }
	}
}

	                   
                                       
    
	



