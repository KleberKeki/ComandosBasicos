package SwitCase;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Scanner scanner = new Scanner(System.in);
	   System.out.println ("digite seu time");
		String time = scanner.next();
		
		switch (time) {
		case "Bragantino":
			System.out.println ("Time da Primeira divisão de São Paulo");
			
			break;
		case "Palmeiras":
			System.out.println("Time Campeão Paulista");
				
			break;
		default:
			System.out.println("Todas as opçoes sao invalidas");
			break;
		
		
		
		
		
		
		
		
		
		}
		
		
	}

}
