import java.util.Scanner;
public class Exerc1{
	public static void main(String args[]){
		int areat, base, altura;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a altura do triangulo?");
		altura = sc.nextInt();
		System.out.println("Qual a medida da base do triangulo?");
		base = sc.nextInt();
		areat = base*altura/2;
		System.out.println("A area do triangulo e " + areat);
	}
}
