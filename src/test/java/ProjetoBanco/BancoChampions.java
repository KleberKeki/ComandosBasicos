package ProjetoBanco;

public class BancoChampions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Banco Champions -  serviços 
		
		
		int Saldo = 1000;
		int Boleto = 1250;
		int ChequeEspecial = 500;
		
		System.out.println ("Bem vindo ao Banco Champions");
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
