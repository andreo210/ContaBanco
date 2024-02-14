import java.math.BigDecimal;
import java.util.Scanner;

public class ContasTerminal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da conta !!");
		int numero = entrada.nextInt();
		
		System.out.println("Por favor, digite o número da agencia!!\n");
		String agencia = entrada.next();
		
		System.out.println("Por favor, digite seu nome!!\n");
		String nomeCliente = entrada.next();
		
		System.out.println("Por favor, digite seu saldo!!\\n");
		BigDecimal saldo = entrada.nextBigDecimal();
		
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque\"");
		
	}
}
