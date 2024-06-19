package IF;

public class AprendendoIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// < menor que 
		// > maior que
		// == igual
		// || ou 
		// >= maior ou igual
		// <= menor ou igual
		// != diferente 
		// & E
		// IF em cadeado multiplas validaçoes
		 
		int idademaxima = 48;
		int idademinima =16;
		int responsavel = 18;
		String passagem= "Bem vindo Joao, voce pode comprar sua passagem";
		if (idademinima>= 16 & responsavel >=18 &  idademaxima>=48)  {
			System.out.println ("condiçao verdadeira");
			System.out.println(passagem);
		} else {
			System.out.println("condição falsa;");
			System.out.println ("voce nao esta apto para adquirir a passagem");
			
			
			
		}
		
		
	}

}
