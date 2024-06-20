package ProjetoBanco;

import java.util.Scanner;

public class BancoChampions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Banco Champions -  serviços 
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("Bem vindo ao Banco Champions");
		
				
		int Saldo = 1000;
		System.out.println("Seu saldo é "+ Saldo);
		System.out.println("digite o valor do seu boleto para pagamento:");
		int Boleto = scanner.nextInt();
		int ChequeEspecial = 500;
		
		
		int SaldoBoleto = Saldo-Boleto;
		if (Boleto<=Saldo) {
			System.out.println("Pagamento efetuado,seu saldo atual é de R$"+SaldoBoleto);
		} else {
			
			int SaldoEspecial = Boleto-Saldo;
			if (SaldoEspecial<= ChequeEspecial)	{
				System.out.println("Pagamento efetuado,seu saldo atual é de R$-"+SaldoEspecial);
				} else {
					System.out.println("Saldo Insuficiente, Pagamento não efetuado seu saldo é de R$"+ Saldo+
							" e seu cheque especial é de R$" + ChequeEspecial);
					
			}
			
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
