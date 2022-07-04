import java.util.Scanner;
public class Exerc5{
	public static void main(String args[]){
		float altura, peso, imc;
		String nome1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o nome do usuario? ");
		nome1 = sc.next();
		System.out.println("qual o peso do usuario? ");
		peso = sc.nextFloat();
		System.out.println("Qual a altura do usuario? ");
		altura = sc.nextFloat();
		imc = peso/(altura*altura);
		System.out.println("nome do usuario: " + nome1);
		System.out.println("O IMC do usuario e: " + imc);
		
	}
}
	