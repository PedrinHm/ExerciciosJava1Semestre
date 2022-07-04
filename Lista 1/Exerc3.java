import java.util.Scanner;
public class Exerc3 {
	public static void main(String args[]){
		float deposito, tjuros, vtotal, rendimento;
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Qual o valor do deposito? ");
		deposito = sc.nextFloat();
		System.out.println("Qual a taxa de juros? ");
		tjuros =  sc.nextFloat();
		rendimento = deposito*(tjuros/100);
		vtotal = deposito + rendimento;
		System.out.println("O rendimento foi: " + rendimento);
		System.out.println("O valor total ficou em: " + vtotal);
		
		
	}
}